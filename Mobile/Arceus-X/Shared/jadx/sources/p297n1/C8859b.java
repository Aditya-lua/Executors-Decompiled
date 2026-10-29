package p297n1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p140g0.C5902k0;
import p296n0.InterfaceC8721a2;
import p533x2.C12637g;

/* JADX INFO: renamed from: n1.b */
/* JADX INFO: loaded from: classes.dex */
public class C8859b {

    /* JADX INFO: renamed from: a */
    public static final Map<Integer, Set<Integer>> f32245a;

    /* JADX INFO: renamed from: b */
    public static final Map<Integer, Set<Integer>> f32246b;

    /* JADX INFO: renamed from: c */
    public static final Map<Integer, Integer> f32247c;

    /* JADX INFO: renamed from: d */
    public static final Map<Integer, Integer> f32248d;

    /* JADX INFO: renamed from: e */
    public static final Map<String, Map<C5902k0, Integer>> f32249e;

    static {
        HashMap map = new HashMap();
        f32245a = map;
        HashMap map2 = new HashMap();
        f32246b = map2;
        HashMap map3 = new HashMap();
        f32247c = map3;
        HashMap map4 = new HashMap();
        f32248d = map4;
        HashMap map5 = new HashMap();
        f32249e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        C5902k0 c5902k0 = C5902k0.f22550d;
        map6.put(c5902k0, 1);
        C5902k0 c5902k1 = C5902k0.f22552f;
        map6.put(c5902k1, 2);
        C5902k0 c5902k2 = C5902k0.f22553g;
        map6.put(c5902k2, 4096);
        C5902k0 c5902k3 = C5902k0.f22554h;
        map6.put(c5902k3, 8192);
        HashMap map7 = new HashMap();
        map7.put(c5902k0, 1);
        map7.put(c5902k1, 2);
        map7.put(c5902k2, 4096);
        map7.put(c5902k3, 8192);
        HashMap map8 = new HashMap();
        map8.put(c5902k0, 1);
        map8.put(c5902k1, 4);
        map8.put(c5902k2, 4096);
        map8.put(c5902k3, 16384);
        HashMap map9 = new HashMap();
        map9.put(C5902k0.f22555i, 256);
        map9.put(C5902k0.f22556j, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    /* JADX INFO: renamed from: a */
    public static int m35569a(String str, C5902k0 c5902k0) {
        Integer num;
        Map<C5902k0, Integer> map = f32249e.get(str);
        if (map == null || (num = map.get(c5902k0)) == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public static Set<Integer> m35570b(C5902k0 c5902k0) {
        Set<Integer> set = f32245a.get(Integer.valueOf(c5902k0.m26516a()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    /* JADX INFO: renamed from: c */
    public static Set<Integer> m35571c(C5902k0 c5902k0) {
        Set<Integer> set = f32246b.get(Integer.valueOf(c5902k0.m26517b()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m35572d(int i10, C5902k0 c5902k0) {
        Set<Integer> set = f32245a.get(Integer.valueOf(c5902k0.m26516a()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m35573e(int i10, C5902k0 c5902k0) {
        Set<Integer> set = f32246b.get(Integer.valueOf(c5902k0.m26517b()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m35574f(InterfaceC8721a2.c cVar, C5902k0 c5902k0) {
        return m35572d(cVar.mo34988b(), c5902k0) && m35573e(cVar.mo34993g(), c5902k0);
    }

    /* JADX INFO: renamed from: g */
    public static int m35575g(int i10) {
        Map<Integer, Integer> map = f32247c;
        C12637g.m47069a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: h */
    public static int m35576h(int i10) {
        Map<Integer, Integer> map = f32248d;
        C12637g.m47069a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
