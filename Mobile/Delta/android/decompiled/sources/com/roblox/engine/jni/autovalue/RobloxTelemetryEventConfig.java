package com.roblox.engine.jni.autovalue;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RobloxTelemetryEventConfig {
    public static final String EPHEMERAL_COUNTER_BACKEND = "EphemeralCounter";
    public static final String EVENT_INGEST_BACKEND = "EventIngest";
    public static final String POINTS_BACKEND = "Points";

    public static abstract class Builder {
        public abstract RobloxTelemetryEventConfig autoBuild();

        public final RobloxTelemetryEventConfig build() {
            return autoBuild();
        }

        public abstract Builder setBackEnds(List<String> list);

        public abstract Builder setEventName(String str);

        public abstract Builder setThrottlingHundredthPercentage(int i10);
    }

    public static Builder builder() {
        return new AutoValue_RobloxTelemetryEventConfig.Builder().setThrottlingHundredthPercentage(0).setBackEnds(new ArrayList());
    }

    public abstract List<String> backEnds();

    public abstract String eventName();

    public abstract int throttlingHundredthPercentage();
}
