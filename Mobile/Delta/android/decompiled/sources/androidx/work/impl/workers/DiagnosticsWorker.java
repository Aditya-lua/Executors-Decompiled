package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import com.google.mlkit.common.MlKitException;
import f6.j0;
import f6.k0;
import f6.p;
import f6.q1;
import f6.y;
import i6.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.w;
import y5.f1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "d", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    public c.a d() {
        f1 f1VarP = f1.p(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(f1VarP, "getInstance(...)");
        WorkDatabase workDatabaseU = f1VarP.u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseU, "getWorkDatabase(...)");
        k0 k0VarC0 = workDatabaseU.c0();
        y yVarA0 = workDatabaseU.a0();
        q1 q1VarD0 = workDatabaseU.d0();
        p pVarZ = workDatabaseU.Z();
        List<j0> listD = k0VarC0.d(f1VarP.n().getClock().a() - TimeUnit.DAYS.toMillis(1L));
        List<j0> listW = k0VarC0.w();
        List<j0> listO = k0VarC0.o(MlKitException.CODE_SCANNER_UNAVAILABLE);
        if (!listD.isEmpty()) {
            w.e().f(a.f20284a, "Recently completed work:\n\n");
            w.e().f(a.f20284a, a.d(yVarA0, q1VarD0, pVarZ, listD));
        }
        if (!listW.isEmpty()) {
            w.e().f(a.f20284a, "Running work:\n\n");
            w.e().f(a.f20284a, a.d(yVarA0, q1VarD0, pVarZ, listW));
        }
        if (!listO.isEmpty()) {
            w.e().f(a.f20284a, "Enqueued work:\n\n");
            w.e().f(a.f20284a, a.d(yVarA0, q1VarD0, pVarZ, listO));
        }
        c.a aVarD = c.a.d();
        Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
        return aVarD;
    }
}
