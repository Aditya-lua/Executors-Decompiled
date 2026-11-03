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
    public final String f5675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f5679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PublicKeyCredential f5683n;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f5675f = (String) m.l(str);
        this.f5676g = str2;
        this.f5677h = str3;
        this.f5678i = str4;
        this.f5679j = uri;
        this.f5680k = str5;
        this.f5681l = str6;
        this.f5682m = str7;
        this.f5683n = publicKeyCredential;
    }

    @Deprecated
    public String A3() {
        return this.f5682m;
    }

    public Uri B3() {
        return this.f5679j;
    }

    public PublicKeyCredential C3() {
        return this.f5683n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return n9.k.b(this.f5675f, signInCredential.f5675f) && n9.k.b(this.f5676g, signInCredential.f5676g) && n9.k.b(this.f5677h, signInCredential.f5677h) && n9.k.b(this.f5678i, signInCredential.f5678i) && n9.k.b(this.f5679j, signInCredential.f5679j) && n9.k.b(this.f5680k, signInCredential.f5680k) && n9.k.b(this.f5681l, signInCredential.f5681l) && n9.k.b(this.f5682m, signInCredential.f5682m) && n9.k.b(this.f5683n, signInCredential.f5683n);
    }

    public int hashCode() {
        return n9.k.c(this.f5675f, this.f5676g, this.f5677h, this.f5678i, this.f5679j, this.f5680k, this.f5681l, this.f5682m, this.f5683n);
    }

    public String l() {
        return this.f5676g;
    }

    public String v3() {
        return this.f5678i;
    }

    public String w3() {
        return this.f5677h;
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
        return this.f5681l;
    }

    @NonNull
    public String y3() {
        return this.f5675f;
    }

    public String z3() {
        return this.f5680k;
    }
}
