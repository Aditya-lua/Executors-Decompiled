package dj;

import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class g extends a {
    @Override // dj.i
    public gh.a a(i.a aVar) {
        if (aVar == i.a.GET) {
            return gh.a.GetPing;
        }
        return null;
    }

    @Override // dj.i
    public Cursor b(Uri uri) {
        return new cj.a();
    }
}
