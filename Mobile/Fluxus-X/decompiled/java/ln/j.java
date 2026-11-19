package ln;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lew/f;", BuildConfig.FLAVOR, "str", "d", "(Lew/f;Ljava/lang/String;)Lew/f;", "Lew/g;", "b", "(Lew/g;)Ljava/lang/String;", "Lew/h;", "bytes", "c", "(Lew/f;Lew/h;)Lew/f;", "a", "(Lew/g;)Lew/h;", "wf1-workflow-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class j {
    @NotNull
    public static final ew.h a(@NotNull ew.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.M1(gVar.readInt());
    }

    @NotNull
    public static final String b(@NotNull ew.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return a(gVar).P();
    }

    @NotNull
    public static final ew.f c(@NotNull ew.f fVar, @NotNull ew.h bytes) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        fVar.writeInt(bytes.I()).z1(bytes);
        return fVar;
    }

    @NotNull
    public static final ew.f d(@NotNull ew.f fVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return c(fVar, ew.h.INSTANCE.d(str));
    }
}
