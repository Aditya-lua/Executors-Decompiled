package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import q5.a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1746a = (IconCompat) aVar.v(remoteActionCompat.f1746a, 1);
        remoteActionCompat.b = aVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.f1747c = aVar.l(remoteActionCompat.f1747c, 3);
        remoteActionCompat.f1748d = (PendingIntent) aVar.r(remoteActionCompat.f1748d, 4);
        remoteActionCompat.f1749e = aVar.h(remoteActionCompat.f1749e, 5);
        remoteActionCompat.f1750f = aVar.h(remoteActionCompat.f1750f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1746a, 1);
        aVar.D(remoteActionCompat.b, 2);
        aVar.D(remoteActionCompat.f1747c, 3);
        aVar.H(remoteActionCompat.f1748d, 4);
        aVar.z(remoteActionCompat.f1749e, 5);
        aVar.z(remoteActionCompat.f1750f, 6);
    }
}
