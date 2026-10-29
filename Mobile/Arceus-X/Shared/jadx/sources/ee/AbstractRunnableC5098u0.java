package ee;

import sb.C11264k;

/* JADX INFO: renamed from: ee.u0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC5098u0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C11264k f19913a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC5098u0() {
        this.f19913a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo23843a(Exception exc) {
        C11264k c11264k = this.f19913a;
        if (c11264k != null) {
            c11264k.m42329d(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo23771b();

    /* JADX INFO: renamed from: c */
    public final C11264k m23844c() {
        return this.f19913a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo23771b();
        } catch (Exception e10) {
            mo23843a(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractRunnableC5098u0(C11264k c11264k) {
        this.f19913a = c11264k;
    }
}
