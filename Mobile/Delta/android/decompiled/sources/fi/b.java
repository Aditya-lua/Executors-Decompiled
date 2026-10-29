package fi;

import androidx.annotation.NonNull;
import com.github.luben.zstd.ZstdInputStream;
import com.roblox.client.RobloxApplication;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xu.b0;
import xu.g;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Interceptor {
    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(Interceptor.Chain chain) {
        String str;
        byte[] bArrA;
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.body() == null || (str = responseProceed.headers().get("Content-Encoding")) == null) {
            return responseProceed;
        }
        if (!str.equals("zstd") && !str.equals("dcz")) {
            return responseProceed;
        }
        if (str.equals("dcz")) {
            Response.Builder builderMessage = responseProceed.newBuilder().code(HttpStatusCode.NOT_FOUND_404).message("Dictionary not found");
            String strHeader = responseProceed.request().header("X-Rbx-Zstd-Dict-SHA");
            if (strHeader == null) {
                return builderMessage.build();
            }
            bArrA = ei.b.b().a(RobloxApplication.f(), strHeader);
            if (bArrA == null) {
                return builderMessage.build();
            }
        } else {
            bArrA = null;
        }
        ZstdInputStream zstdInputStream = new ZstdInputStream(responseProceed.body().byteStream());
        g gVarC = b0.c(b0.j(zstdInputStream));
        if (bArrA != null) {
            zstdInputStream.setDict(bArrA);
        }
        return responseProceed.newBuilder().body(ResponseBody.create(responseProceed.body().getMediaType(), -1L, gVarC)).build();
    }
}
