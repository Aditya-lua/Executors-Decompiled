package lj;

import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class g extends a {
    @Override // lj.i
    public Cursor a(Uri uri) {
        return new kj.a();
    }

    @Override // lj.i
    public ph.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return ph.a.GetPing;
        }
        return null;
    }
}
