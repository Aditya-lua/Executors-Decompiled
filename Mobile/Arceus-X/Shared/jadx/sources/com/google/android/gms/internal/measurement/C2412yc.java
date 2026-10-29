package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.yc */
/* JADX INFO: loaded from: classes.dex */
public final class C2412yc implements InterfaceC2178lc {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2232oc f8868a;

    /* JADX INFO: renamed from: b */
    public final String f8869b;

    /* JADX INFO: renamed from: c */
    public final Object[] f8870c;

    /* JADX INFO: renamed from: d */
    public final int f8871d;

    public C2412yc(InterfaceC2232oc interfaceC2232oc, String str, Object[] objArr) {
        this.f8868a = interfaceC2232oc;
        this.f8869b = str;
        this.f8870c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8871d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f8871d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m11025a() {
        return this.f8869b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m11026b() {
        return this.f8870c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2178lc
    public final boolean zza() {
        return (this.f8871d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2178lc
    public final InterfaceC2232oc zzb() {
        return this.f8868a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2178lc
    public final int zzc() {
        int i10 = this.f8871d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
