package p543xd;

import sb.C11264k;

/* JADX INFO: renamed from: xd.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC12789j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C11264k f45520a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC12789j() {
        this.f45520a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo46218a();

    /* JADX INFO: renamed from: b */
    public final C11264k m47654b() {
        return this.f45520a;
    }

    /* JADX INFO: renamed from: c */
    public final void m47655c(Exception exc) {
        C11264k c11264k = this.f45520a;
        if (c11264k != null) {
            c11264k.m42329d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo46218a();
        } catch (Exception e10) {
            m47655c(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractRunnableC12789j(C11264k c11264k) {
        this.f45520a = c11264k;
    }
}
