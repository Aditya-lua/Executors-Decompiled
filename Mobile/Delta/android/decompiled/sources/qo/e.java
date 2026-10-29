package qo;

import android.content.Context;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
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
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import io.j2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001aO\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001aM\u0010%\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b%\u0010&\u001a\u008b\u0001\u00105\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001d2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\b5\u00106\u001aG\u0010:\u001a\u0012\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0006j\u0002`9*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u00107\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b:\u0010;\u001a5\u0010?\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\fH\u0000¢\u0006\u0004\b?\u0010@\u001a-\u0010E\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bG\u0010F\u001a-\u0010H\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bH\u0010F\u001a-\u0010I\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bI\u0010F\u001a\u001b\u0010J\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010L\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bL\u0010K\u001a\u0019\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u001d*\u00020\u0002H\u0000¢\u0006\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "Luo/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "p", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)V", "", "addCurrentState", "e", "(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "renderState", "context", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "u", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "v", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lkotlin/jvm/functions/Function1;)V", "state", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "Lio/b;", "errorType", "backState", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lio/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "acceptedId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "countryCode", "r", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "inRecoverableState", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "f", "(Lvr/f;ZLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "renderContext", "useVideoCapture", "q", "(Landroid/content/Context;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "selectedId", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "l", "k", "o", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final GovernmentIdState d(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, List<Frame> list, List<IdConfigForCountry> list2, io.b bVar, GovernmentIdState governmentIdState) {
        String countryCode;
        String str;
        if (input.getDesignVersion() != io.d.K0000) {
            return new GovernmentIdState.AutoClassificationError(reviewImageState.getCurrentPart(), reviewImageState.E(), reviewImageState.D(), reviewImageState.getPartIndex(), governmentIdState, reviewImageState.getCountryCode(), list, reviewImageState.getCameraProperties(), list2, null, null, bVar, 1536, null);
        }
        if (list2.size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.d0(list2);
            String idClassKey = idConfigForCountry.g().size() == 1 ? ((IdConfig) CollectionsKt.d0(idConfigForCountry.g())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        return new GovernmentIdState.AutoClassificationManualSelect(reviewImageState.getCurrentPart(), reviewImageState.E(), reviewImageState.D(), reviewImageState.getPartIndex(), governmentIdState, reviewImageState.getCountryCode(), list, new CameraProperties(null, null, null, 0, 0, 31, null), list2, countryCode, str);
    }

    @Nullable
    public static final GovernmentIdState e(@NotNull vr.f<GovernmentIdState> fVar, boolean z10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (z10) {
            return (GovernmentIdState) fVar.i();
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
        if (governmentIdState != null) {
            return governmentIdState.getBackState();
        }
        return null;
    }

    @NotNull
    public static final Function1<Throwable, Unit> f(@NotNull final vr.f<GovernmentIdState> fVar, final boolean z10, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        return new Function1() { // from class: qo.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.h(onOutput, z10, fVar, (Throwable) obj);
            }
        };
    }

    public static /* synthetic */ Function1 g(vr.f fVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return f(fVar, z10, function1);
    }

    public static final Unit h(Function1 function1, boolean z10, vr.f fVar, Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof fn.h)) {
            function1.invoke(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + cameraError.getClass().getCanonicalName())));
            return Unit.f22483a;
        }
        fn.h hVar = (fn.h) cameraError;
        if (!(hVar instanceof fn.h0)) {
            if (hVar instanceof fn.i0) {
                function1.invoke(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            } else if (hVar instanceof fn.d0) {
                function1.invoke(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
            } else {
                if (hVar instanceof fn.m0) {
                    if (z10) {
                        GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
                        if (governmentIdState != null) {
                            governmentIdState.v();
                        }
                        GovernmentIdState governmentIdState2 = (GovernmentIdState) fVar.i();
                        fVar.p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState2 != null ? governmentIdState2.getCountryCode() : null, null, null, 223, null));
                    } else {
                        function1.invoke(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
                    }
                } else if (hVar instanceof fn.l0) {
                    if (z10) {
                        GovernmentIdState governmentIdState3 = (GovernmentIdState) fVar.i();
                        if (governmentIdState3 != null) {
                            governmentIdState3.v();
                        }
                        if (!((fn.l0) cameraError).getIsClosedDueToBadCameraConfiguration()) {
                            GovernmentIdState governmentIdState4 = (GovernmentIdState) fVar.i();
                            fVar.p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState4 != null ? governmentIdState4.getCountryCode() : null, null, null, 223, null));
                        }
                    } else {
                        function1.invoke(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
                    }
                } else if (hVar instanceof fn.v) {
                    function1.invoke(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
                } else {
                    if (!(hVar instanceof fn.v0)) {
                        throw new jt.l();
                    }
                    function1.invoke(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
                }
            }
        }
        return Unit.f22483a;
    }

    @NotNull
    public static final String i(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getChooseCaptureMethodBody().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @NotNull
    public static final String j(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getChooseCaptureMethodTitle().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @NotNull
    public static final String k(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getConfirmCapture().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @NotNull
    public static final String l(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = strings.getConfirmCaptureTitle().a(str, selectedId, side);
        return strA == null ? "" : strA;
    }

    @NotNull
    public static final List<EnabledIdClass> m(@NotNull GovernmentIdWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        List<IdConfig> listO = input.o();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listO, 10));
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
    public static final String n(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        String str = strings.x0().get(side);
        return str == null ? "" : str;
    }

    @NotNull
    public static final String o(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        String str = strings.C0().get(side);
        return str == null ? "" : str;
    }

    public static final void p(@NotNull vr.f<GovernmentIdState> fVar, @NotNull GovernmentIdWorkflow.Input props, @Nullable uo.l lVar, @NotNull Function1<? super GovernmentIdWorkflow.a, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
        GovernmentIdState backState = governmentIdState != null ? governmentIdState.getBackState() : null;
        if (lVar != null) {
            lVar.a();
        }
        if (backState != null) {
            backState.G(true);
            fVar.p(backState);
        } else if (props.getBackStepEnabled()) {
            onOutput.invoke(GovernmentIdWorkflow.a.C0192a.f10660a);
        } else {
            onOutput.invoke(GovernmentIdWorkflow.a.b.f10661a);
        }
    }

    public static final void q(@NotNull Context context, @NotNull vr.f<GovernmentIdState> renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        rp.i0 i0Var = rp.i0.Camera;
        List listP = kotlin.collections.p.p(i0Var);
        if (z10 && jq.g.f(context)) {
            listP.add(rp.i0.RecordAudio);
        }
        List<rp.i0> listA = com.withpersona.sdk2.inquiry.permissions.g.a(context, listP);
        if (listA.isEmpty()) {
            return;
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) renderContext.i();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            renderContext.p(GovernmentIdState.WaitForAutocapture.L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, listA.contains(i0Var), listA.contains(rp.i0.RecordAudio), null, null, null, 29695, null));
        } else if (governmentIdState != null) {
            governmentIdState.v();
            renderContext.p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState.getCountryCode(), null, null, 223, null));
        }
    }

    public static final void r(@NotNull GovernmentIdState renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull GovernmentIdWorkflow.Input renderProps, @Nullable GovernmentId governmentId, @NotNull IdConfig id2, @NotNull final uo.l videoCaptureHelper, @NotNull CameraProperties cameraProperties, boolean z10, @NotNull List<? extends IdPart> parts, int i10, @Nullable String str, @Nullable String str2) {
        WorkflowState submit;
        int i11 = i10;
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        mn.a aVarE = videoCaptureHelper.e(renderProps);
        GovernmentIdState governmentIdState = (GovernmentIdState) workflowContext.i();
        if (governmentIdState != null && governmentIdState.getClass() == renderState.getClass()) {
            List<GovernmentId> listX0 = governmentId != null ? CollectionsKt.x0(governmentIdState.E(), governmentId) : governmentIdState.E();
            if (i11 != parts.size()) {
                i11++;
            }
            IdPart idPart = (IdPart) CollectionsKt.f0(parts, i11);
            if (!(idPart instanceof IdPart.SideIdPart)) {
                List<GovernmentId> list = listX0;
                int i12 = i11;
                if (idPart != null) {
                    throw new jt.l();
                }
                if (aVarE != mn.a.Stream || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage)) {
                    submit = (aVarE != mn.a.Upload || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage)) ? new GovernmentIdState.Submit(id2, list, null, parts, i12, e(workflowContext, z10), str2, new GovernmentIdRequestArguments(list, renderProps.getFieldKeyDocument(), renderProps.getFieldKeyIdClass()), str, cameraProperties, false, 1028, null) : new GovernmentIdState.FinalizeLocalVideoCapture(id2, list, (IdPart) CollectionsKt.o0(parts), parts, i12, e(workflowContext, z10), str2, new GovernmentIdRequestArguments(list, renderProps.getFieldKeyDocument(), renderProps.getFieldKeyIdClass()), 0L, false, 768, null);
                } else {
                    submit = new GovernmentIdState.FinalizeWebRtc((IdPart) CollectionsKt.o0(parts), list, parts, i12, e(workflowContext, z10), str2, id2, cameraProperties);
                }
            } else if (!renderProps.u() || videoCaptureHelper.c(renderProps)) {
                int i13 = i11;
                IdPart.SideIdPart sideIdPart = (IdPart.SideIdPart) idPart;
                submit = new GovernmentIdState.WaitForAutocapture(sideIdPart, listX0, new CaptureConfig.IdCaptureConfig(id2), com.withpersona.sdk2.inquiry.governmentid.n.O(renderProps, sideIdPart.getSide()), parts, i13, e(workflowContext, z10), videoCaptureHelper.d() ? uo.x.Connected : uo.x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str2, null, new Function0() { // from class: qo.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.t(workflowContext, videoCaptureHelper);
                    }
                }, 11776, null);
            } else {
                submit = new GovernmentIdState.ChooseCaptureMethod((IdPart.SideIdPart) idPart, listX0, parts, i11, str2, new CaptureConfig.IdCaptureConfig(id2), false, e(workflowContext, z10), null, 320, null);
            }
            workflowContext.p(submit);
        }
    }

    public static /* synthetic */ void s(GovernmentIdState governmentIdState, vr.f fVar, GovernmentIdWorkflow.Input input, GovernmentId governmentId, IdConfig idConfig, uo.l lVar, CameraProperties cameraProperties, boolean z10, List list, int i10, String str, String str2, int i11, Object obj) {
        r(governmentIdState, fVar, input, governmentId, idConfig, lVar, cameraProperties, (i11 & 128) != 0 ? true : z10, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? governmentIdState.D() : list, (i11 & Barcode.FORMAT_UPC_A) != 0 ? governmentIdState.getPartIndex() : i10, (i11 & Barcode.FORMAT_UPC_E) != 0 ? null : str, (i11 & Barcode.FORMAT_PDF417) != 0 ? governmentIdState.getCountryCode() : str2);
    }

    public static final Unit t(vr.f fVar, uo.l lVar) {
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture != null) {
            fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? uo.x.Connected : uo.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22483a;
    }

    public static final void u(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.ReviewImageState renderState, @NotNull vr.f<GovernmentIdState> context, @NotNull uo.l videoCaptureHelper, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        if (!(captureConfig instanceof CaptureConfig.AutoClassifyConfig)) {
            if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
                throw new jt.l();
            }
            s(renderState, context, renderProps, renderState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), false, null, 0, null, null, 3968, null);
        } else {
            WorkflowState workflowStateI = context.i();
            GovernmentIdState.ReviewImageState reviewImageState = workflowStateI instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateI : null;
            if (reviewImageState == null) {
                return;
            }
            context.p(reviewImageState.L(true));
        }
    }

    public static final void v(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.ReviewImageState renderState, @NotNull final vr.f<GovernmentIdState> context, @NotNull final uo.l videoCaptureHelper, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        context.n(autoClassifyWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), new Function1() { // from class: qo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.w(context, onOutput, renderProps, renderState, videoCaptureHelper, (AutoClassifyWorker.c) obj);
            }
        });
    }

    public static final Unit w(vr.f fVar, Function1 function1, GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, uo.l lVar, AutoClassifyWorker.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AutoClassifyWorker.c.a) {
            InternalErrorInfo cause = ((AutoClassifyWorker.c.a) it).getCause();
            GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
            GovernmentIdState backState = governmentIdState != null ? governmentIdState.getBackState() : null;
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = cause instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) cause : null;
            if (((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) || networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState == null) {
                function1.invoke(new GovernmentIdWorkflow.a.c(cause));
            } else {
                fVar.p(backState);
            }
        } else {
            if (!(it instanceof AutoClassifyWorker.c.b)) {
                throw new jt.l();
            }
            AutoClassifyWorker.a autoClassificationResult = ((AutoClassifyWorker.c.b) it).getAutoClassificationResult();
            if (autoClassificationResult instanceof AutoClassifyWorker.a.C0200a) {
                WorkflowState workflowStateI = fVar.i();
                GovernmentIdState.ReviewImageState reviewImageState2 = workflowStateI instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateI : null;
                if (reviewImageState2 == null) {
                    return Unit.f22483a;
                }
                fVar.p(reviewImageState2.L(false));
                AutoClassifyWorker.a.C0200a c0200a = (AutoClassifyWorker.a.C0200a) autoClassificationResult;
                s(reviewImageState2, fVar, input, reviewImageState.getIdForReview(), c0200a.getIdConfig(), lVar, reviewImageState.getCameraProperties(), false, c0200a.getIdConfig().f(), 0, null, null, 3200, null);
            } else if (autoClassificationResult instanceof AutoClassifyWorker.a.b) {
                WorkflowState workflowStateI2 = fVar.i();
                GovernmentIdState.ReviewImageState reviewImageState3 = workflowStateI2 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateI2 : null;
                if (reviewImageState3 == null) {
                    return Unit.f22483a;
                }
                fVar.p(d(input, reviewImageState3, reviewImageState.getIdForReview().d3(), ((AutoClassifyWorker.a.b) autoClassificationResult).a(), io.b.IdTypeRejected, e(fVar, false)));
            } else {
                if (!(autoClassificationResult instanceof AutoClassifyWorker.a.c)) {
                    throw new jt.l();
                }
                WorkflowState workflowStateI3 = fVar.i();
                GovernmentIdState.ReviewImageState reviewImageState4 = workflowStateI3 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) workflowStateI3 : null;
                if (reviewImageState4 == null) {
                    return Unit.f22483a;
                }
                fVar.p(d(input, reviewImageState4, reviewImageState.getIdForReview().d3(), ((AutoClassifyWorker.a.c) autoClassificationResult).a(), io.b.UnableToClassify, e(fVar, false)));
            }
        }
        return Unit.f22483a;
    }
}
