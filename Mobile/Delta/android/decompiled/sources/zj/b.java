package zj;

import android.content.Context;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pattern f37637a;
    public final km.a b;

    public b(String str) {
        this.b = new km.a(str);
    }

    public void a(Context context, String str, String str2) {
        this.b.e(context, str, str2);
    }

    public boolean b(String str) {
        if (this.f37637a == null) {
            this.f37637a = Pattern.compile("(?:(?:http|https):\\/\\/)?(?:[^.]+\\.)?(?:facebook\\.com|twitter\\.com|twitch\\.tv|youtube\\.com|discord\\.gg)(?:\\/.*)?");
        }
        return this.f37637a.matcher(str).matches();
    }
}
