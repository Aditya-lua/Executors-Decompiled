package ya;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends a implements IInterface {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void t2(g0 g0Var, SavePasswordRequest savePasswordRequest) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, g0Var);
        t.c(parcelR2, savePasswordRequest);
        s2(2, parcelR2);
    }
}
