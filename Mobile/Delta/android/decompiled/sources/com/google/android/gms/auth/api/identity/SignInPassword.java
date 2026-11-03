package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import z8.m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5685g;

    public SignInPassword(@NonNull String str, @NonNull String str2) {
        this.f5684f = n9.m.g(((String) n9.m.m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f5685g = n9.m.f(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return k.b(this.f5684f, signInPassword.f5684f) && k.b(this.f5685g, signInPassword.f5685g);
    }

    public int hashCode() {
        return k.c(this.f5684f, this.f5685g);
    }

    @NonNull
    public String v3() {
        return this.f5684f;
    }

    @NonNull
    public String w3() {
        return this.f5685g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, v3(), false);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.b(parcel, iA);
    }
}
