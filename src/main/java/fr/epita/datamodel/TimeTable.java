package fr.epita.datamodel;

import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.*;

public class TimeTable {
    private List<Timeslot> timeslotList;


    private List<Room> roomList;

    private List<Lesson> lessonList;


    private HardSoftScore score;

    public TimeTable() {
    }

    public TimeTable(List<Timeslot> timeslotList, List<Room> roomList, List<Lesson> lessonList) {
        this.timeslotList = timeslotList;
        this.roomList = roomList;
        this.lessonList = lessonList;
    }

    public List<Timeslot> getTimeslotList() {
        return timeslotList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public HardSoftScore getScore() {
        return score;
    }
}
