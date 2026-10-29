package dj;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.roblox.client.provider.ShellConfigurationContentProvider;
import gh.C6098c;
import gh.EnumC6096a;
import p015ak.C0305k0;
import p048cj.C1670b;
import p151gk.C6124q;
import p308nh.C9477c;
import sg.C11295a1;
import sg.C11347q0;
import sg.C11355t;

/* JADX INFO: renamed from: dj.d */
/* JADX INFO: loaded from: classes2.dex */
public class C4625d implements InterfaceC4630i {

    /* JADX INFO: renamed from: a */
    public final String f18991a = "rbx.config";

    /* JADX INFO: renamed from: b */
    public Context f18992b;

    /* JADX INFO: renamed from: c */
    public ShellConfigurationContentProvider f18993c;

    public C4625d(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f18993c = shellConfigurationContentProvider;
        this.f18992b = context;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: a */
    public EnumC6096a mo22845a(InterfaceC4630i.a aVar) {
        if (aVar == InterfaceC4630i.a.GET) {
            return EnumC6096a.GetConfig;
        }
        if (aVar == InterfaceC4630i.a.POST) {
            return EnumC6096a.PostConfig;
        }
        return null;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: b */
    public Cursor mo22846b(Uri uri) {
        return new C1670b(this.f18993c.m15352d());
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: c */
    public void mo22842c(Uri uri, ContentValues contentValues) {
        if (contentValues.containsKey("settings_param")) {
            String asString = contentValues.getAsString("settings_param");
            C6124q.m27057b("rbx.config", "new payload:" + asString);
            m22847f().m26988l(asString);
            m22848g().mo8373b(asString);
        }
        if (contentValues.containsKey("channel_param")) {
            String asString2 = contentValues.getAsString("channel_param");
            C6124q.m27057b("rbx.config", "new robloxChannel:" + asString2);
            m22847f().m26994r(asString2);
            m22848g().mo8378g(asString2);
        }
        if (contentValues.containsKey("base_url_param")) {
            String asString3 = contentValues.getAsString("base_url_param");
            C6124q.m27057b("rbx.config", "new baseUrl:" + asString3);
            m22847f().m26989m(asString3);
            m22848g().mo8374c(asString3);
        }
        if (contentValues.containsKey("user_agent_param")) {
            String asString4 = contentValues.getAsString("user_agent_param");
            C6124q.m27057b("rbx.config", "set user agent:" + asString4);
            m22847f().m26995s(asString4);
            m22848g().mo8376e(asString4);
        }
        if (contentValues.containsKey("dev_branch") || contentValues.containsKey("dev_commit")) {
            String asString5 = contentValues.getAsString("dev_branch");
            C6124q.m27063h("rbx.config", "set dev branch: " + asString5);
            m22847f().m26991o(asString5);
            m22848g().mo8375d(asString5);
            String asString6 = contentValues.getAsString("dev_commit");
            C6124q.m27063h("rbx.config", "set dev commit: " + asString6);
            m22847f().m26992p(asString6);
            m22848g().mo8372a(asString6);
            C9477c.m37337d(this.f18992b, asString5, asString6);
            new Handler(this.f18992b.getMainLooper()).post(new Runnable() { // from class: dj.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18989a.m22849h();
                }
            });
        }
        if (contentValues.containsKey("dev_rpc_ip_port_override")) {
            String asString7 = contentValues.getAsString("dev_rpc_ip_port_override");
            C6124q.m27057b("rbx.config", "set dev rpc ip and port:" + asString7);
            m22847f().m26993q(asString7);
            m22848g().mo8377f(asString7);
            C11355t.m42529e(this.f18992b, asString7);
            new Handler(this.f18992b.getMainLooper()).post(new Runnable() { // from class: dj.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18990a.m22850i();
                }
            });
            if (C0305k0.m1274s(this.f18992b).m1300v()) {
                C11295a1.m42413P0(true);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final C6098c m22847f() {
        return this.f18993c.m15352d();
    }

    /* JADX INFO: renamed from: g */
    public final C6098c.a m22848g() {
        return this.f18993c.m15351c();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m22849h() {
        Toast.makeText(this.f18992b.getApplicationContext(), C11347q0.f39935R, 0).show();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m22850i() {
        Toast.makeText(this.f18992b.getApplicationContext(), C11347q0.f39935R, 0).show();
    }
}
