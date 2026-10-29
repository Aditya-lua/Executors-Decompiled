package com.roblox.protocols.appagesignalsplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IAppAgeSignalsCore {

    @Keep
    public static final class CppProxy extends IAppAgeSignalsCore {
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

        private native void native_onGetAgeSignalFailed(long j10, AppAgeSignalsPlatformError appAgeSignalsPlatformError);

        private native void native_onGetAgeSignalSucceeded(long j10, AppAgeSignalsPlatformSuccess appAgeSignalsPlatformSuccess);

        @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore
        public void onGetAgeSignalFailed(AppAgeSignalsPlatformError appAgeSignalsPlatformError) {
            native_onGetAgeSignalFailed(this.nativeRef, appAgeSignalsPlatformError);
        }

        @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore
        public void onGetAgeSignalSucceeded(AppAgeSignalsPlatformSuccess appAgeSignalsPlatformSuccess) {
            native_onGetAgeSignalSucceeded(this.nativeRef, appAgeSignalsPlatformSuccess);
        }
    }

    public static native IAppAgeSignalsCore setPlatformImpl(IPlatformAppAgeSignals iPlatformAppAgeSignals);

    public void onGetAgeSignalFailed(AppAgeSignalsPlatformError appAgeSignalsPlatformError) {
    }

    public void onGetAgeSignalSucceeded(AppAgeSignalsPlatformSuccess appAgeSignalsPlatformSuccess) {
    }
}
