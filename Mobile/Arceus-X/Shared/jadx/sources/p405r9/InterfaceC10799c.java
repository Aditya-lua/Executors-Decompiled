package p405r9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p242k9.C7491a;
import p242k9.InterfaceC7497g;
import p242k9.InterfaceC7498h;

/* JADX INFO: renamed from: r9.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC10799c extends InterfaceC7497g<C7491a.d.c> {
    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: a */
    Task<ModuleInstallResponse> mo41162a(@NonNull C10800d c10800d);

    @NonNull
    /* JADX INFO: renamed from: n */
    Task<ModuleAvailabilityResponse> mo41163n(@NonNull InterfaceC7498h... interfaceC7498hArr);
}
