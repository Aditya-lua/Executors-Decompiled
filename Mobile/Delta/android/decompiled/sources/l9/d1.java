package l9;

import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zak f22999a;
    public final /* synthetic */ f1 b;

    public d1(f1 f1Var, zak zakVar) {
        this.b = f1Var;
        this.f22999a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1.t2(this.b, this.f22999a);
    }
}
