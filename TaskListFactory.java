package ua.edu.sumdu.j2se.obolonska.tasks;

public class TaskListFactory {
    public static AbstractTaskList createTaskList(ListTypes.types type) {
        switch (type) {
            case ARRAY: return new ArrayTaskList();
            case LINKED: return new LinkedTaskList();
            default: throw new IllegalArgumentException(type + " is wrong!!!");
        }
    }
}
