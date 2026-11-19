package xa;

import android.content.Context;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class r implements y8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.b f36648a;
    public final y8.b b;

    public r(Context context) {
        this.f36648a = new p(context, k9.f.f());
        this.b = l.c(context);
    }

    public static /* synthetic */ Task a(r rVar, Task task) {
        if (!task.isSuccessful() && !task.l()) {
            Exception exception = task.getException();
            if (exception instanceof l9.b) {
                int iB = ((l9.b) exception).b();
                if (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) {
                    return rVar.b.j();
                }
                if (iB == 43000) {
                    return tb.m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (iB == 15) {
                    return tb.m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // y8.b
    public final Task<y8.c> j() {
        return this.f36648a.j().j(new tb.c() { // from class: xa.q
            @Override // tb.c
            public final Object then(Task task) {
                return r.a(this.f36647a, task);
            }
        });
    }
}
