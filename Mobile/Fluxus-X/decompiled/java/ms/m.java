package ms;

import com.github.luben.zstd.BuildConfig;
import ft.p;
import ft.q;
import ft.t;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.k0;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Lms/m;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lrs/b;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "standardOperations", "Lrs/a;", "c", "a", "functionalOperations", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f24381a = new m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, rs.b> standardOperations = k0.o(s.a("capitalize", ft.b.f16597a), s.a("isBlank", ft.d.f16599a), s.a("length", ft.e.f16600a), s.a("lowercase", ft.f.f16601a), s.a("replace", ft.i.f16605a), s.a("uppercase", t.f16618a), s.a("toArray", p.f16611a), s.a("decimalFormat", qs.b.f30469a), s.a("encode", os.a.f28527a), s.a("match", ft.g.f16602a), s.a("compareToDate", gt.c.f17934a), s.a("split", ft.m.f16609a), s.a("currentTime", b.f24365a), s.a("size", ns.e.f26623a), s.a("sort", ns.h.f26626a), s.a("distinct", ns.a.f26615a), s.a("joinToString", ns.c.f26617a), s.a("drop", g.f24370a), s.a("reverse", n.f24383a), s.a("trim", q.f16612a));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, rs.a> functionalOperations = k0.o(s.a("find", ns.b.f26616a));

    @NotNull
    public final Map<String, rs.a> a() {
        return functionalOperations;
    }

    @NotNull
    public final Map<String, rs.b> b() {
        return standardOperations;
    }
}
