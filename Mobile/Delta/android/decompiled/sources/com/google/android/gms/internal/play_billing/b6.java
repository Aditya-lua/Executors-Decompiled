package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b6 implements h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5 f7009a;
    public final t6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g4 f7011d;

    public b6(t6 t6Var, g4 g4Var, x5 x5Var) {
        this.b = t6Var;
        this.f7010c = x5Var instanceof q4;
        this.f7011d = g4Var;
        this.f7009a = x5Var;
    }

    public static b6 g(t6 t6Var, g4 g4Var, x5 x5Var) {
        return new b6(t6Var, g4Var, x5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final boolean a(Object obj) {
        return ((q4) obj).zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void b(Object obj) {
        this.b.b(obj);
        this.f7011d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void c(Object obj, Object obj2) {
        i6.u(this.b, obj, obj2);
        if (this.f7010c) {
            i6.t(this.f7011d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final boolean d(Object obj, Object obj2) {
        if (!((t4) obj).zzc.equals(((t4) obj2).zzc)) {
            return false;
        }
        if (this.f7010c) {
            return ((q4) obj).zzb.equals(((q4) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void e(Object obj, i7 i7Var) {
        Iterator itF = ((q4) obj).zzb.f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            j4 j4Var = (j4) entry.getKey();
            if (j4Var.zzc() != h7.MESSAGE || j4Var.zze() || j4Var.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof a5) {
                i7Var.D(j4Var.zza(), ((a5) entry).a().e());
            } else {
                i7Var.D(j4Var.zza(), entry.getValue());
            }
        }
        ((t4) obj).zzc.k(i7Var);
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void f(Object obj, byte[] bArr, int i10, int i11, f3 f3Var) {
        t4 t4Var = (t4) obj;
        if (t4Var.zzc == u6.c()) {
            t4Var.zzc = u6.f();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int zza(Object obj) {
        int iB = ((t4) obj).zzc.b();
        return this.f7010c ? iB + ((q4) obj).zzb.d() : iB;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int zzb(Object obj) {
        int iHashCode = ((t4) obj).zzc.hashCode();
        return this.f7010c ? (iHashCode * 53) + ((q4) obj).zzb.f7119a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Object zze() {
        x5 x5Var = this.f7009a;
        return x5Var instanceof t4 ? ((t4) x5Var).u() : x5Var.zzw().g();
    }
}
