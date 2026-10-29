package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.j9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9144j9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33069b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33070c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f33071d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9257qa f33072e;

    public RunnableC9144j9(C9257qa c9257qa, String str, String str2, Object obj, long j10) {
        this.f33068a = str;
        this.f33069b = str2;
        this.f33070c = obj;
        this.f33071d = j10;
        Objects.requireNonNull(c9257qa);
        this.f33072e = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33072e.m36663B(this.f33068a, this.f33069b, this.f33070c, this.f33071d);
    }
}
