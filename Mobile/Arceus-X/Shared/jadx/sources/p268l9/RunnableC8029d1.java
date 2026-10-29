package p268l9;

import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: l9.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8029d1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zak f29987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC8035f1 f29988b;

    public RunnableC8029d1(BinderC8035f1 binderC8035f1, zak zakVar) {
        this.f29988b = binderC8035f1;
        this.f29987a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC8035f1.m33165t2(this.f29988b, this.f29987a);
    }
}
