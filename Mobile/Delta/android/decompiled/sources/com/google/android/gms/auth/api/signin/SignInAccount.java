package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import c9.k;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final String f5654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GoogleSignInAccount f5655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public final String f5656h;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5655g = googleSignInAccount;
        this.f5654f = m.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5656h = m.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount v3() {
        return this.f5655g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f5654f;
        int iA = b.a(parcel);
        b.v(parcel, 4, str, false);
        b.t(parcel, 7, this.f5655g, i10, false);
        b.v(parcel, 8, this.f5656h, false);
        b.b(parcel, iA);
    }
}
