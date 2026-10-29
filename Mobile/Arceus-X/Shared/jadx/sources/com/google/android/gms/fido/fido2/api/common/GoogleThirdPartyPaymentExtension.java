package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1589f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new C1589f();

    /* JADX INFO: renamed from: f */
    public final boolean f7659f;

    public GoogleThirdPartyPaymentExtension(boolean z10) {
        this.f7659f = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.f7659f == ((GoogleThirdPartyPaymentExtension) obj).m9300v3();
    }

    public int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f7659f));
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m9300v3() {
        return this.f7659f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, m9300v3());
        C9718b.m38458b(parcel, iM38457a);
    }
}
