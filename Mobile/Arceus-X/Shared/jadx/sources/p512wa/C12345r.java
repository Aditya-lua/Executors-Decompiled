package p512wa;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import p213j9.C7091d;
import p242k9.C7492b;
import p539x8.C12769c;
import p539x8.InterfaceC12768b;
import sb.C11268m;
import sb.InterfaceC11248c;

/* JADX INFO: renamed from: wa.r */
/* JADX INFO: loaded from: classes.dex */
public final class C12345r implements InterfaceC12768b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12768b f44204a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12768b f44205b;

    public C12345r(Context context) {
        this.f44204a = new C12343p(context, C7091d.m29876f());
        this.f44205b = C12339l.m46192c(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m46199a(C12345r c12345r, Task task) {
        if (!task.isSuccessful() && !task.mo11898l()) {
            Exception exception = task.getException();
            if (exception instanceof C7492b) {
                int iM31131b = ((C7492b) exception).m31131b();
                if (iM31131b == 43001 || iM31131b == 43002 || iM31131b == 43003 || iM31131b == 17) {
                    return c12345r.f44205b.mo46198j();
                }
                if (iM31131b == 43000) {
                    return C11268m.m42335e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (iM31131b == 15) {
                    return C11268m.m42335e(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TContinuationResult>, com.google.android.gms.tasks.Task<x8.c> */
    @Override // p539x8.InterfaceC12768b
    /* JADX INFO: renamed from: j */
    public final Task<C12769c> mo46198j() {
        return this.f44204a.mo46198j().mo11896j(new InterfaceC11248c() { // from class: wa.q
            @Override // sb.InterfaceC11248c
            public final Object then(Task task) {
                return C12345r.m46199a(this.f44203a, task);
            }
        });
    }
}
