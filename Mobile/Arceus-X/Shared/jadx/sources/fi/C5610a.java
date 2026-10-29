package fi;

import androidx.annotation.NonNull;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: fi.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5610a implements Interceptor {
    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        String url = request.url().getUrl();
        if (!url.matches(".*/settings-compressed/application/[^/]+/(?:bucket/[^/]+/)?[^/]+\\.dcz")) {
            return chain.proceed(request);
        }
        String[] strArrSplit = url.split("/");
        return chain.proceed(request.newBuilder().header("X-Rbx-Zstd-Dict-SHA", strArrSplit[strArrSplit.length - 1].replace(".dcz", "")).build());
    }
}
