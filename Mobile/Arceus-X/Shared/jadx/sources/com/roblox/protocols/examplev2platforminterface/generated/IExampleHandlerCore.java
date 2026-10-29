package com.roblox.protocols.examplev2platforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IExampleHandlerCore {

    @Keep
    public static final class CppProxy extends IExampleHandlerCore {
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

        private native void native_onPrintCompleted(long j10, int i10, boolean z10);

        private native void native_sendNotification(long j10, ExampleNotificationType exampleNotificationType);

        @Override // com.roblox.protocols.examplev2platforminterface.generated.IExampleHandlerCore
        public void onPrintCompleted(int i10, boolean z10) {
            native_onPrintCompleted(this.nativeRef, i10, z10);
        }

        @Override // com.roblox.protocols.examplev2platforminterface.generated.IExampleHandlerCore
        public void sendNotification(ExampleNotificationType exampleNotificationType) {
            native_sendNotification(this.nativeRef, exampleNotificationType);
        }
    }

    public static native IExampleHandlerCore setPlatformImpl(IPlatformExampleHandler iPlatformExampleHandler);

    public void onPrintCompleted(int i10, boolean z10) {
    }

    public void sendNotification(ExampleNotificationType exampleNotificationType) {
    }
}
