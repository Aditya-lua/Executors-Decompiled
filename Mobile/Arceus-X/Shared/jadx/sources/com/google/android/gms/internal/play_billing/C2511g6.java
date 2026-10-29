package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2511g6 implements InterfaceC2664u5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2697x5 f8996a;

    /* JADX INFO: renamed from: b */
    public final String f8997b;

    /* JADX INFO: renamed from: c */
    public final Object[] f8998c;

    /* JADX INFO: renamed from: d */
    public final int f8999d;

    public C2511g6(InterfaceC2697x5 interfaceC2697x5, String str, Object[] objArr) {
        this.f8996a = interfaceC2697x5;
        this.f8997b = str;
        this.f8998c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8999d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f8999d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m11438a() {
        return this.f8997b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m11439b() {
        return this.f8998c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2664u5
    public final InterfaceC2697x5 zza() {
        return this.f8996a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2664u5
    public final boolean zzb() {
        return (this.f8999d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2664u5
    public final int zzc() {
        int i10 = this.f8999d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
