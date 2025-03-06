package com.telhai.android.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {

    private Button logoutButton, addButton, filterButton;
    private Spinner sortBySpinner;
    private RecyclerView taskRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Connect UI Elements
        logoutButton = findViewById(R.id.logoutButton);
        addButton = findViewById(R.id.addButton);
        filterButton = findViewById(R.id.filterButton);
        sortBySpinner = findViewById(R.id.sortBySpinner);
        taskRecyclerView = findViewById(R.id.taskRecyclerView);

        // Populate Sort By Dropdown
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.sort_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sortBySpinner.setAdapter(adapter);

        // Set up RecyclerView (empty for now)
        taskRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Navigate to Login when logout is clicked
        logoutButton.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            finish();
        });

        // Placeholder for Add Task Button
        addButton.setOnClickListener(v -> {
            // TODO: Navigate to Add Task Activity
        });

        // Placeholder for Filter Button
        filterButton.setOnClickListener(v -> {
            // TODO: Show Filter Options
        });
    }
}