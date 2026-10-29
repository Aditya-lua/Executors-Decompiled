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
    public final int f6027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final short f6028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f6029h;

    public UvmEntry(int i10, short s8, short s10) {
        this.f6027f = i10;
        this.f6028g = s8;
        this.f6029h = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f6027f == uvmEntry.f6027f && this.f6028g == uvmEntry.f6028g && this.f6029h == uvmEntry.f6029h;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f6027f), Short.valueOf(this.f6028g), Short.valueOf(this.f6029h));
    }

    public short v3() {
        return this.f6028g;
    }

    public short w3() {
        return this.f6029h;
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
        return this.f6027f;
    }
}
