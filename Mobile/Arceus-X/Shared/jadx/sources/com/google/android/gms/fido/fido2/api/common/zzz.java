package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1583c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C1583c();

    /* JADX INFO: renamed from: f */
    public final boolean f7756f;

    public zzz(boolean z10) {
        this.f7756f = ((Boolean) C8953m.m36047l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.f7756f == ((zzz) obj).f7756f;
    }

    public final int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f7756f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f7756f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, z10);
        C9718b.m38458b(parcel, iM38457a);
    }
}
