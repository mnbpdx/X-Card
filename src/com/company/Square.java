package com.company;

class Square {
    public enum Color {
        BLUE, RED
    }

    private boolean checked;
    private String comment;
    private Color color;

    Square() {
        checked = false;
        //Should I initialize other values to null here? Null vs empty string?
    }

    void setChecked(boolean checked) {
        this.checked = checked;
    }

    void setColor(Color color) {
        this.color = color;
    }

    void setComment(String comment) {
        this.comment = comment;
    }

    boolean isChecked() {
        return checked;
    }

    String getComment() {
        return comment;
    }

    Color getColor() {
        return color;
    }
}