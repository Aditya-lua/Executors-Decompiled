package p567y5;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p120f6.C5390j0;
import p120f6.C5406o1;
import p120f6.WorkGenerationalId;

/* JADX INFO: renamed from: y5.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m31665d2 = {"Ly5/z;", "", "Lf6/w;", "id", "Ly5/y;", "f", "(Lf6/w;)Ly5/y;", "c", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lf6/w;)Z", "Lf6/j0;", "spec", "d", "(Lf6/j0;)Ly5/y;", "a", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC13100z {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f46329a;

    /* JADX INFO: renamed from: y5.z$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Ly5/z$a;", "", "<init>", "()V", "", "synchronized", "Ly5/z;", "b", "(Z)Ly5/z;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f46329a = new Companion();

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ InterfaceC13100z m48694c(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return companion.m48696b(z10);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC13100z m48695a() {
            return m48694c(this, false, 1, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC13100z m48696b(boolean z10) {
            C13032a0 c13032a0 = new C13032a0();
            return z10 ? new C13035b0(c13032a0) : c13032a0;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    static InterfaceC13100z m48691a() {
        return INSTANCE.m48695a();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    static InterfaceC13100z m48692b(boolean z10) {
        return INSTANCE.m48696b(z10);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    C13098y mo48547c(@NotNull WorkGenerationalId id2);

    @NotNull
    /* JADX INFO: renamed from: d */
    default C13098y m48693d(@NotNull C5390j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return mo48549f(C5406o1.m24872a(spec));
    }

    /* JADX INFO: renamed from: e */
    boolean mo48548e(@NotNull WorkGenerationalId id2);

    @NotNull
    /* JADX INFO: renamed from: f */
    C13098y mo48549f(@NotNull WorkGenerationalId id2);

    @NotNull
    List<C13098y> remove(@NotNull String workSpecId);
}
