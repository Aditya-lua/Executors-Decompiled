package ok;

import bh.a1;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {BuildConfig.FLAVOR, "b", "()Z", "Lai/h;", BuildConfig.FLAVOR, "logTag", BuildConfig.FLAVOR, "a", "(Lai/h;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {
    public static final void a(@NotNull ai.h hVar, @NotNull String logTag) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        if (bi.h.a().X4()) {
            q.h(logTag, "Requesting Persona SDK module download immediately.");
            ai.h.m("personasdk");
        } else {
            q.h(logTag, "Deferring Persona SDK module download.");
            ai.h.l("personasdk");
        }
    }

    public static final boolean b() {
        if (bi.h.a().e1()) {
            return (t.h() || t.j() || t.k() || a1.t0()) ? false : true;
        }
        return (t.h() || t.j() || t.k()) ? false : true;
    }
}
