package fb;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.internal.games_v2.zzs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f16528a;
    public final ga.o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f16529c;

    public f0(Application application, ga.o oVar, n nVar) {
        this.f16528a = application;
        this.b = oVar;
        this.f16529c = nVar;
    }

    @Override // fb.c0
    public final Task a(final zzq zzqVar) {
        final boolean z10 = false;
        if (zzqVar.zzc() == 0 && !w9.a.a(this.f16528a)) {
            z10 = true;
        }
        Task taskF = c().f(zzqVar, z10);
        final sb.k kVar = new sb.k();
        taskF.i(t1.a(), new sb.c() { // from class: fb.e0
            @Override // sb.c
            public final /* synthetic */ Object then(Task task) {
                return this.f16525a.b(zzqVar, z10, task);
            }
        }).c(t1.a(), new OnCompleteListener() { // from class: fb.d0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                sb.k kVar2 = kVar;
                if (task.isSuccessful()) {
                    kVar2.e(g0.a(((zzs) task.getResult()).zza()));
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof k9.b) {
                    kVar2.e(g0.b(((k9.b) exception).a()));
                } else {
                    b1.a(exception);
                    kVar2.d(exception);
                }
            }
        });
        return kVar.a();
    }

    public final /* synthetic */ Task b(zzq zzqVar, boolean z10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if ((exception instanceof k9.b) && ((k9.b) exception).b() == 20) {
                s0.a("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                return c().f(zzqVar, z10);
            }
        }
        return task;
    }

    public final w1 c() {
        Activity activityD = this.b.d();
        if (activityD != null) {
            return v1.a(activityD, this.f16529c.b);
        }
        n nVar = this.f16529c;
        return v1.a(nVar.f16557a, nVar.b);
    }
}
