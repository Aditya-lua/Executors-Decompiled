package p072d9;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p572ya.BinderC13162s;
import p572ya.C13163t;

/* JADX INFO: renamed from: d9.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4490r extends BinderC13162s implements InterfaceC4491s {
    public AbstractBinderC4490r() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p572ya.BinderC13162s
    /* JADX INFO: renamed from: r2 */
    public final boolean mo22446r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C13163t.m48765a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) C13163t.m48765a(parcel, Status.CREATOR);
                C13163t.m48766b(parcel);
                mo22432X(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) C13163t.m48765a(parcel, Status.CREATOR);
                C13163t.m48766b(parcel);
                mo22434z1(status2);
                break;
            case 103:
                Status status3 = (Status) C13163t.m48765a(parcel, Status.CREATOR);
                C13163t.m48766b(parcel);
                mo22433o1(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
