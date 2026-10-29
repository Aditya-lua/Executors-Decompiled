package n1;

import com.google.mlkit.vision.barcode.common.Barcode;
import g0.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.a2;
import okhttp3.internal.http2.Http2;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Set<Integer>> f24978a;
    public static final Map<Integer, Set<Integer>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Integer, Integer> f24979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<Integer, Integer> f24980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, Map<k0, Integer>> f24981e;

    static {
        HashMap map = new HashMap();
        f24978a = map;
        HashMap map2 = new HashMap();
        b = map2;
        HashMap map3 = new HashMap();
        f24979c = map3;
        HashMap map4 = new HashMap();
        f24980d = map4;
        HashMap map5 = new HashMap();
        f24981e = map5;
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
        k0 k0Var = k0.f17470d;
        map6.put(k0Var, 1);
        k0 k0Var2 = k0.f17472f;
        map6.put(k0Var2, 2);
        k0 k0Var3 = k0.f17473g;
        Integer numValueOf = Integer.valueOf(Barcode.FORMAT_AZTEC);
        map6.put(k0Var3, numValueOf);
        k0 k0Var4 = k0.f17474h;
        map6.put(k0Var4, 8192);
        HashMap map7 = new HashMap();
        map7.put(k0Var, 1);
        map7.put(k0Var2, 2);
        map7.put(k0Var3, numValueOf);
        map7.put(k0Var4, 8192);
        HashMap map8 = new HashMap();
        map8.put(k0Var, 1);
        map8.put(k0Var2, 4);
        map8.put(k0Var3, numValueOf);
        map8.put(k0Var4, Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE));
        HashMap map9 = new HashMap();
        map9.put(k0.f17475i, Integer.valueOf(Barcode.FORMAT_QR_CODE));
        map9.put(k0.f17476j, Integer.valueOf(Barcode.FORMAT_UPC_A));
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static int a(String str, k0 k0Var) {
        Integer num;
        Map<k0, Integer> map = f24981e.get(str);
        if (map == null || (num = map.get(k0Var)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static Set<Integer> b(k0 k0Var) {
        Set<Integer> set = f24978a.get(Integer.valueOf(k0Var.a()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static Set<Integer> c(k0 k0Var) {
        Set<Integer> set = b.get(Integer.valueOf(k0Var.b()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static boolean d(int i10, k0 k0Var) {
        Set<Integer> set = f24978a.get(Integer.valueOf(k0Var.a()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    public static boolean e(int i10, k0 k0Var) {
        Set<Integer> set = b.get(Integer.valueOf(k0Var.b()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    public static boolean f(a2.c cVar, k0 k0Var) {
        return d(cVar.b(), k0Var) && e(cVar.g(), k0Var);
    }

    public static int g(int i10) {
        Map<Integer, Integer> map = f24979c;
        g.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static int h(int i10) {
        Map<Integer, Integer> map = f24980d;
        g.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
