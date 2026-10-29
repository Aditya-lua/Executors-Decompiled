package p125fb;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.internal.games_v2.zzs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ga.C6072o;
import p242k9.C7492b;
import p511w9.C12325a;
import sb.C11264k;
import sb.InterfaceC11248c;

/* JADX INFO: renamed from: fb.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5517f0 implements InterfaceC5505c0 {

    /* JADX INFO: renamed from: a */
    public final Application f21291a;

    /* JADX INFO: renamed from: b */
    public final C6072o f21292b;

    /* JADX INFO: renamed from: c */
    public final C5544n f21293c;

    public C5517f0(Application application, C6072o c6072o, C5544n c5544n) {
        this.f21291a = application;
        this.f21292b = c6072o;
        this.f21293c = c5544n;
    }

    @Override // p125fb.InterfaceC5505c0
    /* JADX INFO: renamed from: a */
    public final Task mo25169a(final zzq zzqVar) {
        final boolean z10 = false;
        if (zzqVar.zzc() == 0 && !C12325a.m46173a(this.f21291a)) {
            z10 = true;
        }
        Task taskMo25152f = m25175c().mo25152f(zzqVar, z10);
        final C11264k c11264k = new C11264k();
        taskMo25152f.mo11895i(C5564t1.m25231a(), new InterfaceC11248c() { // from class: fb.e0
            @Override // sb.InterfaceC11248c
            public final /* synthetic */ Object then(Task task) {
                return this.f21287a.m25174b(zzqVar, z10, task);
            }
        }).mo11889c(C5564t1.m25231a(), new OnCompleteListener() { // from class: fb.d0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                C11264k c11264k2 = c11264k;
                if (task.isSuccessful()) {
                    c11264k2.m42330e(C5521g0.m25179a(((zzs) task.getResult()).zza()));
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof C7492b) {
                    c11264k2.m42330e(C5521g0.m25180b(((C7492b) exception).m31130a()));
                } else {
                    C5502b1.m25167a(exception);
                    c11264k2.m42329d(exception);
                }
            }
        });
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Task m25174b(zzq zzqVar, boolean z10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if ((exception instanceof C7492b) && ((C7492b) exception).m31131b() == 20) {
                C5560s0.m25220a("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                return m25175c().mo25152f(zzqVar, z10);
            }
        }
        return task;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC5573w1 m25175c() {
        Activity activityM26928d = this.f21292b.m26928d();
        if (activityM26928d != null) {
            return C5570v1.m25233a(activityM26928d, this.f21293c.f21329b);
        }
        C5544n c5544n = this.f21293c;
        return C5570v1.m25233a(c5544n.f21328a, c5544n.f21329b);
    }
}
