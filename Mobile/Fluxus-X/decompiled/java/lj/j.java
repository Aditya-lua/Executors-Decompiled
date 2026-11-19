package lj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bh.a1;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class j extends lj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22274a;

    public class a extends kj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22275a;

        public a(String str) {
            this.f22275a = str;
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"user_agent_param"};
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f22275a;
        }
    }

    public j(Context context) {
        this.f22274a = context;
    }

    @Override // lj.i
    public Cursor a(Uri uri) {
        String queryParameter = uri.getQueryParameter("user_agent_param");
        a1.S0(this.f22274a);
        if (queryParameter == null) {
            queryParameter = Payload.SOURCE_GOOGLE;
        }
        return new a(a1.n(this.f22274a, queryParameter));
    }

    @Override // lj.i
    public ph.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return ph.a.GetUserAgent;
        }
        return null;
    }
}
