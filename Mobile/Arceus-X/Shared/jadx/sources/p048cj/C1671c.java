package p048cj;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.client.personasdk.BuildConfig;
import gh.C6098c;
import p151gk.C6133z;
import p519wj.C12476a;
import sg.C11295a1;

/* JADX INFO: renamed from: cj.c */
/* JADX INFO: loaded from: classes2.dex */
public class C1671c implements C6098c.a {

    /* JADX INFO: renamed from: a */
    public C12476a f6438a;

    /* JADX INFO: renamed from: b */
    public SharedPreferences f6439b;

    /* JADX INFO: renamed from: c */
    public String f6440c;

    public C1671c(Context context) {
        this.f6438a = new C12476a(context);
        this.f6439b = C6133z.m27106e(context.getApplicationContext()).m27108d("configure_dev_roblox", true);
        C11295a1.m42417R0(context);
        this.f6440c = C11295a1.m42462m(context);
    }

    @Override // gh.C6098c.a
    /* JADX INFO: renamed from: a */
    public void mo8372a(String str) {
        this.f6439b.edit().putString("dev_commit", str).apply();
    }

    @Override // gh.C6098c.a
    /* JADX INFO: renamed from: b */
    public void mo8373b(String str) {
        if (str != null) {
            this.f6438a.m46739k(str);
        } else {
            this.f6438a.m46730b();
        }
    }

    @Override // gh.C6098c.a
    /* JADX INFO: renamed from: c */
    public void mo8374c(String str) {
        if (str != null) {
            this.f6439b.edit().putString("BaseUrl", str).apply();
        } else {
            this.f6439b.edit().remove("BaseUrl").apply();
        }
    }

    @Override // gh.C6098c.a
    /* JADX INFO: renamed from: d */
    public void mo8375d(String str) {
        this.f6439b.edit().putString("dev_branch", str).apply();
    }

    @Override // gh.C6098c.a
    /* JADX INFO: renamed from: e */
    public void mo8376e(String str) {
        if (str != null) {
            this.f6439b.edit().putString("user_agent", str).apply();
        } else {
            this.f6439b.edit().remove("user_agent").apply();
        }
    }

    @Override // gh.C6098c.a
    /* JADX INFO: renamed from: f */
    public void mo8377f(String str) {
        if (str != null) {
            this.f6439b.edit().putString("dev_rpc_ip_port_override", str).apply();
        } else {
            this.f6439b.edit().remove("dev_rpc_ip_port_override").apply();
        }
    }

    @Override // gh.C6098c.a
    /* JADX INFO: renamed from: g */
    public void mo8378g(String str) {
        if (str != null) {
            this.f6439b.edit().putString("RobloxChannel", str).apply();
        } else {
            this.f6439b.edit().remove("RobloxChannel").apply();
        }
    }

    @Override // gh.C6098c.a
    public C6098c read() {
        String strM46738j = this.f6438a.m46738j();
        return new C6098c(this.f6439b.getString("RobloxChannel", null), "", this.f6439b.getString("BaseUrl", null), BuildConfig.BASE_URL, strM46738j, this.f6439b.getString("user_agent", null), this.f6440c, this.f6439b.getString("dev_rpc_ip_port_override", null), this.f6439b.getString("dev_branch", null), this.f6439b.getString("dev_commit", null));
    }
}
