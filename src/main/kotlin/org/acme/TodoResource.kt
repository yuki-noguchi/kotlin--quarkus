package org.acme

import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/todos")
class TodoResource(private  val  todoService: TodoService) {

    @GET
    fun list(): List<Todo> {
       return todoService.allTodos()
    }

    @GET
    @Path("/{id}")
    fun index(@PathParam("id") id: Int): Todo {
        return todoService.todo(id)
    }

    @POST
    fun create(body: CreateTodoBody): Todo {
        return todoService.create(body.title, body.period)
    }
}
