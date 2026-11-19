package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e7 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27292a;
    public final /* synthetic */ h7 b;

    public e7(h7 h7Var, String str) {
        Objects.requireNonNull(h7Var);
        this.b = h7Var;
        o9.s.l(str);
        this.f27292a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.b.f27641a.a().o().b(this.f27292a, th2);
    }
}
