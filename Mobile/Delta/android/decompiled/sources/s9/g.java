package s9;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes.dex */
public interface g extends IInterface {
    void K(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    void T1(Status status);

    void u1(Status status, ModuleInstallResponse moduleInstallResponse);

    void x1(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}
