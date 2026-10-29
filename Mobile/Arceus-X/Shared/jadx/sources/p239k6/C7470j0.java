package p239k6;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k6.j0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Landroid/net/Uri;", "Lk6/h0;", "b", "(Landroid/net/Uri;)Lk6/h0;", "a", "(Lk6/h0;)Landroid/net/Uri;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7470j0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Uri m31053a(@NotNull C7466h0 c7466h0) {
        return Uri.parse(c7466h0.getData());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C7466h0 m31054b(@NotNull Uri uri) {
        return C7468i0.m31031j(uri.toString(), null, 1, null);
    }
}
