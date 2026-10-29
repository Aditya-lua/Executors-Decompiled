package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p072d9.C4473a;
import p072d9.C4494v;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C4494v();

    /* JADX INFO: renamed from: f */
    public final String f7336f;

    /* JADX INFO: renamed from: g */
    public final GoogleSignInOptions f7337g;

    public SignInConfiguration(@NonNull String str, @NonNull GoogleSignInOptions googleSignInOptions) {
        this.f7336f = C8953m.m36041f(str);
        this.f7337g = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f7336f.equals(signInConfiguration.f7336f)) {
            GoogleSignInOptions googleSignInOptions = this.f7337g;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f7337g;
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
        return new C4473a().m22420a(this.f7336f).m22420a(this.f7337g).m22421b();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public final GoogleSignInOptions m9105v3() {
        return this.f7337g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f7336f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, str, false);
        C9718b.m38476t(parcel, 5, this.f7337g, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
