package gh;

import android.content.ContentValues;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    GetPing("ping.get", 1),
    GetConfig("config.get", 2),
    PostConfig("config.post", 3),
    GetUserAgent("ua.get", 4),
    GetDevRpcIpAndPort("devrpc.get", 5),
    GetDevBranchAndCommit("devbranchcommit.get", 6),
    GetCookie("cookie.get", 7);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18218a;
    public final int b;

    a(String str, int i10) {
        this.f18218a = str;
        this.b = i10;
    }

    public Uri b(String str) {
        return c(str, null);
    }

    public Uri c(String str, ContentValues contentValues) {
        Uri uriBuild = Uri.parse("content://" + str + "/" + this.f18218a);
        if (contentValues != null) {
            for (String str2 : contentValues.keySet()) {
                uriBuild = uriBuild.buildUpon().appendQueryParameter(str2, contentValues.getAsString(str2)).build();
            }
        }
        return uriBuild;
    }
}
