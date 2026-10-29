package n9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f25271a;

    public /* synthetic */ g1(h1 h1Var, byte[] bArr) {
        Objects.requireNonNull(h1Var);
        this.f25271a = h1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            h1 h1Var = this.f25271a;
            synchronized (h1Var.f()) {
                try {
                    e1 e1Var = (e1) message.obj;
                    f1 f1Var = (f1) h1Var.f().get(e1Var);
                    if (f1Var != null && f1Var.g()) {
                        if (f1Var.d()) {
                            f1Var.a("GmsClientSupervisor");
                        }
                        h1Var.f().remove(e1Var);
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
        h1 h1Var2 = this.f25271a;
        synchronized (h1Var2.f()) {
            try {
                e1 e1Var2 = (e1) message.obj;
                f1 f1Var2 = (f1) h1Var2.f().get(e1Var2);
                if (f1Var2 != null && f1Var2.e() == 3) {
                    String strValueOf = String.valueOf(e1Var2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentNameI = f1Var2.i();
                    if (componentNameI == null) {
                        componentNameI = e1Var2.c();
                    }
                    if (componentNameI == null) {
                        String strB = e1Var2.b();
                        m.l(strB);
                        componentNameI = new ComponentName(strB, "unknown");
                    }
                    f1Var2.onServiceDisconnected(componentNameI);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
