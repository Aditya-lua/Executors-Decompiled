package com.roblox.engine.jni.autovalue;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RobloxTelemetryEventData {
    public static final String STANDARDIZED_FIELD_KEY_ADD_OS_INFO = "addOSInfo";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLACE_ID = "addPlaceId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLACE_INSTANCE_ID = "addPlaceInstanceId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLACE_SESSION_ID = "addSessionId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLAY_SESSION_ID = "addPlaySessionId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_universe_ID = "addUniverseId";

    public static abstract class Builder {
        public abstract RobloxTelemetryEventData autoBuild();

        public final RobloxTelemetryEventData build() {
            return autoBuild();
        }

        public abstract Builder setCustomStringFields(List<Pair<String, String>> list);

        public abstract Builder setEventContext(String str);

        public abstract Builder setStandardizedFields(List<String> list);
    }

    public static Builder builder() {
        return new AutoValue_RobloxTelemetryEventData.Builder().setEventContext("").setCustomStringFields(new ArrayList()).setStandardizedFields(new ArrayList());
    }

    public abstract List<Pair<String, String>> customStringFields();

    public abstract String eventContext();

    public abstract List<String> standardizedFields();
}
