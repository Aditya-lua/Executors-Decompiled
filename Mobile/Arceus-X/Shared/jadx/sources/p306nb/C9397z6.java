package p306nb;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.z6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9397z6 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final String f33827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9027c7 f33828b;

    public C9397z6(C9027c7 c9027c7, String str) {
        Objects.requireNonNull(c9027c7);
        this.f33828b = c9027c7;
        C8953m.m36047l(str);
        this.f33827a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f33828b.f33067a.mo36321a().m37003o().m36912b(this.f33827a, th2);
    }
}
