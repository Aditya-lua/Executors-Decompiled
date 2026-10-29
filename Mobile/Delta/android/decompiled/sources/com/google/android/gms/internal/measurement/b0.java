package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f6387a;
    public final /* synthetic */ u4 b;

    public b0(k kVar, u4 u4Var) {
        this.f6387a = kVar;
        this.b = u4Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        if (qVar instanceof v) {
            return !(qVar2 instanceof v) ? 1 : 0;
        }
        if (qVar2 instanceof v) {
            return -1;
        }
        k kVar = this.f6387a;
        return kVar == null ? qVar.zzc().compareTo(qVar2.zzc()) : (int) v5.i(kVar.h(this.b, Arrays.asList(qVar, qVar2)).zzd().doubleValue());
    }
}
