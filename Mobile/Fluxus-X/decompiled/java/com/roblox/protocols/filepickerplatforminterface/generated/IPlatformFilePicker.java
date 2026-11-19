package com.roblox.protocols.filepickerplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IPlatformFilePicker {

    @Keep
    public static final class CppProxy extends IPlatformFilePicker {
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

        private native void native_cancelLoad(long j10, long j11);

        private native boolean native_isAvailable(long j10);

        private native boolean native_isSupported(long j10, FilePickerRequest filePickerRequest);

        private native void native_loadFile(long j10, long j11, long j12, Long l10);

        private native void native_pickFiles(long j10, long j11, FilePickerRequest filePickerRequest);

        private native void native_releaseLoadedFile(long j10, long j11);

        private native void native_releasePickedFile(long j10, long j11);

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IPlatformFilePicker
        public void cancelLoad(long j10) {
            native_cancelLoad(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IPlatformFilePicker
        public boolean isAvailable() {
            return native_isAvailable(this.nativeRef);
        }

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IPlatformFilePicker
        public boolean isSupported(FilePickerRequest filePickerRequest) {
            return native_isSupported(this.nativeRef, filePickerRequest);
        }

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IPlatformFilePicker
        public void loadFile(long j10, long j11, Long l10) {
            native_loadFile(this.nativeRef, j10, j11, l10);
        }

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IPlatformFilePicker
        public void pickFiles(long j10, FilePickerRequest filePickerRequest) {
            native_pickFiles(this.nativeRef, j10, filePickerRequest);
        }

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IPlatformFilePicker
        public void releaseLoadedFile(long j10) {
            native_releaseLoadedFile(this.nativeRef, j10);
        }

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IPlatformFilePicker
        public void releasePickedFile(long j10) {
            native_releasePickedFile(this.nativeRef, j10);
        }
    }

    public void cancelLoad(long j10) {
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean isSupported(FilePickerRequest filePickerRequest) {
        return false;
    }

    public void loadFile(long j10, long j11, Long l10) {
    }

    public void pickFiles(long j10, FilePickerRequest filePickerRequest) {
    }

    public void releaseLoadedFile(long j10) {
    }

    public void releasePickedFile(long j10) {
    }
}
