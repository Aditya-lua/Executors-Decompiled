package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1593h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p100eb.AbstractC4923e4;
import p100eb.AbstractC4970m3;
import p305n9.C8947k;
import p325o9.C9718b;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C1593h();

    /* JADX INFO: renamed from: j */
    public static final AbstractC4923e4 f7736j = AbstractC4923e4.m23580h(1);

    /* JADX INFO: renamed from: k */
    public static final AbstractC4923e4 f7737k = AbstractC4923e4.m23580h(2);

    /* JADX INFO: renamed from: l */
    public static final AbstractC4923e4 f7738l = AbstractC4923e4.m23580h(3);

    /* JADX INFO: renamed from: m */
    public static final AbstractC4923e4 f7739m = AbstractC4923e4.m23580h(4);

    /* JADX INFO: renamed from: f */
    public final AbstractC4970m3 f7740f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4970m3 f7741g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4970m3 f7742h;

    /* JADX INFO: renamed from: i */
    public final int f7743i;

    public zzai(AbstractC4970m3 abstractC4970m3, AbstractC4970m3 abstractC4970m4, AbstractC4970m3 abstractC4970m5, int i10) {
        this.f7740f = abstractC4970m3;
        this.f7741g = abstractC4970m4;
        this.f7742h = abstractC4970m5;
        this.f7743i = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return C8947k.m36026b(this.f7740f, zzaiVar.f7740f) && C8947k.m36026b(this.f7741g, zzaiVar.f7741g) && C8947k.m36026b(this.f7742h, zzaiVar.f7742h) && this.f7743i == zzaiVar.f7743i;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7740f, this.f7741g, this.f7742h, Integer.valueOf(this.f7743i));
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + C11812c.m44172b(m9356v3()) + ", saltEnc=" + C11812c.m44172b(m9358x3()) + ", saltAuth=" + C11812c.m44172b(m9357w3()) + ", getPinUvAuthProtocol=" + this.f7743i + "}";
    }

    /* JADX INFO: renamed from: v3 */
    public final byte[] m9356v3() {
        AbstractC4970m3 abstractC4970m3 = this.f7740f;
        if (abstractC4970m3 == null) {
            return null;
        }
        return abstractC4970m3.m23675p();
    }

    /* JADX INFO: renamed from: w3 */
    public final byte[] m9357w3() {
        AbstractC4970m3 abstractC4970m3 = this.f7742h;
        if (abstractC4970m3 == null) {
            return null;
        }
        return abstractC4970m3.m23675p();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38463g(parcel, 1, m9356v3(), false);
        C9718b.m38463g(parcel, 2, m9358x3(), false);
        C9718b.m38463g(parcel, 3, m9357w3(), false);
        C9718b.m38470n(parcel, 4, this.f7743i);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public final byte[] m9358x3() {
        AbstractC4970m3 abstractC4970m3 = this.f7741g;
        if (abstractC4970m3 == null) {
            return null;
        }
        return abstractC4970m3.m23675p();
    }
}
