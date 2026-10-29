package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import ca.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new p();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6043f;

    public zzaw(String str) {
        this.f6043f = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            return k.b(this.f6043f, ((zzaw) obj).f6043f);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f6043f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6043f;
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, str, false);
        o9.b.b(parcel, iA);
    }
}
