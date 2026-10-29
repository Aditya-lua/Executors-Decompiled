package p305n9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import java.util.Objects;

/* JADX INFO: renamed from: n9.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8937g1 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8940h1 f32602a;

    public /* synthetic */ C8937g1(C8940h1 c8940h1, byte[] bArr) {
        Objects.requireNonNull(c8940h1);
        this.f32602a = c8940h1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            C8940h1 c8940h1 = this.f32602a;
            synchronized (c8940h1.m36014f()) {
                try {
                    C8931e1 c8931e1 = (C8931e1) message.obj;
                    ServiceConnectionC8934f1 serviceConnectionC8934f1 = (ServiceConnectionC8934f1) c8940h1.m36014f().get(c8931e1);
                    if (serviceConnectionC8934f1 != null && serviceConnectionC8934f1.m35997g()) {
                        if (serviceConnectionC8934f1.m35994d()) {
                            serviceConnectionC8934f1.m35991a("GmsClientSupervisor");
                        }
                        c8940h1.m36014f().remove(c8931e1);
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
        C8940h1 c8940h2 = this.f32602a;
        synchronized (c8940h2.m36014f()) {
            try {
                C8931e1 c8931e2 = (C8931e1) message.obj;
                ServiceConnectionC8934f1 serviceConnectionC8934f2 = (ServiceConnectionC8934f1) c8940h2.m36014f().get(c8931e2);
                if (serviceConnectionC8934f2 != null && serviceConnectionC8934f2.m35995e() == 3) {
                    String strValueOf = String.valueOf(c8931e2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentNameM35999i = serviceConnectionC8934f2.m35999i();
                    if (componentNameM35999i == null) {
                        componentNameM35999i = c8931e2.m35984c();
                    }
                    if (componentNameM35999i == null) {
                        String strM35983b = c8931e2.m35983b();
                        C8953m.m36047l(strM35983b);
                        componentNameM35999i = new ComponentName(strM35983b, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    serviceConnectionC8934f2.onServiceDisconnected(componentNameM35999i);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
