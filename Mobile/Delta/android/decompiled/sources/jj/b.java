package jj;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.util.function.Consumer;
import mj.j0;
import sg.l0;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T extends j0> implements j<T>, mj.v.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mj.v<T> f21479a = new mj.v<>(this);

    @Override // jj.j
    public void a(Context context, String str) {
        this.f21479a.g(str);
        if (this.f21479a.e()) {
            g(context, o());
        } else {
            f(context, false);
        }
    }

    @Override // jj.j
    public void c(Context context, long j10) {
        this.f21479a.h(j10);
        if (this.f21479a.e()) {
            g(context, o());
        } else {
            f(context, false);
        }
    }

    @Override // jj.j
    public void clear() {
        this.f21479a.a();
    }

    @Override // jj.j
    public void d(Context context, T t8) {
        this.f21479a.f(t8);
        f(context, t());
    }

    public void f(final Context context, final boolean z10) {
        if (context == null || this.f21479a.e()) {
            return;
        }
        b0.f21480a.c(context, r(), new Consumer() { // from class: jj.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f21475a.s(context, z10, (Bitmap) obj);
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
        fVar.j(i(context, m()));
        fVar.n(j(context, m()));
        fVar.z(l0.f30806j);
        fVar.k(n(context));
        fVar.f(true);
        fVar.l(p(context));
        fVar.v(this.f21479a.i());
        fVar.s(bitmap);
        if (z10) {
            fVar.A(RingtoneManager.getDefaultUri(2));
        } else {
            fVar.A(null);
        }
        fVar.B(new k2.k.d().h(n(context)));
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
        if (this.f21479a.e()) {
            return null;
        }
        mj.v<T> vVar = this.f21479a;
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
        if (this.f21479a.e()) {
            return;
        }
        w(context, h(context, z10, bitmap));
    }

    public boolean t() {
        return this.f21479a.i() != 0 && this.f21479a.i() <= 2;
    }

    public abstract Intent u(Intent intent, T t8);

    public abstract Intent v(Intent intent, T t8);

    public void w(Context context, k2.k.f fVar) {
        ((NotificationManager) context.getSystemService("notification")).notify(o(), fVar.c());
    }
}
