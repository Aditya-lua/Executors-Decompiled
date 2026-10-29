package dj;

import ak.k0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.roblox.client.provider.ShellConfigurationContentProvider;
import gk.p;
import sg.a1;
import sg.q0;
import sg.t;

/* JADX INFO: loaded from: classes2.dex */
public class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14728a = "rbx.config";
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShellConfigurationContentProvider f14729c;

    public d(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f14729c = shellConfigurationContentProvider;
        this.b = context;
    }

    @Override // dj.i
    public gh.a a(i.a aVar) {
        if (aVar == i.a.GET) {
            return gh.a.GetConfig;
        }
        if (aVar == i.a.POST) {
            return gh.a.PostConfig;
        }
        return null;
    }

    @Override // dj.i
    public Cursor b(Uri uri) {
        return new cj.b(this.f14729c.d());
    }

    @Override // dj.i
    public void c(Uri uri, ContentValues contentValues) {
        if (contentValues.containsKey("settings_param")) {
            String asString = contentValues.getAsString("settings_param");
            p.b("rbx.config", "new payload:" + asString);
            f().l(asString);
            g().b(asString);
        }
        if (contentValues.containsKey("channel_param")) {
            String asString2 = contentValues.getAsString("channel_param");
            p.b("rbx.config", "new robloxChannel:" + asString2);
            f().r(asString2);
            g().g(asString2);
        }
        if (contentValues.containsKey("base_url_param")) {
            String asString3 = contentValues.getAsString("base_url_param");
            p.b("rbx.config", "new baseUrl:" + asString3);
            f().m(asString3);
            g().c(asString3);
        }
        if (contentValues.containsKey("user_agent_param")) {
            String asString4 = contentValues.getAsString("user_agent_param");
            p.b("rbx.config", "set user agent:" + asString4);
            f().s(asString4);
            g().e(asString4);
        }
        if (contentValues.containsKey("dev_branch") || contentValues.containsKey("dev_commit")) {
            String asString5 = contentValues.getAsString("dev_branch");
            p.h("rbx.config", "set dev branch: " + asString5);
            f().o(asString5);
            g().d(asString5);
            String asString6 = contentValues.getAsString("dev_commit");
            p.h("rbx.config", "set dev commit: " + asString6);
            f().p(asString6);
            g().a(asString6);
            nh.c.d(this.b, asString5, asString6);
            new Handler(this.b.getMainLooper()).post(new Runnable() { // from class: dj.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14726a.h();
                }
            });
        }
        if (contentValues.containsKey("dev_rpc_ip_port_override")) {
            String asString7 = contentValues.getAsString("dev_rpc_ip_port_override");
            p.b("rbx.config", "set dev rpc ip and port:" + asString7);
            f().q(asString7);
            g().f(asString7);
            t.e(this.b, asString7);
            new Handler(this.b.getMainLooper()).post(new Runnable() { // from class: dj.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14727a.i();
                }
            });
            if (k0.s(this.b).v()) {
                a1.P0(true);
            }
        }
    }

    public final gh.c f() {
        return this.f14729c.d();
    }

    public final gh.c.a g() {
        return this.f14729c.c();
    }

    public final /* synthetic */ void h() {
        Toast.makeText(this.b.getApplicationContext(), q0.R, 0).show();
    }

    public final /* synthetic */ void i() {
        Toast.makeText(this.b.getApplicationContext(), q0.R, 0).show();
    }
}
