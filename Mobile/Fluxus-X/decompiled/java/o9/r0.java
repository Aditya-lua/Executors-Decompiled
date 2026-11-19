package o9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends p9.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Account f27026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GoogleSignInAccount f27028i;

    public r0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f27025f = i10;
        this.f27026g = account;
        this.f27027h = i11;
        this.f27028i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f27025f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.t(parcel, 2, this.f27026g, i10, false);
        p9.c.n(parcel, 3, this.f27027h);
        p9.c.t(parcel, 4, this.f27028i, i10, false);
        p9.c.b(parcel, iA);
    }

    public r0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
