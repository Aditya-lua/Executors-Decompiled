package com.roblox.engine.jni;

import androidx.annotation.Keep;
import java.nio.ByteBuffer;

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

    @Keep
    public static class VideoDeviceId {
        public final int exifOrientation;
        public final String guid;
        public final boolean isPreferred;
        public final String name;

        public VideoDeviceId(boolean z10, String str, String str2, int i10) {
            this.isPreferred = z10;
            this.name = str;
            this.guid = str2;
            this.exifOrientation = i10;
        }

        public ImageOrientation getExifOrientation() {
            ImageOrientation[] imageOrientationArrValues = ImageOrientation.values();
            int i10 = this.exifOrientation;
            if (i10 < imageOrientationArrValues.length) {
                return imageOrientationArrValues[i10];
            }
            return null;
        }
    }

    @Keep
    public interface VideoStreamListener {
        void signalCameraDisconnected();

        void signalFormatChanged(int i10, int i11, int i12, int i13);

        void signalVideoFrameArrived(long j10, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);

        void signalVideoStart();

        void signalVideoStop();
    }

    public static native boolean connectListener(long j10, VideoStreamListener videoStreamListener);

    public static native long createCameraStream();

    public static native boolean destroyCameraStream(long j10);

    public static native VideoDeviceId[] nativeGetCameraDevices();

    public static native int openVideoStream(long j10, String str, int i10, int i11, double d10);

    public static native void setPlaying(long j10, boolean z10);
}
