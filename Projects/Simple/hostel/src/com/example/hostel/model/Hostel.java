package com.example.hostel.model;

public class Hostel {

    private Student[] rooms = new Student[10];

    public void RentRoom(Student student, int room) {
        if (rooms[room] == null) {
            rooms[room] = student;
        }

        else {
            System.out.println("Room already occupied.");
        }
    }

    public void HostelReport() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
    }
}