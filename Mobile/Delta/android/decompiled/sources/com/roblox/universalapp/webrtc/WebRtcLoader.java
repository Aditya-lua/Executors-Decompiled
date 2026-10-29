package com.roblox.universalapp.webrtc;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\b"}, d2 = {"Lcom/roblox/universalapp/webrtc/WebRtcLoader;", "", "<init>", "()V", "initialize", "", "libraryPath", "", "robloxengine_commonDefaultProtectionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebRtcLoader {

    @NotNull
    public static final WebRtcLoader INSTANCE = new WebRtcLoader();

    private WebRtcLoader() {
    }

    public static final void initialize() {
    }

    public static final native void initialize(@NotNull String libraryPath);
}
