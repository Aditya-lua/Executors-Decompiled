package ok;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import mv.i0;

/* JADX INFO: loaded from: classes2.dex */
public class y {
    public static String a(sw.x<i0> xVar) {
        try {
            if (xVar.a() != null) {
                return xVar.a().h();
            }
            return xVar.e() != null ? xVar.e().h() : BuildConfig.FLAVOR;
        } catch (IOException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
