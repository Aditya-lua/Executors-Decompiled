package gb;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17673a;
    public final tb.k b;

    public u(m mVar, tb.k kVar) {
        this.f17673a = mVar;
        this.b = kVar;
    }

    public final void a(l9.g gVar) {
        this.f17673a.a(gVar).c(u1.a(), new OnCompleteListener() { // from class: gb.t
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                this.f17670a.c(task);
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
        tb.k kVar = this.b;
        Exception exception = task.getException();
        c1.a(exception);
        kVar.b(exception);
    }
}
