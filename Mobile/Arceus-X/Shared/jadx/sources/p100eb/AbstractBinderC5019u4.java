package p100eb;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: eb.u4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5019u4 extends BinderC4895a0 implements InterfaceC5025v4 {
    public AbstractBinderC5019u4() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // p100eb.BinderC4895a0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo23547r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) C4902b1.m23552a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) C4902b1.m23552a(parcel, PendingIntent.CREATOR);
        C4902b1.m23553b(parcel);
        mo7059y0(status, pendingIntent);
        return true;
    }
}
