package com.donghun.service;

import com.donghun.domain.ToDoList;
import com.donghun.repository.ToDoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {

    private final ToDoListRepository toDoListRepository;

    public ToDoListService(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    public List<ToDoList> findToDoList(){
        return toDoListRepository.findAll();
    }
}