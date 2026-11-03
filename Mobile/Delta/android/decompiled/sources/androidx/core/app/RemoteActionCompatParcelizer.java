package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import q5.a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1591a = (IconCompat) aVar.v(remoteActionCompat.f1591a, 1);
        remoteActionCompat.b = aVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.f1592c = aVar.l(remoteActionCompat.f1592c, 3);
        remoteActionCompat.f1593d = (PendingIntent) aVar.r(remoteActionCompat.f1593d, 4);
        remoteActionCompat.f1594e = aVar.h(remoteActionCompat.f1594e, 5);
        remoteActionCompat.f1595f = aVar.h(remoteActionCompat.f1595f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1591a, 1);
        aVar.D(remoteActionCompat.b, 2);
        aVar.D(remoteActionCompat.f1592c, 3);
        aVar.H(remoteActionCompat.f1593d, 4);
        aVar.z(remoteActionCompat.f1594e, 5);
        aVar.z(remoteActionCompat.f1595f, 6);
    }
}
