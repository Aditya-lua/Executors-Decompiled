package ob;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ie extends zd {
    public ie(ve veVar) {
        super(veVar);
    }

    private final String k(String str) {
        String strX = this.b.D0().x(str);
        if (TextUtils.isEmpty(strX)) {
            return (String) e5.f27269r.b(null);
        }
        Uri uri = Uri.parse((String) e5.f27269r.b(null));
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
        String str2 = (String) e5.f27273t.b(null);
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

    public final he i(String str) {
        h6 h6VarJ0;
        ve veVar = this.b;
        h6 h6VarJ1 = veVar.F0().J0(str);
        he heVar = null;
        if (h6VarJ1 == null || !h6VarJ1.V()) {
            return new he(k(str), Collections.EMPTY_MAP, eb.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.m7 m7VarG = com.google.android.gms.internal.measurement.t7.G();
        m7VarG.B(2);
        m7VarG.z((com.google.android.gms.internal.measurement.o7) o9.s.l(com.google.android.gms.internal.measurement.o7.a(h6VarJ1.M())));
        String strP0 = h6VarJ1.p0();
        com.google.android.gms.internal.measurement.k5 k5VarW = veVar.D0().w(str);
        if (k5VarW == null || (h6VarJ0 = veVar.F0().J0(str)) == null || ((!k5VarW.V() || k5VarW.W().H() != 100) && !this.f27641a.C().P(str, h6VarJ0.l0()) && (TextUtils.isEmpty(strP0) || Math.abs(strP0.hashCode() % 100) >= k5VarW.W().H()))) {
            m7VarG.C(3);
            return new he(k(str), Collections.EMPTY_MAP, eb.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.t7) m7VarG.v());
        }
        String strO0 = h6VarJ1.o0();
        m7VarG.B(2);
        com.google.android.gms.internal.measurement.k5 k5VarW2 = veVar.D0().w(h6VarJ1.o0());
        if (k5VarW2 == null || !k5VarW2.V()) {
            this.f27641a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", strO0);
            m7VarG.C(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(h6VarJ1.l0())) {
                map.put("x-gtm-server-preview", h6VarJ1.l0());
            }
            String strI = k5VarW2.W().I();
            com.google.android.gms.internal.measurement.o7 o7VarA = com.google.android.gms.internal.measurement.o7.a(h6VarJ1.M());
            if (o7VarA != null && o7VarA != com.google.android.gms.internal.measurement.o7.CLIENT_UPLOAD_ELIGIBLE) {
                m7VarG.z(o7VarA);
            } else if (l(h6VarJ1.o0())) {
                m7VarG.z(com.google.android.gms.internal.measurement.o7.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strI)) {
                m7VarG.z(com.google.android.gms.internal.measurement.o7.MISSING_SGTM_SERVER_URL);
            } else {
                this.f27641a.a().w().b("[sgtm] Eligible for client side upload. appId", strO0);
                m7VarG.B(3);
                m7VarG.z(com.google.android.gms.internal.measurement.o7.CLIENT_UPLOAD_ELIGIBLE);
                heVar = new he(strI, map, eb.SGTM_CLIENT, (com.google.android.gms.internal.measurement.t7) m7VarG.v());
            }
            k5VarW2.W().F();
            k5VarW2.W().G();
            l7 l7Var = this.f27641a;
            l7Var.c();
            if (TextUtils.isEmpty(strI)) {
                m7VarG.C(6);
                l7Var.a().w().b("[sgtm] Local service, missing sgtm_server_url", h6VarJ1.o0());
            } else {
                l7Var.a().w().b("[sgtm] Eligible for local service direct upload. appId", strO0);
                m7VarG.B(5);
                m7VarG.C(2);
                heVar = new he(strI, map, eb.SGTM, (com.google.android.gms.internal.measurement.t7) m7VarG.v());
            }
        }
        return heVar != null ? heVar : new he(k(str), Collections.EMPTY_MAP, eb.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.t7) m7VarG.v());
    }

    public final boolean j(String str, com.google.android.gms.internal.measurement.o7 o7Var) {
        com.google.android.gms.internal.measurement.k5 k5VarW;
        h();
        return (o7Var != com.google.android.gms.internal.measurement.o7.CLIENT_UPLOAD_ELIGIBLE || l(str) || (k5VarW = this.b.D0().w(str)) == null || !k5VarW.V() || k5VarW.W().I().isEmpty()) ? false : true;
    }
}
