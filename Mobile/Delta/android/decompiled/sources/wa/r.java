package wa;

import android.content.Context;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class r implements x8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.b f34158a;
    public final x8.b b;

    public r(Context context) {
        this.f34158a = new p(context, j9.d.f());
        this.b = l.c(context);
    }

    public static /* synthetic */ Task a(r rVar, Task task) {
        if (!task.isSuccessful() && !task.l()) {
            Exception exception = task.getException();
            if (exception instanceof k9.b) {
                int iB = ((k9.b) exception).b();
                if (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) {
                    return rVar.b.j();
                }
                if (iB == 43000) {
                    return sb.m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (iB == 15) {
                    return sb.m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // x8.b
    public final Task<x8.c> j() {
        return this.f34158a.j().j(new sb.c() { // from class: wa.q
            @Override // sb.c
            public final Object then(Task task) {
                return r.a(this.f34157a, task);
            }
        });
    }
}
