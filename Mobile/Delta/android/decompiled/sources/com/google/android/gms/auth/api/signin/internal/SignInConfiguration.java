package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.a;
import d9.v;
import n9.m;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GoogleSignInOptions f5734g;

    public SignInConfiguration(@NonNull String str, @NonNull GoogleSignInOptions googleSignInOptions) {
        this.f5733f = m.f(str);
        this.f5734g = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f5733f.equals(signInConfiguration.f5733f)) {
            GoogleSignInOptions googleSignInOptions = this.f5734g;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f5734g;
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
        return new a().a(this.f5733f).a(this.f5734g).b();
    }

    @NonNull
    public final GoogleSignInOptions v3() {
        return this.f5734g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f5733f;
        int iA = b.a(parcel);
        b.v(parcel, 2, str, false);
        b.t(parcel, 5, this.f5734g, i10, false);
        b.b(parcel, iA);
    }
}
