package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformDesignFoundations {

    @Keep
    public static final class CppProxy extends IPlatformDesignFoundations {
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

        private native void native_onTokensCleared(long j10);

        private native void native_onTokensUpdated(long j10, DesignTokens designTokens);

        @Override // com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations
        public void onTokensCleared() {
            native_onTokensCleared(this.nativeRef);
        }

        @Override // com.roblox.protocols.designfoundationsplatforminterface.generated.IPlatformDesignFoundations
        public void onTokensUpdated(DesignTokens designTokens) {
            native_onTokensUpdated(this.nativeRef, designTokens);
        }
    }

    public void onTokensCleared() {
    }

    public void onTokensUpdated(DesignTokens designTokens) {
    }
}
