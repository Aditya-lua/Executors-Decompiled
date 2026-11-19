package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f6526a;
    public final String b;

    public h(String str) {
        this.f6526a = q.Co;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return new h(this.b, this.f6526a.a());
    }

    public final q b() {
        return this.f6526a;
    }

    public final String c() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, y4 y4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.b.equals(hVar.b) && this.f6526a.equals(hVar.f6526a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f6526a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return null;
    }

    public h(String str, q qVar) {
        this.f6526a = qVar;
        this.b = str;
    }
}
