package com.roblox.protocols.telemetrybindingsplatforminterface.generated;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class TelemetryData {
    final HashMap<String, TelemetryFieldValue> customFields;
    final String eventContext;
    final String legacyOverrideTargetForEventIngest;
    final HashSet<TelemetryStandardizedField> standardizedFields;

    public TelemetryData(HashMap<String, TelemetryFieldValue> map, HashSet<TelemetryStandardizedField> hashSet, String str, String str2) {
        this.customFields = map;
        this.standardizedFields = hashSet;
        this.eventContext = str;
        this.legacyOverrideTargetForEventIngest = str2;
    }

    public HashMap<String, TelemetryFieldValue> getCustomFields() {
        return this.customFields;
    }

    public String getEventContext() {
        return this.eventContext;
    }

    public String getLegacyOverrideTargetForEventIngest() {
        return this.legacyOverrideTargetForEventIngest;
    }

    public HashSet<TelemetryStandardizedField> getStandardizedFields() {
        return this.standardizedFields;
    }

    public String toString() {
        return "TelemetryData{customFields=" + this.customFields + ",standardizedFields=" + this.standardizedFields + ",eventContext=" + this.eventContext + ",legacyOverrideTargetForEventIngest=" + this.legacyOverrideTargetForEventIngest + "}";
    }
}
