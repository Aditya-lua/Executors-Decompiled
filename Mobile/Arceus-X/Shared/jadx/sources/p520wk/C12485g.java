package p520wk;

import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import p151gk.C6124q;
import p579yk.C13200b;

/* JADX INFO: renamed from: wk.g */
/* JADX INFO: loaded from: classes2.dex */
public class C12485g {
    /* JADX INFO: renamed from: a */
    public Response m46765a(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, String str3) {
        return m46766b(okHttpClient, str, str2, map, str3, false);
    }

    /* JADX INFO: renamed from: b */
    public Response m46766b(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, String str3, boolean z10) {
        return m46767c(okHttpClient, new Request.Builder(), str, str2, map, str3, false);
    }

    /* JADX INFO: renamed from: c */
    public Response m46767c(OkHttpClient okHttpClient, Request.Builder builder, String str, String str2, Map<String, String> map, String str3, boolean z10) {
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
            String strM48819a = C13200b.m48819a();
            if (strM48819a != null) {
                builder.header("X-CSRF-TOKEN", strM48819a);
            }
            str4 = str7;
        } else {
            str4 = str3;
        }
        Response responseExecute = okHttpClient.newCall(builder.build()).execute();
        if (responseExecute.code() == 403) {
            String strHeader = responseExecute.header("X-CSRF-TOKEN");
            if (!z10 && strHeader != null) {
                C6124q.m27057b("rbx.platform", "XSRF: got token. retrying");
                C13200b.m48820c(strHeader);
                return m46766b(okHttpClient, str, str2, map, str4, true);
            }
            if (z10) {
                C6124q.m27057b("rbx.platform", "XSRF Error: retry already attempted. Will not retry");
                return responseExecute;
            }
            C6124q.m27057b("rbx.platform", "XSRF Error: token not present in response. Will not retry");
        }
        return responseExecute;
    }
}
