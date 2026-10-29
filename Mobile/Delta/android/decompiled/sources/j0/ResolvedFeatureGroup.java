package j0;

import g0.g2;
import g0.r1;
import java.util.Set;
import jt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n0.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: j0.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lj0/b;", "", "", "Li0/b;", "features", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolvedFeatureGroup {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Set<i0.b> features;

    /* JADX INFO: renamed from: j0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj0/b$a;", "", "<init>", "()V", "Lg0/g2;", "Ln0/o0;", "cameraInfoInternal", "Ll0/c;", "resolver", "Lj0/b;", "b", "(Lg0/g2;Ln0/o0;Ll0/c;)Lj0/b;", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResolvedFeatureGroup c(Companion companion, g2 g2Var, o0 o0Var, l0.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = new l0.a(o0Var);
            }
            return companion.b(g2Var, o0Var, cVar);
        }

        @Nullable
        public final ResolvedFeatureGroup a(@NotNull g2 g2Var, @NotNull o0 cameraInfoInternal) {
            Intrinsics.checkNotNullParameter(g2Var, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            return c(this, g2Var, cameraInfoInternal, null, 2, null);
        }

        @Nullable
        public final ResolvedFeatureGroup b(@NotNull g2 g2Var, @NotNull o0 cameraInfoInternal, @NotNull l0.c resolver) {
            Intrinsics.checkNotNullParameter(g2Var, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            r1.a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + g2Var + ", lensFacing = " + cameraInfoInternal.i());
            if (g2Var.h().isEmpty() && g2Var.g().isEmpty()) {
                return null;
            }
            l0.b bVarA = resolver.a(g2Var);
            if (bVarA instanceof l0.b.Supported) {
                ResolvedFeatureGroup resolvedFeatureGroupA = ((l0.b.Supported) bVarA).getResolvedFeatureGroup();
                r1.a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + resolvedFeatureGroupA);
                return resolvedFeatureGroupA;
            }
            if (bVarA instanceof l0.b.C0408b) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (bVarA instanceof l0.b.UnsupportedUseCase) {
                throw new IllegalArgumentException(((l0.b.UnsupportedUseCase) bVarA).getUnsupportedUseCase() + " is not supported");
            }
            if (!(bVarA instanceof l0.b.UseCaseMissing)) {
                throw new l();
            }
            StringBuilder sb2 = new StringBuilder();
            l0.b.UseCaseMissing dVar = (l0.b.UseCaseMissing) bVarA;
            sb2.append(dVar.getRequiredUseCases());
            sb2.append(" must be added for ");
            sb2.append(dVar.getFeatureRequiring());
            throw new IllegalArgumentException(sb2.toString());
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedFeatureGroup(@NotNull Set<? extends i0.b> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
    }

    @Nullable
    public static final ResolvedFeatureGroup b(@NotNull g2 g2Var, @NotNull o0 o0Var) {
        return INSTANCE.a(g2Var, o0Var);
    }

    @NotNull
    public final Set<i0.b> a() {
        return this.features;
    }

    @NotNull
    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.features + ')';
    }
}
