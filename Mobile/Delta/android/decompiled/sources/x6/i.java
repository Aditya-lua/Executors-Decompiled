package x6;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import k6.Extras;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.a0;
import org.jetbrains.annotations.NotNull;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001e\u001a\u00020\u0014*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010\u001e\u001a\u00020\u0014*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010#\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\"\"\u0015\u0010&\u001a\u00020\u0001*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lx6/g$a;", "", "enable", "c", "(Lx6/g$a;Z)Lx6/g$a;", "Lk6/s$a;", "b", "(Lk6/s$a;Z)Lk6/s$a;", "", "Lc7/c;", "transformations", "j", "(Lx6/g$a;[Lc7/c;)Lx6/g$a;", "", "i", "(Lx6/g$a;Ljava/util/List;)Lx6/g$a;", "Lk6/l$c;", "a", "Lk6/l$c;", "transformationsKey", "Ly6/g;", "maxBitmapSizeKey", "addLastModifiedToFileCacheKeyKey", "d", "allowConversionToBitmapKey", "Lx6/g;", "h", "(Lx6/g;)Ljava/util/List;", "f", "(Lx6/g;)Ly6/g;", "maxBitmapSize", "Lx6/p;", "g", "(Lx6/p;)Ly6/g;", "(Lx6/p;)Z", "addLastModifiedToFileCacheKey", "e", "(Lx6/g;)Z", "allowConversionToBitmap", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Extras.c<List<c7.c>> f35117a = new Extras.c<>(kotlin.collections.p.k());

    @NotNull
    public static final Extras.c<Size> b = new Extras.c<>(y6.h.a(Barcode.FORMAT_AZTEC, Barcode.FORMAT_AZTEC));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f35118c = new Extras.c<>(Boolean.FALSE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f35119d = new Extras.c<>(Boolean.TRUE);

    @NotNull
    public static final k6.s.a b(@NotNull k6.s.a aVar, boolean z10) {
        return j.c(aVar, z10 ? MlKitException.CODE_SCANNER_UNAVAILABLE : 0);
    }

    @NotNull
    public static final ImageRequest.a c(@NotNull ImageRequest.a aVar, boolean z10) {
        return j.d(aVar, z10 ? MlKitException.CODE_SCANNER_UNAVAILABLE : 0);
    }

    public static final boolean d(@NotNull Options options) {
        return ((Boolean) k6.m.b(options, f35118c)).booleanValue();
    }

    public static final boolean e(@NotNull ImageRequest imageRequest) {
        return ((Boolean) k6.m.a(imageRequest, f35119d)).booleanValue();
    }

    @NotNull
    public static final Size f(@NotNull ImageRequest imageRequest) {
        return (Size) k6.m.a(imageRequest, b);
    }

    @NotNull
    public static final Size g(@NotNull Options options) {
        return (Size) k6.m.b(options, b);
    }

    @NotNull
    public static final List<c7.c> h(@NotNull ImageRequest imageRequest) {
        return (List) k6.m.a(imageRequest, f35117a);
    }

    @NotNull
    public static final ImageRequest.a i(@NotNull ImageRequest.a aVar, @NotNull List<? extends c7.c> list) {
        aVar.h().b(f35117a, e7.d.c(list));
        final a0 a0Var = new a0();
        aVar.k("coil#transformations", CollectionsKt.m0(list, null, null, null, 0, null, new Function1() { // from class: x6.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.k(a0Var, (c7.c) obj);
            }
        }, 31, null));
        return aVar;
    }

    @NotNull
    public static final ImageRequest.a j(@NotNull ImageRequest.a aVar, @NotNull c7.c... cVarArr) {
        return i(aVar, kotlin.collections.m.j0(cVarArr));
    }

    public static final CharSequence k(a0 a0Var, c7.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = a0Var.f22549a;
        a0Var.f22549a = i10 + 1;
        sb2.append(i10);
        sb2.append(':');
        sb2.append(cVar.getCacheKey());
        return sb2.toString();
    }
}
