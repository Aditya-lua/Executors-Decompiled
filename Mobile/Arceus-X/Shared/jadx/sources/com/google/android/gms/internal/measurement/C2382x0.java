package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2382x0 extends AbstractC2038e1 {

    /* JADX INFO: renamed from: b */
    public final String f8766b;

    /* JADX INFO: renamed from: c */
    public final int f8767c;

    /* JADX INFO: renamed from: d */
    public final int f8768d;

    public /* synthetic */ C2382x0(String str, boolean z10, int i10, InterfaceC2328u0 interfaceC2328u0, InterfaceC2346v0 interfaceC2346v0, int i11, byte[] bArr) {
        this.f8766b = str;
        this.f8767c = i10;
        this.f8768d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2038e1
    /* JADX INFO: renamed from: a */
    public final String mo9921a() {
        return this.f8766b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2038e1
    /* JADX INFO: renamed from: b */
    public final boolean mo9922b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2038e1
    /* JADX INFO: renamed from: c */
    public final InterfaceC2328u0 mo9923c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2038e1
    /* JADX INFO: renamed from: d */
    public final InterfaceC2346v0 mo9924d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2038e1
    /* JADX INFO: renamed from: e */
    public final int mo9925e() {
        return this.f8767c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2038e1) {
            AbstractC2038e1 abstractC2038e1 = (AbstractC2038e1) obj;
            if (this.f8766b.equals(abstractC2038e1.mo9921a())) {
                abstractC2038e1.mo9922b();
                int i10 = this.f8767c;
                int iMo9925e = abstractC2038e1.mo9925e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iMo9925e) {
                    abstractC2038e1.mo9923c();
                    abstractC2038e1.mo9924d();
                    int i11 = this.f8768d;
                    int iMo9926f = abstractC2038e1.mo9926f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iMo9926f == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2038e1
    /* JADX INFO: renamed from: f */
    public final int mo9926f() {
        return this.f8768d;
    }

    public final int hashCode() {
        int iHashCode = this.f8766b.hashCode() ^ 1000003;
        int i10 = this.f8767c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f8768d != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.f8767c;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f8768d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f8766b;
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
