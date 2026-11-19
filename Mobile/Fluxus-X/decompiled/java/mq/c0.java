package mq;

import android.graphics.Bitmap;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import rq.PoseInfo;
import sn.ImageLightCondition;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0014\u0016\u0012B=\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\u00020\t*\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lmq/c0;", "Lln/o;", "Lmq/c0$c;", "Lls/j;", "Ltt/a;", "Lsn/b1;", "selfieDirectionFeed", "Lrq/a;", "poseInfo", BuildConfig.FLAVOR, "captureOnPoseDetected", "Lmq/f0;", "selfieEventLogger", "Ler/c;", "sdkFilesManager", "<init>", "(Ltt/a;Lrq/a;ZLmq/f0;Ler/c;)V", "otherWorker", "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "b", "Ldv/h;", "run", "()Ldv/h;", "Lxn/d;", "Lxn/a;", "pose", BuildConfig.FLAVOR, "l", "(Lxn/d;Lxn/a;)F", "Ltt/a;", "Lrq/a;", "d", "Z", "e", "Lmq/f0;", "f", "Ler/c;", BuildConfig.FLAVOR, "g", "I", "numRetries", "Lsn/k0;", "m", "(Lsn/k0;)Z", "isLowLight", "h", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements ln.o<c>, ls.j<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final tt.a<sn.b1> selfieDirectionFeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PoseInfo poseInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean captureOnPoseDetected;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f0 selfieEventLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int numRetries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lmq/c0$b;", BuildConfig.FLAVOR, "Lmq/f0;", "selfieEventLogger", "Lrq/a;", "poseInfo", BuildConfig.FLAVOR, "captureOnPoseDetected", "Lmq/c0;", "a", "(Lmq/f0;Lrq/a;Z)Lmq/c0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        c0 a(@NotNull f0 selfieEventLogger, @NotNull PoseInfo poseInfo, boolean captureOnPoseDetected);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lmq/c0$c;", BuildConfig.FLAVOR, "<init>", "()V", "a", "c", "b", "Lmq/c0$c$a;", "Lmq/c0$c$b;", "Lmq/c0$c$c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmq/c0$c$a;", "Lmq/c0$c;", "Lmq/b0;", "selfie", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", BuildConfig.FLAVOR, "isDimLightConditions", "<init>", "(Lmq/b0;FLxn/b;Z)V", "a", "Lmq/b0;", "c", "()Lmq/b0;", "b", "F", "()F", "Lxn/b;", "()Lxn/b;", "d", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final b0 selfie;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final xn.b brightnessInfo;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final boolean isDimLightConditions;

            public a(@Nullable b0 b0Var, float f10, @Nullable xn.b bVar, boolean z10) {
                super(null);
                this.selfie = b0Var;
                this.poseScore = f10;
                this.brightnessInfo = bVar;
                this.isDimLightConditions = z10;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final xn.b getBrightnessInfo() {
                return this.brightnessInfo;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            @Nullable
            /* JADX INFO: renamed from: c, reason: from getter */
            public final b0 getSelfie() {
                return this.selfie;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lmq/c0$c$b;", "Lmq/c0$c;", BuildConfig.FLAVOR, "error", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: mq.c0$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmq/c0$c$c;", "Lmq/c0$c;", "Lxn/c;", "error", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", BuildConfig.FLAVOR, "isDimLightConditions", "<init>", "(Lxn/c;FLxn/b;Z)V", "a", "Lxn/c;", "b", "()Lxn/c;", "F", "c", "()F", "Lxn/b;", "()Lxn/b;", "d", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0461c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final xn.c error;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final xn.b brightnessInfo;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final boolean isDimLightConditions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0461c(@NotNull xn.c error, float f10, @Nullable xn.b bVar, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.poseScore = f10;
                this.brightnessInfo = bVar;
                this.isDimLightConditions = z10;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final xn.b getBrightnessInfo() {
                return this.brightnessInfo;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final xn.c getError() {
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
        public static final /* synthetic */ int[] f23538a;

        static {
            int[] iArr = new int[xn.a.values().length];
            try {
                iArr[xn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[xn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f23538a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements dv.h<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f23539a;
        public final /* synthetic */ c0 b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i f23540a;
            public final /* synthetic */ c0 b;

            /* JADX INFO: renamed from: mq.c0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "SelfieAnalyzeWorker.kt", l = {105, 124}, m = "emit")
            public static final class C0462a extends gu.d {
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
                public /* synthetic */ Object f23541t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f23542u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f23543v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f23545x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f23546y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f23547z;

                public C0462a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f23541t = obj;
                    this.f23542u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(dv.i iVar, c0 c0Var) {
                this.f23540a = iVar;
                this.b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:52:0x019e  */
            /* JADX WARN: Code duplicated, block: B:58:0x01af  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
            
                if (r15.emit(r8, r0) == r1) goto L60;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [int, xn.d] */
            @Override // dv.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, eu.b bVar) {
                C0462a c0462a;
                Bitmap bitmap;
                xn.d dVar;
                int i10;
                Object c0461c;
                Object obj2;
                dv.i iVar;
                C0462a c0462a2;
                Object c0461c2;
                dv.i iVar2;
                sn.d1 selfiePhoto;
                Bitmap bitmap2;
                if (bVar instanceof C0462a) {
                    c0462a = (C0462a) bVar;
                    int i11 = c0462a.f23542u;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0462a.f23542u = i11 - Integer.MIN_VALUE;
                    } else {
                        c0462a = new C0462a(bVar);
                    }
                } else {
                    c0462a = new C0462a(bVar);
                }
                Object obj3 = c0462a.f23541t;
                Object objE = fu.c.e();
                ?? r10 = c0462a.f23542u;
                try {
                    if (r10 != 0) {
                        if (r10 == 1) {
                            int i12 = c0462a.F;
                            dVar = (xn.d) c0462a.D;
                            dv.i iVar3 = (dv.i) c0462a.f23547z;
                            obj2 = c0462a.f23546y;
                            c0462a2 = (C0462a) c0462a.f23545x;
                            Object obj4 = c0462a.f23543v;
                            zt.o.b(obj3);
                            i10 = i12;
                            obj = obj4;
                            iVar = iVar3;
                        } else {
                            if (r10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zt.o.b(obj3);
                        }
                        return Unit.f21506a;
                    }
                    zt.o.b(obj3);
                    dv.i iVar4 = this.f23540a;
                    dVar = (xn.d) obj;
                    c0 c0Var = this.b;
                    boolean zM = c0Var.m(dVar.getLightCondition());
                    sn.d1 selfiePhoto2 = dVar.getSelfiePhoto();
                    this.b.selfieEventLogger.h(this.b.poseInfo.getPose(), dVar);
                    i10 = 0;
                    if (selfiePhoto2 != null) {
                        if (m0.d(selfiePhoto2) != this.b.poseInfo.getPose()) {
                            xn.c cVar = xn.c.IncorrectPose;
                            c0 c0Var2 = this.b;
                            c0461c2 = new c.C0461c(cVar, c0Var2.l(dVar, c0Var2.poseInfo.getPose()), dVar.getBrightnessInfo(), zM);
                        } else if (this.b.captureOnPoseDetected) {
                            Object objB = m0.b(selfiePhoto2, this.b.sdkFilesManager, this.b.poseInfo);
                            Throwable thE = zt.n.e(objB);
                            if (thE == null) {
                                c0461c2 = new c.a((b0) objB, 1.0f, dVar.getBrightnessInfo(), zM);
                            } else {
                                c0461c = new c.b(thE);
                            }
                        } else {
                            c0461c2 = new c.a(null, 1.0f, dVar.getBrightnessInfo(), zM);
                        }
                        obj2 = obj;
                        c0462a2 = c0462a;
                        iVar2 = iVar4;
                        selfiePhoto = dVar.getSelfiePhoto();
                        if (selfiePhoto != null && (bitmap2 = selfiePhoto.getBitmap()) != null && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        if (c0461c2 != null) {
                            c0462a.f23543v = gu.l.a(obj);
                            c0462a.f23545x = gu.l.a(c0462a2);
                            c0462a.f23546y = gu.l.a(obj2);
                            c0462a.f23547z = gu.l.a(iVar2);
                            c0462a.A = gu.l.a(c0461c2);
                            c0462a.B = null;
                            c0462a.C = null;
                            c0462a.D = null;
                            c0462a.E = null;
                            c0462a.F = i10;
                            c0462a.f23542u = 2;
                        }
                        return Unit.f21506a;
                    }
                    xn.c error = dVar.getError();
                    xn.c cVar2 = xn.c.FaceDetectionUnsupported;
                    if (error == cVar2) {
                        this.b.numRetries++;
                        if (this.b.numRetries >= 6) {
                            c0461c = new c.C0461c(cVar2, 0.0f, dVar.getBrightnessInfo(), zM);
                        } else {
                            c0462a.f23543v = gu.l.a(obj);
                            c0462a.f23545x = gu.l.a(c0462a);
                            c0462a.f23546y = gu.l.a(obj);
                            c0462a.f23547z = iVar4;
                            c0462a.A = gu.l.a(c0462a);
                            c0462a.B = gu.l.a(dVar);
                            c0462a.C = gu.l.a(c0Var);
                            c0462a.D = dVar;
                            c0462a.E = gu.l.a(selfiePhoto2);
                            c0462a.F = 0;
                            c0462a.G = 0;
                            c0462a.H = 0;
                            c0462a.I = 0;
                            c0462a.J = zM;
                            c0462a.f23542u = 1;
                            if (av.z0.b(500L, c0462a) != objE) {
                                obj2 = obj;
                                iVar = iVar4;
                                c0462a2 = c0462a;
                            }
                        }
                        return objE;
                    }
                    xn.c error2 = dVar.getError();
                    if (error2 == null) {
                        error2 = xn.c.Other;
                    }
                    c0 c0Var3 = this.b;
                    c0461c = new c.C0461c(error2, c0Var3.l(dVar, c0Var3.poseInfo.getPose()), dVar.getBrightnessInfo(), zM);
                    obj2 = obj;
                    c0462a2 = c0462a;
                    c0461c2 = c0461c;
                    iVar2 = iVar4;
                    selfiePhoto = dVar.getSelfiePhoto();
                    if (selfiePhoto != null) {
                        bitmap2.recycle();
                    }
                    if (c0461c2 != null) {
                        c0462a.f23543v = gu.l.a(obj);
                        c0462a.f23545x = gu.l.a(c0462a2);
                        c0462a.f23546y = gu.l.a(obj2);
                        c0462a.f23547z = gu.l.a(iVar2);
                        c0462a.A = gu.l.a(c0461c2);
                        c0462a.B = null;
                        c0462a.C = null;
                        c0462a.D = null;
                        c0462a.E = null;
                        c0462a.F = i10;
                        c0462a.f23542u = 2;
                    }
                    return Unit.f21506a;
                    iVar2 = iVar;
                    c0461c2 = null;
                    selfiePhoto = dVar.getSelfiePhoto();
                    if (selfiePhoto != null) {
                        bitmap2.recycle();
                    }
                    if (c0461c2 != null) {
                        c0462a.f23543v = gu.l.a(obj);
                        c0462a.f23545x = gu.l.a(c0462a2);
                        c0462a.f23546y = gu.l.a(obj2);
                        c0462a.f23547z = gu.l.a(iVar2);
                        c0462a.A = gu.l.a(c0461c2);
                        c0462a.B = null;
                        c0462a.C = null;
                        c0462a.D = null;
                        c0462a.E = null;
                        c0462a.F = i10;
                        c0462a.f23542u = 2;
                    }
                    return Unit.f21506a;
                } catch (Throwable th2) {
                    sn.d1 selfiePhoto3 = r10.getSelfiePhoto();
                    if (selfiePhoto3 != null && (bitmap = selfiePhoto3.getBitmap()) != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    throw th2;
                }
            }
        }

        public e(dv.h hVar, c0 c0Var) {
            this.f23539a = hVar;
            this.b = c0Var;
        }

        @Override // dv.h
        public Object collect(dv.i<? super c> iVar, eu.b bVar) {
            Object objCollect = this.f23539a.collect(new a(iVar, this.b), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    public c0(@NotNull tt.a<sn.b1> selfieDirectionFeed, @NotNull PoseInfo poseInfo, boolean z10, @NotNull f0 selfieEventLogger, @NotNull er.c sdkFilesManager) {
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

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) otherWorker;
        return Intrinsics.c(c0Var.poseInfo, this.poseInfo) && c0Var.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof c0;
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) otherWorker;
        return Intrinsics.c(c0Var.poseInfo, this.poseInfo) && c0Var.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    public final float l(xn.d dVar, xn.a aVar) {
        float fMin;
        if (dVar.getFacesInFrame() != 1) {
            return 0.0f;
        }
        int i10 = d.f23538a[aVar.ordinal()];
        if (i10 == 1) {
            boolean z10 = (dVar.getIsFaceTooClose() || dVar.getIsFaceTooFar()) ? false : true;
            boolean isFaceCentered = dVar.getIsFaceCentered();
            float fI = p001kotlin.ranges.d.i((Math.abs(dVar.getFaceAngleY()) - 10.0f) / 90.0f, 0.0f, 1.0f);
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
                        throw new zt.l();
                    }
                    if (dVar.getIsFaceTooClose() || dVar.getIsFaceTooFar() || !dVar.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    fMin = Math.min(Math.abs(((-5.0f) - dVar.getFaceAngleX()) / (-5.0f)), 1.0f);
                } else {
                    if (dVar.getIsFaceTooClose() || dVar.getIsFaceTooFar() || !dVar.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    fMin = Math.min(Math.abs((10.0f - dVar.getFaceAngleX()) / 10.0f), 1.0f);
                }
            } else {
                if (dVar.getIsFaceTooClose() || dVar.getIsFaceTooFar() || !dVar.getIsFaceCentered()) {
                    return 0.0f;
                }
                fMin = Math.min(Math.abs(((-15.0f) - dVar.getFaceAngleY()) / (-15.0f)), 1.0f);
            }
        } else {
            if (dVar.getIsFaceTooClose() || dVar.getIsFaceTooFar() || !dVar.getIsFaceCentered()) {
                return 0.0f;
            }
            fMin = Math.min(Math.abs((15.0f - dVar.getFaceAngleY()) / 15.0f), 1.0f);
        }
        return 1.0f - fMin;
    }

    public final boolean m(ImageLightCondition imageLightCondition) {
        if (imageLightCondition == null) {
            return false;
        }
        return (imageLightCondition.getLuminosity() < 0.34d && !((imageLightCondition.getRmsContrast() > 0.3d ? 1 : (imageLightCondition.getRmsContrast() == 0.3d ? 0 : -1)) > 0 && (imageLightCondition.getLowHighContrast() > 0.5d ? 1 : (imageLightCondition.getLowHighContrast() == 0.5d ? 0 : -1)) > 0)) || (imageLightCondition.getLuminosity() < 0.45d && ((imageLightCondition.getRmsContrast() > 0.2d ? 1 : (imageLightCondition.getRmsContrast() == 0.2d ? 0 : -1)) < 0 || (imageLightCondition.getLowHighContrast() > 0.2d ? 1 : (imageLightCondition.getLowHighContrast() == 0.2d ? 0 : -1)) < 0));
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<c> run() {
        sn.b1 b1Var = this.selfieDirectionFeed.get();
        Intrinsics.checkNotNullExpressionValue(b1Var, "get(...)");
        return dv.j.y(new e(dv.j.n(b1Var, 1), this), av.g1.a());
    }
}
