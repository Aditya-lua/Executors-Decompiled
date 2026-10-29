package com.appsflyer.sdk_base.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m31665d2 = {"Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;", "", "className", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "EXCEPTION_MANAGER", "LVL", "sdk_base_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public enum SupportedOptionalFeatures {
    EXCEPTION_MANAGER("com.appsflyer.exception_manager.ExceptionManager"),
    LVL("com.appsflyer.lvl.AppsFlyerLVL");

    private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

    @NotNull
    private final String className;

    SupportedOptionalFeatures(String str) {
        this.className = str;
    }

    @NotNull
    public static InterfaceC10707a<SupportedOptionalFeatures> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }
}
