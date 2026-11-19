package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import r5.a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1553a = (IconCompat) aVar.v(remoteActionCompat.f1553a, 1);
        remoteActionCompat.b = aVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.f1554c = aVar.l(remoteActionCompat.f1554c, 3);
        remoteActionCompat.f1555d = (PendingIntent) aVar.r(remoteActionCompat.f1555d, 4);
        remoteActionCompat.f1556e = aVar.h(remoteActionCompat.f1556e, 5);
        remoteActionCompat.f1557f = aVar.h(remoteActionCompat.f1557f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1553a, 1);
        aVar.D(remoteActionCompat.b, 2);
        aVar.D(remoteActionCompat.f1554c, 3);
        aVar.H(remoteActionCompat.f1555d, 4);
        aVar.z(remoteActionCompat.f1556e, 5);
        aVar.z(remoteActionCompat.f1557f, 6);
    }
}
