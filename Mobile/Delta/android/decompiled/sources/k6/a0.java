package k6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.w0;
import org.jetbrains.annotations.NotNull;
import x6.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lx6/g;", "request", "", "d", "(Lx6/g;)Z", "Lku/w0;", "Lx6/k;", "job", "Lx6/d;", "c", "(Lx6/g;Lku/w0;)Lx6/d;", "Lk6/h$a;", "Lk6/w$a;", "options", "a", "(Lk6/h$a;Lk6/w$a;)Lk6/h$a;", "b", "(Lk6/w$a;)Z", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a0 {
    @NotNull
    public static final h.a a(@NotNull h.a aVar, @NotNull w.Options options) {
        aVar.k(new r6.a(), kotlin.jvm.internal.d0.b(Uri.class));
        aVar.k(new r6.e(), kotlin.jvm.internal.d0.b(Integer.class));
        aVar.j(new q6.a(), kotlin.jvm.internal.d0.b(h0.class));
        aVar.h(new o6.a.C0470a(), kotlin.jvm.internal.d0.b(h0.class));
        aVar.h(new o6.f.a(), kotlin.jvm.internal.d0.b(h0.class));
        aVar.h(new o6.n.a(), kotlin.jvm.internal.d0.b(h0.class));
        aVar.h(new o6.h.a(), kotlin.jvm.internal.d0.b(Drawable.class));
        aVar.h(new o6.b.a(), kotlin.jvm.internal.d0.b(Bitmap.class));
        uu.h hVarB = uu.l.b(u.b(options), 0, 2, null);
        if (b(options)) {
            aVar.g(new m6.x.a(hVarB));
        }
        aVar.g(new m6.c.C0425c(hVarB, u.a(options)));
        return aVar;
    }

    public static final boolean b(w.Options options) {
        return Build.VERSION.SDK_INT >= 29 && u.c(options) && Intrinsics.c(u.a(options), m6.o.f23991c);
    }

    @NotNull
    public static final x6.d c(@NotNull ImageRequest imageRequest, @NotNull w0<? extends x6.k> w0Var) {
        return imageRequest.getTarget() instanceof b7.d ? x6.x.a(((b7.d) imageRequest.getTarget()).getView()).b(w0Var) : new x6.o(w0Var);
    }

    public static final boolean d(@NotNull ImageRequest imageRequest) {
        return (imageRequest.getTarget() instanceof b7.d) || (imageRequest.getSizeResolver() instanceof y6.k) || x6.j.m(imageRequest) != null;
    }
}
