package com.example.eventsapp.data

import com.example.eventsapp.model.Event
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventsRepository @Inject constructor(private val api: EventsApi) {
    suspend fun fetchEvents(): List<Event> = api.getEvents()
}