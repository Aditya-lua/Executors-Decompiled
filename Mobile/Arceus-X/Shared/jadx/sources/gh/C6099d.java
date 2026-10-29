package gh;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: gh.d */
/* JADX INFO: loaded from: classes2.dex */
public class C6099d {

    /* JADX INFO: renamed from: a */
    public final String[] f23442a;

    /* JADX INFO: renamed from: b */
    public String f23443b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6099d(Context context) {
        this(context.getPackageName() + context.getString(C6097b.f23430a));
    }

    /* JADX INFO: renamed from: a */
    public C6098c m26996a(Context context) {
        C6098c c6098c;
        Cursor cursorM26997b = m26997b(context, EnumC6096a.GetConfig.m26975b(this.f23443b));
        if (cursorM26997b == null || !cursorM26997b.moveToFirst()) {
            c6098c = null;
        } else {
            c6098c = new C6098c(cursorM26997b.getString(cursorM26997b.getColumnIndex("channel_param")), cursorM26997b.getString(cursorM26997b.getColumnIndex("default_channel_param")), cursorM26997b.getString(cursorM26997b.getColumnIndex("base_url_param")), cursorM26997b.getString(cursorM26997b.getColumnIndex("default_base_url_param")), cursorM26997b.getString(cursorM26997b.getColumnIndex("settings_param")), cursorM26997b.getString(cursorM26997b.getColumnIndex("user_agent_param")), cursorM26997b.getString(cursorM26997b.getColumnIndex("default_user_agent_param")), cursorM26997b.getString(cursorM26997b.getColumnIndex("dev_rpc_ip_port_override")), cursorM26997b.getString(cursorM26997b.getColumnIndex("dev_branch")), cursorM26997b.getString(cursorM26997b.getColumnIndex("dev_commit")));
            int columnIndex = cursorM26997b.getColumnIndex("browser_tracker_id");
            if (columnIndex >= 0) {
                c6098c.m26990n(cursorM26997b.getString(columnIndex));
            }
        }
        if (cursorM26997b != null) {
            cursorM26997b.close();
        }
        return c6098c;
    }

    /* JADX INFO: renamed from: b */
    public final Cursor m26997b(Context context, Uri uri) {
        try {
            return context.getContentResolver().query(uri, this.f23442a, null, null, null);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6099d(String str) {
        this.f23442a = new String[]{"PROJECTION_NONE"};
        this.f23443b = str;
    }
}
