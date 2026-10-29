package p317o0;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import p140g0.C5931r1;
import p296n0.InterfaceC8721a2;

/* JADX INFO: renamed from: o0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9617a {
    /* JADX INFO: renamed from: a */
    public static InterfaceC8721a2 m37955a(CamcorderProfile camcorderProfile) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            C5931r1.m26572l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i10 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return C9620d.m37963a(camcorderProfile);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC8721a2 m37956b(EncoderProfiles encoderProfiles) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return C9619c.m37960a(encoderProfiles);
        }
        if (i10 >= 31) {
            return C9618b.m37957a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i10 + ". Version 31 or higher required.");
    }
}
