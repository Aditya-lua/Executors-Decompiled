package com.roblox.protocols.examplev2platforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformExampleHandler {

    @Keep
    public static final class CppProxy extends IPlatformExampleHandler {
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

        private native int native_asyncPrintToNativeConsole(long j10, String str);

        private native boolean native_printToNativeConsole(long j10, String str);

        @Override // com.roblox.protocols.examplev2platforminterface.generated.IPlatformExampleHandler
        public int asyncPrintToNativeConsole(String str) {
            return native_asyncPrintToNativeConsole(this.nativeRef, str);
        }

        @Override // com.roblox.protocols.examplev2platforminterface.generated.IPlatformExampleHandler
        public boolean printToNativeConsole(String str) {
            return native_printToNativeConsole(this.nativeRef, str);
        }
    }

    public int asyncPrintToNativeConsole(String str) {
        return 0;
    }

    public boolean printToNativeConsole(String str) {
        return false;
    }
}
