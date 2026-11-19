package eq;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import to.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\"B\u008b\u0001\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020!2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Leq/p;", "Lln/o;", "Leq/l;", "Lls/j;", "Lg/d;", "Leq/f;", "passportNfcReaderLauncher", "Landroid/content/Context;", "context", "Lkq/c;", "sandboxFlags", "Ler/c;", "sdkFilesManager", "Lto/e;", "featureFlagManager", BuildConfig.FLAVOR, "cardAccessNumber", "Leq/b;", "mrzKey", "Leq/n;", "passportNfcStrings", BuildConfig.FLAVOR, "Leq/c;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", BuildConfig.FLAVOR, "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "<init>", "(Lg/d;Landroid/content/Context;Lkq/c;Ler/c;Lto/e;Ljava/lang/String;Leq/b;Leq/n;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Lg/d;", "c", "Landroid/content/Context;", "d", "Lkq/c;", "e", "Ler/c;", "f", "Lto/e;", "g", "Ljava/lang/String;", "h", "Leq/b;", "i", "Leq/n;", "j", "Ljava/util/List;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "l", "Ljava/lang/Integer;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements ln.o<l>, ls.j<l> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.d<PassportNfcReaderConfig> passportNfcReaderLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cardAccessNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MrzKey mrzKey;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PassportNfcStrings passportNfcStrings;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<c> enabledDataGroups;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer theme;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JU\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Leq/p$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "cardAccessNumber", "Leq/b;", "mrzKey", "Leq/n;", "passportNfcStrings", BuildConfig.FLAVOR, "Leq/c;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", BuildConfig.FLAVOR, "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "Leq/p;", "a", "(Ljava/lang/String;Leq/b;Leq/n;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)Leq/p;", "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        p a(@NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends c> enabledDataGroups, @Nullable StepStyles.UiStepStyle styles, @Nullable Integer theme, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Leq/l;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1", f = "ScanNfcWorker.kt", l = {68, 94, 98, 103}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<dv.i<? super l>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14119t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14120u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f14121v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14122w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f14123x;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = p.this.new b(bVar);
            bVar2.f14123x = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f0, code lost:
        
            if (r0.emit(r8, r17) == r2) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0180, code lost:
        
            if (av.z0.b(r6, r17) == r2) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
        
            if (r0.emit(r3, r17) == r2) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objT;
            dv.i iVar = (dv.i) this.f14123x;
            Object objE = fu.c.e();
            ?? r10 = this.f14122w;
            try {
                if (r10 != 0) {
                    if (r10 == 1) {
                        zt.o.b(obj);
                        return Unit.f21506a;
                    }
                    if (r10 == 2) {
                        zt.o.b(obj);
                        objT = obj;
                        l lVar = (l) objT;
                        long integer = p.this.context.getResources().getInteger(o.f14107a);
                        this.f14123x = iVar;
                        this.f14119t = lVar;
                        this.f14122w = 3;
                        r10 = lVar;
                    } else if (r10 == 3) {
                        l lVar2 = (l) this.f14119t;
                        zt.o.b(obj);
                        r10 = lVar2;
                    } else {
                        if (r10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return Unit.f21506a;
                }
                zt.o.b(obj);
                if (p.this.sandboxFlags.b()) {
                    File fileE = p.this.sdkFilesManager.e(".dat");
                    FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                    try {
                        lu.i.k(fileE, "this_is_some_fake_dg1_data", null, 2, null);
                        Unit unit = Unit.f21506a;
                        lu.c.a(fileOutputStream, null);
                        File fileE2 = p.this.sdkFilesManager.e(".dat");
                        FileOutputStream fileOutputStream2 = new FileOutputStream(fileE2);
                        try {
                            lu.i.k(fileE2, "this_is_some_fake_dg2_data", null, 2, null);
                            lu.c.a(fileOutputStream2, null);
                            File fileE3 = p.this.sdkFilesManager.e(".dat");
                            FileOutputStream fileOutputStream3 = new FileOutputStream(fileE3);
                            try {
                                lu.i.k(fileE3, "this_is_some_fake_sod_data", null, 2, null);
                                lu.c.a(fileOutputStream3, null);
                                Toast.makeText(p.this.context, "Using simulated government ID NFC data", 0).show();
                                l.f fVar = new l.f(Uri.fromFile(fileE), Uri.fromFile(fileE2), Uri.fromFile(fileE3), eq.a.NotRequested, p.this.passportNfcStrings.getSuccessfulScanTransitionComponentName());
                                this.f14123x = gu.l.a(iVar);
                                this.f14119t = gu.l.a(fileE);
                                this.f14120u = gu.l.a(fileE2);
                                this.f14121v = gu.l.a(fileE3);
                                this.f14122w = 1;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    lu.c.a(fileOutputStream3, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                lu.c.a(fileOutputStream2, th4);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            lu.c.a(fileOutputStream, th6);
                            throw th7;
                        }
                    }
                } else {
                    p.this.passportNfcReaderLauncher.b(new PassportNfcReaderConfig(p.this.cardAccessNumber, p.this.mrzKey, p.this.passportNfcStrings, p.this.enabledDataGroups, p.this.theme, p.this.stepStyles, p.this.componentStyles, p.this.featureFlagManager.a(v.f32634a)));
                    m mVar = new m();
                    this.f14123x = iVar;
                    this.f14122w = 2;
                    objT = dv.j.t(mVar, this);
                    if (objT != objE) {
                        l lVar3 = (l) objT;
                        long integer2 = p.this.context.getResources().getInteger(o.f14107a);
                        this.f14123x = iVar;
                        this.f14119t = lVar3;
                        this.f14122w = 3;
                        r10 = lVar3;
                    }
                }
                return objE;
            } catch (Resources.NotFoundException unused) {
            }
            this.f14123x = gu.l.a(iVar);
            this.f14119t = gu.l.a(r10);
            this.f14122w = 4;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super l> iVar, eu.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull g.d<PassportNfcReaderConfig> passportNfcReaderLauncher, @NotNull Context context, @NotNull kq.c sandboxFlags, @NotNull er.c sdkFilesManager, @NotNull to.e featureFlagManager, @NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends c> enabledDataGroups, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        Intrinsics.checkNotNullParameter(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(enabledDataGroups, "enabledDataGroups");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.sdkFilesManager = sdkFilesManager;
        this.featureFlagManager = featureFlagManager;
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.stepStyles = uiStepStyle;
        this.theme = num;
        this.componentStyles = governmentIdNfcScanStyles;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof p;
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
    public dv.h<l> run() {
        return dv.j.w(new b(null));
    }
}
