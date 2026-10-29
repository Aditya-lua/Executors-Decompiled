package com.roblox.protocols.telemetrybindingsplatforminterface.generated;

import androidx.annotation.Keep;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class TelemetryConfig {
    final HashSet<TelemetryBackend> backends;
    final String description;
    final String eventName;
    final String lastUpdated;
    final String links;
    final Integer throttlingPercentage;

    public TelemetryConfig(String str, HashSet<TelemetryBackend> hashSet, Integer num, String str2, String str3, String str4) {
        this.eventName = str;
        this.backends = hashSet;
        this.throttlingPercentage = num;
        this.lastUpdated = str2;
        this.description = str3;
        this.links = str4;
    }

    public HashSet<TelemetryBackend> getBackends() {
        return this.backends;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public String getLinks() {
        return this.links;
    }

    public Integer getThrottlingPercentage() {
        return this.throttlingPercentage;
    }

    public String toString() {
        return "TelemetryConfig{eventName=" + this.eventName + ",backends=" + this.backends + ",throttlingPercentage=" + this.throttlingPercentage + ",lastUpdated=" + this.lastUpdated + ",description=" + this.description + ",links=" + this.links + "}";
    }
}
