package kj;

import android.content.Context;
import android.content.SharedPreferences;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import ok.z;

/* JADX INFO: loaded from: classes2.dex */
public class c implements ph.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ek.a f21460a;
    public SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21461c;

    public c(Context context) {
        this.f21460a = new ek.a(context);
        this.b = z.e(context.getApplicationContext()).d("configure_dev_roblox", true);
        a1.S0(context);
        this.f21461c = a1.m(context);
    }

    @Override // ph.c.a
    public void a(String str) {
        this.b.edit().putString("dev_commit", str).apply();
    }

    @Override // ph.c.a
    public void b(String str) {
        if (str != null) {
            this.f21460a.k(str);
        } else {
            this.f21460a.b();
        }
    }

    @Override // ph.c.a
    public void c(String str) {
        if (str != null) {
            this.b.edit().putString("BaseUrl", str).apply();
        } else {
            this.b.edit().remove("BaseUrl").apply();
        }
    }

    @Override // ph.c.a
    public void d(String str) {
        this.b.edit().putString("dev_branch", str).apply();
    }

    @Override // ph.c.a
    public void e(String str) {
        if (str != null) {
            this.b.edit().putString("user_agent", str).apply();
        } else {
            this.b.edit().remove("user_agent").apply();
        }
    }

    @Override // ph.c.a
    public void f(String str) {
        if (str != null) {
            this.b.edit().putString("dev_rpc_ip_port_override", str).apply();
        } else {
            this.b.edit().remove("dev_rpc_ip_port_override").apply();
        }
    }

    @Override // ph.c.a
    public void g(String str) {
        if (str != null) {
            this.b.edit().putString("RobloxChannel", str).apply();
        } else {
            this.b.edit().remove("RobloxChannel").apply();
        }
    }

    @Override // ph.c.a
    public ph.c read() {
        String strJ = this.f21460a.j();
        return new ph.c(this.b.getString("RobloxChannel", null), BuildConfig.FLAVOR, this.b.getString("BaseUrl", null), "www.roblox.com", strJ, this.b.getString("user_agent", null), this.f21461c, this.b.getString("dev_rpc_ip_port_override", null), this.b.getString("dev_branch", null), this.b.getString("dev_commit", null));
    }
}
