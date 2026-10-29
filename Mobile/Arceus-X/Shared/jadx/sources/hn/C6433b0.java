package hn;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152go.C6155b0;
import p152go.C6159e;
import p152go.C6175u;
import p276ln.InterfaceC8169a;
import p279lq.C8235a;
import p363pq.C10309c;
import p391qq.C10700c;
import p476ur.InterfaceC11932a;

/* JADX INFO: renamed from: hn.b0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001(B\u0087\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, m31665d2 = {"Lhn/b0;", "", "Landroid/content/Context;", "context", "Lln/a;", "cameraStatsManager", "Lqq/c;", "sdkFilesManager", "Lhn/i0;", "cameraChoiceHelper", "Llq/a;", "coroutineScopeFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lpq/c;", "externalEventLogger", "Lgo/e;", "featureFlagManager", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lln/a;Lqq/c;Lhn/i0;Llq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lpq/c;Lgo/e;Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)V", "", "f", "()V", "i", "()Z", "Lhn/s;", "h", "()Lhn/s;", "a", "Landroid/content/Context;", "b", "Lln/a;", "c", "Lqq/c;", "d", "Lhn/i0;", "e", "Llq/a;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "g", "Lpq/c;", "Lgo/e;", "Lhn/k0;", "j", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "k", "Lhn/g;", "l", "Lmn/a;", "m", "Lur/a;", "n", "Z", "", "o", "I", "choiceIndex", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6433b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C6447i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C8235a coroutineScopeFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final CameraChoices cameraChoices;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Camera2PreviewView previewView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6442g analyzer;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final EnumC8598a videoCaptureMethod;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC11932a webRtcManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int choiceIndex;

    /* JADX INFO: renamed from: hn.b0$a */
    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m31665d2 = {"Lhn/b0$a;", "", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "Lhn/b0;", "a", "(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/b0;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C6433b0 mo28046a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull InterfaceC6442g analyzer, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a webRtcManager, boolean isAudioRequired);
    }

    public C6433b0(@NotNull Context context, @NotNull InterfaceC8169a cameraStatsManager, @NotNull C10700c sdkFilesManager, @NotNull C6447i0 cameraChoiceHelper, @NotNull C8235a coroutineScopeFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull C10309c externalEventLogger, @NotNull C6159e featureFlagManager, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull InterfaceC6442g analyzer, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
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
        this.webRtcManager = interfaceC11932a;
        this.isAudioRequired = z10;
        Iterator<C6445h0> it = cameraChoices.m28109a().iterator();
        final int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else {
                if (!this.cameraChoiceHelper.m28105b(it.next())) {
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
                return C6433b0.m28040e(this.f24630a, i10);
            }
        }, false, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m28036a(C6433b0 c6433b0, String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return id2 + "=" + C6441f0.m28081d(c6433b0.context, id2);
    }

    /* JADX INFO: renamed from: e */
    public static final String m28040e(final C6433b0 c6433b0, int i10) {
        List<C6445h0> listM28109a = c6433b0.cameraChoices.m28109a();
        int i11 = 0;
        if (!(listM28109a instanceof Collection) || !listM28109a.isEmpty()) {
            Iterator<T> it = listM28109a.iterator();
            while (it.hasNext()) {
                if (c6433b0.cameraChoiceHelper.m28105b((C6445h0) it.next()) && (i11 = i11 + 1) < 0) {
                    C7699p.m31900s();
                }
            }
        }
        List<C6445h0> listM28109a2 = c6433b0.cameraChoices.m28109a();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM28109a2, 10));
        Iterator<T> it2 = listM28109a2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C6445h0) it2.next()).getId());
        }
        String strM0 = CollectionsKt.m31715m0(CollectionsKt.m31700X(arrayList), null, null, null, 0, null, new Function1() { // from class: hn.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6433b0.m28036a(this.f24632a, (String) obj);
            }
        }, 31, null);
        return "Camera2ManagerFactory created. choices=" + CollectionsKt.m31715m0(c6433b0.cameraChoices.m28109a(), null, null, null, 0, null, null, 63, null) + ", hardwareLevels=[" + strM0 + "], preMarkedBadCount=" + i11 + "/" + c6433b0.cameraChoices.m28109a().size() + ", startIndex=" + c6433b0.choiceIndex + (i10 == -1 ? " (ALL choices pre-marked bad, falling back to index 0)" : "");
    }

    /* JADX INFO: renamed from: g */
    public static final String m28041g(C6433b0 c6433b0) {
        return "Marking camera choice as bad: " + c6433b0.cameraChoices.m28109a().get(c6433b0.choiceIndex);
    }

    /* JADX INFO: renamed from: j */
    public static final String m28042j(C6433b0 c6433b0) {
        return "Skipping pre-marked-bad camera choice: " + c6433b0.cameraChoices.m28109a().get(c6433b0.choiceIndex);
    }

    /* JADX INFO: renamed from: f */
    public final void m28043f() {
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6433b0.m28041g(this.f24633a);
            }
        }, false, 4, null);
        this.cameraChoiceHelper.m28104a(this.cameraChoices.m28109a().get(this.choiceIndex));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C6466s m28044h() {
        return new C6466s(this.context, this.cameraChoices.m28109a().get(this.choiceIndex), this.previewView, this.analyzer, this.videoCaptureMethod, this.webRtcManager, this.isAudioRequired, this.cameraStatsManager, this.sdkFilesManager, this.coroutineScopeFactory, this.trackingEventsLogger, this.externalEventLogger, this.featureFlagManager.m27145a(C6155b0.f23520a), this.featureFlagManager.m27145a(C6175u.f23552a));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28045i() {
        while (this.choiceIndex + 1 < this.cameraChoices.m28109a().size()) {
            this.choiceIndex++;
            if (!this.cameraChoiceHelper.m28105b(this.cameraChoices.m28109a().get(this.choiceIndex))) {
                return true;
            }
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6433b0.m28042j(this.f24374a);
                }
            }, false, 4, null);
        }
        return false;
    }
}
