package com.appsflyer.sdk_base.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;", "", "className", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "EXCEPTION_MANAGER", "LVL", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SupportedOptionalFeatures {
    EXCEPTION_MANAGER("com.appsflyer.exception_manager.ExceptionManager"),
    LVL("com.appsflyer.lvl.AppsFlyerLVL");

    private static final /* synthetic */ qt.a $ENTRIES = qt.b.a(values());

    @NotNull
    private final String className;

    SupportedOptionalFeatures(String str) {
        this.className = str;
    }

    @NotNull
    public static qt.a<SupportedOptionalFeatures> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }
}
