package e9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public final class u extends za.a implements IInterface {
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void t2(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelR2 = r2();
        za.t.d(parcelR2, tVar);
        za.t.c(parcelR2, googleSignInOptions);
        s2(103, parcelR2);
    }

    public final void u2(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelR2 = r2();
        za.t.d(parcelR2, tVar);
        za.t.c(parcelR2, googleSignInOptions);
        s2(MlKitException.MODEL_HASH_MISMATCH, parcelR2);
    }
}
