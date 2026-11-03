package com.withpersona.sdk2.inquiry.selfie;

import com.appsflyer.R;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import dn.n0;
import iu.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0012\u0016\u0014B=\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\u00020\t*\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Ltr/h;", "Lat/a;", "Ldn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "", "captureOnPoseDetected", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Loq/c;", "sdkFilesManager", "<init>", "(Lat/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Loq/c;)V", "otherWorker", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "b", "Llu/h;", "run", "()Llu/h;", "Lin/c;", "Lin/a;", "pose", "", "l", "(Lin/c;Lin/a;)F", "Lat/a;", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "d", "Z", "e", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "f", "Loq/c;", "", "g", "I", "numRetries", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "m", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)Z", "isLowLight", "h", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements wm.o<c>, tr.h<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final at.a<n0> selfieDirectionFeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PoseInfo poseInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean captureOnPoseDetected;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g selfieEventLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int numRetries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "", "captureOnPoseDetected", "Lcom/withpersona/sdk2/inquiry/selfie/e;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        e a(@NotNull g selfieEventLogger, @NotNull PoseInfo poseInfo, boolean captureOnPoseDetected);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "", "<init>", "()V", "a", "c", "b", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "isDimLightConditions", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "c", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "b", "F", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "d", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Selfie selfie;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final boolean isDimLightConditions;

            public a(@Nullable Selfie selfie, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, boolean z10) {
                super(null);
                this.selfie = selfie;
                this.poseScore = f10;
                this.brightnessInfo = selfieBrightnessInfo;
                this.isDimLightConditions = z10;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            @Nullable
            /* JADX INFO: renamed from: c, reason: from getter */
            public final Selfie getSelfie() {
                return this.selfie;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Lin/b;", "error", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "isDimLightConditions", "<init>", "(Lin/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Z)V", "a", "Lin/b;", "b", "()Lin/b;", "F", "c", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "d", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0243c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final in.b error;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final boolean isDimLightConditions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0243c(@NotNull in.b error, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.poseScore = f10;
                this.brightnessInfo = selfieBrightnessInfo;
                this.isDimLightConditions = z10;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final in.b getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13024a;

        static {
            int[] iArr = new int[in.a.values().length];
            try {
                iArr[in.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[in.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[in.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[in.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13024a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0244e implements lu.h<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h f13025a;
        public final /* synthetic */ e b;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$e$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.i f13026a;
            public final /* synthetic */ e b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$e$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "SelfieAnalyzeWorker.kt", l = {105, R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "emit")
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0245a extends nt.d {
                public Object A;
                public Object B;
                public Object C;
                public Object D;
                public Object E;
                public int F;
                public int G;
                public int H;
                public int I;
                public boolean J;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f13027t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f13028u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f13029v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f13031x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f13032y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f13033z;

                public C0245a(lt.b bVar) {
                    super(bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f13027t = obj;
                    this.f13028u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(lu.i iVar, e eVar) {
                this.f13026a = iVar;
                this.b = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x019e  */
            /* JADX WARN: Code duplicated, block: B:58:0x01af  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
            
                if (r15.emit(r8, r0) == r1) goto L60;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [in.c, int] */
            @Override // lu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, lt.b r15) {
                /*
                    Method dump skipped, instruction units count: 505
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.e.C0244e.a.emit(java.lang.Object, lt.b):java.lang.Object");
            }
        }

        public C0244e(lu.h hVar, e eVar) {
            this.f13025a = hVar;
            this.b = eVar;
        }

        @Override // lu.h
        public Object collect(lu.i<? super c> iVar, lt.b bVar) {
            Object objCollect = this.f13025a.collect(new a(iVar, this.b), bVar);
            return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
        }
    }

    public e(@NotNull at.a<n0> selfieDirectionFeed, @NotNull PoseInfo poseInfo, boolean z10, @NotNull g selfieEventLogger, @NotNull oq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(poseInfo, "poseInfo");
        Intrinsics.checkNotNullParameter(selfieEventLogger, "selfieEventLogger");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.poseInfo = poseInfo;
        this.captureOnPoseDetected = z10;
        this.selfieEventLogger = selfieEventLogger;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof e)) {
            return false;
        }
        e eVar = (e) otherWorker;
        return Intrinsics.c(eVar.poseInfo, this.poseInfo) && eVar.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof e;
    }

    @Override // wm.o
    public boolean c(@NotNull wm.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof e)) {
            return false;
        }
        e eVar = (e) otherWorker;
        return Intrinsics.c(eVar.poseInfo, this.poseInfo) && eVar.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    public final float l(in.c cVar, in.a aVar) {
        float fMin;
        if (cVar.getFacesInFrame() != 1) {
            return 0.0f;
        }
        int i10 = d.f13024a[aVar.ordinal()];
        if (i10 == 1) {
            boolean z10 = (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar()) ? false : true;
            boolean isFaceCentered = cVar.getIsFaceCentered();
            float fI = kotlin.ranges.d.i((Math.abs(cVar.getFaceAngleY()) - 10.0f) / 90.0f, 0.0f, 1.0f);
            float f10 = z10 ? 0.33f : 0.0f;
            if (isFaceCentered) {
                f10 += 0.17f;
            }
            return fI > 0.0f ? f10 + (fI * 0.5f) : f10;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new gt.l();
                    }
                    if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    fMin = Math.min(Math.abs(((-5.0f) - cVar.getFaceAngleX()) / (-5.0f)), 1.0f);
                } else {
                    if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    fMin = Math.min(Math.abs((10.0f - cVar.getFaceAngleX()) / 10.0f), 1.0f);
                }
            } else {
                if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                    return 0.0f;
                }
                fMin = Math.min(Math.abs(((-15.0f) - cVar.getFaceAngleY()) / (-15.0f)), 1.0f);
            }
        } else {
            if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                return 0.0f;
            }
            fMin = Math.min(Math.abs((15.0f - cVar.getFaceAngleY()) / 15.0f), 1.0f);
        }
        return 1.0f - fMin;
    }

    public final boolean m(ImageLightCondition imageLightCondition) {
        if (imageLightCondition == null) {
            return false;
        }
        return (imageLightCondition.getLuminosity() < 0.34d && !((imageLightCondition.getRmsContrast() > 0.3d ? 1 : (imageLightCondition.getRmsContrast() == 0.3d ? 0 : -1)) > 0 && (imageLightCondition.getLowHighContrast() > 0.5d ? 1 : (imageLightCondition.getLowHighContrast() == 0.5d ? 0 : -1)) > 0)) || (imageLightCondition.getLuminosity() < 0.45d && ((imageLightCondition.getRmsContrast() > 0.2d ? 1 : (imageLightCondition.getRmsContrast() == 0.2d ? 0 : -1)) < 0 || (imageLightCondition.getLowHighContrast() > 0.2d ? 1 : (imageLightCondition.getLowHighContrast() == 0.2d ? 0 : -1)) < 0));
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<c> run() {
        n0 n0Var = this.selfieDirectionFeed.get();
        Intrinsics.checkNotNullExpressionValue(n0Var, "get(...)");
        return lu.j.y(new C0244e(lu.j.n(n0Var, 1), this), g1.a());
    }
}
