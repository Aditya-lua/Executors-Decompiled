package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p598z8.C13749m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new C13749m();

    /* JADX INFO: renamed from: f */
    public final String f7286f;

    /* JADX INFO: renamed from: g */
    public final String f7287g;

    public SignInPassword(@NonNull String str, @NonNull String str2) {
        this.f7286f = C8953m.m36042g(((String) C8953m.m36048m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f7287g = C8953m.m36041f(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return C8947k.m36026b(this.f7286f, signInPassword.f7286f) && C8947k.m36026b(this.f7287g, signInPassword.f7287g);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7286f, this.f7287g);
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public String m9061v3() {
        return this.f7286f;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public String m9062w3() {
        return this.f7287g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, m9061v3(), false);
        C9718b.m38478v(parcel, 2, m9062w3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
