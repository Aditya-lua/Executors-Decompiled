package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class g6 implements u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5 f7137a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f7138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7139d;

    public g6(x5 x5Var, String str, Object[] objArr) {
        this.f7137a = x5Var;
        this.b = str;
        this.f7138c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f7139d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f7139d = i10 | (cCharAt2 << i12);
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
        return this.f7138c;
    }

    @Override // com.google.android.gms.internal.play_billing.u5
    public final x5 zza() {
        return this.f7137a;
    }

    @Override // com.google.android.gms.internal.play_billing.u5
    public final boolean zzb() {
        return (this.f7139d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.u5
    public final int zzc() {
        int i10 = this.f7139d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
