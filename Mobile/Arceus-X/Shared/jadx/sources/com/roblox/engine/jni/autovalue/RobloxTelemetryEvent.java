package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RobloxTelemetryEvent {
    public static final String EPHEMERAL_COUNTER_EVENT_TYPE = "EphemeralCounter";
    public static final String EPHEMERAL_STAT_EVENT_TYPE = "EphemeralStat";
    public static final String ROBLOX_TELEMETRY_EVENT_TYPE = "RobloxTelemetry";

    public static abstract class Builder {
        public abstract RobloxTelemetryEvent autoBuild();

        public final RobloxTelemetryEvent build() {
            return autoBuild();
        }

        public abstract Builder setConfig(RobloxTelemetryEventConfig robloxTelemetryEventConfig);

        public abstract Builder setData(RobloxTelemetryEventData robloxTelemetryEventData);

        public abstract Builder setEventType(String str);
    }

    public static Builder builder() {
        return new AutoValue_RobloxTelemetryEvent.Builder();
    }

    public abstract RobloxTelemetryEventConfig config();

    public abstract RobloxTelemetryEventData data();

    public abstract String eventType();
}
