package p140g0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p182i0.AbstractC6600b;
import p204j0.EnumC7013c;
import p229jt.C7345l;
import p233k0.EnumC7401b;
import p296n0.AbstractC8827t3;
import p366q0.C10417c;
import p424s0.C11145f;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: g0.g2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b-\u0010#R\u001a\u00101\u001a\u00020\n8WX\u0096D¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R<\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f022\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b'\u00105R$\u0010:\u001a\u0002072\u0006\u00103\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b+\u00109R\u001a\u0010<\u001a\u00020;8WX\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, m31665d2 = {"Lg0/g2;", "", "", "Lg0/w2;", "useCases", "Lg0/y2;", "viewPort", "Lg0/n;", "effects", "Landroid/util/Range;", "", "frameRateRange", "", "Li0/b;", "requiredFeatureGroup", "preferredFeatureGroup", "<init>", "(Ljava/util/List;Lg0/y2;Ljava/util/List;Landroid/util/Range;Ljava/util/Set;Ljava/util/List;)V", "", "p", "()V", "o", "q", "n", "(Lg0/w2;)V", "", "j", "(Lg0/w2;)Ljava/lang/String;", "a", "Lg0/y2;", "l", "()Lg0/y2;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Landroid/util/Range;", "f", "()Landroid/util/Range;", "d", "Ljava/util/Set;", "h", "()Ljava/util/Set;", "e", "g", "k", "I", "i", "()I", "sessionType", "Lx2/a;", "value", "Lx2/a;", "()Lx2/a;", "featureSelectionListener", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "featureSelectionListenerExecutor", "", "isLegacy", "Z", "m", "()Z", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C5888g2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final C5960y2 viewPort;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC5913n> effects;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Range<Integer> frameRateRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Set<AbstractC6600b> requiredFeatureGroup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC6600b> preferredFeatureGroup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC5952w2> useCases;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int sessionType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public InterfaceC12631a<Set<AbstractC6600b>> featureSelectionListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Executor featureSelectionListenerExecutor;

    /* JADX INFO: renamed from: g0.g2$a */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22512a;

        static {
            int[] iArr = new int[EnumC7401b.values().length];
            try {
                iArr[EnumC7401b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7401b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7401b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7401b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22512a = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends g0.n> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Set<? extends i0.b> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends i0.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5888g2(@NotNull List<? extends AbstractC5952w2> useCases, @Nullable C5960y2 c5960y2, @NotNull List<? extends AbstractC5913n> effects, @NotNull Range<Integer> frameRateRange, @NotNull Set<? extends AbstractC6600b> requiredFeatureGroup, @NotNull List<? extends AbstractC6600b> preferredFeatureGroup) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(frameRateRange, "frameRateRange");
        Intrinsics.checkNotNullParameter(requiredFeatureGroup, "requiredFeatureGroup");
        Intrinsics.checkNotNullParameter(preferredFeatureGroup, "preferredFeatureGroup");
        this.viewPort = c5960y2;
        this.effects = effects;
        this.frameRateRange = frameRateRange;
        this.requiredFeatureGroup = requiredFeatureGroup;
        this.preferredFeatureGroup = preferredFeatureGroup;
        this.useCases = CollectionsKt.m31700X(useCases);
        this.featureSelectionListener = new InterfaceC12631a() { // from class: g0.f2
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C5888g2.m26465b((Set) obj);
            }
        };
        ScheduledExecutorService scheduledExecutorServiceM40084e = C10417c.m40084e();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceM40084e, "mainThreadExecutor(...)");
        this.featureSelectionListenerExecutor = scheduledExecutorServiceM40084e;
        m26479p();
        m26478o();
    }

    /* JADX INFO: renamed from: b */
    public static final void m26465b(Set set) {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<AbstractC5913n> m26466c() {
        return this.effects;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC12631a<Set<AbstractC6600b>> m26467d() {
        return this.featureSelectionListener;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Executor getFeatureSelectionListenerExecutor() {
        return this.featureSelectionListenerExecutor;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Range<Integer> m26469f() {
        return this.frameRateRange;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<AbstractC6600b> m26470g() {
        return this.preferredFeatureGroup;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Set<AbstractC6600b> m26471h() {
        return this.requiredFeatureGroup;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public int getSessionType() {
        return this.sessionType;
    }

    /* JADX INFO: renamed from: j */
    public final String m26473j(AbstractC5952w2 abstractC5952w2) {
        if (abstractC5952w2 instanceof C5864a2) {
            return "Preview";
        }
        if (abstractC5952w2 instanceof C5883f1) {
            return "ImageCapture";
        }
        if (abstractC5952w2 instanceof C5942u0) {
            return "ImageAnalysis";
        }
        return C11145f.m41959e0(abstractC5952w2) ? "VideoCapture" : "UseCase";
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<AbstractC5952w2> m26474k() {
        return this.useCases;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final C5960y2 getViewPort() {
        return this.viewPort;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo26476m() {
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final void m26477n(AbstractC5952w2 abstractC5952w2) {
        String str;
        String str2;
        String str3;
        String strM26473j = m26473j(abstractC5952w2);
        EnumC7401b enumC7401bM29683a = EnumC7013c.INSTANCE.m29683a(abstractC5952w2);
        if (enumC7401bM29683a == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("A ");
        Intrinsics.checkNotNull(enumC7401bM29683a);
        sb2.append(enumC7401bM29683a.name());
        sb2.append(" value is set to ");
        sb2.append(strM26473j);
        sb2.append(" despite using feature groups. Do not use APIs like ");
        sb2.append(strM26473j);
        sb2.append(".Builder.");
        int[] iArr = a.f22512a;
        int i10 = iArr[enumC7401bM29683a.ordinal()];
        if (i10 == 1) {
            str = "setDynamicRange";
        } else if (i10 == 2) {
            str = "setTargetFrameRateRange";
        } else if (i10 == 3) {
            str = C11145f.m41959e0(abstractC5952w2) ? "setVideoStabilizationEnabled" : "setPreviewStabilizationEnabled";
        } else {
            if (i10 != 4) {
                throw new C7345l();
            }
            str = "setOutputFormat";
        }
        sb2.append(str);
        sb2.append(" while using feature groups. If ");
        int i11 = iArr[enumC7401bM29683a.ordinal()];
        if (i11 == 1) {
            str2 = "HDR";
        } else if (i11 == 2) {
            str2 = "60 FPS";
        } else if (i11 == 3) {
            str2 = "stabilization";
        } else {
            if (i11 != 4) {
                throw new C7345l();
            }
            str2 = "JPEG_R output format";
        }
        sb2.append(str2);
        sb2.append(" is required, instead set ");
        int i12 = iArr[enumC7401bM29683a.ordinal()];
        if (i12 == 1) {
            str3 = "GroupableFeature.HDR_HLG10";
        } else if (i12 == 2) {
            str3 = "GroupableFeature.FPS_60";
        } else if (i12 == 3) {
            str3 = "GroupableFeature.PREVIEW_STABILIZATION";
        } else {
            if (i12 != 4) {
                throw new C7345l();
            }
            str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
        }
        sb2.append(str3);
        sb2.append(" as either a required or preferred feature.");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX INFO: renamed from: o */
    public final void m26478o() {
        if (this.requiredFeatureGroup.isEmpty() && this.preferredFeatureGroup.isEmpty()) {
            return;
        }
        m26480q();
        if (CollectionsKt.m31700X(this.preferredFeatureGroup).size() != this.preferredFeatureGroup.size()) {
            throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + this.preferredFeatureGroup + ')').toString());
        }
        Set setI0 = CollectionsKt.m31711i0(this.requiredFeatureGroup, this.preferredFeatureGroup);
        if (!setI0.isEmpty()) {
            throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setI0).toString());
        }
        for (AbstractC5952w2 abstractC5952w2 : this.useCases) {
            if (EnumC7013c.INSTANCE.m29684b(abstractC5952w2) == EnumC7013c.UNDEFINED) {
                throw new IllegalArgumentException((abstractC5952w2 + " is not supported with feature group").toString());
            }
            m26477n(abstractC5952w2);
        }
        if (!this.effects.isEmpty()) {
            throw new IllegalArgumentException("Effects aren't supported with feature group yet");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m26479p() {
        if (Intrinsics.m31980c(this.frameRateRange, AbstractC8827t3.f32104a)) {
            return;
        }
        Iterator<AbstractC5952w2> it = this.useCases.iterator();
        while (it.hasNext()) {
            if (it.next().m26698e().m35209f0()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m26480q() {
        Set<AbstractC6600b> set = this.requiredFeatureGroup;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6600b) it.next()).getFeatureTypeInternal());
        }
        for (EnumC7401b enumC7401b : CollectionsKt.m31700X(arrayList)) {
            Set<AbstractC6600b> set2 = this.requiredFeatureGroup;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((AbstractC6600b) obj).getFeatureTypeInternal() == enumC7401b) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
      (r8v0 java.util.List)
      (wrap g0.y2:0x0005: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null g0.y2) : (r9v0 g0.y2))
      (wrap java.util.List:0x000e: TERNARY null = ((wrap int:0x0006: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.List:0x000a: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r10v0 java.util.List))
      (wrap android.util.Range:0x0015: TERNARY null = ((wrap int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap android.util.Range:0x0013: SGET  A[WRAPPED] (LINE:13) n0.t3.a android.util.Range) : (r11v0 android.util.Range))
      (wrap java.util.Set:0x001e: TERNARY null = ((wrap int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x001a: INVOKE  STATIC call: kotlin.collections.q0.d():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:14)) : (r12v0 java.util.Set))
      (wrap java.util.List:?: TERNARY null = ((wrap int:0x001f: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.List:0x0023: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r13v0 java.util.List))
     A[MD:(java.util.List<? extends g0.w2>, g0.y2, java.util.List<? extends g0.n>, android.util.Range<java.lang.Integer>, java.util.Set<? extends i0.b>, java.util.List<? extends i0.b>):void (m)] (LINE:16) call: g0.g2.<init>(java.util.List, g0.y2, java.util.List, android.util.Range, java.util.Set, java.util.List):void type: THIS */
    public /* synthetic */ C5888g2(List list, C5960y2 c5960y2, List list2, Range range, Set set, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : c5960y2, (i10 & 4) != 0 ? C7699p.m31892k() : list2, (i10 & 8) != 0 ? AbstractC8827t3.f32104a : range, (i10 & 16) != 0 ? C7702q0.m31908d() : set, (i10 & 32) != 0 ? C7699p.m31892k() : list3);
    }
}
