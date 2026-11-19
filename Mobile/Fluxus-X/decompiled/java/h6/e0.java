package h6;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import g6.j0;
import g6.k0;
import g6.o1;
import java.util.UUID;
import p001kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements y5.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f18088d = y5.w.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6.b f18089a;
    public final f6.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f18090c;

    @SuppressLint({"LambdaLast"})
    public e0(WorkDatabase workDatabase, f6.a aVar, i6.b bVar) {
        this.b = aVar;
        this.f18089a = bVar;
        this.f18090c = workDatabase.c0();
    }

    public static /* synthetic */ Void b(e0 e0Var, UUID uuid, y5.k kVar, Context context) {
        e0Var.getClass();
        String string = uuid.toString();
        j0 j0VarH = e0Var.f18090c.h(string);
        if (j0VarH == null || j0VarH.state.b()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        e0Var.b.a(string, kVar);
        context.startService(androidx.work.impl.foreground.a.e(context, o1.a(j0VarH), kVar));
        return null;
    }

    @Override // y5.l
    public pe.x<Void> a(final Context context, final UUID uuid, final y5.k kVar) {
        return y5.u.f(this.f18089a.c(), "setForegroundAsync", new Function0() { // from class: h6.d0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.b(this.f18084a, uuid, kVar, context);
            }
        });
    }
}
