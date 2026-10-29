package eb;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class u4 extends a0 implements v4 {
    public u4() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // eb.a0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) b1.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) b1.a(parcel, PendingIntent.CREATOR);
        b1.b(parcel);
        C0(status, pendingIntent);
        return true;
    }
}
