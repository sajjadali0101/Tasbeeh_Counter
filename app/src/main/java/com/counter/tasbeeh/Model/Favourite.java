package com.counter.tasbeeh.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Favourite {

    @PrimaryKey(autoGenerate = true)
    public int pid;

    @ColumnInfo(name = "pname")
    public String pname;

    public Favourite(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    }
