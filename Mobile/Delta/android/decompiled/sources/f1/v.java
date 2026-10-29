package f1;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static v b(Uri uri) {
        x2.g.h(uri, "OutputUri cannot be null.");
        return new h(uri);
    }

    public abstract Uri a();
}
