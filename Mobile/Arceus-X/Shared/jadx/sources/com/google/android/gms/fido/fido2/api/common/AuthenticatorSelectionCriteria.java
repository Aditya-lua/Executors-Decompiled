package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1588e0;
import ca.C1607t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new C1588e0();

    /* JADX INFO: renamed from: f */
    public final Attachment f7636f;

    /* JADX INFO: renamed from: g */
    public final Boolean f7637g;

    /* JADX INFO: renamed from: h */
    public final UserVerificationRequirement f7638h;

    /* JADX INFO: renamed from: i */
    public final ResidentKeyRequirement f7639i;

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria$a */
    public static class C1923a {

        /* JADX INFO: renamed from: a */
        public Attachment f7640a;

        /* JADX INFO: renamed from: b */
        public Boolean f7641b;

        /* JADX INFO: renamed from: c */
        public ResidentKeyRequirement f7642c;

        @NonNull
        /* JADX INFO: renamed from: a */
        public AuthenticatorSelectionCriteria m9291a() {
            Attachment attachment = this.f7640a;
            String string = attachment == null ? null : attachment.toString();
            Boolean bool = this.f7641b;
            ResidentKeyRequirement residentKeyRequirement = this.f7642c;
            return new AuthenticatorSelectionCriteria(string, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1923a m9292b(Attachment attachment) {
            this.f7640a = attachment;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1923a m9293c(Boolean bool) {
            this.f7641b = bool;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C1923a m9294d(ResidentKeyRequirement residentKeyRequirement) {
            this.f7642c = residentKeyRequirement;
            return this;
        }
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentM9250a;
        ResidentKeyRequirement residentKeyRequirementM9345a = null;
        if (str == null) {
            attachmentM9250a = null;
        } else {
            try {
                attachmentM9250a = Attachment.m9250a(str);
            } catch (C1607t | Attachment.C1920a | ResidentKeyRequirement.C1928a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f7636f = attachmentM9250a;
        this.f7637g = bool;
        this.f7638h = str2 == null ? null : UserVerificationRequirement.m9350a(str2);
        if (str3 != null) {
            residentKeyRequirementM9345a = ResidentKeyRequirement.m9345a(str3);
        }
        this.f7639i = residentKeyRequirementM9345a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return C8947k.m36026b(this.f7636f, authenticatorSelectionCriteria.f7636f) && C8947k.m36026b(this.f7637g, authenticatorSelectionCriteria.f7637g) && C8947k.m36026b(this.f7638h, authenticatorSelectionCriteria.f7638h) && C8947k.m36026b(m9289x3(), authenticatorSelectionCriteria.m9289x3());
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7636f, this.f7637g, this.f7638h, m9289x3());
    }

    @NonNull
    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.f7639i;
        UserVerificationRequirement userVerificationRequirement = this.f7638h;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.f7636f) + ", \n requireResidentKey=" + this.f7637g + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    /* JADX INFO: renamed from: v3 */
    public String m9287v3() {
        Attachment attachment = this.f7636f;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    /* JADX INFO: renamed from: w3 */
    public Boolean m9288w3() {
        return this.f7637g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, m9287v3(), false);
        C9718b.m38461e(parcel, 3, m9288w3(), false);
        UserVerificationRequirement userVerificationRequirement = this.f7638h;
        C9718b.m38478v(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        C9718b.m38478v(parcel, 5, m9290y3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public ResidentKeyRequirement m9289x3() {
        ResidentKeyRequirement residentKeyRequirement = this.f7639i;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f7637g;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    /* JADX INFO: renamed from: y3 */
    public String m9290y3() {
        ResidentKeyRequirement residentKeyRequirementM9289x3 = m9289x3();
        if (residentKeyRequirementM9289x3 == null) {
            return null;
        }
        return residentKeyRequirementM9289x3.toString();
    }
}
