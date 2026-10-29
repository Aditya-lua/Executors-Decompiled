package mp;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139g.C5859h;
import p139g.InterfaceC5852a;
import p154h.C6251d;
import p154h.C6252e;
import p154h.C6258k;

/* JADX INFO: renamed from: mp.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001f\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31665d2 = {"Lmp/h0;", "Landroid/net/Uri;", "", "h", "()Lmp/h0;", "", "", "", "d", "Lg/h;", "f", "launchers_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8630m {
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C8624h0<String[], List<Uri>> m34689d() {
        return new C8624h0<>(new C6251d(), new InterfaceC5852a() { // from class: mp.k
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C8630m.m34690e((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final void m34690e(List uriList) {
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        new C8639v().m34712b(uriList);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final C8624h0<C5859h, List<Uri>> m34691f() {
        return new C8624h0<>(new C6252e(0, 1, null), new InterfaceC5852a() { // from class: mp.j
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C8630m.m34692g((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m34692g(List uriList) {
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        new C8639v().m34712b(uriList);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final C8624h0<Uri, Boolean> m34693h() {
        return new C8624h0<>(new C6258k(), new InterfaceC5852a() { // from class: mp.l
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C8630m.m34694i(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final void m34694i(boolean z10) {
        new C8610a0().m34659b(z10);
    }
}
