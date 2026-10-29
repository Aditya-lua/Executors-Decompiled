package wk;

import gk.p;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class g {
    public Response a(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, String str3) {
        return b(okHttpClient, str, str2, map, str3, false);
    }

    public Response b(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, String str3, boolean z10) {
        return c(okHttpClient, new Request.Builder(), str, str2, map, str3, false);
    }

    public Response c(OkHttpClient okHttpClient, Request.Builder builder, String str, String str2, Map<String, String> map, String str3, boolean z10) {
        String str4;
        builder.url(str);
        if (map != null) {
            for (String str5 : map.keySet()) {
                String str6 = map.get(str5);
                if (str5 != null && str6 != null) {
                    builder.header(str5, str6);
                }
            }
        }
        if (str2 != null) {
            String str7 = str3 == null ? "application/x-www-form-urlencoded;charset=UTF-8" : str3;
            builder.post(RequestBody.create(MediaType.parse(str7), str2));
            String strA = yk.b.a();
            if (strA != null) {
                builder.header("X-CSRF-TOKEN", strA);
            }
            str4 = str7;
        } else {
            str4 = str3;
        }
        Response responseExecute = okHttpClient.newCall(builder.build()).execute();
        if (responseExecute.code() == 403) {
            String strHeader = responseExecute.header("X-CSRF-TOKEN");
            if (!z10 && strHeader != null) {
                p.b("rbx.platform", "XSRF: got token. retrying");
                yk.b.c(strHeader);
                return b(okHttpClient, str, str2, map, str4, true);
            }
            if (z10) {
                p.b("rbx.platform", "XSRF Error: retry already attempted. Will not retry");
                return responseExecute;
            }
            p.b("rbx.platform", "XSRF Error: token not present in response. Will not retry");
        }
        return responseExecute;
    }
}
