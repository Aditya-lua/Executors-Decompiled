package p048cj;

import gh.C6098c;
import sg.C11295a1;

/* JADX INFO: renamed from: cj.b */
/* JADX INFO: loaded from: classes2.dex */
public class C1670b extends C1669a {

    /* JADX INFO: renamed from: a */
    public C6098c f6437a;

    public C1670b(C6098c c6098c) {
        this.f6437a = c6098c;
    }

    @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return new String[]{"channel_param", "default_channel_param", "base_url_param", "default_base_url_param", "settings_param", "user_agent_param", "default_user_agent_param", "dev_rpc_ip_port_override", "dev_branch", "dev_commit", "browser_tracker_id"};
    }

    @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        if (i10 == getColumnIndex("channel_param")) {
            return this.f6437a.m26984h();
        }
        if (i10 == getColumnIndex("default_channel_param")) {
            return this.f6437a.m26979c();
        }
        if (i10 == getColumnIndex("base_url_param")) {
            return this.f6437a.m26977a();
        }
        if (i10 == getColumnIndex("default_base_url_param")) {
            return this.f6437a.m26978b();
        }
        if (i10 == getColumnIndex("settings_param")) {
            return this.f6437a.m26986j();
        }
        if (i10 == getColumnIndex("user_agent_param")) {
            return this.f6437a.m26987k();
        }
        if (i10 == getColumnIndex("default_user_agent_param")) {
            return this.f6437a.m26980d();
        }
        if (i10 == getColumnIndex("dev_rpc_ip_port_override")) {
            return this.f6437a.m26983g();
        }
        if (i10 == getColumnIndex("dev_branch")) {
            return this.f6437a.m26981e();
        }
        if (i10 == getColumnIndex("dev_commit")) {
            return this.f6437a.m26982f();
        }
        if (i10 == getColumnIndex("browser_tracker_id")) {
            return String.valueOf(C11295a1.f39657u);
        }
        return null;
    }
}
