package mp;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00072\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lmp/u;", "Lnu/g0;", "Landroid/net/Uri;", "<init>", "()V", "uri", "", "b", "(Landroid/net/Uri;)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements nu.g0<Uri> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final nu.b0<Uri> f24485c = nu.i0.b(0, 1, mu.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu.b0<Uri> f24486a = f24485c;

    public final boolean b(@Nullable Uri uri) {
        return f24485c.a(uri);
    }

    @Override // nu.g0, nu.h
    @Nullable
    public Object collect(@NotNull nu.i<? super Uri> iVar, @NotNull nt.b<?> bVar) {
        return this.f24486a.collect(iVar, bVar);
    }
}
