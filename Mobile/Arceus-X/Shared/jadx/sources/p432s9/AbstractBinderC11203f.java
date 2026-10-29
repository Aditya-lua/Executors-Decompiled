package p432s9;

import android.os.Parcel;
import bb.BinderC1294b;
import bb.C1295c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: renamed from: s9.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC11203f extends BinderC1294b implements InterfaceC11204g {
    public AbstractBinderC11203f() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // bb.BinderC1294b
    /* JADX INFO: renamed from: r2 */
    public final boolean mo7089r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) C1295c.m7090a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) C1295c.m7090a(parcel, ModuleAvailabilityResponse.CREATOR);
            C1295c.m7091b(parcel);
            mo42234v1(status, moduleAvailabilityResponse);
        } else if (i10 == 2) {
            Status status2 = (Status) C1295c.m7090a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) C1295c.m7090a(parcel, ModuleInstallResponse.CREATOR);
            C1295c.m7091b(parcel);
            mo42233s1(status2, moduleInstallResponse);
        } else if (i10 == 3) {
            Status status3 = (Status) C1295c.m7090a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) C1295c.m7090a(parcel, ModuleInstallIntentResponse.CREATOR);
            C1295c.m7091b(parcel);
            mo42231I(status3, moduleInstallIntentResponse);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) C1295c.m7090a(parcel, Status.CREATOR);
            C1295c.m7091b(parcel);
            mo42232T1(status4);
        }
        return true;
    }
}
