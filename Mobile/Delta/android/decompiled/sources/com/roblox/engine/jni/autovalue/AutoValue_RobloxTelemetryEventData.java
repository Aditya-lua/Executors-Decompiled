package com.roblox.engine.jni.autovalue;

import android.util.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RobloxTelemetryEventData extends RobloxTelemetryEventData {
    private final List<Pair<String, String>> customStringFields;
    private final String eventContext;
    private final List<String> standardizedFields;

    public static final class Builder extends RobloxTelemetryEventData.Builder {
        private List<Pair<String, String>> customStringFields;
        private String eventContext;
        private List<String> standardizedFields;

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData.Builder
        public RobloxTelemetryEventData autoBuild() {
            List<Pair<String, String>> list;
            List<String> list2;
            String str = this.eventContext;
            if (str != null && (list = this.customStringFields) != null && (list2 = this.standardizedFields) != null) {
                return new AutoValue_RobloxTelemetryEventData(str, list, list2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.eventContext == null) {
                sb2.append(" eventContext");
            }
            if (this.customStringFields == null) {
                sb2.append(" customStringFields");
            }
            if (this.standardizedFields == null) {
                sb2.append(" standardizedFields");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData.Builder
        public RobloxTelemetryEventData.Builder setCustomStringFields(List<Pair<String, String>> list) {
            if (list == null) {
                throw new NullPointerException("Null customStringFields");
            }
            this.customStringFields = list;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData.Builder
        public RobloxTelemetryEventData.Builder setEventContext(String str) {
            if (str == null) {
                throw new NullPointerException("Null eventContext");
            }
            this.eventContext = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData.Builder
        public RobloxTelemetryEventData.Builder setStandardizedFields(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null standardizedFields");
            }
            this.standardizedFields = list;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData
    public List<Pair<String, String>> customStringFields() {
        return this.customStringFields;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RobloxTelemetryEventData) {
            RobloxTelemetryEventData robloxTelemetryEventData = (RobloxTelemetryEventData) obj;
            if (this.eventContext.equals(robloxTelemetryEventData.eventContext()) && this.customStringFields.equals(robloxTelemetryEventData.customStringFields()) && this.standardizedFields.equals(robloxTelemetryEventData.standardizedFields())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData
    public String eventContext() {
        return this.eventContext;
    }

    public int hashCode() {
        return ((((this.eventContext.hashCode() ^ 1000003) * 1000003) ^ this.customStringFields.hashCode()) * 1000003) ^ this.standardizedFields.hashCode();
    }

    @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData
    public List<String> standardizedFields() {
        return this.standardizedFields;
    }

    public String toString() {
        return "RobloxTelemetryEventData{eventContext=" + this.eventContext + ", customStringFields=" + this.customStringFields + ", standardizedFields=" + this.standardizedFields + "}";
    }

    private AutoValue_RobloxTelemetryEventData(String str, List<Pair<String, String>> list, List<String> list2) {
        this.eventContext = str;
        this.customStringFields = list;
        this.standardizedFields = list2;
    }
}
