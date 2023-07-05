package com.jagrosh.discordipc.entities;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Represents the buttons a rich presence can have
 */
public class PresenceButtons {

    private Button button1;
    private Button button2;

    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    public JSONArray getPayloadData() {
        JSONArray toDump = new JSONArray();
        if (button1 != null) {
            toDump.put(button1.getPayloadData());
        }
        if (button2 != null) {
            toDump.put(button2.getPayloadData());
        }
        return toDump;
    }

    class Button {
        private String label;
        private String url;
        public Button(String label, String url) {
            this.label = label;
            this.url = url;
        }

        public JSONObject getPayloadData() {
            JSONObject toReturn = new JSONObject();
            toReturn.put("label", label);
            toReturn.put("url", url);

            return toReturn;
        }
    }
}
