package org.eightfoldpath.tourguide;

public class ListItem {

    private int imageId;
    private String title;

        public ListItem(int imageId, String title) {
            this.imageId = imageId;
            this.title = title;
        }

        public int getImageResourceId() { return imageId; }

        public String getTitle() { return title; }
}
