package s9;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends bb.b implements j {
    public i() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // bb.b
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) bb.c.a(parcel, ModuleInstallStatusUpdate.CREATOR);
        bb.c.b(parcel);
        P1(moduleInstallStatusUpdate);
        return true;
    }
}
