package l9;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f23080a;
    public final /* synthetic */ t1 b;

    public s1(t1 t1Var, q1 q1Var) {
        this.b = t1Var;
        this.f23080a = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b) {
            ConnectionResult connectionResultB = this.f23080a.b();
            if (connectionResultB.z3()) {
                t1 t1Var = this.b;
                t1Var.f23031a.startActivityForResult(GoogleApiActivity.a(t1Var.b(), (PendingIntent) n9.m.l(connectionResultB.y3()), this.f23080a.a(), false), 1);
                return;
            }
            t1 t1Var2 = this.b;
            if (t1Var2.f23087e.b(t1Var2.b(), connectionResultB.w3(), null) != null) {
                t1 t1Var3 = this.b;
                t1Var3.f23087e.x(t1Var3.b(), t1Var3.f23031a, connectionResultB.w3(), 2, this.b);
                return;
            }
            if (connectionResultB.w3() != 18) {
                this.b.l(connectionResultB, this.f23080a.a());
                return;
            }
            t1 t1Var4 = this.b;
            Dialog dialogS = t1Var4.f23087e.s(t1Var4.b(), t1Var4);
            t1 t1Var5 = this.b;
            t1Var5.f23087e.t(t1Var5.b().getApplicationContext(), new r1(this, dialogS));
        }
    }
}
