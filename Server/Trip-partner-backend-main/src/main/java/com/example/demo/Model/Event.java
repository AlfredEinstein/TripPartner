package com.example.demo.Model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Event {
	@Id
	@GeneratedValue
    private Integer eventId;
    private String eventName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id",referencedColumnName = "addressId")
    private EventAddress location;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private EventStatus eventStatus=EventStatus.Active;
    private Integer peopleCount=0;
    private String eventPicture;
    private String eventFeedback;

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getEventPicture() {
        return eventPicture;
    }

    public void setEventPicture(String eventPicture) {
        this.eventPicture = eventPicture;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void increasePeopleCount(Integer peopleCount) {
        this.peopleCount += peopleCount;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", location='" + location + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", eventStatus=" + eventStatus +
                ", peopleCount=" + peopleCount +
                ", eventPicture='" + eventPicture + '\'' +
                ", eventFeedback='" + eventFeedback + '\'' +
                '}';
    }

    public String getEventFeedback() {
        return eventFeedback;
    }

    public void setEventFeedback(String eventFeedback) {
        this.eventFeedback = eventFeedback;
    }

    public Event(Integer eventId, String eventName, EventAddress location, LocalDate startDate, LocalDate endDate, String description, EventStatus eventStatus, Integer peopleCount, String eventPicture, String eventFeedback) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.eventStatus = eventStatus;
        this.peopleCount = peopleCount;
        this.eventPicture = eventPicture;
        this.eventFeedback = eventFeedback;
    }

    public void decreasePeopleCount(Integer peopleCount) {
        this.peopleCount -= peopleCount;
    }

    public EventStatus getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Event() {
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventAddress getLocation() {
        return location;
    }

    public void setLocation(EventAddress location) {
        this.location = location;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
