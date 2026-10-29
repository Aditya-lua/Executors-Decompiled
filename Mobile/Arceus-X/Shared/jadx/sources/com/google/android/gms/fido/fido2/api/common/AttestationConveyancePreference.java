package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");


    @NonNull
    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.f
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return AttestationConveyancePreference.m9251a(parcel.readString());
            } catch (AttestationConveyancePreference.C1921a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new AttestationConveyancePreference[i10];
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f7593a;

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$a */
    public static class C1921a extends Exception {
        public C1921a(@NonNull String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    AttestationConveyancePreference(String str) {
        this.f7593a = str;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static AttestationConveyancePreference m9251a(@NonNull String str) throws C1921a {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.f7593a)) {
                return attestationConveyancePreference;
            }
        }
        throw new C1921a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f7593a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f7593a);
    }
}
