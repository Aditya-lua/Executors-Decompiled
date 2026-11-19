package lj;

import android.database.Cursor;
import android.net.Uri;
import bh.a1;

/* JADX INFO: loaded from: classes2.dex */
public class h extends lj.a {

    public class a extends kj.a {
        public a() {
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"cookie_header", "cookie_value"};
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("cookie_header")) {
                return "Cookie";
            }
            if (i10 == getColumnIndex("cookie_value")) {
                return dl.j.e().d(a1.g());
            }
            return null;
        }
    }

    @Override // lj.i
    public Cursor a(Uri uri) {
        return new a();
    }

    @Override // lj.i
    public ph.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return ph.a.GetCookie;
        }
        return null;
    }
}
