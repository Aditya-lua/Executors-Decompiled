package x6;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import e7.d0;
import e7.i0;
import java.util.Map;
import k6.BitmapImage;
import k6.Extras;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020+*\u00020\n2\u0006\u0010*\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020.*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010;R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010=¨\u0006?"}, d2 = {"Lx6/a;", "Lx6/r;", "Lk6/s;", "imageLoader", "Le7/d0;", "systemCallbacks", "Le7/u;", "logger", "<init>", "(Lk6/s;Le7/d0;Le7/u;)V", "Lx6/g;", "request", "Lku/d2;", "job", "", "findLifecycle", "Lx6/q;", "a", "(Lx6/g;Lku/d2;Z)Lx6/q;", "b", "(Lx6/g;)Lx6/g;", "Ly6/g;", "size", "Lx6/p;", "e", "(Lx6/g;Ly6/g;)Lx6/p;", "options", "d", "(Lx6/p;)Lx6/p;", "Ls6/d$c;", "cacheValue", "c", "(Lx6/g;Ls6/d$c;)Z", "Landroidx/lifecycle/l;", "f", "(Lx6/g;)Landroidx/lifecycle/l;", "Ly6/i;", "m", "(Lx6/g;)Ly6/i;", "Ly6/f;", "l", "(Lx6/g;)Ly6/f;", "sizeResolver", "Ly6/c;", "k", "(Lx6/g;Ly6/i;)Ly6/c;", "Lk6/l;", "j", "(Lx6/g;Ly6/g;)Lk6/l;", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "i", "(Lx6/g;Landroid/graphics/Bitmap$Config;)Z", "g", "(Lx6/g;Ly6/g;)Z", "h", "(Lx6/p;)Z", "Lk6/s;", "Le7/d0;", "Le7/u;", "Le7/o;", "Le7/o;", "hardwareBitmapService", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k6.s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final e7.u logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e7.o hardwareBitmapService;

    public a(@NotNull k6.s sVar, @NotNull d0 d0Var, @Nullable e7.u uVar) {
        this.imageLoader = sVar;
        this.systemCallbacks = d0Var;
        this.logger = uVar;
        this.hardwareBitmapService = e7.p.a(uVar);
    }

    @Override // x6.r
    @NotNull
    public q a(@NotNull ImageRequest request, @NotNull d2 job, boolean findLifecycle) {
        b7.c target = request.getTarget();
        if (target instanceof b7.d) {
            androidx.p000lifecycle.l lVarM = j.m(request);
            if (lVarM == null) {
                lVarM = f(request);
            }
            return new v(this.imageLoader, request, (b7.d) target, lVarM, job);
        }
        androidx.p000lifecycle.l lVarM2 = j.m(request);
        if (lVarM2 == null) {
            lVarM2 = findLifecycle ? f(request) : null;
        }
        return lVarM2 != null ? new l(lVarM2, job) : b.d(b.f(job));
    }

    @Override // x6.r
    @NotNull
    public ImageRequest b(@NotNull ImageRequest request) {
        ImageRequest.a aVarE = ImageRequest.A(request, null, 1, null).e(this.imageLoader.a());
        y6.i sizeResolver = request.getDefined().getSizeResolver();
        if (sizeResolver == null) {
            sizeResolver = m(request);
            aVarE.u(sizeResolver);
        }
        if (request.getDefined().getScale() == null) {
            aVarE.r(l(request));
        }
        if (request.getDefined().getPrecision() == null) {
            aVarE.q(k(request, sizeResolver));
        }
        return aVarE.b();
    }

    @Override // x6.r
    public boolean c(@NotNull ImageRequest request, @NotNull s6.d.Value cacheValue) {
        k6.n image = cacheValue.getImage();
        BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
        if (bitmapImage == null) {
            return true;
        }
        return i(request, e7.b.c(bitmapImage.getBitmap()));
    }

    @Override // x6.r
    @NotNull
    public Options d(@NotNull Options options) {
        boolean z10;
        Extras extras = options.getExtras();
        if (h(options)) {
            z10 = false;
        } else {
            extras = extras.d().b(j.k(Extras.c.INSTANCE), Bitmap.Config.ARGB_8888).a();
            z10 = true;
        }
        return z10 ? Options.b(options, null, null, null, null, null, null, null, null, null, extras, 511, null) : options;
    }

    @Override // x6.r
    @NotNull
    public Options e(@NotNull ImageRequest request, @NotNull Size size) {
        return new Options(request.getContext(), size, request.getScale(), request.getPrecision(), request.getDiskCacheKey(), request.getFileSystem(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy(), j(request, size));
    }

    public final androidx.p000lifecycle.l f(ImageRequest imageRequest) {
        b7.c target = imageRequest.getTarget();
        return e7.e.e(target instanceof b7.d ? ((b7.d) target).getView().getContext() : imageRequest.getContext());
    }

    public final boolean g(ImageRequest request, Size size) {
        return (i.h(request).isEmpty() || kotlin.collections.m.G(i0.f(), j.i(request))) && (!e7.b.d(j.i(request)) || (i(request, j.i(request)) && this.hardwareBitmapService.b(size)));
    }

    public final boolean h(Options options) {
        return !e7.b.d(j.j(options)) || this.hardwareBitmapService.getAllowHardware();
    }

    public final boolean i(ImageRequest request, Bitmap.Config requestedConfig) {
        if (!e7.b.d(requestedConfig)) {
            return true;
        }
        if (!j.e(request)) {
            return false;
        }
        b7.c target = request.getTarget();
        if (target instanceof b7.d) {
            View view = ((b7.d) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final Extras j(ImageRequest imageRequest, Size size) {
        Bitmap.Config configI = j.i(imageRequest);
        boolean zG = j.g(imageRequest);
        if (!g(imageRequest, size)) {
            configI = Bitmap.Config.ARGB_8888;
        }
        boolean z10 = zG && i.h(imageRequest).isEmpty() && configI != Bitmap.Config.ALPHA_8;
        Extras.a aVar = new Extras.a((Map<Extras.c<?>, ? extends Object>) k0.p(imageRequest.getDefaults().getExtras().b(), imageRequest.getExtras().b()));
        if (configI != j.i(imageRequest)) {
            aVar = aVar.b(j.k(Extras.c.INSTANCE), configI);
        }
        if (z10 != j.g(imageRequest)) {
            aVar = aVar.b(j.f(Extras.c.INSTANCE), Boolean.valueOf(z10));
        }
        return aVar.a();
    }

    public final y6.c k(ImageRequest imageRequest, y6.i iVar) {
        if (imageRequest.getDefined().getSizeResolver() == null && Intrinsics.c(iVar, y6.i.b)) {
            return y6.c.INEXACT;
        }
        return ((imageRequest.getTarget() instanceof b7.d) && (iVar instanceof y6.k) && (((b7.d) imageRequest.getTarget()).getView() instanceof ImageView) && ((b7.d) imageRequest.getTarget()).getView() == ((y6.k) iVar).getView()) ? y6.c.INEXACT : y6.c.EXACT;
    }

    public final y6.f l(ImageRequest imageRequest) {
        b7.c target = imageRequest.getTarget();
        b7.d dVar = target instanceof b7.d ? (b7.d) target : null;
        View view = dVar != null ? dVar.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? i0.e(imageView) : imageRequest.getScale();
    }

    public final y6.i m(ImageRequest imageRequest) {
        ImageView.ScaleType scaleType;
        if (!(imageRequest.getTarget() instanceof b7.d)) {
            return y6.i.b;
        }
        View view = ((b7.d) imageRequest.getTarget()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? y6.i.b : y6.l.b(view, false, 2, null);
    }
}
