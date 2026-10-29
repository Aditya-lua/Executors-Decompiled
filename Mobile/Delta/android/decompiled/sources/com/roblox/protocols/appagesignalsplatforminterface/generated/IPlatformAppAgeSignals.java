package com.roblox.protocols.appagesignalsplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformAppAgeSignals {

    @Keep
    public static final class CppProxy extends IPlatformAppAgeSignals {
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

        private native boolean native_getAgeSignal(long j10);

        private native boolean native_isAgeSignalAvailable(long j10);

        @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
        public boolean getAgeSignal() {
            return native_getAgeSignal(this.nativeRef);
        }

        @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
        public boolean isAgeSignalAvailable() {
            return native_isAgeSignalAvailable(this.nativeRef);
        }
    }

    public boolean getAgeSignal() {
        return false;
    }

    public boolean isAgeSignalAvailable() {
        return false;
    }
}
