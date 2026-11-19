package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wc implements dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc f6904a;
    public final pd b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa f6906d;

    public wc(pd pdVar, wa waVar, sc scVar) {
        this.b = pdVar;
        this.f6905c = scVar instanceof hb;
        this.f6906d = waVar;
        this.f6904a = scVar;
    }

    public static wc g(pd pdVar, wa waVar, sc scVar) {
        return new wc(pdVar, waVar, scVar);
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final boolean a(Object obj) {
        return ((hb) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final void b(Object obj, Object obj2) {
        fd.d(this.b, obj, obj2);
        if (this.f6905c) {
            fd.c(this.f6906d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final void c(Object obj) {
        this.b.b(obj);
        this.f6906d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final void d(Object obj, byte[] bArr, int i10, int i11, z9 z9Var) {
        kb kbVar = (kb) obj;
        if (kbVar.zzc == qd.a()) {
            kbVar.zzc = qd.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final void e(Object obj, ce ceVar) {
        Iterator itC = ((hb) obj).zzb.c();
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            za zaVar = (za) entry.getKey();
            if (zaVar.zzc() != be.MESSAGE || zaVar.zzd() || zaVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof yb) {
                ceVar.J(zaVar.zza(), ((yb) entry).a().c());
            } else {
                ceVar.J(zaVar.zza(), entry.getValue());
            }
        }
        ((kb) obj).zzc.f(ceVar);
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final boolean f(Object obj, Object obj2) {
        if (!((kb) obj).zzc.equals(((kb) obj2).zzc)) {
            return false;
        }
        if (this.f6905c) {
            return ((hb) obj).zzb.equals(((hb) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final Object zza() {
        sc scVar = this.f6904a;
        return scVar instanceof kb ? ((kb) scVar).m() : scVar.e().T();
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final int zzc(Object obj) {
        int iHashCode = ((kb) obj).zzc.hashCode();
        return this.f6905c ? (iHashCode * 53) + ((hb) obj).zzb.f6373a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final int zze(Object obj) {
        int iH = ((kb) obj).zzc.h();
        return this.f6905c ? iH + ((hb) obj).zzb.g() : iH;
    }
}
