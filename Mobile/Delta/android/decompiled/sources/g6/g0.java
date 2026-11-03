package g6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f6.j0;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import x5.o0;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements x5.h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18459c = x5.w.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f18460a;
    public final h6.b b;

    public g0(WorkDatabase workDatabase, h6.b bVar) {
        this.f18460a = workDatabase;
        this.b = bVar;
    }

    public static /* synthetic */ Void b(g0 g0Var, UUID uuid, androidx.work.b bVar) {
        g0Var.getClass();
        String string = uuid.toString();
        x5.w wVarE = x5.w.e();
        String str = f18459c;
        wVarE.a(str, "Updating progress for " + uuid + " (" + bVar + ")");
        g0Var.f18460a.i();
        try {
            j0 j0VarK = g0Var.f18460a.c0().k(string);
            if (j0VarK == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (j0VarK.state == o0.c.RUNNING) {
                g0Var.f18460a.b0().b(new f6.c0(string, bVar));
            } else {
                x5.w.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            g0Var.f18460a.V();
            g0Var.f18460a.p();
            return null;
        } catch (Throwable th2) {
            try {
                x5.w.e().d(f18459c, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                g0Var.f18460a.p();
                throw th3;
            }
        }
    }

    @Override // x5.h0
    public ne.x<Void> a(Context context, final UUID uuid, final androidx.work.b bVar) {
        return x5.u.f(this.b.c(), "updateProgress", new Function0() { // from class: g6.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.b(this.f18456a, uuid, bVar);
            }
        });
    }
}
