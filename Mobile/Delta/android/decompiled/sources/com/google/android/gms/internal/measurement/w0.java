package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6931a;
    public byte b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6933d;

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 a(boolean z10) {
        this.b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final e1 b() {
        if (this.b == 1 && this.f6931a != null && this.f6932c != 0 && this.f6933d != 0) {
            return new x0(this.f6931a, false, this.f6932c, null, null, this.f6933d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6931a == null) {
            sb2.append(" fileOwner");
        }
        if (this.b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f6932c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f6933d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 c(int i10) {
        this.f6932c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 d(int i10) {
        this.f6933d = 1;
        return this;
    }

    public final c1 e(String str) {
        this.f6931a = "";
        return this;
    }
}
