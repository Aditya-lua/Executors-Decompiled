package p151gk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.C11295a1;
import sh.C11382g;
import th.C11659h;

/* JADX INFO: renamed from: gk.v */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"", "b", "()Z", "Lsh/g;", "", "logTag", "", "a", "(Lsh/g;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6129v {
    /* JADX INFO: renamed from: a */
    public static final void m27097a(@NotNull C11382g c11382g, @NotNull String logTag) {
        Intrinsics.checkNotNullParameter(c11382g, "<this>");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        if (C11659h.m43403a().mo43520Q4()) {
            C6124q.m27063h(logTag, "Requesting Persona SDK module download immediately.");
            C11382g.m42686l("personasdk");
        } else {
            C6124q.m27063h(logTag, "Deferring Persona SDK module download.");
            C11382g.m42685k("personasdk");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m27098b() {
        if (C11659h.m43403a().mo43578Z0()) {
            return (C6127t.m27092h() || C6127t.m27094j() || C6127t.m27095k() || C11295a1.m42477t0()) ? false : true;
        }
        return (C6127t.m27092h() || C6127t.m27094j() || C6127t.m27095k()) ? false : true;
    }
}
