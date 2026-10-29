package p096e7;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p201iu.C6985m;
import p201iu.C6988p;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;

/* JADX INFO: renamed from: e7.c0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R1\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR)\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, m31665d2 = {"Le7/c0;", "", "<init>", "()V", "", "Le7/j;", "kotlin.jvm.PlatformType", "b", "Ljt/h;", "f", "()Ljava/util/List;", "fetchers", "Le7/g;", "c", "e", "decoders", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4851c0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4851c0 f19541a = new C4851c0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h fetchers = C7342i.m30456b(new Function0() { // from class: e7.a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4851c0.m23418d();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h decoders = C7342i.m30456b(new Function0() { // from class: e7.b0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4851c0.m23417c();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final List m23417c() {
        return C4852d.m23423c(C6988p.m29398z(C6985m.m29376e(ServiceLoader.load(InterfaceC4858g.class, InterfaceC4858g.class.getClassLoader()).iterator())));
    }

    /* JADX INFO: renamed from: d */
    public static final List m23418d() {
        return C4852d.m23423c(C6988p.m29398z(C6985m.m29376e(ServiceLoader.load(InterfaceC4864j.class, InterfaceC4864j.class.getClassLoader()).iterator())));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<InterfaceC4858g> m23419e() {
        return (List) decoders.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<InterfaceC4864j<?>> m23420f() {
        return (List) fetchers.getValue();
    }
}
