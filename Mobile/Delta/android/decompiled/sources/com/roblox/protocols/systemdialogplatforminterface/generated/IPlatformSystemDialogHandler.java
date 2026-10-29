package com.roblox.protocols.systemdialogplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformSystemDialogHandler {

    @Keep
    public static final class CppProxy extends IPlatformSystemDialogHandler {
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

        private native void native_dismiss(long j10, long j11);

        private native void native_dismissAll(long j10);

        private native boolean native_isAvailable(long j10);

        private native long native_open(long j10, SystemDialogRequest systemDialogRequest, ISystemDialogCallback iSystemDialogCallback);

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
        public void dismiss(long j10) {
            native_dismiss(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
        public void dismissAll() {
            native_dismissAll(this.nativeRef);
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
        public boolean isAvailable() {
            return native_isAvailable(this.nativeRef);
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
        public long open(SystemDialogRequest systemDialogRequest, ISystemDialogCallback iSystemDialogCallback) {
            return native_open(this.nativeRef, systemDialogRequest, iSystemDialogCallback);
        }
    }

    public void dismiss(long j10) {
    }

    public void dismissAll() {
    }

    public boolean isAvailable() {
        return false;
    }

    public long open(SystemDialogRequest systemDialogRequest, ISystemDialogCallback iSystemDialogCallback) {
        return 0L;
    }
}
