package m1;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodecInfo f23749a;
    public final MediaCodecInfo.CodecCapabilities b;

    public g1(MediaCodecInfo mediaCodecInfo, String str) throws k1 {
        this.f23749a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e10) {
            throw new k1("Unable to get CodecCapabilities for mime: " + str, e10);
        }
    }
}
