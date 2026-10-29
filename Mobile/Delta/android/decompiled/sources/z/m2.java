package z;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m2 implements n0.z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Integer, n0.a2> f36691f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0.k3 f36692g;

    public static class a {
        public static EncoderProfiles a(String str, int i10) {
            return CamcorderProfile.getAll(str, i10);
        }
    }

    public m2(String str, n0.k3 k3Var) {
        boolean z10;
        int i10;
        this.f36689d = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            g0.r1.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f36688c = z10;
        this.f36690e = i10;
        this.f36692g = k3Var;
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f36688c && b(i10) != null;
    }

    @Override // n0.z1
    public n0.a2 b(int i10) {
        n0.a2 a2VarE = null;
        if (!this.f36688c || !CamcorderProfile.hasProfile(this.f36690e, i10)) {
            return null;
        }
        if (this.f36691f.containsKey(Integer.valueOf(i10))) {
            return this.f36691f.get(Integer.valueOf(i10));
        }
        n0.a2 a2VarF = f(i10);
        if (a2VarF == null || g(a2VarF)) {
            a2VarE = a2VarF;
        } else if (i10 == 1) {
            a2VarE = d();
        } else if (i10 == 0) {
            a2VarE = e();
        }
        this.f36691f.put(Integer.valueOf(i10), a2VarE);
        return a2VarE;
    }

    public final n0.a2 c(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f36690e, i10);
        } catch (RuntimeException e10) {
            g0.r1.m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i10, e10);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return o0.a.a(camcorderProfile);
        }
        return null;
    }

    public final n0.a2 d() {
        Iterator<Integer> it = n0.z1.b.iterator();
        while (it.hasNext()) {
            n0.a2 a2VarB = b(it.next().intValue());
            if (a2VarB != null) {
                return a2VarB;
            }
        }
        return null;
    }

    public final n0.a2 e() {
        for (int size = n0.z1.b.size() - 1; size >= 0; size--) {
            n0.a2 a2VarB = b(size);
            if (a2VarB != null) {
                return a2VarB;
            }
        }
        return null;
    }

    public final n0.a2 f(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles encoderProfilesA = a.a(this.f36689d, i10);
            if (encoderProfilesA == null) {
                return null;
            }
            if (c0.e.b(InvalidVideoProfilesQuirk.class) != null) {
                g0.r1.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return o0.a.b(encoderProfilesA);
                } catch (NullPointerException e10) {
                    g0.r1.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e10);
                }
            }
        }
        return c(i10);
    }

    public final boolean g(n0.a2 a2Var) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f36692g.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<n0.a2.c> listB = a2Var.b();
        if (listB.isEmpty()) {
            return true;
        }
        return camcorderProfileResolutionQuirk.g().contains(listB.get(0).k());
    }
}
