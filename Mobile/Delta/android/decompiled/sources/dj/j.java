package dj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class j extends dj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f14738a;

    public class a extends cj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14739a;

        public a(String str) {
            this.f14739a = str;
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"user_agent_param"};
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f14739a;
        }
    }

    public j(Context context) {
        this.f14738a = context;
    }

    @Override // dj.i
    public gh.a a(i.a aVar) {
        if (aVar == i.a.GET) {
            return gh.a.GetUserAgent;
        }
        return null;
    }

    @Override // dj.i
    public Cursor b(Uri uri) {
        String queryParameter = uri.getQueryParameter("user_agent_param");
        a1.R0(this.f14738a);
        if (queryParameter == null) {
            queryParameter = "google";
        }
        return new a(a1.n(this.f14738a, queryParameter));
    }
}
