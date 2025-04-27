package com.example.eventsapp.data

import com.example.eventsapp.model.Event

interface EventsApi {
    suspend fun getEvents(): List<Event>
}