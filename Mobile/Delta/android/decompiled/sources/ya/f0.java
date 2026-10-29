package ya;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends s implements g0 {
    public f0() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // ya.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) t.a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) t.a(parcel, SavePasswordResult.CREATOR);
        t.b(parcel);
        X1(status, savePasswordResult);
        return true;
    }
}
