package o9;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends eb.p {
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(d dVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(dVar);
        this.b = dVar;
    }

    public static final void a(Message message) {
        f1 f1Var = (f1) message.obj;
        if (f1Var != null) {
            f1Var.c();
        }
    }

    public static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d dVar = this.b;
        if (dVar.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !dVar.enableLocalFallback()) || message.what == 5)) && !dVar.isConnecting()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            dVar.zzn(new k9.b(message.arg2));
            if (dVar.zzg() && !dVar.zzo()) {
                dVar.zzd(3, null);
                return;
            }
            k9.b bVarZzm = dVar.zzm() != null ? dVar.zzm() : new k9.b(8);
            dVar.zzc.c(bVarZzm);
            dVar.onConnectionFailed(bVarZzm);
            return;
        }
        if (i11 == 5) {
            k9.b bVarZzm2 = dVar.zzm() != null ? dVar.zzm() : new k9.b(8);
            dVar.zzc.c(bVarZzm2);
            dVar.onConnectionFailed(bVarZzm2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            k9.b bVar = new k9.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            dVar.zzc.c(bVar);
            dVar.onConnectionFailed(bVar);
            return;
        }
        if (i11 == 6) {
            dVar.zzd(5, null);
            if (dVar.zzk() != null) {
                dVar.zzk().onConnectionSuspended(message.arg2);
            }
            dVar.onConnectionSuspended(message.arg2);
            dVar.zze(5, 1, null);
            return;
        }
        if (i11 == 2 && !dVar.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((f1) message.obj).b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
