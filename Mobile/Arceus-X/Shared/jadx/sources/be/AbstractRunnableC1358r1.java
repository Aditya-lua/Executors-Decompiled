package be;

import sb.C11264k;

/* JADX INFO: renamed from: be.r1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC1358r1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C11264k f5402a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC1358r1() {
        this.f5402a = null;
    }

    /* JADX INFO: renamed from: a */
    public final C11264k m7214a() {
        return this.f5402a;
    }

    /* JADX INFO: renamed from: b */
    public final void m7215b(Exception exc) {
        C11264k c11264k = this.f5402a;
        if (c11264k != null) {
            c11264k.m42329d(exc);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo534c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo534c();
        } catch (Exception e10) {
            m7215b(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractRunnableC1358r1(C11264k c11264k) {
        this.f5402a = c11264k;
    }
}
