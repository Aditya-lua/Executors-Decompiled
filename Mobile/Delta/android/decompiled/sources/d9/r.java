package d9;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends ya.s implements s {
    public r() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // ya.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ya.t.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) ya.t.a(parcel, Status.CREATOR);
                ya.t.b(parcel);
                Z(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) ya.t.a(parcel, Status.CREATOR);
                ya.t.b(parcel);
                A1(status2);
                break;
            case 103:
                Status status3 = (Status) ya.t.a(parcel, Status.CREATOR);
                ya.t.b(parcel);
                r1(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
