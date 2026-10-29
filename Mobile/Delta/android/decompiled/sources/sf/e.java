package sf;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import qf.f;
import qf.g;
import qf.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f30707a = null;
    public boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f30708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, qf.e<?>> f30709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, g<?>> f30710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qf.e<Object> f30711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f30712g;

    public e(@NonNull Writer writer, @NonNull Map<Class<?>, qf.e<?>> map, @NonNull Map<Class<?>, g<?>> map2, qf.e<Object> eVar, boolean z10) {
        this.f30708c = new JsonWriter(writer);
        this.f30709d = map;
        this.f30710e = map2;
        this.f30711f = eVar;
        this.f30712g = z10;
    }

    @NonNull
    public e a(int i10) throws IOException {
        o();
        this.f30708c.value(i10);
        return this;
    }

    @NonNull
    public e b(long j10) throws IOException {
        o();
        this.f30708c.value(j10);
        return this;
    }

    @NonNull
    public e c(Object obj, boolean z10) {
        if (z10 && j(obj)) {
            throw new qf.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f30708c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f30708c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f30708c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(it.next(), false);
                }
                this.f30708c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f30708c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new qf.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f30708c.endObject();
                return this;
            }
            qf.e<?> eVar = this.f30709d.get(obj.getClass());
            if (eVar != null) {
                return l(eVar, obj, z10);
            }
            g<?> gVar = this.f30710e.get(obj.getClass());
            if (gVar != null) {
                gVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return l(this.f30711f, obj, z10);
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return i((byte[]) obj);
        }
        this.f30708c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f30708c.value(iArr[i10]);
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
                this.f30708c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f30708c.value(zArr[i10]);
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
        this.f30708c.endArray();
        return this;
    }

    @Override // qf.h
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e add(String str) throws IOException {
        o();
        this.f30708c.value(str);
        return this;
    }

    @NonNull
    public e e(@NonNull String str, int i10) throws IOException {
        o();
        this.f30708c.name(str);
        return a(i10);
    }

    @NonNull
    public e f(@NonNull String str, long j10) throws IOException {
        o();
        this.f30708c.name(str);
        return b(j10);
    }

    @NonNull
    public e g(@NonNull String str, Object obj) {
        return this.f30712g ? n(str, obj) : m(str, obj);
    }

    @Override // qf.h
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e add(boolean z10) throws IOException {
        o();
        this.f30708c.value(z10);
        return this;
    }

    @NonNull
    public e i(byte[] bArr) throws IOException {
        o();
        if (bArr == null) {
            this.f30708c.nullValue();
            return this;
        }
        this.f30708c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean j(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void k() {
        o();
        this.f30708c.flush();
    }

    public e l(qf.e<Object> eVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f30708c.beginObject();
        }
        eVar.encode(obj, this);
        if (!z10) {
            this.f30708c.endObject();
        }
        return this;
    }

    public final e m(@NonNull String str, Object obj) throws IOException {
        o();
        this.f30708c.name(str);
        if (obj != null) {
            return c(obj, false);
        }
        this.f30708c.nullValue();
        return this;
    }

    public final e n(@NonNull String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        o();
        this.f30708c.name(str);
        return c(obj, false);
    }

    public final void o() throws IOException {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f30707a;
        if (eVar != null) {
            eVar.o();
            this.f30707a.b = false;
            this.f30707a = null;
            this.f30708c.endObject();
        }
    }

    @Override // qf.f
    @NonNull
    public f add(@NonNull qf.d dVar, Object obj) {
        return g(dVar.b(), obj);
    }

    @Override // qf.f
    @NonNull
    public f add(@NonNull qf.d dVar, int i10) {
        return e(dVar.b(), i10);
    }

    @Override // qf.f
    @NonNull
    public f add(@NonNull qf.d dVar, long j10) {
        return f(dVar.b(), j10);
    }
}
