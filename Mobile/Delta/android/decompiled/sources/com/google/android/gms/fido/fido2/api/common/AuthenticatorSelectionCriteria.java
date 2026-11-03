package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.e0;
import ca.t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Attachment f6013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f6014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UserVerificationRequirement f6015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ResidentKeyRequirement f6016i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Attachment f6017a;
        public Boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ResidentKeyRequirement f6018c;

        @NonNull
        public AuthenticatorSelectionCriteria a() {
            Attachment attachment = this.f6017a;
            String string = attachment == null ? null : attachment.toString();
            Boolean bool = this.b;
            ResidentKeyRequirement residentKeyRequirement = this.f6018c;
            return new AuthenticatorSelectionCriteria(string, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        @NonNull
        public a b(Attachment attachment) {
            this.f6017a = attachment;
            return this;
        }

        @NonNull
        public a c(Boolean bool) {
            this.b = bool;
            return this;
        }

        @NonNull
        public a d(ResidentKeyRequirement residentKeyRequirement) {
            this.f6018c = residentKeyRequirement;
            return this;
        }
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentA;
        ResidentKeyRequirement residentKeyRequirementA = null;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (t | Attachment.a | ResidentKeyRequirement.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f6013f = attachmentA;
        this.f6014g = bool;
        this.f6015h = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirementA = ResidentKeyRequirement.a(str3);
        }
        this.f6016i = residentKeyRequirementA;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return k.b(this.f6013f, authenticatorSelectionCriteria.f6013f) && k.b(this.f6014g, authenticatorSelectionCriteria.f6014g) && k.b(this.f6015h, authenticatorSelectionCriteria.f6015h) && k.b(x3(), authenticatorSelectionCriteria.x3());
    }

    public int hashCode() {
        return k.c(this.f6013f, this.f6014g, this.f6015h, x3());
    }

    @NonNull
    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.f6016i;
        UserVerificationRequirement userVerificationRequirement = this.f6015h;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.f6013f) + ", \n requireResidentKey=" + this.f6014g + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    public String v3() {
        Attachment attachment = this.f6013f;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean w3() {
        return this.f6014g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, v3(), false);
        o9.b.e(parcel, 3, w3(), false);
        UserVerificationRequirement userVerificationRequirement = this.f6015h;
        o9.b.v(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        o9.b.v(parcel, 5, y3(), false);
        o9.b.b(parcel, iA);
    }

    public ResidentKeyRequirement x3() {
        ResidentKeyRequirement residentKeyRequirement = this.f6016i;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f6014g;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public String y3() {
        ResidentKeyRequirement residentKeyRequirementX3 = x3();
        if (residentKeyRequirementX3 == null) {
            return null;
        }
        return residentKeyRequirementX3.toString();
    }
}
