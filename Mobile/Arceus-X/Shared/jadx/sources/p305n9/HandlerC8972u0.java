package p305n9;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import p074db.HandlerC4534p;

/* JADX INFO: renamed from: n9.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC8972u0 extends HandlerC4534p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8923c f32638b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8972u0(AbstractC8923c abstractC8923c, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC8923c);
        this.f32638b = abstractC8923c;
    }

    /* JADX INFO: renamed from: a */
    public static final void m36073a(Message message) {
        AbstractC8974v0 abstractC8974v0 = (AbstractC8974v0) message.obj;
        if (abstractC8974v0 != null) {
            abstractC8974v0.m36076c();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m36074b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC8923c abstractC8923c = this.f32638b;
        if (abstractC8923c.zzd.get() != message.arg1) {
            if (m36074b(message)) {
                m36073a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !abstractC8923c.enableLocalFallback()) || message.what == 5)) && !abstractC8923c.isConnecting()) {
            m36073a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            abstractC8923c.zzn(new ConnectionResult(message.arg2));
            if (abstractC8923c.zzg() && !abstractC8923c.zzo()) {
                abstractC8923c.zzd(3, null);
                return;
            }
            ConnectionResult connectionResultZzm = abstractC8923c.zzm() != null ? abstractC8923c.zzm() : new ConnectionResult(8);
            abstractC8923c.zzc.mo33245a(connectionResultZzm);
            abstractC8923c.onConnectionFailed(connectionResultZzm);
            return;
        }
        if (i11 == 5) {
            ConnectionResult connectionResultZzm2 = abstractC8923c.zzm() != null ? abstractC8923c.zzm() : new ConnectionResult(8);
            abstractC8923c.zzc.mo33245a(connectionResultZzm2);
            abstractC8923c.onConnectionFailed(connectionResultZzm2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC8923c.zzc.mo33245a(connectionResult);
            abstractC8923c.onConnectionFailed(connectionResult);
            return;
        }
        if (i11 == 6) {
            abstractC8923c.zzd(5, null);
            if (abstractC8923c.zzk() != null) {
                abstractC8923c.zzk().onConnectionSuspended(message.arg2);
            }
            abstractC8923c.onConnectionSuspended(message.arg2);
            abstractC8923c.zze(5, 1, null);
            return;
        }
        if (i11 == 2 && !abstractC8923c.isConnected()) {
            m36073a(message);
            return;
        }
        if (m36074b(message)) {
            ((AbstractC8974v0) message.obj).m36075b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
