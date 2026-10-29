package mp;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p139g.InterfaceC5852a;
import p154h.C6250c;

/* JADX INFO: renamed from: mp.s */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lmp/h0;", "", "", "Landroid/net/Uri;", "b", "()Lmp/h0;", "launchers_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8636s {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C8624h0<String[], Uri> m34706b() {
        return new C8624h0<>(new C6250c(), new InterfaceC5852a() { // from class: mp.r
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C8636s.m34707c((Uri) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m34707c(Uri uri) {
        new C8638u().m34711b(uri);
    }
}
