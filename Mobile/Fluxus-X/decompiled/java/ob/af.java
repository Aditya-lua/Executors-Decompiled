package ob;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.measurement.mg;
import com.google.android.gms.internal.measurement.zf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class af extends ge {
    public af(ve veVar) {
        super(veVar);
    }

    public static final String A(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final Object B(com.google.android.gms.internal.measurement.w6 w6Var) {
        if (w6Var.H()) {
            return w6Var.I();
        }
        if (w6Var.J()) {
            return Long.valueOf(w6Var.K());
        }
        if (w6Var.N()) {
            return Double.valueOf(w6Var.O());
        }
        if (w6Var.R() > 0) {
            return Y(w6Var.P());
        }
        return null;
    }

    public static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    public static final void D(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.j7 j7Var) {
        if (j7Var == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (j7Var.I() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : j7Var.H()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (j7Var.G() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : j7Var.F()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (j7Var.K() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.q6 q6Var : j7Var.J()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(q6Var.F() ? Integer.valueOf(q6Var.G()) : null);
                sb2.append(":");
                sb2.append(q6Var.H() ? Long.valueOf(q6Var.I()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (j7Var.M() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.l7 l7Var : j7Var.L()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l7Var.F() ? Integer.valueOf(l7Var.G()) : null);
                sb2.append(": [");
                Iterator it = l7Var.H().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        y(sb2, 3);
        sb2.append("}\n");
    }

    public static final void E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void F(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.j4 j4Var) {
        String str2;
        if (j4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (j4Var.F()) {
            int iR = j4Var.R();
            if (iR == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iR == 2) {
                str2 = "LESS_THAN";
            } else if (iR != 3) {
                str2 = iR != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            E(sb2, i10, "comparison_type", str2);
        }
        if (j4Var.G()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(j4Var.H()));
        }
        if (j4Var.I()) {
            E(sb2, i10, "comparison_value", j4Var.J());
        }
        if (j4Var.K()) {
            E(sb2, i10, "min_comparison_value", j4Var.L());
        }
        if (j4Var.M()) {
            E(sb2, i10, "max_comparison_value", j4Var.N());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    public static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.rc W(com.google.android.gms.internal.measurement.rc rcVar, byte[] bArr) {
        com.google.android.gms.internal.measurement.va vaVarA = com.google.android.gms.internal.measurement.va.a();
        return vaVarA != null ? rcVar.Q(bArr, vaVarA) : rcVar.A(bArr);
    }

    public static int X(com.google.android.gms.internal.measurement.d7 d7Var, String str) {
        for (int i10 = 0; i10 < d7Var.k1(); i10++) {
            if (str.equals(d7Var.l1(i10).H())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.w6 w6Var = (com.google.android.gms.internal.measurement.w6) it.next();
            if (w6Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.w6 w6Var2 : w6Var.P()) {
                    if (w6Var2.H()) {
                        bundle.putString(w6Var2.G(), w6Var2.I());
                    } else if (w6Var2.J()) {
                        bundle.putLong(w6Var2.G(), w6Var2.K());
                    } else if (w6Var2.N()) {
                        bundle.putDouble(w6Var2.G(), w6Var2.O());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(com.google.android.gms.internal.measurement.r6 r6Var, String str, Object obj) {
        List listZ = r6Var.z();
        int i10 = 0;
        while (true) {
            if (i10 >= listZ.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.w6) listZ.get(i10)).G())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.v6 v6VarS = com.google.android.gms.internal.measurement.w6.S();
        v6VarS.B(str);
        v6VarS.G(((Long) obj).longValue());
        if (i10 >= 0) {
            r6Var.F(i10, v6VarS);
        } else {
            r6Var.H(v6VarS);
        }
    }

    public static final boolean p(i0 i0Var, hf hfVar) {
        o9.s.l(i0Var);
        o9.s.l(hfVar);
        return !TextUtils.isEmpty(hfVar.f27425g);
    }

    public static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.w6 w6Var = (com.google.android.gms.internal.measurement.w6) it.next();
            String strG = w6Var.G();
            if (w6Var.N()) {
                bundle.putDouble(strG, w6Var.O());
            } else if (w6Var.L()) {
                bundle.putFloat(strG, w6Var.M());
            } else if (w6Var.H()) {
                bundle.putString(strG, w6Var.I());
            } else if (w6Var.J()) {
                bundle.putLong(strG, w6Var.K());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.w6 r(com.google.android.gms.internal.measurement.s6 s6Var, String str) {
        for (com.google.android.gms.internal.measurement.w6 w6Var : s6Var.F()) {
            if (w6Var.G().equals(str)) {
                return w6Var;
            }
        }
        return null;
    }

    public static final Map s(com.google.android.gms.internal.measurement.s6 s6Var, String... strArr) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.w6 w6Var : s6Var.F()) {
            if (Arrays.asList(strArr).contains(w6Var.G()) && (objB = B(w6Var)) != null) {
                map.put(w6Var.G(), objB);
            }
        }
        return map;
    }

    public static final Map t(com.google.android.gms.internal.measurement.s6 s6Var, String str) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.w6 w6Var : s6Var.F()) {
            if (w6Var.G().startsWith("gad_") && (objB = B(w6Var)) != null) {
                map.put(w6Var.G(), objB);
            }
        }
        return map;
    }

    public static final Object u(com.google.android.gms.internal.measurement.s6 s6Var, String str) {
        com.google.android.gms.internal.measurement.w6 w6VarR = r(s6Var, str);
        if (w6VarR == null) {
            return null;
        }
        return B(w6VarR);
    }

    public static final Object v(com.google.android.gms.internal.measurement.s6 s6Var, String str, Object obj) {
        Object objU = u(s6Var, str);
        return objU == null ? obj : objU;
    }

    public static final void y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void G(com.google.android.gms.internal.measurement.u7 u7Var, Object obj) {
        o9.s.l(obj);
        u7Var.D();
        u7Var.G();
        u7Var.J();
        if (obj instanceof String) {
            u7Var.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            u7Var.F(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            u7Var.H(((Double) obj).doubleValue());
        } else {
            this.f27641a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void H(com.google.android.gms.internal.measurement.v6 v6Var, Object obj) {
        o9.s.l(obj);
        v6Var.F();
        v6Var.H();
        v6Var.M();
        v6Var.S();
        if (obj instanceof String) {
            v6Var.D((String) obj);
            return;
        }
        if (obj instanceof Long) {
            v6Var.G(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            v6Var.J(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f27641a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.v6 v6VarS = com.google.android.gms.internal.measurement.w6.S();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.v6 v6VarS2 = com.google.android.gms.internal.measurement.w6.S();
                    v6VarS2.B(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        v6VarS2.G(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        v6VarS2.D((String) obj2);
                    } else if (obj2 instanceof Double) {
                        v6VarS2.J(((Double) obj2).doubleValue());
                    }
                    v6VarS.P(v6VarS2);
                }
                if (v6VarS.O() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.w6) v6VarS.v());
                }
            }
        }
        v6Var.R(arrayList);
    }

    @TargetApi(BacktraceMetrics.defaultTimeIntervalInMin)
    public final vd I(String str, com.google.android.gms.internal.measurement.d7 d7Var, com.google.android.gms.internal.measurement.r6 r6Var, String str2) {
        int iIndexOf;
        zf.a();
        l7 l7Var = this.f27641a;
        if (!l7Var.w().H(str, e5.Q0)) {
            return null;
        }
        long jA = l7Var.e().a();
        Set setA = ze.a(l7Var.w().C(str, e5.f27278v0).split(","));
        ve veVar = this.b;
        ie ieVarC0 = veVar.C0();
        String strX = ieVarC0.b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        l7 l7Var2 = ieVarC0.f27641a;
        builder.scheme(l7Var2.w().C(str, e5.f27264o0));
        if (TextUtils.isEmpty(strX)) {
            builder.authority(l7Var2.w().C(str, e5.f27266p0));
        } else {
            String strC = l7Var2.w().C(str, e5.f27266p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(strC).length());
            sb2.append(strX);
            sb2.append(".");
            sb2.append(strC);
            builder.authority(sb2.toString());
        }
        builder.path(l7Var2.w().C(str, e5.f27268q0));
        z(builder, "gmp_app_id", d7Var.C0(), setA);
        l7Var.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), setA);
        String strD0 = d7Var.d0();
        m mVarW = l7Var.w();
        d5 d5Var = e5.T0;
        if (mVarW.H(str, d5Var) && veVar.D0().N(str)) {
            strD0 = BuildConfig.FLAVOR;
        }
        z(builder, "app_instance_id", strD0, setA);
        z(builder, "rdid", d7Var.W(), setA);
        z(builder, "bundle_id", d7Var.P(), setA);
        String strP = r6Var.P();
        String strA = w8.a(strP);
        if (true != TextUtils.isEmpty(strA)) {
            strP = strA;
        }
        z(builder, "app_event_name", strP, setA);
        z(builder, "app_version", String.valueOf(d7Var.I0()), setA);
        String strD = d7Var.D();
        if (l7Var.w().H(str, d5Var) && veVar.D0().K(str) && !TextUtils.isEmpty(strD) && (iIndexOf = strD.indexOf(".")) != -1) {
            strD = strD.substring(0, iIndexOf);
        }
        z(builder, "os_version", strD, setA);
        z(builder, "timestamp", String.valueOf(r6Var.U()), setA);
        if (d7Var.Z()) {
            z(builder, "lat", "1", setA);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(d7Var.p0()), setA);
        z(builder, "trigger_uri_source", "1", setA);
        z(builder, "trigger_uri_timestamp", String.valueOf(jA), setA);
        z(builder, "request_uuid", str2, setA);
        List<com.google.android.gms.internal.measurement.w6> listZ = r6Var.z();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.w6 w6Var : listZ) {
            String strG = w6Var.G();
            if (w6Var.N()) {
                bundle.putString(strG, String.valueOf(w6Var.O()));
            } else if (w6Var.L()) {
                bundle.putString(strG, String.valueOf(w6Var.M()));
            } else if (w6Var.H()) {
                bundle.putString(strG, w6Var.I());
            } else if (w6Var.J()) {
                bundle.putString(strG, String.valueOf(w6Var.K()));
            }
        }
        C(builder, l7Var.w().C(str, e5.f27276u0).split("\\|"), bundle, setA);
        List<com.google.android.gms.internal.measurement.v7> listJ1 = d7Var.j1();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.v7 v7Var : listJ1) {
            String strH = v7Var.H();
            if (v7Var.O()) {
                bundle2.putString(strH, String.valueOf(v7Var.P()));
            } else if (v7Var.M()) {
                bundle2.putString(strH, String.valueOf(v7Var.N()));
            } else if (v7Var.I()) {
                bundle2.putString(strH, v7Var.J());
            } else if (v7Var.K()) {
                bundle2.putString(strH, String.valueOf(v7Var.L()));
            }
        }
        C(builder, l7Var.w().C(str, e5.f27274t0).split("\\|"), bundle2, setA);
        z(builder, "dma", true != d7Var.l0() ? "0" : "1", setA);
        if (!d7Var.n0().isEmpty()) {
            z(builder, "dma_cps", d7Var.n0(), setA);
        }
        if (d7Var.t0()) {
            com.google.android.gms.internal.measurement.a6 a6VarU0 = d7Var.u0();
            if (!a6VarU0.R().isEmpty()) {
                z(builder, "dl_gclid", a6VarU0.R(), setA);
            }
            if (!a6VarU0.U().isEmpty()) {
                z(builder, "dl_gbraid", a6VarU0.U(), setA);
            }
            if (!a6VarU0.W().isEmpty()) {
                z(builder, "dl_gs", a6VarU0.W(), setA);
            }
            if (a6VarU0.Y() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(a6VarU0.Y()), setA);
            }
            if (!a6VarU0.a0().isEmpty()) {
                z(builder, "mr_gclid", a6VarU0.a0(), setA);
            }
            if (!a6VarU0.c0().isEmpty()) {
                z(builder, "mr_gbraid", a6VarU0.c0(), setA);
            }
            if (!a6VarU0.e0().isEmpty()) {
                z(builder, "mr_gs", a6VarU0.e0(), setA);
            }
            if (a6VarU0.g0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(a6VarU0.g0()), setA);
            }
        }
        return new vd(builder.build().toString(), jA, 1);
    }

    public final com.google.android.gms.internal.measurement.s6 J(d0 d0Var) {
        com.google.android.gms.internal.measurement.r6 r6VarP = com.google.android.gms.internal.measurement.s6.P();
        r6VarP.X(d0Var.f27176e);
        g0 g0Var = d0Var.f27177f;
        f0 f0Var = new f0(g0Var);
        while (f0Var.hasNext()) {
            String next = f0Var.next();
            com.google.android.gms.internal.measurement.v6 v6VarS = com.google.android.gms.internal.measurement.w6.S();
            v6VarS.B(next);
            Object objA = g0Var.a(next);
            o9.s.l(objA);
            H(v6VarS, objA);
            r6VarP.H(v6VarS);
        }
        String str = d0Var.f27174c;
        if (!TextUtils.isEmpty(str) && g0Var.a("_o") == null) {
            com.google.android.gms.internal.measurement.v6 v6VarS2 = com.google.android.gms.internal.measurement.w6.S();
            v6VarS2.B("_o");
            v6VarS2.D(str);
            r6VarP.G((com.google.android.gms.internal.measurement.w6) v6VarS2.v());
        }
        return (com.google.android.gms.internal.measurement.s6) r6VarP.v();
    }

    public final String K(com.google.android.gms.internal.measurement.c7 c7Var) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.e6 e6VarB1;
        if (c7Var == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (c7Var.K()) {
            E(sb2, 0, "upload_subdomain", c7Var.L());
        }
        if (c7Var.I()) {
            E(sb2, 0, "sgtm_join_id", c7Var.J());
        }
        for (com.google.android.gms.internal.measurement.e7 e7Var : c7Var.F()) {
            if (e7Var != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (e7Var.h0()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(e7Var.i1()));
                }
                mg.a();
                l7 l7Var = this.f27641a;
                if (l7Var.w().H(e7Var.F(), e5.N0) && e7Var.O0()) {
                    E(sb2, 1, "session_stitching_token", e7Var.P0());
                }
                E(sb2, 1, "platform", e7Var.C2());
                if (e7Var.H()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(e7Var.I()));
                }
                if (e7Var.J()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(e7Var.K()));
                }
                if (e7Var.K0()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(e7Var.L0()));
                }
                if (e7Var.d0()) {
                    E(sb2, 1, "config_version", Long.valueOf(e7Var.e0()));
                }
                E(sb2, 1, "gmp_app_id", e7Var.W());
                E(sb2, 1, "app_id", e7Var.F());
                E(sb2, 1, "app_version", e7Var.G());
                if (e7Var.b0()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(e7Var.c0()));
                }
                E(sb2, 1, "firebase_instance_id", e7Var.a0());
                if (e7Var.P()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(e7Var.R()));
                }
                E(sb2, 1, "app_store", e7Var.I2());
                if (e7Var.s2()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(e7Var.t2()));
                }
                if (e7Var.u2()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(e7Var.v2()));
                }
                if (e7Var.w2()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(e7Var.x2()));
                }
                if (e7Var.y2()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(e7Var.z2()));
                }
                if (e7Var.A2()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(e7Var.B2()));
                }
                E(sb2, 1, "app_instance_id", e7Var.O());
                E(sb2, 1, "resettable_device_id", e7Var.L());
                E(sb2, 1, "ds_id", e7Var.g0());
                if (e7Var.M()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(e7Var.N()));
                }
                E(sb2, 1, "os_version", e7Var.D2());
                E(sb2, 1, Payload.DEVICE_MODEL, e7Var.E2());
                E(sb2, 1, "user_default_language", e7Var.F2());
                if (e7Var.G2()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(e7Var.H2()));
                }
                if (e7Var.S()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(e7Var.U()));
                }
                if (e7Var.c1()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(e7Var.d1()));
                }
                if (e7Var.X()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(e7Var.Y()));
                }
                E(sb2, 1, "health_monitor", e7Var.V());
                if (e7Var.I0()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(e7Var.J0()));
                }
                if (e7Var.M0()) {
                    E(sb2, 1, "consent_signals", e7Var.N0());
                }
                if (e7Var.V0()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(e7Var.W0()));
                }
                if (e7Var.X0()) {
                    E(sb2, 1, "core_platform_services", e7Var.Y0());
                }
                if (e7Var.T0()) {
                    E(sb2, 1, "consent_diagnostics", e7Var.U0());
                }
                if (e7Var.Q0()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(e7Var.R0()));
                }
                zf.a();
                if (l7Var.w().H(e7Var.F(), e5.Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(e7Var.Z0()));
                    if (e7Var.a1() && (e6VarB1 = e7Var.b1()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(e6VarB1.F()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(e6VarB1.G()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(e6VarB1.H()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(e6VarB1.I()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(e6VarB1.J()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(e6VarB1.K()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(e6VarB1.L()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (e7Var.e1()) {
                    com.google.android.gms.internal.measurement.a6 a6VarF1 = e7Var.f1();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (a6VarF1.P()) {
                        E(sb2, 2, "deep_link_gclid", a6VarF1.R());
                    }
                    if (a6VarF1.S()) {
                        E(sb2, 2, "deep_link_gbraid", a6VarF1.U());
                    }
                    if (a6VarF1.V()) {
                        E(sb2, 2, "deep_link_gad_source", a6VarF1.W());
                    }
                    if (a6VarF1.X()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(a6VarF1.Y()));
                    }
                    if (a6VarF1.Z()) {
                        E(sb2, 2, "market_referrer_gclid", a6VarF1.a0());
                    }
                    if (a6VarF1.b0()) {
                        E(sb2, 2, "market_referrer_gbraid", a6VarF1.c0());
                    }
                    if (a6VarF1.d0()) {
                        E(sb2, 2, "market_referrer_gad_source", a6VarF1.e0());
                    }
                    if (a6VarF1.f0()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(a6VarF1.g0()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (e7Var.i0()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(e7Var.j0()));
                }
                if (e7Var.g1()) {
                    com.google.android.gms.internal.measurement.t7 t7VarH1 = e7Var.h1();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int iK = t7VarH1.K();
                    if (iK == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iK == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iK != 3) {
                        str2 = iK != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    E(sb2, 2, "upload_type", str2);
                    E(sb2, 2, "client_upload_eligibility", t7VarH1.F().name());
                    int iL = t7VarH1.L();
                    if (iL == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iL == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iL == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iL != 4) {
                        str3 = iL != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    E(sb2, 2, "service_upload_eligibility", str3);
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (e7Var.k0()) {
                    com.google.android.gms.internal.measurement.o6 o6VarL0 = e7Var.l0();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.l6 l6Var : o6VarL0.F()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iH = l6Var.H();
                        if (iH == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iH == 2) {
                            str = "AD_STORAGE";
                        } else if (iH != 3) {
                            str = iH != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        E(sb2, 3, Payload.TYPE, str);
                        int I = l6Var.I();
                        E(sb2, 3, "mode", I != 1 ? I != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.v7> listP2 = e7Var.p2();
                if (listP2 != null) {
                    for (com.google.android.gms.internal.measurement.v7 v7Var : listP2) {
                        if (v7Var != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", v7Var.F() ? Long.valueOf(v7Var.G()) : null);
                            E(sb2, 2, "name", l7Var.D().c(v7Var.H()));
                            E(sb2, 2, "string_value", v7Var.J());
                            E(sb2, 2, "int_value", v7Var.K() ? Long.valueOf(v7Var.L()) : null);
                            E(sb2, 2, "double_value", v7Var.O() ? Double.valueOf(v7Var.P()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.g6> listZ = e7Var.Z();
                if (listZ != null) {
                    for (com.google.android.gms.internal.measurement.g6 g6Var : listZ) {
                        if (g6Var != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (g6Var.F()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(g6Var.G()));
                            }
                            if (g6Var.K()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(g6Var.L()));
                            }
                            D(sb2, 2, "current_data", g6Var.H());
                            if (g6Var.I()) {
                                D(sb2, 2, "previous_data", g6Var.J());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.s6> listJ2 = e7Var.j2();
                if (listJ2 != null) {
                    for (com.google.android.gms.internal.measurement.s6 s6Var : listJ2) {
                        if (s6Var != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", l7Var.D().a(s6Var.I()));
                            if (s6Var.J()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(s6Var.K()));
                            }
                            if (s6Var.L()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(s6Var.M()));
                            }
                            if (s6Var.N()) {
                                E(sb2, 2, "count", Integer.valueOf(s6Var.O()));
                            }
                            if (s6Var.G() != 0) {
                                w(sb2, 2, s6Var.F());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    public final String L(com.google.android.gms.internal.measurement.d4 d4Var) {
        if (d4Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (d4Var.F()) {
            E(sb2, 0, "filter_id", Integer.valueOf(d4Var.G()));
        }
        E(sb2, 0, "event_name", this.f27641a.D().a(d4Var.H()));
        String strA = A(d4Var.N(), d4Var.O(), d4Var.R());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        if (d4Var.L()) {
            F(sb2, 1, "event_count_filter", d4Var.M());
        }
        if (d4Var.J() > 0) {
            sb2.append("  filters {\n");
            Iterator it = d4Var.I().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (com.google.android.gms.internal.measurement.f4) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    public final String M(com.google.android.gms.internal.measurement.l4 l4Var) {
        if (l4Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (l4Var.F()) {
            E(sb2, 0, "filter_id", Integer.valueOf(l4Var.G()));
        }
        E(sb2, 0, "property_name", this.f27641a.D().c(l4Var.H()));
        String strA = A(l4Var.J(), l4Var.K(), l4Var.M());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        x(sb2, 1, l4Var.I());
        sb2.append("}\n");
        return sb2.toString();
    }

    public final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (p9.b.a unused) {
            this.f27641a.a().o().a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f27641a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f27641a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final boolean S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f27641a.e().a() - j10) > j11;
    }

    public final long T(byte[] bArr) {
        o9.s.l(bArr);
        l7 l7Var = this.f27641a;
        l7Var.C().h();
        MessageDigest messageDigestC = ff.C();
        if (messageDigestC != null) {
            return ff.D(messageDigestC.digest(bArr));
        }
        l7Var.a().o().a("Failed to get MD5");
        return 0L;
    }

    public final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    public final byte[] V(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f27641a.a().o().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final Map Z(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Z((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // ob.ge
    public final boolean l() {
        return false;
    }

    public final i0 m(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleN = n(bVar.f(), true);
        String string = (!bundleN.containsKey("_o") || (obj = bundleN.get("_o")) == null) ? Payload.TYPE_APP : obj.toString();
        String strB = w8.b(bVar.b());
        if (strB == null) {
            strB = bVar.b();
        }
        return new i0(strB, new g0(bundleN), string, bVar.a());
    }

    public final Bundle n(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final void w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.w6 w6Var = (com.google.android.gms.internal.measurement.w6) it.next();
            if (w6Var != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", w6Var.F() ? this.f27641a.D().b(w6Var.G()) : null);
                E(sb2, i11, "string_value", w6Var.H() ? w6Var.I() : null);
                E(sb2, i11, "int_value", w6Var.J() ? Long.valueOf(w6Var.K()) : null);
                E(sb2, i11, "double_value", w6Var.N() ? Double.valueOf(w6Var.O()) : null);
                if (w6Var.R() > 0) {
                    w(sb2, i11, w6Var.P());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void x(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.f4 f4Var) {
        String str;
        if (f4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (f4Var.J()) {
            E(sb2, i10, "complement", Boolean.valueOf(f4Var.K()));
        }
        if (f4Var.L()) {
            E(sb2, i10, "param_name", this.f27641a.D().b(f4Var.M()));
        }
        if (f4Var.F()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.p4 p4VarG = f4Var.G();
            if (p4VarG != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (p4VarG.F()) {
                    switch (p4VarG.O()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb2, i11, "match_type", str);
                }
                if (p4VarG.G()) {
                    E(sb2, i11, "expression", p4VarG.H());
                }
                if (p4VarG.I()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(p4VarG.J()));
                }
                if (p4VarG.L() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : p4VarG.K()) {
                        y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (f4Var.H()) {
            F(sb2, i10 + 1, "number_filter", f4Var.I());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }
}
