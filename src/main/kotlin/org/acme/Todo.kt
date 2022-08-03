package org.acme

import java.time.LocalDateTime

data class Todo(val id: Int, val title: String, val period: LocalDateTime? = null)
