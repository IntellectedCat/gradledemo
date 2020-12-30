package top.study.gradledemo;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {
    Map<String, TodoItem> map = new HashMap<>();

    public void set(String key, TodoItem value) {
        map.put(key, value);
    }

    public TodoItem get(String key) {
        return map.get(key);
    }
}
