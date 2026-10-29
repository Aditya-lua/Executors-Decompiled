package p256ku;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ku.o1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lku/o1;", "Lku/m1;", "<init>", "()V", "", "A0", "", "now", "Lku/n1$c;", "delayedTask", "z0", "(JLku/n1$c;)V", "Ljava/lang/Thread;", "y0", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7903o1 extends AbstractC7894m1 {
    /* JADX INFO: renamed from: A0 */
    public final void m32849A0() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            C7842c.m32577a();
            LockSupport.unpark(thread);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public abstract Thread getThread();

    /* JADX INFO: renamed from: z0 */
    public void mo32850z0(long now, @NotNull AbstractC7899n1.c delayedTask) {
        RunnableC7926u0.f29805i.m32835T0(now, delayedTask);
    }
}
