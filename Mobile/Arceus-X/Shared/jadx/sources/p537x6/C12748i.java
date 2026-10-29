package p537x6;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7725a0;
import org.jetbrains.annotations.NotNull;
import p043c7.AbstractC1553c;
import p096e7.C4852d;
import p239k6.C7473m;
import p239k6.Extras;
import p239k6.InterfaceC7479s;
import p568y6.C13109h;
import p568y6.Size;

/* JADX INFO: renamed from: x6.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001e\u001a\u00020\u0014*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010\u001e\u001a\u00020\u0014*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010#\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\"\"\u0015\u0010&\u001a\u00020\u0001*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m31665d2 = {"Lx6/g$a;", "", "enable", "c", "(Lx6/g$a;Z)Lx6/g$a;", "Lk6/s$a;", "b", "(Lk6/s$a;Z)Lk6/s$a;", "", "Lc7/c;", "transformations", "j", "(Lx6/g$a;[Lc7/c;)Lx6/g$a;", "", "i", "(Lx6/g$a;Ljava/util/List;)Lx6/g$a;", "Lk6/l$c;", "a", "Lk6/l$c;", "transformationsKey", "Ly6/g;", "maxBitmapSizeKey", "addLastModifiedToFileCacheKeyKey", "d", "allowConversionToBitmapKey", "Lx6/g;", "h", "(Lx6/g;)Ljava/util/List;", "f", "(Lx6/g;)Ly6/g;", "maxBitmapSize", "Lx6/p;", "g", "(Lx6/p;)Ly6/g;", "(Lx6/p;)Z", "addLastModifiedToFileCacheKey", "e", "(Lx6/g;)Z", "allowConversionToBitmap", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12748i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Extras.c<List<AbstractC1553c>> f45455a = new Extras.c<>(C7699p.m31892k());

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Extras.c<Size> f45456b = new Extras.c<>(C13109h.m48712a(4096, 4096));

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Extras.c<Boolean> f45457c = new Extras.c<>(Boolean.FALSE);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Extras.c<Boolean> f45458d = new Extras.c<>(Boolean.TRUE);

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC7479s.a m47574b(@NotNull InterfaceC7479s.a aVar, boolean z10) {
        return C12749j.m47586c(aVar, z10 ? MlKitException.CODE_SCANNER_UNAVAILABLE : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ImageRequest.a m47575c(@NotNull ImageRequest.a aVar, boolean z10) {
        return C12749j.m47587d(aVar, z10 ? MlKitException.CODE_SCANNER_UNAVAILABLE : 0);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m47576d(@NotNull Options options) {
        return ((Boolean) C7473m.m31063b(options, f45457c)).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m47577e(@NotNull ImageRequest imageRequest) {
        return ((Boolean) C7473m.m31062a(imageRequest, f45458d)).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Size m47578f(@NotNull ImageRequest imageRequest) {
        return (Size) C7473m.m31062a(imageRequest, f45456b);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Size m47579g(@NotNull Options options) {
        return (Size) C7473m.m31063b(options, f45456b);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final List<AbstractC1553c> m47580h(@NotNull ImageRequest imageRequest) {
        return (List) C7473m.m31062a(imageRequest, f45455a);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final ImageRequest.a m47581i(@NotNull ImageRequest.a aVar, @NotNull List<? extends AbstractC1553c> list) {
        aVar.m47530h().m31060b(f45455a, C4852d.m23423c(list));
        final C7725a0 c7725a0 = new C7725a0();
        aVar.m47533k("coil#transformations", CollectionsKt.m31715m0(list, null, null, null, 0, null, new Function1() { // from class: x6.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12748i.m47583k(c7725a0, (AbstractC1553c) obj);
            }
        }, 31, null));
        return aVar;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final ImageRequest.a m47582j(@NotNull ImageRequest.a aVar, @NotNull AbstractC1553c... abstractC1553cArr) {
        return m47581i(aVar, C7693m.m31867j0(abstractC1553cArr));
    }

    /* JADX INFO: renamed from: k */
    public static final CharSequence m47583k(C7725a0 c7725a0, AbstractC1553c abstractC1553c) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = c7725a0.f29421a;
        c7725a0.f29421a = i10 + 1;
        sb2.append(i10);
        sb2.append(':');
        sb2.append(abstractC1553c.getCacheKey());
        return sb2.toString();
    }
}
