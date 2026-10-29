package g0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n0.t3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b-\u0010#R\u001a\u00101\u001a\u00020\n8WX\u0096D¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R<\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f022\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b'\u00105R$\u0010:\u001a\u0002072\u0006\u00103\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b+\u00109R\u001a\u0010<\u001a\u00020;8WX\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lg0/g2;", "", "", "Lg0/w2;", "useCases", "Lg0/y2;", "viewPort", "Lg0/n;", "effects", "Landroid/util/Range;", "", "frameRateRange", "", "Li0/b;", "requiredFeatureGroup", "preferredFeatureGroup", "<init>", "(Ljava/util/List;Lg0/y2;Ljava/util/List;Landroid/util/Range;Ljava/util/Set;Ljava/util/List;)V", "", "p", "()V", "o", "q", "n", "(Lg0/w2;)V", "", "j", "(Lg0/w2;)Ljava/lang/String;", "a", "Lg0/y2;", "l", "()Lg0/y2;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Landroid/util/Range;", "f", "()Landroid/util/Range;", "d", "Ljava/util/Set;", "h", "()Ljava/util/Set;", "e", "g", "k", "I", "i", "()I", "sessionType", "Lx2/a;", "value", "Lx2/a;", "()Lx2/a;", "featureSelectionListener", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "featureSelectionListenerExecutor", "", "isLegacy", "Z", "m", "()Z", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final y2 viewPort;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<n> effects;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Range<Integer> frameRateRange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<i0.b> requiredFeatureGroup;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<i0.b> preferredFeatureGroup;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<w2> useCases;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int sessionType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public x2.a<Set<i0.b>> featureSelectionListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Executor featureSelectionListenerExecutor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17440a;

        static {
            int[] iArr = new int[k0.b.values().length];
            try {
                iArr[k0.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17440a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g2(@NotNull List<? extends w2> useCases, @Nullable y2 y2Var, @NotNull List<? extends n> effects, @NotNull Range<Integer> frameRateRange, @NotNull Set<? extends i0.b> requiredFeatureGroup, @NotNull List<? extends i0.b> preferredFeatureGroup) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(frameRateRange, "frameRateRange");
        Intrinsics.checkNotNullParameter(requiredFeatureGroup, "requiredFeatureGroup");
        Intrinsics.checkNotNullParameter(preferredFeatureGroup, "preferredFeatureGroup");
        this.viewPort = y2Var;
        this.effects = effects;
        this.frameRateRange = frameRateRange;
        this.requiredFeatureGroup = requiredFeatureGroup;
        this.preferredFeatureGroup = preferredFeatureGroup;
        this.useCases = CollectionsKt.X(useCases);
        this.featureSelectionListener = new x2.a() { // from class: g0.f2
            @Override // x2.a
            public final void accept(Object obj) {
                g2.b((Set) obj);
            }
        };
        ScheduledExecutorService scheduledExecutorServiceE = q0.c.e();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceE, "mainThreadExecutor(...)");
        this.featureSelectionListenerExecutor = scheduledExecutorServiceE;
        p();
        o();
    }

    public static final void b(Set set) {
    }

    @NotNull
    public final List<n> c() {
        return this.effects;
    }

    @NotNull
    public final x2.a<Set<i0.b>> d() {
        return this.featureSelectionListener;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Executor getFeatureSelectionListenerExecutor() {
        return this.featureSelectionListenerExecutor;
    }

    @NotNull
    public final Range<Integer> f() {
        return this.frameRateRange;
    }

    @NotNull
    public final List<i0.b> g() {
        return this.preferredFeatureGroup;
    }

    @NotNull
    public final Set<i0.b> h() {
        return this.requiredFeatureGroup;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public int getSessionType() {
        return this.sessionType;
    }

    public final String j(w2 w2Var) {
        if (w2Var instanceof a2) {
            return "Preview";
        }
        if (w2Var instanceof f1) {
            return "ImageCapture";
        }
        if (w2Var instanceof u0) {
            return "ImageAnalysis";
        }
        return s0.f.e0(w2Var) ? "VideoCapture" : "UseCase";
    }

    @NotNull
    public final List<w2> k() {
        return this.useCases;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final y2 getViewPort() {
        return this.viewPort;
    }

    public boolean m() {
        throw null;
    }

    public final void n(w2 w2Var) {
        String str;
        String str2;
        String str3;
        String strJ = j(w2Var);
        k0.b bVarA = j0.c.INSTANCE.a(w2Var);
        if (bVarA == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("A ");
        Intrinsics.checkNotNull(bVarA);
        sb2.append(bVarA.name());
        sb2.append(" value is set to ");
        sb2.append(strJ);
        sb2.append(" despite using feature groups. Do not use APIs like ");
        sb2.append(strJ);
        sb2.append(".Builder.");
        int[] iArr = a.f17440a;
        int i10 = iArr[bVarA.ordinal()];
        if (i10 == 1) {
            str = "setDynamicRange";
        } else if (i10 == 2) {
            str = "setTargetFrameRateRange";
        } else if (i10 == 3) {
            str = s0.f.e0(w2Var) ? "setVideoStabilizationEnabled" : "setPreviewStabilizationEnabled";
        } else {
            if (i10 != 4) {
                throw new jt.l();
            }
            str = "setOutputFormat";
        }
        sb2.append(str);
        sb2.append(" while using feature groups. If ");
        int i11 = iArr[bVarA.ordinal()];
        if (i11 == 1) {
            str2 = "HDR";
        } else if (i11 == 2) {
            str2 = "60 FPS";
        } else if (i11 == 3) {
            str2 = "stabilization";
        } else {
            if (i11 != 4) {
                throw new jt.l();
            }
            str2 = "JPEG_R output format";
        }
        sb2.append(str2);
        sb2.append(" is required, instead set ");
        int i12 = iArr[bVarA.ordinal()];
        if (i12 == 1) {
            str3 = "GroupableFeature.HDR_HLG10";
        } else if (i12 == 2) {
            str3 = "GroupableFeature.FPS_60";
        } else if (i12 == 3) {
            str3 = "GroupableFeature.PREVIEW_STABILIZATION";
        } else {
            if (i12 != 4) {
                throw new jt.l();
            }
            str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
        }
        sb2.append(str3);
        sb2.append(" as either a required or preferred feature.");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void o() {
        if (this.requiredFeatureGroup.isEmpty() && this.preferredFeatureGroup.isEmpty()) {
            return;
        }
        q();
        if (CollectionsKt.X(this.preferredFeatureGroup).size() != this.preferredFeatureGroup.size()) {
            throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + this.preferredFeatureGroup + ')').toString());
        }
        Set setI0 = CollectionsKt.i0(this.requiredFeatureGroup, this.preferredFeatureGroup);
        if (!setI0.isEmpty()) {
            throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setI0).toString());
        }
        for (w2 w2Var : this.useCases) {
            if (j0.c.INSTANCE.b(w2Var) == j0.c.UNDEFINED) {
                throw new IllegalArgumentException((w2Var + " is not supported with feature group").toString());
            }
            n(w2Var);
        }
        if (!this.effects.isEmpty()) {
            throw new IllegalArgumentException("Effects aren't supported with feature group yet");
        }
    }

    public final void p() {
        if (Intrinsics.c(this.frameRateRange, t3.f24861a)) {
            return;
        }
        Iterator<w2> it = this.useCases.iterator();
        while (it.hasNext()) {
            if (it.next().e().f0()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    public final void q() {
        Set<i0.b> set = this.requiredFeatureGroup;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0.b) it.next()).getFeatureTypeInternal());
        }
        for (k0.b bVar : CollectionsKt.X(arrayList)) {
            Set<i0.b> set2 = this.requiredFeatureGroup;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((i0.b) obj).getFeatureTypeInternal() == bVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
            }
        }
    }

    public /* synthetic */ g2(List list, y2 y2Var, List list2, Range range, Set set, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : y2Var, (i10 & 4) != 0 ? kotlin.collections.p.k() : list2, (i10 & 8) != 0 ? t3.f24861a : range, (i10 & 16) != 0 ? kotlin.collections.q0.d() : set, (i10 & 32) != 0 ? kotlin.collections.p.k() : list3);
    }
}
