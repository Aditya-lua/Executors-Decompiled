package cj;

import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gh.c f4931a;

    public b(gh.c cVar) {
        this.f4931a = cVar;
    }

    @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return new String[]{"channel_param", "default_channel_param", "base_url_param", "default_base_url_param", "settings_param", "user_agent_param", "default_user_agent_param", "dev_rpc_ip_port_override", "dev_branch", "dev_commit", "browser_tracker_id"};
    }

    @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        if (i10 == getColumnIndex("channel_param")) {
            return this.f4931a.h();
        }
        if (i10 == getColumnIndex("default_channel_param")) {
            return this.f4931a.c();
        }
        if (i10 == getColumnIndex("base_url_param")) {
            return this.f4931a.a();
        }
        if (i10 == getColumnIndex("default_base_url_param")) {
            return this.f4931a.b();
        }
        if (i10 == getColumnIndex("settings_param")) {
            return this.f4931a.j();
        }
        if (i10 == getColumnIndex("user_agent_param")) {
            return this.f4931a.k();
        }
        if (i10 == getColumnIndex("default_user_agent_param")) {
            return this.f4931a.d();
        }
        if (i10 == getColumnIndex("dev_rpc_ip_port_override")) {
            return this.f4931a.g();
        }
        if (i10 == getColumnIndex("dev_branch")) {
            return this.f4931a.e();
        }
        if (i10 == getColumnIndex("dev_commit")) {
            return this.f4931a.f();
        }
        if (i10 == getColumnIndex("browser_tracker_id")) {
            return String.valueOf(a1.f30733u);
        }
        return null;
    }
}
