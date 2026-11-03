package bj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class j extends bj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4330a;

    public class a extends aj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4331a;

        public a(String str) {
            this.f4331a = str;
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"user_agent_param"};
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f4331a;
        }
    }

    public j(Context context) {
        this.f4330a = context;
    }

    @Override // bj.i
    public Cursor a(Uri uri) {
        String queryParameter = uri.getQueryParameter("user_agent_param");
        a1.S0(this.f4330a);
        if (queryParameter == null) {
            queryParameter = "google";
        }
        return new a(a1.n(this.f4330a, queryParameter));
    }

    @Override // bj.i
    public fh.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return fh.a.GetUserAgent;
        }
        return null;
    }
}
