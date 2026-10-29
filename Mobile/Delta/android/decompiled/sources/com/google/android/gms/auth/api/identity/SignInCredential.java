package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import n9.m;
import z8.k;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f5606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PublicKeyCredential f5610n;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f5602f = (String) m.l(str);
        this.f5603g = str2;
        this.f5604h = str3;
        this.f5605i = str4;
        this.f5606j = uri;
        this.f5607k = str5;
        this.f5608l = str6;
        this.f5609m = str7;
        this.f5610n = publicKeyCredential;
    }

    @Deprecated
    public String A3() {
        return this.f5609m;
    }

    public Uri B3() {
        return this.f5606j;
    }

    public PublicKeyCredential C3() {
        return this.f5610n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return n9.k.b(this.f5602f, signInCredential.f5602f) && n9.k.b(this.f5603g, signInCredential.f5603g) && n9.k.b(this.f5604h, signInCredential.f5604h) && n9.k.b(this.f5605i, signInCredential.f5605i) && n9.k.b(this.f5606j, signInCredential.f5606j) && n9.k.b(this.f5607k, signInCredential.f5607k) && n9.k.b(this.f5608l, signInCredential.f5608l) && n9.k.b(this.f5609m, signInCredential.f5609m) && n9.k.b(this.f5610n, signInCredential.f5610n);
    }

    public int hashCode() {
        return n9.k.c(this.f5602f, this.f5603g, this.f5604h, this.f5605i, this.f5606j, this.f5607k, this.f5608l, this.f5609m, this.f5610n);
    }

    public String l() {
        return this.f5603g;
    }

    public String v3() {
        return this.f5605i;
    }

    public String w3() {
        return this.f5604h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, y3(), false);
        o9.b.v(parcel, 2, l(), false);
        o9.b.v(parcel, 3, w3(), false);
        o9.b.v(parcel, 4, v3(), false);
        o9.b.t(parcel, 5, B3(), i10, false);
        o9.b.v(parcel, 6, z3(), false);
        o9.b.v(parcel, 7, x3(), false);
        o9.b.v(parcel, 8, A3(), false);
        o9.b.t(parcel, 9, C3(), i10, false);
        o9.b.b(parcel, iA);
    }

    public String x3() {
        return this.f5608l;
    }

    @NonNull
    public String y3() {
        return this.f5602f;
    }

    public String z3() {
        return this.f5607k;
    }
}
