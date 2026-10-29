package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new ca.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6053f;

    public zzz(boolean z10) {
        this.f6053f = ((Boolean) m.l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.f6053f == ((zzz) obj).f6053f;
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f6053f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f6053f;
        int iA = o9.b.a(parcel);
        o9.b.c(parcel, 1, z10);
        o9.b.b(parcel, iA);
    }
}
