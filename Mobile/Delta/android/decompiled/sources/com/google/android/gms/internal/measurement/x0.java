package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends e1 {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6894d;

    public /* synthetic */ x0(String str, boolean z10, int i10, u0 u0Var, v0 v0Var, int i11, byte[] bArr) {
        this.b = str;
        this.f6893c = i10;
        this.f6894d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final u0 c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final v0 d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final int e() {
        return this.f6893c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            if (this.b.equals(e1Var.a())) {
                e1Var.b();
                int i10 = this.f6893c;
                int iE = e1Var.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    e1Var.c();
                    e1Var.d();
                    int i11 = this.f6894d;
                    int iF = e1Var.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final int f() {
        return this.f6894d;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        int i10 = this.f6893c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f6894d != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.f6893c;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f6894d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
