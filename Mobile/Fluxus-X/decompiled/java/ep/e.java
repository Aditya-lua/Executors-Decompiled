package ep;

import android.content.Context;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import dp.GovernmentIdRequestArguments;
import fq.y1;
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
import vo.EnabledIdClass;
import vo.Frame;
import vo.IdConfig;
import vo.IdConfigForCountry;
import vo.b3;
import vo.d2;
import vo.h3;
import vo.i3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001aO\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001aM\u0010%\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b%\u0010&\u001a\u008b\u0001\u00105\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001d2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\b5\u00106\u001aG\u0010:\u001a\u0012\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0006j\u0002`9*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u00107\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b:\u0010;\u001a5\u0010?\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\fH\u0000¢\u0006\u0004\b?\u0010@\u001a-\u0010E\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bG\u0010F\u001a-\u0010H\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bH\u0010F\u001a-\u0010I\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\bI\u0010F\u001a\u001b\u0010J\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010L\u001a\u000202*\u00020A2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bL\u0010K\u001a\u0019\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u001d*\u00020\u0002H\u0000¢\u0006\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lls/g;", "Lvo/j0;", "Lvo/d2$a;", "props", "Lip/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lvo/d2$b;", BuildConfig.FLAVOR, "onOutput", "p", "(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)V", BuildConfig.FLAVOR, "addCurrentState", "e", "(Lls/g;Z)Lvo/j0;", "renderProps", "Lvo/j0$j;", "renderState", "context", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "u", "(Lvo/d2$a;Lvo/j0$j;Lls/g;Lip/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "v", "(Lvo/d2$a;Lvo/j0$j;Lls/g;Lip/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lkotlin/jvm/functions/Function1;)V", "state", BuildConfig.FLAVOR, "Lvo/m;", "captureFrames", "Lvo/f3;", "idConfigsForCountry", "Lvo/c;", "errorType", "backState", "d", "(Lvo/d2$a;Lvo/j0$j;Ljava/util/List;Ljava/util/List;Lvo/c;Lvo/j0;)Lvo/j0;", "workflowContext", "Lvo/n;", "acceptedId", "Lvo/d3;", "id", "Lsn/v;", "cameraProperties", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "currentPartIndex", BuildConfig.FLAVOR, "webRtcObjectId", "countryCode", "r", "(Lvo/j0;Lls/g;Lvo/d2$a;Lvo/n;Lvo/d3;Lip/l;Lsn/v;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "inRecoverableState", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "f", "(Lls/g;ZLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "renderContext", "useVideoCapture", "q", "(Landroid/content/Context;Lls/g;Lvo/d2$a;Z)V", "Lvo/d2$a$b;", "Lvo/d3$e;", "side", "selectedId", "j", "(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "l", "k", "o", "(Lvo/d2$a$b;Lvo/d3$e;)Ljava/lang/String;", "n", "Lvo/l;", "m", "(Lvo/d2$a;)Ljava/util/List;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final vo.j0 d(d2.a aVar, vo.j0.j jVar, List<Frame> list, List<IdConfigForCountry> list2, vo.c cVar, vo.j0 j0Var) {
        String countryCode;
        String str;
        if (aVar.getDesignVersion() != vo.i.K0000) {
            return new vo.j0.AutoClassificationError(jVar.getCurrentPart(), jVar.D(), jVar.C(), jVar.getPartIndex(), j0Var, jVar.getCountryCode(), list, jVar.getCameraProperties(), list2, null, null, cVar, 1536, null);
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
        return new vo.j0.AutoClassificationManualSelect(jVar.getCurrentPart(), jVar.D(), jVar.C(), jVar.getPartIndex(), j0Var, jVar.getCountryCode(), list, new sn.v(null, null, null, 0, 0, 31, null), list2, countryCode, str);
    }

    @Nullable
    public static final vo.j0 e(@NotNull ls.g<vo.j0> gVar, boolean z10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (z10) {
            return (vo.j0) gVar.i();
        }
        vo.j0 j0Var = (vo.j0) gVar.i();
        if (j0Var != null) {
            return j0Var.getBackState();
        }
        return null;
    }

    @NotNull
    public static final Function1<Throwable, Unit> f(@NotNull final ls.g<vo.j0> gVar, final boolean z10, @NotNull final Function1<? super d2.b, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        return new Function1() { // from class: ep.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.h(onOutput, z10, gVar, (Throwable) obj);
            }
        };
    }

    public static /* synthetic */ Function1 g(ls.g gVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return f(gVar, z10, function1);
    }

    public static final Unit h(Function1 function1, boolean z10, ls.g gVar, Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof sn.k)) {
            function1.invoke(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + cameraError.getClass().getCanonicalName())));
            return Unit.f21506a;
        }
        sn.k kVar = (sn.k) cameraError;
        if (!(kVar instanceof sn.t0)) {
            if (kVar instanceof sn.v0) {
                function1.invoke(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            } else if (kVar instanceof sn.p0) {
                function1.invoke(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
            } else {
                if (kVar instanceof sn.a1) {
                    if (z10) {
                        vo.j0 j0Var = (vo.j0) gVar.i();
                        if (j0Var != null) {
                            j0Var.v();
                        }
                        vo.j0 j0Var2 = (vo.j0) gVar.i();
                        gVar.p(new vo.j0.RestartStep(null, null, null, null, 0, j0Var2 != null ? j0Var2.getCountryCode() : null, null, null, 223, null));
                    } else {
                        function1.invoke(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
                    }
                } else if (kVar instanceof sn.z0) {
                    if (z10) {
                        vo.j0 j0Var3 = (vo.j0) gVar.i();
                        if (j0Var3 != null) {
                            j0Var3.v();
                        }
                        if (!((sn.z0) cameraError).getIsClosedDueToBadCameraConfiguration()) {
                            vo.j0 j0Var4 = (vo.j0) gVar.i();
                            gVar.p(new vo.j0.RestartStep(null, null, null, null, 0, j0Var4 != null ? j0Var4.getCountryCode() : null, null, null, 223, null));
                        }
                    } else {
                        function1.invoke(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
                    }
                } else if (kVar instanceof sn.f0) {
                    function1.invoke(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
                } else {
                    if (!(kVar instanceof sn.j1)) {
                        throw new zt.l();
                    }
                    function1.invoke(new d2.b.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
                }
            }
        }
        return Unit.f21506a;
    }

    @NotNull
    public static final String i(@NotNull d2.a.Strings bVar, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = bVar.getChooseCaptureMethodBody().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @NotNull
    public static final String j(@NotNull d2.a.Strings bVar, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = bVar.getChooseCaptureMethodTitle().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @NotNull
    public static final String k(@NotNull d2.a.Strings bVar, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = bVar.getConfirmCapture().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @NotNull
    public static final String l(@NotNull d2.a.Strings bVar, @NotNull IdConfig.e side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String strA = bVar.getConfirmCaptureTitle().a(str, selectedId, side);
        return strA == null ? BuildConfig.FLAVOR : strA;
    }

    @NotNull
    public static final List<EnabledIdClass> m(@NotNull d2.a aVar) {
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
    public static final String n(@NotNull d2.a.Strings bVar, @NotNull IdConfig.e side) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        String str = bVar.w0().get(side);
        return str == null ? BuildConfig.FLAVOR : str;
    }

    @NotNull
    public static final String o(@NotNull d2.a.Strings bVar, @NotNull IdConfig.e side) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        String str = bVar.B0().get(side);
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public static final void p(@NotNull ls.g<vo.j0> gVar, @NotNull d2.a props, @Nullable ip.l lVar, @NotNull Function1<? super d2.b, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        vo.j0 j0Var = (vo.j0) gVar.i();
        vo.j0 backState = j0Var != null ? j0Var.getBackState() : null;
        if (lVar != null) {
            lVar.a();
        }
        if (backState != null) {
            backState.F(true);
            gVar.p(backState);
        } else if (props.getBackStepEnabled()) {
            onOutput.invoke(d2.b.a.f34599a);
        } else {
            onOutput.invoke(d2.b.C0708b.f34600a);
        }
    }

    public static final void q(@NotNull Context context, @NotNull ls.g<vo.j0> renderContext, @NotNull d2.a renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        fq.n0 n0Var = fq.n0.Camera;
        List listP = p001kotlin.collections.p.p(n0Var);
        if (z10 && xq.g.f(context)) {
            listP.add(fq.n0.RecordAudio);
        }
        List<fq.n0> listA = y1.a(context, listP);
        if (listA.isEmpty()) {
            return;
        }
        vo.j0 j0Var = (vo.j0) renderContext.i();
        if (j0Var instanceof vo.j0.WaitForAutocapture) {
            renderContext.p(vo.j0.WaitForAutocapture.L((vo.j0.WaitForAutocapture) j0Var, null, null, null, null, null, 0, null, null, null, null, listA.contains(n0Var), listA.contains(fq.n0.RecordAudio), null, null, null, 29695, null));
        } else if (j0Var != null) {
            j0Var.v();
            renderContext.p(new vo.j0.RestartStep(null, null, null, null, 0, j0Var.getCountryCode(), null, null, 223, null));
        }
    }

    public static final void r(@NotNull vo.j0 renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull d2.a renderProps, @Nullable vo.n nVar, @NotNull IdConfig id2, @NotNull final ip.l videoCaptureHelper, @NotNull sn.v cameraProperties, boolean z10, @NotNull List<? extends i3> parts, int i10, @Nullable String str, @Nullable String str2) {
        Parcelable submit;
        int i11 = i10;
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        zn.a aVarE = videoCaptureHelper.e(renderProps);
        vo.j0 j0Var = (vo.j0) workflowContext.i();
        if (j0Var != null && j0Var.getClass() == renderState.getClass()) {
            List<vo.n> listX0 = nVar != null ? CollectionsKt.x0(j0Var.D(), nVar) : j0Var.D();
            if (i11 != parts.size()) {
                i11++;
            }
            i3 i3Var = (i3) CollectionsKt.f0(parts, i11);
            if (!(i3Var instanceof i3.SideIdPart)) {
                List<vo.n> list = listX0;
                int i12 = i11;
                if (i3Var != null) {
                    throw new zt.l();
                }
                if (aVarE != zn.a.Stream || (j0Var instanceof vo.j0.f) || (j0Var instanceof vo.j0.ReviewSelectedImage)) {
                    submit = (aVarE != zn.a.Upload || (j0Var instanceof vo.j0.FinalizeLocalVideoCapture) || (j0Var instanceof vo.j0.ReviewSelectedImage)) ? new vo.j0.Submit(id2, list, null, parts, i12, e(workflowContext, z10), str2, new GovernmentIdRequestArguments(list, renderProps.getFieldKeyDocument(), renderProps.getFieldKeyIdClass()), str, cameraProperties, false, 1028, null) : new vo.j0.FinalizeLocalVideoCapture(id2, list, (i3) CollectionsKt.o0(parts), parts, i12, e(workflowContext, z10), str2, new GovernmentIdRequestArguments(list, renderProps.getFieldKeyDocument(), renderProps.getFieldKeyIdClass()), 0L, false, 768, null);
                } else {
                    submit = new vo.j0.f((i3) CollectionsKt.o0(parts), list, parts, i12, e(workflowContext, z10), str2, id2, cameraProperties);
                }
            } else if (!renderProps.u() || videoCaptureHelper.c(renderProps)) {
                int i13 = i11;
                i3.SideIdPart sideIdPart = (i3.SideIdPart) i3Var;
                submit = new vo.j0.WaitForAutocapture(sideIdPart, listX0, new vo.f.IdCaptureConfig(id2), b3.O(renderProps, sideIdPart.getSide()), parts, i13, e(workflowContext, z10), videoCaptureHelper.d() ? ip.x.Connected : ip.x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str2, null, new Function0() { // from class: ep.b
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.t(workflowContext, videoCaptureHelper);
                    }
                }, 11776, null);
            } else {
                submit = new vo.j0.ChooseCaptureMethod((i3.SideIdPart) i3Var, listX0, parts, i11, str2, new vo.f.IdCaptureConfig(id2), false, e(workflowContext, z10), null, 320, null);
            }
            workflowContext.p(submit);
        }
    }

    public static /* synthetic */ void s(vo.j0 j0Var, ls.g gVar, d2.a aVar, vo.n nVar, IdConfig idConfig, ip.l lVar, sn.v vVar, boolean z10, List list, int i10, String str, String str2, int i11, Object obj) {
        r(j0Var, gVar, aVar, nVar, idConfig, lVar, vVar, (i11 & Barcode.FORMAT_ITF) != 0 ? true : z10, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? j0Var.C() : list, (i11 & Barcode.FORMAT_UPC_A) != 0 ? j0Var.getPartIndex() : i10, (i11 & Barcode.FORMAT_UPC_E) != 0 ? null : str, (i11 & Barcode.FORMAT_PDF417) != 0 ? j0Var.getCountryCode() : str2);
    }

    public static final Unit t(ls.g gVar, ip.l lVar) {
        ls.h hVarI = gVar.i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture != null) {
            gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final void u(@NotNull d2.a renderProps, @NotNull vo.j0.j renderState, @NotNull ls.g<vo.j0> context, @NotNull ip.l videoCaptureHelper, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        vo.f captureConfig = renderState.getCaptureConfig();
        if (!(captureConfig instanceof vo.f.AutoClassifyConfig)) {
            if (!(captureConfig instanceof vo.f.IdCaptureConfig)) {
                throw new zt.l();
            }
            s(renderState, context, renderProps, renderState.getIdForReview(), ((vo.f.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), false, null, 0, null, null, 3968, null);
        } else {
            ls.h hVarI = context.i();
            vo.j0.j jVar = hVarI instanceof vo.j0.j ? (vo.j0.j) hVarI : null;
            if (jVar == null) {
                return;
            }
            context.p(jVar.L(true));
        }
    }

    public static final void v(@NotNull final d2.a renderProps, @NotNull final vo.j0.j renderState, @NotNull final ls.g<vo.j0> context, @NotNull final ip.l videoCaptureHelper, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory, @NotNull final Function1<? super d2.b, Unit> onOutput) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        context.n(autoClassifyWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), new Function1() { // from class: ep.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.w(context, onOutput, renderProps, renderState, videoCaptureHelper, (AutoClassifyWorker.c) obj);
            }
        });
    }

    public static final Unit w(ls.g gVar, Function1 function1, d2.a aVar, vo.j0.j jVar, ip.l lVar, AutoClassifyWorker.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AutoClassifyWorker.c.a) {
            InternalErrorInfo cause = ((AutoClassifyWorker.c.a) it).getCause();
            vo.j0 j0Var = (vo.j0) gVar.i();
            vo.j0 backState = j0Var != null ? j0Var.getBackState() : null;
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = cause instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) cause : null;
            if (((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) || networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState == null) {
                function1.invoke(new d2.b.c(cause));
            } else {
                gVar.p(backState);
            }
        } else {
            if (!(it instanceof AutoClassifyWorker.c.b)) {
                throw new zt.l();
            }
            AutoClassifyWorker.a autoClassificationResult = ((AutoClassifyWorker.c.b) it).getAutoClassificationResult();
            if (autoClassificationResult instanceof AutoClassifyWorker.a.C0175a) {
                ls.h hVarI = gVar.i();
                vo.j0.j jVar2 = hVarI instanceof vo.j0.j ? (vo.j0.j) hVarI : null;
                if (jVar2 == null) {
                    return Unit.f21506a;
                }
                gVar.p(jVar2.L(false));
                AutoClassifyWorker.a.C0175a c0175a = (AutoClassifyWorker.a.C0175a) autoClassificationResult;
                s(jVar2, gVar, aVar, jVar.getIdForReview(), c0175a.getIdConfig(), lVar, jVar.getCameraProperties(), false, c0175a.getIdConfig().f(), 0, null, null, 3200, null);
            } else if (autoClassificationResult instanceof AutoClassifyWorker.a.b) {
                ls.h hVarI2 = gVar.i();
                vo.j0.j jVar3 = hVarI2 instanceof vo.j0.j ? (vo.j0.j) hVarI2 : null;
                if (jVar3 == null) {
                    return Unit.f21506a;
                }
                gVar.p(d(aVar, jVar3, jVar.getIdForReview().j3(), ((AutoClassifyWorker.a.b) autoClassificationResult).a(), vo.c.IdTypeRejected, e(gVar, false)));
            } else {
                if (!(autoClassificationResult instanceof AutoClassifyWorker.a.c)) {
                    throw new zt.l();
                }
                ls.h hVarI3 = gVar.i();
                vo.j0.j jVar4 = hVarI3 instanceof vo.j0.j ? (vo.j0.j) hVarI3 : null;
                if (jVar4 == null) {
                    return Unit.f21506a;
                }
                gVar.p(d(aVar, jVar4, jVar.getIdForReview().j3(), ((AutoClassifyWorker.a.c) autoClassificationResult).a(), vo.c.UnableToClassify, e(gVar, false)));
            }
        }
        return Unit.f21506a;
    }
}
