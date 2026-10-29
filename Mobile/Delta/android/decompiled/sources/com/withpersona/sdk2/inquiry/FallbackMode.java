package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qt.a;
import qt.b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/FallbackMode;", "", "<init>", "(Ljava/lang/String;I)V", "NEVER", "ALWAYS", "DEFER", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum FallbackMode {
    NEVER,
    ALWAYS,
    DEFER;

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    @NotNull
    public static a<FallbackMode> getEntries() {
        return $ENTRIES;
    }
}
