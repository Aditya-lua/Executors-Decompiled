package p466uf;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p410rf.C10867c;
import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p410rf.InterfaceC10871g;

/* JADX INFO: renamed from: uf.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C11850f implements InterfaceC10870f {

    /* JADX INFO: renamed from: f */
    public static final Charset f41613f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C10868d f41614g = C10868d.m41320a("key").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

    /* JADX INFO: renamed from: h */
    public static final C10868d f41615h = C10868d.m41320a("value").m41325b(C11845a.m44244b().m44246c(2).m44245a()).m41324a();

    /* JADX INFO: renamed from: i */
    public static final InterfaceC10869e<Map.Entry<Object, Object>> f41616i = new InterfaceC10869e() { // from class: uf.e
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p410rf.InterfaceC10866b
        public final void encode(Object obj, InterfaceC10870f interfaceC10870f) {
            C11850f.m44248a((Map.Entry) obj, interfaceC10870f);
        }
    };

    /* JADX INFO: renamed from: a */
    public OutputStream f41617a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, InterfaceC10869e<?>> f41618b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, InterfaceC10871g<?>> f41619c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10869e<Object> f41620d;

    /* JADX INFO: renamed from: e */
    public final C11853i f41621e = new C11853i(this);

    /* JADX INFO: renamed from: uf.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41622a;

        static {
            int[] iArr = new int[InterfaceC11848d.a.values().length];
            f41622a = iArr;
            try {
                iArr[InterfaceC11848d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41622a[InterfaceC11848d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41622a[InterfaceC11848d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C11850f(OutputStream outputStream, Map<Class<?>, InterfaceC10869e<?>> map, Map<Class<?>, InterfaceC10871g<?>> map2, InterfaceC10869e<Object> interfaceC10869e) {
        this.f41617a = outputStream;
        this.f41618b = map;
        this.f41619c = map2;
        this.f41620d = interfaceC10869e;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m44248a(Map.Entry entry, InterfaceC10870f interfaceC10870f) {
        interfaceC10870f.add(f41614g, entry.getKey());
        interfaceC10870f.add(f41615h, entry.getValue());
    }

    /* JADX INFO: renamed from: j */
    public static ByteBuffer m44249j(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC11848d m44250o(C10868d c10868d) {
        InterfaceC11848d interfaceC11848d = (InterfaceC11848d) c10868d.m41323c(InterfaceC11848d.class);
        if (interfaceC11848d != null) {
            return interfaceC11848d;
        }
        throw new C10867c("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: p */
    public static int m44251p(C10868d c10868d) {
        InterfaceC11848d interfaceC11848d = (InterfaceC11848d) c10868d.m41323c(InterfaceC11848d.class);
        if (interfaceC11848d != null) {
            return interfaceC11848d.tag();
        }
        throw new C10867c("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC10870f m44252b(@NonNull C10868d c10868d, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m44264q((m44251p(c10868d) << 3) | 1);
        this.f41617a.write(m44249j(8).putDouble(d10).array());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC10870f m44253c(@NonNull C10868d c10868d, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m44264q((m44251p(c10868d) << 3) | 5);
        this.f41617a.write(m44249j(4).putFloat(f10).array());
        return this;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC10870f m44254d(@NonNull C10868d c10868d, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    m44264q((m44251p(c10868d) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f41613f);
                    m44264q(bytes.length);
                    this.f41617a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m44254d(c10868d, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m44261l(f41616i, c10868d, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return m44252b(c10868d, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return m44253c(c10868d, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return m44258h(c10868d, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return m44259i(c10868d, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    InterfaceC10869e<?> interfaceC10869e = this.f41618b.get(obj.getClass());
                    if (interfaceC10869e != null) {
                        return m44261l(interfaceC10869e, c10868d, obj, z10);
                    }
                    InterfaceC10871g<?> interfaceC10871g = this.f41619c.get(obj.getClass());
                    if (interfaceC10871g != null) {
                        return m44262m(interfaceC10871g, c10868d, obj, z10);
                    }
                    if (obj instanceof InterfaceC11847c) {
                        return add(c10868d, ((InterfaceC11847c) obj).getNumber());
                    }
                    return obj instanceof Enum ? add(c10868d, ((Enum) obj).ordinal()) : m44261l(this.f41620d, c10868d, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    m44264q((m44251p(c10868d) << 3) | 2);
                    m44264q(bArr.length);
                    this.f41617a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: add(Lrf/d;I)Lrf/f; */
    @Override // p410rf.InterfaceC10870f
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C11850f add(@NonNull C10868d c10868d, int i10) {
        return m44256f(c10868d, i10, true);
    }

    /* JADX INFO: renamed from: f */
    public C11850f m44256f(@NonNull C10868d c10868d, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            InterfaceC11848d interfaceC11848dM44250o = m44250o(c10868d);
            int i11 = a.f41622a[interfaceC11848dM44250o.intEncoding().ordinal()];
            if (i11 == 1) {
                m44264q(interfaceC11848dM44250o.tag() << 3);
                m44264q(i10);
                return this;
            }
            if (i11 == 2) {
                m44264q(interfaceC11848dM44250o.tag() << 3);
                m44264q((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                m44264q((interfaceC11848dM44250o.tag() << 3) | 5);
                this.f41617a.write(m44249j(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: add(Lrf/d;J)Lrf/f; */
    @Override // p410rf.InterfaceC10870f
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C11850f add(@NonNull C10868d c10868d, long j10) {
        return m44258h(c10868d, j10, true);
    }

    /* JADX INFO: renamed from: h */
    public C11850f m44258h(@NonNull C10868d c10868d, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            InterfaceC11848d interfaceC11848dM44250o = m44250o(c10868d);
            int i10 = a.f41622a[interfaceC11848dM44250o.intEncoding().ordinal()];
            if (i10 == 1) {
                m44264q(interfaceC11848dM44250o.tag() << 3);
                m44265r(j10);
                return this;
            }
            if (i10 == 2) {
                m44264q(interfaceC11848dM44250o.tag() << 3);
                m44265r((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                m44264q((interfaceC11848dM44250o.tag() << 3) | 1);
                this.f41617a.write(m44249j(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C11850f m44259i(@NonNull C10868d c10868d, boolean z10, boolean z11) {
        return m44256f(c10868d, z10 ? 1 : 0, z11);
    }

    /* JADX INFO: renamed from: k */
    public final <T> long m44260k(InterfaceC10869e<T> interfaceC10869e, T t8) throws IOException {
        C11846b c11846b = new C11846b();
        try {
            OutputStream outputStream = this.f41617a;
            this.f41617a = c11846b;
            try {
                interfaceC10869e.encode(t8, this);
                this.f41617a = outputStream;
                long jM44247a = c11846b.m44247a();
                c11846b.close();
                return jM44247a;
            } catch (Throwable th2) {
                this.f41617a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c11846b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: l */
    public final <T> C11850f m44261l(InterfaceC10869e<T> interfaceC10869e, C10868d c10868d, T t8, boolean z10) throws IOException {
        long jM44260k = m44260k(interfaceC10869e, t8);
        if (z10 && jM44260k == 0) {
            return this;
        }
        m44264q((m44251p(c10868d) << 3) | 2);
        m44265r(jM44260k);
        interfaceC10869e.encode(t8, this);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final <T> C11850f m44262m(InterfaceC10871g<T> interfaceC10871g, C10868d c10868d, T t8, boolean z10) {
        this.f41621e.m44274b(c10868d, z10);
        interfaceC10871g.encode(t8, this.f41621e);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C11850f m44263n(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC10869e<?> interfaceC10869e = this.f41618b.get(obj.getClass());
        if (interfaceC10869e != null) {
            interfaceC10869e.encode(obj, this);
            return this;
        }
        throw new C10867c("No encoder for " + obj.getClass());
    }

    /* JADX INFO: renamed from: q */
    public final void m44264q(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f41617a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f41617a.write(i10 & 127);
    }

    /* JADX INFO: renamed from: r */
    public final void m44265r(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f41617a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f41617a.write(((int) j10) & 127);
    }

    @Override // p410rf.InterfaceC10870f
    @NonNull
    public InterfaceC10870f add(@NonNull C10868d c10868d, Object obj) {
        return m44254d(c10868d, obj, true);
    }
}
