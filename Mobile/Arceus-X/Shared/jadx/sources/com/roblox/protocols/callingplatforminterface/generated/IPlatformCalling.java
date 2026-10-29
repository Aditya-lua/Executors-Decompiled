package com.roblox.protocols.callingplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformCalling {

    @Keep
    public static final class CppProxy extends IPlatformCalling {
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

        private native void native_onCallingRemoved(long j10, String str);

        private native void native_onCallingStateChange(long j10, CallingState callingState);

        @Override // com.roblox.protocols.callingplatforminterface.generated.IPlatformCalling
        public void onCallingRemoved(String str) {
            native_onCallingRemoved(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.callingplatforminterface.generated.IPlatformCalling
        public void onCallingStateChange(CallingState callingState) {
            native_onCallingStateChange(this.nativeRef, callingState);
        }
    }

    public void onCallingRemoved(String str) {
    }

    public void onCallingStateChange(CallingState callingState) {
    }
}
