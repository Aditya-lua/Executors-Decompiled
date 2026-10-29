package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t3 */
/* JADX INFO: loaded from: classes.dex */
public class C2651t3 extends C2684w3 {

    /* JADX INFO: renamed from: b */
    public int f9387b;

    /* JADX INFO: renamed from: c */
    public int f9388c;

    /* JADX INFO: renamed from: d */
    public int f9389d;

    public /* synthetic */ C2651t3(byte[] bArr, int i10, int i11, boolean z10, C2673v3 c2673v3) {
        super(null);
        this.f9389d = Integer.MAX_VALUE;
        this.f9387b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m11737c(int i10) {
        int i11 = this.f9389d;
        this.f9389d = 0;
        int i12 = this.f9387b + this.f9388c;
        this.f9387b = i12;
        if (i12 <= 0) {
            this.f9388c = 0;
            return i11;
        }
        this.f9388c = i12;
        this.f9387b = 0;
        return i11;
    }
}
