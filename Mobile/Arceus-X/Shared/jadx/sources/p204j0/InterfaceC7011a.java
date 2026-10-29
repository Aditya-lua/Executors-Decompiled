package p204j0;

import android.util.Size;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import p140g0.C5902k0;
import p296n0.AbstractC8830u1;
import p296n0.C8802o3;
import p296n0.InterfaceC8771i4;
import p397r0.C10773n;

/* JADX INFO: renamed from: j0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m31665d2 = {"Lj0/a;", "", "Ln0/o3;", "sessionConfig", "", "b", "(Ln0/o3;)Z", "a", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public interface InterfaceC7011a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f27456a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC7011a f27455b = new a();

    /* JADX INFO: renamed from: j0.a$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"j0/a$a", "Lj0/a;", "Ln0/o3;", "sessionConfig", "", "b", "(Ln0/o3;)Z", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements InterfaceC7011a {
        @Override // p204j0.InterfaceC7011a
        /* JADX INFO: renamed from: b */
        public boolean mo29674b(C8802o3 sessionConfig) {
            Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
            return false;
        }
    }

    /* JADX INFO: renamed from: j0.a$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0001¨\u0006\u000f"}, m31665d2 = {"Lj0/a$b;", "", "<init>", "()V", "Ln0/i4;", "Landroid/util/Size;", "resolution", "Lg0/k0;", "dynamicRange", "Ln0/o3$b;", "a", "(Ln0/i4;Landroid/util/Size;Lg0/k0;)Ln0/o3$b;", "Lj0/a;", "NO_OP_FEATURE_COMBINATION_QUERY", "Lj0/a;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f27456a = new Companion();

        /* JADX INFO: renamed from: j0.a$b$a */
        @Metadata(m31664d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"j0/a$b$a", "Ln0/u1;", "Lne/x;", "Landroid/view/Surface;", "o", "()Lne/x;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class a extends AbstractC8830u1 {
            public a(Size size, int i10) {
                super(size, i10);
            }

            @Override // p296n0.AbstractC8830u1
            /* JADX INFO: renamed from: o */
            public InterfaceFutureC9440x<Surface> mo26666o() {
                InterfaceFutureC9440x<Surface> interfaceFutureC9440xM40993p = C10773n.m40993p(null);
                Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM40993p, "immediateFuture(...)");
                return interfaceFutureC9440xM40993p;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C8802o3.b m29675a(@NotNull InterfaceC8771i4<?> interfaceC8771i4, @NotNull Size resolution, @NotNull C5902k0 dynamicRange) {
            Intrinsics.checkNotNullParameter(interfaceC8771i4, "<this>");
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
            a aVar = new a(resolution, interfaceC8771i4.mo26767p());
            Class<?> clsM29682b = EnumC7013c.INSTANCE.m29685c(interfaceC8771i4).m29682b();
            if (clsM29682b != null) {
                aVar.m35441p(clsM29682b);
            }
            C8802o3.b bVarM35328m = C8802o3.b.m35312r(interfaceC8771i4, resolution).m35328m(aVar, dynamicRange);
            Intrinsics.checkNotNullExpressionValue(bVarM35328m, "addSurface(...)");
            return bVarM35328m;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    static C8802o3.b m29673a(@NotNull InterfaceC8771i4<?> interfaceC8771i4, @NotNull Size size, @NotNull C5902k0 c5902k0) {
        return INSTANCE.m29675a(interfaceC8771i4, size, c5902k0);
    }

    /* JADX INFO: renamed from: b */
    boolean mo29674b(@NotNull C8802o3 sessionConfig);
}
