package p282m1;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* JADX INFO: renamed from: m1.b */
/* JADX INFO: loaded from: classes.dex */
public class C8339b extends AbstractC8356g1 implements InterfaceC8353f1 {

    /* JADX INFO: renamed from: c */
    public final MediaCodecInfo.AudioCapabilities f30753c;

    public C8339b(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f30813b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f30753c = audioCapabilities;
    }
}
