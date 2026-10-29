package tf;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements qf.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f31718f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qf.d f31719g = qf.d.a("key").b(tf.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qf.d f31720h = qf.d.a("value").b(tf.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qf.e<Map.Entry<Object, Object>> f31721i = new qf.e() { // from class: tf.e
        @Override // qf.b
        public final void encode(Object obj, qf.f fVar) {
            f.a((Map.Entry) obj, fVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f31722a;
    public final Map<Class<?>, qf.e<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, qf.g<?>> f31723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qf.e<Object> f31724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f31725e = new i(this);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31726a;

        static {
            int[] iArr = new int[d.a.values().length];
            f31726a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31726a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31726a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map<Class<?>, qf.e<?>> map, Map<Class<?>, qf.g<?>> map2, qf.e<Object> eVar) {
        this.f31722a = outputStream;
        this.b = map;
        this.f31723c = map2;
        this.f31724d = eVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, qf.f fVar) {
        fVar.add(f31719g, entry.getKey());
        fVar.add(f31720h, entry.getValue());
    }

    public static ByteBuffer j(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d o(qf.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2;
        }
        throw new qf.c("Field has no @Protobuf config");
    }

    public static int p(qf.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2.tag();
        }
        throw new qf.c("Field has no @Protobuf config");
    }

    public qf.f b(@NonNull qf.d dVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        q((p(dVar) << 3) | 1);
        this.f31722a.write(j(8).putDouble(d10).array());
        return this;
    }

    public qf.f c(@NonNull qf.d dVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((p(dVar) << 3) | 5);
        this.f31722a.write(j(4).putFloat(f10).array());
        return this;
    }

    public qf.f d(@NonNull qf.d dVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    q((p(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f31718f);
                    q(bytes.length);
                    this.f31722a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    d(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    l(f31721i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return b(dVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return c(dVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return h(dVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return i(dVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    qf.e<?> eVar = this.b.get(obj.getClass());
                    if (eVar != null) {
                        return l(eVar, dVar, obj, z10);
                    }
                    qf.g<?> gVar = this.f31723c.get(obj.getClass());
                    if (gVar != null) {
                        return m(gVar, dVar, obj, z10);
                    }
                    if (obj instanceof c) {
                        return add(dVar, ((c) obj).getNumber());
                    }
                    return obj instanceof Enum ? add(dVar, ((Enum) obj).ordinal()) : l(this.f31724d, dVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    q((p(dVar) << 3) | 2);
                    q(bArr.length);
                    this.f31722a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // qf.f
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f add(@NonNull qf.d dVar, int i10) {
        return f(dVar, i10, true);
    }

    public f f(@NonNull qf.d dVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarO = o(dVar);
            int i11 = a.f31726a[dVarO.intEncoding().ordinal()];
            if (i11 == 1) {
                q(dVarO.tag() << 3);
                q(i10);
                return this;
            }
            if (i11 == 2) {
                q(dVarO.tag() << 3);
                q((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                q((dVarO.tag() << 3) | 5);
                this.f31722a.write(j(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // qf.f
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f add(@NonNull qf.d dVar, long j10) {
        return h(dVar, j10, true);
    }

    public f h(@NonNull qf.d dVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarO = o(dVar);
            int i10 = a.f31726a[dVarO.intEncoding().ordinal()];
            if (i10 == 1) {
                q(dVarO.tag() << 3);
                r(j10);
                return this;
            }
            if (i10 == 2) {
                q(dVarO.tag() << 3);
                r((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                q((dVarO.tag() << 3) | 1);
                this.f31722a.write(j(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    public f i(@NonNull qf.d dVar, boolean z10, boolean z11) {
        return f(dVar, z10 ? 1 : 0, z11);
    }

    public final <T> long k(qf.e<T> eVar, T t8) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f31722a;
            this.f31722a = bVar;
            try {
                eVar.encode(t8, this);
                this.f31722a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th2) {
                this.f31722a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final <T> f l(qf.e<T> eVar, qf.d dVar, T t8, boolean z10) throws IOException {
        long jK = k(eVar, t8);
        if (z10 && jK == 0) {
            return this;
        }
        q((p(dVar) << 3) | 2);
        r(jK);
        eVar.encode(t8, this);
        return this;
    }

    public final <T> f m(qf.g<T> gVar, qf.d dVar, T t8, boolean z10) {
        this.f31725e.b(dVar, z10);
        gVar.encode(t8, this.f31725e);
        return this;
    }

    public f n(Object obj) {
        if (obj == null) {
            return this;
        }
        qf.e<?> eVar = this.b.get(obj.getClass());
        if (eVar != null) {
            eVar.encode(obj, this);
            return this;
        }
        throw new qf.c("No encoder for " + obj.getClass());
    }

    public final void q(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f31722a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f31722a.write(i10 & 127);
    }

    public final void r(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f31722a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f31722a.write(((int) j10) & 127);
    }

    @Override // qf.f
    @NonNull
    public qf.f add(@NonNull qf.d dVar, Object obj) {
        return d(dVar, obj, true);
    }
}
