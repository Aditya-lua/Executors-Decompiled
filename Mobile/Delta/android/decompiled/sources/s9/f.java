package s9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends bb.b implements g {
    public f() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // bb.b
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) bb.c.a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) bb.c.a(parcel, ModuleAvailabilityResponse.CREATOR);
            bb.c.b(parcel);
            x1(status, moduleAvailabilityResponse);
        } else if (i10 == 2) {
            Status status2 = (Status) bb.c.a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) bb.c.a(parcel, ModuleInstallResponse.CREATOR);
            bb.c.b(parcel);
            u1(status2, moduleInstallResponse);
        } else if (i10 == 3) {
            Status status3 = (Status) bb.c.a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) bb.c.a(parcel, ModuleInstallIntentResponse.CREATOR);
            bb.c.b(parcel);
            K(status3, moduleInstallIntentResponse);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) bb.c.a(parcel, Status.CREATOR);
            bb.c.b(parcel);
            T1(status4);
        }
        return true;
    }
}
