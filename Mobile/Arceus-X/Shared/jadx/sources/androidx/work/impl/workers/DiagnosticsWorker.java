package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.AbstractC1117c;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p120f6.C5390j0;
import p120f6.InterfaceC5393k0;
import p120f6.InterfaceC5407p;
import p120f6.InterfaceC5412q1;
import p120f6.InterfaceC5432y;
import p188i6.C6642a;
import p536x5.AbstractC12732w;
import p567y5.C13048f1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "d", "()Landroidx/work/c$a;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    /* JADX INFO: renamed from: d */
    public AbstractC1117c.a mo6253d() {
        C13048f1 c13048f1M48580p = C13048f1.m48580p(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(c13048f1M48580p, "getInstance(...)");
        WorkDatabase workDatabaseM48589u = c13048f1M48580p.m48589u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseM48589u, "getWorkDatabase(...)");
        InterfaceC5393k0 interfaceC5393k0Mo6350c0 = workDatabaseM48589u.mo6350c0();
        InterfaceC5432y interfaceC5432yMo6348a0 = workDatabaseM48589u.mo6348a0();
        InterfaceC5412q1 interfaceC5412q1Mo6351d0 = workDatabaseM48589u.mo6351d0();
        InterfaceC5407p interfaceC5407pMo6347Z = workDatabaseM48589u.mo6347Z();
        List<C5390j0> listMo24780d = interfaceC5393k0Mo6350c0.mo24780d(c13048f1M48580p.m48584n().getClock().mo47323a() - TimeUnit.DAYS.toMillis(1L));
        List<C5390j0> listMo24799w = interfaceC5393k0Mo6350c0.mo24799w();
        List<C5390j0> listMo24791o = interfaceC5393k0Mo6350c0.mo24791o(MlKitException.CODE_SCANNER_UNAVAILABLE);
        if (!listMo24780d.isEmpty()) {
            AbstractC12732w.m47441e().mo47448f(C6642a.f25622a, "Recently completed work:\n\n");
            AbstractC12732w.m47441e().mo47448f(C6642a.f25622a, C6642a.m28659d(interfaceC5432yMo6348a0, interfaceC5412q1Mo6351d0, interfaceC5407pMo6347Z, listMo24780d));
        }
        if (!listMo24799w.isEmpty()) {
            AbstractC12732w.m47441e().mo47448f(C6642a.f25622a, "Running work:\n\n");
            AbstractC12732w.m47441e().mo47448f(C6642a.f25622a, C6642a.m28659d(interfaceC5432yMo6348a0, interfaceC5412q1Mo6351d0, interfaceC5407pMo6347Z, listMo24799w));
        }
        if (!listMo24791o.isEmpty()) {
            AbstractC12732w.m47441e().mo47448f(C6642a.f25622a, "Enqueued work:\n\n");
            AbstractC12732w.m47441e().mo47448f(C6642a.f25622a, C6642a.m28659d(interfaceC5432yMo6348a0, interfaceC5412q1Mo6351d0, interfaceC5407pMo6347Z, listMo24791o));
        }
        AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
        Intrinsics.checkNotNullExpressionValue(aVarM6342d, "success(...)");
        return aVarM6342d;
    }
}
