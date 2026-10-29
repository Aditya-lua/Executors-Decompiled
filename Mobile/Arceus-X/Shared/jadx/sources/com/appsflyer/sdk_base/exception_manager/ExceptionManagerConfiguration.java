package com.appsflyer.sdk_base.exception_manager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m31665d2 = {"Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;", "", "sdkVersion", "", "min", "", "expire", "ttl", "", "<init>", "(Ljava/lang/String;IIJ)V", "getSdkVersion", "()Ljava/lang/String;", "getMin", "()I", "getExpire", "getTtl", "()J", "toStringifyJSON", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_base_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class ExceptionManagerConfiguration {
    private final int expire;
    private final int min;

    @NotNull
    private final String sdkVersion;
    private final long ttl;

    public ExceptionManagerConfiguration(@NotNull String sdkVersion, int i10, int i11, long j10) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.sdkVersion = sdkVersion;
        this.min = i10;
        this.expire = i11;
        this.ttl = j10;
    }

    public static /* synthetic */ ExceptionManagerConfiguration copy$default(ExceptionManagerConfiguration exceptionManagerConfiguration, String str, int i10, int i11, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = exceptionManagerConfiguration.sdkVersion;
        }
        if ((i12 & 2) != 0) {
            i10 = exceptionManagerConfiguration.min;
        }
        if ((i12 & 4) != 0) {
            i11 = exceptionManagerConfiguration.expire;
        }
        if ((i12 & 8) != 0) {
            j10 = exceptionManagerConfiguration.ttl;
        }
        int i13 = i11;
        return exceptionManagerConfiguration.copy(str, i10, i13, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getExpire() {
        return this.expire;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    @NotNull
    public final ExceptionManagerConfiguration copy(@NotNull String sdkVersion, int min, int expire, long ttl) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new ExceptionManagerConfiguration(sdkVersion, min, expire, ttl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExceptionManagerConfiguration)) {
            return false;
        }
        ExceptionManagerConfiguration exceptionManagerConfiguration = (ExceptionManagerConfiguration) other;
        return Intrinsics.m31980c(this.sdkVersion, exceptionManagerConfiguration.sdkVersion) && this.min == exceptionManagerConfiguration.min && this.expire == exceptionManagerConfiguration.expire && this.ttl == exceptionManagerConfiguration.ttl;
    }

    public final int getExpire() {
        return this.expire;
    }

    public final int getMin() {
        return this.min;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return (((((this.sdkVersion.hashCode() * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.expire)) * 31) + Long.hashCode(this.ttl);
    }

    @NotNull
    public String toString() {
        return "ExceptionManagerConfiguration(sdkVersion=" + this.sdkVersion + ", min=" + this.min + ", expire=" + this.expire + ", ttl=" + this.ttl + ")";
    }

    @NotNull
    public final String toStringifyJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.sdkVersion);
            jSONObject.put("min", this.min);
            jSONObject.put("expire", this.expire);
            jSONObject.put("ttl", this.ttl);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
