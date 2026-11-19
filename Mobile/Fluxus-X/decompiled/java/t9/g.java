package t9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends cb.b implements h {
    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // cb.b
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) cb.c.a(parcel, Status.CREATOR);
            s9.b bVar = (s9.b) cb.c.a(parcel, s9.b.CREATOR);
            cb.c.b(parcel);
            A1(status, bVar);
        } else if (i10 == 2) {
            Status status2 = (Status) cb.c.a(parcel, Status.CREATOR);
            s9.g gVar = (s9.g) cb.c.a(parcel, s9.g.CREATOR);
            cb.c.b(parcel);
            O0(status2, gVar);
        } else if (i10 == 3) {
            Status status3 = (Status) cb.c.a(parcel, Status.CREATOR);
            s9.e eVar = (s9.e) cb.c.a(parcel, s9.e.CREATOR);
            cb.c.b(parcel);
            w0(status3, eVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) cb.c.a(parcel, Status.CREATOR);
            cb.c.b(parcel);
            Y1(status4);
        }
        return true;
    }
}
