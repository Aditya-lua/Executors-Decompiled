package dj;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface i {

    public enum a {
        GET,
        POST
    }

    gh.a a(a aVar);

    Cursor b(Uri uri);

    void c(Uri uri, ContentValues contentValues);
}
