package aj;

import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fh.c f576a;

    public b(fh.c cVar) {
        this.f576a = cVar;
    }

    @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return new String[]{"channel_param", "default_channel_param", "base_url_param", "default_base_url_param", "settings_param", "user_agent_param", "default_user_agent_param", "dev_rpc_ip_port_override", "dev_branch", "dev_commit", "browser_tracker_id"};
    }

    @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        if (i10 == getColumnIndex("channel_param")) {
            return this.f576a.h();
        }
        if (i10 == getColumnIndex("default_channel_param")) {
            return this.f576a.c();
        }
        if (i10 == getColumnIndex("base_url_param")) {
            return this.f576a.a();
        }
        if (i10 == getColumnIndex("default_base_url_param")) {
            return this.f576a.b();
        }
        if (i10 == getColumnIndex("settings_param")) {
            return this.f576a.j();
        }
        if (i10 == getColumnIndex("user_agent_param")) {
            return this.f576a.k();
        }
        if (i10 == getColumnIndex("default_user_agent_param")) {
            return this.f576a.d();
        }
        if (i10 == getColumnIndex("dev_rpc_ip_port_override")) {
            return this.f576a.g();
        }
        if (i10 == getColumnIndex("dev_branch")) {
            return this.f576a.e();
        }
        if (i10 == getColumnIndex("dev_commit")) {
            return this.f576a.f();
        }
        if (i10 == getColumnIndex("browser_tracker_id")) {
            return String.valueOf(a1.f30334u);
        }
        return null;
    }
}
