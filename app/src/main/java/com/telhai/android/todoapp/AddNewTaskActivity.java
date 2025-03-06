package com.telhai.android.todoapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddNewTaskActivity extends AppCompatActivity {

    // Declare UI elements
    private Button cancelButton, doneButton;
    private EditText dueDateInput, descriptionInput;
    private Spinner urgencySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_task);

        // Set up window insets (for edge-to-edge support)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize UI elements
        cancelButton = findViewById(R.id.cancelButton);
        doneButton = findViewById(R.id.doneButton);
        dueDateInput = findViewById(R.id.dueDateInput);
        descriptionInput = findViewById(R.id.descriptionInput);
        urgencySpinner = findViewById(R.id.urgencySpinner);

        // Populate Urgency Dropdown
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.urgency_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        urgencySpinner.setAdapter(adapter);

        // Set up Cancel Button click listener
        cancelButton.setOnClickListener(v -> {
            // Go back to previous screen (finish activity)
            finish();
        });

        // Set up Done Button click listener
        doneButton.setOnClickListener(v -> {
            // Handle task creation logic here
            // Capture the user inputs
            String dueDate = dueDateInput.getText().toString();
            String description = descriptionInput.getText().toString();
            String urgency = urgencySpinner.getSelectedItem().toString();  // Get selected urgency

            // Log or use the data (you can save it to a database here)
            // Example: Log.d("Task Data", "Due Date: " + dueDate + ", Description: " + description + ", Urgency: " + urgency);

            // Once done, finish the activity and return to the previous screen
            finish();
        });
    }
}
