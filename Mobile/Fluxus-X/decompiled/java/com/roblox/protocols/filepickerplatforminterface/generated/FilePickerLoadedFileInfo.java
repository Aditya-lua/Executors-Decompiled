package com.roblox.protocols.filepickerplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FilePickerLoadedFileInfo {
    final Integer fileDescriptor;
    final String path;
    final long sizeBytes;

    public FilePickerLoadedFileInfo(String str, Integer num, long j10) {
        this.path = str;
        this.fileDescriptor = num;
        this.sizeBytes = j10;
    }

    public Integer getFileDescriptor() {
        return this.fileDescriptor;
    }

    public String getPath() {
        return this.path;
    }

    public long getSizeBytes() {
        return this.sizeBytes;
    }

    public String toString() {
        return "FilePickerLoadedFileInfo{path=" + this.path + ",fileDescriptor=" + this.fileDescriptor + ",sizeBytes=" + this.sizeBytes + "}";
    }
}
