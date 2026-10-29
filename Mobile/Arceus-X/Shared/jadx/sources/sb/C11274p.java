package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: sb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11274p<T> implements InterfaceC11275q<T> {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f39593a = new CountDownLatch(1);

    public /* synthetic */ C11274p(C11272o c11272o) {
    }

    @Override // sb.InterfaceC11252e
    /* JADX INFO: renamed from: a */
    public final void mo42318a() {
        this.f39593a.countDown();
    }

    /* JADX INFO: renamed from: b */
    public final void m42352b() throws InterruptedException {
        this.f39593a.await();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42353c(long j10, TimeUnit timeUnit) {
        return this.f39593a.await(j10, timeUnit);
    }

    @Override // sb.InterfaceC11254f
    public final void onFailure(@NonNull Exception exc) {
        this.f39593a.countDown();
    }

    @Override // sb.InterfaceC11256g
    public final void onSuccess(T t8) {
        this.f39593a.countDown();
    }
}
