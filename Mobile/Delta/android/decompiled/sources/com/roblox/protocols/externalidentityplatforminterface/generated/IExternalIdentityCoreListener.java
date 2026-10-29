package com.roblox.protocols.externalidentityplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IExternalIdentityCoreListener {

    @Keep
    public static final class CppProxy extends IExternalIdentityCoreListener {
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

        private native void native_onCapabilitiesResult(long j10, long j11, ExternalIdentityCapabilities externalIdentityCapabilities);

        private native boolean native_onProofCommitStarted(long j10, long j11);

        private native void native_onProofResult(long j10, long j11, ExternalIdentityResult externalIdentityResult, String str);

        @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IExternalIdentityCoreListener
        public void onCapabilitiesResult(long j10, ExternalIdentityCapabilities externalIdentityCapabilities) {
            native_onCapabilitiesResult(this.nativeRef, j10, externalIdentityCapabilities);
        }

        @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IExternalIdentityCoreListener
        public boolean onProofCommitStarted(long j10) {
            return native_onProofCommitStarted(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.externalidentityplatforminterface.generated.IExternalIdentityCoreListener
        public void onProofResult(long j10, ExternalIdentityResult externalIdentityResult, String str) {
            native_onProofResult(this.nativeRef, j10, externalIdentityResult, str);
        }
    }

    public static native IExternalIdentityCoreListener setPlatformImpl(IPlatformExternalIdentity iPlatformExternalIdentity);

    public void onCapabilitiesResult(long j10, ExternalIdentityCapabilities externalIdentityCapabilities) {
    }

    public boolean onProofCommitStarted(long j10) {
        return false;
    }

    public void onProofResult(long j10, ExternalIdentityResult externalIdentityResult, String str) {
    }
}
