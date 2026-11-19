package tb;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f32306a = new CountDownLatch(1);

    public /* synthetic */ p(o oVar) {
    }

    @Override // tb.e
    public final void a() {
        this.f32306a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f32306a.await();
    }

    public final boolean c(long j10, TimeUnit timeUnit) {
        return this.f32306a.await(j10, timeUnit);
    }

    @Override // tb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f32306a.countDown();
    }

    @Override // tb.g
    public final void onSuccess(T t8) {
        this.f32306a.countDown();
    }
}
