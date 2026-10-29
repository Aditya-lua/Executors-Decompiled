package gh;

import android.content.ContentValues;
import android.net.Uri;

/* JADX INFO: renamed from: gh.a */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6096a {
    GetPing("ping.get", 1),
    GetConfig("config.get", 2),
    PostConfig("config.post", 3),
    GetUserAgent("ua.get", 4),
    GetDevRpcIpAndPort("devrpc.get", 5),
    GetDevBranchAndCommit("devbranchcommit.get", 6),
    GetCookie("cookie.get", 7);


    /* JADX INFO: renamed from: a */
    public final String f23428a;

    /* JADX INFO: renamed from: b */
    public final int f23429b;

    EnumC6096a(String str, int i10) {
        this.f23428a = str;
        this.f23429b = i10;
    }

    /* JADX INFO: renamed from: b */
    public Uri m26975b(String str) {
        return m26976c(str, null);
    }

    /* JADX INFO: renamed from: c */
    public Uri m26976c(String str, ContentValues contentValues) {
        Uri uriBuild = Uri.parse("content://" + str + "/" + this.f23428a);
        if (contentValues != null) {
            for (String str2 : contentValues.keySet()) {
                uriBuild = uriBuild.buildUpon().appendQueryParameter(str2, contentValues.getAsString(str2)).build();
            }
        }
        return uriBuild;
    }
}
