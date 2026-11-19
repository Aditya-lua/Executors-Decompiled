package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.k;
import o9.s;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends p9.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final String f6098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GoogleSignInAccount f6099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public final String f6100h;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f6099g = googleSignInAccount;
        this.f6098f = s.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f6100h = s.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount A3() {
        return this.f6099g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6098f;
        int iA = c.a(parcel);
        c.v(parcel, 4, str, false);
        c.t(parcel, 7, this.f6099g, i10, false);
        c.v(parcel, 8, this.f6100h, false);
        c.b(parcel, iA);
    }
}
