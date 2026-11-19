package t6;

import com.github.luben.zstd.BuildConfig;
import f7.w;
import java.util.Map;
import l6.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\b\b*\u0001#\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R$\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010 \"\u0004\b!\u0010\u001d¨\u0006*"}, d2 = {"Lt6/g;", "Lt6/i;", BuildConfig.FLAVOR, "initialMaxSize", "Lt6/j;", "weakMemoryCache", "<init>", "(JLt6/j;)V", "Lt6/d$b;", "key", "Lt6/d$c;", "a", "(Lt6/d$b;)Lt6/d$c;", "Ll6/n;", "image", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "extras", "size", BuildConfig.FLAVOR, "g", "(Lt6/d$b;Ll6/n;Ljava/util/Map;J)V", BuildConfig.FLAVOR, "e", "(Lt6/d$b;)Z", "clear", "()V", "f", "(J)V", "J", "c", "()J", "b", "Lt6/j;", "t6/g$b", "Lt6/g$b;", "cache", "i", "value", "d", "maxSize", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long initialMaxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b cache = new b(getInitialMaxSize());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt6/g$a;", BuildConfig.FLAVOR, "Ll6/n;", "image", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "extras", BuildConfig.FLAVOR, "size", "<init>", "(Ll6/n;Ljava/util/Map;J)V", "a", "Ll6/n;", "b", "()Ll6/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final n image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> extras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long size;

        public a(@NotNull n nVar, @NotNull Map<String, ? extends Object> map, long j10) {
            this.image = nVar;
            this.extras = map;
            this.size = j10;
        }

        @NotNull
        public final Map<String, Object> a() {
            return this.extras;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"t6/g$b", "Lf7/w;", "Lt6/d$b;", "Lt6/g$a;", "key", "value", BuildConfig.FLAVOR, "n", "(Lt6/d$b;Lt6/g$a;)J", "oldValue", "newValue", BuildConfig.FLAVOR, "m", "(Lt6/d$b;Lt6/g$a;Lt6/g$a;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends w<d.Key, a> {
        public b(long j10) {
            super(j10);
        }

        @Override // f7.w
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void b(d.Key key, a oldValue, a newValue) {
            g.this.weakMemoryCache.g(key, oldValue.getImage(), oldValue.a(), oldValue.getSize());
        }

        @Override // f7.w
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public long k(d.Key key, a value) {
            return value.getSize();
        }
    }

    public g(long j10, @NotNull j jVar) {
        this.initialMaxSize = j10;
        this.weakMemoryCache = jVar;
    }

    @Override // t6.i
    @Nullable
    public d.Value a(@NotNull d.Key key) {
        a aVarC = this.cache.c(key);
        if (aVarC != null) {
            return new d.Value(aVarC.getImage(), aVarC.a());
        }
        return null;
    }

    @Override // t6.i
    public void b(long j10) {
        this.cache.j(j10);
    }

    @Override // t6.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getInitialMaxSize() {
        return this.initialMaxSize;
    }

    @Override // t6.i
    public void clear() {
        this.cache.a();
    }

    @Override // t6.i
    /* JADX INFO: renamed from: d */
    public long getMaxSize() {
        return this.cache.getMaxSize();
    }

    @Override // t6.i
    public boolean e(@NotNull d.Key key) {
        return this.cache.h(key) != null;
    }

    @Override // t6.i
    public void f(long size) {
        this.cache.l(size);
    }

    @Override // t6.i
    public void g(@NotNull d.Key key, @NotNull n image, @NotNull Map<String, ? extends Object> extras, long size) {
        if (size <= getMaxSize()) {
            this.cache.f(key, new a(image, extras, size));
        } else {
            this.cache.h(key);
            this.weakMemoryCache.g(key, image, extras, size);
        }
    }

    @Override // t6.i
    public long i() {
        return this.cache.e();
    }
}
