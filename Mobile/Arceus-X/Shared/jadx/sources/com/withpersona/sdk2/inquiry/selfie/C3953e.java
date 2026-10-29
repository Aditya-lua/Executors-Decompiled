package com.withpersona.sdk2.inquiry.selfie;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import kn.C7640c;
import kn.EnumC7638a;
import kn.EnumC7639b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p061ct.InterfaceC4364a;
import p132fn.AbstractC5702p0;
import p132fn.C5698n0;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7946z0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0014\u0012\u0016B=\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\u00020\t*\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Lvr/h;", "Lct/a;", "Lfn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "", "captureOnPoseDetected", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lqq/c;", "sdkFilesManager", "<init>", "(Lct/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;)V", "otherWorker", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "a", "Lnu/h;", "run", "()Lnu/h;", "Lkn/c;", "Lkn/a;", "pose", "", "l", "(Lkn/c;Lkn/a;)F", "Lct/a;", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "d", "Z", "e", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "f", "Lqq/c;", "", "g", "I", "numRetries", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "m", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)Z", "isLowLight", "h", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3953e implements InterfaceC13222o<c>, InterfaceC12257h<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4364a<C5698n0> selfieDirectionFeed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final PoseInfo poseInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean captureOnPoseDetected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C3955g selfieEventLogger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int numRetries;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$b */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "", "captureOnPoseDetected", "Lcom/withpersona/sdk2/inquiry/selfie/e;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3953e mo20039a(@NotNull C3955g selfieEventLogger, @NotNull PoseInfo poseInfo, boolean captureOnPoseDetected);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$c */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "", "<init>", "()V", "a", "c", "b", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$c$a */
        @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "isDimLightConditions", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "c", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "b", "F", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "d", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            public final Selfie selfie;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$c$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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
        @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Lkn/b;", "error", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "isDimLightConditions", "<init>", "(Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Z)V", "a", "Lkn/b;", "b", "()Lkn/b;", "F", "c", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "d", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14143c extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final EnumC7639b error;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public final boolean isDimLightConditions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14143c(@NotNull EnumC7639b error, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, boolean z10) {
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
            public final EnumC7639b getError() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.e.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16587a;

        static {
            int[] iArr = new int[EnumC7638a.values().length];
            try {
                iArr[EnumC7638a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7638a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7638a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7638a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7638a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16587a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$e */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e implements InterfaceC9575h<c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f16588a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3953e f16589b;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$e$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f16590a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3953e f16591b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.e$e$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2", m39664f = "SelfieAnalyzeWorker.kt", m39665l = {105, C1759R.styleable.AppCompatTheme_windowMinWidthMajor}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14144a extends AbstractC10342d {

                /* JADX INFO: renamed from: A */
                public Object f16592A;

                /* JADX INFO: renamed from: B */
                public Object f16593B;

                /* JADX INFO: renamed from: C */
                public Object f16594C;

                /* JADX INFO: renamed from: D */
                public Object f16595D;

                /* JADX INFO: renamed from: E */
                public Object f16596E;

                /* JADX INFO: renamed from: F */
                public int f16597F;

                /* JADX INFO: renamed from: G */
                public int f16598G;

                /* JADX INFO: renamed from: H */
                public int f16599H;

                /* JADX INFO: renamed from: I */
                public int f16600I;

                /* JADX INFO: renamed from: J */
                public boolean f16601J;

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f16602t;

                /* JADX INFO: renamed from: u */
                public int f16603u;

                /* JADX INFO: renamed from: v */
                public Object f16604v;

                /* JADX INFO: renamed from: x */
                public Object f16606x;

                /* JADX INFO: renamed from: y */
                public Object f16607y;

                /* JADX INFO: renamed from: z */
                public Object f16608z;

                public C14144a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f16602t = obj;
                    this.f16603u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC9577i interfaceC9577i, C3953e c3953e) {
                this.f16590a = interfaceC9577i;
                this.f16591b = c3953e;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r15v5, resolved type: nu.i */
            /* JADX DEBUG: Multi-variable search result rejected for r15v6, resolved type: nu.i */
            /* JADX DEBUG: Multi-variable search result rejected for r15v7, resolved type: nu.i */
            /* JADX DEBUG: Multi-variable search result rejected for r15v8, resolved type: nu.i */
            /* JADX WARN: Code duplicated, block: B:52:0x019e  */
            /* JADX WARN: Code duplicated, block: B:58:0x01af  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
            
                if (r15.emit(r8, r0) == r1) goto L60;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [int, kn.c] */
            @Override // nu.InterfaceC9577i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                C14144a c14144a;
                Bitmap bitmap;
                C7640c c7640c;
                int i10;
                Object c14143c;
                Object obj2;
                InterfaceC9577i interfaceC9577i;
                C14144a c14144a2;
                Object c14143c2;
                InterfaceC9577i interfaceC9577i2;
                AbstractC5702p0 selfiePhoto;
                Bitmap bitmap2;
                if (interfaceC9557b instanceof C14144a) {
                    c14144a = (C14144a) interfaceC9557b;
                    int i11 = c14144a.f16603u;
                    if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14144a.f16603u = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14144a = new C14144a(interfaceC9557b);
                    }
                } else {
                    c14144a = new C14144a(interfaceC9557b);
                }
                Object obj3 = c14144a.f16602t;
                Object objM38805e = C10047c.m38805e();
                ?? r8 = c14144a.f16603u;
                try {
                    if (r8 != 0) {
                        if (r8 == 1) {
                            int i12 = c14144a.f16597F;
                            c7640c = (C7640c) c14144a.f16595D;
                            InterfaceC9577i interfaceC9577i3 = (InterfaceC9577i) c14144a.f16608z;
                            obj2 = c14144a.f16607y;
                            c14144a2 = (C14144a) c14144a.f16606x;
                            Object obj4 = c14144a.f16604v;
                            C7348o.m30470b(obj3);
                            i10 = i12;
                            obj = obj4;
                            interfaceC9577i = interfaceC9577i3;
                        } else {
                            if (r8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7348o.m30470b(obj3);
                        }
                        return Unit.f29331a;
                    }
                    C7348o.m30470b(obj3);
                    InterfaceC9577i interfaceC9577i4 = this.f16590a;
                    c7640c = (C7640c) obj;
                    C3953e c3953e = this.f16591b;
                    boolean zM20038m = c3953e.m20038m(c7640c.getLightCondition());
                    AbstractC5702p0 selfiePhoto2 = c7640c.getSelfiePhoto();
                    this.f16591b.selfieEventLogger.m20057h(this.f16591b.poseInfo.getPose(), c7640c);
                    i10 = 0;
                    if (selfiePhoto2 != null) {
                        if (C3957i.m20082d(selfiePhoto2) != this.f16591b.poseInfo.getPose()) {
                            EnumC7639b enumC7639b = EnumC7639b.IncorrectPose;
                            C3953e c3953e2 = this.f16591b;
                            c14143c2 = new c.C14143c(enumC7639b, c3953e2.m20037l(c7640c, c3953e2.poseInfo.getPose()), c7640c.getBrightnessInfo(), zM20038m);
                        } else if (this.f16591b.captureOnPoseDetected) {
                            Object objM20080b = C3957i.m20080b(selfiePhoto2, this.f16591b.sdkFilesManager, this.f16591b.poseInfo);
                            Throwable thM30463e = C7347n.m30463e(objM20080b);
                            if (thM30463e == null) {
                                c14143c2 = new c.a((Selfie) objM20080b, 1.0f, c7640c.getBrightnessInfo(), zM20038m);
                            } else {
                                c14143c = new c.b(thM30463e);
                            }
                        } else {
                            c14143c2 = new c.a(null, 1.0f, c7640c.getBrightnessInfo(), zM20038m);
                        }
                        obj2 = obj;
                        c14144a2 = c14144a;
                        interfaceC9577i2 = interfaceC9577i4;
                        selfiePhoto = c7640c.getSelfiePhoto();
                        if (selfiePhoto != null && (bitmap2 = selfiePhoto.getBitmap()) != null && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        if (c14143c2 != null) {
                            c14144a.f16604v = C10350l.m39676a(obj);
                            c14144a.f16606x = C10350l.m39676a(c14144a2);
                            c14144a.f16607y = C10350l.m39676a(obj2);
                            c14144a.f16608z = C10350l.m39676a(interfaceC9577i2);
                            c14144a.f16592A = C10350l.m39676a(c14143c2);
                            c14144a.f16593B = null;
                            c14144a.f16594C = null;
                            c14144a.f16595D = null;
                            c14144a.f16596E = null;
                            c14144a.f16597F = i10;
                            c14144a.f16603u = 2;
                        }
                        return Unit.f29331a;
                    }
                    EnumC7639b error = c7640c.getError();
                    EnumC7639b enumC7639b2 = EnumC7639b.FaceDetectionUnsupported;
                    if (error == enumC7639b2) {
                        this.f16591b.numRetries++;
                        if (this.f16591b.numRetries >= 6) {
                            c14143c = new c.C14143c(enumC7639b2, 0.0f, c7640c.getBrightnessInfo(), zM20038m);
                        } else {
                            c14144a.f16604v = C10350l.m39676a(obj);
                            c14144a.f16606x = C10350l.m39676a(c14144a);
                            c14144a.f16607y = C10350l.m39676a(obj);
                            c14144a.f16608z = interfaceC9577i4;
                            c14144a.f16592A = C10350l.m39676a(c14144a);
                            c14144a.f16593B = C10350l.m39676a(c7640c);
                            c14144a.f16594C = C10350l.m39676a(c3953e);
                            c14144a.f16595D = c7640c;
                            c14144a.f16596E = C10350l.m39676a(selfiePhoto2);
                            c14144a.f16597F = 0;
                            c14144a.f16598G = 0;
                            c14144a.f16599H = 0;
                            c14144a.f16600I = 0;
                            c14144a.f16601J = zM20038m;
                            c14144a.f16603u = 1;
                            if (C7946z0.m32938b(500L, c14144a) != objM38805e) {
                                obj2 = obj;
                                interfaceC9577i = interfaceC9577i4;
                                c14144a2 = c14144a;
                            }
                        }
                        return objM38805e;
                    }
                    EnumC7639b error2 = c7640c.getError();
                    if (error2 == null) {
                        error2 = EnumC7639b.Other;
                    }
                    C3953e c3953e3 = this.f16591b;
                    c14143c = new c.C14143c(error2, c3953e3.m20037l(c7640c, c3953e3.poseInfo.getPose()), c7640c.getBrightnessInfo(), zM20038m);
                    obj2 = obj;
                    c14144a2 = c14144a;
                    c14143c2 = c14143c;
                    interfaceC9577i2 = interfaceC9577i4;
                    selfiePhoto = c7640c.getSelfiePhoto();
                    if (selfiePhoto != null) {
                        bitmap2.recycle();
                    }
                    if (c14143c2 != null) {
                        c14144a.f16604v = C10350l.m39676a(obj);
                        c14144a.f16606x = C10350l.m39676a(c14144a2);
                        c14144a.f16607y = C10350l.m39676a(obj2);
                        c14144a.f16608z = C10350l.m39676a(interfaceC9577i2);
                        c14144a.f16592A = C10350l.m39676a(c14143c2);
                        c14144a.f16593B = null;
                        c14144a.f16594C = null;
                        c14144a.f16595D = null;
                        c14144a.f16596E = null;
                        c14144a.f16597F = i10;
                        c14144a.f16603u = 2;
                    }
                    return Unit.f29331a;
                    interfaceC9577i2 = interfaceC9577i;
                    c14143c2 = null;
                    selfiePhoto = c7640c.getSelfiePhoto();
                    if (selfiePhoto != null) {
                        bitmap2.recycle();
                    }
                    if (c14143c2 != null) {
                        c14144a.f16604v = C10350l.m39676a(obj);
                        c14144a.f16606x = C10350l.m39676a(c14144a2);
                        c14144a.f16607y = C10350l.m39676a(obj2);
                        c14144a.f16608z = C10350l.m39676a(interfaceC9577i2);
                        c14144a.f16592A = C10350l.m39676a(c14143c2);
                        c14144a.f16593B = null;
                        c14144a.f16594C = null;
                        c14144a.f16595D = null;
                        c14144a.f16596E = null;
                        c14144a.f16597F = i10;
                        c14144a.f16603u = 2;
                    }
                    return Unit.f29331a;
                } catch (Throwable th2) {
                    AbstractC5702p0 selfiePhoto3 = r8.getSelfiePhoto();
                    if (selfiePhoto3 != null && (bitmap = selfiePhoto3.getBitmap()) != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    throw th2;
                }
            }
        }

        public e(InterfaceC9575h interfaceC9575h, C3953e c3953e) {
            this.f16588a = interfaceC9575h;
            this.f16589b = c3953e;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super c> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f16588a.collect(new a(interfaceC9577i, this.f16589b), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    public C3953e(@NotNull InterfaceC4364a<C5698n0> selfieDirectionFeed, @NotNull PoseInfo poseInfo, boolean z10, @NotNull C3955g selfieEventLogger, @NotNull C10700c sdkFilesManager) {
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

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof C3953e;
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3953e)) {
            return false;
        }
        C3953e c3953e = (C3953e) otherWorker;
        return Intrinsics.m31980c(c3953e.poseInfo, this.poseInfo) && c3953e.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3953e)) {
            return false;
        }
        C3953e c3953e = (C3953e) otherWorker;
        return Intrinsics.m31980c(c3953e.poseInfo, this.poseInfo) && c3953e.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    /* JADX INFO: renamed from: l */
    public final float m20037l(C7640c c7640c, EnumC7638a enumC7638a) {
        float fMin;
        if (c7640c.getFacesInFrame() != 1) {
            return 0.0f;
        }
        int i10 = d.f16587a[enumC7638a.ordinal()];
        if (i10 == 1) {
            boolean z10 = (c7640c.getIsFaceTooClose() || c7640c.getIsFaceTooFar()) ? false : true;
            boolean isFaceCentered = c7640c.getIsFaceCentered();
            float fM32084i = C7764d.m32084i((Math.abs(c7640c.getFaceAngleY()) - 10.0f) / 90.0f, 0.0f, 1.0f);
            float f10 = z10 ? 0.33f : 0.0f;
            if (isFaceCentered) {
                f10 += 0.17f;
            }
            return fM32084i > 0.0f ? f10 + (fM32084i * 0.5f) : f10;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new C7345l();
                    }
                    if (c7640c.getIsFaceTooClose() || c7640c.getIsFaceTooFar() || !c7640c.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    fMin = Math.min(Math.abs(((-5.0f) - c7640c.getFaceAngleX()) / (-5.0f)), 1.0f);
                } else {
                    if (c7640c.getIsFaceTooClose() || c7640c.getIsFaceTooFar() || !c7640c.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    fMin = Math.min(Math.abs((10.0f - c7640c.getFaceAngleX()) / 10.0f), 1.0f);
                }
            } else {
                if (c7640c.getIsFaceTooClose() || c7640c.getIsFaceTooFar() || !c7640c.getIsFaceCentered()) {
                    return 0.0f;
                }
                fMin = Math.min(Math.abs(((-15.0f) - c7640c.getFaceAngleY()) / (-15.0f)), 1.0f);
            }
        } else {
            if (c7640c.getIsFaceTooClose() || c7640c.getIsFaceTooFar() || !c7640c.getIsFaceCentered()) {
                return 0.0f;
            }
            fMin = Math.min(Math.abs((15.0f - c7640c.getFaceAngleY()) / 15.0f), 1.0f);
        }
        return 1.0f - fMin;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m20038m(ImageLightCondition imageLightCondition) {
        if (imageLightCondition == null) {
            return false;
        }
        return (imageLightCondition.getLuminosity() < 0.34d && !((imageLightCondition.getRmsContrast() > 0.3d ? 1 : (imageLightCondition.getRmsContrast() == 0.3d ? 0 : -1)) > 0 && (imageLightCondition.getLowHighContrast() > 0.5d ? 1 : (imageLightCondition.getLowHighContrast() == 0.5d ? 0 : -1)) > 0)) || (imageLightCondition.getLuminosity() < 0.45d && ((imageLightCondition.getRmsContrast() > 0.2d ? 1 : (imageLightCondition.getRmsContrast() == 0.2d ? 0 : -1)) < 0 || (imageLightCondition.getLowHighContrast() > 0.2d ? 1 : (imageLightCondition.getLowHighContrast() == 0.2d ? 0 : -1)) < 0));
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<c> run() {
        C5698n0 c5698n0 = this.selfieDirectionFeed.get();
        Intrinsics.checkNotNullExpressionValue(c5698n0, "get(...)");
        return C9579j.m37808y(new e(C9579j.m37797n(c5698n0, 1), this), C7864g1.m32643a());
    }
}
