package me;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class v<V> implements x<V> {
    public static final x<?> b = new v(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f24139c = Logger.getLogger(v.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f24140a;

    public static final class a<V> extends b.j<V> {
        public a(Throwable th2) {
            E(th2);
        }
    }

    public v(V v5) {
        this.f24140a = v5;
    }

    @Override // me.x
    public void a(Runnable runnable, Executor executor) {
        ge.n.m(runnable, "Runnable was null.");
        ge.n.m(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f24139c;
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

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f24140a;
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
        String strValueOf = String.valueOf(this.f24140a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 27 + strValueOf.length());
        sb2.append(string);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(strValueOf);
        sb2.append("]]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        ge.n.l(timeUnit);
        return get();
    }
}
