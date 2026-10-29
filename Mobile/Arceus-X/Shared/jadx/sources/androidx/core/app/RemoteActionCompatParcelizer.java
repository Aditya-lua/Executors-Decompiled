package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p371q5.AbstractC10433a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC10433a abstractC10433a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2267a = (IconCompat) abstractC10433a.m40181v(remoteActionCompat.f2267a, 1);
        remoteActionCompat.f2268b = abstractC10433a.m40171l(remoteActionCompat.f2268b, 2);
        remoteActionCompat.f2269c = abstractC10433a.m40171l(remoteActionCompat.f2269c, 3);
        remoteActionCompat.f2270d = (PendingIntent) abstractC10433a.m40177r(remoteActionCompat.f2270d, 4);
        remoteActionCompat.f2271e = abstractC10433a.m40167h(remoteActionCompat.f2271e, 5);
        remoteActionCompat.f2272f = abstractC10433a.m40167h(remoteActionCompat.f2272f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC10433a abstractC10433a) {
        abstractC10433a.m40183x(false, false);
        abstractC10433a.m40158M(remoteActionCompat.f2267a, 1);
        abstractC10433a.m40149D(remoteActionCompat.f2268b, 2);
        abstractC10433a.m40149D(remoteActionCompat.f2269c, 3);
        abstractC10433a.m40153H(remoteActionCompat.f2270d, 4);
        abstractC10433a.m40185z(remoteActionCompat.f2271e, 5);
        abstractC10433a.m40185z(remoteActionCompat.f2272f, 6);
    }
}
