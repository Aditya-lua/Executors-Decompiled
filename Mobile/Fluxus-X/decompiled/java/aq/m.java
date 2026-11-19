package aq;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001f\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Laq/h0;", "Landroid/net/Uri;", BuildConfig.FLAVOR, "h", "()Laq/h0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "Lg/j;", "f", "launchers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    @NotNull
    public static final h0<String[], List<Uri>> d() {
        return new h0<>(new h.d(), new g.b() { // from class: aq.k
            @Override // g.b
            public final void a(Object obj) {
                m.e((List) obj);
            }
        });
    }

    public static final void e(List uriList) {
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        new v().b(uriList);
    }

    @NotNull
    public static final h0<g.j, List<Uri>> f() {
        return new h0<>(new h.e(0, 1, null), new g.b() { // from class: aq.j
            @Override // g.b
            public final void a(Object obj) {
                m.g((List) obj);
            }
        });
    }

    public static final void g(List uriList) {
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        new v().b(uriList);
    }

    @NotNull
    public static final h0<Uri, Boolean> h() {
        return new h0<>(new h.k(), new g.b() { // from class: aq.l
            @Override // g.b
            public final void a(Object obj) {
                m.i(((Boolean) obj).booleanValue());
            }
        });
    }

    public static final void i(boolean z10) {
        new a0().b(z10);
    }
}
