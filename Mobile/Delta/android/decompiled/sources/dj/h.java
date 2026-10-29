package dj;

import android.database.Cursor;
import android.net.Uri;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class h extends dj.a {

    public class a extends cj.a {
        public a() {
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"cookie_header", "cookie_value"};
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("cookie_header")) {
                return "Cookie";
            }
            if (i10 == getColumnIndex("cookie_value")) {
                return wk.j.c().b(a1.g());
            }
            return null;
        }
    }

    @Override // dj.i
    public gh.a a(i.a aVar) {
        if (aVar == i.a.GET) {
            return gh.a.GetCookie;
        }
        return null;
    }

    @Override // dj.i
    public Cursor b(Uri uri) {
        return new a();
    }
}
