package p096e7;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e7.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u000bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u0007R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b#\u0010\u001b¨\u0006$"}, m31665d2 = {"Le7/w;", "", "K", "V", "", "maxSize", "<init>", "(J)V", "key", "value", "k", "(Ljava/lang/Object;Ljava/lang/Object;)J", "oldValue", "newValue", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "size", "l", "a", "()V", "g", "()J", "i", "", "Ljava/util/Map;", "map", "J", "d", "j", "e", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C4877w<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<K, V> map = C4852d.m23422b(0, 0.0f, 3, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long maxSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long size;

    public C4877w(long j10) {
        this.maxSize = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m23488a() {
        m23499l(-1L);
    }

    /* JADX INFO: renamed from: b */
    public void mo23489b(@NotNull K key, @NotNull V oldValue, @Nullable V newValue) {
        throw null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final V m23490c(@NotNull K key) {
        return this.map.get(key);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: e */
    public final long m23492e() {
        if (this.size == -1) {
            this.size = m23494g();
        }
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final V m23493f(@NotNull K key, @NotNull V value) {
        V vPut = this.map.put(key, value);
        this.size = m23492e() + m23496i(key, value);
        if (vPut != null) {
            this.size = m23492e() - m23496i(key, vPut);
            mo23489b(key, vPut, value);
        }
        m23499l(this.maxSize);
        return vPut;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: e7.w<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final long m23494g() {
        Iterator<T> it = this.map.entrySet().iterator();
        long jM23496i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jM23496i += m23496i(entry.getKey(), entry.getValue());
        }
        return jM23496i;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final V m23495h(@NotNull K key) {
        V vRemove = this.map.remove(key);
        if (vRemove != null) {
            this.size = m23492e() - m23496i(key, vRemove);
            mo23489b(key, vRemove, null);
        }
        return vRemove;
    }

    /* JADX INFO: renamed from: i */
    public final long m23496i(K key, V value) throws Exception {
        try {
            long jMo23498k = mo23498k(key, value);
            if (jMo23498k >= 0) {
                return jMo23498k;
            }
            throw new IllegalStateException(("sizeOf(" + key + ", " + value + ") returned a negative value: " + jMo23498k).toString());
        } catch (Exception e10) {
            this.size = -1L;
            throw e10;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m23497j(long j10) {
        this.maxSize = j10;
        m23499l(j10);
    }

    /* JADX INFO: renamed from: k */
    public long mo23498k(@NotNull K key, @NotNull V value) {
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: e7.w<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m23499l(long size) {
        while (m23492e() > size) {
            if (this.map.isEmpty()) {
                if (m23492e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.m31705c0(this.map.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.map.remove(key);
            this.size = m23492e() - m23496i(key, value);
            mo23489b(key, value, null);
        }
    }
}
