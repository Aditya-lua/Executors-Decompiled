package n1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;
import m1.k1;
import m1.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache<String, MediaCodecInfo> f24977a = new LruCache<>(10);

    public static MediaCodec a(String str) throws k1 {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e10) {
            throw new k1(e10);
        }
    }

    public static MediaCodec b(n nVar) {
        return a(nVar.b());
    }

    public static MediaCodecInfo c(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecA;
        LruCache<String, MediaCodecInfo> lruCache = f24977a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(str);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodecA = a(str);
            try {
                MediaCodecInfo codecInfo = mediaCodecA.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(str, codecInfo);
                }
                mediaCodecA.release();
                return codecInfo;
            } catch (Throwable th2) {
                th = th2;
                if (mediaCodecA != null) {
                    mediaCodecA.release();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodecA = null;
        }
    }
}
