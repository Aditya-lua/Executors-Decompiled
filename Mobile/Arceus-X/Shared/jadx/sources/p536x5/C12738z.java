package p536x5;

import androidx.work.AbstractC1117c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: x5.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m31665d2 = {"Lx5/z;", "Lx5/q0;", "Lx5/z$a;", "builder", "<init>", "(Lx5/z$a;)V", "e", "a", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12738z extends AbstractC12721q0 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x5.z$a */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lx5/z$a;", "Lx5/q0$a;", "Lx5/z;", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "q", "()Lx5/z;", "r", "()Lx5/z$a;", "thisObject", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC12721q0.a<a, C12738z> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends AbstractC1117c> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        /* JADX DEBUG: Method merged with bridge method: c()Lx5/q0; */
        @Override // p536x5.AbstractC12721q0.a
        @NotNull
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C12738z mo47374c() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new C12738z(this);
        }

        /* JADX DEBUG: Method merged with bridge method: g()Lx5/q0$a; */
        @Override // p536x5.AbstractC12721q0.a
        @NotNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a mo47375g() {
            return this;
        }
    }

    /* JADX INFO: renamed from: x5.z$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lx5/z$b;", "", "<init>", "()V", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "Lx5/z;", "a", "(Ljava/lang/Class;)Lx5/z;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: x5.z.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C12738z m47458a(@NotNull Class<? extends AbstractC1117c> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new a(workerClass).m47409b();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12738z(@NotNull a builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.m47412f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C12738z m47455e(@NotNull Class<? extends AbstractC1117c> cls) {
        return INSTANCE.m47458a(cls);
    }
}
