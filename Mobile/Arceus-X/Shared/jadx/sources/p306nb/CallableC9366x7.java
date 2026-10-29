package p306nb;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1968a7;
import com.google.android.gms.internal.measurement.C1987b7;
import com.google.android.gms.internal.measurement.C2025d7;
import com.google.android.gms.internal.measurement.C2128ig;
import com.google.android.gms.internal.measurement.C2208n6;
import com.google.android.gms.internal.measurement.C2226o6;
import com.google.android.gms.internal.measurement.C2244p6;
import com.google.android.gms.internal.measurement.C2262q6;
import com.google.android.gms.internal.measurement.C2263q7;
import com.google.android.gms.internal.measurement.C2280r6;
import com.google.android.gms.internal.measurement.C2281r7;
import com.google.android.gms.internal.measurement.C2298s6;
import com.google.android.gms.internal.measurement.C2352v6;
import com.google.android.gms.internal.measurement.C2406y6;
import com.google.android.gms.internal.measurement.C2424z6;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.x7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9366x7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbg f33646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC9127i8 f33648c;

    public CallableC9366x7(BinderC9127i8 binderC9127i8, zzbg zzbgVar, String str) {
        this.f33646a = zzbgVar;
        this.f33647b = str;
        Objects.requireNonNull(binderC9127i8);
        this.f33648c = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Throwable {
        C9353wa c9353wa;
        byte[] bArr;
        C9197me c9197me;
        C9309te c9309te;
        C9197me c9197me2;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        C2352v6 c2352v6;
        C9003b0 c9003b0M36117a;
        long j10;
        byte[] bArr2;
        BinderC9127i8 binderC9127i8 = this.f33648c;
        binderC9127i8.m36366z2().m36505E();
        C9353wa c9353waM36513J0 = binderC9127i8.m36366z2().m36513J0();
        c9353waM36513J0.mo36088h();
        C9094g7 c9094g7 = c9353waM36513J0.f33067a;
        C9094g7.m36301q();
        zzbg zzbgVar = this.f33646a;
        C8953m.m36047l(zzbgVar);
        String str2 = this.f33647b;
        C8953m.m36041f(str2);
        String str3 = zzbgVar.f9502f;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            c9353waM36513J0.f33067a.mo36321a().m37010v().m36913c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        C9197me c9197me3 = c9353waM36513J0.f33516b;
        C2352v6 c2352v6M10998O = C2406y6.m10998O();
        c9197me3.m36507F0().m36842r0();
        try {
            C9026c6 c9026c6M36809J0 = c9197me3.m36507F0().m36809J0(str2);
            if (c9026c6M36809J0 != null) {
                if (c9026c6M36809J0.m36204d()) {
                    C2424z6 c2424z6M9604m0 = C1968a7.m9604m0();
                    c2424z6M9604m0.m11115e0(1);
                    c2424z6M9604m0.m11061A("android");
                    if (!TextUtils.isEmpty(c9026c6M36809J0.m36227o0())) {
                        c2424z6M9604m0.m11085P(c9026c6M36809J0.m36227o0());
                    }
                    if (!TextUtils.isEmpty(c9026c6M36809J0.m36175H0())) {
                        c2424z6M9604m0.m11081N((String) C8953m.m36047l(c9026c6M36809J0.m36175H0()));
                    }
                    if (!TextUtils.isEmpty(c9026c6M36809J0.m36167D0())) {
                        c2424z6M9604m0.m11087Q((String) C8953m.m36047l(c9026c6M36809J0.m36167D0()));
                    }
                    if (c9026c6M36809J0.m36171F0() != -2147483648L) {
                        c2424z6M9604m0.m11070F0((int) c9026c6M36809J0.m36171F0());
                    }
                    c2424z6M9604m0.m11089R(c9026c6M36809J0.m36179J0());
                    c2424z6M9604m0.m11082N0(c9026c6M36809J0.m36200b());
                    String strM36233r0 = c9026c6M36809J0.m36233r0();
                    if (!TextUtils.isEmpty(strM36233r0)) {
                        c2424z6M9604m0.m11155z0(strM36233r0);
                    }
                    c2424z6M9604m0.m11096U0(c9026c6M36809J0.m36195X());
                    C9255q8 c9255q8M36542g = c9353waM36513J0.f33516b.m36542g(str2);
                    c2424z6M9604m0.m11111c0(c9026c6M36809J0.m36183L0());
                    if (c9094g7.m36327g() && c9353waM36513J0.f33067a.m36338w().m36419k(c2424z6M9604m0.m11083O()) && c9255q8M36542g.m36656o(EnumC9239p8.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        c2424z6M9604m0.m11074I0(null);
                    }
                    c2424z6M9604m0.m11086P0(c9255q8M36542g.m36653k());
                    if (c9255q8M36542g.m36656o(EnumC9239p8.AD_STORAGE) && c9026c6M36809J0.m36187P()) {
                        Pair pairM36919m = c9197me3.m36517L0().m36919m(c9026c6M36809J0.m36227o0(), c9255q8M36542g);
                        if (c9026c6M36809J0.m36187P() && !TextUtils.isEmpty((CharSequence) pairM36919m.first)) {
                            try {
                                c2424z6M9604m0.m11095U(C9353wa.m37014m((String) pairM36919m.first, Long.toString(zzbgVar.f9505i)));
                                Object obj2 = pairM36919m.second;
                                if (obj2 != null) {
                                    c2424z6M9604m0.m11101X(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                c9353waM36513J0.f33067a.mo36321a().m37010v().m36912b("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                c9197me = c9353waM36513J0.f33516b;
                                c9197me.m36507F0().m36846t0();
                                return bArr;
                            }
                        }
                    }
                    C9094g7 c9094g8 = c9353waM36513J0.f33067a;
                    c9094g8.m36316K().m36455l();
                    c2424z6M9604m0.m11068E(Build.MODEL);
                    c9094g8.m36316K().m36455l();
                    c2424z6M9604m0.m11066D(Build.VERSION.RELEASE);
                    c2424z6M9604m0.m11077K((int) c9094g8.m36316K().m37087o());
                    c2424z6M9604m0.m11075J(c9094g8.m36316K().m37088p());
                    try {
                        if (c9255q8M36542g.m36656o(EnumC9239p8.ANALYTICS_STORAGE) && c9026c6M36809J0.m36229p0() != null) {
                            c2424z6M9604m0.m11107a0(C9353wa.m37014m((String) C8953m.m36047l(c9026c6M36809J0.m36229p0()), Long.toString(zzbgVar.f9505i)));
                        }
                        if (!TextUtils.isEmpty(c9026c6M36809J0.m36245x0())) {
                            c2424z6M9604m0.m11067D0((String) C8953m.m36047l(c9026c6M36809J0.m36245x0()));
                        }
                        String strM36227o0 = c9026c6M36809J0.m36227o0();
                        C9197me c9197me4 = c9353waM36513J0.f33516b;
                        List listM36795C0 = c9197me4.m36507F0().m36795C0(strM36227o0);
                        Iterator it = listM36795C0.iterator();
                        do {
                            if (!it.hasNext()) {
                                c9309te = null;
                                break;
                            }
                            c9309te = (C9309te) it.next();
                        } while (!"_lte".equals(c9309te.f33519c));
                        if (c9309te == null || c9309te.f33521e == null) {
                            C9309te c9309te2 = new C9309te(strM36227o0, "auto", "_lte", c9353waM36513J0.f33067a.mo36325e().mo44175a(), 0L);
                            listM36795C0.add(c9309te2);
                            c9197me4.m36507F0().m36791A0(c9309te2);
                        }
                        C2281r7[] c2281r7Arr = new C2281r7[listM36795C0.size()];
                        for (int i10 = 0; i10 < listM36795C0.size(); i10++) {
                            C2263q7 c2263q7M10605S = C2281r7.m10605S();
                            c2263q7M10605S.m10573z(((C9309te) listM36795C0.get(i10)).f33519c);
                            c2263q7M10605S.m10572x(((C9309te) listM36795C0.get(i10)).f33520d);
                            c9197me4.m36515K0().m36750G(c2263q7M10605S, ((C9309te) listM36795C0.get(i10)).f33521e);
                            c2281r7Arr[i10] = (C2281r7) c2263q7M10605S.m9882t();
                        }
                        c2424z6M9604m0.m11130l1(Arrays.asList(c2281r7Arr));
                        C9197me c9197me5 = c9353waM36513J0.f33516b;
                        c9197me5.m36556n(c9026c6M36809J0, c2424z6M9604m0);
                        c9197me5.m36558o(c9026c6M36809J0, c2424z6M9604m0);
                        C9364x5 c9364x5M37027a = C9364x5.m37027a(zzbgVar);
                        C9094g7 c9094g9 = c9353waM36513J0.f33067a;
                        C9341ve c9341veM36308C = c9094g9.m36308C();
                        Bundle bundle2 = c9364x5M37027a.f33634d;
                        c9341veM36308C.m36982w(bundle2, c9197me4.m36507F0().m36802G(str2));
                        c9094g9.m36308C().m36978u(c9364x5M37027a, c9094g9.m36338w().m36426w(str2));
                        bundle2.putLong("_c", 1L);
                        c9094g9.mo36321a().m37010v().m36911a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = zzbgVar.f9504h;
                        bundle2.putString("_o", str4);
                        if (c9094g9.m36308C().m36947P(c2424z6M9604m0.m11083O(), c9026c6M36809J0.m36221l0())) {
                            c9094g9.m36308C().m36934A(bundle2, "_dbg", 1L);
                            c9094g9.m36308C().m36934A(bundle2, "_r", 1L);
                        }
                        C9294t c9294tM36507F0 = c9197me4.m36507F0();
                        String str5 = zzbgVar.f9502f;
                        C9003b0 c9003b0M36850v0 = c9294tM36507F0.m36850v0(str2, str5);
                        if (c9003b0M36850v0 == null) {
                            c9197me2 = c9197me5;
                            obj = null;
                            bundle = bundle2;
                            str = str4;
                            c9003b0M36117a = new C9003b0(str2, str5, 0L, 0L, 0L, zzbgVar.f9505i, 0L, null, null, null, null);
                            z10 = true;
                            j10 = 0;
                            c2352v6 = c2352v6M10998O;
                        } else {
                            c9197me2 = c9197me5;
                            bundle = bundle2;
                            str = str4;
                            z10 = true;
                            obj = null;
                            c2352v6 = c2352v6M10998O;
                            long j11 = c9003b0M36850v0.f32705f;
                            c9003b0M36117a = c9003b0M36850v0.m36117a(zzbgVar.f9505i);
                            j10 = j11;
                        }
                        C9003b0 c9003b0 = c9003b0M36117a;
                        c9197me4.m36507F0().m36852w0(c9003b0);
                        C9094g7 c9094g10 = c9353waM36513J0.f33067a;
                        boolean z11 = z10;
                        C9197me c9197me6 = c9197me2;
                        try {
                            C8986a0 c8986a0 = new C8986a0(c9094g10, str, str2, str5, zzbgVar.f9505i, j10, bundle);
                            C2208n6 c2208n6M10484R = C2226o6.m10484R();
                            c2208n6M10484R.m10422S(c8986a0.f32663d);
                            c2208n6M10484R.m10419P(c8986a0.f32661b);
                            c2208n6M10484R.m10424U(c8986a0.f32664e);
                            zzbe zzbeVar = c8986a0.f32665f;
                            C9020c0 c9020c0 = new C9020c0(zzbeVar);
                            while (c9020c0.hasNext()) {
                                String next = c9020c0.next();
                                C2280r6 c2280r6M10694T = C2298s6.m10694T();
                                c2280r6M10694T.m10604z(next);
                                Object objM11878a = zzbeVar.m11878a(next);
                                if (objM11878a != null) {
                                    c9197me4.m36515K0().m36751H(c2280r6M10694T, objM11878a);
                                    c2208n6M10484R.m10414G(c2280r6M10694T);
                                }
                            }
                            c2424z6M9604m0.m11110b1(c2208n6M10484R);
                            C1987b7 c1987b7M9916F = C2025d7.m9916F();
                            C2244p6 c2244p6M10562F = C2262q6.m10562F();
                            c2244p6M10562F.m10519z(c9003b0.f32702c);
                            c2244p6M10562F.m10518x(str5);
                            c1987b7M9916F.m9790x(c2244p6M10562F);
                            c2424z6M9604m0.m11079L0(c1987b7M9916F);
                            c2424z6M9604m0.m11063B0(c9197me4.m36511I0().m36284m(c9026c6M36809J0.m36227o0(), Collections.EMPTY_LIST, c2424z6M9604m0.m11118f1(), Long.valueOf(c2208n6M10484R.m10421R()), Long.valueOf(c2208n6M10484R.m10421R()), false));
                            if (c2208n6M10484R.m10420Q()) {
                                c2424z6M9604m0.m11140q1(c2208n6M10484R.m10421R());
                                c2424z6M9604m0.m11144s1(c2208n6M10484R.m10421R());
                            }
                            long jM36163B0 = c9026c6M36809J0.m36163B0();
                            if (jM36163B0 != 0) {
                                c2424z6M9604m0.m11151x(jM36163B0);
                            }
                            long jM36249z0 = c9026c6M36809J0.m36249z0();
                            if (jM36249z0 != 0) {
                                c2424z6M9604m0.m11146t1(jM36249z0);
                            } else if (jM36163B0 != 0) {
                                c2424z6M9604m0.m11146t1(jM36163B0);
                            }
                            String strM36237t0 = c9026c6M36809J0.m36237t0();
                            C2128ig.m10292a();
                            if (c9094g9.m36338w().m36406H(str2, C9395z4.f33732N0) && strM36237t0 != null) {
                                c2424z6M9604m0.m11088Q0(strM36237t0);
                            }
                            c9026c6M36809J0.m36220l();
                            c2424z6M9604m0.m11113d0((int) c9026c6M36809J0.m36210g());
                            c9094g9.m36338w().m36399A();
                            c2424z6M9604m0.m11091S(133005L);
                            c2424z6M9604m0.m11134n1(c9094g9.mo36325e().mo44175a());
                            c2424z6M9604m0.m11062A0(z11);
                            c9197me6.m36575x(c2424z6M9604m0.m11083O(), c2424z6M9604m0);
                            c2352v6.m10842D(c2424z6M9604m0);
                            c9026c6M36809J0.m36161A0(c2424z6M9604m0.m11138p1());
                            c9026c6M36809J0.m36165C0(c2424z6M9604m0.m11142r1());
                            c9197me4.m36507F0().m36811K0(c9026c6M36809J0, false, false);
                            c9197me4.m36507F0().m36844s0();
                            c9197me4.m36507F0().m36846t0();
                            try {
                                return c9197me4.m36515K0().m36762V(((C2406y6) c2352v6.m9882t()).m10628d());
                            } catch (IOException e11) {
                                c9353waM36513J0.f33067a.mo36321a().m37003o().m36913c("Data loss. Failed to bundle and serialize. appId", C9348w5.m36998x(str2), e11);
                                return obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c9353wa = c9353waM36513J0;
                        }
                    } catch (SecurityException e12) {
                        c9353wa = c9353waM36513J0;
                        try {
                            c9353wa.f33067a.mo36321a().m37010v().m36912b("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            c9197me = c9353wa.f33516b;
                            c9197me.m36507F0().m36846t0();
                            return bArr;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } else {
                    c9353waM36513J0.f33067a.mo36321a().m37010v().m36912b("Log and bundle disabled. package_name", str2);
                    bArr2 = new byte[0];
                }
                c9353wa.f33516b.m36507F0().m36846t0();
                throw th;
            }
            c9353waM36513J0.f33067a.mo36321a().m37010v().m36912b("Log and bundle not available. package_name", str2);
            bArr2 = new byte[0];
            c9197me3.m36507F0().m36846t0();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            c9353wa = c9353waM36513J0;
        }
    }
}
