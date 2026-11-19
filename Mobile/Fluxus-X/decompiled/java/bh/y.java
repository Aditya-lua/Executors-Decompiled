package bh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.implementation.AppImplementations;
import com.roblox.client.startup.MainGameActivity;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4387a;
    public Object b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.roblox.client.game.c f4388a = new com.roblox.client.game.c();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f4389a = new y();
    }

    public static y h() {
        return b.f4389a;
    }

    public ei.n a(ei.n.a aVar, ei.n.b bVar) {
        Object obj = this.b;
        if (obj instanceof fk.b) {
            return ((fk.b) obj).a(aVar, bVar);
        }
        ok.q.i("rbx.main", "Using default DataModelNotifications");
        return new ei.n(aVar, bVar);
    }

    public di.d b() {
        Object obj = this.b;
        if (obj instanceof fk.d) {
            return ((fk.d) obj).a();
        }
        ok.q.b("rbx.main", "Using default GenericWebFragment");
        return new di.d();
    }

    public ih.a c(Context context) {
        Object obj = this.b;
        if (obj instanceof ih.b) {
            return ((ih.b) obj).getRtcAudioManager(context);
        }
        ok.q.b("rbx.main", "No AudioRtcManager");
        return null;
    }

    public dj.d d() {
        Object obj = this.b;
        if (obj instanceof fk.a) {
            return ((fk.a) obj).getAppsFlyerManager();
        }
        ok.q.b("rbx.main", "No AppsFlyer");
        return new dj.d();
    }

    @NonNull
    public pm.r e() {
        Object obj = this.b;
        return obj instanceof qh.a ? ((qh.a) obj).a() : pm.r.y();
    }

    @NonNull
    public com.roblox.client.game.c f() {
        Object obj = this.b;
        return obj instanceof fk.c ? ((fk.c) obj).a() : a.f4388a;
    }

    @NonNull
    public wm.f g() {
        Object obj = this.b;
        return obj instanceof si.a ? ((si.a) obj).getIdentityProtocol() : wm.f.z();
    }

    public Intent i(Context context) {
        Object obj = this.b;
        if (obj instanceof fk.e) {
            return ((fk.e) obj).a(context);
        }
        if (bi.h.a().Q1() && bi.h.a().D3()) {
            return new Intent(context, (Class<?>) MainGameActivity.class);
        }
        ok.q.i("rbx.main", "Using default Main class");
        return new Intent(context, (Class<?>) ActivityNativeMain.class);
    }

    public oj.a j(Activity activity) {
        Object obj = this.b;
        if (obj instanceof fk.f) {
            return ((fk.f) obj).a(activity);
        }
        ok.q.b("rbx.main", "Using empty Midas");
        return new oj.a();
    }

    @NonNull
    public bn.k k() {
        Object obj = this.b;
        return obj instanceof ij.a ? ((ij.a) obj).getPermissionsProtocol() : bn.l.U();
    }

    public cl.f l() {
        Object obj = this.b;
        if (obj instanceof fk.h) {
            return ((fk.h) obj).a();
        }
        ok.q.i("rbx.main", "Using default Provider");
        return new cl.a();
    }

    public rj.s m() {
        Object obj = this.b;
        if (obj instanceof fk.i) {
            return ((fk.i) obj).a();
        }
        ok.q.b("rbx.main", "No default push registrar");
        return null;
    }

    public sw.d<mv.i0> n(kl.d dVar) {
        Object obj = this.b;
        if (obj instanceof fk.g) {
            return ((fk.g) obj).a(dVar);
        }
        ok.q.b("rbx.main", "No default push registration call");
        return null;
    }

    public Intent o(Context context) {
        Object obj = this.b;
        if (obj instanceof fk.j) {
            return ((fk.j) obj).a(context);
        }
        throw new RuntimeException("No StartActivityIntentFactory interface implemented");
    }

    public dk.a p() {
        Object obj = this.b;
        if (obj instanceof fk.k) {
            return ((fk.k) obj).a();
        }
        ok.q.b("rbx.main", "Using empty TSS");
        return new dk.a();
    }

    public y() {
        this.f4387a = "com.roblox.client.implementation.AppImplementations";
        try {
            this.b = AppImplementations.class.newInstance();
        } catch (ClassNotFoundException unused) {
            ok.q.k("rbx.main", "Failed to find implementation class");
        } catch (IllegalAccessException | InstantiationException unused2) {
            ok.q.k("rbx.main", "Failed to instantiate implementation");
        }
    }
}
