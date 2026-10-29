package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p045c9.C1578k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C1578k();

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final String f7330f;

    /* JADX INFO: renamed from: g */
    public final GoogleSignInAccount f7331g;

    /* JADX INFO: renamed from: h */
    @Deprecated
    public final String f7332h;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f7331g = googleSignInAccount;
        this.f7330f = C8953m.m36042g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f7332h = C8953m.m36042g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* JADX INFO: renamed from: v3 */
    public final GoogleSignInAccount m9103v3() {
        return this.f7331g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f7330f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 4, str, false);
        C9718b.m38476t(parcel, 7, this.f7331g, i10, false);
        C9718b.m38478v(parcel, 8, this.f7332h, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
