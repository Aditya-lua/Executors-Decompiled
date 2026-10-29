package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class yc implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oc f6958a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6960d;

    public yc(oc ocVar, String str, Object[] objArr) {
        this.f6958a = ocVar;
        this.b = str;
        this.f6959c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6960d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f6960d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final String a() {
        return this.b;
    }

    public final Object[] b() {
        return this.f6959c;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final boolean zza() {
        return (this.f6960d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final oc zzb() {
        return this.f6958a;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final int zzc() {
        int i10 = this.f6960d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
