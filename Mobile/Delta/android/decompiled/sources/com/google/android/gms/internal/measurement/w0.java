package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6857a;
    public byte b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6859d;

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 a(boolean z10) {
        this.b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final e1 b() {
        if (this.b == 1 && this.f6857a != null && this.f6858c != 0 && this.f6859d != 0) {
            return new x0(this.f6857a, false, this.f6858c, null, null, this.f6859d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6857a == null) {
            sb2.append(" fileOwner");
        }
        if (this.b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f6858c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f6859d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 c(int i10) {
        this.f6858c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 d(int i10) {
        this.f6859d = 1;
        return this;
    }

    public final c1 e(String str) {
        this.f6857a = "";
        return this;
    }
}
