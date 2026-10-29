package ka;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.v2.appshortcuts.zzg;
import fb.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends fb.q implements t {
    public s() {
        super("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsServiceCallback");
    }

    @Override // fb.q
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) k0.b(parcel, Status.CREATOR);
            k0.e(parcel);
            N0(status);
        } else if (i10 == 2) {
            zzg zzgVar = (zzg) k0.b(parcel, zzg.CREATOR);
            k0.e(parcel);
            B1(zzgVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            Intent intent = (Intent) k0.b(parcel, Intent.CREATOR);
            k0.e(parcel);
            g(intent);
        }
        return true;
    }
}
