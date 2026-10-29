package wr;

import java.util.Map;
import jt.s;
import kotlin.Metadata;
import kotlin.collections.k0;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;
import ps.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Lwr/m;", "", "<init>", "()V", "", "", "Lbs/b;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "standardOperations", "Lbs/a;", "c", "a", "functionalOperations", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f34551a = new m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, bs.b> standardOperations = k0.n(s.a("capitalize", ps.b.f28864a), s.a("isBlank", ps.d.f28866a), s.a("length", ps.e.f28867a), s.a("lowercase", ps.f.f28868a), s.a("replace", ps.i.f28872a), s.a("uppercase", t.f28885a), s.a("toArray", p.f28878a), s.a("decimalFormat", as.b.f3758a), s.a("encode", yr.a.f36348a), s.a("match", ps.g.f28869a), s.a("compareToDate", qs.c.f29631a), s.a("split", ps.m.f28876a), s.a("currentTime", b.f34535a), s.a("size", xr.e.f35298a), s.a("sort", xr.h.f35301a), s.a("distinct", xr.a.f35290a), s.a("joinToString", xr.c.f35292a), s.a("drop", g.f34540a), s.a("reverse", n.f34553a), s.a("trim", q.f28879a));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, bs.a> functionalOperations = k0.n(s.a("find", xr.b.f35291a));

    @NotNull
    public final Map<String, bs.a> a() {
        return functionalOperations;
    }

    @NotNull
    public final Map<String, bs.b> b() {
        return standardOperations;
    }
}
