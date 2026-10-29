package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ia */
/* JADX INFO: loaded from: classes.dex */
public final class C2123ia extends C2140ja {

    /* JADX INFO: renamed from: b */
    public int f8246b;

    /* JADX INFO: renamed from: c */
    public int f8247c;

    /* JADX INFO: renamed from: d */
    public int f8248d;

    public /* synthetic */ C2123ia(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f8248d = Integer.MAX_VALUE;
        this.f8246b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m10284c(int i10) {
        int i11 = this.f8248d;
        this.f8248d = 0;
        int i12 = this.f8246b + this.f8247c;
        this.f8246b = i12;
        if (i12 <= 0) {
            this.f8247c = 0;
            return i11;
        }
        this.f8247c = i12;
        this.f8246b = 0;
        return i11;
    }
}
