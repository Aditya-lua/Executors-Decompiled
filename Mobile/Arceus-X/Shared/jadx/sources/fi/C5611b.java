package fi;

import androidx.annotation.NonNull;
import com.github.luben.zstd.ZstdInputStream;
import com.roblox.client.RobloxApplication;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p104ei.C5124b;
import p560xu.C12919b0;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: fi.b */
/* JADX INFO: loaded from: classes2.dex */
public class C5611b implements Interceptor {
    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(Interceptor.Chain chain) {
        String str;
        byte[] bArrM23914a;
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
            bArrM23914a = C5124b.m23913b().m23914a(RobloxApplication.m14834f(), strHeader);
            if (bArrM23914a == null) {
                return builderMessage.build();
            }
        } else {
            bArrM23914a = null;
        }
        ZstdInputStream zstdInputStream = new ZstdInputStream(responseProceed.body().byteStream());
        InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(C12919b0.m47968j(zstdInputStream));
        if (bArrM23914a != null) {
            zstdInputStream.setDict(bArrM23914a);
        }
        return responseProceed.newBuilder().body(ResponseBody.create(responseProceed.body().getMediaType(), -1L, interfaceC12928gM47961c)).build();
    }
}
