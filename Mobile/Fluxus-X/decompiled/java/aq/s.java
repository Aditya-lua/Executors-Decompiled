package aq;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/h0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Landroid/net/Uri;", "b", "()Laq/h0;", "launchers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {
    @NotNull
    public static final h0<String[], Uri> b() {
        return new h0<>(new h.c(), new g.b() { // from class: aq.r
            @Override // g.b
            public final void a(Object obj) {
                s.c((Uri) obj);
            }
        });
    }

    public static final void c(Uri uri) {
        new u().b(uri);
    }
}
