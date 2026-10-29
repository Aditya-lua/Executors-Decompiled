package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY("public-key");


    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.c
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return PublicKeyCredentialType.m9341a(parcel.readString());
            } catch (PublicKeyCredentialType.C1927a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new PublicKeyCredentialType[i10];
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f7704a = "public-key";

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$a */
    public static class C1927a extends Exception {
        public C1927a(@NonNull String str) {
            super(str);
        }
    }

    PublicKeyCredentialType(String str) {
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static PublicKeyCredentialType m9341a(@NonNull String str) throws C1927a {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.f7704a)) {
                return publicKeyCredentialType;
            }
        }
        throw new C1927a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f7704a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f7704a);
    }
}
