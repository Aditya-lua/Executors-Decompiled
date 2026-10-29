package sg;

import al.C0359d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import bm.C1466r;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.game.C3198c;
import com.roblox.client.implementation.AppImplementations;
import im.C6826f;
import ki.InterfaceC7620a;
import okhttp3.ResponseBody;
import om.AbstractC9810k;
import om.C9811l;
import p014aj.InterfaceC0263a;
import p150gj.C6102a;
import p151gk.C6124q;
import p172hh.InterfaceC6405a;
import p222jj.InterfaceC7194s;
import p231jv.InterfaceC7376d;
import p491vh.C12201e;
import p492vj.C12218a;
import p493vk.C12219a;
import p493vk.InterfaceC12224f;
import p517wh.C12449n;
import p549xj.InterfaceC12843a;
import p549xj.InterfaceC12844b;
import p549xj.InterfaceC12845c;
import p549xj.InterfaceC12846d;
import p549xj.InterfaceC12847e;
import p549xj.InterfaceC12848f;
import p549xj.InterfaceC12849g;
import p549xj.InterfaceC12850h;
import p549xj.InterfaceC12851i;
import p549xj.InterfaceC12852j;
import p549xj.InterfaceC12853k;
import p604zg.InterfaceC13810a;
import p604zg.InterfaceC13811b;
import vi.C12213d;

/* JADX INFO: renamed from: sg.y */
/* JADX INFO: loaded from: classes2.dex */
public class C11370y {

    /* JADX INFO: renamed from: a */
    public final String f40194a;

    /* JADX INFO: renamed from: b */
    public Object f40195b;

    /* JADX INFO: renamed from: sg.y$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C3198c f40196a = new C3198c();
    }

    /* JADX INFO: renamed from: sg.y$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C11370y f40197a = new C11370y();
    }

    /* JADX INFO: renamed from: h */
    public static C11370y m42581h() {
        return b.f40197a;
    }

    /* JADX INFO: renamed from: a */
    public C12449n m42582a(C12449n.a aVar, C12449n.b bVar) {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12844b) {
            return ((InterfaceC12844b) obj).m47821a(aVar, bVar);
        }
        C6124q.m27064i("rbx.main", "Using default DataModelNotifications");
        return new C12449n(aVar, bVar);
    }

    /* JADX INFO: renamed from: b */
    public C12201e m42583b() {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12846d) {
            return ((InterfaceC12846d) obj).m47823a();
        }
        C6124q.m27057b("rbx.main", "Using default GenericWebFragment");
        return new C12201e();
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC13810a m42584c(Context context) {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC13811b) {
            return ((InterfaceC13811b) obj).getRtcAudioManager(context);
        }
        C6124q.m27057b("rbx.main", "No AudioRtcManager");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public C12213d m42585d() {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12843a) {
            return ((InterfaceC12843a) obj).getAppsFlyerManager();
        }
        C6124q.m27057b("rbx.main", "No AppsFlyer");
        return new C12213d();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public C1466r m42586e() {
        Object obj = this.f40195b;
        return obj instanceof InterfaceC6405a ? ((InterfaceC6405a) obj).m27988a() : C1466r.m7498y();
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C3198c m42587f() {
        Object obj = this.f40195b;
        return obj instanceof InterfaceC12845c ? ((InterfaceC12845c) obj).m47822a() : a.f40196a;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public C6826f m42588g() {
        Object obj = this.f40195b;
        return obj instanceof InterfaceC7620a ? ((InterfaceC7620a) obj).getIdentityProtocol() : C6826f.m29205z();
    }

    /* JADX INFO: renamed from: i */
    public Intent m42589i(Context context) {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12847e) {
            return ((InterfaceC12847e) obj).m47824a(context);
        }
        C6124q.m27064i("rbx.main", "Using default Main class");
        return new Intent(context, (Class<?>) ActivityNativeMain.class);
    }

    /* JADX INFO: renamed from: j */
    public C6102a m42590j(Activity activity) {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12848f) {
            return ((InterfaceC12848f) obj).m47825a(activity);
        }
        C6124q.m27057b("rbx.main", "Using empty Midas");
        return new C6102a();
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public AbstractC9810k m42591k() {
        Object obj = this.f40195b;
        return obj instanceof InterfaceC0263a ? ((InterfaceC0263a) obj).getPermissionsProtocol() : C9811l.m38663f0();
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC12224f m42592l() {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12850h) {
            return ((InterfaceC12850h) obj).m47827a();
        }
        C6124q.m27064i("rbx.main", "Using default Provider");
        return new C12219a();
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC7194s m42593m() {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12851i) {
            return ((InterfaceC12851i) obj).m47828a();
        }
        C6124q.m27057b("rbx.main", "No default push registrar");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC7376d<ResponseBody> m42594n(C0359d c0359d) {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12849g) {
            return ((InterfaceC12849g) obj).m47826a(c0359d);
        }
        C6124q.m27057b("rbx.main", "No default push registration call");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public Intent m42595o(Context context) {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12852j) {
            return ((InterfaceC12852j) obj).m47829a(context);
        }
        throw new RuntimeException("No StartActivityIntentFactory interface implemented");
    }

    /* JADX INFO: renamed from: p */
    public C12218a m42596p() {
        Object obj = this.f40195b;
        if (obj instanceof InterfaceC12853k) {
            return ((InterfaceC12853k) obj).m47830a();
        }
        C6124q.m27057b("rbx.main", "Using empty TSS");
        return new C12218a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11370y() {
        this.f40194a = "com.roblox.client.implementation.AppImplementations";
        try {
            this.f40195b = AppImplementations.class.newInstance();
        } catch (ClassNotFoundException unused) {
            C6124q.m27066k("rbx.main", "Failed to find implementation class");
        } catch (IllegalAccessException | InstantiationException unused2) {
            C6124q.m27066k("rbx.main", "Failed to instantiate implementation");
        }
    }
}
