package gk;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class x {
    public static String a(jv.x<ResponseBody> xVar) {
        try {
            if (xVar.a() != null) {
                return xVar.a().string();
            }
            return xVar.e() != null ? xVar.e().string() : "";
        } catch (IOException unused) {
            return "";
        }
    }
}
