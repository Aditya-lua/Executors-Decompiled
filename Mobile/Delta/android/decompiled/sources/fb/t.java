package fb;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16578a;
    public final sb.k b;

    public t(l lVar, sb.k kVar) {
        this.f16578a = lVar;
        this.b = kVar;
    }

    public final void a(k9.e eVar) {
        this.f16578a.a(eVar).c(t1.a(), new OnCompleteListener() { // from class: fb.s
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                this.f16575a.c(task);
            }
        });
    }

    public final void b(Exception exc) {
        this.b.b(exc);
    }

    public final /* synthetic */ void c(Task task) {
        if (task.isSuccessful()) {
            this.b.c(task.getResult());
            return;
        }
        sb.k kVar = this.b;
        Exception exception = task.getException();
        b1.a(exception);
        kVar.b(exception);
    }
}
