package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1qSDK {

    /* JADX INFO: renamed from: d */
    @NotNull
    final List<AFc1pSDK> f6890d;

    public AFc1qSDK(@NotNull List<AFc1pSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f6890d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1qSDK) && Intrinsics.m31980c(this.f6890d, ((AFc1qSDK) obj).f6890d);
    }

    public final int hashCode() {
        return this.f6890d.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StorageConfig(typeEntries=" + this.f6890d + ")";
    }
}
