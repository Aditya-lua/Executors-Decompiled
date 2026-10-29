package s6;

import java.util.Map;
import k6.n;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\"\u0010\"\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!¨\u0006&"}, d2 = {"Ls6/a;", "Ls6/i;", "Ls6/j;", "weakMemoryCache", "<init>", "(Ls6/j;)V", "Ls6/d$b;", "key", "Ls6/d$c;", "a", "(Ls6/d$b;)Ls6/d$c;", "Lk6/n;", "image", "", "", "", "extras", "", "size", "", "c", "(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V", "", "f", "(Ls6/d$b;)Z", "g", "(J)V", "clear", "()V", "Ls6/j;", "b", "J", "e", "()J", "maxSize", "i", "d", "initialMaxSize", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j weakMemoryCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long maxSize;

    public a(@NotNull j jVar) {
        this.weakMemoryCache = jVar;
    }

    @Override // s6.i
    @Nullable
    public d.Value a(@NotNull d.Key key) {
        return null;
    }

    @Override // s6.i
    public void b(long j10) {
        this.maxSize = j10;
    }

    @Override // s6.i
    public void c(@NotNull d.Key key, @NotNull n image, @NotNull Map<String, ? extends Object> extras, long size) {
        this.weakMemoryCache.c(key, image, extras, size);
    }

    @Override // s6.i
    public void clear() {
    }

    @Override // s6.i
    /* JADX INFO: renamed from: d */
    public long getInitialMaxSize() {
        return 0L;
    }

    @Override // s6.i
    /* JADX INFO: renamed from: e, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    @Override // s6.i
    public boolean f(@NotNull d.Key key) {
        return false;
    }

    @Override // s6.i
    public void g(long size) {
    }

    @Override // s6.i
    public long i() {
        return 0L;
    }
}
