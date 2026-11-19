package la;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import gb.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends gb.r implements w {
    public v() {
        super("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsServiceCallback");
    }

    @Override // gb.r
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) l0.b(parcel, Status.CREATOR);
            l0.e(parcel);
            P0(status);
        } else if (i10 == 2) {
            f fVar = (f) l0.b(parcel, f.CREATOR);
            l0.e(parcel);
            E(fVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            Intent intent = (Intent) l0.b(parcel, Intent.CREATOR);
            l0.e(parcel);
            g(intent);
        }
        return true;
    }
}
