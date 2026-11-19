package zp;

import android.content.Context;
import android.content.res.Resources;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001cBw\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00172\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lzp/u;", "Lln/o;", "Lzp/i;", "Lls/j;", "Lg/d;", "Lzp/c;", "jpMyNumberNfcReaderLauncher", "Landroid/content/Context;", "context", "Lkq/c;", "sandboxFlags", "Lzp/r;", "validOperation", "Lzp/p;", "strings", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", BuildConfig.FLAVOR, "theme", BuildConfig.FLAVOR, "preferVendorMocks", "<init>", "(Lg/d;Landroid/content/Context;Lkq/c;Lzp/r;Lzp/p;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Z)V", "otherWorker", "a", "(Lln/o;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Lg/d;", "c", "Landroid/content/Context;", "d", "Lkq/c;", "e", "Lzp/r;", "f", "Lzp/p;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "j", "Ljava/lang/Integer;", "k", "Z", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements ln.o<i>, ls.j<i> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.d<JpMyNumberNfcReaderConfig> jpMyNumberNfcReaderLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final JpMyNumberNfcValidOperation validOperation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final JpMyNumberNfcStrings strings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcScan.TransitionComponents transitionComponents;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcScan.JpMyNumberNfcScanStyles componentStyles;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer theme;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean preferVendorMocks;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lzp/u$a;", BuildConfig.FLAVOR, "Lzp/r;", "validOperation", "Lzp/p;", "strings", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", BuildConfig.FLAVOR, "theme", BuildConfig.FLAVOR, "preferVendorMocks", "Lzp/u;", "a", "(Lzp/r;Lzp/p;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Z)Lzp/u;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        u a(@NotNull JpMyNumberNfcValidOperation validOperation, @NotNull JpMyNumberNfcStrings strings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles componentStyles, @Nullable StepStyles.UiStepStyle stepStyles, @Nullable Integer theme, boolean preferVendorMocks);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lzp/i;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.jpmynumber.ScanJpMyNumberNfcWorker$run$1", f = "ScanJpMyNumberNfcWorker.kt", l = {65, 69, 78}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<dv.i<? super i>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f39422t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f39423u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f39424v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f39425w;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = u.this.new b(bVar);
            bVar2.f39425w = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
        
            if (av.z0.b(r5, r14) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0116, code lost:
        
            if (r0.emit(r2, r14) == r1) goto L33;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            m mVar;
            m mVar2;
            i iVar;
            m mVar3;
            i iVar2;
            dv.i iVar3 = (dv.i) this.f39425w;
            Object objE = fu.c.e();
            int i10 = this.f39424v;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    n.f39387a.a(new n.a(u.this.validOperation.d(), u.this.validOperation.getNonce(), u.this.validOperation.getHashAlgorithm()));
                    if (u.this.sandboxFlags.c()) {
                        mVar = u.this.preferVendorMocks ? m.FAKE_POCKET_SIGN : m.FAKE_DEFAULT;
                    } else {
                        mVar = m.REAL;
                    }
                    m mVar4 = mVar;
                    u.this.jpMyNumberNfcReaderLauncher.b(new JpMyNumberNfcReaderConfig(u.this.validOperation.getOperation(), u.this.strings, u.this.transitionComponents, u.this.componentStyles, u.this.stepStyles, u.this.theme, mVar4));
                    j jVar = new j();
                    this.f39425w = iVar3;
                    this.f39422t = gu.l.a(mVar4);
                    this.f39424v = 1;
                    obj = dv.j.t(jVar, this);
                    if (obj != objE) {
                        mVar2 = mVar4;
                    }
                    return objE;
                }
                if (i10 == 1) {
                    mVar2 = (m) this.f39422t;
                    zt.o.b(obj);
                } else if (i10 == 2) {
                    iVar2 = (i) this.f39423u;
                    mVar3 = (m) this.f39422t;
                    try {
                        zt.o.b(obj);
                    } catch (Resources.NotFoundException unused) {
                    }
                    this.f39425w = gu.l.a(iVar3);
                    this.f39422t = gu.l.a(mVar3);
                    this.f39423u = gu.l.a(iVar2);
                    this.f39424v = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
                long integer = u.this.context.getResources().getInteger(s.f39411a);
                this.f39425w = iVar3;
                this.f39422t = gu.l.a(mVar2);
                this.f39423u = iVar;
                this.f39424v = 2;
            } catch (Resources.NotFoundException unused2) {
            }
            iVar = (i) obj;
            mVar3 = mVar2;
            iVar2 = iVar;
            this.f39425w = gu.l.a(iVar3);
            this.f39422t = gu.l.a(mVar3);
            this.f39423u = gu.l.a(iVar2);
            this.f39424v = 3;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super i> iVar, eu.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public u(@NotNull g.d<JpMyNumberNfcReaderConfig> jpMyNumberNfcReaderLauncher, @NotNull Context context, @NotNull kq.c sandboxFlags, @NotNull JpMyNumberNfcValidOperation validOperation, @NotNull JpMyNumberNfcStrings strings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        Intrinsics.checkNotNullParameter(jpMyNumberNfcReaderLauncher, "jpMyNumberNfcReaderLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(validOperation, "validOperation");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.jpMyNumberNfcReaderLauncher = jpMyNumberNfcReaderLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.validOperation = validOperation;
        this.strings = strings;
        this.transitionComponents = transitionComponents;
        this.componentStyles = jpMyNumberNfcScanStyles;
        this.stepStyles = uiStepStyle;
        this.theme = num;
        this.preferVendorMocks = z10;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof u;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> jVar) {
        return super.c(jVar);
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<i> run() {
        return dv.j.w(new b(null));
    }
}
