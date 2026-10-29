package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1qSDK {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    final List<AFc1pSDK> f5262d;

    public AFc1qSDK(@NotNull List<AFc1pSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f5262d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1qSDK) && Intrinsics.c(this.f5262d, ((AFc1qSDK) obj).f5262d);
    }

    public final int hashCode() {
        return this.f5262d.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StorageConfig(typeEntries=" + this.f5262d + ")";
    }
}
