package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1587e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C1587e();

    /* JADX INFO: renamed from: f */
    public final boolean f7734f;

    public zzad(boolean z10) {
        this.f7734f = ((Boolean) C8953m.m36047l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzad) && this.f7734f == ((zzad) obj).f7734f;
    }

    public final int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f7734f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f7734f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, z10);
        C9718b.m38458b(parcel, iM38457a);
    }
}
