package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PublicKeyCredentialType f5998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final COSEAlgorithmIdentifier f5999g;

    public PublicKeyCredentialParameters(@NonNull String str, int i10) {
        n9.m.l(str);
        try {
            this.f5998f = PublicKeyCredentialType.a(str);
            n9.m.l(Integer.valueOf(i10));
            try {
                this.f5999g = COSEAlgorithmIdentifier.a(i10);
            } catch (COSEAlgorithmIdentifier.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (PublicKeyCredentialType.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f5998f.equals(publicKeyCredentialParameters.f5998f) && this.f5999g.equals(publicKeyCredentialParameters.f5999g);
    }

    public int hashCode() {
        return k.c(this.f5998f, this.f5999g);
    }

    @NonNull
    public final String toString() {
        COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.f5999g;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.f5998f) + ", \n algorithm=" + String.valueOf(cOSEAlgorithmIdentifier) + "\n }";
    }

    public int v3() {
        return this.f5999g.f();
    }

    @NonNull
    public String w3() {
        return this.f5998f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.q(parcel, 3, Integer.valueOf(v3()), false);
        o9.b.b(parcel, iA);
    }
}
