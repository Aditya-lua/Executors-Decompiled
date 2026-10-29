package p146g6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p120f6.InterfaceC5365b;
import p120f6.InterfaceC5393k0;
import p161h6.InterfaceExecutorC6291a;
import p536x5.C12697e0;
import p536x5.C12717o0;
import p536x5.InterfaceC12689a0;
import p536x5.InterfaceC12711l0;
import p567y5.C13048f1;
import p567y5.C13085s;
import p567y5.C13096x;
import p567y5.InterfaceC13090u;

/* JADX INFO: renamed from: g6.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Ly5/f1;", "workManagerImpl", "", "workSpecId", "", "g", "(Ly5/f1;Ljava/lang/String;)V", "s", "(Ly5/f1;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "r", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Lx5/a0;", "h", "(Ljava/util/UUID;Ly5/f1;)Lx5/a0;", "tag", "o", "(Ljava/lang/String;Ly5/f1;)Lx5/a0;", "name", "k", "m", "(Ljava/lang/String;Ly5/f1;)V", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6027h {
    /* JADX INFO: renamed from: g */
    public static final void m26810g(C13048f1 c13048f1, String str) {
        WorkDatabase workDatabaseM48589u = c13048f1.m48589u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseM48589u, "getWorkDatabase(...)");
        m26821r(workDatabaseM48589u, str);
        C13085s c13085sM48586r = c13048f1.m48586r();
        Intrinsics.checkNotNullExpressionValue(c13085sM48586r, "getProcessor(...)");
        c13085sM48586r.m48673p(str, 1);
        Iterator<InterfaceC13090u> it = c13048f1.m48587s().iterator();
        while (it.hasNext()) {
            it.next().mo194b(str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final InterfaceC12689a0 m26811h(@NotNull final UUID id2, @NotNull final C13048f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        InterfaceC12711l0 tracer = workManagerImpl.m48584n().getTracer();
        InterfaceExecutorC6291a interfaceExecutorC6291aMo27572c = workManagerImpl.m48590v().mo27572c();
        Intrinsics.checkNotNullExpressionValue(interfaceExecutorC6291aMo27572c, "getSerialTaskExecutor(...)");
        return C12697e0.m47355c(tracer, "CancelWorkById", interfaceExecutorC6291aMo27572c, new Function0() { // from class: g6.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6027h.m26812i(workManagerImpl, id2);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m26812i(final C13048f1 c13048f1, final UUID uuid) {
        WorkDatabase workDatabaseM48589u = c13048f1.m48589u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseM48589u, "getWorkDatabase(...)");
        workDatabaseM48589u.m47266R(new Runnable() { // from class: g6.e
            @Override // java.lang.Runnable
            public final void run() {
                C6027h.m26813j(c13048f1, uuid);
            }
        });
        m26822s(c13048f1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m26813j(C13048f1 c13048f1, UUID uuid) {
        String string = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        m26810g(c13048f1, string);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final InterfaceC12689a0 m26814k(@NotNull final String name, @NotNull final C13048f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        InterfaceC12711l0 tracer = workManagerImpl.m48584n().getTracer();
        String str = "CancelWorkByName_" + name;
        InterfaceExecutorC6291a interfaceExecutorC6291aMo27572c = workManagerImpl.m48590v().mo27572c();
        Intrinsics.checkNotNullExpressionValue(interfaceExecutorC6291aMo27572c, "getSerialTaskExecutor(...)");
        return C12697e0.m47355c(tracer, str, interfaceExecutorC6291aMo27572c, new Function0() { // from class: g6.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6027h.m26815l(name, workManagerImpl);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m26815l(String str, C13048f1 c13048f1) {
        m26816m(str, c13048f1);
        m26822s(c13048f1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m26816m(@NotNull final String name, @NotNull final C13048f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabaseM48589u = workManagerImpl.m48589u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseM48589u, "getWorkDatabase(...)");
        workDatabaseM48589u.m47266R(new Runnable() { // from class: g6.c
            @Override // java.lang.Runnable
            public final void run() {
                C6027h.m26817n(workDatabaseM48589u, name, workManagerImpl);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final void m26817n(WorkDatabase workDatabase, String str, C13048f1 c13048f1) {
        Iterator<String> it = workDatabase.mo6350c0().mo24785i(str).iterator();
        while (it.hasNext()) {
            m26810g(c13048f1, it.next());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final InterfaceC12689a0 m26818o(@NotNull final String tag, @NotNull final C13048f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        InterfaceC12711l0 tracer = workManagerImpl.m48584n().getTracer();
        String str = "CancelWorkByTag_" + tag;
        InterfaceExecutorC6291a interfaceExecutorC6291aMo27572c = workManagerImpl.m48590v().mo27572c();
        Intrinsics.checkNotNullExpressionValue(interfaceExecutorC6291aMo27572c, "getSerialTaskExecutor(...)");
        return C12697e0.m47355c(tracer, str, interfaceExecutorC6291aMo27572c, new Function0() { // from class: g6.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6027h.m26819p(workManagerImpl, tag);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m26819p(final C13048f1 c13048f1, final String str) {
        final WorkDatabase workDatabaseM48589u = c13048f1.m48589u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseM48589u, "getWorkDatabase(...)");
        workDatabaseM48589u.m47266R(new Runnable() { // from class: g6.f
            @Override // java.lang.Runnable
            public final void run() {
                C6027h.m26820q(workDatabaseM48589u, str, c13048f1);
            }
        });
        m26822s(c13048f1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m26820q(WorkDatabase workDatabase, String str, C13048f1 c13048f1) {
        Iterator<String> it = workDatabase.mo6350c0().mo24789m(str).iterator();
        while (it.hasNext()) {
            m26810g(c13048f1, it.next());
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m26821r(WorkDatabase workDatabase, String str) {
        InterfaceC5393k0 interfaceC5393k0Mo6350c0 = workDatabase.mo6350c0();
        InterfaceC5365b interfaceC5365bMo6345X = workDatabase.mo6345X();
        List listM31897p = C7699p.m31897p(str);
        while (!listM31897p.isEmpty()) {
            String str2 = (String) C7708u.m31927H(listM31897p);
            C12717o0.c cVarMo24786j = interfaceC5393k0Mo6350c0.mo24786j(str2);
            if (cVarMo24786j != C12717o0.c.SUCCEEDED && cVarMo24786j != C12717o0.c.FAILED) {
                interfaceC5393k0Mo6350c0.mo24788l(str2);
            }
            listM31897p.addAll(interfaceC5365bMo6345X.mo24709a(str2));
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m26822s(C13048f1 c13048f1) {
        C13096x.m48689f(c13048f1.m48584n(), c13048f1.m48589u(), c13048f1.m48587s());
    }
}
