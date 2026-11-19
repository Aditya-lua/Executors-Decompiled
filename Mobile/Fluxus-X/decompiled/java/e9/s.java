package e9;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends za.s implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // za.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case MlKitException.NOT_ENOUGH_SPACE /* 101 */:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) za.t.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) za.t.a(parcel, Status.CREATOR);
                za.t.b(parcel);
                T(googleSignInAccount, status);
                break;
            case MlKitException.MODEL_HASH_MISMATCH /* 102 */:
                Status status2 = (Status) za.t.a(parcel, Status.CREATOR);
                za.t.b(parcel);
                C1(status2);
                break;
            case 103:
                Status status3 = (Status) za.t.a(parcel, Status.CREATOR);
                za.t.b(parcel);
                v1(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
