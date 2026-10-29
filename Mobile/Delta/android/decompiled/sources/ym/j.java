package ym;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lxu/f;", "", "str", "d", "(Lxu/f;Ljava/lang/String;)Lxu/f;", "Lxu/g;", "b", "(Lxu/g;)Ljava/lang/String;", "Lxu/h;", "bytes", "c", "(Lxu/f;Lxu/h;)Lxu/f;", "a", "(Lxu/g;)Lxu/h;", "wf1-workflow-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class j {
    @NotNull
    public static final xu.h a(@NotNull xu.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.K1(gVar.readInt());
    }

    @NotNull
    public static final String b(@NotNull xu.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return a(gVar).P();
    }

    @NotNull
    public static final xu.f c(@NotNull xu.f fVar, @NotNull xu.h bytes) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        fVar.writeInt(bytes.I()).d0(bytes);
        return fVar;
    }

    @NotNull
    public static final xu.f d(@NotNull xu.f fVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return c(fVar, xu.h.INSTANCE.d(str));
    }
}
