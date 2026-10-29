package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1607t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;

/* JADX INFO: loaded from: classes.dex */
public enum UserVerificationRequirement implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");


    @NonNull
    public static final Parcelable.Creator<UserVerificationRequirement> CREATOR = new Parcelable.Creator() { // from class: ca.s
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return UserVerificationRequirement.m9350a(parcel.readString());
            } catch (C1607t e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new UserVerificationRequirement[i10];
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f7728a;

    UserVerificationRequirement(String str) {
        this.f7728a = str;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static UserVerificationRequirement m9350a(@NonNull String str) throws C1607t {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.f7728a)) {
                return userVerificationRequirement;
            }
        }
        throw new C1607t(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return this.f7728a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f7728a);
    }
}
