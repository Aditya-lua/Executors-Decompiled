package p572ya;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ya.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC13147f0 extends BinderC13162s implements InterfaceC13149g0 {
    public AbstractBinderC13147f0() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // p572ya.BinderC13162s
    /* JADX INFO: renamed from: r2 */
    public final boolean mo22446r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C13163t.m48765a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) C13163t.m48765a(parcel, SavePasswordResult.CREATOR);
        C13163t.m48766b(parcel);
        mo48748X1(status, savePasswordResult);
        return true;
    }
}
