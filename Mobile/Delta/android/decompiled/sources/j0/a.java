package j0;

import android.util.Size;
import android.view.Surface;
import g0.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.x;
import n0.i4;
import n0.o3;
import n0.u1;
import org.jetbrains.annotations.NotNull;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lj0/a;", "", "Ln0/o3;", "sessionConfig", "", "b", "(Ln0/o3;)Z", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f21014a;

    @NotNull
    public static final a b = new C0371a();

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"j0/a$a", "Lj0/a;", "Ln0/o3;", "sessionConfig", "", "b", "(Ln0/o3;)Z", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0371a implements a {
        @Override // j0.a
        public boolean b(o3 sessionConfig) {
            Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
            return false;
        }
    }

    /* JADX INFO: renamed from: j0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0001¨\u0006\u000f"}, d2 = {"Lj0/a$b;", "", "<init>", "()V", "Ln0/i4;", "Landroid/util/Size;", "resolution", "Lg0/k0;", "dynamicRange", "Ln0/o3$b;", "a", "(Ln0/i4;Landroid/util/Size;Lg0/k0;)Ln0/o3$b;", "Lj0/a;", "NO_OP_FEATURE_COMBINATION_QUERY", "Lj0/a;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f21014a = new Companion();

        /* JADX INFO: renamed from: j0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"j0/a$b$a", "Ln0/u1;", "Lme/x;", "Landroid/view/Surface;", "o", "()Lme/x;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0372a extends u1 {
            public C0372a(Size size, int i10) {
                super(size, i10);
            }

            @Override // n0.u1
            public x<Surface> o() {
                x<Surface> xVarP = n.p(null);
                Intrinsics.checkNotNullExpressionValue(xVarP, "immediateFuture(...)");
                return xVarP;
            }
        }

        @NotNull
        public final o3.b a(@NotNull i4<?> i4Var, @NotNull Size resolution, @NotNull k0 dynamicRange) {
            Intrinsics.checkNotNullParameter(i4Var, "<this>");
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
            C0372a c0372a = new C0372a(resolution, i4Var.p());
            Class<?> clsB = c.INSTANCE.c(i4Var).b();
            if (clsB != null) {
                c0372a.p(clsB);
            }
            o3.b bVarM = o3.b.r(i4Var, resolution).m(c0372a, dynamicRange);
            Intrinsics.checkNotNullExpressionValue(bVarM, "addSurface(...)");
            return bVarM;
        }
    }

    @NotNull
    static o3.b a(@NotNull i4<?> i4Var, @NotNull Size size, @NotNull k0 k0Var) {
        return INSTANCE.a(i4Var, size, k0Var);
    }

    boolean b(@NotNull o3 sessionConfig);
}
