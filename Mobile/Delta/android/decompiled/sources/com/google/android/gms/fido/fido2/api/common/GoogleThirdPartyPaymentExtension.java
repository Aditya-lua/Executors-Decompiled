package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new ca.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5961f;

    public GoogleThirdPartyPaymentExtension(boolean z10) {
        this.f5961f = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.f5961f == ((GoogleThirdPartyPaymentExtension) obj).v3();
    }

    public int hashCode() {
        return k.c(Boolean.valueOf(this.f5961f));
    }

    public boolean v3() {
        return this.f5961f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.c(parcel, 1, v3());
        o9.b.b(parcel, iA);
    }
}
