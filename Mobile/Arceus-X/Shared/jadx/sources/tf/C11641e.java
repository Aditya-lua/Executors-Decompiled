package tf;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p410rf.C10867c;
import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p410rf.InterfaceC10871g;
import p410rf.InterfaceC10872h;

/* JADX INFO: renamed from: tf.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C11641e implements InterfaceC10870f, InterfaceC10872h {

    /* JADX INFO: renamed from: a */
    public C11641e f41049a = null;

    /* JADX INFO: renamed from: b */
    public boolean f41050b = true;

    /* JADX INFO: renamed from: c */
    public final JsonWriter f41051c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, InterfaceC10869e<?>> f41052d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, InterfaceC10871g<?>> f41053e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10869e<Object> f41054f;

    /* JADX INFO: renamed from: g */
    public final boolean f41055g;

    public C11641e(@NonNull Writer writer, @NonNull Map<Class<?>, InterfaceC10869e<?>> map, @NonNull Map<Class<?>, InterfaceC10871g<?>> map2, InterfaceC10869e<Object> interfaceC10869e, boolean z10) {
        this.f41051c = new JsonWriter(writer);
        this.f41052d = map;
        this.f41053e = map2;
        this.f41054f = interfaceC10869e;
        this.f41055g = z10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public C11641e m43303a(int i10) throws IOException {
        m43317o();
        this.f41051c.value(i10);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public C11641e m43304b(long j10) throws IOException {
        m43317o();
        this.f41051c.value(j10);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C11641e m43305c(Object obj, boolean z10) {
        if (z10 && m43312j(obj)) {
            throw new C10867c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f41051c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f41051c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f41051c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m43305c(it.next(), false);
                }
                this.f41051c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f41051c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m43309g((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new C10867c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f41051c.endObject();
                return this;
            }
            InterfaceC10869e<?> interfaceC10869e = this.f41052d.get(obj.getClass());
            if (interfaceC10869e != null) {
                return m43314l(interfaceC10869e, obj, z10);
            }
            InterfaceC10871g<?> interfaceC10871g = this.f41053e.get(obj.getClass());
            if (interfaceC10871g != null) {
                interfaceC10871g.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m43314l(this.f41054f, obj, z10);
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return m43311i((byte[]) obj);
        }
        this.f41051c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f41051c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                m43304b(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f41051c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f41051c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m43305c(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m43305c(obj2, false);
            }
        }
        this.f41051c.endArray();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/String;)Lrf/h; */
    @Override // p410rf.InterfaceC10872h
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C11641e add(String str) throws IOException {
        m43317o();
        this.f41051c.value(str);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public C11641e m43307e(@NonNull String str, int i10) throws IOException {
        m43317o();
        this.f41051c.name(str);
        return m43303a(i10);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C11641e m43308f(@NonNull String str, long j10) throws IOException {
        m43317o();
        this.f41051c.name(str);
        return m43304b(j10);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public C11641e m43309g(@NonNull String str, Object obj) {
        return this.f41055g ? m43316n(str, obj) : m43315m(str, obj);
    }

    /* JADX DEBUG: Method merged with bridge method: add(Z)Lrf/h; */
    @Override // p410rf.InterfaceC10872h
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C11641e add(boolean z10) throws IOException {
        m43317o();
        this.f41051c.value(z10);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C11641e m43311i(byte[] bArr) throws IOException {
        m43317o();
        if (bArr == null) {
            this.f41051c.nullValue();
            return this;
        }
        this.f41051c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m43312j(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* JADX INFO: renamed from: k */
    public void m43313k() {
        m43317o();
        this.f41051c.flush();
    }

    /* JADX INFO: renamed from: l */
    public C11641e m43314l(InterfaceC10869e<Object> interfaceC10869e, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f41051c.beginObject();
        }
        interfaceC10869e.encode(obj, this);
        if (!z10) {
            this.f41051c.endObject();
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final C11641e m43315m(@NonNull String str, Object obj) throws IOException {
        m43317o();
        this.f41051c.name(str);
        if (obj != null) {
            return m43305c(obj, false);
        }
        this.f41051c.nullValue();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final C11641e m43316n(@NonNull String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        m43317o();
        this.f41051c.name(str);
        return m43305c(obj, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m43317o() throws IOException {
        if (!this.f41050b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C11641e c11641e = this.f41049a;
        if (c11641e != null) {
            c11641e.m43317o();
            this.f41049a.f41050b = false;
            this.f41049a = null;
            this.f41051c.endObject();
        }
    }

    @Override // p410rf.InterfaceC10870f
    @NonNull
    public InterfaceC10870f add(@NonNull C10868d c10868d, Object obj) {
        return m43309g(c10868d.m41322b(), obj);
    }

    @Override // p410rf.InterfaceC10870f
    @NonNull
    public InterfaceC10870f add(@NonNull C10868d c10868d, int i10) {
        return m43307e(c10868d.m41322b(), i10);
    }

    @Override // p410rf.InterfaceC10870f
    @NonNull
    public InterfaceC10870f add(@NonNull C10868d c10868d, long j10) {
        return m43308f(c10868d.m41322b(), j10);
    }
}
