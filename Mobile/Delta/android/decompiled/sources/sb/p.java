package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f31145a = new CountDownLatch(1);

    public /* synthetic */ p(o oVar) {
    }

    @Override // sb.e
    public final void a() {
        this.f31145a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f31145a.await();
    }

    public final boolean c(long j10, TimeUnit timeUnit) {
        return this.f31145a.await(j10, timeUnit);
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f31145a.countDown();
    }

    @Override // sb.g
    public final void onSuccess(T t8) {
        this.f31145a.countDown();
    }
}
