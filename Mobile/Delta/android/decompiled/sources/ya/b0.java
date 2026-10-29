package ya;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends s implements c0 {
    public b0() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // ya.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) t.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) t.a(parcel, PendingIntent.CREATOR);
        t.b(parcel);
        k(status, pendingIntent);
        return true;
    }
}
