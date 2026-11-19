package com.roblox.engine.jni.autovalue;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RobloxTelemetryEventConfig extends RobloxTelemetryEventConfig {
    private final List<String> backEnds;
    private final String eventName;
    private final int throttlingHundredthPercentage;

    public static final class a extends RobloxTelemetryEventConfig.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9588a;
        public List<String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f9590d;

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.a
        public RobloxTelemetryEventConfig a() {
            String str;
            List<String> list;
            if (this.f9590d == 1 && (str = this.f9588a) != null && (list = this.b) != null) {
                return new AutoValue_RobloxTelemetryEventConfig(str, list, this.f9589c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9588a == null) {
                sb2.append(" eventName");
            }
            if (this.b == null) {
                sb2.append(" backEnds");
            }
            if ((1 & this.f9590d) == 0) {
                sb2.append(" throttlingHundredthPercentage");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.a
        public RobloxTelemetryEventConfig.a c(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null backEnds");
            }
            this.b = list;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.a
        public RobloxTelemetryEventConfig.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null eventName");
            }
            this.f9588a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.a
        public RobloxTelemetryEventConfig.a e(int i10) {
            this.f9589c = i10;
            this.f9590d = (byte) (this.f9590d | 1);
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig
    public List<String> backEnds() {
        return this.backEnds;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RobloxTelemetryEventConfig) {
            RobloxTelemetryEventConfig robloxTelemetryEventConfig = (RobloxTelemetryEventConfig) obj;
            if (this.eventName.equals(robloxTelemetryEventConfig.eventName()) && this.backEnds.equals(robloxTelemetryEventConfig.backEnds()) && this.throttlingHundredthPercentage == robloxTelemetryEventConfig.throttlingHundredthPercentage()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig
    public String eventName() {
        return this.eventName;
    }

    public int hashCode() {
        return ((((this.eventName.hashCode() ^ 1000003) * 1000003) ^ this.backEnds.hashCode()) * 1000003) ^ this.throttlingHundredthPercentage;
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig
    public int throttlingHundredthPercentage() {
        return this.throttlingHundredthPercentage;
    }

    public String toString() {
        return "RobloxTelemetryEventConfig{eventName=" + this.eventName + ", backEnds=" + this.backEnds + ", throttlingHundredthPercentage=" + this.throttlingHundredthPercentage + "}";
    }

    private AutoValue_RobloxTelemetryEventConfig(String str, List<String> list, int i10) {
        this.eventName = str;
        this.backEnds = list;
        this.throttlingHundredthPercentage = i10;
    }
}
