package ni;

import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import mv.a0;
import mv.f0;
import mv.h0;

/* JADX INFO: loaded from: classes2.dex */
public class a implements a0 {
    @Override // mv.a0
    @NonNull
    public h0 intercept(a0.a aVar) {
        f0 request = aVar.getRequest();
        String url = request.getUrl().getUrl();
        if (!url.matches(".*/settings-compressed/application/[^/]+/(?:bucket/[^/]+/)?[^/]+\\.dcz")) {
            return aVar.a(request);
        }
        String[] strArrSplit = url.split("/");
        return aVar.a(request.j().m("X-Rbx-Zstd-Dict-SHA", strArrSplit[strArrSplit.length - 1].replace(".dcz", BuildConfig.FLAVOR)).b());
    }
}
