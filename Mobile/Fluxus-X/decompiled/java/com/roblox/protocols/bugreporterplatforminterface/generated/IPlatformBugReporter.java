package com.roblox.protocols.bugreporterplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformBugReporter {

    @Keep
    public static final class CppProxy extends IPlatformBugReporter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
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

        private native boolean native_isAvailable(long j10);

        @Override // com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter
        public boolean isAvailable() {
            return native_isAvailable(this.nativeRef);
        }
    }

    public boolean isAvailable() {
        return false;
    }
}
