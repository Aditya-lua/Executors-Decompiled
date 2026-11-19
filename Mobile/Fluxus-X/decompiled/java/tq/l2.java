package tq;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.PoseConfigs;
import mq.q5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aS\u0010 \u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lls/g;", "Lmq/y0;", BuildConfig.FLAVOR, "addCurrentState", "a", "(Lls/g;Z)Lmq/y0;", "Landroid/content/Context;", "context", "renderContext", "Lmq/q5$b;", "renderProps", "useVideoCapture", BuildConfig.FLAVOR, "d", "(Landroid/content/Context;Lls/g;Lmq/q5$b;Z)V", "c", "(Lmq/y0;)V", "Ldr/j;", "f", "(Lmq/y0;)Ldr/j;", "Lmq/t;", "poseConfigs", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", BuildConfig.FLAVOR, "webRtcObjectId", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", "e", "(Lls/g;Lmq/t;Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;)Lmq/y0;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l2 {
    @Nullable
    public static final mq.y0 a(@NotNull ls.g<mq.y0> gVar, boolean z10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (z10) {
            return (mq.y0) gVar.i();
        }
        mq.y0 y0Var = (mq.y0) gVar.i();
        if (y0Var != null) {
            return y0Var.getBackState();
        }
        return null;
    }

    public static /* synthetic */ mq.y0 b(ls.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return a(gVar, z10);
    }

    public static final void c(@NotNull mq.y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        Iterator<T> it = y0Var.w().iterator();
        while (it.hasNext()) {
            new File(((mq.b0) it.next()).getAbsoluteFilePath()).delete();
        }
    }

    public static final void d(@NotNull Context context, @NotNull ls.g<mq.y0> renderContext, @NotNull q5.Input renderProps, boolean z10) {
        mq.y0 y0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        fq.n0 n0Var = fq.n0.Camera;
        List listP = p001kotlin.collections.p.p(n0Var);
        if (z10 && xq.g.f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listP.add(fq.n0.RecordAudio);
        }
        List<fq.n0> listA = fq.y1.a(context, listP);
        if (listA.isEmpty() || (y0Var = (mq.y0) renderContext.i()) == null) {
            return;
        }
        if (y0Var instanceof mq.y0.WaitForCameraFeed) {
            renderContext.p(mq.y0.WaitForCameraFeed.z((mq.y0.WaitForCameraFeed) y0Var, !listA.contains(n0Var), !listA.contains(fq.n0.RecordAudio), null, null, null, false, null, false, 252, null));
        } else {
            c(y0Var);
            renderContext.p(new mq.y0.RestartCamera(false, false, a(renderContext, false), y0Var.getCameraFacingMode(), 3, null));
        }
    }

    @NotNull
    public static final mq.y0 e(@NotNull ls.g<mq.y0> gVar, @NotNull PoseConfigs poseConfigs, @NotNull List<? extends mq.b0> selfies, @Nullable String str, @NotNull sn.v cameraProperties, long j10, @Nullable mq.y0 y0Var) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            mq.b0 b0Var = (mq.b0) obj;
            if (b0Var instanceof mq.b0.SelfieImage ? poseConfigs.a(((mq.b0.SelfieImage) b0Var).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            ls.h hVarI = gVar.i();
            if (hVarI != null) {
                return new mq.y0.Submit(selfies, str, cameraProperties, j10, y0Var, ((mq.y0) hVarI).getCameraFacingMode(), 0, null, 192, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        ls.h hVarI2 = gVar.i();
        if (hVarI2 != null) {
            return new mq.y0.j(selfies, arrayList, str, cameraProperties, j10, y0Var, ((mq.y0) hVarI2).getCameraFacingMode());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final dr.j f(@NotNull mq.y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        if (y0Var instanceof mq.y0.ShowInstructions) {
            return dr.j.e.f12651a;
        }
        if (y0Var instanceof mq.y0.ShowPoseHint) {
            xn.a aVarN = ((mq.y0.ShowPoseHint) y0Var).n();
            return new dr.j.LeadInAnimation(aVarN != null ? mq.m0.a(aVarN) : null);
        }
        if (y0Var instanceof mq.y0.RestartCamera) {
            return new dr.j.TakePhoto(null);
        }
        if (y0Var instanceof mq.y0.AcquireNextPose) {
            return new dr.j.LeadInAnimation(null);
        }
        if (y0Var instanceof mq.a) {
            xn.a aVarN2 = ((mq.a) y0Var).n();
            return new dr.j.TakePhoto(aVarN2 != null ? mq.m0.a(aVarN2) : null);
        }
        if (y0Var instanceof mq.y0.c) {
            return f(((mq.y0.c) y0Var).getNextState());
        }
        if ((y0Var instanceof mq.y0.FinalizeLocalVideoCapture) || (y0Var instanceof mq.y0.g) || (y0Var instanceof mq.y0.r)) {
            return dr.j.b.f12648a;
        }
        if (y0Var instanceof mq.y0.j) {
            return dr.j.a.f12647a;
        }
        if (y0Var instanceof mq.y0.Submit) {
            return dr.j.d.f12650a;
        }
        if (y0Var instanceof mq.y0.WaitForCameraFeed) {
            return new dr.j.TakePhoto(null);
        }
        throw new zt.l();
    }
}
