package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sc implements zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oc f6785a;
    public final ld b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sa f6787d;

    public sc(ld ldVar, sa saVar, oc ocVar) {
        this.b = ldVar;
        this.f6786c = ocVar instanceof db;
        this.f6787d = saVar;
        this.f6785a = ocVar;
    }

    public static sc g(ld ldVar, sa saVar, oc ocVar) {
        return new sc(ldVar, saVar, ocVar);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean a(Object obj) {
        return ((db) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void b(Object obj, Object obj2) {
        bd.d(this.b, obj, obj2);
        if (this.f6786c) {
            bd.c(this.f6787d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void c(Object obj) {
        this.b.b(obj);
        this.f6787d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void d(Object obj, byte[] bArr, int i10, int i11, v9 v9Var) {
        gb gbVar = (gb) obj;
        if (gbVar.zzc == md.a()) {
            gbVar.zzc = md.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void e(Object obj, yd ydVar) {
        Iterator itC = ((db) obj).zzb.c();
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            va vaVar = (va) entry.getKey();
            if (vaVar.zzc() != xd.MESSAGE || vaVar.zzd() || vaVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof ub) {
                ydVar.J(vaVar.zza(), ((ub) entry).a().c());
            } else {
                ydVar.J(vaVar.zza(), entry.getValue());
            }
        }
        ((gb) obj).zzc.f(ydVar);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean f(Object obj, Object obj2) {
        if (!((gb) obj).zzc.equals(((gb) obj2).zzc)) {
            return false;
        }
        if (this.f6786c) {
            return ((db) obj).zzb.equals(((db) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final Object zza() {
        oc ocVar = this.f6785a;
        return ocVar instanceof gb ? ((gb) ocVar).n() : ocVar.e().M();
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final int zzc(Object obj) {
        int iHashCode = ((gb) obj).zzc.hashCode();
        return this.f6786c ? (iHashCode * 53) + ((db) obj).zzb.f6867a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final int zze(Object obj) {
        int iH = ((gb) obj).zzc.h();
        return this.f6786c ? iH + ((db) obj).zzb.g() : iH;
    }
}
