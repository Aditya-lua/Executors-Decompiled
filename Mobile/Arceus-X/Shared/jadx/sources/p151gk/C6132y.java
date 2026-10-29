package p151gk;

import java.io.IOException;
import okhttp3.ResponseBody;
import p231jv.C7396x;

/* JADX INFO: renamed from: gk.y */
/* JADX INFO: loaded from: classes2.dex */
public class C6132y {
    /* JADX INFO: renamed from: a */
    public static String m27103a(C7396x<ResponseBody> c7396x) {
        try {
            if (c7396x.m30653a() != null) {
                return c7396x.m30653a().string();
            }
            return c7396x.m30655e() != null ? c7396x.m30655e().string() : "";
        } catch (IOException unused) {
            return "";
        }
    }
}
