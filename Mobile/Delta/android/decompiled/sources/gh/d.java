package gh;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f18230a;
    public String b;

    public d(Context context) {
        this(context.getPackageName() + context.getString(b.f18219a));
    }

    public c a(Context context) {
        c cVar;
        Cursor cursorB = b(context, a.GetConfig.b(this.b));
        if (cursorB == null || !cursorB.moveToFirst()) {
            cVar = null;
        } else {
            cVar = new c(cursorB.getString(cursorB.getColumnIndex("channel_param")), cursorB.getString(cursorB.getColumnIndex("default_channel_param")), cursorB.getString(cursorB.getColumnIndex("base_url_param")), cursorB.getString(cursorB.getColumnIndex("default_base_url_param")), cursorB.getString(cursorB.getColumnIndex("settings_param")), cursorB.getString(cursorB.getColumnIndex("user_agent_param")), cursorB.getString(cursorB.getColumnIndex("default_user_agent_param")), cursorB.getString(cursorB.getColumnIndex("dev_rpc_ip_port_override")), cursorB.getString(cursorB.getColumnIndex("dev_branch")), cursorB.getString(cursorB.getColumnIndex("dev_commit")));
            int columnIndex = cursorB.getColumnIndex("browser_tracker_id");
            if (columnIndex >= 0) {
                cVar.n(cursorB.getString(columnIndex));
            }
        }
        if (cursorB != null) {
            cursorB.close();
        }
        return cVar;
    }

    public final Cursor b(Context context, Uri uri) {
        try {
            return context.getContentResolver().query(uri, this.f18230a, null, null, null);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public d(String str) {
        this.f18230a = new String[]{"PROJECTION_NONE"};
        this.b = str;
    }
}
