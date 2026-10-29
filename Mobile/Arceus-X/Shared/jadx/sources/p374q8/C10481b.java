package p374q8;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: q8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10481b extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f37692a;

    public C10481b(C10480a c10480a, Map map) {
        this.f37692a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f37692a;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C10483d.m40289a(builderBuildUpon.build().toString());
    }
}
