package p537x6;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.p616lifecycle.AbstractC0966l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027b7.InterfaceC1251c;
import p027b7.InterfaceC1252d;
import p096e7.C4848b;
import p096e7.C4854e;
import p096e7.C4863i0;
import p096e7.C4870p;
import p096e7.InterfaceC4853d0;
import p096e7.InterfaceC4869o;
import p096e7.InterfaceC4875u;
import p239k6.BitmapImage;
import p239k6.Extras;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p256ku.InterfaceC7850d2;
import p430s6.InterfaceC11178d;
import p568y6.C13113l;
import p568y6.EnumC13104c;
import p568y6.EnumC13107f;
import p568y6.InterfaceC13110i;
import p568y6.InterfaceC13112k;
import p568y6.Size;

/* JADX INFO: renamed from: x6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020+*\u00020\n2\u0006\u0010*\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020.*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010;R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010=¨\u0006?"}, m31665d2 = {"Lx6/a;", "Lx6/r;", "Lk6/s;", "imageLoader", "Le7/d0;", "systemCallbacks", "Le7/u;", "logger", "<init>", "(Lk6/s;Le7/d0;Le7/u;)V", "Lx6/g;", "request", "Lku/d2;", "job", "", "findLifecycle", "Lx6/q;", "a", "(Lx6/g;Lku/d2;Z)Lx6/q;", "b", "(Lx6/g;)Lx6/g;", "Ly6/g;", "size", "Lx6/p;", "e", "(Lx6/g;Ly6/g;)Lx6/p;", "options", "d", "(Lx6/p;)Lx6/p;", "Ls6/d$c;", "cacheValue", "c", "(Lx6/g;Ls6/d$c;)Z", "Landroidx/lifecycle/l;", "f", "(Lx6/g;)Landroidx/lifecycle/l;", "Ly6/i;", "m", "(Lx6/g;)Ly6/i;", "Ly6/f;", "l", "(Lx6/g;)Ly6/f;", "sizeResolver", "Ly6/c;", "k", "(Lx6/g;Ly6/i;)Ly6/c;", "Lk6/l;", "j", "(Lx6/g;Ly6/g;)Lk6/l;", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "i", "(Lx6/g;Landroid/graphics/Bitmap$Config;)Z", "g", "(Lx6/g;Ly6/g;)Z", "h", "(Lx6/p;)Z", "Lk6/s;", "Le7/d0;", "Le7/u;", "Le7/o;", "Le7/o;", "hardwareBitmapService", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12740a implements InterfaceC12757r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4853d0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC4875u logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4869o hardwareBitmapService;

    public C12740a(@NotNull InterfaceC7479s interfaceC7479s, @NotNull InterfaceC4853d0 interfaceC4853d0, @Nullable InterfaceC4875u interfaceC4875u) {
        this.imageLoader = interfaceC7479s;
        this.systemCallbacks = interfaceC4853d0;
        this.logger = interfaceC4875u;
        this.hardwareBitmapService = C4870p.m23477a(interfaceC4875u);
    }

    @Override // p537x6.InterfaceC12757r
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC12756q mo47467a(@NotNull ImageRequest request, @NotNull InterfaceC7850d2 job, boolean findLifecycle) {
        InterfaceC1251c target = request.getTarget();
        if (target instanceof InterfaceC1252d) {
            AbstractC0966l abstractC0966lM47596m = C12749j.m47596m(request);
            if (abstractC0966lM47596m == null) {
                abstractC0966lM47596m = m47472f(request);
            }
            return new C12761v(this.imageLoader, request, (InterfaceC1252d) target, abstractC0966lM47596m, job);
        }
        AbstractC0966l abstractC0966lM47596m2 = C12749j.m47596m(request);
        if (abstractC0966lM47596m2 == null) {
            abstractC0966lM47596m2 = findLifecycle ? m47472f(request) : null;
        }
        return abstractC0966lM47596m2 != null ? new C12751l(abstractC0966lM47596m2, job) : C12741b.m47480d(C12741b.m47481f(job));
    }

    @Override // p537x6.InterfaceC12757r
    @NotNull
    /* JADX INFO: renamed from: b */
    public ImageRequest mo47468b(@NotNull ImageRequest request) {
        ImageRequest.a aVarM47527e = ImageRequest.m47494A(request, null, 1, null).m47527e(this.imageLoader.mo31065a());
        InterfaceC13110i sizeResolver = request.getDefined().getSizeResolver();
        if (sizeResolver == null) {
            sizeResolver = m47479m(request);
            aVarM47527e.m47542u(sizeResolver);
        }
        if (request.getDefined().getScale() == null) {
            aVarM47527e.m47539r(m47478l(request));
        }
        if (request.getDefined().getPrecision() == null) {
            aVarM47527e.m47538q(m47477k(request, sizeResolver));
        }
        return aVarM47527e.m47524b();
    }

    @Override // p537x6.InterfaceC12757r
    /* JADX INFO: renamed from: c */
    public boolean mo47469c(@NotNull ImageRequest request, @NotNull InterfaceC11178d.Value cacheValue) {
        InterfaceC7474n image = cacheValue.getImage();
        BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
        if (bitmapImage == null) {
            return true;
        }
        return m47475i(request, C4848b.m23411c(bitmapImage.getBitmap()));
    }

    @Override // p537x6.InterfaceC12757r
    @NotNull
    /* JADX INFO: renamed from: d */
    public Options mo47470d(@NotNull Options options) {
        boolean z10;
        Extras extras = options.getExtras();
        if (m47474h(options)) {
            z10 = false;
        } else {
            extras = extras.m31058d().m31060b(C12749j.m47594k(Extras.c.INSTANCE), Bitmap.Config.ARGB_8888).m31059a();
            z10 = true;
        }
        return z10 ? Options.m47607b(options, null, null, null, null, null, null, null, null, null, extras, FrameMetricsAggregator.EVERY_DURATION, null) : options;
    }

    @Override // p537x6.InterfaceC12757r
    @NotNull
    /* JADX INFO: renamed from: e */
    public Options mo47471e(@NotNull ImageRequest request, @NotNull Size size) {
        return new Options(request.getContext(), size, request.getScale(), request.getPrecision(), request.getDiskCacheKey(), request.getFileSystem(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy(), m47476j(request, size));
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0966l m47472f(ImageRequest imageRequest) {
        InterfaceC1251c target = imageRequest.getTarget();
        return C4854e.m23429e(target instanceof InterfaceC1252d ? ((InterfaceC1252d) target).getView().getContext() : imageRequest.getContext());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m47473g(ImageRequest request, Size size) {
        return (C12748i.m47580h(request).isEmpty() || C7693m.m31838G(C4863i0.m23460f(), C12749j.m47592i(request))) && (!C4848b.m23412d(C12749j.m47592i(request)) || (m47475i(request, C12749j.m47592i(request)) && this.hardwareBitmapService.mo23476b(size)));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m47474h(Options options) {
        return !C4848b.m23412d(C12749j.m47593j(options)) || this.hardwareBitmapService.getAllowHardware();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47475i(ImageRequest request, Bitmap.Config requestedConfig) {
        if (!C4848b.m23412d(requestedConfig)) {
            return true;
        }
        if (!C12749j.m47588e(request)) {
            return false;
        }
        InterfaceC1251c target = request.getTarget();
        if (target instanceof InterfaceC1252d) {
            View view = ((InterfaceC1252d) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final Extras m47476j(ImageRequest imageRequest, Size size) {
        Bitmap.Config configM47592i = C12749j.m47592i(imageRequest);
        boolean zM47590g = C12749j.m47590g(imageRequest);
        if (!m47473g(imageRequest, size)) {
            configM47592i = Bitmap.Config.ARGB_8888;
        }
        boolean z10 = zM47590g && C12748i.m47580h(imageRequest).isEmpty() && configM47592i != Bitmap.Config.ALPHA_8;
        Extras.a aVar = new Extras.a((Map<Extras.c<?>, ? extends Object>) C7690k0.m31801p(imageRequest.getDefaults().getExtras().m31056b(), imageRequest.getExtras().m31056b()));
        if (configM47592i != C12749j.m47592i(imageRequest)) {
            aVar = aVar.m31060b(C12749j.m47594k(Extras.c.INSTANCE), configM47592i);
        }
        if (z10 != C12749j.m47590g(imageRequest)) {
            aVar = aVar.m31060b(C12749j.m47589f(Extras.c.INSTANCE), Boolean.valueOf(z10));
        }
        return aVar.m31059a();
    }

    /* JADX INFO: renamed from: k */
    public final EnumC13104c m47477k(ImageRequest imageRequest, InterfaceC13110i interfaceC13110i) {
        if (imageRequest.getDefined().getSizeResolver() == null && Intrinsics.m31980c(interfaceC13110i, InterfaceC13110i.f46349b)) {
            return EnumC13104c.INEXACT;
        }
        return ((imageRequest.getTarget() instanceof InterfaceC1252d) && (interfaceC13110i instanceof InterfaceC13112k) && (((InterfaceC1252d) imageRequest.getTarget()).getView() instanceof ImageView) && ((InterfaceC1252d) imageRequest.getTarget()).getView() == ((InterfaceC13112k) interfaceC13110i).getView()) ? EnumC13104c.INEXACT : EnumC13104c.EXACT;
    }

    /* JADX INFO: renamed from: l */
    public final EnumC13107f m47478l(ImageRequest imageRequest) {
        InterfaceC1251c target = imageRequest.getTarget();
        InterfaceC1252d interfaceC1252d = target instanceof InterfaceC1252d ? (InterfaceC1252d) target : null;
        View view = interfaceC1252d != null ? interfaceC1252d.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? C4863i0.m23459e(imageView) : imageRequest.getScale();
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC13110i m47479m(ImageRequest imageRequest) {
        ImageView.ScaleType scaleType;
        if (!(imageRequest.getTarget() instanceof InterfaceC1252d)) {
            return InterfaceC13110i.f46349b;
        }
        View view = ((InterfaceC1252d) imageRequest.getTarget()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? InterfaceC13110i.f46349b : C13113l.m48723b(view, false, 2, null);
    }
}
