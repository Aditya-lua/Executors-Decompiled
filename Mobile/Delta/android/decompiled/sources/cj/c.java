package cj;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.client.personasdk.BuildConfig;
import gk.y;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class c implements gh.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wj.a f4932a;
    public SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4933c;

    public c(Context context) {
        this.f4932a = new wj.a(context);
        this.b = y.e(context.getApplicationContext()).d("configure_dev_roblox", true);
        a1.R0(context);
        this.f4933c = a1.m(context);
    }

    @Override // gh.c.a
    public void a(String str) {
        this.b.edit().putString("dev_commit", str).apply();
    }

    @Override // gh.c.a
    public void b(String str) {
        if (str != null) {
            this.f4932a.k(str);
        } else {
            this.f4932a.b();
        }
    }

    @Override // gh.c.a
    public void c(String str) {
        if (str != null) {
            this.b.edit().putString("BaseUrl", str).apply();
        } else {
            this.b.edit().remove("BaseUrl").apply();
        }
    }

    @Override // gh.c.a
    public void d(String str) {
        this.b.edit().putString("dev_branch", str).apply();
    }

    @Override // gh.c.a
    public void e(String str) {
        if (str != null) {
            this.b.edit().putString("user_agent", str).apply();
        } else {
            this.b.edit().remove("user_agent").apply();
        }
    }

    @Override // gh.c.a
    public void f(String str) {
        if (str != null) {
            this.b.edit().putString("dev_rpc_ip_port_override", str).apply();
        } else {
            this.b.edit().remove("dev_rpc_ip_port_override").apply();
        }
    }

    @Override // gh.c.a
    public void g(String str) {
        if (str != null) {
            this.b.edit().putString("RobloxChannel", str).apply();
        } else {
            this.b.edit().remove("RobloxChannel").apply();
        }
    }

    @Override // gh.c.a
    public gh.c read() {
        String strJ = this.f4932a.j();
        return new gh.c(this.b.getString("RobloxChannel", null), "", this.b.getString("BaseUrl", null), BuildConfig.BASE_URL, strJ, this.b.getString("user_agent", null), this.f4933c, this.b.getString("dev_rpc_ip_port_override", null), this.b.getString("dev_branch", null), this.b.getString("dev_commit", null));
    }
}
