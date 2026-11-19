package h6;

import androidx.work.impl.WorkDatabase;
import com.github.luben.zstd.BuildConfig;
import g6.k0;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import y5.l0;
import y5.o0;
import z5.f1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz5/f1;", "workManagerImpl", BuildConfig.FLAVOR, "workSpecId", BuildConfig.FLAVOR, "g", "(Lz5/f1;Ljava/lang/String;)V", "s", "(Lz5/f1;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "r", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Ly5/a0;", "h", "(Ljava/util/UUID;Lz5/f1;)Ly5/a0;", "tag", "o", "(Ljava/lang/String;Lz5/f1;)Ly5/a0;", "name", "k", "m", "(Ljava/lang/String;Lz5/f1;)V", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final void g(f1 f1Var, String str) {
        WorkDatabase workDatabaseU = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseU, "getWorkDatabase(...)");
        r(workDatabaseU, str);
        z5.s sVarR = f1Var.r();
        Intrinsics.checkNotNullExpressionValue(sVarR, "getProcessor(...)");
        sVarR.p(str, 1);
        Iterator<z5.u> it = f1Var.s().iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    @NotNull
    public static final y5.a0 h(@NotNull final UUID id2, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        l0 tracer = workManagerImpl.n().getTracer();
        i6.a aVarC = workManagerImpl.v().c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "getSerialTaskExecutor(...)");
        return y5.e0.c(tracer, "CancelWorkById", aVarC, new Function0() { // from class: h6.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.i(workManagerImpl, id2);
            }
        });
    }

    public static final Unit i(final f1 f1Var, final UUID uuid) {
        WorkDatabase workDatabaseU = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseU, "getWorkDatabase(...)");
        workDatabaseU.R(new Runnable() { // from class: h6.e
            @Override // java.lang.Runnable
            public final void run() {
                h.j(f1Var, uuid);
            }
        });
        s(f1Var);
        return Unit.f21506a;
    }

    public static final void j(f1 f1Var, UUID uuid) {
        String string = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        g(f1Var, string);
    }

    @NotNull
    public static final y5.a0 k(@NotNull final String name, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        l0 tracer = workManagerImpl.n().getTracer();
        String str = "CancelWorkByName_" + name;
        i6.a aVarC = workManagerImpl.v().c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "getSerialTaskExecutor(...)");
        return y5.e0.c(tracer, str, aVarC, new Function0() { // from class: h6.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.l(name, workManagerImpl);
            }
        });
    }

    public static final Unit l(String str, f1 f1Var) {
        m(str, f1Var);
        s(f1Var);
        return Unit.f21506a;
    }

    public static final void m(@NotNull final String name, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabaseU = workManagerImpl.u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseU, "getWorkDatabase(...)");
        workDatabaseU.R(new Runnable() { // from class: h6.c
            @Override // java.lang.Runnable
            public final void run() {
                h.n(workDatabaseU, name, workManagerImpl);
            }
        });
    }

    public static final void n(WorkDatabase workDatabase, String str, f1 f1Var) {
        Iterator<String> it = workDatabase.c0().f(str).iterator();
        while (it.hasNext()) {
            g(f1Var, it.next());
        }
    }

    @NotNull
    public static final y5.a0 o(@NotNull final String tag, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        l0 tracer = workManagerImpl.n().getTracer();
        String str = "CancelWorkByTag_" + tag;
        i6.a aVarC = workManagerImpl.v().c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "getSerialTaskExecutor(...)");
        return y5.e0.c(tracer, str, aVarC, new Function0() { // from class: h6.d
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.p(workManagerImpl, tag);
            }
        });
    }

    public static final Unit p(final f1 f1Var, final String str) {
        final WorkDatabase workDatabaseU = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseU, "getWorkDatabase(...)");
        workDatabaseU.R(new Runnable() { // from class: h6.f
            @Override // java.lang.Runnable
            public final void run() {
                h.q(workDatabaseU, str, f1Var);
            }
        });
        s(f1Var);
        return Unit.f21506a;
    }

    public static final void q(WorkDatabase workDatabase, String str, f1 f1Var) {
        Iterator<String> it = workDatabase.c0().k(str).iterator();
        while (it.hasNext()) {
            g(f1Var, it.next());
        }
    }

    public static final void r(WorkDatabase workDatabase, String str) {
        k0 k0VarC0 = workDatabase.c0();
        g6.b bVarX = workDatabase.X();
        List listP = p001kotlin.collections.p.p(str);
        while (!listP.isEmpty()) {
            String str2 = (String) p001kotlin.collections.u.H(listP);
            o0.c cVarG = k0VarC0.g(str2);
            if (cVarG != o0.c.SUCCEEDED && cVarG != o0.c.FAILED) {
                k0VarC0.i(str2);
            }
            listP.addAll(bVarX.a(str2));
        }
    }

    public static final void s(f1 f1Var) {
        z5.x.f(f1Var.n(), f1Var.u(), f1Var.s());
    }
}
