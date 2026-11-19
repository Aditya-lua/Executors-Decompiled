package com.roblox.protocols.filepickerplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FilePickerPickedFileInfo {
    final String extension;
    final String mimeType;
    final String name;
    final long pickedFileId;

    public FilePickerPickedFileInfo(long j10, String str, String str2, String str3) {
        this.pickedFileId = j10;
        this.name = str;
        this.mimeType = str2;
        this.extension = str3;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getName() {
        return this.name;
    }

    public long getPickedFileId() {
        return this.pickedFileId;
    }

    public String toString() {
        return "FilePickerPickedFileInfo{pickedFileId=" + this.pickedFileId + ",name=" + this.name + ",mimeType=" + this.mimeType + ",extension=" + this.extension + "}";
    }
}
