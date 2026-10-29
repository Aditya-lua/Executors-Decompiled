package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z6 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26217a;
    public final /* synthetic */ c7 b;

    public z6(c7 c7Var, String str) {
        Objects.requireNonNull(c7Var);
        this.b = c7Var;
        n9.m.l(str);
        this.f26217a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.b.f25625a.a().o().b(this.f26217a, th2);
    }
}
