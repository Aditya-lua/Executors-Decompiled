package p432s9;

import android.content.Context;
import bb.C1303k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p242k9.C7492b;
import p242k9.InterfaceC7498h;
import p268l9.AbstractC8078u;
import p268l9.C8048k;
import p268l9.C8051l;
import p268l9.C8063p;
import p268l9.InterfaceC8066q;
import p305n9.C8953m;
import p405r9.C10800d;
import p405r9.InterfaceC10797a;
import p405r9.InterfaceC10799c;
import sb.C11264k;
import sb.C11268m;
import sb.InterfaceC11262j;

/* JADX INFO: renamed from: s9.u */
/* JADX INFO: loaded from: classes.dex */
public final class C11218u extends AbstractC7495e implements InterfaceC10799c {

    /* JADX INFO: renamed from: k */
    public static final C7491a.g f39552k;

    /* JADX INFO: renamed from: l */
    public static final C7491a.a f39553l;

    /* JADX INFO: renamed from: m */
    public static final C7491a f39554m;

    static {
        C7491a.g gVar = new C7491a.g();
        f39552k = gVar;
        C11213p c11213p = new C11213p();
        f39553l = c11213p;
        f39554m = new C7491a("ModuleInstall.API", c11213p, gVar);
    }

    public C11218u(Context context) {
        super(context, (C7491a<C7491a.d.c>) f39554m, C7491a.d.f28847Jo, AbstractC7495e.a.f28860c);
    }

    /* JADX INFO: renamed from: P */
    public static final ApiFeatureRequest m42239P(boolean z10, InterfaceC7498h... interfaceC7498hArr) {
        C8953m.m36048m(interfaceC7498hArr, "Requested APIs must not be null.");
        C8953m.m36037b(interfaceC7498hArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (InterfaceC7498h interfaceC7498h : interfaceC7498hArr) {
            C8953m.m36048m(interfaceC7498h, "Requested API must not be null.");
        }
        return ApiFeatureRequest.m9231w3(Arrays.asList(interfaceC7498hArr), z10);
    }

    /* JADX DEBUG: Type inference failed for r8v9. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TContinuationResult>, com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> */
    @Override // p405r9.InterfaceC10799c
    /* JADX INFO: renamed from: a */
    public final Task<ModuleInstallResponse> mo41162a(C10800d c10800d) {
        final ApiFeatureRequest apiFeatureRequestM9230a = ApiFeatureRequest.m9230a(c10800d);
        final InterfaceC10797a interfaceC10797aM41166b = c10800d.m41166b();
        Executor executorM41167c = c10800d.m41167c();
        if (apiFeatureRequestM9230a.m9232v3().isEmpty()) {
            return C11268m.m42336f(new ModuleInstallResponse(0));
        }
        if (interfaceC10797aM41166b == null) {
            AbstractC8078u.a aVarM33280c = AbstractC8078u.m33280c();
            aVarM33280c.m33288d(C1303k.f5338a);
            aVarM33280c.m33287c(true);
            aVarM33280c.m33289e(27304);
            aVarM33280c.m33286b(new InterfaceC8066q() { // from class: s9.o
                /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p268l9.InterfaceC8066q
                public final void accept(Object obj, Object obj2) {
                    ((C11205h) ((C11219v) obj).getService()).m42237v2(new BinderC11215r(this.f39543a, (C11264k) obj2), apiFeatureRequestM9230a, null);
                }
            });
            return m31151z(aVarM33280c.m33285a());
        }
        C8953m.m36047l(interfaceC10797aM41166b);
        C8048k c8048kM31142J = executorM41167c == null ? m31142J(interfaceC10797aM41166b, InterfaceC10797a.class.getSimpleName()) : C8051l.m33234b(interfaceC10797aM41166b, executorM41167c, InterfaceC10797a.class.getSimpleName());
        final BinderC11200c binderC11200c = new BinderC11200c(c8048kM31142J);
        final AtomicReference atomicReference = new AtomicReference();
        InterfaceC8066q interfaceC8066q = new InterfaceC8066q() { // from class: s9.k
            /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C11205h) ((C11219v) obj).getService()).m42237v2(new BinderC11216s(this.f39533a, atomicReference, (C11264k) obj2, interfaceC10797aM41166b), apiFeatureRequestM9230a, binderC11200c);
            }
        };
        InterfaceC8066q interfaceC8066q2 = new InterfaceC8066q() { // from class: s9.l
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C11205h) ((C11219v) obj).getService()).m42238w2(new BinderC11217t(this.f39538a, (C11264k) obj2), binderC11200c);
            }
        };
        C8063p.a aVarM33254a = C8063p.m33254a();
        aVarM33254a.m33263g(c8048kM31142J);
        aVarM33254a.m33260d(C1303k.f5338a);
        aVarM33254a.m33259c(true);
        aVarM33254a.m33258b(interfaceC8066q);
        aVarM33254a.m33262f(interfaceC8066q2);
        aVarM33254a.m33261e(27305);
        return m31133A(aVarM33254a.m33257a()).mo11901o(new InterfaceC11262j() { // from class: s9.m
            @Override // sb.InterfaceC11262j
            public final Task then(Object obj) {
                C7491a.g gVar = C11218u.f39552k;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? C11268m.m42336f((ModuleInstallResponse) atomicReference2.get()) : C11268m.m42335e(new C7492b(Status.f7407m));
            }
        });
    }

    @Override // p405r9.InterfaceC10799c
    /* JADX INFO: renamed from: n */
    public final Task<ModuleAvailabilityResponse> mo41163n(InterfaceC7498h... interfaceC7498hArr) {
        final ApiFeatureRequest apiFeatureRequestM42239P = m42239P(false, interfaceC7498hArr);
        if (apiFeatureRequestM42239P.m9232v3().isEmpty()) {
            return C11268m.m42336f(new ModuleAvailabilityResponse(true, 0));
        }
        AbstractC8078u.a aVarM33280c = AbstractC8078u.m33280c();
        aVarM33280c.m33288d(C1303k.f5338a);
        aVarM33280c.m33289e(27301);
        aVarM33280c.m33287c(false);
        aVarM33280c.m33286b(new InterfaceC8066q() { // from class: s9.n
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C11205h) ((C11219v) obj).getService()).m42236u2(new BinderC11214q(this.f39541a, (C11264k) obj2), apiFeatureRequestM42239P);
            }
        });
        return m31151z(aVarM33280c.m33285a());
    }
}
