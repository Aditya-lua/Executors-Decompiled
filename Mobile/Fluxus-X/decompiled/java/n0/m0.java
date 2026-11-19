package n0;

import android.content.Context;
import android.util.Size;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface m0 extends l2 {

    public interface a {
        m0 a(Context context, Object obj, Set<String> set);
    }

    SurfaceConfig b(int i10, String str, int i11, Size size, u3 u3Var);

    SurfaceStreamSpecQueryResult g(int i10, String str, List<g> list, Map<i4<?>, List<Size>> map, boolean z10, boolean z11, boolean z12, boolean z13);
}
