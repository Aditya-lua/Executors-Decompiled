package com.roblox.protocols.systemdialogplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class ISystemDialogCallback {

    @Keep
    public static final class CppProxy extends ISystemDialogCallback {
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

        private native void native_onCancelClicked(long j10, SystemDialogContext systemDialogContext);

        private native void native_onClosed(long j10, SystemDialogContext systemDialogContext);

        private native void native_onOkClicked(long j10, SystemDialogContext systemDialogContext);

        private native void native_onOpened(long j10, SystemDialogContext systemDialogContext);

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onCancelClicked(SystemDialogContext systemDialogContext) {
            native_onCancelClicked(this.nativeRef, systemDialogContext);
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onClosed(SystemDialogContext systemDialogContext) {
            native_onClosed(this.nativeRef, systemDialogContext);
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onOkClicked(SystemDialogContext systemDialogContext) {
            native_onOkClicked(this.nativeRef, systemDialogContext);
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onOpened(SystemDialogContext systemDialogContext) {
            native_onOpened(this.nativeRef, systemDialogContext);
        }
    }

    public void onCancelClicked(SystemDialogContext systemDialogContext) {
    }

    public void onClosed(SystemDialogContext systemDialogContext) {
    }

    public void onOkClicked(SystemDialogContext systemDialogContext) {
    }

    public void onOpened(SystemDialogContext systemDialogContext) {
    }
}
