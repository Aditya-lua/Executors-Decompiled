package p430s6;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s6.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00060\u001dj\u0002`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010$\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\"\"\u0004\b\u001b\u0010\u0017R\u0014\u0010&\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006'"}, m31665d2 = {"Ls6/f;", "Ls6/d;", "Ls6/i;", "strongMemoryCache", "Ls6/j;", "weakMemoryCache", "<init>", "(Ls6/i;Ls6/j;)V", "Ls6/d$b;", "key", "Ls6/d$c;", "a", "(Ls6/d$b;)Ls6/d$c;", "value", "", "h", "(Ls6/d$b;Ls6/d$c;)V", "", "c", "(Ls6/d$b;)Z", "", "size", "g", "(J)V", "clear", "()V", "Ls6/i;", "b", "Ls6/j;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Ljava/lang/Object;", "lock", "i", "()J", "e", "maxSize", "d", "initialMaxSize", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11180f implements InterfaceC11178d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11183i strongMemoryCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11184j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    public C11180f(@NotNull InterfaceC11183i interfaceC11183i, @NotNull InterfaceC11184j interfaceC11184j) {
        this.strongMemoryCache = interfaceC11183i;
        this.weakMemoryCache = interfaceC11184j;
    }

    @Override // p430s6.InterfaceC11178d
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC11178d.Value mo42094a(@NotNull InterfaceC11178d.Key key) {
        InterfaceC11178d.Value valueMo42083a;
        synchronized (this.lock) {
            try {
                valueMo42083a = this.strongMemoryCache.mo42083a(key);
                if (valueMo42083a == null) {
                    valueMo42083a = this.weakMemoryCache.mo42091a(key);
                }
                if (valueMo42083a != null && !valueMo42083a.getImage().getShareable()) {
                    m42117c(key);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return valueMo42083a;
    }

    @Override // p430s6.InterfaceC11178d
    /* JADX INFO: renamed from: b */
    public void mo42095b(long j10) {
        synchronized (this.lock) {
            this.strongMemoryCache.mo42084b(j10);
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m42117c(@NotNull InterfaceC11178d.Key key) {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.strongMemoryCache.mo42088f(key) || this.weakMemoryCache.mo42093f(key);
        }
        return z10;
    }

    @Override // p430s6.InterfaceC11178d
    public void clear() {
        synchronized (this.lock) {
            this.strongMemoryCache.clear();
            this.weakMemoryCache.clear();
            Unit unit = Unit.f29331a;
        }
    }

    @Override // p430s6.InterfaceC11178d
    /* JADX INFO: renamed from: d */
    public long mo42096d() {
        long jMo42086d;
        synchronized (this.lock) {
            jMo42086d = this.strongMemoryCache.getInitialMaxSize();
        }
        return jMo42086d;
    }

    @Override // p430s6.InterfaceC11178d
    /* JADX INFO: renamed from: e */
    public long mo42097e() {
        long maxSize;
        synchronized (this.lock) {
            maxSize = this.strongMemoryCache.getMaxSize();
        }
        return maxSize;
    }

    @Override // p430s6.InterfaceC11178d
    /* JADX INFO: renamed from: g */
    public void mo42098g(long size) {
        synchronized (this.lock) {
            this.strongMemoryCache.mo42089g(size);
            Unit unit = Unit.f29331a;
        }
    }

    @Override // p430s6.InterfaceC11178d
    /* JADX INFO: renamed from: h */
    public void mo42099h(@NotNull InterfaceC11178d.Key key, @NotNull InterfaceC11178d.Value value) {
        synchronized (this.lock) {
            long jMo30971i = value.getImage().mo30971i();
            if (jMo30971i < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jMo30971i).toString());
            }
            this.strongMemoryCache.mo42085c(key, value.getImage(), value.m42107a(), jMo30971i);
            Unit unit = Unit.f29331a;
        }
    }

    @Override // p430s6.InterfaceC11178d
    /* JADX INFO: renamed from: i */
    public long mo42100i() {
        long jMo42090i;
        synchronized (this.lock) {
            jMo42090i = this.strongMemoryCache.mo42090i();
        }
        return jMo42090i;
    }
}
