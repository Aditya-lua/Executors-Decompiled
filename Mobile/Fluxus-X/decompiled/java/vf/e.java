package vf;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import tf.f;
import tf.g;
import tf.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f34350a = null;
    public boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f34351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, tf.e<?>> f34352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, g<?>> f34353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tf.e<Object> f34354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34355g;

    public e(@NonNull Writer writer, @NonNull Map<Class<?>, tf.e<?>> map, @NonNull Map<Class<?>, g<?>> map2, tf.e<Object> eVar, boolean z10) {
        this.f34351c = new JsonWriter(writer);
        this.f34352d = map;
        this.f34353e = map2;
        this.f34354f = eVar;
        this.f34355g = z10;
    }

    @NonNull
    public e a(int i10) throws IOException {
        o();
        this.f34351c.value(i10);
        return this;
    }

    @NonNull
    public e b(long j10) throws IOException {
        o();
        this.f34351c.value(j10);
        return this;
    }

    @NonNull
    public e c(Object obj, boolean z10) {
        if (z10 && j(obj)) {
            throw new tf.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f34351c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f34351c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f34351c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(it.next(), false);
                }
                this.f34351c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f34351c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new tf.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f34351c.endObject();
                return this;
            }
            tf.e<?> eVar = this.f34352d.get(obj.getClass());
            if (eVar != null) {
                return l(eVar, obj, z10);
            }
            g<?> gVar = this.f34353e.get(obj.getClass());
            if (gVar != null) {
                gVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return l(this.f34354f, obj, z10);
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return i((byte[]) obj);
        }
        this.f34351c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f34351c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                b(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f34351c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f34351c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                c(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                c(obj2, false);
            }
        }
        this.f34351c.endArray();
        return this;
    }

    @Override // tf.h
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e add(String str) throws IOException {
        o();
        this.f34351c.value(str);
        return this;
    }

    @NonNull
    public e e(@NonNull String str, int i10) throws IOException {
        o();
        this.f34351c.name(str);
        return a(i10);
    }

    @NonNull
    public e f(@NonNull String str, long j10) throws IOException {
        o();
        this.f34351c.name(str);
        return b(j10);
    }

    @NonNull
    public e g(@NonNull String str, Object obj) {
        return this.f34355g ? n(str, obj) : m(str, obj);
    }

    @Override // tf.h
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e add(boolean z10) throws IOException {
        o();
        this.f34351c.value(z10);
        return this;
    }

    @NonNull
    public e i(byte[] bArr) throws IOException {
        o();
        if (bArr == null) {
            this.f34351c.nullValue();
            return this;
        }
        this.f34351c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean j(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void k() {
        o();
        this.f34351c.flush();
    }

    public e l(tf.e<Object> eVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f34351c.beginObject();
        }
        eVar.encode(obj, this);
        if (!z10) {
            this.f34351c.endObject();
        }
        return this;
    }

    public final e m(@NonNull String str, Object obj) throws IOException {
        o();
        this.f34351c.name(str);
        if (obj != null) {
            return c(obj, false);
        }
        this.f34351c.nullValue();
        return this;
    }

    public final e n(@NonNull String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        o();
        this.f34351c.name(str);
        return c(obj, false);
    }

    public final void o() throws IOException {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f34350a;
        if (eVar != null) {
            eVar.o();
            this.f34350a.b = false;
            this.f34350a = null;
            this.f34351c.endObject();
        }
    }

    @Override // tf.f
    @NonNull
    public f add(@NonNull tf.d dVar, Object obj) {
        return g(dVar.b(), obj);
    }

    @Override // tf.f
    @NonNull
    public f add(@NonNull tf.d dVar, int i10) {
        return e(dVar.b(), i10);
    }

    @Override // tf.f
    @NonNull
    public f add(@NonNull tf.d dVar, long j10) {
        return f(dVar.b(), j10);
    }
}
