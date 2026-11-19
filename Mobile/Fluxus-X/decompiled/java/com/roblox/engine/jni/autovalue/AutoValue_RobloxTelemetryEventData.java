package com.roblox.engine.jni.autovalue;

import android.util.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RobloxTelemetryEventData extends RobloxTelemetryEventData {
    private final List<Pair<String, String>> customStringFields;
    private final String eventContext;
    private final List<String> standardizedFields;

    public static final class a extends RobloxTelemetryEventData.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9591a;
        public List<Pair<String, String>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<String> f9592c;

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData.a
        public RobloxTelemetryEventData a() {
            List<Pair<String, String>> list;
            List<String> list2;
            String str = this.f9591a;
            if (str != null && (list = this.b) != null && (list2 = this.f9592c) != null) {
                return new AutoValue_RobloxTelemetryEventData(str, list, list2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9591a == null) {
                sb2.append(" eventContext");
            }
            if (this.b == null) {
                sb2.append(" customStringFields");
            }
            if (this.f9592c == null) {
                sb2.append(" standardizedFields");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData.a
        public RobloxTelemetryEventData.a c(List<Pair<String, String>> list) {
            if (list == null) {
                throw new NullPointerException("Null customStringFields");
            }
            this.b = list;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.RobloxTelemetryEventData.a
        public RobloxTelemetryEventData.a d(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null standardizedFields");
            }
            this.f9592c = list;
            return this;
        }

        public RobloxTelemetryEventData.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null eventContext");
            }
            this.f9591a = str;
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
