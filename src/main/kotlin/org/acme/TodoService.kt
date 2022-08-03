package org.acme

import java.time.LocalDateTime
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TodoService {

    val todos: MutableList<Todo> = mutableListOf<Todo>(Todo(id= 1, title ="やること１"), Todo(2,"やること2"), Todo(3,"やること3", LocalDateTime.now().plusDays(3)))

    fun allTodos() = todos

    fun todo(id: Int): Todo = todos.find { todo -> todo.id == id}!! // !!でnulアサーションできるんだ

    fun create(title: String, period: LocalDateTime? = null): Todo {
        val newTodo = Todo(todos.last().id + 1, title, period)
        todos.add(newTodo)
        return newTodo
    }
}