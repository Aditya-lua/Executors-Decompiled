package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.appsflyer.internal.AFd1aSDK, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, m31665d2 = {"Lcom/appsflyer/internal/AFd1aSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFd1dSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFd1dSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFLogger", "Ljava/lang/String;", "registerClient", "unregisterClient", "d", "Lcom/appsflyer/internal/AFd1dSDK;"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class HostMeta {

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final AFd1dSDK method;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata and from toString */
    @Nullable
    public final String prefix;

    public HostMeta(@NotNull String str, @Nullable String str2, @NotNull AFd1dSDK aFd1dSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFd1dSDK, "");
        this.name = str;
        this.prefix = str2;
        this.method = aFd1dSDK;
    }

    public final boolean equals(@Nullable Object p8) {
        if (this == p8) {
            return true;
        }
        if (!(p8 instanceof HostMeta)) {
            return false;
        }
        HostMeta hostMeta = (HostMeta) p8;
        return Intrinsics.m31980c(this.name, hostMeta.name) && Intrinsics.m31980c(this.prefix, hostMeta.prefix) && this.method == hostMeta.method;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.prefix;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.method.hashCode();
    }

    @NotNull
    public final String toString() {
        return "HostMeta(name=" + this.name + ", prefix=" + this.prefix + ", method=" + this.method + ")";
    }
}
