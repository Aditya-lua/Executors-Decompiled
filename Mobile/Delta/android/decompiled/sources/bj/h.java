package bj;

import android.database.Cursor;
import android.net.Uri;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class h extends bj.a {

    public class a extends aj.a {
        public a() {
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"cookie_header", "cookie_value"};
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("cookie_header")) {
                return "Cookie";
            }
            if (i10 == getColumnIndex("cookie_value")) {
                return uk.j.c().b(a1.g());
            }
            return null;
        }
    }

    @Override // bj.i
    public Cursor a(Uri uri) {
        return new a();
    }

    @Override // bj.i
    public fh.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return fh.a.GetCookie;
        }
        return null;
    }
}
