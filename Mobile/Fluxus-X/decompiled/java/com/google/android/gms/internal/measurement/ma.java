package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ma extends na {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6618d;

    public /* synthetic */ ma(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f6618d = Integer.MAX_VALUE;
        this.b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f6618d;
        this.f6618d = 0;
        int i12 = this.b + this.f6617c;
        this.b = i12;
        if (i12 <= 0) {
            this.f6617c = 0;
            return i11;
        }
        this.f6617c = i12;
        this.b = 0;
        return i11;
    }
}
