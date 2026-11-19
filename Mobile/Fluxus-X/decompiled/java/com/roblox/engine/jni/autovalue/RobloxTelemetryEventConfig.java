package com.roblox.engine.jni.autovalue;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RobloxTelemetryEventConfig {
    public static final String EPHEMERAL_COUNTER_BACKEND = "EphemeralCounter";
    public static final String EVENT_INGEST_BACKEND = "EventIngest";
    public static final String POINTS_BACKEND = "Points";

    public static abstract class a {
        public abstract RobloxTelemetryEventConfig a();

        public final RobloxTelemetryEventConfig b() {
            return a();
        }

        public abstract a c(List<String> list);

        public abstract a d(String str);

        public abstract a e(int i10);
    }

    public static a builder() {
        return new AutoValue_RobloxTelemetryEventConfig.a().e(0).c(new ArrayList());
    }

    public abstract List<String> backEnds();

    public abstract String eventName();

    public abstract int throttlingHundredthPercentage();
}
