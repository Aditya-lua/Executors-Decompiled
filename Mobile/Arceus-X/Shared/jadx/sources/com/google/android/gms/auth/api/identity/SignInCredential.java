package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p598z8.C13747k;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new C13747k();

    /* JADX INFO: renamed from: f */
    public final String f7277f;

    /* JADX INFO: renamed from: g */
    public final String f7278g;

    /* JADX INFO: renamed from: h */
    public final String f7279h;

    /* JADX INFO: renamed from: i */
    public final String f7280i;

    /* JADX INFO: renamed from: j */
    public final Uri f7281j;

    /* JADX INFO: renamed from: k */
    public final String f7282k;

    /* JADX INFO: renamed from: l */
    public final String f7283l;

    /* JADX INFO: renamed from: m */
    public final String f7284m;

    /* JADX INFO: renamed from: n */
    public final PublicKeyCredential f7285n;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f7277f = (String) C8953m.m36047l(str);
        this.f7278g = str2;
        this.f7279h = str3;
        this.f7280i = str4;
        this.f7281j = uri;
        this.f7282k = str5;
        this.f7283l = str6;
        this.f7284m = str7;
        this.f7285n = publicKeyCredential;
    }

    @Deprecated
    /* JADX INFO: renamed from: A3 */
    public String m9052A3() {
        return this.f7284m;
    }

    /* JADX INFO: renamed from: B3 */
    public Uri m9053B3() {
        return this.f7281j;
    }

    /* JADX INFO: renamed from: C3 */
    public PublicKeyCredential m9054C3() {
        return this.f7285n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return C8947k.m36026b(this.f7277f, signInCredential.f7277f) && C8947k.m36026b(this.f7278g, signInCredential.f7278g) && C8947k.m36026b(this.f7279h, signInCredential.f7279h) && C8947k.m36026b(this.f7280i, signInCredential.f7280i) && C8947k.m36026b(this.f7281j, signInCredential.f7281j) && C8947k.m36026b(this.f7282k, signInCredential.f7282k) && C8947k.m36026b(this.f7283l, signInCredential.f7283l) && C8947k.m36026b(this.f7284m, signInCredential.f7284m) && C8947k.m36026b(this.f7285n, signInCredential.f7285n);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7277f, this.f7278g, this.f7279h, this.f7280i, this.f7281j, this.f7282k, this.f7283l, this.f7284m, this.f7285n);
    }

    /* JADX INFO: renamed from: l */
    public String m9055l() {
        return this.f7278g;
    }

    /* JADX INFO: renamed from: v3 */
    public String m9056v3() {
        return this.f7280i;
    }

    /* JADX INFO: renamed from: w3 */
    public String m9057w3() {
        return this.f7279h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, m9059y3(), false);
        C9718b.m38478v(parcel, 2, m9055l(), false);
        C9718b.m38478v(parcel, 3, m9057w3(), false);
        C9718b.m38478v(parcel, 4, m9056v3(), false);
        C9718b.m38476t(parcel, 5, m9053B3(), i10, false);
        C9718b.m38478v(parcel, 6, m9060z3(), false);
        C9718b.m38478v(parcel, 7, m9058x3(), false);
        C9718b.m38478v(parcel, 8, m9052A3(), false);
        C9718b.m38476t(parcel, 9, m9054C3(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public String m9058x3() {
        return this.f7283l;
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public String m9059y3() {
        return this.f7277f;
    }

    /* JADX INFO: renamed from: z3 */
    public String m9060z3() {
        return this.f7282k;
    }
}
