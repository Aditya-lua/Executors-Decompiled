package p297n1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;
import p282m1.C8368k1;
import p282m1.InterfaceC8375n;

/* JADX INFO: renamed from: n1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8858a {

    /* JADX INFO: renamed from: a */
    public static final LruCache<String, MediaCodecInfo> f32244a = new LruCache<>(10);

    /* JADX INFO: renamed from: a */
    public static MediaCodec m35566a(String str) throws C8368k1 {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e10) {
            throw new C8368k1(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static MediaCodec m35567b(InterfaceC8375n interfaceC8375n) {
        return m35566a(interfaceC8375n.mo33890b());
    }

    /* JADX INFO: renamed from: c */
    public static MediaCodecInfo m35568c(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecM35566a;
        LruCache<String, MediaCodecInfo> lruCache = f32244a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(str);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodecM35566a = m35566a(str);
            try {
                MediaCodecInfo codecInfo = mediaCodecM35566a.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(str, codecInfo);
                }
                mediaCodecM35566a.release();
                return codecInfo;
            } catch (Throwable th2) {
                th = th2;
                if (mediaCodecM35566a != null) {
                    mediaCodecM35566a.release();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodecM35566a = null;
        }
    }
}
