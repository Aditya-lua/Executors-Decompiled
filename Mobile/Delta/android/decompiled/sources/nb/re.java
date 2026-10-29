package nb;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.ig;
import com.google.android.gms.internal.measurement.vf;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzr;
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
public final class re extends xd {
    public re(me meVar) {
        super(meVar);
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

    public static final Object B(com.google.android.gms.internal.measurement.s6 s6Var) {
        if (s6Var.H()) {
            return s6Var.J();
        }
        if (s6Var.K()) {
            return Long.valueOf(s6Var.L());
        }
        if (s6Var.P()) {
            return Double.valueOf(s6Var.Q());
        }
        if (s6Var.S() > 0) {
            return Y(s6Var.R());
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

    public static final void D(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.f7 f7Var) {
        if (f7Var == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (f7Var.J() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : f7Var.H()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (f7Var.G() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : f7Var.F()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (f7Var.L() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.m6 m6Var : f7Var.K()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(m6Var.F() ? Integer.valueOf(m6Var.G()) : null);
                sb2.append(":");
                sb2.append(m6Var.H() ? Long.valueOf(m6Var.J()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (f7Var.O() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.h7 h7Var : f7Var.N()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(h7Var.F() ? Integer.valueOf(h7Var.G()) : null);
                sb2.append(": [");
                Iterator it = h7Var.H().iterator();
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

    public static final void F(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.f4 f4Var) {
        String str2;
        if (f4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (f4Var.F()) {
            int iS = f4Var.S();
            if (iS == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iS == 2) {
                str2 = "LESS_THAN";
            } else if (iS != 3) {
                str2 = iS != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            E(sb2, i10, "comparison_type", str2);
        }
        if (f4Var.G()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(f4Var.H()));
        }
        if (f4Var.J()) {
            E(sb2, i10, "comparison_value", f4Var.K());
        }
        if (f4Var.L()) {
            E(sb2, i10, "min_comparison_value", f4Var.N());
        }
        if (f4Var.O()) {
            E(sb2, i10, "max_comparison_value", f4Var.P());
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

    public static com.google.android.gms.internal.measurement.nc W(com.google.android.gms.internal.measurement.nc ncVar, byte[] bArr) {
        com.google.android.gms.internal.measurement.ra raVarA = com.google.android.gms.internal.measurement.ra.a();
        return raVarA != null ? ncVar.I(bArr, raVarA) : ncVar.m(bArr);
    }

    public static int X(com.google.android.gms.internal.measurement.z6 z6Var, String str) {
        for (int i10 = 0; i10 < z6Var.g1(); i10++) {
            if (str.equals(z6Var.h1(i10).H())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) it.next();
            if (s6Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.s6 s6Var2 : s6Var.R()) {
                    if (s6Var2.H()) {
                        bundle.putString(s6Var2.G(), s6Var2.J());
                    } else if (s6Var2.K()) {
                        bundle.putLong(s6Var2.G(), s6Var2.L());
                    } else if (s6Var2.P()) {
                        bundle.putDouble(s6Var2.G(), s6Var2.Q());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(com.google.android.gms.internal.measurement.n6 n6Var, String str, Object obj) {
        List listX = n6Var.x();
        int i10 = 0;
        while (true) {
            if (i10 >= listX.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.s6) listX.get(i10)).G())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.r6 r6VarT = com.google.android.gms.internal.measurement.s6.T();
        r6VarT.z(str);
        r6VarT.E(((Long) obj).longValue());
        if (i10 >= 0) {
            n6Var.D(i10, r6VarT);
        } else {
            n6Var.G(r6VarT);
        }
    }

    public static final boolean p(zzbg zzbgVar, zzr zzrVar) {
        n9.m.l(zzbgVar);
        n9.m.l(zzrVar);
        return !TextUtils.isEmpty(zzrVar.f7446g);
    }

    public static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) it.next();
            String strG = s6Var.G();
            if (s6Var.P()) {
                bundle.putDouble(strG, s6Var.Q());
            } else if (s6Var.N()) {
                bundle.putFloat(strG, s6Var.O());
            } else if (s6Var.H()) {
                bundle.putString(strG, s6Var.J());
            } else if (s6Var.K()) {
                bundle.putLong(strG, s6Var.L());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.s6 r(com.google.android.gms.internal.measurement.o6 o6Var, String str) {
        for (com.google.android.gms.internal.measurement.s6 s6Var : o6Var.F()) {
            if (s6Var.G().equals(str)) {
                return s6Var;
            }
        }
        return null;
    }

    public static final Map s(com.google.android.gms.internal.measurement.o6 o6Var, String... strArr) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.s6 s6Var : o6Var.F()) {
            if (Arrays.asList(strArr).contains(s6Var.G()) && (objB = B(s6Var)) != null) {
                map.put(s6Var.G(), objB);
            }
        }
        return map;
    }

    public static final Map t(com.google.android.gms.internal.measurement.o6 o6Var, String str) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.s6 s6Var : o6Var.F()) {
            if (s6Var.G().startsWith("gad_") && (objB = B(s6Var)) != null) {
                map.put(s6Var.G(), objB);
            }
        }
        return map;
    }

    public static final Object u(com.google.android.gms.internal.measurement.o6 o6Var, String str) {
        com.google.android.gms.internal.measurement.s6 s6VarR = r(o6Var, str);
        if (s6VarR == null) {
            return null;
        }
        return B(s6VarR);
    }

    public static final Object v(com.google.android.gms.internal.measurement.o6 o6Var, String str, Object obj) {
        Object objU = u(o6Var, str);
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

    public final void G(com.google.android.gms.internal.measurement.q7 q7Var, Object obj) {
        n9.m.l(obj);
        q7Var.C();
        q7Var.E();
        q7Var.J();
        if (obj instanceof String) {
            q7Var.A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            q7Var.D(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            q7Var.G(((Double) obj).doubleValue());
        } else {
            this.f25625a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void H(com.google.android.gms.internal.measurement.r6 r6Var, Object obj) {
        n9.m.l(obj);
        r6Var.D();
        r6Var.G();
        r6Var.K();
        r6Var.Q();
        if (obj instanceof String) {
            r6Var.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            r6Var.E(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            r6Var.J(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f25625a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.r6 r6VarT = com.google.android.gms.internal.measurement.s6.T();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.r6 r6VarT2 = com.google.android.gms.internal.measurement.s6.T();
                    r6VarT2.z(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        r6VarT2.E(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        r6VarT2.C((String) obj2);
                    } else if (obj2 instanceof Double) {
                        r6VarT2.J(((Double) obj2).doubleValue());
                    }
                    r6VarT.O(r6VarT2);
                }
                if (r6VarT.N() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.s6) r6VarT.t());
                }
            }
        }
        r6Var.P(arrayList);
    }

    @TargetApi(30)
    public final zzoh I(String str, com.google.android.gms.internal.measurement.z6 z6Var, com.google.android.gms.internal.measurement.n6 n6Var, String str2) {
        int iIndexOf;
        vf.a();
        g7 g7Var = this.f25625a;
        if (!g7Var.w().H(str, z4.Q0)) {
            return null;
        }
        long jA = g7Var.e().a();
        Set setA = qe.a(g7Var.w().C(str, z4.f26203v0).split(","));
        me meVar = this.b;
        zd zdVarC0 = meVar.C0();
        String strX = zdVarC0.b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        g7 g7Var2 = zdVarC0.f25625a;
        builder.scheme(g7Var2.w().C(str, z4.f26189o0));
        if (TextUtils.isEmpty(strX)) {
            builder.authority(g7Var2.w().C(str, z4.f26191p0));
        } else {
            String strC = g7Var2.w().C(str, z4.f26191p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(strC).length());
            sb2.append(strX);
            sb2.append(".");
            sb2.append(strC);
            builder.authority(sb2.toString());
        }
        builder.path(g7Var2.w().C(str, z4.f26193q0));
        z(builder, "gmp_app_id", z6Var.y0(), setA);
        g7Var.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), setA);
        String strZ = z6Var.Z();
        k kVarW = g7Var.w();
        y4 y4Var = z4.T0;
        if (kVarW.H(str, y4Var) && meVar.D0().N(str)) {
            strZ = "";
        }
        z(builder, "app_instance_id", strZ, setA);
        z(builder, "rdid", z6Var.T(), setA);
        z(builder, "bundle_id", z6Var.O(), setA);
        String strO = n6Var.O();
        String strA = r8.a(strO);
        if (true != TextUtils.isEmpty(strA)) {
            strO = strA;
        }
        z(builder, "app_event_name", strO, setA);
        z(builder, "app_version", String.valueOf(z6Var.E0()), setA);
        String strC2 = z6Var.C();
        if (g7Var.w().H(str, y4Var) && meVar.D0().K(str) && !TextUtils.isEmpty(strC2) && (iIndexOf = strC2.indexOf(".")) != -1) {
            strC2 = strC2.substring(0, iIndexOf);
        }
        z(builder, "os_version", strC2, setA);
        z(builder, "timestamp", String.valueOf(n6Var.R()), setA);
        if (z6Var.W()) {
            z(builder, "lat", "1", setA);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(z6Var.l0()), setA);
        z(builder, "trigger_uri_source", "1", setA);
        z(builder, "trigger_uri_timestamp", String.valueOf(jA), setA);
        z(builder, "request_uuid", str2, setA);
        List<com.google.android.gms.internal.measurement.s6> listX = n6Var.x();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.s6 s6Var : listX) {
            String strG = s6Var.G();
            if (s6Var.P()) {
                bundle.putString(strG, String.valueOf(s6Var.Q()));
            } else if (s6Var.N()) {
                bundle.putString(strG, String.valueOf(s6Var.O()));
            } else if (s6Var.H()) {
                bundle.putString(strG, s6Var.J());
            } else if (s6Var.K()) {
                bundle.putString(strG, String.valueOf(s6Var.L()));
            }
        }
        C(builder, g7Var.w().C(str, z4.f26201u0).split("\\|"), bundle, setA);
        List<com.google.android.gms.internal.measurement.r7> listF1 = z6Var.f1();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.r7 r7Var : listF1) {
            String strH = r7Var.H();
            if (r7Var.Q()) {
                bundle2.putString(strH, String.valueOf(r7Var.R()));
            } else if (r7Var.O()) {
                bundle2.putString(strH, String.valueOf(r7Var.P()));
            } else if (r7Var.J()) {
                bundle2.putString(strH, r7Var.K());
            } else if (r7Var.L()) {
                bundle2.putString(strH, String.valueOf(r7Var.N()));
            }
        }
        C(builder, g7Var.w().C(str, z4.f26199t0).split("\\|"), bundle2, setA);
        z(builder, "dma", true != z6Var.h0() ? "0" : "1", setA);
        if (!z6Var.j0().isEmpty()) {
            z(builder, "dma_cps", z6Var.j0(), setA);
        }
        if (z6Var.p0()) {
            com.google.android.gms.internal.measurement.w5 w5VarQ0 = z6Var.q0();
            if (!w5VarQ0.S().isEmpty()) {
                z(builder, "dl_gclid", w5VarQ0.S(), setA);
            }
            if (!w5VarQ0.U().isEmpty()) {
                z(builder, "dl_gbraid", w5VarQ0.U(), setA);
            }
            if (!w5VarQ0.W().isEmpty()) {
                z(builder, "dl_gs", w5VarQ0.W(), setA);
            }
            if (w5VarQ0.Y() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(w5VarQ0.Y()), setA);
            }
            if (!w5VarQ0.a0().isEmpty()) {
                z(builder, "mr_gclid", w5VarQ0.a0(), setA);
            }
            if (!w5VarQ0.c0().isEmpty()) {
                z(builder, "mr_gbraid", w5VarQ0.c0(), setA);
            }
            if (!w5VarQ0.e0().isEmpty()) {
                z(builder, "mr_gs", w5VarQ0.e0(), setA);
            }
            if (w5VarQ0.g0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(w5VarQ0.g0()), setA);
            }
        }
        return new zzoh(builder.build().toString(), jA, 1);
    }

    public final com.google.android.gms.internal.measurement.o6 J(a0 a0Var) {
        com.google.android.gms.internal.measurement.n6 n6VarR = com.google.android.gms.internal.measurement.o6.R();
        n6VarR.U(a0Var.f25317e);
        zzbe zzbeVar = a0Var.f25318f;
        c0 c0Var = new c0(zzbeVar);
        while (c0Var.hasNext()) {
            String next = c0Var.next();
            com.google.android.gms.internal.measurement.r6 r6VarT = com.google.android.gms.internal.measurement.s6.T();
            r6VarT.z(next);
            Object objA = zzbeVar.a(next);
            n9.m.l(objA);
            H(r6VarT, objA);
            n6VarR.G(r6VarT);
        }
        String str = a0Var.f25315c;
        if (!TextUtils.isEmpty(str) && zzbeVar.a("_o") == null) {
            com.google.android.gms.internal.measurement.r6 r6VarT2 = com.google.android.gms.internal.measurement.s6.T();
            r6VarT2.z("_o");
            r6VarT2.C(str);
            n6VarR.E((com.google.android.gms.internal.measurement.s6) r6VarT2.t());
        }
        return (com.google.android.gms.internal.measurement.o6) n6VarR.t();
    }

    public final String K(com.google.android.gms.internal.measurement.y6 y6Var) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.a6 a6VarB1;
        if (y6Var == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (y6Var.L()) {
            E(sb2, 0, "upload_subdomain", y6Var.N());
        }
        if (y6Var.J()) {
            E(sb2, 0, "sgtm_join_id", y6Var.K());
        }
        for (com.google.android.gms.internal.measurement.a7 a7Var : y6Var.F()) {
            if (a7Var != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (a7Var.h0()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(a7Var.i1()));
                }
                ig.a();
                g7 g7Var = this.f25625a;
                if (g7Var.w().H(a7Var.F(), z4.N0) && a7Var.O0()) {
                    E(sb2, 1, "session_stitching_token", a7Var.P0());
                }
                E(sb2, 1, "platform", a7Var.C2());
                if (a7Var.H()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(a7Var.J()));
                }
                if (a7Var.K()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(a7Var.L()));
                }
                if (a7Var.K0()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(a7Var.L0()));
                }
                if (a7Var.d0()) {
                    E(sb2, 1, "config_version", Long.valueOf(a7Var.e0()));
                }
                E(sb2, 1, "gmp_app_id", a7Var.W());
                E(sb2, 1, "app_id", a7Var.F());
                E(sb2, 1, "app_version", a7Var.G());
                if (a7Var.b0()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(a7Var.c0()));
                }
                E(sb2, 1, "firebase_instance_id", a7Var.a0());
                if (a7Var.R()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(a7Var.S()));
                }
                E(sb2, 1, "app_store", a7Var.I2());
                if (a7Var.s2()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(a7Var.t2()));
                }
                if (a7Var.u2()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(a7Var.v2()));
                }
                if (a7Var.w2()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(a7Var.x2()));
                }
                if (a7Var.y2()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(a7Var.z2()));
                }
                if (a7Var.A2()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(a7Var.B2()));
                }
                E(sb2, 1, "app_instance_id", a7Var.Q());
                E(sb2, 1, "resettable_device_id", a7Var.N());
                E(sb2, 1, "ds_id", a7Var.g0());
                if (a7Var.O()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(a7Var.P()));
                }
                E(sb2, 1, "os_version", a7Var.D2());
                E(sb2, 1, Payload.DEVICE_MODEL, a7Var.E2());
                E(sb2, 1, "user_default_language", a7Var.F2());
                if (a7Var.G2()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(a7Var.H2()));
                }
                if (a7Var.T()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(a7Var.U()));
                }
                if (a7Var.c1()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(a7Var.d1()));
                }
                if (a7Var.X()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(a7Var.Y()));
                }
                E(sb2, 1, "health_monitor", a7Var.V());
                if (a7Var.I0()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(a7Var.J0()));
                }
                if (a7Var.M0()) {
                    E(sb2, 1, "consent_signals", a7Var.N0());
                }
                if (a7Var.V0()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(a7Var.W0()));
                }
                if (a7Var.X0()) {
                    E(sb2, 1, "core_platform_services", a7Var.Y0());
                }
                if (a7Var.T0()) {
                    E(sb2, 1, "consent_diagnostics", a7Var.U0());
                }
                if (a7Var.Q0()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(a7Var.R0()));
                }
                vf.a();
                if (g7Var.w().H(a7Var.F(), z4.Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(a7Var.Z0()));
                    if (a7Var.a1() && (a6VarB1 = a7Var.b1()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(a6VarB1.F()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(a6VarB1.G()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(a6VarB1.H()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(a6VarB1.J()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(a6VarB1.K()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(a6VarB1.L()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(a6VarB1.N()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (a7Var.e1()) {
                    com.google.android.gms.internal.measurement.w5 w5VarF1 = a7Var.f1();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (w5VarF1.R()) {
                        E(sb2, 2, "deep_link_gclid", w5VarF1.S());
                    }
                    if (w5VarF1.T()) {
                        E(sb2, 2, "deep_link_gbraid", w5VarF1.U());
                    }
                    if (w5VarF1.V()) {
                        E(sb2, 2, "deep_link_gad_source", w5VarF1.W());
                    }
                    if (w5VarF1.X()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(w5VarF1.Y()));
                    }
                    if (w5VarF1.Z()) {
                        E(sb2, 2, "market_referrer_gclid", w5VarF1.a0());
                    }
                    if (w5VarF1.b0()) {
                        E(sb2, 2, "market_referrer_gbraid", w5VarF1.c0());
                    }
                    if (w5VarF1.d0()) {
                        E(sb2, 2, "market_referrer_gad_source", w5VarF1.e0());
                    }
                    if (w5VarF1.f0()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(w5VarF1.g0()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (a7Var.i0()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(a7Var.j0()));
                }
                if (a7Var.g1()) {
                    com.google.android.gms.internal.measurement.p7 p7VarH1 = a7Var.h1();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int iL = p7VarH1.L();
                    if (iL == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iL == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iL != 3) {
                        str2 = iL != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    E(sb2, 2, "upload_type", str2);
                    E(sb2, 2, "client_upload_eligibility", p7VarH1.F().name());
                    int iN = p7VarH1.N();
                    if (iN == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iN == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iN == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iN != 4) {
                        str3 = iN != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    E(sb2, 2, "service_upload_eligibility", str3);
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (a7Var.k0()) {
                    com.google.android.gms.internal.measurement.k6 k6VarL0 = a7Var.l0();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.h6 h6Var : k6VarL0.F()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iH = h6Var.H();
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
                        int iJ = h6Var.J();
                        E(sb2, 3, "mode", iJ != 1 ? iJ != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.r7> listP2 = a7Var.p2();
                if (listP2 != null) {
                    for (com.google.android.gms.internal.measurement.r7 r7Var : listP2) {
                        if (r7Var != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", r7Var.F() ? Long.valueOf(r7Var.G()) : null);
                            E(sb2, 2, "name", g7Var.D().c(r7Var.H()));
                            E(sb2, 2, "string_value", r7Var.K());
                            E(sb2, 2, "int_value", r7Var.L() ? Long.valueOf(r7Var.N()) : null);
                            E(sb2, 2, "double_value", r7Var.Q() ? Double.valueOf(r7Var.R()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.c6> listZ = a7Var.Z();
                if (listZ != null) {
                    for (com.google.android.gms.internal.measurement.c6 c6Var : listZ) {
                        if (c6Var != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c6Var.F()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(c6Var.G()));
                            }
                            if (c6Var.L()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(c6Var.N()));
                            }
                            D(sb2, 2, "current_data", c6Var.H());
                            if (c6Var.J()) {
                                D(sb2, 2, "previous_data", c6Var.K());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.o6> listJ2 = a7Var.j2();
                if (listJ2 != null) {
                    for (com.google.android.gms.internal.measurement.o6 o6Var : listJ2) {
                        if (o6Var != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", g7Var.D().a(o6Var.J()));
                            if (o6Var.K()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(o6Var.L()));
                            }
                            if (o6Var.N()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(o6Var.O()));
                            }
                            if (o6Var.P()) {
                                E(sb2, 2, "count", Integer.valueOf(o6Var.Q()));
                            }
                            if (o6Var.G() != 0) {
                                w(sb2, 2, o6Var.F());
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

    public final String L(com.google.android.gms.internal.measurement.z3 z3Var) {
        if (z3Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (z3Var.F()) {
            E(sb2, 0, "filter_id", Integer.valueOf(z3Var.G()));
        }
        E(sb2, 0, "event_name", this.f25625a.D().a(z3Var.H()));
        String strA = A(z3Var.P(), z3Var.Q(), z3Var.S());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        if (z3Var.N()) {
            F(sb2, 1, "event_count_filter", z3Var.O());
        }
        if (z3Var.K() > 0) {
            sb2.append("  filters {\n");
            Iterator it = z3Var.J().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (com.google.android.gms.internal.measurement.b4) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    public final String M(com.google.android.gms.internal.measurement.h4 h4Var) {
        if (h4Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (h4Var.F()) {
            E(sb2, 0, "filter_id", Integer.valueOf(h4Var.G()));
        }
        E(sb2, 0, "property_name", this.f25625a.D().c(h4Var.H()));
        String strA = A(h4Var.K(), h4Var.L(), h4Var.O());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        x(sb2, 1, h4Var.J());
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
        } catch (o9.a.C0471a unused) {
            this.f25625a.a().o().a("Failed to load parcelable from buffer");
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
                this.f25625a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f25625a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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
        return j10 == 0 || j11 <= 0 || Math.abs(this.f25625a.e().a() - j10) > j11;
    }

    public final long T(byte[] bArr) {
        n9.m.l(bArr);
        g7 g7Var = this.f25625a;
        g7Var.C().h();
        MessageDigest messageDigestC = ve.C();
        if (messageDigestC != null) {
            return ve.D(messageDigestC.digest(bArr));
        }
        g7Var.a().o().a("Failed to get MD5");
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
            this.f25625a.a().o().b("Failed to gzip content", e10);
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

    @Override // nb.xd
    public final boolean l() {
        return false;
    }

    public final zzbg m(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleN = n(bVar.f(), true);
        String string = (!bundleN.containsKey("_o") || (obj = bundleN.get("_o")) == null) ? Payload.TYPE_APP : obj.toString();
        String strB = r8.b(bVar.b());
        if (strB == null) {
            strB = bVar.b();
        }
        return new zzbg(strB, new zzbe(bundleN), string, bVar.a());
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
            com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) it.next();
            if (s6Var != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", s6Var.F() ? this.f25625a.D().b(s6Var.G()) : null);
                E(sb2, i11, "string_value", s6Var.H() ? s6Var.J() : null);
                E(sb2, i11, "int_value", s6Var.K() ? Long.valueOf(s6Var.L()) : null);
                E(sb2, i11, "double_value", s6Var.P() ? Double.valueOf(s6Var.Q()) : null);
                if (s6Var.S() > 0) {
                    w(sb2, i11, s6Var.R());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void x(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.b4 b4Var) {
        String str;
        if (b4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (b4Var.K()) {
            E(sb2, i10, "complement", Boolean.valueOf(b4Var.L()));
        }
        if (b4Var.N()) {
            E(sb2, i10, "param_name", this.f25625a.D().b(b4Var.O()));
        }
        if (b4Var.F()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.l4 l4VarG = b4Var.G();
            if (l4VarG != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (l4VarG.F()) {
                    switch (l4VarG.Q()) {
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
                if (l4VarG.G()) {
                    E(sb2, i11, "expression", l4VarG.H());
                }
                if (l4VarG.J()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(l4VarG.K()));
                }
                if (l4VarG.N() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : l4VarG.L()) {
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
        if (b4Var.H()) {
            F(sb2, i10 + 1, "number_filter", b4Var.J());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }
}
