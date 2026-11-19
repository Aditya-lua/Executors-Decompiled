package lj;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface i {

    public enum a {
        GET,
        POST
    }

    Cursor a(Uri uri);

    ph.a b(a aVar);

    void c(Uri uri, ContentValues contentValues);
}
