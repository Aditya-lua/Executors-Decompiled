package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1596i0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new C1596i0();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final String f7658f;

    public FidoAppIdExtension(@NonNull String str) {
        this.f7658f = (String) C8953m.m36047l(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f7658f.equals(((FidoAppIdExtension) obj).f7658f);
        }
        return false;
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7658f);
    }

    @NonNull
    public final String toString() {
        return "FidoAppIdExtension{appid='" + this.f7658f + "'}";
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public String m9299v3() {
        return this.f7658f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, m9299v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
