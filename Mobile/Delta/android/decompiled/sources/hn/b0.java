package hn;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001(B\u0087\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lhn/b0;", "", "Landroid/content/Context;", "context", "Lln/a;", "cameraStatsManager", "Lqq/c;", "sdkFilesManager", "Lhn/i0;", "cameraChoiceHelper", "Llq/a;", "coroutineScopeFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lpq/c;", "externalEventLogger", "Lgo/e;", "featureFlagManager", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lln/a;Lqq/c;Lhn/i0;Llq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lpq/c;Lgo/e;Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)V", "", "f", "()V", "i", "()Z", "Lhn/s;", "h", "()Lhn/s;", "a", "Landroid/content/Context;", "b", "Lln/a;", "c", "Lqq/c;", "d", "Lhn/i0;", "e", "Llq/a;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "g", "Lpq/c;", "Lgo/e;", "Lhn/k0;", "j", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "k", "Lhn/g;", "l", "Lmn/a;", "m", "Lur/a;", "n", "Z", "", "o", "I", "choiceIndex", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ln.a cameraStatsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lq.a coroutineScopeFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.c externalEventLogger;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.e featureFlagManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraChoices cameraChoices;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Camera2PreviewView previewView;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g analyzer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mn.a videoCaptureMethod;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ur.a webRtcManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int choiceIndex;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lhn/b0$a;", "", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "Lhn/b0;", "a", "(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/b0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        b0 a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull g analyzer, @NotNull mn.a videoCaptureMethod, @Nullable ur.a webRtcManager, boolean isAudioRequired);
    }

    public b0(@NotNull Context context, @NotNull ln.a cameraStatsManager, @NotNull qq.c sdkFilesManager, @NotNull i0 cameraChoiceHelper, @NotNull lq.a coroutineScopeFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull pq.c externalEventLogger, @NotNull go.e featureFlagManager, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull g analyzer, @NotNull mn.a videoCaptureMethod, @Nullable ur.a aVar, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(cameraChoiceHelper, "cameraChoiceHelper");
        Intrinsics.checkNotNullParameter(coroutineScopeFactory, "coroutineScopeFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(cameraChoices, "cameraChoices");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        this.context = context;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.coroutineScopeFactory = coroutineScopeFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.cameraChoices = cameraChoices;
        this.previewView = previewView;
        this.analyzer = analyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.webRtcManager = aVar;
        this.isAudioRequired = z10;
        Iterator<h0> it = cameraChoices.a().iterator();
        final int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else {
                if (!this.cameraChoiceHelper.b(it.next())) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.choiceIndex = i10 != -1 ? i10 : 0;
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.e(this.f19561a, i10);
            }
        }, false, 4, null);
    }

    public static CharSequence a(b0 b0Var, String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return id2 + "=" + f0.d(b0Var.context, id2);
    }

    public static final String e(final b0 b0Var, int i10) {
        List<h0> listA = b0Var.cameraChoices.a();
        int i11 = 0;
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                if (b0Var.cameraChoiceHelper.b((h0) it.next()) && (i11 = i11 + 1) < 0) {
                    kotlin.collections.p.s();
                }
            }
        }
        List<h0> listA2 = b0Var.cameraChoices.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listA2, 10));
        Iterator<T> it2 = listA2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((h0) it2.next()).getId());
        }
        String strM0 = CollectionsKt.m0(CollectionsKt.X(arrayList), null, null, null, 0, null, new Function1() { // from class: hn.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.a(this.f19562a, (String) obj);
            }
        }, 31, null);
        return "Camera2ManagerFactory created. choices=" + CollectionsKt.m0(b0Var.cameraChoices.a(), null, null, null, 0, null, null, 63, null) + ", hardwareLevels=[" + strM0 + "], preMarkedBadCount=" + i11 + "/" + b0Var.cameraChoices.a().size() + ", startIndex=" + b0Var.choiceIndex + (i10 == -1 ? " (ALL choices pre-marked bad, falling back to index 0)" : "");
    }

    public static final String g(b0 b0Var) {
        return "Marking camera choice as bad: " + b0Var.cameraChoices.a().get(b0Var.choiceIndex);
    }

    public static final String j(b0 b0Var) {
        return "Skipping pre-marked-bad camera choice: " + b0Var.cameraChoices.a().get(b0Var.choiceIndex);
    }

    public final void f() {
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.g(this.f19563a);
            }
        }, false, 4, null);
        this.cameraChoiceHelper.a(this.cameraChoices.a().get(this.choiceIndex));
    }

    @NotNull
    public final s h() {
        return new s(this.context, this.cameraChoices.a().get(this.choiceIndex), this.previewView, this.analyzer, this.videoCaptureMethod, this.webRtcManager, this.isAudioRequired, this.cameraStatsManager, this.sdkFilesManager, this.coroutineScopeFactory, this.trackingEventsLogger, this.externalEventLogger, this.featureFlagManager.a(go.b0.f18288a), this.featureFlagManager.a(go.u.f18314a));
    }

    public final boolean i() {
        while (this.choiceIndex + 1 < this.cameraChoices.a().size()) {
            this.choiceIndex++;
            if (!this.cameraChoiceHelper.b(this.cameraChoices.a().get(this.choiceIndex))) {
                return true;
            }
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b0.j(this.f19347a);
                }
            }, false, 4, null);
        }
        return false;
    }
}
