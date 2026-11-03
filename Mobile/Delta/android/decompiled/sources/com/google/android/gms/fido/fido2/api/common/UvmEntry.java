package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final short f6101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f6102h;

    public UvmEntry(int i10, short s8, short s10) {
        this.f6100f = i10;
        this.f6101g = s8;
        this.f6102h = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f6100f == uvmEntry.f6100f && this.f6101g == uvmEntry.f6101g && this.f6102h == uvmEntry.f6102h;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f6100f), Short.valueOf(this.f6101g), Short.valueOf(this.f6102h));
    }

    public short v3() {
        return this.f6101g;
    }

    public short w3() {
        return this.f6102h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, x3());
        o9.b.u(parcel, 2, v3());
        o9.b.u(parcel, 3, w3());
        o9.b.b(parcel, iA);
    }

    public int x3() {
        return this.f6100f;
    }
}
