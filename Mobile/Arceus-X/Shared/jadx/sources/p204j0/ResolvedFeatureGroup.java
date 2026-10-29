package p204j0;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.C5888g2;
import p140g0.C5931r1;
import p182i0.AbstractC6600b;
import p229jt.C7345l;
import p259l0.C7955a;
import p259l0.InterfaceC7956b;
import p259l0.InterfaceC7957c;
import p296n0.InterfaceC8799o0;

/* JADX INFO: renamed from: j0.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lj0/b;", "", "", "Li0/b;", "features", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class ResolvedFeatureGroup {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Set<AbstractC6600b> features;

    /* JADX INFO: renamed from: j0.b$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lj0/b$a;", "", "<init>", "()V", "Lg0/g2;", "Ln0/o0;", "cameraInfoInternal", "Ll0/c;", "resolver", "Lj0/b;", "b", "(Lg0/g2;Ln0/o0;Ll0/c;)Lj0/b;", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: j0.b.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ ResolvedFeatureGroup m29678c(Companion companion, C5888g2 c5888g2, InterfaceC8799o0 interfaceC8799o0, InterfaceC7957c interfaceC7957c, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                interfaceC7957c = new C7955a(interfaceC8799o0);
            }
            return companion.m29680b(c5888g2, interfaceC8799o0, interfaceC7957c);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final ResolvedFeatureGroup m29679a(@NotNull C5888g2 c5888g2, @NotNull InterfaceC8799o0 cameraInfoInternal) {
            Intrinsics.checkNotNullParameter(c5888g2, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            return m29678c(this, c5888g2, cameraInfoInternal, null, 2, null);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final ResolvedFeatureGroup m29680b(@NotNull C5888g2 c5888g2, @NotNull InterfaceC8799o0 cameraInfoInternal, @NotNull InterfaceC7957c resolver) {
            Intrinsics.checkNotNullParameter(c5888g2, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            C5931r1.m26561a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + c5888g2 + ", lensFacing = " + cameraInfoInternal.mo26583i());
            if (c5888g2.m26471h().isEmpty() && c5888g2.m26470g().isEmpty()) {
                return null;
            }
            InterfaceC7956b interfaceC7956bMo32953a = resolver.mo32953a(c5888g2);
            if (interfaceC7956bMo32953a instanceof InterfaceC7956b.Supported) {
                ResolvedFeatureGroup resolvedFeatureGroupM32956a = ((InterfaceC7956b.Supported) interfaceC7956bMo32953a).getResolvedFeatureGroup();
                C5931r1.m26561a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + resolvedFeatureGroupM32956a);
                return resolvedFeatureGroupM32956a;
            }
            if (interfaceC7956bMo32953a instanceof InterfaceC7956b.b) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (interfaceC7956bMo32953a instanceof InterfaceC7956b.UnsupportedUseCase) {
                throw new IllegalArgumentException(((InterfaceC7956b.UnsupportedUseCase) interfaceC7956bMo32953a).getUnsupportedUseCase() + " is not supported");
            }
            if (!(interfaceC7956bMo32953a instanceof InterfaceC7956b.UseCaseMissing)) {
                throw new C7345l();
            }
            StringBuilder sb2 = new StringBuilder();
            InterfaceC7956b.UseCaseMissing dVar = (InterfaceC7956b.UseCaseMissing) interfaceC7956bMo32953a;
            sb2.append(dVar.getRequiredUseCases());
            sb2.append(" must be added for ");
            sb2.append(dVar.getFeatureRequiring());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends i0.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedFeatureGroup(@NotNull Set<? extends AbstractC6600b> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ResolvedFeatureGroup m29676b(@NotNull C5888g2 c5888g2, @NotNull InterfaceC8799o0 interfaceC8799o0) {
        return INSTANCE.m29679a(c5888g2, interfaceC8799o0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<AbstractC6600b> m29677a() {
        return this.features;
    }

    @NotNull
    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.features + ')';
    }
}
