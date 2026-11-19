package t6;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010#\"\u0004\b\u001b\u0010\u0017R\u0014\u0010&\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#¨\u0006'"}, d2 = {"Lt6/f;", "Lt6/d;", "Lt6/i;", "strongMemoryCache", "Lt6/j;", "weakMemoryCache", "<init>", "(Lt6/i;Lt6/j;)V", "Lt6/d$b;", "key", "Lt6/d$c;", "a", "(Lt6/d$b;)Lt6/d$c;", "value", BuildConfig.FLAVOR, "g", "(Lt6/d$b;Lt6/d$c;)V", BuildConfig.FLAVOR, "e", "(Lt6/d$b;)Z", BuildConfig.FLAVOR, "size", "f", "(J)V", "clear", "()V", "Lt6/i;", "b", "Lt6/j;", BuildConfig.FLAVOR, "Lkotlinx/atomicfu/locks/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "i", "()J", "d", "maxSize", "initialMaxSize", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i strongMemoryCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    public f(@NotNull i iVar, @NotNull j jVar) {
        this.strongMemoryCache = iVar;
        this.weakMemoryCache = jVar;
    }

    @Override // t6.d
    @Nullable
    public d.Value a(@NotNull d.Key key) {
        d.Value valueA;
        synchronized (this.lock) {
            try {
                valueA = this.strongMemoryCache.a(key);
                if (valueA == null) {
                    valueA = this.weakMemoryCache.a(key);
                }
                if (valueA != null && !valueA.getImage().getShareable()) {
                    e(key);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return valueA;
    }

    @Override // t6.d
    public void b(long j10) {
        synchronized (this.lock) {
            this.strongMemoryCache.b(j10);
            Unit unit = Unit.f21506a;
        }
    }

    @Override // t6.d
    public long c() {
        long jC;
        synchronized (this.lock) {
            jC = this.strongMemoryCache.getInitialMaxSize();
        }
        return jC;
    }

    @Override // t6.d
    public void clear() {
        synchronized (this.lock) {
            this.strongMemoryCache.clear();
            this.weakMemoryCache.clear();
            Unit unit = Unit.f21506a;
        }
    }

    @Override // t6.d
    public long d() {
        long maxSize;
        synchronized (this.lock) {
            maxSize = this.strongMemoryCache.getMaxSize();
        }
        return maxSize;
    }

    public boolean e(@NotNull d.Key key) {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.strongMemoryCache.e(key) || this.weakMemoryCache.e(key);
        }
        return z10;
    }

    @Override // t6.d
    public void f(long size) {
        synchronized (this.lock) {
            this.strongMemoryCache.f(size);
            Unit unit = Unit.f21506a;
        }
    }

    @Override // t6.d
    public void g(@NotNull d.Key key, @NotNull d.Value value) {
        synchronized (this.lock) {
            long jI = value.getImage().i();
            if (jI < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jI).toString());
            }
            this.strongMemoryCache.g(key, value.getImage(), value.a(), jI);
            Unit unit = Unit.f21506a;
        }
    }

    @Override // t6.d
    public long i() {
        long jI;
        synchronized (this.lock) {
            jI = this.strongMemoryCache.i();
        }
        return jI;
    }
}
