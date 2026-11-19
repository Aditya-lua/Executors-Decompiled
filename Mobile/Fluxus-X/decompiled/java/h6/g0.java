package h6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import g6.j0;
import java.util.UUID;
import p001kotlin.jvm.functions.Function0;
import y5.o0;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements y5.h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18096c = y5.w.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f18097a;
    public final i6.b b;

    public g0(WorkDatabase workDatabase, i6.b bVar) {
        this.f18097a = workDatabase;
        this.b = bVar;
    }

    public static /* synthetic */ Void b(g0 g0Var, UUID uuid, androidx.work.b bVar) {
        g0Var.getClass();
        String string = uuid.toString();
        y5.w wVarE = y5.w.e();
        String str = f18096c;
        wVarE.a(str, "Updating progress for " + uuid + " (" + bVar + ")");
        g0Var.f18097a.i();
        try {
            j0 j0VarH = g0Var.f18097a.c0().h(string);
            if (j0VarH == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (j0VarH.state == o0.c.RUNNING) {
                g0Var.f18097a.b0().c(new g6.c0(string, bVar));
            } else {
                y5.w.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            g0Var.f18097a.V();
            g0Var.f18097a.p();
            return null;
        } catch (Throwable th2) {
            try {
                y5.w.e().d(f18096c, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                g0Var.f18097a.p();
                throw th3;
            }
        }
    }

    @Override // y5.h0
    public pe.x<Void> a(Context context, final UUID uuid, final androidx.work.b bVar) {
        return y5.u.f(this.b.c(), "updateProgress", new Function0() { // from class: h6.f0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.b(this.f18093a, uuid, bVar);
            }
        });
    }
}
