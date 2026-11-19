package ke;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a implements je.f<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21355a = new C0399a("KEY", 0);
        public static final a b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f21356c = a();

        /* JADX INFO: renamed from: ke.f0$a$a, reason: collision with other inner class name */
        public final enum C0399a extends a {
            public C0399a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // je.f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public final enum b extends a {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // je.f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public a(String str, int i10) {
            super(str, i10);
        }

        public static /* synthetic */ a[] a() {
            return new a[]{f21355a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f21356c.clone();
        }

        public /* synthetic */ a(String str, int i10, e0 e0Var) {
            this(str, i10);
        }
    }

    public static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> b(K k10, V v8) {
        return new s(k10, v8);
    }

    public static <K> je.f<Map.Entry<K, ?>, K> c() {
        return a.f21355a;
    }

    public static String d(Map<?, ?> map) {
        StringBuilder sbA = h.a(map.size());
        sbA.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z10 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    public static <V> je.f<Map.Entry<?, V>, V> e() {
        return a.b;
    }
}
