package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1603p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C1603p();

    /* JADX INFO: renamed from: f */
    public final String f7746f;

    public zzaw(String str) {
        this.f7746f = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            return C8947k.m36026b(this.f7746f, ((zzaw) obj).f7746f);
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7746f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7746f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
