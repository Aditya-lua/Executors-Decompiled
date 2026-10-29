package com.roblox.universalapp.widgets;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00068Æ\u0001¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\u00068Æ\u0001¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0018\u0010\r\u001a\u00020\u00068Æ\u0001¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;", "", "<init>", "()V", "", "initializeProtocol", "", "protocolName", "Ljava/lang/String;", "getProtocolName", "()Ljava/lang/String;", "recentlyPlayedRequestMessage", "getRecentlyPlayedRequestMessage", "recentlyPlayedWidgetVariant", "getRecentlyPlayedWidgetVariant", "robloxengine_commonDefaultProtectionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JNIWidgetDataProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final JNIWidgetDataProtocol f9851a = new JNIWidgetDataProtocol();

    @NotNull
    public final native String getProtocolName();

    @NotNull
    public final native String getRecentlyPlayedRequestMessage();

    @NotNull
    public final native String getRecentlyPlayedWidgetVariant();

    public final native void initializeProtocol();
}
