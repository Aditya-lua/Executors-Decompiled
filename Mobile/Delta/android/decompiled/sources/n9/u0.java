package n9;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends db.p {
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c cVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(cVar);
        this.b = cVar;
    }

    public static final void a(Message message) {
        v0 v0Var = (v0) message.obj;
        if (v0Var != null) {
            v0Var.c();
        }
    }

    public static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = this.b;
        if (cVar.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !cVar.enableLocalFallback()) || message.what == 5)) && !cVar.isConnecting()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            cVar.zzn(new ConnectionResult(message.arg2));
            if (cVar.zzg() && !cVar.zzo()) {
                cVar.zzd(3, null);
                return;
            }
            ConnectionResult connectionResultZzm = cVar.zzm() != null ? cVar.zzm() : new ConnectionResult(8);
            cVar.zzc.a(connectionResultZzm);
            cVar.onConnectionFailed(connectionResultZzm);
            return;
        }
        if (i11 == 5) {
            ConnectionResult connectionResultZzm2 = cVar.zzm() != null ? cVar.zzm() : new ConnectionResult(8);
            cVar.zzc.a(connectionResultZzm2);
            cVar.onConnectionFailed(connectionResultZzm2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            cVar.zzc.a(connectionResult);
            cVar.onConnectionFailed(connectionResult);
            return;
        }
        if (i11 == 6) {
            cVar.zzd(5, null);
            if (cVar.zzk() != null) {
                cVar.zzk().onConnectionSuspended(message.arg2);
            }
            cVar.onConnectionSuspended(message.arg2);
            cVar.zze(5, 1, null);
            return;
        }
        if (i11 == 2 && !cVar.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((v0) message.obj).b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
