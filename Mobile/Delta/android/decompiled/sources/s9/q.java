package s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

/* JADX INFO: loaded from: classes.dex */
public final class q extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f30563a;

    public q(u uVar, sb.k kVar) {
        this.f30563a = kVar;
    }

    @Override // s9.a, s9.g
    public final void x1(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        l9.v.c(status, moduleAvailabilityResponse, this.f30563a);
    }
}
