package p125fb;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p242k9.AbstractC7495e;
import sb.C11264k;

/* JADX INFO: renamed from: fb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5562t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5538l f21356a;

    /* JADX INFO: renamed from: b */
    public final C11264k f21357b;

    public C5562t(InterfaceC5538l interfaceC5538l, C11264k c11264k) {
        this.f21356a = interfaceC5538l;
        this.f21357b = c11264k;
    }

    /* JADX INFO: renamed from: a */
    public final void m25228a(AbstractC7495e abstractC7495e) {
        this.f21356a.mo25173a(abstractC7495e).mo11889c(C5564t1.m25231a(), new OnCompleteListener() { // from class: fb.s
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                this.f21352a.m25230c(task);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m25229b(Exception exc) {
        this.f21357b.m42327b(exc);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m25230c(Task task) {
        if (task.isSuccessful()) {
            this.f21357b.m42328c(task.getResult());
            return;
        }
        C11264k c11264k = this.f21357b;
        Exception exception = task.getException();
        C5502b1.m25167a(exception);
        c11264k.m42327b(exception);
    }
}
