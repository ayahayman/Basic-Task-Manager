package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val task1:Task = Task("Study", true)
    val task2:Task = Task("Exercise", true)
    val task3:Task = Task("Clean the house", false)
    val taskList = mutableListOf<Task>(task1, task2, task3)

    for (task in taskList){
        if (task.isDone == true){
            println("✅ ${task.title}")
        }
        else
        {
            println("❌ ${task.title}")
        }
    }
    val filteredList:List<Task> = taskList.filter { !it.isDone }
    println("To do: ")
    for (task in filteredList){
        print("- ${task.title}")
    }
}

data class Task(val title:String, val isDone: Boolean) {
}