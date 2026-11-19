package vo;

import android.content.Context;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide;
import dp.GovernmentIdRequestArguments;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import zo.BottomSheetCaptureTipsViewModel;
import zo.StaticCaptureTipsViewModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\n\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018\u001aM\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`\u001d*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a1\u0010#\u001a\u0004\u0018\u00010\u0004*\u00140 R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030!2\b\b\u0002\u0010\"\u001a\u00020\u0012H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)\u001a¥\u0001\u00109\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00042&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020\u00122\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u000202012\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b9\u0010:\u001aO\u0010<\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010?\u001a\u00020>*\u00020%H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\u00020A*\u00020%H\u0000¢\u0006\u0004\bB\u0010C\u001a5\u0010H\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001062\u0006\u0010G\u001a\u00020\u0012H\u0000¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bL\u0010K\u001a-\u0010M\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bM\u0010K\u001a\u001f\u0010P\u001a\u0004\u0018\u000106*\u00020D2\b\u0010O\u001a\u0004\u0018\u00010NH\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001d\u0010S\u001a\u0004\u0018\u00010R*\u00020\u00032\u0006\u0010E\u001a\u00020%H\u0000¢\u0006\u0004\bS\u0010T\u001a\u0019\u0010V\u001a\b\u0012\u0004\u0012\u00020U01*\u00020\u0003H\u0000¢\u0006\u0004\bV\u0010W\u001aG\u0010Y\u001a\u00020\t2&\u0010\u000f\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010X\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010Z\"\u001a\u0010]\u001a\u0004\u0018\u00010%*\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lln/k;", "Lvo/d2$a;", "Lvo/j0;", "Lvo/d2$b;", BuildConfig.FLAVOR, "Lip/l;", "videoCaptureHelper", BuildConfig.FLAVOR, "S", "(Lln/k$a;Lip/l;)V", "v", "(Lln/k$a;)V", "Landroid/content/Context;", "context", "renderContext", "renderProps", BuildConfig.FLAVOR, "checkPermissions", "Lfq/n1;", "permissionRequestWorkflow", "Lcq/c;", "j0", "(Ljava/lang/Object;Landroid/content/Context;Lln/k$a;Lvo/d2$a;ZLfq/n1;)Lcq/c;", "f0", "inRecoverableState", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "z", "(Lln/k$a;Z)Lkotlin/jvm/functions/Function1;", "Lln/r$c;", "Lln/r;", "addCurrentState", "x", "(Lln/r$c;Z)Lvo/j0;", "Lvo/d3$e;", "currentSide", "Lvo/y3$b$a;", "O", "(Lvo/d2$a;Lvo/d3$e;)Lvo/y3$b$a;", "renderState", "Lvo/n;", "acceptedId", "Lvo/d3;", "id", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "Lvo/i3;", "parts", BuildConfig.FLAVOR, "currentPartIndex", BuildConfig.FLAVOR, "webRtcObjectId", "countryCode", "W", "(Lvo/j0;Lln/k$a;Lvo/d2$a;Lvo/n;Lvo/d3;Lip/l;Lsn/v;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "useVideoCapture", "U", "(Landroid/content/Context;Lln/k$a;Lvo/d2$a;Z)V", "Lvo/n$d;", "e0", "(Lvo/d3$e;)Lvo/n$d;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "d0", "(Lvo/d3$e;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "Lvo/d2$a$b;", "side", "selectedId", "isAutoClassification", "P", "(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "K", "(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "J", "M", "Lcp/d;", "hint", "R", "(Lvo/d2$a$b;Lcp/d;)Ljava/lang/String;", "Lzo/i;", "L", "(Lvo/d2$a;Lvo/d3$e;)Lzo/i;", "Lvo/l;", "N", "(Lvo/d2$a;)Ljava/util/List;", "output", "b0", "(Lln/k$a;Lvo/d2$b;Lip/l;)V", "Q", "(Lvo/i3;)Lvo/d3$e;", "sideOrNull", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34489a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[fq.s1.values().length];
            try {
                iArr[fq.s1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fq.s1.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fq.s1.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34489a = iArr;
            int[] iArr2 = new int[IdConfig.e.values().length];
            try {
                iArr2[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.e.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.e.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.e.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static /* synthetic */ Function1 A(ln.k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return z(aVar, z10);
    }

    public static final Unit B(ln.k.a aVar, final boolean z10, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof sn.k)) {
            aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.i2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b3.H(cameraError, (ln.r.c) obj);
                }
            }, 1, null));
            return Unit.f21506a;
        }
        sn.k kVar = (sn.k) cameraError;
        if (!(kVar instanceof sn.t0)) {
            if (kVar instanceof sn.v0) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.j2
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b3.I((ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.p0) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.k2
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b3.C((ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.a1) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.l2
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b3.D(z10, (ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.f0) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.m2
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b3.E((ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.j1) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.n2
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b3.F((ln.r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(kVar instanceof sn.z0)) {
                    throw new zt.l();
                }
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.o2
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b3.G(z10, cameraError, (ln.r.c) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit C(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f21506a;
    }

    public static final Unit D(boolean z10, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((j0) action.c()).v();
            action.e(new j0.RestartStep(null, null, null, null, 0, ((j0) action.c()).getCountryCode(), null, null, 223, null));
        } else {
            action.d(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f21506a;
    }

    public static final Unit E(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f21506a;
    }

    public static final Unit F(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f21506a;
    }

    public static final Unit G(boolean z10, Throwable th2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((j0) action.c()).v();
            if (!((sn.z0) th2).getIsClosedDueToBadCameraConfiguration()) {
                action.e(new j0.RestartStep(null, null, null, null, 0, ((j0) action.c()).getCountryCode(), null, null, 223, null));
            }
        } else {
            action.d(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f21506a;
    }

    public static final Unit H(Throwable th2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f21506a;
    }

    public static final Unit I(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f21506a;
    }

    @NotNull
    public static final String J(@NotNull d2.a.Strings strings, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getCaptureScreenDescription().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @NotNull
    public static final String K(@NotNull d2.a.Strings strings, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getCaptureScreenTitle().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @Nullable
    public static final zo.i L(@NotNull d2.a aVar, @NotNull IdConfig.e side) {
        String idFrontHelpModalTitle;
        String idFrontHelpModalPrompt;
        String idFrontHelpModalHints;
        String idFrontHelpModalContinueButtonText;
        String idBackHelpModalTitle;
        String idBackHelpModalPrompt;
        String idBackHelpModalHints;
        String idBackHelpModalContinueButtonText;
        String barcodeHelpModalTitle;
        String barcodeHelpModalPrompt;
        String barcodeHelpModalHints;
        String barcodeHelpModalContinueButtonText;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        if (aVar.getStaticCaptureTipsEnabled()) {
            return new StaticCaptureTipsViewModel(aVar.getStrings().getStaticCaptureTipsTitle(), aVar.getStrings().getStaticCaptureTipsSubtext(), aVar.getAssetConfig().getCapturePage());
        }
        int i10 = a.b[side.ordinal()];
        if (i10 == 1) {
            String helpButtonText = aVar.getStrings().getHelpButtonText();
            if (helpButtonText == null || (idFrontHelpModalTitle = aVar.getStrings().getIdFrontHelpModalTitle()) == null || (idFrontHelpModalPrompt = aVar.getStrings().getIdFrontHelpModalPrompt()) == null || (idFrontHelpModalHints = aVar.getStrings().getIdFrontHelpModalHints()) == null || (idFrontHelpModalContinueButtonText = aVar.getStrings().getIdFrontHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new BottomSheetCaptureTipsViewModel(helpButtonText, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHints, idFrontHelpModalContinueButtonText, side);
        }
        if (i10 == 2) {
            String helpButtonText2 = aVar.getStrings().getHelpButtonText();
            if (helpButtonText2 == null || (idBackHelpModalTitle = aVar.getStrings().getIdBackHelpModalTitle()) == null || (idBackHelpModalPrompt = aVar.getStrings().getIdBackHelpModalPrompt()) == null || (idBackHelpModalHints = aVar.getStrings().getIdBackHelpModalHints()) == null || (idBackHelpModalContinueButtonText = aVar.getStrings().getIdBackHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new BottomSheetCaptureTipsViewModel(helpButtonText2, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHints, idBackHelpModalContinueButtonText, side);
        }
        if (i10 == 3) {
            return null;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                return null;
            }
            throw new zt.l();
        }
        String helpButtonText3 = aVar.getStrings().getHelpButtonText();
        if (helpButtonText3 == null || (barcodeHelpModalTitle = aVar.getStrings().getBarcodeHelpModalTitle()) == null || (barcodeHelpModalPrompt = aVar.getStrings().getBarcodeHelpModalPrompt()) == null || (barcodeHelpModalHints = aVar.getStrings().getBarcodeHelpModalHints()) == null || (barcodeHelpModalContinueButtonText = aVar.getStrings().getBarcodeHelpModalContinueButtonText()) == null) {
            return null;
        }
        return new BottomSheetCaptureTipsViewModel(helpButtonText3, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueButtonText, side);
    }

    @NotNull
    public static final String M(@NotNull d2.a.Strings strings, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getConfirmCapture().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @NotNull
    public static final List<EnabledIdClass> N(@NotNull d2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<IdConfig> listO = aVar.o();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listO, 10));
        for (IdConfig idConfig : listO) {
            h3 icon = idConfig.getIcon();
            String idClassKey = aVar.getStrings().V().get(idConfig.getIdClassKey());
            if (idClassKey == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new EnabledIdClass(icon, idConfig, idClassKey));
        }
        return arrayList;
    }

    @NotNull
    public static final y3.b.a O(@NotNull d2.a renderProps, @NotNull IdConfig.e currentSide) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(currentSide, "currentSide");
        if (currentSide == IdConfig.e.PassportSignature) {
            return y3.b.a.Enabled;
        }
        return (Intrinsics.c(renderProps.getCountryCode(), "US") || currentSide != IdConfig.e.Back) ? y3.b.a.Hidden : y3.b.a.Enabled;
    }

    @NotNull
    public static final String P(@NotNull d2.a.Strings strings, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        if (z10 && strings.getAutoClassificationCaptureTipText() != null) {
            return strings.getAutoClassificationCaptureTipText();
        }
        String strA = strings.getScanInstructions().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @Nullable
    public static final IdConfig.e Q(@NotNull i3 i3Var) {
        Intrinsics.checkNotNullParameter(i3Var, "<this>");
        i3.SideIdPart sideIdPart = i3Var instanceof i3.SideIdPart ? (i3.SideIdPart) i3Var : null;
        if (sideIdPart != null) {
            return sideIdPart.getSide();
        }
        return null;
    }

    @Nullable
    public static final String R(@NotNull d2.a.Strings strings, @Nullable cp.d dVar) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        if (Intrinsics.c(dVar, cp.e.f11507a)) {
            return strings.getHintHoldStill();
        }
        if (Intrinsics.c(dVar, cp.f.f11508a)) {
            return strings.getHintLowLight();
        }
        if (dVar == null) {
            return null;
        }
        throw new zt.l();
    }

    public static final void S(@NotNull ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a aVar, @Nullable final ip.l lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.t2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.T(lVar, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit T(ip.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        j0 backState = ((j0) action.c()).getBackState();
        if (lVar != null) {
            lVar.a();
        }
        if (backState != null) {
            backState.F(true);
            action.e(backState);
        } else if (((d2.a) action.b()).getBackStepEnabled()) {
            action.d(d2.b.a.f34599a);
        } else {
            action.d(d2.b.C0708b.f34600a);
        }
        return Unit.f21506a;
    }

    public static final void U(@NotNull Context context, @NotNull ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a renderContext, @NotNull d2.a renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listP = p001kotlin.collections.p.p(fq.n0.Camera);
        if (z10 && xq.g.f(context)) {
            listP.add(fq.n0.RecordAudio);
        }
        final List<fq.n0> listA = fq.y1.a(context, listP);
        if (listA.isEmpty()) {
            return;
        }
        renderContext.d().a(ln.b0.c(null, new Function1() { // from class: vo.v2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.V(listA, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit V(List list, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        j0 j0Var = (j0) action.c();
        if (j0Var instanceof j0.WaitForAutocapture) {
            action.e(j0.WaitForAutocapture.L((j0.WaitForAutocapture) j0Var, null, null, null, null, null, 0, null, null, null, null, list.contains(fq.n0.Camera), list.contains(fq.n0.RecordAudio), null, null, null, 29695, null));
        } else {
            ((j0) action.c()).v();
            action.e(new j0.RestartStep(null, null, null, null, 0, j0Var.getCountryCode(), null, null, 223, null));
        }
        return Unit.f21506a;
    }

    public static final void W(@NotNull final j0 renderState, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a renderContext, @NotNull final d2.a renderProps, @Nullable final n nVar, @NotNull final IdConfig id2, @NotNull final ip.l videoCaptureHelper, @NotNull final sn.v cameraProperties, final boolean z10, @NotNull final List<? extends i3> parts, final int i10, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        final zn.a aVarE = videoCaptureHelper.e(renderProps);
        renderContext.d().a(ln.b0.c(null, new Function1() { // from class: vo.u2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.Y(renderState, nVar, i10, parts, renderProps, videoCaptureHelper, id2, z10, str2, aVarE, cameraProperties, str, renderContext, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit Y(j0 j0Var, n nVar, int i10, List list, d2.a aVar, final ip.l lVar, IdConfig idConfig, boolean z10, String str, zn.a aVar2, sn.v vVar, String str2, final ln.k.a aVar3, ln.r.c action) {
        Parcelable submit;
        Parcelable waitForAutocapture;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c().getClass() != j0Var.getClass()) {
            return Unit.f21506a;
        }
        List<n> listX0 = nVar != null ? CollectionsKt.x0(((j0) action.c()).D(), nVar) : ((j0) action.c()).D();
        int i11 = i10 == list.size() ? i10 : i10 + 1;
        i3 i3Var = (i3) CollectionsKt.f0(list, i11);
        if (i3Var instanceof i3.SideIdPart) {
            if (!aVar.u() || lVar.d()) {
                i3.SideIdPart sideIdPart = (i3.SideIdPart) i3Var;
                waitForAutocapture = new j0.WaitForAutocapture(sideIdPart, listX0, new f.IdCaptureConfig(idConfig), O((d2.a) action.b(), sideIdPart.getSide()), list, i11, x(action, z10), lVar.d() ? ip.x.Connected : ip.x.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str, null, new Function0() { // from class: vo.x2
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b3.Z(aVar3, lVar);
                    }
                }, 11776, null);
            } else {
                waitForAutocapture = new j0.ChooseCaptureMethod((i3.SideIdPart) i3Var, listX0, list, i11, str, new f.IdCaptureConfig(idConfig), false, x(action, z10), null, 320, null);
            }
        } else {
            if (i3Var != null) {
                throw new zt.l();
            }
            if (aVar2 != zn.a.Stream || (action.c() instanceof j0.f) || (action.c() instanceof j0.ReviewSelectedImage)) {
                submit = (aVar2 != zn.a.Upload || (action.c() instanceof j0.FinalizeLocalVideoCapture) || (action.c() instanceof j0.ReviewSelectedImage)) ? new j0.Submit(idConfig, listX0, null, list, i11, x(action, z10), str, new GovernmentIdRequestArguments(listX0, aVar.getFieldKeyDocument(), aVar.getFieldKeyIdClass()), str2, vVar, false, 1028, null) : new j0.FinalizeLocalVideoCapture(idConfig, listX0, (i3) CollectionsKt.o0(list), list, i11, x(action, z10), str, new GovernmentIdRequestArguments(listX0, aVar.getFieldKeyDocument(), aVar.getFieldKeyIdClass()), 0L, false, 768, null);
            } else {
                submit = new j0.f((i3) CollectionsKt.o0(list), listX0, list, i11, x(action, z10), str, idConfig, vVar);
            }
            waitForAutocapture = submit;
        }
        action.e(waitForAutocapture);
        return Unit.f21506a;
    }

    public static final Unit Z(ln.k.a aVar, final ip.l lVar) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.p2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.a0(lVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit a0(ip.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        j0.WaitForAutocapture waitForAutocapture = objC instanceof j0.WaitForAutocapture ? (j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final void b0(@NotNull ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a context, @NotNull final d2.b output, @NotNull ip.l videoCaptureHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        if ((output instanceof d2.b.d) || (output instanceof d2.b.a) || (output instanceof d2.b.c) || (output instanceof d2.b.C0708b)) {
            videoCaptureHelper.a();
        }
        context.d().a(ln.b0.c(null, new Function1() { // from class: vo.g2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.c0(output, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit c0(d2.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(bVar);
        return Unit.f21506a;
    }

    @NotNull
    public static final GovIdCaptureSide d0(@NotNull IdConfig.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i10 = a.b[eVar.ordinal()];
        if (i10 == 1) {
            return GovIdCaptureSide.Front;
        }
        if (i10 == 2) {
            return GovIdCaptureSide.Back;
        }
        if (i10 == 3) {
            return GovIdCaptureSide.FrontOrBack;
        }
        if (i10 == 4) {
            return GovIdCaptureSide.BarcodePdf417;
        }
        if (i10 == 5) {
            return GovIdCaptureSide.PassportSignature;
        }
        throw new zt.l();
    }

    @NotNull
    public static final n.d e0(@NotNull IdConfig.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i10 = a.b[eVar.ordinal()];
        if (i10 == 1) {
            return n.d.FRONT;
        }
        if (i10 == 2) {
            return n.d.BACK;
        }
        if (i10 == 3) {
            return n.d.FRONT;
        }
        if (i10 != 4 && i10 != 5) {
            throw new zt.l();
        }
        return n.d.BACK;
    }

    @NotNull
    public static final cq.c<Object, Object> f0(@NotNull Object obj, @NotNull Context context, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a renderContext, @NotNull d2.a renderProps, boolean z10, @NotNull fq.n1 permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        fq.n0 n0Var = fq.n0.RecordAudio;
        String microphonePermissionsTitle = renderProps.getStrings().getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle == null) {
            microphonePermissionsTitle = BuildConfig.FLAVOR;
        }
        String str = microphonePermissionsTitle;
        String microphonePermissionsPrompt = renderProps.getStrings().getMicrophonePermissionsPrompt();
        if (microphonePermissionsPrompt == null) {
            microphonePermissionsPrompt = context.getString(jq.g.S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsPrompt, "getString(...)");
        }
        String str2 = microphonePermissionsPrompt;
        String string = context.getString(jq.g.R, xq.g.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return fq.y1.d(obj, renderContext, z10, n0Var, (3592 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getMicrophonePermissionsAllowButtonText(), renderProps.getStrings().getMicrophonePermissionsCancelButtonText(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? BuildConfig.FLAVOR : "video_capture_mic_permission_request", new Function1() { // from class: vo.y2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return b3.g0(renderContext, (fq.n1.Output) obj2);
            }
        });
    }

    public static final ln.r g0(final ln.k.a aVar, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.b0.c(null, new Function1() { // from class: vo.a3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.h0(it, aVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit h0(fq.n1.Output output, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f34489a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.q2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b3.i0((ln.r.c) obj);
                }
            }, 1, null));
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            S(aVar, null);
        }
        return Unit.f21506a;
    }

    public static final Unit i0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Parcelable parcelable = (j0) action.c();
        if (parcelable instanceof b) {
            action.e(((b) parcelable).q(false));
        }
        return Unit.f21506a;
    }

    @NotNull
    public static final cq.c<Object, Object> j0(@NotNull Object obj, @NotNull Context context, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a renderContext, @NotNull d2.a renderProps, boolean z10, @NotNull fq.n1 permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        fq.n0 n0Var = fq.n0.Camera;
        String cameraPermissionsTitle = renderProps.getStrings().getCameraPermissionsTitle();
        if (cameraPermissionsTitle == null) {
            cameraPermissionsTitle = BuildConfig.FLAVOR;
        }
        String str = cameraPermissionsTitle;
        String cameraPermissionsPrompt = renderProps.getStrings().getCameraPermissionsPrompt();
        if (cameraPermissionsPrompt == null) {
            cameraPermissionsPrompt = context.getString(jq.g.f20887q);
            Intrinsics.checkNotNullExpressionValue(cameraPermissionsPrompt, "getString(...)");
        }
        String str2 = cameraPermissionsPrompt;
        String string = context.getString(jq.g.f20886p, xq.g.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return fq.y1.d(obj, renderContext, z10, n0Var, (3592 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getCameraPermissionsAllowButtonText(), renderProps.getStrings().getCameraPermissionsCancelButtonText(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? BuildConfig.FLAVOR : null, new Function1() { // from class: vo.w2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return b3.k0(renderContext, (fq.n1.Output) obj2);
            }
        });
    }

    public static final ln.r k0(final ln.k.a aVar, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.b0.c(null, new Function1() { // from class: vo.h2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.l0(it, aVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit l0(fq.n1.Output output, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f34489a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.s2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b3.m0((ln.r.c) obj);
                }
            }, 1, null));
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            S(aVar, null);
        }
        return Unit.f21506a;
    }

    public static final Unit m0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Parcelable parcelable = (j0) action.c();
        if (parcelable instanceof e) {
            action.e(((e) parcelable).r(false));
        }
        return Unit.f21506a;
    }

    public static final void v(@NotNull ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: vo.r2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.w((ln.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit w(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    @Nullable
    public static final j0 x(@NotNull ln.r<?, j0, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ j0 y(ln.r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return x(cVar, z10);
    }

    @NotNull
    public static final Function1<Throwable, Unit> z(@NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: vo.z2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.B(aVar, z10, (Throwable) obj);
            }
        };
    }
}
