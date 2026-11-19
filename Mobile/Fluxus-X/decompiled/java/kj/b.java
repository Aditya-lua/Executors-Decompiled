package kj;

import bh.a1;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ph.c f21459a;

    public b(ph.c cVar) {
        this.f21459a = cVar;
    }

    @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return new String[]{"channel_param", "default_channel_param", "base_url_param", "default_base_url_param", "settings_param", "user_agent_param", "default_user_agent_param", "dev_rpc_ip_port_override", "dev_branch", "dev_commit", "browser_tracker_id"};
    }

    @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        if (i10 == getColumnIndex("channel_param")) {
            return this.f21459a.h();
        }
        if (i10 == getColumnIndex("default_channel_param")) {
            return this.f21459a.c();
        }
        if (i10 == getColumnIndex("base_url_param")) {
            return this.f21459a.a();
        }
        if (i10 == getColumnIndex("default_base_url_param")) {
            return this.f21459a.b();
        }
        if (i10 == getColumnIndex("settings_param")) {
            return this.f21459a.j();
        }
        if (i10 == getColumnIndex("user_agent_param")) {
            return this.f21459a.k();
        }
        if (i10 == getColumnIndex("default_user_agent_param")) {
            return this.f21459a.d();
        }
        if (i10 == getColumnIndex("dev_rpc_ip_port_override")) {
            return this.f21459a.g();
        }
        if (i10 == getColumnIndex("dev_branch")) {
            return this.f21459a.e();
        }
        if (i10 == getColumnIndex("dev_commit")) {
            return this.f21459a.f();
        }
        if (i10 == getColumnIndex("browser_tracker_id")) {
            return String.valueOf(a1.f4037u);
        }
        return null;
    }
}
