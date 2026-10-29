package p317o0;

import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;
import p296n0.InterfaceC8721a2;

/* JADX INFO: renamed from: o0.d */
/* JADX INFO: loaded from: classes.dex */
public class C9620d {
    /* JADX INFO: renamed from: a */
    public static InterfaceC8721a2 m37963a(CamcorderProfile camcorderProfile) {
        return InterfaceC8721a2.b.m34986h(camcorderProfile.duration, camcorderProfile.fileFormat, m37964b(camcorderProfile), m37965c(camcorderProfile));
    }

    /* JADX INFO: renamed from: b */
    public static List<InterfaceC8721a2.a> m37964b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.audioCodec;
        arrayList.add(InterfaceC8721a2.a.m34979a(i10, InterfaceC8721a2.m34978g(i10), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, InterfaceC8721a2.m34976c(camcorderProfile.audioCodec)));
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static List<InterfaceC8721a2.c> m37965c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.videoCodec;
        arrayList.add(InterfaceC8721a2.c.m34987a(i10, InterfaceC8721a2.m34977d(i10), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
