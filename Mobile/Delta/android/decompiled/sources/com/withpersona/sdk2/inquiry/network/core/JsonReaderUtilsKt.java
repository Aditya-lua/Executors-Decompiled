package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.m;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonReaderUtilsKt {
    @Nullable
    public static final String nextStringOrNull(@NotNull m mVar) {
        return mVar.u() != m.c.NULL ? mVar.r() : (String) mVar.o();
    }
}
