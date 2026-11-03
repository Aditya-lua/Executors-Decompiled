package ek;

import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class y {
    public static String a(hv.x<ResponseBody> xVar) {
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
