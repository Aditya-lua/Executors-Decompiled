package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1qSDK {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    final List<AFc1pSDK> f5778d;

    public AFc1qSDK(@NotNull List<AFc1pSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f5778d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1qSDK) && Intrinsics.c(this.f5778d, ((AFc1qSDK) obj).f5778d);
    }

    public final int hashCode() {
        return this.f5778d.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StorageConfig(typeEntries=" + this.f5778d + ")";
    }
}
