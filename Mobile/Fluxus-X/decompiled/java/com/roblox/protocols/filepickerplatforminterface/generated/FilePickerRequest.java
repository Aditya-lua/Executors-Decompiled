package com.roblox.protocols.filepickerplatforminterface.generated;

import androidx.annotation.Keep;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FilePickerRequest {
    final FilePickerCameraFacing cameraFacing;
    final ArrayList<String> extensions;
    final int maximumFileCount;
    final ArrayList<FilePickerMediaType> mediaTypes;
    final ArrayList<String> mimeTypes;
    final FilePickerSource source;

    public FilePickerRequest(FilePickerSource filePickerSource, ArrayList<FilePickerMediaType> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, FilePickerCameraFacing filePickerCameraFacing, int i10) {
        this.source = filePickerSource;
        this.mediaTypes = arrayList;
        this.mimeTypes = arrayList2;
        this.extensions = arrayList3;
        this.cameraFacing = filePickerCameraFacing;
        this.maximumFileCount = i10;
    }

    public FilePickerCameraFacing getCameraFacing() {
        return this.cameraFacing;
    }

    public ArrayList<String> getExtensions() {
        return this.extensions;
    }

    public int getMaximumFileCount() {
        return this.maximumFileCount;
    }

    public ArrayList<FilePickerMediaType> getMediaTypes() {
        return this.mediaTypes;
    }

    public ArrayList<String> getMimeTypes() {
        return this.mimeTypes;
    }

    public FilePickerSource getSource() {
        return this.source;
    }

    public String toString() {
        return "FilePickerRequest{source=" + this.source + ",mediaTypes=" + this.mediaTypes + ",mimeTypes=" + this.mimeTypes + ",extensions=" + this.extensions + ",cameraFacing=" + this.cameraFacing + ",maximumFileCount=" + this.maximumFileCount + "}";
    }
}
