package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1600m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new C1600m();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PublicKeyCredentialType f7697f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final COSEAlgorithmIdentifier f7698g;

    public PublicKeyCredentialParameters(@NonNull String str, int i10) {
        C8953m.m36047l(str);
        try {
            this.f7697f = PublicKeyCredentialType.m9341a(str);
            C8953m.m36047l(Integer.valueOf(i10));
            try {
                this.f7698g = COSEAlgorithmIdentifier.m9295a(i10);
            } catch (COSEAlgorithmIdentifier.C1924a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (PublicKeyCredentialType.C1927a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f7697f.equals(publicKeyCredentialParameters.f7697f) && this.f7698g.equals(publicKeyCredentialParameters.f7698g);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7697f, this.f7698g);
    }

    @NonNull
    public final String toString() {
        COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.f7698g;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.f7697f) + ", \n algorithm=" + String.valueOf(cOSEAlgorithmIdentifier) + "\n }";
    }

    /* JADX INFO: renamed from: v3 */
    public int m9337v3() {
        return this.f7698g.m9296f();
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public String m9338w3() {
        return this.f7697f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, m9338w3(), false);
        C9718b.m38473q(parcel, 3, Integer.valueOf(m9337v3()), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
