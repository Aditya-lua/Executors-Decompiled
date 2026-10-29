package ne;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p169he.C6384n;

/* JADX INFO: renamed from: ne.v */
/* JADX INFO: loaded from: classes2.dex */
public class C9438v<V> implements InterfaceFutureC9440x<V> {

    /* JADX INFO: renamed from: b */
    public static final InterfaceFutureC9440x<?> f33963b = new C9438v(null);

    /* JADX INFO: renamed from: c */
    public static final Logger f33964c = Logger.getLogger(C9438v.class.getName());

    /* JADX INFO: renamed from: a */
    public final V f33965a;

    /* JADX INFO: renamed from: ne.v$a */
    public static final class a<V> extends AbstractC9411b.j<V> {
        public a(Throwable th2) {
            mo37170E(th2);
        }
    }

    public C9438v(V v5) {
        this.f33965a = v5;
    }

    @Override // ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public void mo37173a(Runnable runnable, Executor executor) {
        C6384n.m27929m(runnable, "Runnable was null.");
        C6384n.m27929m(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f33964c;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public V get() {
        return this.f33965a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f33965a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 27 + strValueOf.length());
        sb2.append(string);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(strValueOf);
        sb2.append("]]");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        C6384n.m27928l(timeUnit);
        return get();
    }
}
