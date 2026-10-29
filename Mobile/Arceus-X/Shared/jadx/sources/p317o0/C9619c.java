package p317o0;

import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;
import p296n0.InterfaceC8721a2;

/* JADX INFO: renamed from: o0.c */
/* JADX INFO: loaded from: classes.dex */
public class C9619c {
    /* JADX INFO: renamed from: a */
    public static InterfaceC8721a2 m37960a(EncoderProfiles encoderProfiles) {
        return InterfaceC8721a2.b.m34986h(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), m37961b(encoderProfiles.getAudioProfiles()), m37962c(encoderProfiles.getVideoProfiles()));
    }

    /* JADX INFO: renamed from: b */
    public static List<InterfaceC8721a2.a> m37961b(List<EncoderProfiles.AudioProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : list) {
            arrayList.add(InterfaceC8721a2.a.m34979a(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static List<InterfaceC8721a2.c> m37962c(List<EncoderProfiles.VideoProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : list) {
            arrayList.add(InterfaceC8721a2.c.m34987a(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return arrayList;
    }
}
