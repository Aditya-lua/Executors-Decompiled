package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public class UserVerificationMethodExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6021f;

    public UserVerificationMethodExtension(boolean z10) {
        this.f6021f = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof UserVerificationMethodExtension) && this.f6021f == ((UserVerificationMethodExtension) obj).f6021f;
    }

    public int hashCode() {
        return k.c(Boolean.valueOf(this.f6021f));
    }

    public boolean v3() {
        return this.f6021f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.c(parcel, 1, v3());
        o9.b.b(parcel, iA);
    }
}
