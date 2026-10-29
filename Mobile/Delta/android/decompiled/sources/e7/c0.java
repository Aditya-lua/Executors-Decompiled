package e7;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R1\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR)\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Le7/c0;", "", "<init>", "()V", "", "Le7/j;", "kotlin.jvm.PlatformType", "b", "Ljt/h;", "f", "()Ljava/util/List;", "fetchers", "Le7/g;", "c", "e", "decoders", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f15185a = new c0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final jt.h fetchers = jt.i.b(new Function0() { // from class: e7.a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c0.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h decoders = jt.i.b(new Function0() { // from class: e7.b0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c0.c();
        }
    });

    public static final List c() {
        return d.c(iu.p.z(iu.m.e(ServiceLoader.load(g.class, g.class.getClassLoader()).iterator())));
    }

    public static final List d() {
        return d.c(iu.p.z(iu.m.e(ServiceLoader.load(j.class, j.class.getClassLoader()).iterator())));
    }

    @NotNull
    public final List<g> e() {
        return (List) decoders.getValue();
    }

    @NotNull
    public final List<j<?>> f() {
        return (List) fetchers.getValue();
    }
}
