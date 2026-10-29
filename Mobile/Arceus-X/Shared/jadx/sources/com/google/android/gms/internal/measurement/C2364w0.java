package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2364w0 extends AbstractC2000c1 {

    /* JADX INFO: renamed from: a */
    public String f8725a;

    /* JADX INFO: renamed from: b */
    public byte f8726b;

    /* JADX INFO: renamed from: c */
    public int f8727c;

    /* JADX INFO: renamed from: d */
    public int f8728d;

    @Override // com.google.android.gms.internal.measurement.AbstractC2000c1
    /* JADX INFO: renamed from: a */
    public final AbstractC2000c1 mo9838a(boolean z10) {
        this.f8726b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2000c1
    /* JADX INFO: renamed from: b */
    public final AbstractC2038e1 mo9839b() {
        if (this.f8726b == 1 && this.f8725a != null && this.f8727c != 0 && this.f8728d != 0) {
            return new C2382x0(this.f8725a, false, this.f8727c, null, null, this.f8728d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8725a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f8726b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f8727c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f8728d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2000c1
    /* JADX INFO: renamed from: c */
    public final AbstractC2000c1 mo9840c(int i10) {
        this.f8727c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2000c1
    /* JADX INFO: renamed from: d */
    public final AbstractC2000c1 mo9841d(int i10) {
        this.f8728d = 1;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2000c1 m10872e(String str) {
        this.f8725a = "";
        return this;
    }
}
