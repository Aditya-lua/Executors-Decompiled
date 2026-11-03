package rg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.implementation.AppImplementations;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30686a;
    public Object b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.roblox.client.game.c f30687a = new com.roblox.client.game.c();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f30688a = new y();
    }

    public static y h() {
        return b.f30688a;
    }

    public uh.n a(uh.n.a aVar, uh.n.b bVar) {
        Object obj = this.b;
        if (obj instanceof vj.b) {
            return ((vj.b) obj).a(aVar, bVar);
        }
        ek.q.i("rbx.main", "Using default DataModelNotifications");
        return new uh.n(aVar, bVar);
    }

    public th.e b() {
        Object obj = this.b;
        if (obj instanceof vj.d) {
            return ((vj.d) obj).a();
        }
        ek.q.b("rbx.main", "Using default GenericWebFragment");
        return new th.e();
    }

    public yg.a c(Context context) {
        Object obj = this.b;
        if (obj instanceof yg.b) {
            return ((yg.b) obj).getRtcAudioManager(context);
        }
        ek.q.b("rbx.main", "No AudioRtcManager");
        return null;
    }

    public ti.d d() {
        Object obj = this.b;
        if (obj instanceof vj.a) {
            return ((vj.a) obj).getAppsFlyerManager();
        }
        ek.q.b("rbx.main", "No AppsFlyer");
        return new ti.d();
    }

    @NonNull
    public zl.r e() {
        Object obj = this.b;
        return obj instanceof gh.a ? ((gh.a) obj).a() : zl.r.y();
    }

    @NonNull
    public com.roblox.client.game.c f() {
        Object obj = this.b;
        return obj instanceof vj.c ? ((vj.c) obj).a() : a.f30687a;
    }

    @NonNull
    public gm.f g() {
        Object obj = this.b;
        return obj instanceof ii.a ? ((ii.a) obj).getIdentityProtocol() : gm.f.z();
    }

    public Intent i(Context context) {
        Object obj = this.b;
        if (obj instanceof vj.e) {
            return ((vj.e) obj).a(context);
        }
        ek.q.i("rbx.main", "Using default Main class");
        return new Intent(context, (Class<?>) ActivityNativeMain.class);
    }

    public ej.a j(Activity activity) {
        Object obj = this.b;
        if (obj instanceof vj.f) {
            return ((vj.f) obj).a(activity);
        }
        ek.q.b("rbx.main", "Using empty Midas");
        return new ej.a();
    }

    @NonNull
    public mm.k k() {
        Object obj = this.b;
        return obj instanceof yi.a ? ((yi.a) obj).getPermissionsProtocol() : mm.l.f0();
    }

    public tk.f l() {
        Object obj = this.b;
        if (obj instanceof vj.h) {
            return ((vj.h) obj).a();
        }
        ek.q.i("rbx.main", "Using default Provider");
        return new tk.a();
    }

    public hj.s m() {
        Object obj = this.b;
        if (obj instanceof vj.i) {
            return ((vj.i) obj).a();
        }
        ek.q.b("rbx.main", "No default push registrar");
        return null;
    }

    public hv.d<ResponseBody> n(yk.d dVar) {
        Object obj = this.b;
        if (obj instanceof vj.g) {
            return ((vj.g) obj).a(dVar);
        }
        ek.q.b("rbx.main", "No default push registration call");
        return null;
    }

    public Intent o(Context context) {
        Object obj = this.b;
        if (obj instanceof vj.j) {
            return ((vj.j) obj).a(context);
        }
        throw new RuntimeException("No StartActivityIntentFactory interface implemented");
    }

    public tj.a p() {
        Object obj = this.b;
        if (obj instanceof vj.k) {
            return ((vj.k) obj).a();
        }
        ek.q.b("rbx.main", "Using empty TSS");
        return new tj.a();
    }

    public y() {
        this.f30686a = "com.roblox.client.implementation.AppImplementations";
        try {
            this.b = AppImplementations.class.newInstance();
        } catch (ClassNotFoundException unused) {
            ek.q.k("rbx.main", "Failed to find implementation class");
        } catch (IllegalAccessException | InstantiationException unused2) {
            ek.q.k("rbx.main", "Failed to instantiate implementation");
        }
    }
}
