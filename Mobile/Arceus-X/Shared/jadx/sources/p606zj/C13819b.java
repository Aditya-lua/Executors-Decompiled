package p606zj;

import android.content.Context;
import java.util.regex.Pattern;
import km.C7630a;

/* JADX INFO: renamed from: zj.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13819b {

    /* JADX INFO: renamed from: a */
    public Pattern f48454a;

    /* JADX INFO: renamed from: b */
    public final C7630a f48455b;

    public C13819b(String str) {
        this.f48455b = new C7630a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m50302a(Context context, String str, String str2) {
        this.f48455b.m31518e(context, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m50303b(String str) {
        if (this.f48454a == null) {
            this.f48454a = Pattern.compile("(?:(?:http|https):\\/\\/)?(?:[^.]+\\.)?(?:facebook\\.com|twitter\\.com|twitch\\.tv|youtube\\.com|discord\\.gg)(?:\\/.*)?");
        }
        return this.f48454a.matcher(str).matches();
    }
}
