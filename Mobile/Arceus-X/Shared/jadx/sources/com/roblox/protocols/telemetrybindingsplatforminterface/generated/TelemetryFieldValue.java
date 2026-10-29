package com.roblox.protocols.telemetrybindingsplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class TelemetryFieldValue {
    final Boolean boolVal;
    final Double doubleVal;
    final Long intVal;
    final String stringVal;
    final TelemetryFieldValueType valueType;

    public TelemetryFieldValue(TelemetryFieldValueType telemetryFieldValueType, Boolean bool, Long l10, Double d10, String str) {
        this.valueType = telemetryFieldValueType;
        this.boolVal = bool;
        this.intVal = l10;
        this.doubleVal = d10;
        this.stringVal = str;
    }

    public Boolean getBoolVal() {
        return this.boolVal;
    }

    public Double getDoubleVal() {
        return this.doubleVal;
    }

    public Long getIntVal() {
        return this.intVal;
    }

    public String getStringVal() {
        return this.stringVal;
    }

    public TelemetryFieldValueType getValueType() {
        return this.valueType;
    }

    public String toString() {
        return "TelemetryFieldValue{valueType=" + this.valueType + ",boolVal=" + this.boolVal + ",intVal=" + this.intVal + ",doubleVal=" + this.doubleVal + ",stringVal=" + this.stringVal + "}";
    }
}
