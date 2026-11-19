package rj;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import bh.l0;
import bh.q0;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.util.function.Consumer;
import uj.j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T extends j0> implements j<T>, uj.v.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uj.v<T> f30738a = new uj.v<>(this);

    @Override // rj.j
    public void a(Context context, String str) {
        this.f30738a.g(str);
        if (this.f30738a.e()) {
            g(context, o());
        } else {
            f(context, false);
        }
    }

    @Override // rj.j
    public void c(Context context, T t8) {
        this.f30738a.f(t8);
        f(context, t());
    }

    @Override // rj.j
    public void clear() {
        this.f30738a.a();
    }

    @Override // rj.j
    public void d(Context context, long j10) {
        this.f30738a.h(j10);
        if (this.f30738a.e()) {
            g(context, o());
        } else {
            f(context, false);
        }
    }

    public void f(final Context context, final boolean z10) {
        if (context == null || this.f30738a.e()) {
            return;
        }
        b0.f30739a.c(context, r(), new Consumer() { // from class: rj.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f30734a.s(context, z10, (Bitmap) obj);
            }
        });
    }

    public void g(Context context, int i10) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i10);
        }
    }

    public k2.k.f h(Context context, boolean z10, Bitmap bitmap) {
        k2.k.f fVar = new k2.k.f(context, "channel_general");
        fVar.l(i(context, m()));
        fVar.p(j(context, m()));
        fVar.C(l0.f4110j);
        fVar.m(n(context));
        fVar.g(true);
        fVar.n(p(context));
        fVar.x(this.f30738a.i());
        fVar.u(bitmap);
        if (z10) {
            fVar.D(RingtoneManager.getDefaultUri(2));
        } else {
            fVar.D(null);
        }
        fVar.E(new k2.k.d().h(n(context)));
        return fVar;
    }

    public final PendingIntent i(Context context, T t8) {
        Intent intent = new Intent(k(2));
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        Intent intentU = u(intent, t8);
        intentU.putExtra("EXTRA_NOTIFICATION_ID", t8.getNotificationId());
        intentU.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intentU.putExtra("EXTRA_NOTIFICATION_TYPE", q());
        return PendingIntent.getActivity(context, o(), intentU, 301989888);
    }

    public PendingIntent j(Context context, T t8) {
        Intent intent = new Intent(k(1));
        intent.setClass(context, l());
        Intent intentV = v(intent, t8);
        intentV.putExtra("EXTRA_NOTIFICATION_TYPE", q());
        intentV.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intentV.putExtra("EXTRA_NOTIFICATION_ID", t8.getNotificationId());
        return PendingIntent.getBroadcast(context, o(), intentV, 301989888);
    }

    public abstract String k(int i10);

    public abstract Class<?> l();

    public T m() {
        if (this.f30738a.e()) {
            return null;
        }
        uj.v<T> vVar = this.f30738a;
        return (T) vVar.b(vVar.i() - 1);
    }

    public abstract String n(Context context);

    public abstract int o();

    public String p(Context context) {
        return context.getString(q0.O);
    }

    public abstract String q();

    public abstract long r();

    public final /* synthetic */ void s(Context context, boolean z10, Bitmap bitmap) {
        if (this.f30738a.e()) {
            return;
        }
        w(context, h(context, z10, bitmap));
    }

    public boolean t() {
        return this.f30738a.i() != 0 && this.f30738a.i() <= 2;
    }

    public abstract Intent u(Intent intent, T t8);

    public abstract Intent v(Intent intent, T t8);

    public void w(Context context, k2.k.f fVar) {
        ((NotificationManager) context.getSystemService("notification")).notify(o(), fVar.d());
    }
}
