package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2093h implements InterfaceC2255q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q f8210a;

    /* JADX INFO: renamed from: b */
    public final String f8211b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2093h(String str) {
        this.f8210a = InterfaceC2255q.f8587zo;
        this.f8211b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        return new C2093h(this.f8211b, this.f8210a.mo9950a());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2255q m10154b() {
        return this.f8210a;
    }

    /* JADX INFO: renamed from: c */
    public final String m10155c() {
        return this.f8211b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2093h)) {
            return false;
        }
        C2093h c2093h = (C2093h) obj;
        return this.f8211b.equals(c2093h.f8211b) && this.f8210a.equals(c2093h.f8210a);
    }

    public final int hashCode() {
        return (this.f8211b.hashCode() * 31) + this.f8210a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2093h(String str, InterfaceC2255q interfaceC2255q) {
        this.f8210a = interfaceC2255q;
        this.f8211b = str;
    }
}
