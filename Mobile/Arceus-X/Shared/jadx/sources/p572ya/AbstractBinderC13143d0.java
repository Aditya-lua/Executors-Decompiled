package p572ya;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ya.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC13143d0 extends BinderC13162s implements InterfaceC13145e0 {
    public AbstractBinderC13143d0() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    @Override // p572ya.BinderC13162s
    /* JADX INFO: renamed from: r2 */
    public final boolean mo22446r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C13163t.m48765a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) C13163t.m48765a(parcel, PendingIntent.CREATOR);
        C13163t.m48766b(parcel);
        mo48750k(status, pendingIntent);
        return true;
    }
}
