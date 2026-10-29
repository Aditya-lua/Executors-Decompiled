package p070d7;

import android.graphics.drawable.Drawable;
import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;
import p287m6.EnumC8432f;
import p537x6.ErrorResult;
import p537x6.InterfaceC12750k;
import p537x6.SuccessResult;
import p568y6.EnumC13107f;

/* JADX INFO: renamed from: d7.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Ld7/b;", "Ld7/d;", "Ld7/e;", "target", "Lx6/k;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Ld7/e;Lx6/k;IZ)V", "", "a", "()V", "Ld7/e;", "b", "Lx6/k;", "c", "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4465b implements InterfaceC4467d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4468e target;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12750k result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int durationMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean preferExactIntrinsicSize;

    public C4465b(@NotNull InterfaceC4468e interfaceC4468e, @NotNull InterfaceC12750k interfaceC12750k, int i10, boolean z10) {
        this.target = interfaceC4468e;
        this.result = interfaceC12750k;
        this.durationMillis = i10;
        this.preferExactIntrinsicSize = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // p070d7.InterfaceC4467d
    /* JADX INFO: renamed from: a */
    public void mo22412a() {
        Drawable drawableMo6970d = this.target.mo6970d();
        InterfaceC7474n image = this.result.getImage();
        Drawable drawableM31086a = image != null ? C7482v.m31086a(image, this.target.getView().getResources()) : null;
        EnumC13107f scale = this.result.getRequest().getScale();
        int i10 = this.durationMillis;
        InterfaceC12750k interfaceC12750k = this.result;
        C4464a c4464a = new C4464a(drawableMo6970d, drawableM31086a, scale, i10, ((interfaceC12750k instanceof SuccessResult) && ((SuccessResult) interfaceC12750k).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        InterfaceC12750k interfaceC12750k2 = this.result;
        if (interfaceC12750k2 instanceof SuccessResult) {
            this.target.mo6969c(C7482v.m31088c(c4464a));
        } else {
            if (!(interfaceC12750k2 instanceof ErrorResult)) {
                throw new C7345l();
            }
            this.target.mo6967a(C7482v.m31088c(c4464a));
        }
    }

    /* JADX INFO: renamed from: d7.b$a */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Ld7/b$a;", "Ld7/d$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Ld7/e;", "target", "Lx6/k;", "result", "Ld7/d;", "a", "(Ld7/e;Lx6/k;)Ld7/d;", "c", "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC4467d.a {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int durationMillis;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean preferExactIntrinsicSize;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i10, boolean z10) {
            this.durationMillis = i10;
            this.preferExactIntrinsicSize = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // p070d7.InterfaceC4467d.a
        @NotNull
        /* JADX INFO: renamed from: a */
        public InterfaceC4467d mo22413a(@NotNull InterfaceC4468e target, @NotNull InterfaceC12750k result) {
            if ((result instanceof SuccessResult) && ((SuccessResult) result).getDataSource() != EnumC8432f.MEMORY_CACHE) {
                return new C4465b(target, result, this.durationMillis, this.preferExactIntrinsicSize);
            }
            return InterfaceC4467d.a.f18504b.mo22413a(target, result);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
          (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap int:0x0004: SGET  A[WRAPPED] com.google.mlkit.common.MlKitException.CODE_SCANNER_UNAVAILABLE int) : (r1v0 int))
          (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
         A[MD:(int, boolean):void (m)] (LINE:5) call: d7.b.a.<init>(int, boolean):void type: THIS */
        public /* synthetic */ a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? MlKitException.CODE_SCANNER_UNAVAILABLE : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
