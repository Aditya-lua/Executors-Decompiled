package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1605r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class UserVerificationMethodExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new C1605r();

    /* JADX INFO: renamed from: f */
    public final boolean f7723f;

    public UserVerificationMethodExtension(boolean z10) {
        this.f7723f = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof UserVerificationMethodExtension) && this.f7723f == ((UserVerificationMethodExtension) obj).f7723f;
    }

    public int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f7723f));
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m9349v3() {
        return this.f7723f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, m9349v3());
        C9718b.m38458b(parcel, iM38457a);
    }
}
