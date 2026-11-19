package com.withpersona.sdk2.inquiry.network.core;

import hn.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonReaderUtilsKt {
    @Nullable
    public static final String nextStringOrNull(@NotNull m mVar) {
        return mVar.w() != m.c.NULL ? mVar.s() : (String) mVar.p();
    }
}
