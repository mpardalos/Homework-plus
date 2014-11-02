package mpardalos.org.homeworkmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.util.Log;


import java.util.ArrayList;


public class TaskList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        ArrayList<String[]> listOfTasks = new ArrayList<String[]>();
        String[] task1 = new String[]{"Task 1", "This is first task"};
        String[] task2 = new String[]{"Task 2", "This is the second task\n and it works!"};
        String[] task3 = new String[]{"Task 3", "This is the third task \n this one as well!!! "};
        String[] task4 = new String[]{"Task 4", "This is the fourth task"};
        String[] task5 = new String[]{"Task 5", "This is the fifth task\n this is getting boring."};
        String[] task6 = new String[]{"Task 6", "This is the sixth task"};
        String[] task7 = new String[]{"Task 7", "This is the seventh task"};
        String[] task8 = new String[]{"Task 8", "This is the eighth task"};
        String[] task9 = new String[]{"Task 9", "This is the ninth task"};
        String[] task10 = new String[]{"Task 10", "This is the tenth task"};
        String[] task11 = new String[]{"Task 11", "This is the eleventh task\n FINALLY!!"};

        listOfTasks.add(task1);
        listOfTasks.add(task2);
        listOfTasks.add(task3);
        listOfTasks.add(task4);
        listOfTasks.add(task5);
        listOfTasks.add(task6);
        listOfTasks.add(task7);
        listOfTasks.add(task8);
        listOfTasks.add(task9);
        listOfTasks.add(task10);
        listOfTasks.add(task11);

        TaskAdapter tasks = new TaskAdapter(this);
        tasks.UpdateTasks(listOfTasks);
        ListView task_view = (ListView) findViewById(R.id.task_list_view);
        task_view.setAdapter(tasks);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_task_list_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.add_task_button:
                addTask();
        }

        return super.onOptionsItemSelected(item);
    }

    private void addTask() {
        Intent openTaskAdd = new Intent(this, TaskAdd.class);
        startActivity(openTaskAdd);
    }
}
