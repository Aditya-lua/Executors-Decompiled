package t9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class v extends l9.g implements s9.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9.a.g f32227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f32228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a f32229m;

    static {
        l9.a.g gVar = new l9.a.g();
        f32227k = gVar;
        q qVar = new q();
        f32228l = qVar;
        f32229m = new l9.a("ModuleInstall.API", qVar, gVar);
    }

    public v(Context context) {
        super(context, (l9.a<l9.a.d.c>) f32229m, l9.a.d.Oo, l9.g.a.f22012c);
    }

    public static final a P(boolean z10, l9.j... jVarArr) {
        o9.s.m(jVarArr, "Requested APIs must not be null.");
        o9.s.b(jVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (l9.j jVar : jVarArr) {
            o9.s.m(jVar, "Requested API must not be null.");
        }
        return a.B3(Arrays.asList(jVarArr), z10);
    }

    @Override // s9.d
    public final Task<s9.g> h(s9.f fVar) {
        final a aVarA = a.a(fVar);
        final s9.a aVarB = fVar.b();
        Executor executorC = fVar.c();
        if (aVarA.A3().isEmpty()) {
            return tb.m.f(new s9.g(0));
        }
        if (aVarB == null) {
            m9.u.a aVarC = m9.u.c();
            aVarC.d(cb.k.f4949a);
            aVarC.c(true);
            aVarC.e(27304);
            aVarC.b(new m9.q() { // from class: t9.p
                /* JADX WARN: Multi-variable type inference failed */
                @Override // m9.q
                public final void accept(Object obj, Object obj2) {
                    ((i) ((w) obj).getService()).v2(new s(this.f32220a, (tb.k) obj2), aVarA, null);
                }
            });
            return z(aVarC.a());
        }
        o9.s.l(aVarB);
        m9.k kVarJ = executorC == null ? J(aVarB, s9.a.class.getSimpleName()) : m9.l.b(aVarB, executorC, s9.a.class.getSimpleName());
        final d dVar = new d(kVarJ);
        final AtomicReference atomicReference = new AtomicReference();
        m9.q qVar = new m9.q() { // from class: t9.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((i) ((w) obj).getService()).v2(new t(this.f32213a, atomicReference, (tb.k) obj2, aVarB), aVarA, dVar);
            }
        };
        m9.q qVar2 = new m9.q() { // from class: t9.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((i) ((w) obj).getService()).w2(new u(this.f32217a, (tb.k) obj2), dVar);
            }
        };
        m9.p.a aVarA2 = m9.p.a();
        aVarA2.g(kVarJ);
        aVarA2.d(cb.k.f4949a);
        aVarA2.c(true);
        aVarA2.b(qVar);
        aVarA2.f(qVar2);
        aVarA2.e(27305);
        return A(aVarA2.a()).o(new tb.j() { // from class: t9.n
            @Override // tb.j
            public final Task then(Object obj) {
                l9.a.g gVar = v.f32227k;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? tb.m.f((s9.g) atomicReference2.get()) : tb.m.e(new l9.b(Status.f6110m));
            }
        });
    }

    @Override // s9.d
    public final Task<s9.b> o(l9.j... jVarArr) {
        final a aVarP = P(false, jVarArr);
        if (aVarP.A3().isEmpty()) {
            return tb.m.f(new s9.b(true, 0));
        }
        m9.u.a aVarC = m9.u.c();
        aVarC.d(cb.k.f4949a);
        aVarC.e(27301);
        aVarC.c(false);
        aVarC.b(new m9.q() { // from class: t9.o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((i) ((w) obj).getService()).u2(new r(this.f32219a, (tb.k) obj2), aVarP);
            }
        });
        return z(aVarC.a());
    }
}
