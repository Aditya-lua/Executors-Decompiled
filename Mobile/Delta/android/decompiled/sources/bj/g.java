package bj;

import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class g extends a {
    @Override // bj.i
    public Cursor a(Uri uri) {
        return new aj.a();
    }

    @Override // bj.i
    public fh.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return fh.a.GetPing;
        }
        return null;
    }
}
