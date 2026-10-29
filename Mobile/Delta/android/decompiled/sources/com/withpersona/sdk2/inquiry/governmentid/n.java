package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import fn.d0;
import fn.h0;
import fn.i0;
import fn.l0;
import fn.m0;
import fn.v;
import fn.v0;
import io.j2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mo.BottomSheetCaptureTipsViewModel;
import mo.StaticCaptureTipsViewModel;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rp.j1;
import uo.x;
import ym.b0;
import ym.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\n\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018\u001aM\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`\u001d*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a1\u0010#\u001a\u0004\u0018\u00010\u0004*\u00140 R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030!2\b\b\u0002\u0010\"\u001a\u00020\u0012H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)\u001a¥\u0001\u00109\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00042&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020\u00122\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u000202012\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b9\u0010:\u001aO\u0010<\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010?\u001a\u00020>*\u00020%H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\u00020A*\u00020%H\u0000¢\u0006\u0004\bB\u0010C\u001a5\u0010H\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001062\u0006\u0010G\u001a\u00020\u0012H\u0000¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bL\u0010K\u001a-\u0010M\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bM\u0010K\u001a\u001f\u0010P\u001a\u0004\u0018\u000106*\u00020D2\b\u0010O\u001a\u0004\u0018\u00010NH\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001d\u0010S\u001a\u0004\u0018\u00010R*\u00020\u00032\u0006\u0010E\u001a\u00020%H\u0000¢\u0006\u0004\bS\u0010T\u001a\u0019\u0010V\u001a\b\u0012\u0004\u0012\u00020U01*\u00020\u0003H\u0000¢\u0006\u0004\bV\u0010W\u001aG\u0010Y\u001a\u00020\t2&\u0010\u000f\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010X\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010Z\"\u001a\u0010]\u001a\u0004\u0018\u00010%*\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "Luo/l;", "videoCaptureHelper", "", "S", "(Lym/k$a;Luo/l;)V", "v", "(Lym/k$a;)V", "Landroid/content/Context;", "context", "renderContext", "renderProps", "", "checkPermissions", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lop/c;", "j0", "(Ljava/lang/Object;Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lop/c;", "f0", "inRecoverableState", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "z", "(Lym/k$a;Z)Lkotlin/jvm/functions/Function1;", "Lym/r$c;", "Lym/r;", "addCurrentState", "x", "(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "currentSide", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "O", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "acceptedId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "countryCode", "W", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "useVideoCapture", "U", "(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "e0", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "side", "selectedId", "isAutoClassification", "P", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "K", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "J", "M", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "R", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Ljava/lang/String;", "Lmo/i;", "L", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "N", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;", "output", "b0", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Luo/l;)V", "Q", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "sideOrNull", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10932a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10932a = iArr;
            int[] iArr2 = new int[IdConfig.b.values().length];
            try {
                iArr2[IdConfig.b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.b.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.b.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.b.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static /* synthetic */ Function1 A(ym.k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return z(aVar, z10);
    }

    public static final Unit B(ym.k.a aVar, final boolean z10, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof fn.h)) {
            aVar.d().a(b0.c(null, new Function1() { // from class: io.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.n.H(cameraError, (ym.r.c) obj);
                }
            }, 1, null));
            return Unit.f22483a;
        }
        fn.h hVar = (fn.h) cameraError;
        if (!(hVar instanceof h0)) {
            if (hVar instanceof i0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: io.p1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.n.I((ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof d0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: io.q1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.n.C((ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof m0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: io.r1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.n.D(z10, (ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof v) {
                aVar.d().a(b0.c(null, new Function1() { // from class: io.s1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.n.E((ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof v0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: io.t1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.n.F((ym.r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(hVar instanceof l0)) {
                    throw new jt.l();
                }
                aVar.d().a(b0.c(null, new Function1() { // from class: io.u1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.n.G(z10, cameraError, (ym.r.c) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit C(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f22483a;
    }

    public static final Unit D(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((GovernmentIdState) action.c()).v();
            action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        } else {
            action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f22483a;
    }

    public static final Unit E(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f22483a;
    }

    public static final Unit F(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f22483a;
    }

    public static final Unit G(boolean z10, Throwable th2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((GovernmentIdState) action.c()).v();
            if (!((l0) th2).getIsClosedDueToBadCameraConfiguration()) {
                action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
            }
        } else {
            action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f22483a;
    }

    public static final Unit H(Throwable th2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f22483a;
    }

    public static final Unit I(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f22483a;
    }

    @NotNull
    public static final String J(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getCaptureScreenDescription().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @NotNull
    public static final String K(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getCaptureScreenTitle().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @Nullable
    public static final mo.i L(@NotNull GovernmentIdWorkflow.Input input, @NotNull IdConfig.b side) {
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
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        if (input.getStaticCaptureTipsEnabled()) {
            return new StaticCaptureTipsViewModel(input.getStrings().getStaticCaptureTipsTitle(), input.getStrings().getStaticCaptureTipsSubtext(), input.getAssetConfig().getCapturePage());
        }
        int i10 = a.b[side.ordinal()];
        if (i10 == 1) {
            String helpButtonText = input.getStrings().getHelpButtonText();
            if (helpButtonText == null || (idFrontHelpModalTitle = input.getStrings().getIdFrontHelpModalTitle()) == null || (idFrontHelpModalPrompt = input.getStrings().getIdFrontHelpModalPrompt()) == null || (idFrontHelpModalHints = input.getStrings().getIdFrontHelpModalHints()) == null || (idFrontHelpModalContinueButtonText = input.getStrings().getIdFrontHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new BottomSheetCaptureTipsViewModel(helpButtonText, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHints, idFrontHelpModalContinueButtonText, side);
        }
        if (i10 == 2) {
            String helpButtonText2 = input.getStrings().getHelpButtonText();
            if (helpButtonText2 == null || (idBackHelpModalTitle = input.getStrings().getIdBackHelpModalTitle()) == null || (idBackHelpModalPrompt = input.getStrings().getIdBackHelpModalPrompt()) == null || (idBackHelpModalHints = input.getStrings().getIdBackHelpModalHints()) == null || (idBackHelpModalContinueButtonText = input.getStrings().getIdBackHelpModalContinueButtonText()) == null) {
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
            throw new jt.l();
        }
        String helpButtonText3 = input.getStrings().getHelpButtonText();
        if (helpButtonText3 == null || (barcodeHelpModalTitle = input.getStrings().getBarcodeHelpModalTitle()) == null || (barcodeHelpModalPrompt = input.getStrings().getBarcodeHelpModalPrompt()) == null || (barcodeHelpModalHints = input.getStrings().getBarcodeHelpModalHints()) == null || (barcodeHelpModalContinueButtonText = input.getStrings().getBarcodeHelpModalContinueButtonText()) == null) {
            return null;
        }
        return new BottomSheetCaptureTipsViewModel(helpButtonText3, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueButtonText, side);
    }

    @NotNull
    public static final String M(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getConfirmCapture().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @NotNull
    public static final List<EnabledIdClass> N(@NotNull GovernmentIdWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        List<IdConfig> listO = input.o();
        ArrayList arrayList = new ArrayList(q.u(listO, 10));
        for (IdConfig idConfig : listO) {
            j2 icon = idConfig.getIcon();
            String idClassKey = input.getStrings().V().get(idConfig.getIdClassKey());
            if (idClassKey == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new EnabledIdClass(icon, idConfig, idClassKey));
        }
        return arrayList;
    }

    @NotNull
    public static final Screen.b.a O(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull IdConfig.b currentSide) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(currentSide, "currentSide");
        if (currentSide == IdConfig.b.PassportSignature) {
            return Screen.b.a.Enabled;
        }
        return (Intrinsics.c(renderProps.getCountryCode(), "US") || currentSide != IdConfig.b.Back) ? Screen.b.a.Hidden : Screen.b.a.Enabled;
    }

    @NotNull
    public static final String P(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        if (z10 && strings.getAutoClassificationCaptureTipText() != null) {
            return strings.getAutoClassificationCaptureTipText();
        }
        String strA = strings.getScanInstructions().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @Nullable
    public static final IdConfig.b Q(@NotNull IdPart idPart) {
        Intrinsics.checkNotNullParameter(idPart, "<this>");
        IdPart.SideIdPart sideIdPart = idPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) idPart : null;
        if (sideIdPart != null) {
            return sideIdPart.getSide();
        }
        return null;
    }

    @Nullable
    public static final String R(@NotNull GovernmentIdWorkflow.Input.Strings strings, @Nullable Hint hint) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        if (Intrinsics.c(hint, HoldStillHint.f10924a)) {
            return strings.getHintHoldStill();
        }
        if (Intrinsics.c(hint, LowLightHint.f10925a)) {
            return strings.getHintLowLight();
        }
        if (hint == null) {
            return null;
        }
        throw new jt.l();
    }

    public static final void S(@NotNull ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, @Nullable final uo.l lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.d().a(b0.c(null, new Function1() { // from class: io.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.T(lVar, (ym.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit T(uo.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.c()).getBackState();
        if (lVar != null) {
            lVar.a();
        }
        if (backState != null) {
            backState.G(true);
            action.e(backState);
        } else if (((GovernmentIdWorkflow.Input) action.b()).getBackStepEnabled()) {
            action.d(GovernmentIdWorkflow.a.C0192a.f10660a);
        } else {
            action.d(GovernmentIdWorkflow.a.b.f10661a);
        }
        return Unit.f22483a;
    }

    public static final void U(@NotNull Context context, @NotNull ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listP = kotlin.collections.p.p(rp.i0.Camera);
        if (z10 && jq.g.f(context)) {
            listP.add(rp.i0.RecordAudio);
        }
        final List<rp.i0> listA = com.withpersona.sdk2.inquiry.permissions.g.a(context, listP);
        if (listA.isEmpty()) {
            return;
        }
        renderContext.d().a(b0.c(null, new Function1() { // from class: io.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.V(listA, (ym.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit V(List list, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.c();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.e(GovernmentIdState.WaitForAutocapture.L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, list.contains(rp.i0.Camera), list.contains(rp.i0.RecordAudio), null, null, null, 29695, null));
        } else {
            ((GovernmentIdState) action.c()).v();
            action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState.getCountryCode(), null, null, 223, null));
        }
        return Unit.f22483a;
    }

    public static final void W(@NotNull final GovernmentIdState renderState, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull final GovernmentIdWorkflow.Input renderProps, @Nullable final GovernmentId governmentId, @NotNull final IdConfig id2, @NotNull final uo.l videoCaptureHelper, @NotNull final CameraProperties cameraProperties, final boolean z10, @NotNull final List<? extends IdPart> parts, final int i10, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        final mn.a aVarE = videoCaptureHelper.e(renderProps);
        renderContext.d().a(b0.c(null, new Function1() { // from class: io.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.Y(renderState, governmentId, i10, parts, renderProps, videoCaptureHelper, id2, z10, str2, aVarE, cameraProperties, str, renderContext, (ym.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit Y(GovernmentIdState governmentIdState, GovernmentId governmentId, int i10, List list, GovernmentIdWorkflow.Input input, final uo.l lVar, IdConfig idConfig, boolean z10, String str, mn.a aVar, CameraProperties cameraProperties, String str2, final ym.k.a aVar2, r.c action) {
        WorkflowState submit;
        WorkflowState waitForAutocapture;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c().getClass() != governmentIdState.getClass()) {
            return Unit.f22483a;
        }
        List<GovernmentId> listX0 = governmentId != null ? CollectionsKt.x0(((GovernmentIdState) action.c()).E(), governmentId) : ((GovernmentIdState) action.c()).E();
        int i11 = i10 == list.size() ? i10 : i10 + 1;
        IdPart idPart = (IdPart) CollectionsKt.f0(list, i11);
        if (idPart instanceof IdPart.SideIdPart) {
            if (!input.u() || lVar.d()) {
                IdPart.SideIdPart sideIdPart = (IdPart.SideIdPart) idPart;
                waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, listX0, new CaptureConfig.IdCaptureConfig(idConfig), O((GovernmentIdWorkflow.Input) action.b(), sideIdPart.getSide()), list, i11, x(action, z10), lVar.d() ? x.Connected : x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str, null, new Function0() { // from class: io.d2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.withpersona.sdk2.inquiry.governmentid.n.Z(aVar2, lVar);
                    }
                }, 11776, null);
            } else {
                waitForAutocapture = new GovernmentIdState.ChooseCaptureMethod((IdPart.SideIdPart) idPart, listX0, list, i11, str, new CaptureConfig.IdCaptureConfig(idConfig), false, x(action, z10), null, 320, null);
            }
        } else {
            if (idPart != null) {
                throw new jt.l();
            }
            if (aVar != mn.a.Stream || (action.c() instanceof GovernmentIdState.FinalizeWebRtc) || (action.c() instanceof GovernmentIdState.ReviewSelectedImage)) {
                submit = (aVar != mn.a.Upload || (action.c() instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (action.c() instanceof GovernmentIdState.ReviewSelectedImage)) ? new GovernmentIdState.Submit(idConfig, listX0, null, list, i11, x(action, z10), str, new GovernmentIdRequestArguments(listX0, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), str2, cameraProperties, false, 1028, null) : new GovernmentIdState.FinalizeLocalVideoCapture(idConfig, listX0, (IdPart) CollectionsKt.o0(list), list, i11, x(action, z10), str, new GovernmentIdRequestArguments(listX0, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), 0L, false, 768, null);
            } else {
                submit = new GovernmentIdState.FinalizeWebRtc((IdPart) CollectionsKt.o0(list), listX0, list, i11, x(action, z10), str, idConfig, cameraProperties);
            }
            waitForAutocapture = submit;
        }
        action.e(waitForAutocapture);
        return Unit.f22483a;
    }

    public static final Unit Z(ym.k.a aVar, final uo.l lVar) {
        aVar.d().a(b0.c(null, new Function1() { // from class: io.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.a0(lVar, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit a0(uo.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? x.Connected : x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22483a;
    }

    public static final void b0(@NotNull ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final GovernmentIdWorkflow.a output, @NotNull uo.l videoCaptureHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        if ((output instanceof GovernmentIdWorkflow.a.d) || (output instanceof GovernmentIdWorkflow.a.C0192a) || (output instanceof GovernmentIdWorkflow.a.c) || (output instanceof GovernmentIdWorkflow.a.b)) {
            videoCaptureHelper.a();
        }
        context.d().a(b0.c(null, new Function1() { // from class: io.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.c0(output, (ym.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit c0(GovernmentIdWorkflow.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(aVar);
        return Unit.f22483a;
    }

    @NotNull
    public static final GovIdCaptureSide d0(@NotNull IdConfig.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i10 = a.b[bVar.ordinal()];
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
        throw new jt.l();
    }

    @NotNull
    public static final GovernmentId.b e0(@NotNull IdConfig.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i10 = a.b[bVar.ordinal()];
        if (i10 == 1) {
            return GovernmentId.b.FRONT;
        }
        if (i10 == 2) {
            return GovernmentId.b.BACK;
        }
        if (i10 == 3) {
            return GovernmentId.b.FRONT;
        }
        if (i10 != 4 && i10 != 5) {
            throw new jt.l();
        }
        return GovernmentId.b.BACK;
    }

    @NotNull
    public static final op.c<Object, Object> f0(@NotNull Object obj, @NotNull Context context, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        rp.i0 i0Var = rp.i0.RecordAudio;
        String microphonePermissionsTitle = renderProps.getStrings().getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle == null) {
            microphonePermissionsTitle = "";
        }
        String str = microphonePermissionsTitle;
        String microphonePermissionsPrompt = renderProps.getStrings().getMicrophonePermissionsPrompt();
        if (microphonePermissionsPrompt == null) {
            microphonePermissionsPrompt = context.getString(vp.g.S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsPrompt, "getString(...)");
        }
        String str2 = microphonePermissionsPrompt;
        String string = context.getString(vp.g.R, jq.g.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return com.withpersona.sdk2.inquiry.permissions.g.d(obj, renderContext, z10, i0Var, (3592 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getMicrophonePermissionsAllowButtonText(), renderProps.getStrings().getMicrophonePermissionsCancelButtonText(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: io.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.n.g0(renderContext, (PermissionRequestWorkflow.Output) obj2);
            }
        });
    }

    public static final r g0(final ym.k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return b0.c(null, new Function1() { // from class: io.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.h0(it, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit h0(PermissionRequestWorkflow.Output output, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f10932a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            aVar.d().a(b0.c(null, new Function1() { // from class: io.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.n.i0((ym.r.c) obj);
                }
            }, 1, null));
        } else {
            if (i10 != 3) {
                throw new jt.l();
            }
            S(aVar, null);
        }
        return Unit.f22483a;
    }

    public static final Unit i0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WorkflowState workflowState = (GovernmentIdState) action.c();
        if (workflowState instanceof io.a) {
            action.e(((io.a) workflowState).q(false));
        }
        return Unit.f22483a;
    }

    @NotNull
    public static final op.c<Object, Object> j0(@NotNull Object obj, @NotNull Context context, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        rp.i0 i0Var = rp.i0.Camera;
        String cameraPermissionsTitle = renderProps.getStrings().getCameraPermissionsTitle();
        if (cameraPermissionsTitle == null) {
            cameraPermissionsTitle = "";
        }
        String str = cameraPermissionsTitle;
        String cameraPermissionsPrompt = renderProps.getStrings().getCameraPermissionsPrompt();
        if (cameraPermissionsPrompt == null) {
            cameraPermissionsPrompt = context.getString(vp.g.f33402q);
            Intrinsics.checkNotNullExpressionValue(cameraPermissionsPrompt, "getString(...)");
        }
        String str2 = cameraPermissionsPrompt;
        String string = context.getString(vp.g.f33401p, jq.g.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return com.withpersona.sdk2.inquiry.permissions.g.d(obj, renderContext, z10, i0Var, (3592 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getCameraPermissionsAllowButtonText(), renderProps.getStrings().getCameraPermissionsCancelButtonText(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : null, new Function1() { // from class: io.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.n.k0(renderContext, (PermissionRequestWorkflow.Output) obj2);
            }
        });
    }

    public static final r k0(final ym.k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return b0.c(null, new Function1() { // from class: io.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.l0(it, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit l0(PermissionRequestWorkflow.Output output, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f10932a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            aVar.d().a(b0.c(null, new Function1() { // from class: io.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.n.m0((ym.r.c) obj);
                }
            }, 1, null));
        } else {
            if (i10 != 3) {
                throw new jt.l();
            }
            S(aVar, null);
        }
        return Unit.f22483a;
    }

    public static final Unit m0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WorkflowState workflowState = (GovernmentIdState) action.c();
        if (workflowState instanceof io.c) {
            action.e(((io.c) workflowState).r(false));
        }
        return Unit.f22483a;
    }

    public static final void v(@NotNull ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.d().a(b0.c(null, new Function1() { // from class: io.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.w((ym.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit w(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    @Nullable
    public static final GovernmentIdState x(@NotNull r<?, GovernmentIdState, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ GovernmentIdState y(r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return x(cVar, z10);
    }

    @NotNull
    public static final Function1<Throwable, Unit> z(@NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: io.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.n.B(aVar, z10, (Throwable) obj);
            }
        };
    }
}
