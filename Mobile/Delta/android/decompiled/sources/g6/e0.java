package g6;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f6.j0;
import f6.k0;
import f6.o1;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements x5.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17912d = x5.w.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.b f17913a;
    public final e6.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f17914c;

    @SuppressLint({"LambdaLast"})
    public e0(WorkDatabase workDatabase, e6.a aVar, h6.b bVar) {
        this.b = aVar;
        this.f17913a = bVar;
        this.f17914c = workDatabase.c0();
    }

    public static /* synthetic */ Void b(e0 e0Var, UUID uuid, x5.k kVar, Context context) {
        e0Var.getClass();
        String string = uuid.toString();
        j0 j0VarK = e0Var.f17914c.k(string);
        if (j0VarK == null || j0VarK.state.b()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        e0Var.b.a(string, kVar);
        context.startService(androidx.work.impl.foreground.a.c(context, o1.a(j0VarK), kVar));
        return null;
    }

    @Override // x5.l
    public me.x<Void> a(final Context context, final UUID uuid, final x5.k kVar) {
        return x5.u.f(this.f17913a.c(), "setForegroundAsync", new Function0() { // from class: g6.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.b(this.f17908a, uuid, kVar, context);
            }
        });
    }
}
