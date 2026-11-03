package com.roblox.protocols.connectivityv2platforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IConnectivityV2CoreListener {

    @Keep
    public static final class CppProxy extends IConnectivityV2CoreListener {
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

        private native void native_reportNetworkChanged(long j10, NetworkChangeReport networkChangeReport);

        private native void native_reportNetworkChangedV2(long j10, NetworkChangeReportV2 networkChangeReportV2);

        @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IConnectivityV2CoreListener
        public void reportNetworkChanged(NetworkChangeReport networkChangeReport) {
            native_reportNetworkChanged(this.nativeRef, networkChangeReport);
        }

        @Override // com.roblox.protocols.connectivityv2platforminterface.generated.IConnectivityV2CoreListener
        public void reportNetworkChangedV2(NetworkChangeReportV2 networkChangeReportV2) {
            native_reportNetworkChangedV2(this.nativeRef, networkChangeReportV2);
        }
    }

    public static native IConnectivityV2CoreListener setPlatformImpl(IPlatformConnectivityV2 iPlatformConnectivityV2);

    public void reportNetworkChanged(NetworkChangeReport networkChangeReport) {
    }

    public void reportNetworkChangedV2(NetworkChangeReportV2 networkChangeReportV2) {
    }
}
