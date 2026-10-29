package s9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u extends k9.e implements r9.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k9.a.g f30569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k9.a.AbstractC0392a f30570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.a f30571m;

    static {
        k9.a.g gVar = new k9.a.g();
        f30569k = gVar;
        p pVar = new p();
        f30570l = pVar;
        f30571m = new k9.a("ModuleInstall.API", pVar, gVar);
    }

    public u(Context context) {
        super(context, (k9.a<k9.a.d.c>) f30571m, k9.a.d.Jo, k9.e.a.f22280c);
    }

    public static final ApiFeatureRequest P(boolean z10, k9.h... hVarArr) {
        n9.m.m(hVarArr, "Requested APIs must not be null.");
        n9.m.b(hVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (k9.h hVar : hVarArr) {
            n9.m.m(hVar, "Requested API must not be null.");
        }
        return ApiFeatureRequest.w3(Arrays.asList(hVarArr), z10);
    }

    @Override // r9.c
    public final Task<ModuleInstallResponse> a(r9.d dVar) {
        final ApiFeatureRequest apiFeatureRequestA = ApiFeatureRequest.a(dVar);
        final r9.a aVarB = dVar.b();
        Executor executorC = dVar.c();
        if (apiFeatureRequestA.v3().isEmpty()) {
            return sb.m.f(new ModuleInstallResponse(0));
        }
        if (aVarB == null) {
            l9.u.a aVarC = l9.u.c();
            aVarC.d(bb.k.f4086a);
            aVarC.c(true);
            aVarC.e(27304);
            aVarC.b(new l9.q() { // from class: s9.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // l9.q
                public final void accept(Object obj, Object obj2) {
                    ((h) ((v) obj).getService()).v2(new r(this.f30562a, (sb.k) obj2), apiFeatureRequestA, null);
                }
            });
            return z(aVarC.a());
        }
        n9.m.l(aVarB);
        l9.k kVarJ = executorC == null ? J(aVarB, r9.a.class.getSimpleName()) : l9.l.b(aVarB, executorC, r9.a.class.getSimpleName());
        final c cVar = new c(kVarJ);
        final AtomicReference atomicReference = new AtomicReference();
        l9.q qVar = new l9.q() { // from class: s9.k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((v) obj).getService()).v2(new s(this.f30555a, atomicReference, (sb.k) obj2, aVarB), apiFeatureRequestA, cVar);
            }
        };
        l9.q qVar2 = new l9.q() { // from class: s9.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((v) obj).getService()).w2(new t(this.f30559a, (sb.k) obj2), cVar);
            }
        };
        l9.p.a aVarA = l9.p.a();
        aVarA.g(kVarJ);
        aVarA.d(bb.k.f4086a);
        aVarA.c(true);
        aVarA.b(qVar);
        aVarA.f(qVar2);
        aVarA.e(27305);
        return A(aVarA.a()).o(new sb.j() { // from class: s9.m
            @Override // sb.j
            public final Task then(Object obj) {
                k9.a.g gVar = u.f30569k;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? sb.m.f((ModuleInstallResponse) atomicReference2.get()) : sb.m.e(new k9.b(Status.f5720m));
            }
        });
    }

    @Override // r9.c
    public final Task<ModuleAvailabilityResponse> n(k9.h... hVarArr) {
        final ApiFeatureRequest apiFeatureRequestP = P(false, hVarArr);
        if (apiFeatureRequestP.v3().isEmpty()) {
            return sb.m.f(new ModuleAvailabilityResponse(true, 0));
        }
        l9.u.a aVarC = l9.u.c();
        aVarC.d(bb.k.f4086a);
        aVarC.e(27301);
        aVarC.c(false);
        aVarC.b(new l9.q() { // from class: s9.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((v) obj).getService()).u2(new q(this.f30561a, (sb.k) obj2), apiFeatureRequestP);
            }
        });
        return z(aVarC.a());
    }
}
