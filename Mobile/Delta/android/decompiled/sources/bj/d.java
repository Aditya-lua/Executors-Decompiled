package bj;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.roblox.client.provider.ShellConfigurationContentProvider;
import ek.q;
import rg.a1;
import rg.q0;
import rg.t;
import yj.k0;

/* JADX INFO: loaded from: classes2.dex */
public class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4320a = "rbx.config";
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShellConfigurationContentProvider f4321c;

    public d(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f4321c = shellConfigurationContentProvider;
        this.b = context;
    }

    @Override // bj.i
    public Cursor a(Uri uri) {
        return new aj.b(this.f4321c.d());
    }

    @Override // bj.i
    public fh.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return fh.a.GetConfig;
        }
        if (aVar == i.a.POST) {
            return fh.a.PostConfig;
        }
        return null;
    }

    @Override // bj.i
    public void c(Uri uri, ContentValues contentValues) {
        if (contentValues.containsKey("settings_param")) {
            String asString = contentValues.getAsString("settings_param");
            q.b("rbx.config", "new payload:" + asString);
            f().l(asString);
            g().b(asString);
        }
        if (contentValues.containsKey("channel_param")) {
            String asString2 = contentValues.getAsString("channel_param");
            q.b("rbx.config", "new robloxChannel:" + asString2);
            f().r(asString2);
            g().g(asString2);
        }
        if (contentValues.containsKey("base_url_param")) {
            String asString3 = contentValues.getAsString("base_url_param");
            q.b("rbx.config", "new baseUrl:" + asString3);
            f().m(asString3);
            g().c(asString3);
        }
        if (contentValues.containsKey("user_agent_param")) {
            String asString4 = contentValues.getAsString("user_agent_param");
            q.b("rbx.config", "set user agent:" + asString4);
            f().s(asString4);
            g().e(asString4);
        }
        if (contentValues.containsKey("dev_branch") || contentValues.containsKey("dev_commit")) {
            String asString5 = contentValues.getAsString("dev_branch");
            q.h("rbx.config", "set dev branch: " + asString5);
            f().o(asString5);
            g().d(asString5);
            String asString6 = contentValues.getAsString("dev_commit");
            q.h("rbx.config", "set dev commit: " + asString6);
            f().p(asString6);
            g().a(asString6);
            mh.c.d(this.b, asString5, asString6);
            new Handler(this.b.getMainLooper()).post(new Runnable() { // from class: bj.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4318a.h();
                }
            });
        }
        if (contentValues.containsKey("dev_rpc_ip_port_override")) {
            String asString7 = contentValues.getAsString("dev_rpc_ip_port_override");
            q.b("rbx.config", "set dev rpc ip and port:" + asString7);
            f().q(asString7);
            g().f(asString7);
            t.e(this.b, asString7);
            new Handler(this.b.getMainLooper()).post(new Runnable() { // from class: bj.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4319a.i();
                }
            });
            if (k0.s(this.b).v()) {
                a1.Q0(true);
            }
        }
    }

    public final fh.c f() {
        return this.f4321c.d();
    }

    public final fh.c.a g() {
        return this.f4321c.c();
    }

    public final /* synthetic */ void h() {
        Toast.makeText(this.b.getApplicationContext(), q0.R, 0).show();
    }

    public final /* synthetic */ void i() {
        Toast.makeText(this.b.getApplicationContext(), q0.R, 0).show();
    }
}
