package p282m1;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* JADX INFO: renamed from: m1.g1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8356g1 implements InterfaceC8353f1 {

    /* JADX INFO: renamed from: a */
    public final MediaCodecInfo f30812a;

    /* JADX INFO: renamed from: b */
    public final MediaCodecInfo.CodecCapabilities f30813b;

    public AbstractC8356g1(MediaCodecInfo mediaCodecInfo, String str) throws C8368k1 {
        this.f30812a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f30813b = capabilitiesForType;
        } catch (RuntimeException e10) {
            throw new C8368k1("Unable to get CodecCapabilities for mime: " + str, e10);
        }
    }
}
