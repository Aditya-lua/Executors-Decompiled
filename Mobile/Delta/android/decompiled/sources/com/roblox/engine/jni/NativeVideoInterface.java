package com.roblox.engine.jni;

/* JADX INFO: loaded from: classes2.dex */
public class NativeVideoInterface {

    public enum ImageOrientation {
        Normal,
        FlipHorizontal,
        Rotate180,
        FlipVertical,
        Transpose,
        Rotate90,
        Transverse,
        Rotate270
    }

    public static class VideoDeviceId {
    }

    public interface VideoStreamListener {
    }

    public static native boolean connectListener(long j10, VideoStreamListener videoStreamListener);

    public static native long createCameraStream();

    public static native boolean destroyCameraStream(long j10);

    public static native VideoDeviceId[] nativeGetCameraDevices();

    public static native int openVideoStream(long j10, String str, int i10, int i11, double d10);

    public static native void setPlaying(long j10, boolean z10);
}
