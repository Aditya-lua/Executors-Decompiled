package p020b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.p336ws.RealWebSocket;
import p140g0.C5902k0;

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1177c {

    /* JADX INFO: renamed from: a */
    public static final Map<Long, C5902k0> f4920a;

    /* JADX INFO: renamed from: b */
    public static final Map<C5902k0, List<Long>> f4921b;

    static {
        HashMap map = new HashMap();
        f4920a = map;
        HashMap map2 = new HashMap();
        f4921b = map2;
        C5902k0 c5902k0 = C5902k0.f22550d;
        map.put(1L, c5902k0);
        map2.put(c5902k0, Collections.singletonList(1L));
        map.put(2L, C5902k0.f22552f);
        map2.put((C5902k0) map.get(2L), Collections.singletonList(2L));
        C5902k0 c5902k1 = C5902k0.f22553g;
        map.put(4L, c5902k1);
        map2.put(c5902k1, Collections.singletonList(4L));
        C5902k0 c5902k2 = C5902k0.f22554h;
        map.put(8L, c5902k2);
        map2.put(c5902k2, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            f4920a.put(it.next(), C5902k0.f22555i);
        }
        f4921b.put(C5902k0.f22555i, listAsList);
        List<Long> listAsList2 = Arrays.asList(Long.valueOf(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), 2048L, 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f4920a.put(it2.next(), C5902k0.f22556j);
        }
        f4921b.put(C5902k0.f22556j, listAsList2);
    }

    /* JADX INFO: renamed from: a */
    public static Long m6539a(C5902k0 c5902k0, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f4921b.get(c5902k0);
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

    /* JADX INFO: renamed from: b */
    public static C5902k0 m6540b(long j10) {
        return f4920a.get(Long.valueOf(j10));
    }
}
