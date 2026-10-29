package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = maxSize;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    public void resize(int maxSize) throws Throwable {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = maxSize;
        }
        trimToSize(maxSize);
    }

    @Nullable
    public final V get(@NonNull K k10) throws Throwable {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                try {
                    V v5 = this.map.get(k10);
                    if (v5 != null) {
                        this.hitCount++;
                        return v5;
                    }
                    this.missCount++;
                    V vCreate = create(k10);
                    if (vCreate == null) {
                        return null;
                    }
                    synchronized (this) {
                        this.createCount++;
                        vPut = this.map.put(k10, vCreate);
                        if (vPut != null) {
                            this.map.put(k10, vPut);
                        } else {
                            this.size += safeSizeOf(k10, vCreate);
                        }
                    }
                    if (vPut != null) {
                        entryRemoved(false, k10, vCreate, vPut);
                        return vPut;
                    }
                    trimToSize(this.maxSize);
                    return vCreate;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Nullable
    public final V put(@NonNull K key, @NonNull V value) throws Throwable {
        if (key == null || value == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                try {
                    this.putCount++;
                    this.size += safeSizeOf(key, value);
                    V previous = this.map.put(key, value);
                    if (previous != null) {
                        this.size -= safeSizeOf(key, previous);
                    }
                    if (previous != null) {
                        entryRemoved(false, key, previous, value);
                    }
                    trimToSize(this.maxSize);
                    return previous;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX DEBUG: Duplicate block (B:29:0x0078) to fix multi-entry loop: BACK_EDGE: B:29:0x0078 -> B:27:0x0076 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0078 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int maxSize) throws Throwable {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > maxSize && !this.map.isEmpty()) {
                        Map.Entry<K, V> toEvict = this.map.entrySet().iterator().next();
                        key = toEvict.getKey();
                        try {
                            value = toEvict.getValue();
                            this.map.remove(key);
                            this.size -= safeSizeOf(key, value);
                            this.evictionCount++;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        while (true) {
            throw th;
        }
    }

    @Nullable
    public final V remove(@NonNull K key) throws Throwable {
        Throwable th2;
        if (key == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                try {
                    V previous = this.map.remove(key);
                    if (previous != null) {
                        this.size -= safeSizeOf(key, previous);
                    }
                    if (previous != null) {
                        entryRemoved(false, key, previous, null);
                    }
                    return previous;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                throw th2;
            }
        }
    }

    protected void entryRemoved(boolean evicted, @NonNull K key, @NonNull V oldValue, @Nullable V newValue) {
    }

    @Nullable
    protected V create(@NonNull K key) {
        return null;
    }

    private int safeSizeOf(K key, V value) {
        int result = sizeOf(key, value);
        if (result < 0) {
            throw new IllegalStateException("Negative size: " + key + "=" + value);
        }
        return result;
    }

    protected int sizeOf(@NonNull K key, @NonNull V value) {
        return 1;
    }

    public final void evictAll() throws Throwable {
        trimToSize(-1);
    }

    public final synchronized int size() {
        return this.size;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int hitPercent;
        int i10 = this.hitCount;
        int accesses = this.missCount + i10;
        hitPercent = accesses != 0 ? (i10 * 100) / accesses : 0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(hitPercent));
    }
}
