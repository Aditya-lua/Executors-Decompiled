package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new o();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f6078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f6079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final String f6081i;

    public PublicKeyCredentialUserEntity(m3 m3Var, String str, String str2, String str3) {
        this.f6078f = (m3) m.l(m3Var);
        this.f6079g = (String) m.l(str);
        this.f6080h = str2;
        this.f6081i = (String) m.l(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return k.b(this.f6078f, publicKeyCredentialUserEntity.f6078f) && k.b(this.f6079g, publicKeyCredentialUserEntity.f6079g) && k.b(this.f6080h, publicKeyCredentialUserEntity.f6080h) && k.b(this.f6081i, publicKeyCredentialUserEntity.f6081i);
    }

    @NonNull
    public String getName() {
        return this.f6079g;
    }

    public int hashCode() {
        return k.c(this.f6078f, this.f6079g, this.f6080h, this.f6081i);
    }

    @NonNull
    public String l() {
        return this.f6081i;
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + u9.c.b(this.f6078f.p()) + ", \n name='" + this.f6079g + "', \n icon='" + this.f6080h + "', \n displayName='" + this.f6081i + "'}";
    }

    public String v3() {
        return this.f6080h;
    }

    @NonNull
    public byte[] w3() {
        return this.f6078f.p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.g(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, getName(), false);
        o9.b.v(parcel, 4, v3(), false);
        o9.b.v(parcel, 5, l(), false);
        o9.b.b(parcel, iA);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublicKeyCredentialUserEntity(@NonNull byte[] bArr, @NonNull String str, String str2, @NonNull String str3) {
        byte[] bArr2 = (byte[]) m.l(bArr);
        m3 m3Var = m3.b;
        this(m3.m(bArr2, 0, bArr2.length), str, str2, str3);
    }
}
