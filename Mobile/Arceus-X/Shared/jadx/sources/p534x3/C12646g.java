package p534x3;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: x3.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lx3/f;", "a", "()Lx3/f;", "", "Lx3/f$b;", "pairs", "Lx3/c;", "b", "([Lx3/f$b;)Lx3/c;", "datastore-preferences-core_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12646g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC12645f m47106a() {
        return new C12642c(null, true, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C12642c m47107b(@NotNull AbstractC12645f.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        C12642c c12642c = new C12642c(null, false, 1, null);
        c12642c.m47092g((AbstractC12645f.b[]) Arrays.copyOf(pairs, pairs.length));
        return c12642c;
    }
}
