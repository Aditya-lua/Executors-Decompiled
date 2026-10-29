package p430s6;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.InterfaceC7474n;

/* JADX INFO: renamed from: s6.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0019\"\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, m31665d2 = {"Ls6/i;", "", "Ls6/d$b;", "key", "Ls6/d$c;", "a", "(Ls6/d$b;)Ls6/d$c;", "Lk6/n;", "image", "", "", "extras", "", "size", "", "c", "(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V", "", "f", "(Ls6/d$b;)Z", "g", "(J)V", "clear", "()V", "i", "()J", "e", "b", "maxSize", "d", "initialMaxSize", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11183i {
    @Nullable
    /* JADX INFO: renamed from: a */
    InterfaceC11178d.Value mo42083a(@NotNull InterfaceC11178d.Key key);

    /* JADX INFO: renamed from: b */
    void mo42084b(long j10);

    /* JADX INFO: renamed from: c */
    void mo42085c(@NotNull InterfaceC11178d.Key key, @NotNull InterfaceC7474n image, @NotNull Map<String, ? extends Object> extras, long size);

    void clear();

    /* JADX INFO: renamed from: d */
    long getInitialMaxSize();

    /* JADX INFO: renamed from: e */
    long getMaxSize();

    /* JADX INFO: renamed from: f */
    boolean mo42088f(@NotNull InterfaceC11178d.Key key);

    /* JADX INFO: renamed from: g */
    void mo42089g(long size);

    /* JADX INFO: renamed from: i */
    long mo42090i();
}
