package dj;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import gh.EnumC6096a;

/* JADX INFO: renamed from: dj.i */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4630i {

    /* JADX INFO: renamed from: dj.i$a */
    public enum a {
        GET,
        POST
    }

    /* JADX INFO: renamed from: a */
    EnumC6096a mo22845a(a aVar);

    /* JADX INFO: renamed from: b */
    Cursor mo22846b(Uri uri);

    /* JADX INFO: renamed from: c */
    void mo22842c(Uri uri, ContentValues contentValues);
}
