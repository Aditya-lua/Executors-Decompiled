package m9;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f23065a;
    public final /* synthetic */ t1 b;

    public s1(t1 t1Var, q1 q1Var) {
        this.b = t1Var;
        this.f23065a = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b) {
            k9.b bVarB = this.f23065a.b();
            if (bVarB.E3()) {
                t1 t1Var = this.b;
                t1Var.f23016a.startActivityForResult(GoogleApiActivity.a(t1Var.b(), (PendingIntent) o9.s.l(bVarB.D3()), this.f23065a.a(), false), 1);
                return;
            }
            t1 t1Var2 = this.b;
            if (t1Var2.f23072e.b(t1Var2.b(), bVarB.B3(), null) != null) {
                t1 t1Var3 = this.b;
                t1Var3.f23072e.x(t1Var3.b(), t1Var3.f23016a, bVarB.B3(), 2, this.b);
                return;
            }
            if (bVarB.B3() != 18) {
                this.b.l(bVarB, this.f23065a.a());
                return;
            }
            t1 t1Var4 = this.b;
            Dialog dialogS = t1Var4.f23072e.s(t1Var4.b(), t1Var4);
            t1 t1Var5 = this.b;
            t1Var5.f23072e.t(t1Var5.b().getApplicationContext(), new r1(this, dialogS));
        }
    }
}
