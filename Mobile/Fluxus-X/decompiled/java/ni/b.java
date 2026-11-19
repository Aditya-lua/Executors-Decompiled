package ni;

import androidx.annotation.NonNull;
import com.github.luben.zstd.ZstdInputStream;
import com.roblox.client.RobloxApplication;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import ew.g;
import ew.v;
import mv.a0;
import mv.h0;
import mv.i0;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a0 {
    @Override // mv.a0
    @NonNull
    public h0 intercept(a0.a aVar) {
        String strA;
        byte[] bArrA;
        h0 h0VarA = aVar.a(aVar.getRequest());
        if (h0VarA.getBody() == null || (strA = h0VarA.getHeaders().a("Content-Encoding")) == null) {
            return h0VarA;
        }
        if (!strA.equals("zstd") && !strA.equals("dcz")) {
            return h0VarA;
        }
        if (strA.equals("dcz")) {
            h0.a aVarL = h0VarA.s().f(HttpStatusCode.NOT_FOUND_404).l("Dictionary not found");
            String strE = h0VarA.getRequest().e("X-Rbx-Zstd-Dict-SHA");
            if (strE == null) {
                return aVarL.c();
            }
            bArrA = mi.b.b().a(RobloxApplication.f(), strE);
            if (bArrA == null) {
                return aVarL.c();
            }
        } else {
            bArrA = null;
        }
        ZstdInputStream zstdInputStream = new ZstdInputStream(h0VarA.getBody().a());
        g gVarC = v.c(v.j(zstdInputStream));
        if (bArrA != null) {
            zstdInputStream.setDict(bArrA);
        }
        return h0VarA.s().b(i0.g(h0VarA.getBody().getMediaType(), -1L, gVarC)).c();
    }
}
