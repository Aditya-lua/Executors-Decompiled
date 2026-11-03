package ur;

import gt.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k0;
import ns.p;
import ns.q;
import ns.t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Lur/m;", "", "<init>", "()V", "", "", "Lzr/b;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "standardOperations", "Lzr/a;", "c", "a", "functionalOperations", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f33235a = new m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, zr.b> standardOperations = k0.n(s.a("capitalize", ns.b.f27458a), s.a("isBlank", ns.d.f27460a), s.a("length", ns.e.f27461a), s.a("lowercase", ns.f.f27462a), s.a("replace", ns.i.f27466a), s.a("uppercase", t.f27479a), s.a("toArray", p.f27472a), s.a("decimalFormat", yr.b.f37117a), s.a("encode", wr.a.f34977a), s.a("match", ns.g.f27463a), s.a("compareToDate", os.c.f28183a), s.a("split", ns.m.f27470a), s.a("currentTime", b.f33219a), s.a("size", vr.e.f33620a), s.a("sort", vr.h.f33623a), s.a("distinct", vr.a.f33612a), s.a("joinToString", vr.c.f33614a), s.a("drop", g.f33224a), s.a("reverse", n.f33237a), s.a("trim", q.f27473a));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, zr.a> functionalOperations = k0.n(s.a("find", vr.b.f33613a));

    @NotNull
    public final Map<String, zr.a> a() {
        return functionalOperations;
    }

    @NotNull
    public final Map<String, zr.b> b() {
        return standardOperations;
    }
}
