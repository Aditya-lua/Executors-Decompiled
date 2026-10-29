package dj;

import android.database.Cursor;
import android.net.Uri;
import gh.EnumC6096a;
import p048cj.C1669a;
import p520wk.C12488j;
import sg.C11295a1;

/* JADX INFO: renamed from: dj.h */
/* JADX INFO: loaded from: classes2.dex */
public class C4629h extends AbstractC4622a {

    /* JADX INFO: renamed from: dj.h$a */
    public class a extends C1669a {
        public a() {
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"cookie_header", "cookie_value"};
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("cookie_header")) {
                return "Cookie";
            }
            if (i10 == getColumnIndex("cookie_value")) {
                return C12488j.m46781c().mo23956b(C11295a1.m42450g());
            }
            return null;
        }
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: a */
    public EnumC6096a mo22845a(InterfaceC4630i.a aVar) {
        if (aVar == InterfaceC4630i.a.GET) {
            return EnumC6096a.GetCookie;
        }
        return null;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: b */
    public Cursor mo22846b(Uri uri) {
        return new a();
    }
}
