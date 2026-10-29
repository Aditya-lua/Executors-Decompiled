package y6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "width", "height", "Ly6/g;", "a", "(II)Ly6/g;", "", "b", "(Ly6/g;)Z", "isOriginal", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    @NotNull
    public static final Size a(int i10, int i11) {
        return new Size(a.C0655a.a(b.a(i10)), a.C0655a.a(b.a(i11)));
    }

    public static final boolean b(@NotNull Size size) {
        return Intrinsics.c(size, Size.f35746d);
    }
}
