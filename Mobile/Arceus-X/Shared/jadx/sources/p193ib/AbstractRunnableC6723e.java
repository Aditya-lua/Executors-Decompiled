package p193ib;

import sb.C11264k;

/* JADX INFO: renamed from: ib.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC6723e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C11264k f25828a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC6723e() {
        this.f25828a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo28823a(Exception exc) {
        C11264k c11264k = this.f25828a;
        if (c11264k != null) {
            c11264k.m42329d(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo28824b();

    /* JADX INFO: renamed from: c */
    public final C11264k m28825c() {
        return this.f25828a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo28824b();
        } catch (Exception e10) {
            mo28823a(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractRunnableC6723e(C11264k c11264k) {
        this.f25828a = c11264k;
    }
}
