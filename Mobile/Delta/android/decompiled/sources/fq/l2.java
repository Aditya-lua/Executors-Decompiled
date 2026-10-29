package fq;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aS\u0010 \u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvr/f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "addCurrentState", "a", "(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Landroid/content/Context;", "context", "renderContext", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "useVideoCapture", "", "d", "(Landroid/content/Context;Lvr/f;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "Lpq/j;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lpq/j;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "e", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l2 {
    @Nullable
    public static final SelfieState a(@NotNull vr.f<SelfieState> fVar, boolean z10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (z10) {
            return (SelfieState) fVar.i();
        }
        SelfieState selfieState = (SelfieState) fVar.i();
        if (selfieState != null) {
            return selfieState.getBackState();
        }
        return null;
    }

    public static /* synthetic */ SelfieState b(vr.f fVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return a(fVar, z10);
    }

    public static final void c(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        Iterator<T> it = selfieState.w().iterator();
        while (it.hasNext()) {
            new File(((Selfie) it.next()).getAbsoluteFilePath()).delete();
        }
    }

    public static final void d(@NotNull Context context, @NotNull vr.f<SelfieState> renderContext, @NotNull SelfieWorkflow.Input renderProps, boolean z10) {
        SelfieState selfieState;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        rp.i0 i0Var = rp.i0.Camera;
        List listP = kotlin.collections.p.p(i0Var);
        if (z10 && jq.g.f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listP.add(rp.i0.RecordAudio);
        }
        List<rp.i0> listA = com.withpersona.sdk2.inquiry.permissions.g.a(context, listP);
        if (listA.isEmpty() || (selfieState = (SelfieState) renderContext.i()) == null) {
            return;
        }
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            renderContext.p(SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) selfieState, !listA.contains(i0Var), !listA.contains(rp.i0.RecordAudio), null, null, null, false, null, false, 252, null));
        } else {
            c(selfieState);
            renderContext.p(new SelfieState.RestartCamera(false, false, a(renderContext, false), selfieState.getCameraFacingMode(), 3, null));
        }
    }

    @NotNull
    public static final SelfieState e(@NotNull vr.f<SelfieState> fVar, @NotNull PoseConfigs poseConfigs, @NotNull List<? extends Selfie> selfies, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? poseConfigs.a(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            WorkflowState workflowStateI = fVar.i();
            if (workflowStateI != null) {
                return new SelfieState.Submit(selfies, str, cameraProperties, j10, selfieState, ((SelfieState) workflowStateI).getCameraFacingMode(), 0, null, 192, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        WorkflowState workflowStateI2 = fVar.i();
        if (workflowStateI2 != null) {
            return new SelfieState.ReviewCaptures(selfies, arrayList, str, cameraProperties, j10, selfieState, ((SelfieState) workflowStateI2).getCameraFacingMode());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final pq.j f(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        if (selfieState instanceof SelfieState.ShowInstructions) {
            return pq.j.e.f28840a;
        }
        if (selfieState instanceof SelfieState.ShowPoseHint) {
            kn.a aVarM = ((SelfieState.ShowPoseHint) selfieState).m();
            return new pq.j.LeadInAnimation(aVarM != null ? com.withpersona.sdk2.inquiry.selfie.i.a(aVarM) : null);
        }
        if (selfieState instanceof SelfieState.RestartCamera) {
            return new pq.j.TakePhoto(null);
        }
        if (selfieState instanceof SelfieState.AcquireNextPose) {
            return new pq.j.LeadInAnimation(null);
        }
        if (selfieState instanceof com.withpersona.sdk2.inquiry.selfie.a) {
            kn.a aVarM2 = ((com.withpersona.sdk2.inquiry.selfie.a) selfieState).m();
            return new pq.j.TakePhoto(aVarM2 != null ? com.withpersona.sdk2.inquiry.selfie.i.a(aVarM2) : null);
        }
        if (selfieState instanceof SelfieState.CaptureTransition) {
            return f(((SelfieState.CaptureTransition) selfieState).getNextState());
        }
        if ((selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished)) {
            return pq.j.b.f28837a;
        }
        if (selfieState instanceof SelfieState.ReviewCaptures) {
            return pq.j.a.f28836a;
        }
        if (selfieState instanceof SelfieState.Submit) {
            return pq.j.d.f28839a;
        }
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            return new pq.j.TakePhoto(null);
        }
        throw new jt.l();
    }
}
