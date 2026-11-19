package o9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f27029a;

    public /* synthetic */ r1(s1 s1Var, byte[] bArr) {
        Objects.requireNonNull(s1Var);
        this.f27029a = s1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            s1 s1Var = this.f27029a;
            synchronized (s1Var.f()) {
                try {
                    p1 p1Var = (p1) message.obj;
                    q1 q1Var = (q1) s1Var.f().get(p1Var);
                    if (q1Var != null && q1Var.g()) {
                        if (q1Var.d()) {
                            q1Var.a("GmsClientSupervisor");
                        }
                        s1Var.f().remove(p1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        s1 s1Var2 = this.f27029a;
        synchronized (s1Var2.f()) {
            try {
                p1 p1Var2 = (p1) message.obj;
                q1 q1Var2 = (q1) s1Var2.f().get(p1Var2);
                if (q1Var2 != null && q1Var2.e() == 3) {
                    String strValueOf = String.valueOf(p1Var2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentNameI = q1Var2.i();
                    if (componentNameI == null) {
                        componentNameI = p1Var2.c();
                    }
                    if (componentNameI == null) {
                        String strB = p1Var2.b();
                        s.l(strB);
                        componentNameI = new ComponentName(strB, "unknown");
                    }
                    q1Var2.onServiceDisconnected(componentNameI);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
