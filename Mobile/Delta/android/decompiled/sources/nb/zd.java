package nb;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zd extends td {
    public zd(me meVar) {
        super(meVar);
    }

    private final String k(String str) {
        String strX = this.b.D0().x(str);
        if (TextUtils.isEmpty(strX)) {
            return (String) z4.f26194r.b(null);
        }
        Uri uri = Uri.parse((String) z4.f26194r.b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(authority).length());
        sb2.append(strX);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }

    public static final boolean l(String str) {
        String str2 = (String) z4.f26198t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final yd i(String str) {
        c6 c6VarJ0;
        me meVar = this.b;
        c6 c6VarJ1 = meVar.F0().J0(str);
        yd ydVar = null;
        if (c6VarJ1 == null || !c6VarJ1.V()) {
            return new yd(k(str), Collections.EMPTY_MAP, za.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.i7 i7VarG = com.google.android.gms.internal.measurement.p7.G();
        i7VarG.z(2);
        i7VarG.x((com.google.android.gms.internal.measurement.k7) n9.m.l(com.google.android.gms.internal.measurement.k7.a(c6VarJ1.M())));
        String strP0 = c6VarJ1.p0();
        com.google.android.gms.internal.measurement.g5 g5VarW = meVar.D0().w(str);
        if (g5VarW == null || (c6VarJ0 = meVar.F0().J0(str)) == null || ((!g5VarW.V() || g5VarW.W().H() != 100) && !this.f25625a.C().P(str, c6VarJ0.l0()) && (TextUtils.isEmpty(strP0) || Math.abs(strP0.hashCode() % 100) >= g5VarW.W().H()))) {
            i7VarG.A(3);
            return new yd(k(str), Collections.EMPTY_MAP, za.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.p7) i7VarG.t());
        }
        String strO0 = c6VarJ1.o0();
        i7VarG.z(2);
        com.google.android.gms.internal.measurement.g5 g5VarW2 = meVar.D0().w(c6VarJ1.o0());
        if (g5VarW2 == null || !g5VarW2.V()) {
            this.f25625a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", strO0);
            i7VarG.A(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(c6VarJ1.l0())) {
                map.put("x-gtm-server-preview", c6VarJ1.l0());
            }
            String strJ = g5VarW2.W().J();
            com.google.android.gms.internal.measurement.k7 k7VarA = com.google.android.gms.internal.measurement.k7.a(c6VarJ1.M());
            if (k7VarA != null && k7VarA != com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE) {
                i7VarG.x(k7VarA);
            } else if (l(c6VarJ1.o0())) {
                i7VarG.x(com.google.android.gms.internal.measurement.k7.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strJ)) {
                i7VarG.x(com.google.android.gms.internal.measurement.k7.MISSING_SGTM_SERVER_URL);
            } else {
                this.f25625a.a().w().b("[sgtm] Eligible for client side upload. appId", strO0);
                i7VarG.z(3);
                i7VarG.x(com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE);
                ydVar = new yd(strJ, map, za.SGTM_CLIENT, (com.google.android.gms.internal.measurement.p7) i7VarG.t());
            }
            g5VarW2.W().F();
            g5VarW2.W().G();
            g7 g7Var = this.f25625a;
            g7Var.c();
            if (TextUtils.isEmpty(strJ)) {
                i7VarG.A(6);
                g7Var.a().w().b("[sgtm] Local service, missing sgtm_server_url", c6VarJ1.o0());
            } else {
                g7Var.a().w().b("[sgtm] Eligible for local service direct upload. appId", strO0);
                i7VarG.z(5);
                i7VarG.A(2);
                ydVar = new yd(strJ, map, za.SGTM, (com.google.android.gms.internal.measurement.p7) i7VarG.t());
            }
        }
        return ydVar != null ? ydVar : new yd(k(str), Collections.EMPTY_MAP, za.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.p7) i7VarG.t());
    }

    public final boolean j(String str, com.google.android.gms.internal.measurement.k7 k7Var) {
        com.google.android.gms.internal.measurement.g5 g5VarW;
        h();
        return (k7Var != com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE || l(str) || (g5VarW = this.b.D0().w(str)) == null || !g5VarW.V() || g5VarW.W().J().isEmpty()) ? false : true;
    }
}
