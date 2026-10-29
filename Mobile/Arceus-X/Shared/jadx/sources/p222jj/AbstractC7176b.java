package p222jj;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.util.function.Consumer;
import p235k2.C7419k;
import p294mj.C8562v;
import p294mj.InterfaceC8549j0;
import sg.C11332l0;
import sg.C11347q0;

/* JADX INFO: renamed from: jj.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7176b<T extends InterfaceC8549j0> implements InterfaceC7185j<T>, C8562v.a<T> {

    /* JADX INFO: renamed from: a */
    public C8562v<T> f27844a = new C8562v<>(this);

    @Override // p222jj.InterfaceC7185j
    /* JADX INFO: renamed from: a */
    public void mo29979a(Context context, String str) {
        this.f27844a.m34497g(str);
        if (this.f27844a.m34495e()) {
            m29983g(context, mo29991o());
        } else {
            m29982f(context, false);
        }
    }

    @Override // p222jj.InterfaceC7185j
    /* JADX INFO: renamed from: c */
    public void mo29980c(Context context, long j10) {
        this.f27844a.m34498h(j10);
        if (this.f27844a.m34495e()) {
            m29983g(context, mo29991o());
        } else {
            m29982f(context, false);
        }
    }

    @Override // p222jj.InterfaceC7185j
    public void clear() {
        this.f27844a.m34491a();
    }

    @Override // p222jj.InterfaceC7185j
    /* JADX INFO: renamed from: d */
    public void mo29981d(Context context, T t8) {
        this.f27844a.m34496f(t8);
        m29982f(context, m29996t());
    }

    /* JADX INFO: renamed from: f */
    public void m29982f(final Context context, final boolean z10) {
        if (context == null || this.f27844a.m34495e()) {
            return;
        }
        C7177b0.f27845a.m30002c(context, mo29994r(), new Consumer() { // from class: jj.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f27839a.m29995s(context, z10, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m29983g(Context context, int i10) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i10);
        }
    }

    /* JADX INFO: renamed from: h */
    public C7419k.f mo29984h(Context context, boolean z10, Bitmap bitmap) {
        C7419k.f fVar = new C7419k.f(context, "channel_general");
        fVar.m30786j(m29985i(context, m29989m()));
        fVar.m30790n(m29986j(context, m29989m()));
        fVar.m30802z(C11332l0.f39750j);
        fVar.m30787k(mo29990n(context));
        fVar.m30782f(true);
        fVar.m30788l(mo29992p(context));
        fVar.m30798v(this.f27844a.m34499i());
        fVar.m30795s(bitmap);
        if (z10) {
            fVar.m30771A(RingtoneManager.getDefaultUri(2));
        } else {
            fVar.m30771A(null);
        }
        fVar.m30772B(new C7419k.d().m30768h(mo29990n(context)));
        return fVar;
    }

    /* JADX INFO: renamed from: i */
    public final PendingIntent m29985i(Context context, T t8) {
        Intent intent = new Intent(mo29987k(2));
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        Intent intentMo29997u = mo29997u(intent, t8);
        intentMo29997u.putExtra("EXTRA_NOTIFICATION_ID", t8.getNotificationId());
        intentMo29997u.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intentMo29997u.putExtra("EXTRA_NOTIFICATION_TYPE", mo29993q());
        return PendingIntent.getActivity(context, mo29991o(), intentMo29997u, 301989888);
    }

    /* JADX INFO: renamed from: j */
    public PendingIntent m29986j(Context context, T t8) {
        Intent intent = new Intent(mo29987k(1));
        intent.setClass(context, mo29988l());
        Intent intentMo29998v = mo29998v(intent, t8);
        intentMo29998v.putExtra("EXTRA_NOTIFICATION_TYPE", mo29993q());
        intentMo29998v.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intentMo29998v.putExtra("EXTRA_NOTIFICATION_ID", t8.getNotificationId());
        return PendingIntent.getBroadcast(context, mo29991o(), intentMo29998v, 301989888);
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo29987k(int i10);

    /* JADX INFO: renamed from: l */
    public abstract Class<?> mo29988l();

    /* JADX INFO: renamed from: m */
    public T m29989m() {
        if (this.f27844a.m34495e()) {
            return null;
        }
        C8562v<T> c8562v = this.f27844a;
        return (T) c8562v.m34492b(c8562v.m34499i() - 1);
    }

    /* JADX INFO: renamed from: n */
    public abstract String mo29990n(Context context);

    /* JADX INFO: renamed from: o */
    public abstract int mo29991o();

    /* JADX INFO: renamed from: p */
    public String mo29992p(Context context) {
        return context.getString(C11347q0.f39929O);
    }

    /* JADX INFO: renamed from: q */
    public abstract String mo29993q();

    /* JADX INFO: renamed from: r */
    public abstract long mo29994r();

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m29995s(Context context, boolean z10, Bitmap bitmap) {
        if (this.f27844a.m34495e()) {
            return;
        }
        mo29999w(context, mo29984h(context, z10, bitmap));
    }

    /* JADX INFO: renamed from: t */
    public boolean m29996t() {
        return this.f27844a.m34499i() != 0 && this.f27844a.m34499i() <= 2;
    }

    /* JADX INFO: renamed from: u */
    public abstract Intent mo29997u(Intent intent, T t8);

    /* JADX INFO: renamed from: v */
    public abstract Intent mo29998v(Intent intent, T t8);

    /* JADX INFO: renamed from: w */
    public void mo29999w(Context context, C7419k.f fVar) {
        ((NotificationManager) context.getSystemService("notification")).notify(mo29991o(), fVar.m30780c());
    }
}
