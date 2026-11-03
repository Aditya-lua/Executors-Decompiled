package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ia extends ja {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6567d;

    public /* synthetic */ ia(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f6567d = Integer.MAX_VALUE;
        this.b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f6567d;
        this.f6567d = 0;
        int i12 = this.b + this.f6566c;
        this.b = i12;
        if (i12 <= 0) {
            this.f6566c = 0;
            return i11;
        }
        this.f6566c = i12;
        this.b = 0;
        return i11;
    }
}
