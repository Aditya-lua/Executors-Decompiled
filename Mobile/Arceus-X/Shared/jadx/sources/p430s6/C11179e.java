package p430s6;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4861h0;
import p096e7.InterfaceC4875u;
import p229jt.C7345l;
import p239k6.AbstractC7469j;
import p239k6.BitmapImage;
import p239k6.InterfaceC7479s;
import p287m6.EnumC8432f;
import p353p6.C10165a;
import p353p6.InterfaceC10168d;
import p537x6.C12748i;
import p537x6.EnumC12742c;
import p537x6.ImageRequest;
import p537x6.InterfaceC12757r;
import p537x6.Options;
import p537x6.SuccessResult;
import p568y6.C13109h;
import p568y6.EnumC13104c;
import p568y6.EnumC13107f;
import p568y6.InterfaceC13102a;
import p568y6.Size;

/* JADX INFO: renamed from: s6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0018\u00100\u001a\u00020\u001d*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u0004\u0018\u000101*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00102¨\u00064"}, m31665d2 = {"Ls6/e;", "", "Lk6/s;", "imageLoader", "Lx6/r;", "requestService", "Le7/u;", "logger", "<init>", "(Lk6/s;Lx6/r;Le7/u;)V", "Lx6/g;", "request", "mappedData", "Lx6/p;", "options", "Lk6/j;", "eventListener", "Ls6/d$b;", "f", "(Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;)Ls6/d$b;", "cacheKey", "Ly6/g;", "size", "Ly6/f;", "scale", "Ls6/d$c;", "a", "(Lx6/g;Ls6/d$b;Ly6/g;Ly6/f;)Ls6/d$c;", "cacheValue", "", "c", "(Lx6/g;Ls6/d$b;Ls6/d$c;Ly6/g;Ly6/f;)Z", "Lp6/a$b;", "result", "h", "(Ls6/d$b;Lx6/g;Lp6/a$b;)Z", "Lp6/d$a;", "chain", "Lx6/t;", "g", "(Lp6/d$a;Lx6/g;Ls6/d$b;Ls6/d$c;)Lx6/t;", "d", "Lk6/s;", "b", "Lx6/r;", "Le7/u;", "e", "(Ls6/d$c;)Z", "isSampled", "", "(Ls6/d$c;)Ljava/lang/String;", "diskCacheKey", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11179e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12757r requestService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC4875u logger;

    /* JADX INFO: renamed from: s6.e$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39437a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f39438b;

        static {
            int[] iArr = new int[EnumC13107f.values().length];
            try {
                iArr[EnumC13107f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13107f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39437a = iArr;
            int[] iArr2 = new int[EnumC13104c.values().length];
            try {
                iArr2[EnumC13104c.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC13104c.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f39438b = iArr2;
        }
    }

    public C11179e(@NotNull InterfaceC7479s interfaceC7479s, @NotNull InterfaceC12757r interfaceC12757r, @Nullable InterfaceC4875u interfaceC4875u) {
        this.imageLoader = interfaceC7479s;
        this.requestService = interfaceC12757r;
        this.logger = interfaceC4875u;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC11178d.Value m42109a(@NotNull ImageRequest request, @NotNull InterfaceC11178d.Key cacheKey, @NotNull Size size, @NotNull EnumC13107f scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        InterfaceC11178d interfaceC11178dMo31069e = this.imageLoader.mo31069e();
        InterfaceC11178d.Value valueMo42094a = interfaceC11178dMo31069e != null ? interfaceC11178dMo31069e.mo42094a(cacheKey) : null;
        if (valueMo42094a == null || !m42111c(request, cacheKey, valueMo42094a, size, scale)) {
            return null;
        }
        return valueMo42094a;
    }

    /* JADX INFO: renamed from: b */
    public final String m42110b(InterfaceC11178d.Value value) {
        Object obj = value.m42107a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42111c(@NotNull ImageRequest request, @NotNull InterfaceC11178d.Key cacheKey, @NotNull InterfaceC11178d.Value cacheValue, @NotNull Size size, @NotNull EnumC13107f scale) {
        if (this.requestService.mo47469c(request, cacheValue)) {
            return m42112d(request, cacheKey, cacheValue, size, scale);
        }
        InterfaceC4875u interfaceC4875u = this.logger;
        if (interfaceC4875u == null) {
            return false;
        }
        InterfaceC4875u.a aVar = InterfaceC4875u.a.Debug;
        if (interfaceC4875u.m23484a().compareTo(aVar) > 0) {
            return false;
        }
        interfaceC4875u.m23485b("MemoryCacheService", aVar, request.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m42112d(ImageRequest request, InterfaceC11178d.Key cacheKey, InterfaceC11178d.Value cacheValue, Size size, EnumC13107f scale) {
        int iAbs;
        String str = cacheKey.m42106a().get("coil#size");
        if (str != null) {
            if (Intrinsics.m31980c(str, size.toString())) {
                return true;
            }
            InterfaceC4875u interfaceC4875u = this.logger;
            if (interfaceC4875u != null) {
                InterfaceC4875u.a aVar = InterfaceC4875u.a.Debug;
                if (interfaceC4875u.m23484a().compareTo(aVar) <= 0) {
                    interfaceC4875u.m23485b("MemoryCacheService", aVar, request.getData() + ": Memory cached image's size (" + str + ") does not exactly match the target size (" + size + ").", null);
                }
            }
            return false;
        }
        if (!m42113e(cacheValue) && (C13109h.m48713b(size) || request.getPrecision() == EnumC13104c.INEXACT)) {
            return true;
        }
        int width = cacheValue.getImage().getWidth();
        int height = cacheValue.getImage().getHeight();
        Size sizeM47578f = cacheValue.getImage() instanceof BitmapImage ? C12748i.m47578f(request) : Size.f46345d;
        InterfaceC13102a interfaceC13102aM48711d = size.m48711d();
        int px = interfaceC13102aM48711d instanceof InterfaceC13102a.a ? ((InterfaceC13102a.a) interfaceC13102aM48711d).getPx() : Integer.MAX_VALUE;
        InterfaceC13102a interfaceC13102aM48711d2 = sizeM47578f.m48711d();
        int iMin = Math.min(px, interfaceC13102aM48711d2 instanceof InterfaceC13102a.a ? ((InterfaceC13102a.a) interfaceC13102aM48711d2).getPx() : Integer.MAX_VALUE);
        InterfaceC13102a interfaceC13102aM48710c = size.m48710c();
        int px2 = interfaceC13102aM48710c instanceof InterfaceC13102a.a ? ((InterfaceC13102a.a) interfaceC13102aM48710c).getPx() : Integer.MAX_VALUE;
        InterfaceC13102a interfaceC13102aM48710c2 = sizeM47578f.m48710c();
        int iMin2 = Math.min(px2, interfaceC13102aM48710c2 instanceof InterfaceC13102a.a ? ((InterfaceC13102a.a) interfaceC13102aM48710c2).getPx() : Integer.MAX_VALUE);
        double d10 = ((double) iMin) / ((double) width);
        double d11 = ((double) iMin2) / ((double) height);
        int i10 = b.f39437a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? EnumC13107f.FIT : scale).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new C7345l();
            }
            if (d10 < d11) {
                iAbs = Math.abs(iMin - width);
            } else {
                iAbs = Math.abs(iMin2 - height);
                d10 = d11;
            }
        } else if (d10 > d11) {
            iAbs = Math.abs(iMin - width);
        } else {
            iAbs = Math.abs(iMin2 - height);
            d10 = d11;
        }
        if (iAbs <= 1) {
            return true;
        }
        int i11 = b.f39438b[request.getPrecision().ordinal()];
        if (i11 == 1) {
            if (d10 == 1.0d) {
                return true;
            }
            InterfaceC4875u interfaceC4875u2 = this.logger;
            if (interfaceC4875u2 != null) {
                InterfaceC4875u.a aVar2 = InterfaceC4875u.a.Debug;
                if (interfaceC4875u2.m23484a().compareTo(aVar2) <= 0) {
                    interfaceC4875u2.m23485b("MemoryCacheService", aVar2, request.getData() + ": Memory cached image's size (" + width + ", " + height + ") does not exactly match the target size (" + iMin + ", " + iMin2 + ").", null);
                }
            }
            return false;
        }
        if (i11 != 2) {
            throw new C7345l();
        }
        if (d10 <= 1.0d) {
            return true;
        }
        InterfaceC4875u interfaceC4875u3 = this.logger;
        if (interfaceC4875u3 != null) {
            InterfaceC4875u.a aVar3 = InterfaceC4875u.a.Debug;
            if (interfaceC4875u3.m23484a().compareTo(aVar3) <= 0) {
                interfaceC4875u3.m23485b("MemoryCacheService", aVar3, request.getData() + ": Memory cached image's size (" + width + ", " + height + ") is smaller than the target size (" + iMin + ", " + iMin2 + ").", null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m42113e(InterfaceC11178d.Value value) {
        Object obj = value.m42107a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final InterfaceC11178d.Key m42114f(@NotNull ImageRequest request, @NotNull Object mappedData, @NotNull Options options, @NotNull AbstractC7469j eventListener) {
        if (request.getMemoryCachePolicy() == EnumC12742c.DISABLED) {
            return null;
        }
        if (request.getMemoryCacheKey() != null) {
            return new InterfaceC11178d.Key(request.getMemoryCacheKey(), request.m47513r());
        }
        eventListener.m31041j(request, mappedData);
        String strM23450q = C4861h0.m23450q(this.imageLoader.getComponents(), mappedData, options, this.logger, "MemoryCacheService");
        eventListener.m31040i(request, strM23450q);
        if (strM23450q == null) {
            return null;
        }
        if (C12748i.m47580h(request).isEmpty()) {
            return new InterfaceC11178d.Key(strM23450q, request.m47513r());
        }
        Map mapM31809x = C7690k0.m31809x(request.m47513r());
        mapM31809x.put("coil#size", options.getSize().toString());
        return new InterfaceC11178d.Key(strM23450q, mapM31809x);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final SuccessResult m42115g(@NotNull InterfaceC10168d.a chain, @NotNull ImageRequest request, @NotNull InterfaceC11178d.Key cacheKey, @NotNull InterfaceC11178d.Value cacheValue) {
        return new SuccessResult(cacheValue.getImage(), request, EnumC8432f.MEMORY_CACHE, cacheKey, m42110b(cacheValue), m42113e(cacheValue), C4861h0.m23449p(chain));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m42116h(@Nullable InterfaceC11178d.Key cacheKey, @NotNull ImageRequest request, @NotNull C10165a.ExecuteResult result) {
        InterfaceC11178d interfaceC11178dMo31069e;
        if (cacheKey == null || !request.getMemoryCachePolicy().getWriteEnabled() || !result.getImage().getShareable() || (interfaceC11178dMo31069e = this.imageLoader.mo31069e()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(result.getIsSampled()));
        String diskCacheKey = result.getDiskCacheKey();
        if (diskCacheKey != null) {
            linkedHashMap.put("coil#disk_cache_key", diskCacheKey);
        }
        interfaceC11178dMo31069e.mo42099h(cacheKey, new InterfaceC11178d.Value(result.getImage(), linkedHashMap));
        return true;
    }
}
