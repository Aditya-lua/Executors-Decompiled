package d7;

import android.graphics.drawable.Drawable;
import com.google.mlkit.common.MlKitException;
import jt.l;
import k6.n;
import k6.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import x6.ErrorResult;
import x6.SuccessResult;
import x6.k;
import y6.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld7/b;", "Ld7/d;", "Ld7/e;", "target", "Lx6/k;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Ld7/e;Lx6/k;IZ)V", "", "a", "()V", "Ld7/e;", "b", "Lx6/k;", "c", "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e target;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final k result;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int durationMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean preferExactIntrinsicSize;

    public b(@NotNull e eVar, @NotNull k kVar, int i10, boolean z10) {
        this.target = eVar;
        this.result = kVar;
        this.durationMillis = i10;
        this.preferExactIntrinsicSize = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // d7.d
    public void a() {
        Drawable drawableD = this.target.d();
        n image = this.result.getImage();
        Drawable drawableA = image != null ? v.a(image, this.target.getView().getResources()) : null;
        f scale = this.result.getRequest().getScale();
        int i10 = this.durationMillis;
        k kVar = this.result;
        d7.a aVar = new d7.a(drawableD, drawableA, scale, i10, ((kVar instanceof SuccessResult) && ((SuccessResult) kVar).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        k kVar2 = this.result;
        if (kVar2 instanceof SuccessResult) {
            this.target.c(v.c(aVar));
        } else {
            if (!(kVar2 instanceof ErrorResult)) {
                throw new l();
            }
            this.target.a(v.c(aVar));
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ld7/b$a;", "Ld7/d$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Ld7/e;", "target", "Lx6/k;", "result", "Ld7/d;", "a", "(Ld7/e;Lx6/k;)Ld7/d;", "c", "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements d.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int durationMillis;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean preferExactIntrinsicSize;

        public a(int i10, boolean z10) {
            this.durationMillis = i10;
            this.preferExactIntrinsicSize = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // d7.d.a
        @NotNull
        public d a(@NotNull e target, @NotNull k result) {
            if ((result instanceof SuccessResult) && ((SuccessResult) result).getDataSource() != m6.f.MEMORY_CACHE) {
                return new b(target, result, this.durationMillis, this.preferExactIntrinsicSize);
            }
            return d.a.b.a(target, result);
        }

        public /* synthetic */ a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? MlKitException.CODE_SCANNER_UNAVAILABLE : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
