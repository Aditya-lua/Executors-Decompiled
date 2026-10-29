package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RobloxTelemetryEvent extends RobloxTelemetryEvent {
    private final RobloxTelemetryEventConfig config;
    private final RobloxTelemetryEventData data;
    private final String eventType;

    public static final class Builder extends RobloxTelemetryEvent.Builder {
        private RobloxTelemetryEventConfig config;
        private RobloxTelemetryEventData data;
        private String eventType;

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEvent.Builder
        public RobloxTelemetryEvent autoBuild() {
            RobloxTelemetryEventData robloxTelemetryEventData;
            RobloxTelemetryEventConfig robloxTelemetryEventConfig;
            String str = this.eventType;
            if (str != null && (robloxTelemetryEventData = this.data) != null && (robloxTelemetryEventConfig = this.config) != null) {
                return new AutoValue_RobloxTelemetryEvent(str, robloxTelemetryEventData, robloxTelemetryEventConfig);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.eventType == null) {
                sb2.append(" eventType");
            }
            if (this.data == null) {
                sb2.append(" data");
            }
            if (this.config == null) {
                sb2.append(" config");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEvent.Builder
        public RobloxTelemetryEvent.Builder setConfig(RobloxTelemetryEventConfig robloxTelemetryEventConfig) {
            if (robloxTelemetryEventConfig == null) {
                throw new NullPointerException("Null config");
            }
            this.config = robloxTelemetryEventConfig;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEvent.Builder
        public RobloxTelemetryEvent.Builder setData(RobloxTelemetryEventData robloxTelemetryEventData) {
            if (robloxTelemetryEventData == null) {
                throw new NullPointerException("Null data");
            }
            this.data = robloxTelemetryEventData;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEvent.Builder
        public RobloxTelemetryEvent.Builder setEventType(String str) {
            if (str == null) {
                throw new NullPointerException("Null eventType");
            }
            this.eventType = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEvent
    public RobloxTelemetryEventConfig config() {
        return this.config;
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEvent
    public RobloxTelemetryEventData data() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RobloxTelemetryEvent) {
            RobloxTelemetryEvent robloxTelemetryEvent = (RobloxTelemetryEvent) obj;
            if (this.eventType.equals(robloxTelemetryEvent.eventType()) && this.data.equals(robloxTelemetryEvent.data()) && this.config.equals(robloxTelemetryEvent.config())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEvent
    public String eventType() {
        return this.eventType;
    }

    public int hashCode() {
        return ((((this.eventType.hashCode() ^ 1000003) * 1000003) ^ this.data.hashCode()) * 1000003) ^ this.config.hashCode();
    }

    public String toString() {
        return "RobloxTelemetryEvent{eventType=" + this.eventType + ", data=" + this.data + ", config=" + this.config + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AutoValue_RobloxTelemetryEvent(String str, RobloxTelemetryEventData robloxTelemetryEventData, RobloxTelemetryEventConfig robloxTelemetryEventConfig) {
        this.eventType = str;
        this.data = robloxTelemetryEventData;
        this.config = robloxTelemetryEventConfig;
    }
}
