package p504w1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p532x1.C12628b;
import p532x1.C12629c;
import p532x1.C12630d;

/* JADX INFO: renamed from: w1.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\nJ1\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b$\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%¨\u00062"}, m31665d2 = {"Lw1/i;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "k", "f", "", "evicted", "oldValue", "newValue", "b", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "a", "i", "(Ljava/lang/Object;Ljava/lang/Object;)I", "c", "()V", "h", "()I", "", "j", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "g", "I", "Lx1/c;", "Lx1/c;", "map", "Lx1/b;", "Lx1/b;", "lock", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "collection"}, m31666k = 1, m31667mv = {1, 9, 0}, m31669xi = 48)
public class C12285i<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12629c<K, V> map;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C12628b lock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int putCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int createCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int evictionCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int hitCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int missCount;

    public C12285i(int i10) {
        this.maxSize = i10;
        if (!(i10 > 0)) {
            C12630d.m47058a("maxSize <= 0");
        }
        this.map = new C12629c<>(0, 0.75f);
        this.lock = new C12628b();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public V mo36640a(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void mo45610b(boolean evicted, @NotNull K key, @NotNull V oldValue, @Nullable V newValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    /* JADX INFO: renamed from: c */
    public final void m45611c() {
        m45619k(-1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final V m45612d(@NotNull K key) {
        V v5;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            V vM47053a = this.map.m47053a(key);
            if (vM47053a != null) {
                this.hitCount++;
                return vM47053a;
            }
            this.missCount++;
            V vMo36640a = mo36640a(key);
            if (vMo36640a == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v5 = (V) this.map.m47056d(key, vMo36640a);
                    if (v5 != null) {
                        this.map.m47056d(key, v5);
                    } else {
                        this.size += m45615g(key, vMo36640a);
                        Unit unit = Unit.f29331a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v5 != null) {
                mo45610b(false, key, vMo36640a, v5);
                return v5;
            }
            m45619k(this.maxSize);
            return vMo36640a;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final V m45613e(@NotNull K key, @NotNull V value) {
        V vM47056d;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += m45615g(key, value);
                vM47056d = this.map.m47056d(key, value);
                if (vM47056d != null) {
                    this.size -= m45615g(key, vM47056d);
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vM47056d != null) {
            mo45610b(false, key, vM47056d, value);
        }
        m45619k(this.maxSize);
        return vM47056d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final V m45614f(@NotNull K key) {
        V vM47057e;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                vM47057e = this.map.m47057e(key);
                if (vM47057e != null) {
                    this.size -= m45615g(key, vM47057e);
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vM47057e != null) {
            mo45610b(false, key, vM47057e, null);
        }
        return vM47057e;
    }

    /* JADX INFO: renamed from: g */
    public final int m45615g(K key, V value) {
        int iM45617i = m45617i(key, value);
        if (!(iM45617i >= 0)) {
            C12630d.m47059b("Negative size: " + key + '=' + value);
        }
        return iM45617i;
    }

    /* JADX INFO: renamed from: h */
    public final int m45616h() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    /* JADX INFO: renamed from: i */
    public int m45617i(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.appsflyer.internal.AFa1nSDK */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: j */
    public final Map<K, V> m45618j() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.m47054b().size());
            Iterator<T> it = this.map.m47054b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: w1.i<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void m45619k(int maxSize) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.m47055c() || this.size == 0))) {
                        C12630d.m47059b("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size <= maxSize || this.map.m47055c()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) CollectionsKt.m31707e0(this.map.m47054b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.m47057e((K) key);
                    this.size -= m45615g(key, value);
                    this.evictionCount++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mo45610b(true, key, value, null);
        }
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
