package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1601n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new C1601n();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final String f7699f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final String f7700g;

    /* JADX INFO: renamed from: h */
    public final String f7701h;

    public PublicKeyCredentialRpEntity(@NonNull String str, @NonNull String str2, String str3) {
        this.f7699f = (String) C8953m.m36047l(str);
        this.f7700g = (String) C8953m.m36047l(str2);
        this.f7701h = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return C8947k.m36026b(this.f7699f, publicKeyCredentialRpEntity.f7699f) && C8947k.m36026b(this.f7700g, publicKeyCredentialRpEntity.f7700g) && C8947k.m36026b(this.f7701h, publicKeyCredentialRpEntity.f7701h);
    }

    @NonNull
    public String getName() {
        return this.f7700g;
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7699f, this.f7700g, this.f7701h);
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.f7699f + "', \n name='" + this.f7700g + "', \n icon='" + this.f7701h + "'}";
    }

    /* JADX INFO: renamed from: v3 */
    public String m9339v3() {
        return this.f7701h;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public String m9340w3() {
        return this.f7699f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, m9340w3(), false);
        C9718b.m38478v(parcel, 3, getName(), false);
        C9718b.m38478v(parcel, 4, m9339v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
