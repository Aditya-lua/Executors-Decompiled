package p306nb;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.C1967a6;
import com.google.android.gms.internal.measurement.C1968a7;
import com.google.android.gms.internal.measurement.C1979b;
import com.google.android.gms.internal.measurement.C1984b4;
import com.google.android.gms.internal.measurement.C2005c6;
import com.google.android.gms.internal.measurement.C2060f4;
import com.google.android.gms.internal.measurement.C2063f7;
import com.google.android.gms.internal.measurement.C2098h4;
import com.google.android.gms.internal.measurement.C2100h6;
import com.google.android.gms.internal.measurement.C2101h7;
import com.google.android.gms.internal.measurement.C2128ig;
import com.google.android.gms.internal.measurement.C2154k6;
import com.google.android.gms.internal.measurement.C2170l4;
import com.google.android.gms.internal.measurement.C2190m6;
import com.google.android.gms.internal.measurement.C2208n6;
import com.google.android.gms.internal.measurement.C2226o6;
import com.google.android.gms.internal.measurement.C2245p7;
import com.google.android.gms.internal.measurement.C2263q7;
import com.google.android.gms.internal.measurement.C2280r6;
import com.google.android.gms.internal.measurement.C2281r7;
import com.google.android.gms.internal.measurement.C2284ra;
import com.google.android.gms.internal.measurement.C2298s6;
import com.google.android.gms.internal.measurement.C2361vf;
import com.google.android.gms.internal.measurement.C2369w5;
import com.google.android.gms.internal.measurement.C2406y6;
import com.google.android.gms.internal.measurement.C2421z3;
import com.google.android.gms.internal.measurement.C2424z6;
import com.google.android.gms.internal.measurement.InterfaceC2214nc;
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
import p305n9.C8953m;
import p325o9.C9717a;

/* JADX INFO: renamed from: nb.re */
/* JADX INFO: loaded from: classes.dex */
public final class C9277re extends AbstractC9372xd {
    public C9277re(C9197me c9197me) {
        super(c9197me);
    }

    /* JADX INFO: renamed from: A */
    public static final String m36728A(boolean z10, boolean z11, boolean z12) {
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

    /* JADX INFO: renamed from: B */
    public static final Object m36729B(C2298s6 c2298s6) {
        if (c2298s6.m10698H()) {
            return c2298s6.m10699J();
        }
        if (c2298s6.m10700K()) {
            return Long.valueOf(c2298s6.m10701M());
        }
        if (c2298s6.m10704P()) {
            return Double.valueOf(c2298s6.m10705Q());
        }
        if (c2298s6.m10707S() > 0) {
            return m36739Y(c2298s6.m10706R());
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static final void m36730C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m36749z(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m36731D(StringBuilder sb2, int i10, String str, C2063f7 c2063f7) {
        if (c2063f7 == null) {
            return;
        }
        m36748y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c2063f7.m9994J() != 0) {
            m36748y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c2063f7.m9993H()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c2063f7.m9992G() != 0) {
            m36748y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c2063f7.m9991F()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c2063f7.m9996M() != 0) {
            m36748y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (C2190m6 c2190m6 : c2063f7.m9995K()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2190m6.m10373F() ? Integer.valueOf(c2190m6.m10374G()) : null);
                sb2.append(":");
                sb2.append(c2190m6.m10375H() ? Long.valueOf(c2190m6.m10376J()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c2063f7.m9998O() != 0) {
            m36748y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C2101h7 c2101h7 : c2063f7.m9997N()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2101h7.m10178F() ? Integer.valueOf(c2101h7.m10179G()) : null);
                sb2.append(": [");
                Iterator it = c2101h7.m10180H().iterator();
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
        m36748y(sb2, 3);
        sb2.append("}\n");
    }

    /* JADX INFO: renamed from: E */
    public static final void m36732E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m36748y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* JADX INFO: renamed from: F */
    public static final void m36733F(StringBuilder sb2, int i10, String str, C2060f4 c2060f4) {
        String str2;
        if (c2060f4 == null) {
            return;
        }
        m36748y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (c2060f4.m9969F()) {
            int iM9978S = c2060f4.m9978S();
            if (iM9978S == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM9978S == 2) {
                str2 = "LESS_THAN";
            } else if (iM9978S != 3) {
                str2 = iM9978S != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m36732E(sb2, i10, "comparison_type", str2);
        }
        if (c2060f4.m9970G()) {
            m36732E(sb2, i10, "match_as_float", Boolean.valueOf(c2060f4.m9971H()));
        }
        if (c2060f4.m9972J()) {
            m36732E(sb2, i10, "comparison_value", c2060f4.m9973K());
        }
        if (c2060f4.m9974M()) {
            m36732E(sb2, i10, "min_comparison_value", c2060f4.m9975N());
        }
        if (c2060f4.m9976O()) {
            m36732E(sb2, i10, "max_comparison_value", c2060f4.m9977P());
        }
        m36748y(sb2, i10);
        sb2.append("}\n");
    }

    /* JADX INFO: renamed from: O */
    public static boolean m36734O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m36735P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public static List m36736Q(BitSet bitSet) {
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

    /* JADX INFO: renamed from: W */
    public static InterfaceC2214nc m36737W(InterfaceC2214nc interfaceC2214nc, byte[] bArr) {
        C2284ra c2284raM10629a = C2284ra.m10629a();
        return c2284raM10629a != null ? interfaceC2214nc.mo10471I(bArr, c2284raM10629a) : interfaceC2214nc.mo10472u(bArr);
    }

    /* JADX INFO: renamed from: X */
    public static int m36738X(C2424z6 c2424z6, String str) {
        for (int i10 = 0; i10 < c2424z6.m11120g1(); i10++) {
            if (str.equals(c2424z6.m11122h1(i10).m10609H())) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Y */
    public static Bundle[] m36739Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2298s6 c2298s6 = (C2298s6) it.next();
            if (c2298s6 != null) {
                Bundle bundle = new Bundle();
                for (C2298s6 c2298s7 : c2298s6.m10706R()) {
                    if (c2298s7.m10698H()) {
                        bundle.putString(c2298s7.m10697G(), c2298s7.m10699J());
                    } else if (c2298s7.m10700K()) {
                        bundle.putLong(c2298s7.m10697G(), c2298s7.m10701M());
                    } else if (c2298s7.m10704P()) {
                        bundle.putDouble(c2298s7.m10697G(), c2298s7.m10705Q());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: o */
    public static final void m36740o(C2208n6 c2208n6, String str, Object obj) {
        List listM10426x = c2208n6.m10426x();
        int i10 = 0;
        while (true) {
            if (i10 >= listM10426x.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((C2298s6) listM10426x.get(i10)).m10697G())) {
                break;
            } else {
                i10++;
            }
        }
        C2280r6 c2280r6M10694T = C2298s6.m10694T();
        c2280r6M10694T.m10604z(str);
        c2280r6M10694T.m10595E(((Long) obj).longValue());
        if (i10 >= 0) {
            c2208n6.m10412D(i10, c2280r6M10694T);
        } else {
            c2208n6.m10414G(c2280r6M10694T);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m36741p(zzbg zzbgVar, zzr zzrVar) {
        C8953m.m36047l(zzbgVar);
        C8953m.m36047l(zzrVar);
        return !TextUtils.isEmpty(zzrVar.f9536g);
    }

    /* JADX INFO: renamed from: q */
    public static final Bundle m36742q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2298s6 c2298s6 = (C2298s6) it.next();
            String strM10697G = c2298s6.m10697G();
            if (c2298s6.m10704P()) {
                bundle.putDouble(strM10697G, c2298s6.m10705Q());
            } else if (c2298s6.m10702N()) {
                bundle.putFloat(strM10697G, c2298s6.m10703O());
            } else if (c2298s6.m10698H()) {
                bundle.putString(strM10697G, c2298s6.m10699J());
            } else if (c2298s6.m10700K()) {
                bundle.putLong(strM10697G, c2298s6.m10701M());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: r */
    public static final C2298s6 m36743r(C2226o6 c2226o6, String str) {
        for (C2298s6 c2298s6 : c2226o6.m10487F()) {
            if (c2298s6.m10697G().equals(str)) {
                return c2298s6;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final Map m36744s(C2226o6 c2226o6, String... strArr) {
        Object objM36729B;
        HashMap map = new HashMap();
        for (C2298s6 c2298s6 : c2226o6.m10487F()) {
            if (Arrays.asList(strArr).contains(c2298s6.m10697G()) && (objM36729B = m36729B(c2298s6)) != null) {
                map.put(c2298s6.m10697G(), objM36729B);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: t */
    public static final Map m36745t(C2226o6 c2226o6, String str) {
        Object objM36729B;
        HashMap map = new HashMap();
        for (C2298s6 c2298s6 : c2226o6.m10487F()) {
            if (c2298s6.m10697G().startsWith("gad_") && (objM36729B = m36729B(c2298s6)) != null) {
                map.put(c2298s6.m10697G(), objM36729B);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: u */
    public static final Object m36746u(C2226o6 c2226o6, String str) {
        C2298s6 c2298s6M36743r = m36743r(c2226o6, str);
        if (c2298s6M36743r == null) {
            return null;
        }
        return m36729B(c2298s6M36743r);
    }

    /* JADX INFO: renamed from: v */
    public static final Object m36747v(C2226o6 c2226o6, String str, Object obj) {
        Object objM36746u = m36746u(c2226o6, str);
        return objM36746u == null ? obj : objM36746u;
    }

    /* JADX INFO: renamed from: y */
    public static final void m36748y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m36749z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: G */
    public final void m36750G(C2263q7 c2263q7, Object obj) {
        C8953m.m36047l(obj);
        c2263q7.m10567C();
        c2263q7.m10569E();
        c2263q7.m10571J();
        if (obj instanceof String) {
            c2263q7.m10566A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c2263q7.m10568D(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c2263q7.m10570G(((Double) obj).doubleValue());
        } else {
            this.f33067a.mo36321a().m37003o().m36912b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m36751H(C2280r6 c2280r6, Object obj) {
        C8953m.m36047l(obj);
        c2280r6.m10594D();
        c2280r6.m10596G();
        c2280r6.m10598K();
        c2280r6.m10602Q();
        if (obj instanceof String) {
            c2280r6.m10593C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c2280r6.m10595E(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            c2280r6.m10597J(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f33067a.mo36321a().m37003o().m36912b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C2280r6 c2280r6M10694T = C2298s6.m10694T();
                for (String str : bundle.keySet()) {
                    C2280r6 c2280r6M10694T2 = C2298s6.m10694T();
                    c2280r6M10694T2.m10604z(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c2280r6M10694T2.m10595E(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c2280r6M10694T2.m10593C((String) obj2);
                    } else if (obj2 instanceof Double) {
                        c2280r6M10694T2.m10597J(((Double) obj2).doubleValue());
                    }
                    c2280r6M10694T.m10600O(c2280r6M10694T2);
                }
                if (c2280r6M10694T.m10599N() > 0) {
                    arrayList.add((C2298s6) c2280r6M10694T.m9882t());
                }
            }
        }
        c2280r6.m10601P(arrayList);
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: I */
    public final zzoh m36752I(String str, C2424z6 c2424z6, C2208n6 c2208n6, String str2) {
        int iIndexOf;
        C2361vf.m10862a();
        C9094g7 c9094g7 = this.f33067a;
        if (!c9094g7.m36338w().m36406H(str, C9395z4.f33738Q0)) {
            return null;
        }
        long jMo44175a = c9094g7.mo36325e().mo44175a();
        Set setM36724a = C9261qe.m36724a(c9094g7.m36338w().m36401C(str, C9395z4.f33812v0).split(","));
        C9197me c9197me = this.f33516b;
        C9404zd c9404zdM36502C0 = c9197me.m36502C0();
        String strM37060x = c9404zdM36502C0.f33516b.m36504D0().m37060x(str);
        Uri.Builder builder = new Uri.Builder();
        C9094g7 c9094g8 = c9404zdM36502C0.f33067a;
        builder.scheme(c9094g8.m36338w().m36401C(str, C9395z4.f33798o0));
        if (TextUtils.isEmpty(strM37060x)) {
            builder.authority(c9094g8.m36338w().m36401C(str, C9395z4.f33800p0));
        } else {
            String strM36401C = c9094g8.m36338w().m36401C(str, C9395z4.f33800p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strM37060x).length() + 1 + String.valueOf(strM36401C).length());
            sb2.append(strM37060x);
            sb2.append(".");
            sb2.append(strM36401C);
            builder.authority(sb2.toString());
        }
        builder.path(c9094g8.m36338w().m36401C(str, C9395z4.f33802q0));
        m36749z(builder, "gmp_app_id", c2424z6.m11153y0(), setM36724a);
        c9094g7.m36338w().m36399A();
        m36749z(builder, "gmp_version", String.valueOf(133005L), setM36724a);
        String strM11105Z = c2424z6.m11105Z();
        C9150k c9150kM36338w = c9094g7.m36338w();
        C9379y4 c9379y4 = C9395z4.f33744T0;
        if (c9150kM36338w.m36406H(str, c9379y4) && c9197me.m36504D0().m37044N(str)) {
            strM11105Z = "";
        }
        m36749z(builder, "app_instance_id", strM11105Z, setM36724a);
        m36749z(builder, "rdid", c2424z6.m11093T(), setM36724a);
        m36749z(builder, "bundle_id", c2424z6.m11083O(), setM36724a);
        String strM10418O = c2208n6.m10418O();
        String strM36726a = C9271r8.m36726a(strM10418O);
        if (true != TextUtils.isEmpty(strM36726a)) {
            strM10418O = strM36726a;
        }
        m36749z(builder, "app_event_name", strM10418O, setM36724a);
        m36749z(builder, "app_version", String.valueOf(c2424z6.m11069E0()), setM36724a);
        String strM11064C = c2424z6.m11064C();
        if (c9094g7.m36338w().m36406H(str, c9379y4) && c9197me.m36504D0().m37041K(str) && !TextUtils.isEmpty(strM11064C) && (iIndexOf = strM11064C.indexOf(".")) != -1) {
            strM11064C = strM11064C.substring(0, iIndexOf);
        }
        m36749z(builder, "os_version", strM11064C, setM36724a);
        m36749z(builder, "timestamp", String.valueOf(c2208n6.m10421R()), setM36724a);
        if (c2424z6.m11099W()) {
            m36749z(builder, "lat", "1", setM36724a);
        }
        m36749z(builder, "privacy_sandbox_version", String.valueOf(c2424z6.m11129l0()), setM36724a);
        m36749z(builder, "trigger_uri_source", "1", setM36724a);
        m36749z(builder, "trigger_uri_timestamp", String.valueOf(jMo44175a), setM36724a);
        m36749z(builder, "request_uuid", str2, setM36724a);
        List<C2298s6> listM10426x = c2208n6.m10426x();
        Bundle bundle = new Bundle();
        for (C2298s6 c2298s6 : listM10426x) {
            String strM10697G = c2298s6.m10697G();
            if (c2298s6.m10704P()) {
                bundle.putString(strM10697G, String.valueOf(c2298s6.m10705Q()));
            } else if (c2298s6.m10702N()) {
                bundle.putString(strM10697G, String.valueOf(c2298s6.m10703O()));
            } else if (c2298s6.m10698H()) {
                bundle.putString(strM10697G, c2298s6.m10699J());
            } else if (c2298s6.m10700K()) {
                bundle.putString(strM10697G, String.valueOf(c2298s6.m10701M()));
            }
        }
        m36730C(builder, c9094g7.m36338w().m36401C(str, C9395z4.f33810u0).split("\\|"), bundle, setM36724a);
        List<C2281r7> listM11118f1 = c2424z6.m11118f1();
        Bundle bundle2 = new Bundle();
        for (C2281r7 c2281r7 : listM11118f1) {
            String strM10609H = c2281r7.m10609H();
            if (c2281r7.m10616Q()) {
                bundle2.putString(strM10609H, String.valueOf(c2281r7.m10617R()));
            } else if (c2281r7.m10614O()) {
                bundle2.putString(strM10609H, String.valueOf(c2281r7.m10615P()));
            } else if (c2281r7.m10610J()) {
                bundle2.putString(strM10609H, c2281r7.m10611K());
            } else if (c2281r7.m10612M()) {
                bundle2.putString(strM10609H, String.valueOf(c2281r7.m10613N()));
            }
        }
        m36730C(builder, c9094g7.m36338w().m36401C(str, C9395z4.f33808t0).split("\\|"), bundle2, setM36724a);
        m36749z(builder, "dma", true != c2424z6.m11121h0() ? "0" : "1", setM36724a);
        if (!c2424z6.m11125j0().isEmpty()) {
            m36749z(builder, "dma_cps", c2424z6.m11125j0(), setM36724a);
        }
        if (c2424z6.m11137p0()) {
            C2369w5 c2369w5M11139q0 = c2424z6.m11139q0();
            if (!c2369w5M11139q0.m10892S().isEmpty()) {
                m36749z(builder, "dl_gclid", c2369w5M11139q0.m10892S(), setM36724a);
            }
            if (!c2369w5M11139q0.m10894U().isEmpty()) {
                m36749z(builder, "dl_gbraid", c2369w5M11139q0.m10894U(), setM36724a);
            }
            if (!c2369w5M11139q0.m10896W().isEmpty()) {
                m36749z(builder, "dl_gs", c2369w5M11139q0.m10896W(), setM36724a);
            }
            if (c2369w5M11139q0.m10898Y() > 0) {
                m36749z(builder, "dl_ss_ts", String.valueOf(c2369w5M11139q0.m10898Y()), setM36724a);
            }
            if (!c2369w5M11139q0.m10900a0().isEmpty()) {
                m36749z(builder, "mr_gclid", c2369w5M11139q0.m10900a0(), setM36724a);
            }
            if (!c2369w5M11139q0.m10902c0().isEmpty()) {
                m36749z(builder, "mr_gbraid", c2369w5M11139q0.m10902c0(), setM36724a);
            }
            if (!c2369w5M11139q0.m10904e0().isEmpty()) {
                m36749z(builder, "mr_gs", c2369w5M11139q0.m10904e0(), setM36724a);
            }
            if (c2369w5M11139q0.m10906g0() > 0) {
                m36749z(builder, "mr_click_ts", String.valueOf(c2369w5M11139q0.m10906g0()), setM36724a);
            }
        }
        return new zzoh(builder.build().toString(), jMo44175a, 1);
    }

    /* JADX INFO: renamed from: J */
    public final C2226o6 m36753J(C8986a0 c8986a0) {
        C2208n6 c2208n6M10484R = C2226o6.m10484R();
        c2208n6M10484R.m10424U(c8986a0.f32664e);
        zzbe zzbeVar = c8986a0.f32665f;
        C9020c0 c9020c0 = new C9020c0(zzbeVar);
        while (c9020c0.hasNext()) {
            String next = c9020c0.next();
            C2280r6 c2280r6M10694T = C2298s6.m10694T();
            c2280r6M10694T.m10604z(next);
            Object objM11878a = zzbeVar.m11878a(next);
            C8953m.m36047l(objM11878a);
            m36751H(c2280r6M10694T, objM11878a);
            c2208n6M10484R.m10414G(c2280r6M10694T);
        }
        String str = c8986a0.f32662c;
        if (!TextUtils.isEmpty(str) && zzbeVar.m11878a("_o") == null) {
            C2280r6 c2280r6M10694T2 = C2298s6.m10694T();
            c2280r6M10694T2.m10604z("_o");
            c2280r6M10694T2.m10593C(str);
            c2208n6M10484R.m10413E((C2298s6) c2280r6M10694T2.m9882t());
        }
        return (C2226o6) c2208n6M10484R.m9882t();
    }

    /* JADX INFO: renamed from: K */
    public final String m36754K(C2406y6 c2406y6) {
        String str;
        String str2;
        String str3;
        C1967a6 c1967a6M9690b1;
        if (c2406y6 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (c2406y6.m11006M()) {
            m36732E(sb2, 0, "upload_subdomain", c2406y6.m11007N());
        }
        if (c2406y6.m11004J()) {
            m36732E(sb2, 0, "sgtm_join_id", c2406y6.m11005K());
        }
        for (C1968a7 c1968a7 : c2406y6.m11001F()) {
            if (c1968a7 != null) {
                m36748y(sb2, 1);
                sb2.append("bundle {\n");
                if (c1968a7.m9707h0()) {
                    m36732E(sb2, 1, "protocol_version", Integer.valueOf(c1968a7.m9711i1()));
                }
                C2128ig.m10292a();
                C9094g7 c9094g7 = this.f33067a;
                if (c9094g7.m36338w().m36406H(c1968a7.m9621F(), C9395z4.f33732N0) && c1968a7.m9651O0()) {
                    m36732E(sb2, 1, "session_stitching_token", c1968a7.m9654P0());
                }
                m36732E(sb2, 1, "platform", c1968a7.m9614C2());
                if (c1968a7.m9629H()) {
                    m36732E(sb2, 1, "gmp_version", Long.valueOf(c1968a7.m9636J()));
                }
                if (c1968a7.m9639K()) {
                    m36732E(sb2, 1, "uploading_gmp_version", Long.valueOf(c1968a7.m9644M()));
                }
                if (c1968a7.m9640K0()) {
                    m36732E(sb2, 1, "dynamite_version", Long.valueOf(c1968a7.m9642L0()));
                }
                if (c1968a7.m9695d0()) {
                    m36732E(sb2, 1, "config_version", Long.valueOf(c1968a7.m9698e0()));
                }
                m36732E(sb2, 1, "gmp_app_id", c1968a7.m9674W());
                m36732E(sb2, 1, "app_id", c1968a7.m9621F());
                m36732E(sb2, 1, "app_version", c1968a7.m9625G());
                if (c1968a7.m9689b0()) {
                    m36732E(sb2, 1, "app_version_major", Integer.valueOf(c1968a7.m9692c0()));
                }
                m36732E(sb2, 1, "firebase_instance_id", c1968a7.m9686a0());
                if (c1968a7.m9659R()) {
                    m36732E(sb2, 1, "dev_cert_hash", Long.valueOf(c1968a7.m9662S()));
                }
                m36732E(sb2, 1, "app_store", c1968a7.m9635I2());
                if (c1968a7.m9739s2()) {
                    m36732E(sb2, 1, "upload_timestamp_millis", Long.valueOf(c1968a7.m9742t2()));
                }
                if (c1968a7.m9745u2()) {
                    m36732E(sb2, 1, "start_timestamp_millis", Long.valueOf(c1968a7.m9748v2()));
                }
                if (c1968a7.m9751w2()) {
                    m36732E(sb2, 1, "end_timestamp_millis", Long.valueOf(c1968a7.m9754x2()));
                }
                if (c1968a7.m9757y2()) {
                    m36732E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1968a7.m9760z2()));
                }
                if (c1968a7.m9608A2()) {
                    m36732E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1968a7.m9611B2()));
                }
                m36732E(sb2, 1, "app_instance_id", c1968a7.m9656Q());
                m36732E(sb2, 1, "resettable_device_id", c1968a7.m9647N());
                m36732E(sb2, 1, "ds_id", c1968a7.m9704g0());
                if (c1968a7.m9650O()) {
                    m36732E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c1968a7.m9653P()));
                }
                m36732E(sb2, 1, "os_version", c1968a7.m9617D2());
                m36732E(sb2, 1, Payload.DEVICE_MODEL, c1968a7.m9620E2());
                m36732E(sb2, 1, "user_default_language", c1968a7.m9624F2());
                if (c1968a7.m9628G2()) {
                    m36732E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c1968a7.m9632H2()));
                }
                if (c1968a7.m9665T()) {
                    m36732E(sb2, 1, "bundle_sequential_index", Integer.valueOf(c1968a7.m9668U()));
                }
                if (c1968a7.m9693c1()) {
                    m36732E(sb2, 1, "delivery_index", Integer.valueOf(c1968a7.m9696d1()));
                }
                if (c1968a7.m9677X()) {
                    m36732E(sb2, 1, "service_upload", Boolean.valueOf(c1968a7.m9680Y()));
                }
                m36732E(sb2, 1, "health_monitor", c1968a7.m9671V());
                if (c1968a7.m9633I0()) {
                    m36732E(sb2, 1, "retry_counter", Integer.valueOf(c1968a7.m9637J0()));
                }
                if (c1968a7.m9645M0()) {
                    m36732E(sb2, 1, "consent_signals", c1968a7.m9648N0());
                }
                if (c1968a7.m9672V0()) {
                    m36732E(sb2, 1, "is_dma_region", Boolean.valueOf(c1968a7.m9675W0()));
                }
                if (c1968a7.m9678X0()) {
                    m36732E(sb2, 1, "core_platform_services", c1968a7.m9681Y0());
                }
                if (c1968a7.m9666T0()) {
                    m36732E(sb2, 1, "consent_diagnostics", c1968a7.m9669U0());
                }
                if (c1968a7.m9657Q0()) {
                    m36732E(sb2, 1, "target_os_version", Long.valueOf(c1968a7.m9660R0()));
                }
                C2361vf.m10862a();
                if (c9094g7.m36338w().m36406H(c1968a7.m9621F(), C9395z4.f33738Q0)) {
                    m36732E(sb2, 1, "ad_services_version", Integer.valueOf(c1968a7.m9684Z0()));
                    if (c1968a7.m9687a1() && (c1967a6M9690b1 = c1968a7.m9690b1()) != null) {
                        m36748y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        m36732E(sb2, 2, "eligible", Boolean.valueOf(c1967a6M9690b1.m9589F()));
                        m36732E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c1967a6M9690b1.m9590G()));
                        m36732E(sb2, 2, "pre_r", Boolean.valueOf(c1967a6M9690b1.m9591H()));
                        m36732E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(c1967a6M9690b1.m9592J()));
                        m36732E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(c1967a6M9690b1.m9593K()));
                        m36732E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(c1967a6M9690b1.m9594M()));
                        m36732E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(c1967a6M9690b1.m9595N()));
                        m36748y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (c1968a7.m9699e1()) {
                    C2369w5 c2369w5M9702f1 = c1968a7.m9702f1();
                    m36748y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (c2369w5M9702f1.m10891R()) {
                        m36732E(sb2, 2, "deep_link_gclid", c2369w5M9702f1.m10892S());
                    }
                    if (c2369w5M9702f1.m10893T()) {
                        m36732E(sb2, 2, "deep_link_gbraid", c2369w5M9702f1.m10894U());
                    }
                    if (c2369w5M9702f1.m10895V()) {
                        m36732E(sb2, 2, "deep_link_gad_source", c2369w5M9702f1.m10896W());
                    }
                    if (c2369w5M9702f1.m10897X()) {
                        m36732E(sb2, 2, "deep_link_session_millis", Long.valueOf(c2369w5M9702f1.m10898Y()));
                    }
                    if (c2369w5M9702f1.m10899Z()) {
                        m36732E(sb2, 2, "market_referrer_gclid", c2369w5M9702f1.m10900a0());
                    }
                    if (c2369w5M9702f1.m10901b0()) {
                        m36732E(sb2, 2, "market_referrer_gbraid", c2369w5M9702f1.m10902c0());
                    }
                    if (c2369w5M9702f1.m10903d0()) {
                        m36732E(sb2, 2, "market_referrer_gad_source", c2369w5M9702f1.m10904e0());
                    }
                    if (c2369w5M9702f1.m10905f0()) {
                        m36732E(sb2, 2, "market_referrer_click_millis", Long.valueOf(c2369w5M9702f1.m10906g0()));
                    }
                    m36748y(sb2, 2);
                    sb2.append("}\n");
                }
                if (c1968a7.m9710i0()) {
                    m36732E(sb2, 1, "batching_timestamp_millis", Long.valueOf(c1968a7.m9713j0()));
                }
                if (c1968a7.m9705g1()) {
                    C2245p7 c2245p7M9708h1 = c1968a7.m9708h1();
                    m36748y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int iM10525M = c2245p7M9708h1.m10525M();
                    if (iM10525M == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iM10525M == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iM10525M != 3) {
                        str2 = iM10525M != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    m36732E(sb2, 2, "upload_type", str2);
                    m36732E(sb2, 2, "client_upload_eligibility", c2245p7M9708h1.m10523F().name());
                    int iM10526N = c2245p7M9708h1.m10526N();
                    if (iM10526N == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iM10526N == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iM10526N == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iM10526N != 4) {
                        str3 = iM10526N != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    m36732E(sb2, 2, "service_upload_eligibility", str3);
                    m36748y(sb2, 2);
                    sb2.append("}\n");
                }
                if (c1968a7.m9716k0()) {
                    C2154k6 c2154k6M9718l0 = c1968a7.m9718l0();
                    m36748y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (C2100h6 c2100h6 : c2154k6M9718l0.m10315F()) {
                        m36748y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iM10172H = c2100h6.m10172H();
                        if (iM10172H == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iM10172H == 2) {
                            str = "AD_STORAGE";
                        } else if (iM10172H != 3) {
                            str = iM10172H != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        m36732E(sb2, 3, Payload.TYPE, str);
                        int iM10173J = c2100h6.m10173J();
                        m36732E(sb2, 3, "mode", iM10173J != 1 ? iM10173J != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m36748y(sb2, 3);
                        sb2.append("}\n");
                    }
                    m36748y(sb2, 2);
                    sb2.append("}\n");
                }
                List<C2281r7> listM9730p2 = c1968a7.m9730p2();
                if (listM9730p2 != null) {
                    for (C2281r7 c2281r7 : listM9730p2) {
                        if (c2281r7 != null) {
                            m36748y(sb2, 2);
                            sb2.append("user_property {\n");
                            m36732E(sb2, 2, "set_timestamp_millis", c2281r7.m10607F() ? Long.valueOf(c2281r7.m10608G()) : null);
                            m36732E(sb2, 2, "name", c9094g7.m36309D().m36622c(c2281r7.m10609H()));
                            m36732E(sb2, 2, "string_value", c2281r7.m10611K());
                            m36732E(sb2, 2, "int_value", c2281r7.m10612M() ? Long.valueOf(c2281r7.m10613N()) : null);
                            m36732E(sb2, 2, "double_value", c2281r7.m10616Q() ? Double.valueOf(c2281r7.m10617R()) : null);
                            m36748y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C2005c6> listM9683Z = c1968a7.m9683Z();
                if (listM9683Z != null) {
                    for (C2005c6 c2005c6 : listM9683Z) {
                        if (c2005c6 != null) {
                            m36748y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c2005c6.m9848F()) {
                                m36732E(sb2, 2, "audience_id", Integer.valueOf(c2005c6.m9849G()));
                            }
                            if (c2005c6.m9853M()) {
                                m36732E(sb2, 2, "new_audience", Boolean.valueOf(c2005c6.m9854N()));
                            }
                            m36731D(sb2, 2, "current_data", c2005c6.m9850H());
                            if (c2005c6.m9851J()) {
                                m36731D(sb2, 2, "previous_data", c2005c6.m9852K());
                            }
                            m36748y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C2226o6> listM9715j2 = c1968a7.m9715j2();
                if (listM9715j2 != null) {
                    for (C2226o6 c2226o6 : listM9715j2) {
                        if (c2226o6 != null) {
                            m36748y(sb2, 2);
                            sb2.append("event {\n");
                            m36732E(sb2, 2, "name", c9094g7.m36309D().m36620a(c2226o6.m10490J()));
                            if (c2226o6.m10491K()) {
                                m36732E(sb2, 2, "timestamp_millis", Long.valueOf(c2226o6.m10492M()));
                            }
                            if (c2226o6.m10493N()) {
                                m36732E(sb2, 2, "previous_timestamp_millis", Long.valueOf(c2226o6.m10494O()));
                            }
                            if (c2226o6.m10495P()) {
                                m36732E(sb2, 2, "count", Integer.valueOf(c2226o6.m10496Q()));
                            }
                            if (c2226o6.m10488G() != 0) {
                                m36766w(sb2, 2, c2226o6.m10487F());
                            }
                            m36748y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m36748y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: L */
    public final String m36755L(C2421z3 c2421z3) {
        if (c2421z3 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c2421z3.m11039F()) {
            m36732E(sb2, 0, "filter_id", Integer.valueOf(c2421z3.m11040G()));
        }
        m36732E(sb2, 0, "event_name", this.f33067a.m36309D().m36620a(c2421z3.m11041H()));
        String strM36728A = m36728A(c2421z3.m11047P(), c2421z3.m11048Q(), c2421z3.m11050S());
        if (!strM36728A.isEmpty()) {
            m36732E(sb2, 0, "filter_type", strM36728A);
        }
        if (c2421z3.m11045N()) {
            m36733F(sb2, 1, "event_count_filter", c2421z3.m11046O());
        }
        if (c2421z3.m11043K() > 0) {
            sb2.append("  filters {\n");
            Iterator it = c2421z3.m11042J().iterator();
            while (it.hasNext()) {
                m36767x(sb2, 2, (C1984b4) it.next());
            }
        }
        m36748y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: M */
    public final String m36756M(C2098h4 c2098h4) {
        if (c2098h4 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (c2098h4.m10161F()) {
            m36732E(sb2, 0, "filter_id", Integer.valueOf(c2098h4.m10162G()));
        }
        m36732E(sb2, 0, "property_name", this.f33067a.m36309D().m36622c(c2098h4.m10163H()));
        String strM36728A = m36728A(c2098h4.m10165K(), c2098h4.m10166M(), c2098h4.m10168O());
        if (!strM36728A.isEmpty()) {
            m36732E(sb2, 0, "filter_type", strM36728A);
        }
        m36767x(sb2, 1, c2098h4.m10164J());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: N */
    public final Parcelable m36757N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (C9717a.a unused) {
            this.f33067a.mo36321a().m37003o().m36911a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    /* JADX INFO: renamed from: R */
    public final List m36758R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f33067a.mo36321a().m37006r().m36912b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f33067a.mo36321a().m37006r().m36913c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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

    /* JADX INFO: renamed from: S */
    public final boolean m36759S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f33067a.mo36325e().mo44175a() - j10) > j11;
    }

    /* JADX INFO: renamed from: T */
    public final long m36760T(byte[] bArr) {
        C8953m.m36047l(bArr);
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.m36308C().mo36088h();
        MessageDigest messageDigestM36922C = C9341ve.m36922C();
        if (messageDigestM36922C != null) {
            return C9341ve.m36923D(messageDigestM36922C.digest(bArr));
        }
        c9094g7.mo36321a().m37003o().m36911a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: U */
    public final long m36761U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return m36760T(str.getBytes(Charset.forName("UTF-8")));
    }

    /* JADX INFO: renamed from: V */
    public final byte[] m36762V(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to gzip content", e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final Map m36763Z(Bundle bundle, boolean z10) {
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
                                arrayList.add(m36763Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m36763Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m36763Z((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // p306nb.AbstractC9372xd
    /* JADX INFO: renamed from: l */
    public final boolean mo36126l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final zzbg m36764m(C1979b c1979b) {
        Object obj;
        Bundle bundleM36765n = m36765n(c1979b.m9772f(), true);
        String string = (!bundleM36765n.containsKey("_o") || (obj = bundleM36765n.get("_o")) == null) ? Payload.TYPE_APP : obj.toString();
        String strM36727b = C9271r8.m36727b(c1979b.m9768b());
        if (strM36727b == null) {
            strM36727b = c1979b.m9768b();
        }
        return new zzbg(strM36727b, new zzbe(bundleM36765n), string, c1979b.m9767a());
    }

    /* JADX INFO: renamed from: n */
    public final Bundle m36765n(Map map, boolean z10) {
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
                    arrayList2.add(m36765n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: w */
    public final void m36766w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2298s6 c2298s6 = (C2298s6) it.next();
            if (c2298s6 != null) {
                m36748y(sb2, i11);
                sb2.append("param {\n");
                m36732E(sb2, i11, "name", c2298s6.m10696F() ? this.f33067a.m36309D().m36621b(c2298s6.m10697G()) : null);
                m36732E(sb2, i11, "string_value", c2298s6.m10698H() ? c2298s6.m10699J() : null);
                m36732E(sb2, i11, "int_value", c2298s6.m10700K() ? Long.valueOf(c2298s6.m10701M()) : null);
                m36732E(sb2, i11, "double_value", c2298s6.m10704P() ? Double.valueOf(c2298s6.m10705Q()) : null);
                if (c2298s6.m10707S() > 0) {
                    m36766w(sb2, i11, c2298s6.m10706R());
                }
                m36748y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m36767x(StringBuilder sb2, int i10, C1984b4 c1984b4) {
        String str;
        if (c1984b4 == null) {
            return;
        }
        m36748y(sb2, i10);
        sb2.append("filter {\n");
        if (c1984b4.m9781K()) {
            m36732E(sb2, i10, "complement", Boolean.valueOf(c1984b4.m9782M()));
        }
        if (c1984b4.m9783N()) {
            m36732E(sb2, i10, "param_name", this.f33067a.m36309D().m36621b(c1984b4.m9784O()));
        }
        if (c1984b4.m9777F()) {
            int i11 = i10 + 1;
            C2170l4 c2170l4M9778G = c1984b4.m9778G();
            if (c2170l4M9778G != null) {
                m36748y(sb2, i11);
                sb2.append("string_filter {\n");
                if (c2170l4M9778G.m10351F()) {
                    switch (c2170l4M9778G.m10358Q()) {
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
                    m36732E(sb2, i11, "match_type", str);
                }
                if (c2170l4M9778G.m10352G()) {
                    m36732E(sb2, i11, "expression", c2170l4M9778G.m10353H());
                }
                if (c2170l4M9778G.m10354J()) {
                    m36732E(sb2, i11, "case_sensitive", Boolean.valueOf(c2170l4M9778G.m10355K()));
                }
                if (c2170l4M9778G.m10357N() > 0) {
                    m36748y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : c2170l4M9778G.m10356M()) {
                        m36748y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m36748y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (c1984b4.m9779H()) {
            m36733F(sb2, i10 + 1, "number_filter", c1984b4.m9780J());
        }
        m36748y(sb2, i10);
        sb2.append("}\n");
    }
}
