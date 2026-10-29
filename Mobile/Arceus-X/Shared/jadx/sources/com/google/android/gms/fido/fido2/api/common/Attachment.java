package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");


    @NonNull
    public static final Parcelable.Creator<Attachment> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.b
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Attachment.m9250a(parcel.readString());
            } catch (Attachment.C1920a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new Attachment[i10];
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f7588a;

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.Attachment$a */
    public static class C1920a extends Exception {
        public C1920a(@NonNull String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    Attachment(String str) {
        this.f7588a = str;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Attachment m9250a(@NonNull String str) throws C1920a {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.f7588a)) {
                return attachment;
            }
        }
        throw new C1920a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f7588a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f7588a);
    }
}
