package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");


    @NonNull
    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.d
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            try {
                return ResidentKeyRequirement.m9345a(string);
            } catch (ResidentKeyRequirement.C1928a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ResidentKeyRequirement[i10];
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f7713a;

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$a */
    public static class C1928a extends Exception {
        public C1928a(@NonNull String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    ResidentKeyRequirement(String str) {
        this.f7713a = str;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ResidentKeyRequirement m9345a(@NonNull String str) throws C1928a {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.f7713a)) {
                return residentKeyRequirement;
            }
        }
        throw new C1928a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f7713a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f7713a);
    }
}
