package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f6000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f6001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6002h;

    public PublicKeyCredentialRpEntity(@NonNull String str, @NonNull String str2, String str3) {
        this.f6000f = (String) m.l(str);
        this.f6001g = (String) m.l(str2);
        this.f6002h = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return k.b(this.f6000f, publicKeyCredentialRpEntity.f6000f) && k.b(this.f6001g, publicKeyCredentialRpEntity.f6001g) && k.b(this.f6002h, publicKeyCredentialRpEntity.f6002h);
    }

    @NonNull
    public String getName() {
        return this.f6001g;
    }

    public int hashCode() {
        return k.c(this.f6000f, this.f6001g, this.f6002h);
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.f6000f + "', \n name='" + this.f6001g + "', \n icon='" + this.f6002h + "'}";
    }

    public String v3() {
        return this.f6002h;
    }

    @NonNull
    public String w3() {
        return this.f6000f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, getName(), false);
        o9.b.v(parcel, 4, v3(), false);
        o9.b.b(parcel, iA);
    }
}
