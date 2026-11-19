package o0;

import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static a2 a(CamcorderProfile camcorderProfile) {
        return a2.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    public static List<a2.a> b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.audioCodec;
        arrayList.add(a2.a.a(i10, a2.g(i10), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, a2.c(camcorderProfile.audioCodec)));
        return arrayList;
    }

    public static List<a2.c> c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.videoCodec;
        arrayList.add(a2.c.a(i10, a2.d(i10), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
