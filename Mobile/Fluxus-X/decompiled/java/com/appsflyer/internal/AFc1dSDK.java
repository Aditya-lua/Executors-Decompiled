package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1dSDK<T> {

    @NotNull
    public final Function0<T> AFKeystoreWrapper;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1dSDK(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AFKeystoreWrapper = function0;
    }
}
