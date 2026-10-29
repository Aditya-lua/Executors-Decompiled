package p572ya;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ya.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC13168y extends BinderC13162s implements InterfaceC13169z {
    public AbstractBinderC13168y() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // p572ya.BinderC13162s
    /* JADX INFO: renamed from: r2 */
    public final boolean mo22446r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C13163t.m48765a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) C13163t.m48765a(parcel, BeginSignInResult.CREATOR);
        C13163t.m48766b(parcel);
        mo48755C(status, beginSignInResult);
        return true;
    }
}
