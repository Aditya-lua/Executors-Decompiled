package ya;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends s implements z {
    public y() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // ya.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) t.a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) t.a(parcel, BeginSignInResult.CREATOR);
        t.b(parcel);
        C(status, beginSignInResult);
        return true;
    }
}
