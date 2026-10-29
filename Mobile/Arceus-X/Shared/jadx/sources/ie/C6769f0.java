package ie;

import java.util.Map;
import p169he.InterfaceC6376f;

/* JADX INFO: renamed from: ie.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6769f0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ie.f0$a */
    public static abstract class a implements InterfaceC6376f<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a */
        public static final a f26635a = new C14185a("KEY", 0);

        /* JADX INFO: renamed from: b */
        public static final a f26636b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ a[] f26637c = m28903a();

        /* JADX INFO: renamed from: ie.f0$a$a, reason: collision with other inner class name */
        public final enum C14185a extends a {
            public C14185a(String str, int i10) {
                super(str, i10, null);
            }

            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p169he.InterfaceC6376f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: ie.f0$a$b */
        public final enum b extends a {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p169he.InterfaceC6376f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(String str, int i10) {
            super(str, i10);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a[] m28903a() {
            return new a[]{f26635a, f26636b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f26637c.clone();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: ie.f0.a.<init>(java.lang.String, int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ a(String str, int i10, C6767e0 c6767e0) {
            this(str, i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m28898a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> Map.Entry<K, V> m28899b(K k10, V v5) {
        return new C6794s(k10, v5);
    }

    /* JADX INFO: renamed from: c */
    public static <K> InterfaceC6376f<Map.Entry<K, ?>, K> m28900c() {
        return a.f26635a;
    }

    /* JADX INFO: renamed from: d */
    public static String m28901d(Map<?, ?> map) {
        StringBuilder sbM28909a = C6772h.m28909a(map.size());
        sbM28909a.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbM28909a.append(", ");
            }
            sbM28909a.append(entry.getKey());
            sbM28909a.append('=');
            sbM28909a.append(entry.getValue());
            z10 = false;
        }
        sbM28909a.append('}');
        return sbM28909a.toString();
    }

    /* JADX INFO: renamed from: e */
    public static <V> InterfaceC6376f<Map.Entry<?, V>, V> m28902e() {
        return a.f26636b;
    }
}
