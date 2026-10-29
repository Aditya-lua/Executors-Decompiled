package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class t extends ya.a implements IInterface {
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void t2(s sVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelR2 = r2();
        ya.t.d(parcelR2, sVar);
        ya.t.c(parcelR2, googleSignInOptions);
        s2(103, parcelR2);
    }

    public final void u2(s sVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelR2 = r2();
        ya.t.d(parcelR2, sVar);
        ya.t.c(parcelR2, googleSignInOptions);
        s2(102, parcelR2);
    }
}
