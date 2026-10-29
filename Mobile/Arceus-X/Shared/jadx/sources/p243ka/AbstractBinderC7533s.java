package p243ka;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzg;
import p125fb.BinderC5553q;
import p125fb.C5536k0;

/* JADX INFO: renamed from: ka.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7533s extends BinderC5553q implements InterfaceC7534t {
    public AbstractBinderC7533s() {
        super("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsServiceCallback");
    }

    @Override // p125fb.BinderC5553q
    /* JADX INFO: renamed from: r2 */
    public final boolean mo25172r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) C5536k0.m25206b(parcel, Status.CREATOR);
            C5536k0.m25209e(parcel);
            mo31176J0(status);
        } else if (i10 == 2) {
            zzg zzgVar = (zzg) C5536k0.m25206b(parcel, zzg.CREATOR);
            C5536k0.m25209e(parcel);
            mo31174A1(zzgVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            Intent intent = (Intent) C5536k0.m25206b(parcel, Intent.CREATOR);
            C5536k0.m25209e(parcel);
            mo31175g(intent);
        }
        return true;
    }
}
