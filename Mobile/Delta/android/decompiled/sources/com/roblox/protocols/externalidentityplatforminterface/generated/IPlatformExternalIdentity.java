package com.roblox.protocols.externalidentityplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformExternalIdentity {

    @Keep
    public static final class CppProxy extends IPlatformExternalIdentity {
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

        private native void native_acquireProof(long j10, long j11, ExternalIdentityRequest externalIdentityRequest);

        private native void native_cancel(long j10, long j11);

        private native void native_getCapabilities(long j10, long j11);

        @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IPlatformExternalIdentity
        public void acquireProof(long j10, ExternalIdentityRequest externalIdentityRequest) {
            native_acquireProof(this.nativeRef, j10, externalIdentityRequest);
        }

        @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IPlatformExternalIdentity
        public void cancel(long j10) {
            native_cancel(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IPlatformExternalIdentity
        public void getCapabilities(long j10) {
            native_getCapabilities(this.nativeRef, j10);
        }
    }

    public void acquireProof(long j10, ExternalIdentityRequest externalIdentityRequest) {
    }

    public void cancel(long j10) {
    }

    public void getCapabilities(long j10) {
    }
}
