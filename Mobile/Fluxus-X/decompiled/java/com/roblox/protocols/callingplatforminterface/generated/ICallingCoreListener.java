package com.roblox.protocols.callingplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class ICallingCoreListener {

    @Keep
    public static final class CppProxy extends ICallingCoreListener {
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

        private native void native_answerIncomingCall(long j10, String str);

        private native void native_createCall(long j10, ArrayList<Long> arrayList, String str);

        private native void native_endCall(long j10, String str, String str2);

        private native void native_receiveIncomingCall(long j10, String str);

        @Override // com.roblox.protocols.callingplatforminterface.generated.ICallingCoreListener
        public void answerIncomingCall(String str) {
            native_answerIncomingCall(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.callingplatforminterface.generated.ICallingCoreListener
        public void createCall(ArrayList<Long> arrayList, String str) {
            native_createCall(this.nativeRef, arrayList, str);
        }

        @Override // com.roblox.protocols.callingplatforminterface.generated.ICallingCoreListener
        public void endCall(String str, String str2) {
            native_endCall(this.nativeRef, str, str2);
        }

        @Override // com.roblox.protocols.callingplatforminterface.generated.ICallingCoreListener
        public void receiveIncomingCall(String str) {
            native_receiveIncomingCall(this.nativeRef, str);
        }
    }

    public static native ICallingCoreListener setPlatformImpl(IPlatformCalling iPlatformCalling);

    public void answerIncomingCall(String str) {
    }

    public void createCall(ArrayList<Long> arrayList, String str) {
    }

    public void endCall(String str, String str2) {
    }

    public void receiveIncomingCall(String str) {
    }
}
