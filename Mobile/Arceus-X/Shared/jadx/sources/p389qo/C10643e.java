package p389qo;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import io.EnumC6844b;
import io.EnumC6852d;
import io.EnumC6879j2;
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
import p419rp.EnumC11024i0;
import p473uo.C11905l;
import p473uo.EnumC11917x;
import p499vr.C12255f;

/* JADX INFO: renamed from: qo.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001aO\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001aM\u0010%\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b%\u0010&\u001a\u008b\u0001\u00105\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001d2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\b5\u00106\u001aG\u0010:\u001a\u0012\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0006j\u0002`9*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u00107\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b:\u0010;\u001a5\u0010?\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\fH\u0000¢\u0006\u0004\b?\u0010@\u001a-\u0010E\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bG\u0010F\u001a-\u0010H\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bH\u0010F\u001a-\u0010I\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bI\u0010F\u001a\u001b\u0010J\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010L\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bL\u0010K\u001a\u0019\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u001d*\u00020\u0002H\u0000¢\u0006\u0004\bN\u0010O¨\u0006P"}, m31665d2 = {"Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "Luo/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "p", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)V", "", "addCurrentState", "e", "(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "renderState", "context", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "u", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "v", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lkotlin/jvm/functions/Function1;)V", "state", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "Lio/b;", "errorType", "backState", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lio/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "acceptedId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "countryCode", "r", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "inRecoverableState", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "f", "(Lvr/f;ZLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "renderContext", "useVideoCapture", "q", "(Landroid/content/Context;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "selectedId", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "l", "k", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10643e {
    /* JADX INFO: renamed from: d */
    public static final GovernmentIdState m40733d(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, List<Frame> list, List<IdConfigForCountry> list2, EnumC6844b enumC6844b, GovernmentIdState governmentIdState) {
        String countryCode;
        String str;
        if (input.getDesignVersion() != EnumC6852d.K0000) {
            return new GovernmentIdState.AutoClassificationError(reviewImageState.getCurrentPart(), reviewImageState.mo16956E(), reviewImageState.mo16955D(), reviewImageState.getPartIndex(), governmentIdState, reviewImageState.getCountryCode(), list, reviewImageState.getCameraProperties(), list2, null, null, enumC6844b, 1536, null);
        }
        if (list2.size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.m31706d0(list2);
            String idClassKey = idConfigForCountry.m17301g().size() == 1 ? ((IdConfig) CollectionsKt.m31706d0(idConfigForCountry.m17301g())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        return new GovernmentIdState.AutoClassificationManualSelect(reviewImageState.getCurrentPart(), reviewImageState.mo16956E(), reviewImageState.mo16955D(), reviewImageState.getPartIndex(), governmentIdState, reviewImageState.getCountryCode(), list, new CameraProperties(null, null, null, 0, 0, 31, null), list2, countryCode, str);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final GovernmentIdState m40734e(@NotNull C12255f<GovernmentIdState> c12255f, boolean z10) {
        Intrinsics.checkNotNullParameter(c12255f, "<this>");
        if (z10) {
            return (GovernmentIdState) c12255f.m45411i();
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) c12255f.m45411i();
        if (governmentIdState != null) {
            return governmentIdState.getBackState();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Function1<Throwable, Unit> m40735f(@NotNull final C12255f<GovernmentIdState> c12255f, final boolean z10, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(c12255f, "<this>");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        return new Function1() { // from class: qo.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10643e.m40737h(onOutput, z10, c12255f, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Function1 m40736g(C12255f c12255f, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m40735f(c12255f, z10, function1);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m40737h(Function1 function1, boolean z10, C12255f c12255f, Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof AbstractC5685h)) {
            function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + cameraError.getClass().getCanonicalName())));
            return Unit.f29331a;
        }
        AbstractC5685h abstractC5685h = (AbstractC5685h) cameraError;
        if (!(abstractC5685h instanceof C5686h0)) {
            if (abstractC5685h instanceof C5688i0) {
                function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            } else if (abstractC5685h instanceof C5678d0) {
                function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
            } else {
                if (abstractC5685h instanceof C5696m0) {
                    if (z10) {
                        GovernmentIdState governmentIdState = (GovernmentIdState) c12255f.m45411i();
                        if (governmentIdState != null) {
                            governmentIdState.mo16959v();
                        }
                        GovernmentIdState governmentIdState2 = (GovernmentIdState) c12255f.m45411i();
                        c12255f.m45417p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState2 != null ? governmentIdState2.getCountryCode() : null, null, null, 223, null));
                    } else {
                        function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
                    }
                } else if (abstractC5685h instanceof C5694l0) {
                    if (z10) {
                        GovernmentIdState governmentIdState3 = (GovernmentIdState) c12255f.m45411i();
                        if (governmentIdState3 != null) {
                            governmentIdState3.mo16959v();
                        }
                        if (!((C5694l0) cameraError).getIsClosedDueToBadCameraConfiguration()) {
                            GovernmentIdState governmentIdState4 = (GovernmentIdState) c12255f.m45411i();
                            c12255f.m45417p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState4 != null ? governmentIdState4.getCountryCode() : null, null, null, 223, null));
                        }
                    } else {
                        function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
                    }
                } else if (abstractC5685h instanceof C5713v) {
                    function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
                } else {
                    if (!(abstractC5685h instanceof C5714v0)) {
                        throw new C7345l();
                    }
                    function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
                }
            }
        }
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m40738i(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strM17307a = strings.getChooseCaptureMethodBody().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m40739j(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strM17307a = strings.getChooseCaptureMethodTitle().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m40740k(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strM17307a = strings.getConfirmCapture().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m40741l(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strM17307a = strings.getConfirmCaptureTitle().m17307a(str, selectedId, side);
        return strM17307a == null ? "" : strM17307a;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final List<EnabledIdClass> m40742m(@NotNull GovernmentIdWorkflow.Input input) {
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
    /* JADX INFO: renamed from: n */
    public static final String m40743n(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        String str = strings.m17258x0().get(side);
        return str == null ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m40744o(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.EnumC3514b side) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        String str = strings.m17199C0().get(side);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: p */
    public static final void m40745p(@NotNull C12255f<GovernmentIdState> c12255f, @NotNull GovernmentIdWorkflow.Input props, @Nullable C11905l c11905l, @NotNull Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(c12255f, "<this>");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        GovernmentIdState governmentIdState = (GovernmentIdState) c12255f.m45411i();
        GovernmentIdState backState = governmentIdState != null ? governmentIdState.getBackState() : null;
        if (c11905l != null) {
            c11905l.m44494a();
        }
        if (backState != null) {
            backState.m16957G(true);
            c12255f.m45417p(backState);
        } else if (props.getBackStepEnabled()) {
            onOutput.invoke(GovernmentIdWorkflow.AbstractC3503a.a.f13790a);
        } else {
            onOutput.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m40746q(@NotNull Context context, @NotNull C12255f<GovernmentIdState> renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        EnumC11024i0 enumC11024i0 = EnumC11024i0.Camera;
        List listM31897p = C7699p.m31897p(enumC11024i0);
        if (z10 && C7259g.m30272f(context)) {
            listM31897p.add(EnumC11024i0.RecordAudio);
        }
        List<EnumC11024i0> listM19163a = C3858g.m19163a(context, listM31897p);
        if (listM19163a.isEmpty()) {
            return;
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) renderContext.m45411i();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            renderContext.m45417p(GovernmentIdState.WaitForAutocapture.m17050L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, listM19163a.contains(enumC11024i0), listM19163a.contains(EnumC11024i0.RecordAudio), null, null, null, 29695, null));
        } else if (governmentIdState != null) {
            governmentIdState.mo16959v();
            renderContext.m45417p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState.getCountryCode(), null, null, 223, null));
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m40747r(@NotNull GovernmentIdState renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull GovernmentIdWorkflow.Input renderProps, @Nullable GovernmentId governmentId, @NotNull IdConfig id2, @NotNull final C11905l videoCaptureHelper, @NotNull CameraProperties cameraProperties, boolean z10, @NotNull List<? extends IdPart> parts, int i10, @Nullable String str, @Nullable String str2) {
        WorkflowState submit;
        int i11 = i10;
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps);
        GovernmentIdState governmentIdState = (GovernmentIdState) workflowContext.m45411i();
        if (governmentIdState != null && governmentIdState.getClass() == renderState.getClass()) {
            List<GovernmentId> listX0 = governmentId != null ? CollectionsKt.m31726x0(governmentIdState.mo16956E(), governmentId) : governmentIdState.mo16956E();
            if (i11 != parts.size()) {
                i11++;
            }
            IdPart idPart = (IdPart) CollectionsKt.m31708f0(parts, i11);
            if (!(idPart instanceof IdPart.SideIdPart)) {
                List<GovernmentId> list = listX0;
                int i12 = i11;
                if (idPart != null) {
                    throw new C7345l();
                }
                if (enumC8598aM44498e != EnumC8598a.Stream || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage)) {
                    submit = (enumC8598aM44498e != EnumC8598a.Upload || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage)) ? new GovernmentIdState.Submit(id2, list, null, parts, i12, m40734e(workflowContext, z10), str2, new GovernmentIdRequestArguments(list, renderProps.getFieldKeyDocument(), renderProps.getFieldKeyIdClass()), str, cameraProperties, false, 1028, null) : new GovernmentIdState.FinalizeLocalVideoCapture(id2, list, (IdPart) CollectionsKt.m31717o0(parts), parts, i12, m40734e(workflowContext, z10), str2, new GovernmentIdRequestArguments(list, renderProps.getFieldKeyDocument(), renderProps.getFieldKeyIdClass()), 0L, false, 768, null);
                } else {
                    submit = new GovernmentIdState.FinalizeWebRtc((IdPart) CollectionsKt.m31717o0(parts), list, parts, i12, m40734e(workflowContext, z10), str2, id2, cameraProperties);
                }
            } else if (!renderProps.m17190u() || videoCaptureHelper.m44496c(renderProps)) {
                int i13 = i11;
                IdPart.SideIdPart sideIdPart = (IdPart.SideIdPart) idPart;
                submit = new GovernmentIdState.WaitForAutocapture(sideIdPart, listX0, new CaptureConfig.IdCaptureConfig(id2), C3555n.m17609O(renderProps, sideIdPart.getSide()), parts, i13, m40734e(workflowContext, z10), videoCaptureHelper.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str2, null, new Function0() { // from class: qo.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C10643e.m40749t(workflowContext, videoCaptureHelper);
                    }
                }, 11776, null);
            } else {
                submit = new GovernmentIdState.ChooseCaptureMethod((IdPart.SideIdPart) idPart, listX0, parts, i11, str2, new CaptureConfig.IdCaptureConfig(id2), false, m40734e(workflowContext, z10), null, 320, null);
            }
            workflowContext.m45417p(submit);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m40748s(GovernmentIdState governmentIdState, C12255f c12255f, GovernmentIdWorkflow.Input input, GovernmentId governmentId, IdConfig idConfig, C11905l c11905l, CameraProperties cameraProperties, boolean z10, List list, int i10, String str, String str2, int i11, Object obj) {
        m40747r(governmentIdState, c12255f, input, governmentId, idConfig, c11905l, cameraProperties, (i11 & 128) != 0 ? true : z10, (i11 & 256) != 0 ? governmentIdState.mo16955D() : list, (i11 & 512) != 0 ? governmentIdState.getPartIndex() : i10, (i11 & 1024) != 0 ? null : str, (i11 & 2048) != 0 ? governmentIdState.getCountryCode() : str2);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m40749t(C12255f c12255f, C11905l c11905l) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture != null) {
            c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c11905l.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m40750u(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.ReviewImageState renderState, @NotNull C12255f<GovernmentIdState> context, @NotNull C11905l videoCaptureHelper, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        if (!(captureConfig instanceof CaptureConfig.AutoClassifyConfig)) {
            if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
                throw new C7345l();
            }
            m40748s(renderState, context, renderProps, renderState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), false, null, 0, null, null, 3968, null);
        } else {
            WorkflowState workflowStateM45411i = context.m45411i();
            GovernmentIdState.ReviewImageState reviewImageState = workflowStateM45411i instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateM45411i : null;
            if (reviewImageState == null) {
                return;
            }
            context.m45417p(reviewImageState.mo17021L(true));
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m40751v(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.ReviewImageState renderState, @NotNull final C12255f<GovernmentIdState> context, @NotNull final C11905l videoCaptureHelper, @NotNull AutoClassifyWorker.C3563b autoClassifyWorkerFactory, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        context.m45415n(autoClassifyWorkerFactory.m17703a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), new Function1() { // from class: qo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10643e.m40752w(context, onOutput, renderProps, renderState, videoCaptureHelper, (AutoClassifyWorker.InterfaceC3564c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m40752w(C12255f c12255f, Function1 function1, GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, C11905l c11905l, AutoClassifyWorker.InterfaceC3564c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AutoClassifyWorker.InterfaceC3564c.a) {
            InternalErrorInfo cause = ((AutoClassifyWorker.InterfaceC3564c.a) it).getCause();
            GovernmentIdState governmentIdState = (GovernmentIdState) c12255f.m45411i();
            GovernmentIdState backState = governmentIdState != null ? governmentIdState.getBackState() : null;
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = cause instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) cause : null;
            if (((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) || networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState == null) {
                function1.invoke(new GovernmentIdWorkflow.AbstractC3503a.c(cause));
            } else {
                c12255f.m45417p(backState);
            }
        } else {
            if (!(it instanceof AutoClassifyWorker.InterfaceC3564c.b)) {
                throw new C7345l();
            }
            AutoClassifyWorker.InterfaceC3562a autoClassificationResult = ((AutoClassifyWorker.InterfaceC3564c.b) it).getAutoClassificationResult();
            if (autoClassificationResult instanceof AutoClassifyWorker.InterfaceC3562a.a) {
                WorkflowState workflowStateM45411i = c12255f.m45411i();
                GovernmentIdState.ReviewImageState reviewImageState2 = workflowStateM45411i instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateM45411i : null;
                if (reviewImageState2 == null) {
                    return Unit.f29331a;
                }
                c12255f.m45417p(reviewImageState2.mo17021L(false));
                AutoClassifyWorker.InterfaceC3562a.a aVar = (AutoClassifyWorker.InterfaceC3562a.a) autoClassificationResult;
                m40748s(reviewImageState2, c12255f, input, reviewImageState.getIdForReview(), aVar.getIdConfig(), c11905l, reviewImageState.getCameraProperties(), false, aVar.getIdConfig().m17272f(), 0, null, null, 3200, null);
            } else if (autoClassificationResult instanceof AutoClassifyWorker.InterfaceC3562a.b) {
                WorkflowState workflowStateM45411i2 = c12255f.m45411i();
                GovernmentIdState.ReviewImageState reviewImageState3 = workflowStateM45411i2 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateM45411i2 : null;
                if (reviewImageState3 == null) {
                    return Unit.f29331a;
                }
                c12255f.m45417p(m40733d(input, reviewImageState3, reviewImageState.getIdForReview().mo16936d3(), ((AutoClassifyWorker.InterfaceC3562a.b) autoClassificationResult).m17701a(), EnumC6844b.IdTypeRejected, m40734e(c12255f, false)));
            } else {
                if (!(autoClassificationResult instanceof AutoClassifyWorker.InterfaceC3562a.c)) {
                    throw new C7345l();
                }
                WorkflowState workflowStateM45411i3 = c12255f.m45411i();
                GovernmentIdState.ReviewImageState reviewImageState4 = workflowStateM45411i3 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateM45411i3 : null;
                if (reviewImageState4 == null) {
                    return Unit.f29331a;
                }
                c12255f.m45417p(m40733d(input, reviewImageState4, reviewImageState.getIdForReview().mo16936d3(), ((AutoClassifyWorker.InterfaceC3562a.c) autoClassificationResult).m17702a(), EnumC6844b.UnableToClassify, m40734e(c12255f, false)));
            }
        }
        return Unit.f29331a;
    }
}
