package sg;

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
    public final String f31081a;
    public Object b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.roblox.client.game.c f31082a = new com.roblox.client.game.c();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f31083a = new y();
    }

    public static y h() {
        return b.f31083a;
    }

    public wh.n a(wh.n.a aVar, wh.n.b bVar) {
        Object obj = this.b;
        if (obj instanceof xj.b) {
            return ((xj.b) obj).a(aVar, bVar);
        }
        gk.p.i("rbx.main", "Using default DataModelNotifications");
        return new wh.n(aVar, bVar);
    }

    public vh.e b() {
        Object obj = this.b;
        if (obj instanceof xj.d) {
            return ((xj.d) obj).a();
        }
        gk.p.b("rbx.main", "Using default GenericWebFragment");
        return new vh.e();
    }

    public zg.a c(Context context) {
        Object obj = this.b;
        if (obj instanceof zg.b) {
            return ((zg.b) obj).getRtcAudioManager(context);
        }
        gk.p.b("rbx.main", "No AudioRtcManager");
        return null;
    }

    public vi.d d() {
        Object obj = this.b;
        if (obj instanceof xj.a) {
            return ((xj.a) obj).getAppsFlyerManager();
        }
        gk.p.b("rbx.main", "No AppsFlyer");
        return new vi.d();
    }

    @NonNull
    public bm.r e() {
        Object obj = this.b;
        return obj instanceof hh.a ? ((hh.a) obj).a() : bm.r.y();
    }

    @NonNull
    public com.roblox.client.game.c f() {
        Object obj = this.b;
        return obj instanceof xj.c ? ((xj.c) obj).a() : a.f31082a;
    }

    @NonNull
    public im.f g() {
        Object obj = this.b;
        return obj instanceof ki.a ? ((ki.a) obj).getIdentityProtocol() : im.f.z();
    }

    public Intent i(Context context) {
        Object obj = this.b;
        if (obj instanceof xj.e) {
            return ((xj.e) obj).a(context);
        }
        gk.p.i("rbx.main", "Using default Main class");
        return new Intent(context, (Class<?>) ActivityNativeMain.class);
    }

    public gj.a j(Activity activity) {
        Object obj = this.b;
        if (obj instanceof xj.f) {
            return ((xj.f) obj).a(activity);
        }
        gk.p.b("rbx.main", "Using empty Midas");
        return new gj.a();
    }

    @NonNull
    public om.k k() {
        Object obj = this.b;
        return obj instanceof aj.a ? ((aj.a) obj).getPermissionsProtocol() : om.l.f0();
    }

    public vk.f l() {
        Object obj = this.b;
        if (obj instanceof xj.h) {
            return ((xj.h) obj).a();
        }
        gk.p.i("rbx.main", "Using default Provider");
        return new vk.a();
    }

    public jj.s m() {
        Object obj = this.b;
        if (obj instanceof xj.i) {
            return ((xj.i) obj).a();
        }
        gk.p.b("rbx.main", "No default push registrar");
        return null;
    }

    public jv.d<ResponseBody> n(al.d dVar) {
        Object obj = this.b;
        if (obj instanceof xj.g) {
            return ((xj.g) obj).a(dVar);
        }
        gk.p.b("rbx.main", "No default push registration call");
        return null;
    }

    public Intent o(Context context) {
        Object obj = this.b;
        if (obj instanceof xj.j) {
            return ((xj.j) obj).a(context);
        }
        throw new RuntimeException("No StartActivityIntentFactory interface implemented");
    }

    public vj.a p() {
        Object obj = this.b;
        if (obj instanceof xj.k) {
            return ((xj.k) obj).a();
        }
        gk.p.b("rbx.main", "Using empty TSS");
        return new vj.a();
    }

    public y() {
        this.f31081a = "com.roblox.client.implementation.AppImplementations";
        try {
            this.b = AppImplementations.class.newInstance();
        } catch (ClassNotFoundException unused) {
            gk.p.k("rbx.main", "Failed to find implementation class");
        } catch (IllegalAccessException | InstantiationException unused2) {
            gk.p.k("rbx.main", "Failed to instantiate implementation");
        }
    }
}
