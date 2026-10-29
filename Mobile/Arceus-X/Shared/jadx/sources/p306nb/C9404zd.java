package p306nb;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2080g5;
import com.google.android.gms.internal.measurement.C2120i7;
import com.google.android.gms.internal.measurement.C2245p7;
import com.google.android.gms.internal.measurement.EnumC2155k7;
import java.util.Collections;
import java.util.HashMap;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.zd */
/* JADX INFO: loaded from: classes.dex */
public final class C9404zd extends C9308td {
    public C9404zd(C9197me c9197me) {
        super(c9197me);
    }

    /* JADX INFO: renamed from: k */
    private final String m37095k(String str) {
        String strM37060x = this.f33516b.m36504D0().m37060x(str);
        if (TextUtils.isEmpty(strM37060x)) {
            return (String) C9395z4.f33803r.m37079b(null);
        }
        Uri uri = Uri.parse((String) C9395z4.f33803r.m37079b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strM37060x).length() + 1 + String.valueOf(authority).length());
        sb2.append(strM37060x);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m37096l(String str) {
        String str2 = (String) C9395z4.f33807t.m37079b(null);
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

    /* JADX INFO: renamed from: i */
    public final C9388yd m37097i(String str) {
        C9026c6 c9026c6M36809J0;
        C9197me c9197me = this.f33516b;
        C9026c6 c9026c6M36809J1 = c9197me.m36507F0().m36809J0(str);
        C9388yd c9388yd = null;
        if (c9026c6M36809J1 == null || !c9026c6M36809J1.m36193V()) {
            return new C9388yd(m37095k(str), Collections.EMPTY_MAP, EnumC9401za.GOOGLE_ANALYTICS, null);
        }
        C2120i7 c2120i7M10520G = C2245p7.m10520G();
        c2120i7M10520G.m10283z(2);
        c2120i7M10520G.m10282x((EnumC2155k7) C8953m.m36047l(EnumC2155k7.m10317a(c9026c6M36809J1.m36184M())));
        String strM36229p0 = c9026c6M36809J1.m36229p0();
        C2080g5 c2080g5M37059w = c9197me.m36504D0().m37059w(str);
        if (c2080g5M37059w == null || (c9026c6M36809J0 = c9197me.m36507F0().m36809J0(str)) == null || ((!c2080g5M37059w.m10036V() || c2080g5M37059w.m10037W().m10560H() != 100) && !this.f33067a.m36308C().m36947P(str, c9026c6M36809J0.m36221l0()) && (TextUtils.isEmpty(strM36229p0) || Math.abs(strM36229p0.hashCode() % 100) >= c2080g5M37059w.m10037W().m10560H()))) {
            c2120i7M10520G.m10281A(3);
            return new C9388yd(m37095k(str), Collections.EMPTY_MAP, EnumC9401za.GOOGLE_ANALYTICS, (C2245p7) c2120i7M10520G.m9882t());
        }
        String strM36227o0 = c9026c6M36809J1.m36227o0();
        c2120i7M10520G.m10283z(2);
        C2080g5 c2080g5M37059w2 = c9197me.m36504D0().m37059w(c9026c6M36809J1.m36227o0());
        if (c2080g5M37059w2 == null || !c2080g5M37059w2.m10036V()) {
            this.f33067a.mo36321a().m37011w().m36912b("[sgtm] Missing sgtm_setting in remote config. appId", strM36227o0);
            c2120i7M10520G.m10281A(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(c9026c6M36809J1.m36221l0())) {
                map.put("x-gtm-server-preview", c9026c6M36809J1.m36221l0());
            }
            String strM10561J = c2080g5M37059w2.m10037W().m10561J();
            EnumC2155k7 enumC2155k7M10317a = EnumC2155k7.m10317a(c9026c6M36809J1.m36184M());
            if (enumC2155k7M10317a != null && enumC2155k7M10317a != EnumC2155k7.CLIENT_UPLOAD_ELIGIBLE) {
                c2120i7M10520G.m10282x(enumC2155k7M10317a);
            } else if (m37096l(c9026c6M36809J1.m36227o0())) {
                c2120i7M10520G.m10282x(EnumC2155k7.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strM10561J)) {
                c2120i7M10520G.m10282x(EnumC2155k7.MISSING_SGTM_SERVER_URL);
            } else {
                this.f33067a.mo36321a().m37011w().m36912b("[sgtm] Eligible for client side upload. appId", strM36227o0);
                c2120i7M10520G.m10283z(3);
                c2120i7M10520G.m10282x(EnumC2155k7.CLIENT_UPLOAD_ELIGIBLE);
                c9388yd = new C9388yd(strM10561J, map, EnumC9401za.SGTM_CLIENT, (C2245p7) c2120i7M10520G.m9882t());
            }
            c2080g5M37059w2.m10037W().m10558F();
            c2080g5M37059w2.m10037W().m10559G();
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.mo36323c();
            if (TextUtils.isEmpty(strM10561J)) {
                c2120i7M10520G.m10281A(6);
                c9094g7.mo36321a().m37011w().m36912b("[sgtm] Local service, missing sgtm_server_url", c9026c6M36809J1.m36227o0());
            } else {
                c9094g7.mo36321a().m37011w().m36912b("[sgtm] Eligible for local service direct upload. appId", strM36227o0);
                c2120i7M10520G.m10283z(5);
                c2120i7M10520G.m10281A(2);
                c9388yd = new C9388yd(strM10561J, map, EnumC9401za.SGTM, (C2245p7) c2120i7M10520G.m9882t());
            }
        }
        return c9388yd != null ? c9388yd : new C9388yd(m37095k(str), Collections.EMPTY_MAP, EnumC9401za.GOOGLE_ANALYTICS, (C2245p7) c2120i7M10520G.m9882t());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37098j(String str, EnumC2155k7 enumC2155k7) {
        C2080g5 c2080g5M37059w;
        mo36088h();
        return (enumC2155k7 != EnumC2155k7.CLIENT_UPLOAD_ELIGIBLE || m37096l(str) || (c2080g5M37059w = this.f33516b.m36504D0().m37059w(str)) == null || !c2080g5M37059w.m10036V() || c2080g5M37059w.m10037W().m10561J().isEmpty()) ? false : true;
    }
}
