package gb;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f17622a;
    public final ha.o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f17623c;

    public g0(Application application, ha.o oVar, o oVar2) {
        this.f17622a = application;
        this.b = oVar;
        this.f17623c = oVar2;
    }

    @Override // gb.d0
    public final Task a(final d2 d2Var) {
        final boolean z10 = false;
        if (d2Var.zzc() == 0 && !x9.a.a(this.f17622a)) {
            z10 = true;
        }
        Task taskQ = c().q(d2Var, z10);
        final tb.k kVar = new tb.k();
        taskQ.i(u1.a(), new tb.c() { // from class: gb.f0
            @Override // tb.c
            public final /* synthetic */ Object then(Task task) {
                return this.f17618a.b(d2Var, z10, task);
            }
        }).c(u1.a(), new OnCompleteListener() { // from class: gb.e0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                tb.k kVar2 = kVar;
                if (task.isSuccessful()) {
                    kVar2.e(h0.a(((f2) task.getResult()).zza()));
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof l9.b) {
                    kVar2.e(h0.b(((l9.b) exception).a()));
                } else {
                    c1.a(exception);
                    kVar2.d(exception);
                }
            }
        });
        return kVar.a();
    }

    public final /* synthetic */ Task b(d2 d2Var, boolean z10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if ((exception instanceof l9.b) && ((l9.b) exception).b() == 20) {
                t0.a("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                return c().q(d2Var, z10);
            }
        }
        return task;
    }

    public final x1 c() {
        Activity activityD = this.b.d();
        if (activityD != null) {
            return w1.a(activityD, this.f17623c.b);
        }
        o oVar = this.f17623c;
        return w1.a(oVar.f17652a, oVar.b);
    }
}
