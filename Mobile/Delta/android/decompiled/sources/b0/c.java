package b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import g0.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Long, k0> f3658a;
    public static final Map<k0, List<Long>> b;

    static {
        HashMap map = new HashMap();
        f3658a = map;
        HashMap map2 = new HashMap();
        b = map2;
        k0 k0Var = k0.f18009d;
        map.put(1L, k0Var);
        map2.put(k0Var, Collections.singletonList(1L));
        map.put(2L, k0.f18011f);
        map2.put((k0) map.get(2L), Collections.singletonList(2L));
        k0 k0Var2 = k0.f18012g;
        map.put(4L, k0Var2);
        map2.put(k0Var2, Collections.singletonList(4L));
        k0 k0Var3 = k0.f18013h;
        map.put(8L, k0Var3);
        map2.put(k0Var3, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            f3658a.put(it.next(), k0.f18014i);
        }
        b.put(k0.f18014i, listAsList);
        List<Long> listAsList2 = Arrays.asList(Long.valueOf(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), 2048L, 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f3658a.put(it2.next(), k0.f18015j);
        }
        b.put(k0.f18015j, listAsList2);
    }

    public static Long a(k0 k0Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = b.get(k0Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static k0 b(long j10) {
        return f3658a.get(Long.valueOf(j10));
    }
}
