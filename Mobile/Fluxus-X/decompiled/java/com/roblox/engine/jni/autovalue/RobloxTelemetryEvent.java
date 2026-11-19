package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RobloxTelemetryEvent {
    public static final String EPHEMERAL_COUNTER_EVENT_TYPE = "EphemeralCounter";
    public static final String EPHEMERAL_STAT_EVENT_TYPE = "EphemeralStat";
    public static final String ROBLOX_TELEMETRY_EVENT_TYPE = "RobloxTelemetry";

    public static abstract class a {
        public abstract RobloxTelemetryEvent a();

        public final RobloxTelemetryEvent b() {
            return a();
        }

        public abstract a c(RobloxTelemetryEventConfig robloxTelemetryEventConfig);

        public abstract a d(RobloxTelemetryEventData robloxTelemetryEventData);

        public abstract a e(String str);
    }

    public static a builder() {
        return new AutoValue_RobloxTelemetryEvent.a();
    }

    public abstract RobloxTelemetryEventConfig config();

    public abstract RobloxTelemetryEventData data();

    public abstract String eventType();
}
