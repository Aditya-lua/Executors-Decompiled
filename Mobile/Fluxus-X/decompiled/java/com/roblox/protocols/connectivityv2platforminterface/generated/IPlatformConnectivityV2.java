package com.roblox.protocols.connectivityv2platforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformConnectivityV2 {

    @Keep
    public static final class CppProxy extends IPlatformConnectivityV2 {
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

        private native void native_startMonitoring(long j10);

        private native void native_stopMonitoring(long j10);

        @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2
        public void startMonitoring() {
            native_startMonitoring(this.nativeRef);
        }

        @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IPlatformConnectivityV2
        public void stopMonitoring() {
            native_stopMonitoring(this.nativeRef);
        }
    }

    public void startMonitoring() {
    }

    public void stopMonitoring() {
    }
}
