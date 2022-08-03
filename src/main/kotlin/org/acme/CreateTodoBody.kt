package org.acme

import java.time.LocalDateTime

data class CreateTodoBody(val title: String, val period: LocalDateTime?)
