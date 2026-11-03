package aj;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.client.personasdk.BuildConfig;
import ek.z;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class c implements fh.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uj.a f577a;
    public SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f578c;

    public c(Context context) {
        this.f577a = new uj.a(context);
        this.b = z.e(context.getApplicationContext()).d("configure_dev_roblox", true);
        a1.S0(context);
        this.f578c = a1.m(context);
    }

    @Override // fh.c.a
    public void a(String str) {
        this.b.edit().putString("dev_commit", str).apply();
    }

    @Override // fh.c.a
    public void b(String str) {
        if (str != null) {
            this.f577a.k(str);
        } else {
            this.f577a.b();
        }
    }

    @Override // fh.c.a
    public void c(String str) {
        if (str != null) {
            this.b.edit().putString("BaseUrl", str).apply();
        } else {
            this.b.edit().remove("BaseUrl").apply();
        }
    }

    @Override // fh.c.a
    public void d(String str) {
        this.b.edit().putString("dev_branch", str).apply();
    }

    @Override // fh.c.a
    public void e(String str) {
        if (str != null) {
            this.b.edit().putString("user_agent", str).apply();
        } else {
            this.b.edit().remove("user_agent").apply();
        }
    }

    @Override // fh.c.a
    public void f(String str) {
        if (str != null) {
            this.b.edit().putString("dev_rpc_ip_port_override", str).apply();
        } else {
            this.b.edit().remove("dev_rpc_ip_port_override").apply();
        }
    }

    @Override // fh.c.a
    public void g(String str) {
        if (str != null) {
            this.b.edit().putString("RobloxChannel", str).apply();
        } else {
            this.b.edit().remove("RobloxChannel").apply();
        }
    }

    @Override // fh.c.a
    public fh.c read() {
        String strJ = this.f577a.j();
        return new fh.c(this.b.getString("RobloxChannel", null), "", this.b.getString("BaseUrl", null), BuildConfig.BASE_URL, strJ, this.b.getString("user_agent", null), this.f578c, this.b.getString("dev_rpc_ip_port_override", null), this.b.getString("dev_branch", null), this.b.getString("dev_commit", null));
    }
}
