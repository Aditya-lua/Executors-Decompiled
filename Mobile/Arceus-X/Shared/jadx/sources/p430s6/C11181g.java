package p430s6;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4877w;
import p239k6.InterfaceC7474n;

/* JADX INFO: renamed from: s6.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\b\b*\u0001#\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R$\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010 \"\u0004\b!\u0010\u001d¨\u0006*"}, m31665d2 = {"Ls6/g;", "Ls6/i;", "", "initialMaxSize", "Ls6/j;", "weakMemoryCache", "<init>", "(JLs6/j;)V", "Ls6/d$b;", "key", "Ls6/d$c;", "a", "(Ls6/d$b;)Ls6/d$c;", "Lk6/n;", "image", "", "", "", "extras", "size", "", "c", "(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V", "", "f", "(Ls6/d$b;)Z", "clear", "()V", "g", "(J)V", "J", "d", "()J", "b", "Ls6/j;", "s6/g$b", "Ls6/g$b;", "cache", "i", "value", "e", "maxSize", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11181g implements InterfaceC11183i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long initialMaxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11184j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final b cache = new b(getInitialMaxSize());

    /* JADX INFO: renamed from: s6.g$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Ls6/g$a;", "", "Lk6/n;", "image", "", "", "extras", "", "size", "<init>", "(Lk6/n;Ljava/util/Map;J)V", "a", "Lk6/n;", "b", "()Lk6/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7474n image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> extras;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long size;

        public a(@NotNull InterfaceC7474n interfaceC7474n, @NotNull Map<String, ? extends Object> map, long j10) {
            this.image = interfaceC7474n;
            this.extras = map;
            this.size = j10;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, Object> m42119a() {
            return this.extras;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC7474n getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }
    }

    /* JADX INFO: renamed from: s6.g$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"s6/g$b", "Le7/w;", "Ls6/d$b;", "Ls6/g$a;", "key", "value", "", "n", "(Ls6/d$b;Ls6/g$a;)J", "oldValue", "newValue", "", "m", "(Ls6/d$b;Ls6/g$a;Ls6/g$a;)V", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends C4877w<InterfaceC11178d.Key, a> {
        public b(long j10) {
            super(j10);
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p096e7.C4877w
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo23489b(InterfaceC11178d.Key key, a oldValue, a newValue) {
            C11181g.this.weakMemoryCache.mo42092c(key, oldValue.getImage(), oldValue.m42119a(), oldValue.getSize());
        }

        /* JADX DEBUG: Method merged with bridge method: k(Ljava/lang/Object;Ljava/lang/Object;)J */
        @Override // p096e7.C4877w
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public long mo23498k(InterfaceC11178d.Key key, a value) {
            return value.getSize();
        }
    }

    public C11181g(long j10, @NotNull InterfaceC11184j interfaceC11184j) {
        this.initialMaxSize = j10;
        this.weakMemoryCache = interfaceC11184j;
    }

    @Override // p430s6.InterfaceC11183i
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC11178d.Value mo42083a(@NotNull InterfaceC11178d.Key key) {
        a aVarM23490c = this.cache.m23490c(key);
        if (aVarM23490c != null) {
            return new InterfaceC11178d.Value(aVarM23490c.getImage(), aVarM23490c.m42119a());
        }
        return null;
    }

    @Override // p430s6.InterfaceC11183i
    /* JADX INFO: renamed from: b */
    public void mo42084b(long j10) {
        this.cache.m23497j(j10);
    }

    @Override // p430s6.InterfaceC11183i
    /* JADX INFO: renamed from: c */
    public void mo42085c(@NotNull InterfaceC11178d.Key key, @NotNull InterfaceC7474n image, @NotNull Map<String, ? extends Object> extras, long size) {
        if (size <= getMaxSize()) {
            this.cache.m23493f(key, new a(image, extras, size));
        } else {
            this.cache.m23495h(key);
            this.weakMemoryCache.mo42092c(key, image, extras, size);
        }
    }

    @Override // p430s6.InterfaceC11183i
    public void clear() {
        this.cache.m23488a();
    }

    @Override // p430s6.InterfaceC11183i
    /* JADX INFO: renamed from: d, reason: from getter */
    public long getInitialMaxSize() {
        return this.initialMaxSize;
    }

    @Override // p430s6.InterfaceC11183i
    /* JADX INFO: renamed from: e */
    public long getMaxSize() {
        return this.cache.getMaxSize();
    }

    @Override // p430s6.InterfaceC11183i
    /* JADX INFO: renamed from: f */
    public boolean mo42088f(@NotNull InterfaceC11178d.Key key) {
        return this.cache.m23495h(key) != null;
    }

    @Override // p430s6.InterfaceC11183i
    /* JADX INFO: renamed from: g */
    public void mo42089g(long size) {
        this.cache.m23499l(size);
    }

    @Override // p430s6.InterfaceC11183i
    /* JADX INFO: renamed from: i */
    public long mo42090i() {
        return this.cache.m23492e();
    }
}
