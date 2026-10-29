package p589z;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p036c0.C1500e;
import p140g0.C5931r1;
import p296n0.C8782k3;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8855z1;
import p317o0.C9617a;

/* JADX INFO: renamed from: z.m2 */
/* JADX INFO: loaded from: classes.dex */
public class C13574m2 implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: c */
    public final boolean f47519c;

    /* JADX INFO: renamed from: d */
    public final String f47520d;

    /* JADX INFO: renamed from: e */
    public final int f47521e;

    /* JADX INFO: renamed from: f */
    public final Map<Integer, InterfaceC8721a2> f47522f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final C8782k3 f47523g;

    /* JADX INFO: renamed from: z.m2$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static EncoderProfiles m49505a(String str, int i10) {
            return CamcorderProfile.getAll(str, i10);
        }
    }

    public C13574m2(String str, C8782k3 c8782k3) {
        boolean z10;
        int i10;
        this.f47520d = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            C5931r1.m26572l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f47519c = z10;
        this.f47521e = i10;
        this.f47523g = c8782k3;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int i10) {
        return this.f47519c && mo27504b(i10) != null;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int i10) {
        InterfaceC8721a2 interfaceC8721a2M49502e = null;
        if (!this.f47519c || !CamcorderProfile.hasProfile(this.f47521e, i10)) {
            return null;
        }
        if (this.f47522f.containsKey(Integer.valueOf(i10))) {
            return this.f47522f.get(Integer.valueOf(i10));
        }
        InterfaceC8721a2 interfaceC8721a2M49503f = m49503f(i10);
        if (interfaceC8721a2M49503f == null || m49504g(interfaceC8721a2M49503f)) {
            interfaceC8721a2M49502e = interfaceC8721a2M49503f;
        } else if (i10 == 1) {
            interfaceC8721a2M49502e = m49501d();
        } else if (i10 == 0) {
            interfaceC8721a2M49502e = m49502e();
        }
        this.f47522f.put(Integer.valueOf(i10), interfaceC8721a2M49502e);
        return interfaceC8721a2M49502e;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC8721a2 m49500c(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f47521e, i10);
        } catch (RuntimeException e10) {
            C5931r1.m26573m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i10, e10);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return C9617a.m37955a(camcorderProfile);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC8721a2 m49501d() {
        Iterator<Integer> it = InterfaceC8855z1.f32241b.iterator();
        while (it.hasNext()) {
            InterfaceC8721a2 interfaceC8721a2Mo27504b = mo27504b(it.next().intValue());
            if (interfaceC8721a2Mo27504b != null) {
                return interfaceC8721a2Mo27504b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC8721a2 m49502e() {
        for (int size = InterfaceC8855z1.f32241b.size() - 1; size >= 0; size--) {
            InterfaceC8721a2 interfaceC8721a2Mo27504b = mo27504b(size);
            if (interfaceC8721a2Mo27504b != null) {
                return interfaceC8721a2Mo27504b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC8721a2 m49503f(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles encoderProfilesM49505a = a.m49505a(this.f47520d, i10);
            if (encoderProfilesM49505a == null) {
                return null;
            }
            if (C1500e.m7653b(InvalidVideoProfilesQuirk.class) != null) {
                C5931r1.m26561a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return C9617a.m37956b(encoderProfilesM49505a);
                } catch (NullPointerException e10) {
                    C5931r1.m26573m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e10);
                }
            }
        }
        return m49500c(i10);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m49504g(InterfaceC8721a2 interfaceC8721a2) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f47523g.m35234b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<InterfaceC8721a2.c> listMo27490b = interfaceC8721a2.mo27490b();
        if (listMo27490b.isEmpty()) {
            return true;
        }
        return camcorderProfileResolutionQuirk.m2044g().contains(listMo27490b.get(0).m34997k());
    }
}
