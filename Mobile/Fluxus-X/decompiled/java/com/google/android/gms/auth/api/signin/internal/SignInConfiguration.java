package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e9.b;
import e9.w;
import o9.s;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GoogleSignInOptions f6102g;

    public SignInConfiguration(@NonNull String str, @NonNull GoogleSignInOptions googleSignInOptions) {
        this.f6101f = s.f(str);
        this.f6102g = googleSignInOptions;
    }

    @NonNull
    public final GoogleSignInOptions A3() {
        return this.f6102g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f6101f.equals(signInConfiguration.f6101f)) {
            GoogleSignInOptions googleSignInOptions = this.f6102g;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f6102g;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f6101f).a(this.f6102g).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6101f;
        int iA = c.a(parcel);
        c.v(parcel, 2, str, false);
        c.t(parcel, 5, this.f6102g, i10, false);
        c.b(parcel, iA);
    }
}
