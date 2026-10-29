package com.appsflyer.sdk_base.logger;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qt.a;
import qt.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/appsflyer/sdk_base/logger/LogTag;", "", "tagName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTagName", "()Ljava/lang/String;", "INIT_BY_CONFIG", "SDK_LIFECYCLE", "GCD", "PLAY_INTEGRITY_API", "OTHER", "HTTP_CLIENT", "QUEUE", "CACHE", "PREFERENCES", "REMOTE_CONTROL", "DDL", "REFERRER", "META_REFERRER", "SAMSUNG_PRELOAD_REFERRER", "ADVERTISING_ID", "CROSS_PROMOTION", "EXCEPTION_MANAGER", "ATTRIBUTION", "RD", "ENGAGEMENT", "ANTI_FRAUD", "PUBLIC_API", "AD_REVENUE", "SDK_SETTERS", "PREDICT", "DEVICE_DATA", "SECURITY", "SECURITY_SDK", "GENERAL", "PREINSTALL", "UNINSTALL", "PURCHASE_VALIDATION", "DMA", "PROXY", "AF_EXECUTOR", "APP_SET_ID", "RFR_INIT_PROVIDER", "PLUGIN_BRIDGE", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum LogTag {
    INIT_BY_CONFIG("Config Init Helper"),
    SDK_LIFECYCLE("SDK Lifecycle"),
    GCD("GCD"),
    PLAY_INTEGRITY_API("Play Integrity Api"),
    OTHER("Other"),
    HTTP_CLIENT("HTTP Client"),
    QUEUE("Queue"),
    CACHE("Cache"),
    PREFERENCES("Preferences"),
    REMOTE_CONTROL("CFG"),
    DDL("DDL"),
    REFERRER("Referrer"),
    META_REFERRER("Meta Referrer"),
    SAMSUNG_PRELOAD_REFERRER("Samsung Preload Referrer"),
    ADVERTISING_ID("Advertising Id"),
    CROSS_PROMOTION("Cross Promotion"),
    EXCEPTION_MANAGER("Exception Manager"),
    ATTRIBUTION("Attribution"),
    RD("RD"),
    ENGAGEMENT("Engagement"),
    ANTI_FRAUD("Anti Fraud"),
    PUBLIC_API("Public API"),
    AD_REVENUE("Ad Revenue"),
    SDK_SETTERS("Setter"),
    PREDICT("Predict"),
    DEVICE_DATA("Device Data"),
    SECURITY("Security"),
    SECURITY_SDK("SIG_N"),
    GENERAL("General"),
    PREINSTALL("Preinstall"),
    UNINSTALL("Uninstall"),
    PURCHASE_VALIDATION("Purchase Validation"),
    DMA("DMA"),
    PROXY("PROXY"),
    AF_EXECUTOR("AF Executor"),
    APP_SET_ID("App set ID"),
    RFR_INIT_PROVIDER("Referrer_Init_Provider"),
    PLUGIN_BRIDGE("Plugin Bridge");

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    @NotNull
    private final String tagName;

    LogTag(String str) {
        this.tagName = str;
    }

    @NotNull
    public static a<LogTag> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getTagName() {
        return this.tagName;
    }
}
