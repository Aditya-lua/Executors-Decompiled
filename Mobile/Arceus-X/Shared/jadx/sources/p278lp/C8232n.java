package p278lp;

import android.content.Context;
import android.content.res.Resources;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p525wp.C12504c;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: lp.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00014Bw\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00172\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m31665d2 = {"Llp/n;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "Lvr/h;", "Lg/c;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;", "jpMyNumberNfcReaderLauncher", "Landroid/content/Context;", "context", "Lwp/c;", "sandboxFlags", "Llp/k;", "validOperation", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "strings", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "", "preferVendorMocks", "<init>", "(Lg/c;Landroid/content/Context;Lwp/c;Llp/k;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Z)V", "otherWorker", "b", "(Lym/o;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lg/c;", "c", "Landroid/content/Context;", "d", "Lwp/c;", "e", "Llp/k;", "f", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "j", "Ljava/lang/Integer;", "k", "Z", "a", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8232n implements InterfaceC13222o<JpMyNumberNfcReaderOutput>, InterfaceC12257h<JpMyNumberNfcReaderOutput> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<JpMyNumberNfcReaderConfig> jpMyNumberNfcReaderLauncher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C12504c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final JpMyNumberNfcValidOperation validOperation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final JpMyNumberNfcStrings strings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcScan.TransitionComponents transitionComponents;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final JpMyNumberNfcScan.JpMyNumberNfcScanStyles componentStyles;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final Integer theme;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean preferVendorMocks;

    /* JADX INFO: renamed from: lp.n$a */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, m31665d2 = {"Llp/n$a;", "", "Llp/k;", "validOperation", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "strings", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "", "preferVendorMocks", "Llp/n;", "a", "(Llp/k;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Z)Llp/n;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C8232n mo33591a(@NotNull JpMyNumberNfcValidOperation validOperation, @NotNull JpMyNumberNfcStrings strings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles componentStyles, @Nullable StepStyles.UiStepStyle stepStyles, @Nullable Integer theme, boolean preferVendorMocks);
    }

    /* JADX INFO: renamed from: lp.n$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.jpmynumber.ScanJpMyNumberNfcWorker$run$1", m39664f = "ScanJpMyNumberNfcWorker.kt", m39665l = {65, 69, 78}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC9577i<? super JpMyNumberNfcReaderOutput>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f30528t;

        /* JADX INFO: renamed from: u */
        public Object f30529u;

        /* JADX INFO: renamed from: v */
        public int f30530v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f30531w;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = C8232n.this.new b(interfaceC9557b);
            bVar.f30531w = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
        
            if (p256ku.C7946z0.m32938b(r5, r14) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0116, code lost:
        
            if (r0.emit(r2, r14) == r1) goto L33;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC8226h enumC8226h;
            EnumC8226h enumC8226h2;
            JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput;
            EnumC8226h enumC8226h3;
            JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput2;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f30531w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30530v;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C8227i.f30503a.m33570a(new C8227i.a(C8232n.this.validOperation.m33577d(), C8232n.this.validOperation.getNonce(), C8232n.this.validOperation.getHashAlgorithm()));
                    if (C8232n.this.sandboxFlags.m46822c()) {
                        enumC8226h = C8232n.this.preferVendorMocks ? EnumC8226h.FAKE_POCKET_SIGN : EnumC8226h.FAKE_DEFAULT;
                    } else {
                        enumC8226h = EnumC8226h.REAL;
                    }
                    EnumC8226h enumC8226h4 = enumC8226h;
                    C8232n.this.jpMyNumberNfcReaderLauncher.m26240b(new JpMyNumberNfcReaderConfig(C8232n.this.validOperation.getOperation(), C8232n.this.strings, C8232n.this.transitionComponents, C8232n.this.componentStyles, C8232n.this.stepStyles, C8232n.this.theme, enumC8226h4));
                    C8225g c8225g = new C8225g();
                    this.f30531w = interfaceC9577i;
                    this.f30528t = C10350l.m39676a(enumC8226h4);
                    this.f30530v = 1;
                    obj = C9579j.m37804u(c8225g, this);
                    if (obj != objM38805e) {
                        enumC8226h2 = enumC8226h4;
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    enumC8226h2 = (EnumC8226h) this.f30528t;
                    C7348o.m30470b(obj);
                } else if (i10 == 2) {
                    jpMyNumberNfcReaderOutput2 = (JpMyNumberNfcReaderOutput) this.f30529u;
                    enumC8226h3 = (EnumC8226h) this.f30528t;
                    try {
                        C7348o.m30470b(obj);
                    } catch (Resources.NotFoundException unused) {
                    }
                    this.f30531w = C10350l.m39676a(interfaceC9577i);
                    this.f30528t = C10350l.m39676a(enumC8226h3);
                    this.f30529u = C10350l.m39676a(jpMyNumberNfcReaderOutput2);
                    this.f30530v = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
                long integer = C8232n.this.context.getResources().getInteger(C8230l.f30516a);
                this.f30531w = interfaceC9577i;
                this.f30528t = C10350l.m39676a(enumC8226h2);
                this.f30529u = jpMyNumberNfcReaderOutput;
                this.f30530v = 2;
            } catch (Resources.NotFoundException unused2) {
            }
            jpMyNumberNfcReaderOutput = (JpMyNumberNfcReaderOutput) obj;
            enumC8226h3 = enumC8226h2;
            jpMyNumberNfcReaderOutput2 = jpMyNumberNfcReaderOutput;
            this.f30531w = C10350l.m39676a(interfaceC9577i);
            this.f30528t = C10350l.m39676a(enumC8226h3);
            this.f30529u = C10350l.m39676a(jpMyNumberNfcReaderOutput2);
            this.f30530v = 3;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super JpMyNumberNfcReaderOutput> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C8232n(@NotNull AbstractC5854c<JpMyNumberNfcReaderConfig> jpMyNumberNfcReaderLauncher, @NotNull Context context, @NotNull C12504c sandboxFlags, @NotNull JpMyNumberNfcValidOperation validOperation, @NotNull JpMyNumberNfcStrings strings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
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

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof C8232n;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<JpMyNumberNfcReaderOutput> run() {
        return C9579j.m37806w(new b(null));
    }
}
