package o0;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import g0.r1;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static a2 a(CamcorderProfile camcorderProfile) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            r1.l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i10 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return d.a(camcorderProfile);
    }

    public static a2 b(EncoderProfiles encoderProfiles) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i10 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i10 + ". Version 31 or higher required.");
    }
}
