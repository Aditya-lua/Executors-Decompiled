package com.roblox.protocols.pinshortcutplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPinShortcutHandlerCore {

    @Keep
    public static final class CppProxy extends IPinShortcutHandlerCore {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j10) {
            if (j10 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j10;
            NativeObjectManager.register(this, j10);
        }

        public static native void nativeDestroy(long j10);
    }

    public static native IPinShortcutHandlerCore setPlatformImpl(IPlatformPinShortcut iPlatformPinShortcut);
}
