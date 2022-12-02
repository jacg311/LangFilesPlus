package io.github.jacg311.langfilesplus;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonFlattener {
    public static void flattenObject(JsonObject rootObject, JsonElement curElement, String keyPart) {
        if (curElement.isJsonObject()) {
            for (var entry : curElement.getAsJsonObject().entrySet()) {
                String key;
                if (keyPart.length() == 0) key = entry.getKey();
                else key = keyPart + "." + entry.getKey();
                flattenObject(rootObject, entry.getValue(), key);
            }
        }
        else {
            rootObject.add(keyPart, curElement);
        }
    }
}
