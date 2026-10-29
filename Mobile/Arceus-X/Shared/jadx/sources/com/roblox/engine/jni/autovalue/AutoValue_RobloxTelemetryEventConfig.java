package com.roblox.engine.jni.autovalue;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RobloxTelemetryEventConfig extends RobloxTelemetryEventConfig {
    private final List<String> backEnds;
    private final String eventName;
    private final int throttlingHundredthPercentage;

    public static final class Builder extends RobloxTelemetryEventConfig.Builder {
        private List<String> backEnds;
        private String eventName;
        private byte set$0;
        private int throttlingHundredthPercentage;

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.Builder
        public RobloxTelemetryEventConfig autoBuild() {
            String str;
            List<String> list;
            if (this.set$0 == 1 && (str = this.eventName) != null && (list = this.backEnds) != null) {
                return new AutoValue_RobloxTelemetryEventConfig(str, list, this.throttlingHundredthPercentage);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.eventName == null) {
                sb2.append(" eventName");
            }
            if (this.backEnds == null) {
                sb2.append(" backEnds");
            }
            if ((1 & this.set$0) == 0) {
                sb2.append(" throttlingHundredthPercentage");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.Builder
        public RobloxTelemetryEventConfig.Builder setBackEnds(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null backEnds");
            }
            this.backEnds = list;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.Builder
        public RobloxTelemetryEventConfig.Builder setEventName(String str) {
            if (str == null) {
                throw new NullPointerException("Null eventName");
            }
            this.eventName = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig.Builder
        public RobloxTelemetryEventConfig.Builder setThrottlingHundredthPercentage(int i10) {
            this.throttlingHundredthPercentage = i10;
            this.set$0 = (byte) (this.set$0 | 1);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AutoValue_RobloxTelemetryEventConfig(String str, List<String> list, int i10) {
        this.eventName = str;
        this.backEnds = list;
        this.throttlingHundredthPercentage = i10;
    }
}
