package p134fq;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.selfie.C3957i;
import com.withpersona.sdk2.inquiry.selfie.InterfaceC3939a;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7259g;
import p229jt.C7345l;
import p363pq.InterfaceC10316j;
import p419rp.EnumC11024i0;
import p499vr.C12255f;

/* JADX INFO: renamed from: fq.l2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aS\u0010 \u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, m31665d2 = {"Lvr/f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "addCurrentState", "a", "(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Landroid/content/Context;", "context", "renderContext", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "useVideoCapture", "", "d", "(Landroid/content/Context;Lvr/f;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "Lpq/j;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lpq/j;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "e", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5776l2 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final SelfieState m26149a(@NotNull C12255f<SelfieState> c12255f, boolean z10) {
        Intrinsics.checkNotNullParameter(c12255f, "<this>");
        if (z10) {
            return (SelfieState) c12255f.m45411i();
        }
        SelfieState selfieState = (SelfieState) c12255f.m45411i();
        if (selfieState != null) {
            return selfieState.getBackState();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SelfieState m26150b(C12255f c12255f, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m26149a(c12255f, z10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m26151c(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        Iterator<T> it = selfieState.mo19297w().iterator();
        while (it.hasNext()) {
            new File(((Selfie) it.next()).getAbsoluteFilePath()).delete();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m26152d(@NotNull Context context, @NotNull C12255f<SelfieState> renderContext, @NotNull SelfieWorkflow.Input renderProps, boolean z10) {
        SelfieState selfieState;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        EnumC11024i0 enumC11024i0 = EnumC11024i0.Camera;
        List listM31897p = C7699p.m31897p(enumC11024i0);
        if (z10 && C7259g.m30272f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listM31897p.add(EnumC11024i0.RecordAudio);
        }
        List<EnumC11024i0> listM19163a = C3858g.m19163a(context, listM31897p);
        if (listM19163a.isEmpty() || (selfieState = (SelfieState) renderContext.m45411i()) == null) {
            return;
        }
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            renderContext.m45417p(SelfieState.WaitForCameraFeed.m19402A((SelfieState.WaitForCameraFeed) selfieState, !listM19163a.contains(enumC11024i0), !listM19163a.contains(EnumC11024i0.RecordAudio), null, null, null, false, null, false, 252, null));
        } else {
            m26151c(selfieState);
            renderContext.m45417p(new SelfieState.RestartCamera(false, false, m26149a(renderContext, false), selfieState.getCameraFacingMode(), 3, null));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final SelfieState m26153e(@NotNull C12255f<SelfieState> c12255f, @NotNull PoseConfigs poseConfigs, @NotNull List<? extends Selfie> selfies, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(c12255f, "<this>");
        Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? poseConfigs.m19281a(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            WorkflowState workflowStateM45411i = c12255f.m45411i();
            if (workflowStateM45411i != null) {
                return new SelfieState.Submit(selfies, str, cameraProperties, j10, selfieState, ((SelfieState) workflowStateM45411i).getCameraFacingMode(), 0, null, 192, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        WorkflowState workflowStateM45411i2 = c12255f.m45411i();
        if (workflowStateM45411i2 != null) {
            return new SelfieState.ReviewCaptures(selfies, arrayList, str, cameraProperties, j10, selfieState, ((SelfieState) workflowStateM45411i2).getCameraFacingMode());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.withpersona.sdk2.inquiry.selfie.SelfieState */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC10316j m26154f(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        if (selfieState instanceof SelfieState.ShowInstructions) {
            return InterfaceC10316j.e.f37141a;
        }
        if (selfieState instanceof SelfieState.ShowPoseHint) {
            EnumC7638a enumC7638aMo19305m = ((SelfieState.ShowPoseHint) selfieState).mo19305m();
            return new InterfaceC10316j.LeadInAnimation(enumC7638aMo19305m != null ? C3957i.m20079a(enumC7638aMo19305m) : null);
        }
        if (selfieState instanceof SelfieState.RestartCamera) {
            return new InterfaceC10316j.TakePhoto(null);
        }
        if (selfieState instanceof SelfieState.AcquireNextPose) {
            return new InterfaceC10316j.LeadInAnimation(null);
        }
        if (selfieState instanceof InterfaceC3939a) {
            EnumC7638a enumC7638aMo19305m2 = ((InterfaceC3939a) selfieState).mo19305m();
            return new InterfaceC10316j.TakePhoto(enumC7638aMo19305m2 != null ? C3957i.m20079a(enumC7638aMo19305m2) : null);
        }
        if (selfieState instanceof SelfieState.CaptureTransition) {
            return m26154f(((SelfieState.CaptureTransition) selfieState).getNextState());
        }
        if ((selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished)) {
            return InterfaceC10316j.b.f37138a;
        }
        if (selfieState instanceof SelfieState.ReviewCaptures) {
            return InterfaceC10316j.a.f37137a;
        }
        if (selfieState instanceof SelfieState.Submit) {
            return InterfaceC10316j.d.f37140a;
        }
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            return new InterfaceC10316j.TakePhoto(null);
        }
        throw new C7345l();
    }
}
