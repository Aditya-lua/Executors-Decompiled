package p432s9;

import android.os.Parcel;
import bb.BinderC1294b;
import bb.C1295c;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: renamed from: s9.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC11206i extends BinderC1294b implements InterfaceC11207j {
    public AbstractBinderC11206i() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // bb.BinderC1294b
    /* JADX INFO: renamed from: r2 */
    public final boolean mo7089r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) C1295c.m7090a(parcel, ModuleInstallStatusUpdate.CREATOR);
        C1295c.m7091b(parcel);
        mo42235P1(moduleInstallStatusUpdate);
        return true;
    }
}
