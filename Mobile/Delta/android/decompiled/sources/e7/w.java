package e7;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u000bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u0007R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b#\u0010\u001b¨\u0006$"}, d2 = {"Le7/w;", "", "K", "V", "", "maxSize", "<init>", "(J)V", "key", "value", "k", "(Ljava/lang/Object;Ljava/lang/Object;)J", "oldValue", "newValue", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "size", "l", "a", "()V", "g", "()J", "i", "", "Ljava/util/Map;", "map", "J", "d", "j", "e", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class w<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<K, V> map = d.b(0, 0.0f, 3, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long maxSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long size;

    public w(long j10) {
        this.maxSize = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public final void a() {
        l(-1L);
    }

    public void b(@NotNull K key, @NotNull V oldValue, @Nullable V newValue) {
        throw null;
    }

    @Nullable
    public final V c(@NotNull K key) {
        return this.map.get(key);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMaxSize() {
        return this.maxSize;
    }

    public final long e() {
        if (this.size == -1) {
            this.size = g();
        }
        return this.size;
    }

    @Nullable
    public final V f(@NotNull K key, @NotNull V value) {
        V vPut = this.map.put(key, value);
        this.size = e() + i(key, value);
        if (vPut != null) {
            this.size = e() - i(key, vPut);
            b(key, vPut, value);
        }
        l(this.maxSize);
        return vPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        Iterator<T> it = this.map.entrySet().iterator();
        long jI = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jI += i(entry.getKey(), entry.getValue());
        }
        return jI;
    }

    @Nullable
    public final V h(@NotNull K key) {
        V vRemove = this.map.remove(key);
        if (vRemove != null) {
            this.size = e() - i(key, vRemove);
            b(key, vRemove, null);
        }
        return vRemove;
    }

    public final long i(K key, V value) throws Exception {
        try {
            long jK = k(key, value);
            if (jK >= 0) {
                return jK;
            }
            throw new IllegalStateException(("sizeOf(" + key + ", " + value + ") returned a negative value: " + jK).toString());
        } catch (Exception e10) {
            this.size = -1L;
            throw e10;
        }
    }

    public final void j(long j10) {
        this.maxSize = j10;
        l(j10);
    }

    public long k(@NotNull K key, @NotNull V value) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(long size) {
        while (e() > size) {
            if (this.map.isEmpty()) {
                if (e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.c0(this.map.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.map.remove(key);
            this.size = e() - i(key, value);
            b(key, value, null);
        }
    }
}
