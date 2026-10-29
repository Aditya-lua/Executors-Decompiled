package t6;

import k6.Extras;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\f\"\u0015\u0010\u000f\u001a\u00020\u0005*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000e\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lk6/l$c;", "", "a", "Lk6/l$c;", "httpMethodKey", "Lt6/n;", "b", "httpHeadersKey", "Lt6/p;", "c", "httpBodyKey", "Lx6/p;", "(Lx6/p;)Ljava/lang/String;", "httpMethod", "(Lx6/p;)Lt6/n;", "httpHeaders", "(Lx6/p;)Lt6/p;", "httpBody", "coil-network-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Extras.c<String> f31614a = new Extras.c<>("GET");

    @NotNull
    public static final Extras.c<NetworkHeaders> b = new Extras.c<>(NetworkHeaders.f31657c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Extras.c<p> f31615c = new Extras.c<>(null);

    @Nullable
    public static final p a(@NotNull Options options) {
        return (p) k6.m.b(options, f31615c);
    }

    @NotNull
    public static final NetworkHeaders b(@NotNull Options options) {
        return (NetworkHeaders) k6.m.b(options, b);
    }

    @NotNull
    public static final String c(@NotNull Options options) {
        return (String) k6.m.b(options, f31614a);
    }
}
