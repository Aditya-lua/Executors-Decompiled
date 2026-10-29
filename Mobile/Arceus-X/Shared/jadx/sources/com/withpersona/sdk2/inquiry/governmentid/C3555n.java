package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import io.EnumC6879j2;
import io.InterfaceC6840a;
import io.InterfaceC6848c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import mo.BottomSheetCaptureTipsViewModel;
import mo.InterfaceC8607i;
import mo.StaticCaptureTipsViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AbstractC5685h;
import p132fn.C5678d0;
import p132fn.C5686h0;
import p132fn.C5688i0;
import p132fn.C5694l0;
import p132fn.C5696m0;
import p132fn.C5713v;
import p132fn.C5714v0;
import p226jq.C7259g;
import p229jt.C7345l;
import p340op.C9837c;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p473uo.C11905l;
import p473uo.EnumC11917x;
import p497vp.C12244g;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\n\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018\u001aM\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`\u001d*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a1\u0010#\u001a\u0004\u0018\u00010\u0004*\u00140 R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030!2\b\b\u0002\u0010\"\u001a\u00020\u0012H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)\u001a¥\u0001\u00109\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00042&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020\u00122\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u000202012\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b9\u0010:\u001aO\u0010<\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010?\u001a\u00020>*\u00020%H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\u00020A*\u00020%H\u0000¢\u0006\u0004\bB\u0010C\u001a5\u0010H\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001062\u0006\u0010G\u001a\u00020\u0012H\u0000¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bL\u0010K\u001a-\u0010M\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bM\u0010K\u001a\u001f\u0010P\u001a\u0004\u0018\u000106*\u00020D2\b\u0010O\u001a\u0004\u0018\u00010NH\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001d\u0010S\u001a\u0004\u0018\u00010R*\u00020\u00032\u0006\u0010E\u001a\u00020%H\u0000¢\u0006\u0004\bS\u0010T\u001a\u0019\u0010V\u001a\b\u0012\u0004\u0012\u00020U01*\u00020\u0003H\u0000¢\u0006\u0004\bV\u0010W\u001aG\u0010Y\u001a\u00020\t2&\u0010\u000f\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010X\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010Z\"\u001a\u0010]\u001a\u0004\u0018\u00010%*\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, m31665d2 = {"Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "Luo/l;", "videoCaptureHelper", "", "S", "(Lym/k$a;Luo/l;)V", "v", "(Lym/k$a;)V", "Landroid/content/Context;", "context", "renderContext", "renderProps", "", "checkPermissions", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lop/c;", "j0", "(Ljava/lang/Object;Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lop/c;", "f0", "inRecoverableState", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "z", "(Lym/k$a;Z)Lkotlin/jvm/functions/Function1;", "Lym/r$c;", "Lym/r;", "addCurrentState", "x", "(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "currentSide", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "O", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "acceptedId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "countryCode", "W", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "useVideoCapture", "U", "(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "e0", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "side", "selectedId", "isAutoClassification", "P", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "K", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "J", "M", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "R", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Ljava/lang/String;", "Lmo/i;", "L", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "N", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;", "output", "b0", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Luo/l;)V", "Q", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "sideOrNull", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3555n {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.n$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14117a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f14118b;

        static {
            int[] iArr = new int[EnumC11028j1.values().length];
            try {
                iArr[EnumC11028j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11028j1.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11028j1.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14117a = iArr;
            int[] iArr2 = new int[IdConfig.EnumC3514b.values().length];
            try {
                iArr2[IdConfig.EnumC3514b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.EnumC3514b.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f14118b = iArr2;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Function1 m17595A(AbstractC13218k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m17659z(aVar, z10);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m17596B(AbstractC13218k.a aVar, final boolean z10, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof AbstractC5685h)) {
            aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3555n.m17602H(cameraError, (AbstractC13225r.c) obj);
                }
            }, 1, null));
            return Unit.f29331a;
        }
        AbstractC5685h abstractC5685h = (AbstractC5685h) cameraError;
        if (!(abstractC5685h instanceof C5686h0)) {
            if (abstractC5685h instanceof C5688i0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.p1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3555n.m17603I((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5678d0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.q1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3555n.m17597C((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5696m0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.r1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3555n.m17598D(z10, (AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5713v) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.s1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3555n.m17599E((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5714v0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.t1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3555n.m17600F((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(abstractC5685h instanceof C5694l0)) {
                    throw new C7345l();
                }
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.u1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3555n.m17601G(z10, cameraError, (AbstractC13225r.c) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m17597C(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m17598D(boolean z10, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((GovernmentIdState) action.m48901c()).mo16959v();
            action.m48903e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.m48901c()).getCountryCode(), null, null, 223, null));
        } else {
            action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m17599E(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m17600F(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m17601G(boolean z10, Throwable th2, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((GovernmentIdState) action.m48901c()).mo16959v();
            if (!((C5694l0) th2).getIsClosedDueToBadCameraConfiguration()) {
                action.m48903e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.m48901c()).getCountryCode(), null, null, 223, null));
            }
        } else {
            action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m17602H(Throwable th2, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m17603I(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public static final String m17604J(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strM17307a = strings.getCaptureScreenDescription().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public static final String m17605K(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strM17307a = strings.getCaptureScreenTitle().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public static final InterfaceC8607i m17606L(@NotNull GovernmentIdWorkflow.Input input, @NotNull IdConfig.EnumC3514b side) {
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
        int i10 = a.f14118b[side.ordinal()];
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
            throw new C7345l();
        }
        String helpButtonText3 = input.getStrings().getHelpButtonText();
        if (helpButtonText3 == null || (barcodeHelpModalTitle = input.getStrings().getBarcodeHelpModalTitle()) == null || (barcodeHelpModalPrompt = input.getStrings().getBarcodeHelpModalPrompt()) == null || (barcodeHelpModalHints = input.getStrings().getBarcodeHelpModalHints()) == null || (barcodeHelpModalContinueButtonText = input.getStrings().getBarcodeHelpModalContinueButtonText()) == null) {
            return null;
        }
        return new BottomSheetCaptureTipsViewModel(helpButtonText3, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueButtonText, side);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public static final String m17607M(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strM17307a = strings.getConfirmCapture().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public static final List<EnabledIdClass> m17608N(@NotNull GovernmentIdWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        List<IdConfig> listM17184o = input.m17184o();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM17184o, 10));
        for (IdConfig idConfig : listM17184o) {
            EnumC6879j2 icon = idConfig.getIcon();
            String idClassKey = input.getStrings().m17220V().get(idConfig.getIdClassKey());
            if (idClassKey == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new EnabledIdClass(icon, idConfig, idClassKey));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public static final Screen.C3527b.a m17609O(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull IdConfig.EnumC3514b currentSide) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(currentSide, "currentSide");
        if (currentSide == IdConfig.EnumC3514b.PassportSignature) {
            return Screen.C3527b.a.Enabled;
        }
        return (Intrinsics.m31980c(renderProps.getCountryCode(), "US") || currentSide != IdConfig.EnumC3514b.Back) ? Screen.C3527b.a.Hidden : Screen.C3527b.a.Enabled;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public static final String m17610P(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        if (z10 && strings.getAutoClassificationCaptureTipText() != null) {
            return strings.getAutoClassificationCaptureTipText();
        }
        String strM17307a = strings.getScanInstructions().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public static final IdConfig.EnumC3514b m17611Q(@NotNull IdPart idPart) {
        Intrinsics.checkNotNullParameter(idPart, "<this>");
        IdPart.SideIdPart sideIdPart = idPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) idPart : null;
        if (sideIdPart != null) {
            return sideIdPart.getSide();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: R */
    public static final String m17612R(@NotNull GovernmentIdWorkflow.Input.Strings strings, @Nullable Hint hint) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        if (Intrinsics.m31980c(hint, HoldStillHint.f14108a)) {
            return strings.getHintHoldStill();
        }
        if (Intrinsics.m31980c(hint, LowLightHint.f14109a)) {
            return strings.getHintLowLight();
        }
        if (hint == null) {
            return null;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: S */
    public static final void m17613S(@NotNull AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a aVar, @Nullable final C11905l c11905l) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17614T(c11905l, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m17614T(C11905l c11905l, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.m48901c()).getBackState();
        if (c11905l != null) {
            c11905l.m44494a();
        }
        if (backState != null) {
            backState.m16957G(true);
            action.m48903e(backState);
        } else if (((GovernmentIdWorkflow.Input) action.m48900b()).getBackStepEnabled()) {
            action.m48902d(GovernmentIdWorkflow.AbstractC3503a.a.f13790a);
        } else {
            action.m48902d(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final void m17615U(@NotNull Context context, @NotNull AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listM31897p = C7699p.m31897p(EnumC11024i0.Camera);
        if (z10 && C7259g.m30272f(context)) {
            listM31897p.add(EnumC11024i0.RecordAudio);
        }
        final List<EnumC11024i0> listM19163a = C3858g.m19163a(context, listM31897p);
        if (listM19163a.isEmpty()) {
            return;
        }
        renderContext.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17616V(listM19163a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m17616V(List list, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.m48901c();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, list.contains(EnumC11024i0.Camera), list.contains(EnumC11024i0.RecordAudio), null, null, null, 29695, null));
        } else {
            ((GovernmentIdState) action.m48901c()).mo16959v();
            action.m48903e(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState.getCountryCode(), null, null, 223, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final void m17617W(@NotNull final GovernmentIdState renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a renderContext, @NotNull final GovernmentIdWorkflow.Input renderProps, @Nullable final GovernmentId governmentId, @NotNull final IdConfig id2, @NotNull final C11905l videoCaptureHelper, @NotNull final CameraProperties cameraProperties, final boolean z10, @NotNull final List<? extends IdPart> parts, final int i10, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        final EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps);
        renderContext.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17619Y(renderState, governmentId, i10, parts, renderProps, videoCaptureHelper, id2, z10, str2, enumC8598aM44498e, cameraProperties, str, renderContext, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m17619Y(GovernmentIdState governmentIdState, GovernmentId governmentId, int i10, List list, GovernmentIdWorkflow.Input input, final C11905l c11905l, IdConfig idConfig, boolean z10, String str, EnumC8598a enumC8598a, CameraProperties cameraProperties, String str2, final AbstractC13218k.a aVar, AbstractC13225r.c action) {
        WorkflowState submit;
        WorkflowState waitForAutocapture;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.m48901c().getClass() != governmentIdState.getClass()) {
            return Unit.f29331a;
        }
        List<GovernmentId> listX0 = governmentId != null ? CollectionsKt.m31726x0(((GovernmentIdState) action.m48901c()).mo16956E(), governmentId) : ((GovernmentIdState) action.m48901c()).mo16956E();
        int i11 = i10 == list.size() ? i10 : i10 + 1;
        IdPart idPart = (IdPart) CollectionsKt.m31708f0(list, i11);
        if (idPart instanceof IdPart.SideIdPart) {
            if (!input.m17190u() || c11905l.m44497d()) {
                IdPart.SideIdPart sideIdPart = (IdPart.SideIdPart) idPart;
                waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, listX0, new CaptureConfig.IdCaptureConfig(idConfig), m17609O((GovernmentIdWorkflow.Input) action.m48900b(), sideIdPart.getSide()), list, i11, m17657x(action, z10), c11905l.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str, null, new Function0() { // from class: io.d2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C3555n.m17620Z(aVar, c11905l);
                    }
                }, 11776, null);
            } else {
                waitForAutocapture = new GovernmentIdState.ChooseCaptureMethod((IdPart.SideIdPart) idPart, listX0, list, i11, str, new CaptureConfig.IdCaptureConfig(idConfig), false, m17657x(action, z10), null, 320, null);
            }
        } else {
            if (idPart != null) {
                throw new C7345l();
            }
            if (enumC8598a != EnumC8598a.Stream || (action.m48901c() instanceof GovernmentIdState.FinalizeWebRtc) || (action.m48901c() instanceof GovernmentIdState.ReviewSelectedImage)) {
                submit = (enumC8598a != EnumC8598a.Upload || (action.m48901c() instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (action.m48901c() instanceof GovernmentIdState.ReviewSelectedImage)) ? new GovernmentIdState.Submit(idConfig, listX0, null, list, i11, m17657x(action, z10), str, new GovernmentIdRequestArguments(listX0, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), str2, cameraProperties, false, 1028, null) : new GovernmentIdState.FinalizeLocalVideoCapture(idConfig, listX0, (IdPart) CollectionsKt.m31717o0(list), list, i11, m17657x(action, z10), str, new GovernmentIdRequestArguments(listX0, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), 0L, false, 768, null);
            } else {
                submit = new GovernmentIdState.FinalizeWebRtc((IdPart) CollectionsKt.m31717o0(list), listX0, list, i11, m17657x(action, z10), str, idConfig, cameraProperties);
            }
            waitForAutocapture = submit;
        }
        action.m48903e(waitForAutocapture);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m17620Z(AbstractC13218k.a aVar, final C11905l c11905l) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17622a0(c11905l, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m17622a0(C11905l c11905l, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture != null) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c11905l.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m17624b0(@NotNull AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final GovernmentIdWorkflow.AbstractC3503a output, @NotNull C11905l videoCaptureHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        if ((output instanceof GovernmentIdWorkflow.AbstractC3503a.d) || (output instanceof GovernmentIdWorkflow.AbstractC3503a.a) || (output instanceof GovernmentIdWorkflow.AbstractC3503a.c) || (output instanceof GovernmentIdWorkflow.AbstractC3503a.b)) {
            videoCaptureHelper.m44494a();
        }
        context.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17626c0(output, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m17626c0(GovernmentIdWorkflow.AbstractC3503a abstractC3503a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(abstractC3503a);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public static final GovIdCaptureSide m17628d0(@NotNull IdConfig.EnumC3514b enumC3514b) {
        Intrinsics.checkNotNullParameter(enumC3514b, "<this>");
        int i10 = a.f14118b[enumC3514b.ordinal()];
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
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public static final GovernmentId.EnumC3486b m17630e0(@NotNull IdConfig.EnumC3514b enumC3514b) {
        Intrinsics.checkNotNullParameter(enumC3514b, "<this>");
        int i10 = a.f14118b[enumC3514b.ordinal()];
        if (i10 == 1) {
            return GovernmentId.EnumC3486b.FRONT;
        }
        if (i10 == 2) {
            return GovernmentId.EnumC3486b.BACK;
        }
        if (i10 == 3) {
            return GovernmentId.EnumC3486b.FRONT;
        }
        if (i10 != 4 && i10 != 5) {
            throw new C7345l();
        }
        return GovernmentId.EnumC3486b.BACK;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public static final C9837c<Object, Object> m17632f0(@NotNull Object obj, @NotNull Context context, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        EnumC11024i0 enumC11024i0 = EnumC11024i0.RecordAudio;
        String microphonePermissionsTitle = renderProps.getStrings().getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle == null) {
            microphonePermissionsTitle = "";
        }
        String str = microphonePermissionsTitle;
        String microphonePermissionsPrompt = renderProps.getStrings().getMicrophonePermissionsPrompt();
        if (microphonePermissionsPrompt == null) {
            microphonePermissionsPrompt = context.getString(C12244g.f43234S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsPrompt, "getString(...)");
        }
        String str2 = microphonePermissionsPrompt;
        String string = context.getString(C12244g.f43233R, C7259g.m30268b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return C3858g.m19166d(obj, renderContext, z10, enumC11024i0, (3592 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getMicrophonePermissionsAllowButtonText(), renderProps.getStrings().getMicrophonePermissionsCancelButtonText(), (3592 & 512) != 0 ? null : null, (3592 & 1024) != 0 ? null : null, (3592 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: io.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C3555n.m17634g0(renderContext, (PermissionRequestWorkflow.Output) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static final AbstractC13225r m17634g0(final AbstractC13218k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13208b0.m48847c(null, new Function1() { // from class: io.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17636h0(it, aVar, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m17636h0(PermissionRequestWorkflow.Output output, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f14117a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3555n.m17638i0((AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            m17613S(aVar, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m17638i0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WorkflowState workflowState = (GovernmentIdState) action.m48901c();
        if (workflowState instanceof InterfaceC6840a) {
            action.m48903e(((InterfaceC6840a) workflowState).mo17062q(false));
        }
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public static final C9837c<Object, Object> m17640j0(@NotNull Object obj, @NotNull Context context, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        EnumC11024i0 enumC11024i0 = EnumC11024i0.Camera;
        String cameraPermissionsTitle = renderProps.getStrings().getCameraPermissionsTitle();
        if (cameraPermissionsTitle == null) {
            cameraPermissionsTitle = "";
        }
        String str = cameraPermissionsTitle;
        String cameraPermissionsPrompt = renderProps.getStrings().getCameraPermissionsPrompt();
        if (cameraPermissionsPrompt == null) {
            cameraPermissionsPrompt = context.getString(C12244g.f43261q);
            Intrinsics.checkNotNullExpressionValue(cameraPermissionsPrompt, "getString(...)");
        }
        String str2 = cameraPermissionsPrompt;
        String string = context.getString(C12244g.f43260p, C7259g.m30268b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return C3858g.m19166d(obj, renderContext, z10, enumC11024i0, (3592 & 8) != 0 ? false : false, str, str2, string, renderProps.getStrings().getCameraPermissionsAllowButtonText(), renderProps.getStrings().getCameraPermissionsCancelButtonText(), (3592 & 512) != 0 ? null : null, (3592 & 1024) != 0 ? null : null, (3592 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? "" : null, new Function1() { // from class: io.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C3555n.m17642k0(renderContext, (PermissionRequestWorkflow.Output) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final AbstractC13225r m17642k0(final AbstractC13218k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13208b0.m48847c(null, new Function1() { // from class: io.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17644l0(it, aVar, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m17644l0(PermissionRequestWorkflow.Output output, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f14117a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3555n.m17646m0((AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            m17613S(aVar, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m17646m0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WorkflowState workflowState = (GovernmentIdState) action.m48901c();
        if (workflowState instanceof InterfaceC6848c) {
            action.m48903e(((InterfaceC6848c) workflowState).mo17063r(false));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m17655v(@NotNull AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: io.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17656w((AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m17656w(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static final GovernmentIdState m17657x(@NotNull AbstractC13225r<?, GovernmentIdState, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.m48901c() : cVar.m48901c().getBackState();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ GovernmentIdState m17658y(AbstractC13225r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m17657x(cVar, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final Function1<Throwable, Unit> m17659z(@NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: io.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3555n.m17596B(aVar, z10, (Throwable) obj);
            }
        };
    }
}
