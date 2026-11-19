package com.roblox.protocols.filepickerplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class IFilePickerCoreListener {

    @Keep
    public static final class CppProxy extends IFilePickerCoreListener {
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

        private native void native_onLoadCompleted(long j10, long j11, FilePickerLoadStatus filePickerLoadStatus, FilePickerLoadedFileInfo filePickerLoadedFileInfo);

        private native void native_onPickCompleted(long j10, long j11, FilePickerStatus filePickerStatus, ArrayList<FilePickerPickedFileInfo> arrayList);

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IFilePickerCoreListener
        public void onLoadCompleted(long j10, FilePickerLoadStatus filePickerLoadStatus, FilePickerLoadedFileInfo filePickerLoadedFileInfo) {
            native_onLoadCompleted(this.nativeRef, j10, filePickerLoadStatus, filePickerLoadedFileInfo);
        }

        @Override // com.roblox.protocols.filepickerplatforminterface.generated.IFilePickerCoreListener
        public void onPickCompleted(long j10, FilePickerStatus filePickerStatus, ArrayList<FilePickerPickedFileInfo> arrayList) {
            native_onPickCompleted(this.nativeRef, j10, filePickerStatus, arrayList);
        }
    }

    public static native IFilePickerCoreListener setPlatformImpl(IPlatformFilePicker iPlatformFilePicker);

    public void onLoadCompleted(long j10, FilePickerLoadStatus filePickerLoadStatus, FilePickerLoadedFileInfo filePickerLoadedFileInfo) {
    }

    public void onPickCompleted(long j10, FilePickerStatus filePickerStatus, ArrayList<FilePickerPickedFileInfo> arrayList) {
    }
}
