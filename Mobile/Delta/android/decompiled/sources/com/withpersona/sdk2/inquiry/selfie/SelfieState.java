package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0012\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0005!\"#$%&'(B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148 X \u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0011)*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "<init>", "()V", "", "a", "Z", "getDidGoBack$selfie_release", "()Z", "x", "(Z)V", "didGoBack", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "w", "()Ljava/util/List;", "selfies", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "ShowInstructions", "WaitForCameraFeed", "RestartCamera", "WaitForWebRtcSetup", "ShowPoseHint", "StartCapture", "StartCaptureFaceDetected", "CountdownToCapture", "CountdownToManualCapture", "Capture", "AcquireNextPose", "CaptureTransition", "FinalizeLocalVideoCapture", "FinalizeWebRtc", "WebRtcFinished", "ReviewCaptures", "Submit", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SelfieState extends SimpleWorkflowState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean didGoBack;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\f\u001a\u00020\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\b=\u00104R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\b9\u0010@¨\u0006F"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "", "isFlashEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "autoCaptureSupported", "<init>", "(Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "J", "t", "()J", "d", "Ljava/util/List;", "w", "()Ljava/util/List;", "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "f", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "g", "Z", "s", "()Z", "h", "i", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "j", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcquireNextPose extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<AcquireNextPose> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AcquireNextPose> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AcquireNextPose createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(AcquireNextPose.class.getClassLoader());
                long j10 = parcel.readLong();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(AcquireNextPose.class.getClassLoader()));
                }
                SelfieState selfieState = (SelfieState) parcel.readParcelable(AcquireNextPose.class.getClassLoader());
                CameraProperties.b bVarValueOf = CameraProperties.b.valueOf(parcel.readString());
                boolean z10 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                return new AcquireNextPose(cameraProperties, j10, arrayList, selfieState, bVarValueOf, z10, arrayList2, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AcquireNextPose[] newArray(int i10) {
                return new AcquireNextPose[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AcquireNextPose(@NotNull CameraProperties cameraProperties, long j10, @NotNull List<? extends Selfie> selfies, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode, boolean z10, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.selfies = selfies;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z10;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AcquireNextPose A(AcquireNextPose acquireNextPose, CameraProperties cameraProperties, long j10, List list, SelfieState selfieState, CameraProperties.b bVar, boolean z10, List list2, PoseConfigs poseConfigs, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cameraProperties = acquireNextPose.cameraProperties;
            }
            if ((i10 & 2) != 0) {
                j10 = acquireNextPose.startSelfieTimestamp;
            }
            if ((i10 & 4) != 0) {
                list = acquireNextPose.selfies;
            }
            if ((i10 & 8) != 0) {
                selfieState = acquireNextPose.backState;
            }
            if ((i10 & 16) != 0) {
                bVar = acquireNextPose.cameraFacingMode;
            }
            if ((i10 & 32) != 0) {
                z10 = acquireNextPose.isFlashEnabled;
            }
            if ((i10 & 64) != 0) {
                list2 = acquireNextPose.posesNeeded;
            }
            if ((i10 & 128) != 0) {
                poseConfigs = acquireNextPose.poseConfigs;
            }
            if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                z11 = acquireNextPose.autoCaptureSupported;
            }
            PoseConfigs poseConfigs2 = poseConfigs;
            boolean z12 = z11;
            List list3 = list2;
            CameraProperties.b bVar2 = bVar;
            List list4 = list;
            return acquireNextPose.z(cameraProperties, j10, list4, selfieState, bVar2, z10, list3, poseConfigs2, z12);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AcquireNextPose)) {
                return false;
            }
            AcquireNextPose acquireNextPose = (AcquireNextPose) other;
            return Intrinsics.c(this.cameraProperties, acquireNextPose.cameraProperties) && this.startSelfieTimestamp == acquireNextPose.startSelfieTimestamp && Intrinsics.c(this.selfies, acquireNextPose.selfies) && Intrinsics.c(this.backState, acquireNextPose.backState) && this.cameraFacingMode == acquireNextPose.cameraFacingMode && this.isFlashEnabled == acquireNextPose.isFlashEnabled && Intrinsics.c(this.posesNeeded, acquireNextPose.posesNeeded) && Intrinsics.c(this.poseConfigs, acquireNextPose.poseConfigs) && this.autoCaptureSupported == acquireNextPose.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            int iHashCode = ((((this.cameraProperties.hashCode() * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.selfies.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "AcquireNextPose(cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", selfies=" + this.selfies + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            List<PoseInfo> list2 = this.posesNeeded;
            dest.writeInt(list2.size());
            Iterator<PoseInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
        }

        @NotNull
        public final AcquireNextPose z(@NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @NotNull List<? extends Selfie> selfies, @Nullable SelfieState backState, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new AcquireNextPose(cameraProperties, startSelfieTimestamp, selfies, backState, cameraFacingMode, isFlashEnabled, posesNeeded, poseConfigs, autoCaptureSupported);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8PX\u0090\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "nextState", "Lkn/a;", "completedPose", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "", "isFlashOn", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lkn/a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "A", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "c", "Lkn/a;", "z", "()Lkn/a;", "d", "u", "e", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "f", "Z", "C", "()Z", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "w", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CaptureTransition extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<CaptureTransition> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final SelfieState nextState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kn.a completedPose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final boolean isFlashOn;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CaptureTransition> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CaptureTransition createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CaptureTransition((SelfieState) parcel.readParcelable(CaptureTransition.class.getClassLoader()), kn.a.valueOf(parcel.readString()), (SelfieState) parcel.readParcelable(CaptureTransition.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CaptureTransition[] newArray(int i10) {
                return new CaptureTransition[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureTransition(@NotNull SelfieState nextState, @NotNull kn.a completedPose, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(nextState, "nextState");
            Intrinsics.checkNotNullParameter(completedPose, "completedPose");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.nextState = nextState;
            this.completedPose = completedPose;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashOn = z10;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final SelfieState getNextState() {
            return this.nextState;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getIsFlashOn() {
            return this.isFlashOn;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.nextState.w();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.nextState, flags);
            dest.writeString(this.completedPose.name());
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashOn ? 1 : 0);
        }

        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public final kn.a getCompletedPose() {
            return this.completedPose;
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0092\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010?\u001a\u0004\b;\u0010@R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bC\u0010IR\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010?\u001a\u0004\bO\u0010@R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010@R&\u0010V\u001a\b\u0012\u0004\u0012\u00020R0\t8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b=\u00108\u0012\u0004\bT\u0010U\u001a\u0004\bS\u0010:¨\u0006W"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "", "countDown", "Lkn/b;", "selfieError", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(ILkn/b;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;JZJLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(ILkn/b;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;JZJLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "C", "c", "Lkn/b;", "D", "()Lkn/b;", "d", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "J", "n", "()J", "Z", "()Z", "h", "t", "i", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "j", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "k", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "l", "s", "m", "E", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "w", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountdownToManualCapture extends SelfieState implements b {

        @NotNull
        public static final Parcelable.Creator<CountdownToManualCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int countDown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final kn.b selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToManualCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToManualCapture createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                boolean z12;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                kn.b bVarValueOf = parcel.readInt() == 0 ? null : kn.b.valueOf(parcel.readString());
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                long j10 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z12 = true;
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = true;
                    z12 = false;
                }
                return new CountdownToManualCapture(i10, bVarValueOf, cameraProperties, arrayList, j10, z12, parcel.readLong(), (SelfieState) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? z11 : z10, parcel.readInt() != 0 ? z11 : z10);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToManualCapture[] newArray(int i10) {
                return new CountdownToManualCapture[i10];
            }
        }

        public /* synthetic */ CountdownToManualCapture(int i10, kn.b bVar, CameraProperties cameraProperties, List list, long j10, boolean z10, long j11, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.b bVar2, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : bVar, cameraProperties, list, j10, (i11 & 32) != 0 ? true : z10, j11, selfieState, poseConfigs, bVar2, z11, z12);
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final int getCountDown() {
            return this.countDown;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final kn.b getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToManualCapture)) {
                return false;
            }
            CountdownToManualCapture countdownToManualCapture = (CountdownToManualCapture) other;
            return this.countDown == countdownToManualCapture.countDown && this.selfieError == countdownToManualCapture.selfieError && Intrinsics.c(this.cameraProperties, countdownToManualCapture.cameraProperties) && Intrinsics.c(this.posesNeeded, countdownToManualCapture.posesNeeded) && this.startCaptureTimestamp == countdownToManualCapture.startCaptureTimestamp && this.autoCaptureSupported == countdownToManualCapture.autoCaptureSupported && this.startSelfieTimestamp == countdownToManualCapture.startSelfieTimestamp && Intrinsics.c(this.backState, countdownToManualCapture.backState) && Intrinsics.c(this.poseConfigs, countdownToManualCapture.poseConfigs) && this.cameraFacingMode == countdownToManualCapture.cameraFacingMode && this.isFlashEnabled == countdownToManualCapture.isFlashEnabled && this.isDimLightConditions == countdownToManualCapture.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            kn.b bVar = this.selfieError;
            int iHashCode2 = (((((((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseConfig k() {
            return super.k();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.b
        /* JADX INFO: renamed from: n, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.b
        public boolean o() {
            return super.o();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "CountdownToManualCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", cameraProperties=" + this.cameraProperties + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.countDown);
            kn.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<PoseInfo> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            dest.writeInt(this.isDimLightConditions ? 1 : 0);
        }

        @NotNull
        public final CountdownToManualCapture z(int countDown, @Nullable kn.b selfieError, @NotNull CameraProperties cameraProperties, @NotNull List<PoseInfo> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @Nullable SelfieState backState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new CountdownToManualCapture(countDown, selfieError, cameraProperties, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountdownToManualCapture(int i10, @Nullable kn.b bVar, @NotNull CameraProperties cameraProperties, @NotNull List<PoseInfo> posesNeeded, long j10, boolean z10, long j11, @Nullable SelfieState selfieState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean z11, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.countDown = i10;
            this.selfieError = bVar;
            this.cameraProperties = cameraProperties;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j10;
            this.autoCaptureSupported = z10;
            this.startSelfieTimestamp = j11;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.isDimLightConditions = z12;
            this.selfies = kotlin.collections.p.k();
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "minDurationMs", "", "isDelayComplete", "isFinalizeComplete", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "J", "C", "()J", "d", "Z", "D", "()Z", "e", "E", "f", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "g", "t", "h", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "i", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final long minDurationMs;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDelayComplete;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFinalizeComplete;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                long j10 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z10 = true;
                    z11 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                return new FinalizeLocalVideoCapture(arrayList, j10, z11, parcel.readInt() != 0 ? z10 : false, (CameraProperties) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture[] newArray(int i10) {
                return new FinalizeLocalVideoCapture[i10];
            }
        }

        public /* synthetic */ FinalizeLocalVideoCapture(List list, long j10, boolean z10, boolean z11, CameraProperties cameraProperties, long j11, SelfieState selfieState, CameraProperties.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j10, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, cameraProperties, j11, selfieState, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinalizeLocalVideoCapture A(FinalizeLocalVideoCapture finalizeLocalVideoCapture, List list, long j10, boolean z10, boolean z11, CameraProperties cameraProperties, long j11, SelfieState selfieState, CameraProperties.b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = finalizeLocalVideoCapture.selfies;
            }
            if ((i10 & 2) != 0) {
                j10 = finalizeLocalVideoCapture.minDurationMs;
            }
            if ((i10 & 4) != 0) {
                z10 = finalizeLocalVideoCapture.isDelayComplete;
            }
            if ((i10 & 8) != 0) {
                z11 = finalizeLocalVideoCapture.isFinalizeComplete;
            }
            if ((i10 & 16) != 0) {
                cameraProperties = finalizeLocalVideoCapture.cameraProperties;
            }
            if ((i10 & 32) != 0) {
                j11 = finalizeLocalVideoCapture.startSelfieTimestamp;
            }
            if ((i10 & 64) != 0) {
                selfieState = finalizeLocalVideoCapture.backState;
            }
            if ((i10 & 128) != 0) {
                bVar = finalizeLocalVideoCapture.cameraFacingMode;
            }
            long j12 = j11;
            CameraProperties cameraProperties2 = cameraProperties;
            boolean z12 = z10;
            return finalizeLocalVideoCapture.z(list, j10, z12, z11, cameraProperties2, j12, selfieState, bVar);
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getIsFinalizeComplete() {
            return this.isFinalizeComplete;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return Intrinsics.c(this.selfies, finalizeLocalVideoCapture.selfies) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete && this.isFinalizeComplete == finalizeLocalVideoCapture.isFinalizeComplete && Intrinsics.c(this.cameraProperties, finalizeLocalVideoCapture.cameraProperties) && this.startSelfieTimestamp == finalizeLocalVideoCapture.startSelfieTimestamp && Intrinsics.c(this.backState, finalizeLocalVideoCapture.backState) && this.cameraFacingMode == finalizeLocalVideoCapture.cameraFacingMode;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.selfies.hashCode() * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete)) * 31) + Boolean.hashCode(this.isFinalizeComplete)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "FinalizeLocalVideoCapture(selfies=" + this.selfies + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ", isFinalizeComplete=" + this.isFinalizeComplete + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeLong(this.minDurationMs);
            dest.writeInt(this.isDelayComplete ? 1 : 0);
            dest.writeInt(this.isFinalizeComplete ? 1 : 0);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @NotNull
        public final FinalizeLocalVideoCapture z(@NotNull List<? extends Selfie> selfies, long minDurationMs, boolean isDelayComplete, boolean isFinalizeComplete, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @Nullable SelfieState backState, @NotNull CameraProperties.b cameraFacingMode) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new FinalizeLocalVideoCapture(selfies, minDurationMs, isDelayComplete, isFinalizeComplete, cameraProperties, startSelfieTimestamp, backState, cameraFacingMode);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(@NotNull List<? extends Selfie> selfies, long j10, boolean z10, boolean z11, @NotNull CameraProperties cameraProperties, long j11, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.minDurationMs = j10;
            this.isDelayComplete = z10;
            this.isFinalizeComplete = z11;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "d", "J", "t", "()J", "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "f", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FinalizeWebRtc extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeWebRtc> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinalizeWebRtc createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                return new FinalizeWebRtc(arrayList, (CameraProperties) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeWebRtc[] newArray(int i10) {
                return new FinalizeWebRtc[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeWebRtc(@NotNull List<? extends Selfie> selfies, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u00101\u001a\b\u0012\u0004\u0012\u00020*0)8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getHasRequestedCameraPermissions", "()Z", "c", "getHasRequestedAudioPermissions", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "e", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "f", "Ljava/util/List;", "w", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestartCamera extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<RestartCamera> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean hasRequestedCameraPermissions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean hasRequestedAudioPermissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestartCamera> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RestartCamera createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestartCamera(parcel.readInt() != 0, parcel.readInt() != 0, (SelfieState) parcel.readParcelable(RestartCamera.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RestartCamera[] newArray(int i10) {
                return new RestartCamera[i10];
            }
        }

        public /* synthetic */ RestartCamera(boolean z10, boolean z11, SelfieState selfieState, CameraProperties.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, selfieState, bVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestartCamera)) {
                return false;
            }
            RestartCamera restartCamera = (RestartCamera) other;
            return this.hasRequestedCameraPermissions == restartCamera.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == restartCamera.hasRequestedAudioPermissions && Intrinsics.c(this.backState, restartCamera.backState) && this.cameraFacingMode == restartCamera.cameraFacingMode;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        @NotNull
        public String toString() {
            return "RestartCamera(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            dest.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RestartCamera(boolean z10, boolean z11, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z10;
            this.hasRequestedAudioPermissions = z11;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.selfies = kotlin.collections.p.k();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "selfiesToReview", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "z", "d", "Ljava/lang/String;", "A", "()Ljava/lang/String;", "e", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "f", "J", "t", "()J", "g", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "h", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReviewCaptures extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<ReviewCaptures> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Selfie> selfiesToReview;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String webRtcObjectId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewCaptures> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReviewCaptures createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                }
                return new ReviewCaptures(arrayList, arrayList2, parcel.readString(), (CameraProperties) parcel.readParcelable(ReviewCaptures.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(ReviewCaptures.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReviewCaptures[] newArray(int i10) {
                return new ReviewCaptures[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewCaptures(@NotNull List<? extends Selfie> selfies, @NotNull List<? extends Selfie> selfiesToReview, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(selfiesToReview, "selfiesToReview");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.selfiesToReview = selfiesToReview;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }

        @Nullable
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<Selfie> list2 = this.selfiesToReview;
            dest.writeInt(list2.size());
            Iterator<Selfie> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @NotNull
        public final List<Selfie> z() {
            return this.selfiesToReview;
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bE\u00102¨\u0006F"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;ZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(Ljava/util/List;Ljava/util/List;ZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "g", "d", "Z", "f", "()Z", "e", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "J", "t", "()J", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "h", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "i", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "j", "s", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowPoseHint extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<ShowPoseHint> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowPoseHint> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowPoseHint createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ShowPoseHint.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                return new ShowPoseHint(arrayList, arrayList2, parcel.readInt() != 0, (CameraProperties) parcel.readParcelable(r4.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(ShowPoseHint.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowPoseHint[] newArray(int i10) {
                return new ShowPoseHint[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowPoseHint(@NotNull List<? extends Selfie> selfies, @NotNull List<PoseInfo> posesNeeded, boolean z10, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.posesNeeded = posesNeeded;
            this.autoCaptureSupported = z10;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowPoseHint A(ShowPoseHint showPoseHint, List list, List list2, boolean z10, CameraProperties cameraProperties, long j10, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.b bVar, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = showPoseHint.selfies;
            }
            if ((i10 & 2) != 0) {
                list2 = showPoseHint.posesNeeded;
            }
            if ((i10 & 4) != 0) {
                z10 = showPoseHint.autoCaptureSupported;
            }
            if ((i10 & 8) != 0) {
                cameraProperties = showPoseHint.cameraProperties;
            }
            if ((i10 & 16) != 0) {
                j10 = showPoseHint.startSelfieTimestamp;
            }
            if ((i10 & 32) != 0) {
                selfieState = showPoseHint.backState;
            }
            if ((i10 & 64) != 0) {
                poseConfigs = showPoseHint.poseConfigs;
            }
            if ((i10 & 128) != 0) {
                bVar = showPoseHint.cameraFacingMode;
            }
            if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                z11 = showPoseHint.isFlashEnabled;
            }
            long j11 = j10;
            boolean z12 = z10;
            CameraProperties cameraProperties2 = cameraProperties;
            return showPoseHint.z(list, list2, z12, cameraProperties2, j11, selfieState, poseConfigs, bVar, z11);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPoseHint)) {
                return false;
            }
            ShowPoseHint showPoseHint = (ShowPoseHint) other;
            return Intrinsics.c(this.selfies, showPoseHint.selfies) && Intrinsics.c(this.posesNeeded, showPoseHint.posesNeeded) && this.autoCaptureSupported == showPoseHint.autoCaptureSupported && Intrinsics.c(this.cameraProperties, showPoseHint.cameraProperties) && this.startSelfieTimestamp == showPoseHint.startSelfieTimestamp && Intrinsics.c(this.backState, showPoseHint.backState) && Intrinsics.c(this.poseConfigs, showPoseHint.poseConfigs) && this.cameraFacingMode == showPoseHint.cameraFacingMode && this.isFlashEnabled == showPoseHint.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.selfies.hashCode() * 31) + this.posesNeeded.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "ShowPoseHint(selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<PoseInfo> list2 = this.posesNeeded;
            dest.writeInt(list2.size());
            Iterator<PoseInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @NotNull
        public final ShowPoseHint z(@NotNull List<? extends Selfie> selfies, @NotNull List<PoseInfo> posesNeeded, boolean autoCaptureSupported, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @Nullable SelfieState backState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new ShowPoseHint(selfies, posesNeeded, autoCaptureSupported, cameraProperties, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J¢\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010CR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bF\u0010LR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b=\u0010OR\u001a\u0010\u0017\u001a\u00020\u00168\u0010X\u0090\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010N\u001a\u0004\bU\u0010OR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bV\u0010O¨\u0006W"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "startCaptureTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "n", "()J", "c", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "d", "t", "e", "F", "D", "()F", "f", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "C", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "w", "i", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "j", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "k", "Z", "()Z", "l", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "m", "s", "E", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartCaptureFaceDetected extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<StartCaptureFaceDetected> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieBrightnessInfo brightnessInfo;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCaptureFaceDetected> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StartCaptureFaceDetected createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                long j10 = parcel.readLong();
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                long j11 = parcel.readLong();
                float f10 = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader()));
                }
                SelfieState selfieState = (SelfieState) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z10 = true;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                return new StartCaptureFaceDetected(j10, cameraProperties, j11, f10, selfieBrightnessInfo, arrayList, arrayList2, selfieState, poseConfigsCreateFromParcel, z10, CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? z10 : false);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StartCaptureFaceDetected[] newArray(int i10) {
                return new StartCaptureFaceDetected[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCaptureFaceDetected(long j10, @NotNull CameraProperties cameraProperties, long j11, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends Selfie> selfies, @Nullable SelfieState selfieState, @NotNull PoseConfigs poseConfigs, boolean z10, @NotNull CameraProperties.b cameraFacingMode, boolean z11, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.startCaptureTimestamp = j10;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.poseScore = f10;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = posesNeeded;
            this.selfies = selfies;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z10;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.isDimLightConditions = z12;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCaptureFaceDetected)) {
                return false;
            }
            StartCaptureFaceDetected startCaptureFaceDetected = (StartCaptureFaceDetected) other;
            return this.startCaptureTimestamp == startCaptureFaceDetected.startCaptureTimestamp && Intrinsics.c(this.cameraProperties, startCaptureFaceDetected.cameraProperties) && this.startSelfieTimestamp == startCaptureFaceDetected.startSelfieTimestamp && Float.compare(this.poseScore, startCaptureFaceDetected.poseScore) == 0 && Intrinsics.c(this.brightnessInfo, startCaptureFaceDetected.brightnessInfo) && Intrinsics.c(this.posesNeeded, startCaptureFaceDetected.posesNeeded) && Intrinsics.c(this.selfies, startCaptureFaceDetected.selfies) && Intrinsics.c(this.backState, startCaptureFaceDetected.backState) && Intrinsics.c(this.poseConfigs, startCaptureFaceDetected.poseConfigs) && this.autoCaptureSupported == startCaptureFaceDetected.autoCaptureSupported && this.cameraFacingMode == startCaptureFaceDetected.cameraFacingMode && this.isFlashEnabled == startCaptureFaceDetected.isFlashEnabled && this.isDimLightConditions == startCaptureFaceDetected.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            int iHashCode = ((((((Long.hashCode(this.startCaptureTimestamp) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode2 = (((((iHashCode + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.selfies.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseConfig k() {
            return super.k();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "StartCaptureFaceDetected(startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", selfies=" + this.selfies + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<PoseInfo> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<Selfie> list2 = this.selfies;
            dest.writeInt(list2.size());
            Iterator<Selfie> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            dest.writeInt(this.isDimLightConditions ? 1 : 0);
        }

        @NotNull
        public final StartCaptureFaceDetected z(long startCaptureTimestamp, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, float poseScore, @Nullable SelfieBrightnessInfo brightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends Selfie> selfies, @Nullable SelfieState backState, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new StartCaptureFaceDetected(startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, selfies, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJl\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u0015R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "", "submitAttempt", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "Ljava/lang/String;", "E", "d", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "e", "J", "t", "()J", "f", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "g", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "h", "I", "D", "i", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "C", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Submit extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String webRtcObjectId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final int submitAttempt;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo recoverableSubmitError;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Submit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Submit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(arrayList, parcel.readString(), (CameraProperties) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(Submit.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()), parcel.readInt(), (InternalErrorInfo) parcel.readParcelable(Submit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Submit[] newArray(int i10) {
                return new Submit[i10];
            }
        }

        public /* synthetic */ Submit(List list, String str, CameraProperties cameraProperties, long j10, SelfieState selfieState, CameraProperties.b bVar, int i10, InternalErrorInfo internalErrorInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, cameraProperties, j10, selfieState, bVar, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? null : internalErrorInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Submit A(Submit submit, List list, String str, CameraProperties cameraProperties, long j10, SelfieState selfieState, CameraProperties.b bVar, int i10, InternalErrorInfo internalErrorInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = submit.selfies;
            }
            if ((i11 & 2) != 0) {
                str = submit.webRtcObjectId;
            }
            if ((i11 & 4) != 0) {
                cameraProperties = submit.cameraProperties;
            }
            if ((i11 & 8) != 0) {
                j10 = submit.startSelfieTimestamp;
            }
            if ((i11 & 16) != 0) {
                selfieState = submit.backState;
            }
            if ((i11 & 32) != 0) {
                bVar = submit.cameraFacingMode;
            }
            if ((i11 & 64) != 0) {
                i10 = submit.submitAttempt;
            }
            if ((i11 & 128) != 0) {
                internalErrorInfo = submit.recoverableSubmitError;
            }
            long j11 = j10;
            CameraProperties cameraProperties2 = cameraProperties;
            return submit.z(list, str, cameraProperties2, j11, selfieState, bVar, i10, internalErrorInfo);
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final InternalErrorInfo getRecoverableSubmitError() {
            return this.recoverableSubmitError;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final int getSubmitAttempt() {
            return this.submitAttempt;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            return Intrinsics.c(this.selfies, submit.selfies) && Intrinsics.c(this.webRtcObjectId, submit.webRtcObjectId) && Intrinsics.c(this.cameraProperties, submit.cameraProperties) && this.startSelfieTimestamp == submit.startSelfieTimestamp && Intrinsics.c(this.backState, submit.backState) && this.cameraFacingMode == submit.cameraFacingMode && this.submitAttempt == submit.submitAttempt && Intrinsics.c(this.recoverableSubmitError, submit.recoverableSubmitError);
        }

        public int hashCode() {
            int iHashCode = this.selfies.hashCode() * 31;
            String str = this.webRtcObjectId;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            int iHashCode3 = (((((iHashCode2 + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.cameraFacingMode.hashCode()) * 31) + Integer.hashCode(this.submitAttempt)) * 31;
            InternalErrorInfo internalErrorInfo = this.recoverableSubmitError;
            return iHashCode3 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0);
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "Submit(selfies=" + this.selfies + ", webRtcObjectId=" + this.webRtcObjectId + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ", submitAttempt=" + this.submitAttempt + ", recoverableSubmitError=" + this.recoverableSubmitError + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.submitAttempt);
            dest.writeParcelable(this.recoverableSubmitError, flags);
        }

        @NotNull
        public final Submit z(@NotNull List<? extends Selfie> selfies, @Nullable String webRtcObjectId, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @Nullable SelfieState backState, @NotNull CameraProperties.b cameraFacingMode, int submitAttempt, @Nullable InternalErrorInfo recoverableSubmitError) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new Submit(selfies, webRtcObjectId, cameraProperties, startSelfieTimestamp, backState, cameraFacingMode, submitAttempt, recoverableSubmitError);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submit(@NotNull List<? extends Selfie> selfies, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode, int i10, @Nullable InternalErrorInfo internalErrorInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.submitAttempt = i10;
            this.recoverableSubmitError = internalErrorInfo;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b6\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R&\u0010B\u001a\b\u0012\u0004\u0012\u00020=0\u00068\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b>\u0010/\u0012\u0004\b@\u0010A\u001a\u0004\b?\u00101¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "D", "()Z", "c", "C", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getAutoCaptureSupported", "h", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "i", "s", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "j", "w", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitForCameraFeed extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<WaitForCameraFeed> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean hasRequestedCameraPermissions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean hasRequestedAudioPermissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForCameraFeed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForCameraFeed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                SelfieState selfieState = (SelfieState) parcel.readParcelable(WaitForCameraFeed.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                return new WaitForCameraFeed(z10, z11, selfieState, arrayList, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForCameraFeed[] newArray(int i10) {
                return new WaitForCameraFeed[i10];
            }
        }

        public /* synthetic */ WaitForCameraFeed(boolean z10, boolean z11, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z12, CameraProperties.b bVar, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, selfieState, list, poseConfigs, (i10 & 32) != 0 ? true : z12, bVar, (i10 & 128) != 0 ? false : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForCameraFeed A(WaitForCameraFeed waitForCameraFeed, boolean z10, boolean z11, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z12, CameraProperties.b bVar, boolean z13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = waitForCameraFeed.hasRequestedCameraPermissions;
            }
            if ((i10 & 2) != 0) {
                z11 = waitForCameraFeed.hasRequestedAudioPermissions;
            }
            if ((i10 & 4) != 0) {
                selfieState = waitForCameraFeed.backState;
            }
            if ((i10 & 8) != 0) {
                list = waitForCameraFeed.posesNeeded;
            }
            if ((i10 & 16) != 0) {
                poseConfigs = waitForCameraFeed.poseConfigs;
            }
            if ((i10 & 32) != 0) {
                z12 = waitForCameraFeed.autoCaptureSupported;
            }
            if ((i10 & 64) != 0) {
                bVar = waitForCameraFeed.cameraFacingMode;
            }
            if ((i10 & 128) != 0) {
                z13 = waitForCameraFeed.isFlashEnabled;
            }
            CameraProperties.b bVar2 = bVar;
            boolean z14 = z13;
            PoseConfigs poseConfigs2 = poseConfigs;
            boolean z15 = z12;
            return waitForCameraFeed.z(z10, z11, selfieState, list, poseConfigs2, z15, bVar2, z14);
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getHasRequestedAudioPermissions() {
            return this.hasRequestedAudioPermissions;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getHasRequestedCameraPermissions() {
            return this.hasRequestedCameraPermissions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForCameraFeed)) {
                return false;
            }
            WaitForCameraFeed waitForCameraFeed = (WaitForCameraFeed) other;
            return this.hasRequestedCameraPermissions == waitForCameraFeed.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == waitForCameraFeed.hasRequestedAudioPermissions && Intrinsics.c(this.backState, waitForCameraFeed.backState) && Intrinsics.c(this.posesNeeded, waitForCameraFeed.posesNeeded) && Intrinsics.c(this.poseConfigs, waitForCameraFeed.poseConfigs) && this.autoCaptureSupported == waitForCameraFeed.autoCaptureSupported && this.cameraFacingMode == waitForCameraFeed.cameraFacingMode && this.isFlashEnabled == waitForCameraFeed.isFlashEnabled;
        }

        @NotNull
        public final List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @NotNull
        public String toString() {
            return "WaitForCameraFeed(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            dest.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            List<PoseInfo> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @NotNull
        public final WaitForCameraFeed z(boolean hasRequestedCameraPermissions, boolean hasRequestedAudioPermissions, @Nullable SelfieState backState, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new WaitForCameraFeed(hasRequestedCameraPermissions, hasRequestedAudioPermissions, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForCameraFeed(boolean z10, boolean z11, @Nullable SelfieState selfieState, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean z12, @NotNull CameraProperties.b cameraFacingMode, boolean z13) {
            super(null);
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z10;
            this.hasRequestedAudioPermissions = z11;
            this.backState = selfieState;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z12;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z13;
            this.selfies = kotlin.collections.p.k();
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b7\u0010@R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010@R&\u0010K\u001a\b\u0012\u0004\u0012\u00020F0\n8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bG\u00108\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010:¨\u0006L"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "webRtcJwt", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "C", "c", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "d", "J", "t", "()J", "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "i", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "h", "Z", "()Z", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "j", "s", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "k", "w", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitForWebRtcSetup extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<WaitForWebRtcSetup> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String webRtcJwt;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForWebRtcSetup> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForWebRtcSetup createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                long j10 = parcel.readLong();
                SelfieState selfieState = (SelfieState) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z10 = true;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                return new WaitForWebRtcSetup(string, cameraProperties, j10, selfieState, arrayList, poseConfigsCreateFromParcel, z10, CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForWebRtcSetup[] newArray(int i10) {
                return new WaitForWebRtcSetup[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForWebRtcSetup(@Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean z10, @NotNull CameraProperties.b cameraFacingMode, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.webRtcJwt = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = selfieState;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z10;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.selfies = kotlin.collections.p.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForWebRtcSetup A(WaitForWebRtcSetup waitForWebRtcSetup, String str, CameraProperties cameraProperties, long j10, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z10, CameraProperties.b bVar, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = waitForWebRtcSetup.webRtcJwt;
            }
            if ((i10 & 2) != 0) {
                cameraProperties = waitForWebRtcSetup.cameraProperties;
            }
            if ((i10 & 4) != 0) {
                j10 = waitForWebRtcSetup.startSelfieTimestamp;
            }
            if ((i10 & 8) != 0) {
                selfieState = waitForWebRtcSetup.backState;
            }
            if ((i10 & 16) != 0) {
                list = waitForWebRtcSetup.posesNeeded;
            }
            if ((i10 & 32) != 0) {
                poseConfigs = waitForWebRtcSetup.poseConfigs;
            }
            if ((i10 & 64) != 0) {
                z10 = waitForWebRtcSetup.autoCaptureSupported;
            }
            if ((i10 & 128) != 0) {
                bVar = waitForWebRtcSetup.cameraFacingMode;
            }
            if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                z11 = waitForWebRtcSetup.isFlashEnabled;
            }
            CameraProperties.b bVar2 = bVar;
            boolean z12 = z11;
            long j11 = j10;
            return waitForWebRtcSetup.z(str, cameraProperties, j11, selfieState, list, poseConfigs, z10, bVar2, z12);
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForWebRtcSetup)) {
                return false;
            }
            WaitForWebRtcSetup waitForWebRtcSetup = (WaitForWebRtcSetup) other;
            return Intrinsics.c(this.webRtcJwt, waitForWebRtcSetup.webRtcJwt) && Intrinsics.c(this.cameraProperties, waitForWebRtcSetup.cameraProperties) && this.startSelfieTimestamp == waitForWebRtcSetup.startSelfieTimestamp && Intrinsics.c(this.backState, waitForWebRtcSetup.backState) && Intrinsics.c(this.posesNeeded, waitForWebRtcSetup.posesNeeded) && Intrinsics.c(this.poseConfigs, waitForWebRtcSetup.poseConfigs) && this.autoCaptureSupported == waitForWebRtcSetup.autoCaptureSupported && this.cameraFacingMode == waitForWebRtcSetup.cameraFacingMode && this.isFlashEnabled == waitForWebRtcSetup.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            String str = this.webRtcJwt;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((((iHashCode + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "WaitForWebRtcSetup(webRtcJwt=" + this.webRtcJwt + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.webRtcJwt);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            List<PoseInfo> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @NotNull
        public final WaitForWebRtcSetup z(@Nullable String webRtcJwt, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @Nullable SelfieState backState, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new WaitForWebRtcSetup(webRtcJwt, cameraProperties, startSelfieTimestamp, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "d", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "e", "J", "t", "()J", "f", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "g", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WebRtcFinished extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<WebRtcFinished> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String webRtcObjectId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WebRtcFinished> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WebRtcFinished createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(WebRtcFinished.class.getClassLoader()));
                }
                return new WebRtcFinished(arrayList, parcel.readString(), (CameraProperties) parcel.readParcelable(WebRtcFinished.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(WebRtcFinished.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WebRtcFinished[] newArray(int i10) {
                return new WebRtcFinished[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WebRtcFinished(@NotNull List<? extends Selfie> selfies, @NotNull String webRtcObjectId, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(webRtcObjectId, "webRtcObjectId");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = webRtcObjectId;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        Disabled,
        Enabled,
        FlashOn,
        ReadyToCapture;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ qt.a f12561f = qt.b.a(a());
    }

    public /* synthetic */ SelfieState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public abstract SelfieState getBackState();

    @NotNull
    /* JADX INFO: renamed from: v */
    public abstract CameraProperties.b getCameraFacingMode();

    @NotNull
    public abstract List<Selfie> w();

    public final void x(boolean z10) {
        this.didGoBack = z10;
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b&\u0010'J¸\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b-\u0010!J\u001a\u00100\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bC\u0010MR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\bO\u0010MR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bK\u0010VR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bA\u0010YR\u001a\u0010\u001b\u001a\u00020\u001a8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010YR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b3\u0010Y¨\u0006`"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "countDown", "Lkn/b;", "selfieError", "", "startCaptureTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(ILkn/b;JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(ILkn/b;JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "D", "c", "Lkn/b;", "G", "()Lkn/b;", "d", "J", "n", "()J", "e", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "f", "t", "g", "F", "E", "()F", "h", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "C", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "i", "Ljava/util/List;", "()Ljava/util/List;", "j", "w", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "l", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "m", "Z", "()Z", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "o", "s", "p", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountdownToCapture extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int countDown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final kn.b selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieBrightnessInfo brightnessInfo;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                kn.b bVarValueOf = parcel.readInt() == 0 ? null : kn.b.valueOf(parcel.readString());
                long j10 = parcel.readLong();
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                long j11 = parcel.readLong();
                float f10 = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                return new CountdownToCapture(i10, bVarValueOf, j10, cameraProperties, j11, f10, selfieBrightnessInfo, arrayList, arrayList2, (SelfieState) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture[] newArray(int i10) {
                return new CountdownToCapture[i10];
            }
        }

        public /* synthetic */ CountdownToCapture(int i10, kn.b bVar, long j10, CameraProperties cameraProperties, long j11, float f10, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, SelfieState selfieState, PoseConfigs poseConfigs, boolean z10, CameraProperties.b bVar2, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : bVar, j10, cameraProperties, j11, f10, selfieBrightnessInfo, list, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? kotlin.collections.p.k() : list2, selfieState, poseConfigs, z10, bVar2, z11, z12);
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final int getCountDown() {
            return this.countDown;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Nullable
        /* JADX INFO: renamed from: G, reason: from getter */
        public final kn.b getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return this.countDown == countdownToCapture.countDown && this.selfieError == countdownToCapture.selfieError && this.startCaptureTimestamp == countdownToCapture.startCaptureTimestamp && Intrinsics.c(this.cameraProperties, countdownToCapture.cameraProperties) && this.startSelfieTimestamp == countdownToCapture.startSelfieTimestamp && Float.compare(this.poseScore, countdownToCapture.poseScore) == 0 && Intrinsics.c(this.brightnessInfo, countdownToCapture.brightnessInfo) && Intrinsics.c(this.posesNeeded, countdownToCapture.posesNeeded) && Intrinsics.c(this.selfies, countdownToCapture.selfies) && Intrinsics.c(this.backState, countdownToCapture.backState) && Intrinsics.c(this.poseConfigs, countdownToCapture.poseConfigs) && this.autoCaptureSupported == countdownToCapture.autoCaptureSupported && this.cameraFacingMode == countdownToCapture.cameraFacingMode && this.isFlashEnabled == countdownToCapture.isFlashEnabled && this.isDimLightConditions == countdownToCapture.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            kn.b bVar = this.selfieError;
            int iHashCode2 = (((((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode3 = (((((iHashCode2 + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.selfies.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((((iHashCode3 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseConfig k() {
            return super.k();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "CountdownToCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", selfies=" + this.selfies + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.countDown);
            kn.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<PoseInfo> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<Selfie> list2 = this.selfies;
            dest.writeInt(list2.size());
            Iterator<Selfie> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            dest.writeInt(this.isDimLightConditions ? 1 : 0);
        }

        @NotNull
        public final CountdownToCapture z(int countDown, @Nullable kn.b selfieError, long startCaptureTimestamp, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, float poseScore, @Nullable SelfieBrightnessInfo brightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends Selfie> selfies, @Nullable SelfieState backState, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new CountdownToCapture(countDown, selfieError, startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, selfies, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(int i10, @Nullable kn.b bVar, long j10, @NotNull CameraProperties cameraProperties, long j11, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends Selfie> selfies, @Nullable SelfieState selfieState, @NotNull PoseConfigs poseConfigs, boolean z10, @NotNull CameraProperties.b cameraFacingMode, boolean z11, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.countDown = i10;
            this.selfieError = bVar;
            this.startCaptureTimestamp = j10;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.poseScore = f10;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = posesNeeded;
            this.selfies = selfies;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z10;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.isDimLightConditions = z12;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R&\u0010/\u001a\b\u0012\u0004\u0012\u00020(0'8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "", "errorMessage", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "c", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "d", "Ljava/lang/String;", "C", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "e", "Ljava/util/List;", "w", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowInstructions extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String errorMessage;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Selfie> selfies;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructions> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowInstructions((SelfieState) parcel.readParcelable(ShowInstructions.class.getClassLoader()), CameraProperties.b.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions[] newArray(int i10) {
                return new ShowInstructions[i10];
            }
        }

        public /* synthetic */ ShowInstructions(SelfieState selfieState, CameraProperties.b bVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(selfieState, (i10 & 2) != 0 ? CameraProperties.b.User : bVar, (i10 & 4) != 0 ? null : str);
        }

        public static /* synthetic */ ShowInstructions A(ShowInstructions showInstructions, SelfieState selfieState, CameraProperties.b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                selfieState = showInstructions.backState;
            }
            if ((i10 & 2) != 0) {
                bVar = showInstructions.cameraFacingMode;
            }
            if ((i10 & 4) != 0) {
                str = showInstructions.errorMessage;
            }
            return showInstructions.z(selfieState, bVar, str);
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowInstructions)) {
                return false;
            }
            ShowInstructions showInstructions = (ShowInstructions) other;
            return Intrinsics.c(this.backState, showInstructions.backState) && this.cameraFacingMode == showInstructions.cameraFacingMode && Intrinsics.c(this.errorMessage, showInstructions.errorMessage);
        }

        public int hashCode() {
            SelfieState selfieState = this.backState;
            int iHashCode = (((selfieState == null ? 0 : selfieState.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31;
            String str = this.errorMessage;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ShowInstructions(backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ", errorMessage=" + this.errorMessage + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeString(this.errorMessage);
        }

        @NotNull
        public final ShowInstructions z(@Nullable SelfieState backState, @NotNull CameraProperties.b cameraFacingMode, @Nullable String errorMessage) {
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new ShowInstructions(backState, cameraFacingMode, errorMessage);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowInstructions(@Nullable SelfieState selfieState, @NotNull CameraProperties.b cameraFacingMode, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.errorMessage = str;
            this.selfies = kotlin.collections.p.k();
        }
    }

    public SelfieState() {
    }

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¥\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b(\u0010)JÄ\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020!HÖ\u0001¢\u0006\u0004\b/\u0010#J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bD\u0010KR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010F\u001a\u0004\bM\u0010HR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bL\u0010XR\u001a\u0010\u0019\u001a\u00020\u00188\u0010X\u0090\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010\u001a\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010J\u001a\u0004\b]\u0010KR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010\u001e\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bf\u0010J\u001a\u0004\bF\u0010K¨\u0006g"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "Lkn/b;", "selfieError", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;", "flashState", "captureDeadlineEpochMs", "isDimLightConditions", "<init>", "(Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lkn/b;", "I", "()Lkn/b;", "c", "F", "G", "()F", "d", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "C", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "e", "Ljava/util/List;", "w", "()Ljava/util/List;", "f", "g", "J", "n", "()J", "h", "Z", "()Z", "i", "t", "j", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "l", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "m", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "s", "o", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;", "E", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;", "p", "Ljava/lang/Long;", "D", "()Ljava/lang/Long;", "q", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Capture extends SelfieState implements b {

        @NotNull
        public static final Parcelable.Creator<Capture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final kn.b selfieError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieBrightnessInfo brightnessInfo;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final a flashState;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Long captureDeadlineEpochMs;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Capture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Capture createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                boolean z12;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                kn.b bVarValueOf = parcel.readInt() == 0 ? null : kn.b.valueOf(parcel.readString());
                float f10 = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(Capture.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Capture.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                long j10 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z12 = true;
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = true;
                    z12 = false;
                }
                return new Capture(bVarValueOf, f10, selfieBrightnessInfo, arrayList, arrayList2, j10, z12, parcel.readLong(), (CameraProperties) parcel.readParcelable(Capture.class.getClassLoader()), (SelfieState) parcel.readParcelable(Capture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? z11 : z10, a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? z11 : z10);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Capture[] newArray(int i10) {
                return new Capture[i10];
            }
        }

        public /* synthetic */ Capture(kn.b bVar, float f10, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, long j10, boolean z10, long j11, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.b bVar2, boolean z11, a aVar, Long l10, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bVar, f10, selfieBrightnessInfo, (i10 & 8) != 0 ? kotlin.collections.p.k() : list, list2, j10, (i10 & 64) != 0 ? true : z10, j11, cameraProperties, selfieState, poseConfigs, bVar2, z11, (i10 & 8192) != 0 ? a.Disabled : aVar, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : l10, z12);
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final Long getCaptureDeadlineEpochMs() {
            return this.captureDeadlineEpochMs;
        }

        @NotNull
        /* JADX INFO: renamed from: E, reason: from getter */
        public final a getFlashState() {
            return this.flashState;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final kn.b getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Capture)) {
                return false;
            }
            Capture capture = (Capture) other;
            return this.selfieError == capture.selfieError && Float.compare(this.poseScore, capture.poseScore) == 0 && Intrinsics.c(this.brightnessInfo, capture.brightnessInfo) && Intrinsics.c(this.selfies, capture.selfies) && Intrinsics.c(this.posesNeeded, capture.posesNeeded) && this.startCaptureTimestamp == capture.startCaptureTimestamp && this.autoCaptureSupported == capture.autoCaptureSupported && this.startSelfieTimestamp == capture.startSelfieTimestamp && Intrinsics.c(this.cameraProperties, capture.cameraProperties) && Intrinsics.c(this.backState, capture.backState) && Intrinsics.c(this.poseConfigs, capture.poseConfigs) && this.cameraFacingMode == capture.cameraFacingMode && this.isFlashEnabled == capture.isFlashEnabled && this.flashState == capture.flashState && Intrinsics.c(this.captureDeadlineEpochMs, capture.captureDeadlineEpochMs) && this.isDimLightConditions == capture.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            kn.b bVar = this.selfieError;
            int iHashCode = (((bVar == null ? 0 : bVar.hashCode()) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode2 = (((((((((((((iHashCode + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.selfies.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            int iHashCode3 = (((((((((iHashCode2 + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + this.flashState.hashCode()) * 31;
            Long l10 = this.captureDeadlineEpochMs;
            return ((iHashCode3 + (l10 != null ? l10.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseConfig k() {
            return super.k();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.b
        /* JADX INFO: renamed from: n, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.b
        public boolean o() {
            return super.o();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "Capture(selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", flashState=" + this.flashState + ", captureDeadlineEpochMs=" + this.captureDeadlineEpochMs + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            kn.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<PoseInfo> list2 = this.posesNeeded;
            dest.writeInt(list2.size());
            Iterator<PoseInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            dest.writeString(this.flashState.name());
            Long l10 = this.captureDeadlineEpochMs;
            if (l10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l10.longValue());
            }
            dest.writeInt(this.isDimLightConditions ? 1 : 0);
        }

        @NotNull
        public final Capture z(@Nullable kn.b selfieError, float poseScore, @Nullable SelfieBrightnessInfo brightnessInfo, @NotNull List<? extends Selfie> selfies, @NotNull List<PoseInfo> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @NotNull CameraProperties cameraProperties, @Nullable SelfieState backState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled, @NotNull a flashState, @Nullable Long captureDeadlineEpochMs, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(flashState, "flashState");
            return new Capture(selfieError, poseScore, brightnessInfo, selfies, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs, cameraFacingMode, isFlashEnabled, flashState, captureDeadlineEpochMs, isDimLightConditions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Capture(@Nullable kn.b bVar, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull List<? extends Selfie> selfies, @NotNull List<PoseInfo> posesNeeded, long j10, boolean z10, long j11, @NotNull CameraProperties cameraProperties, @Nullable SelfieState selfieState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean z11, @NotNull a flashState, @Nullable Long l10, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(flashState, "flashState");
            this.selfieError = bVar;
            this.poseScore = f10;
            this.brightnessInfo = selfieBrightnessInfo;
            this.selfies = selfies;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j10;
            this.autoCaptureSupported = z10;
            this.startSelfieTimestamp = j11;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.flashState = flashState;
            this.captureDeadlineEpochMs = l10;
            this.isDimLightConditions = z12;
        }
    }

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0099\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J¸\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b-\u0010!J\u001a\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bF\u0010ER\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bB\u00105R\u001a\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010JR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bK\u0010XR\u001a\u0010\u001a\u001a\u00020\u00198\u0010X\u0090\u0004¢\u0006\f\n\u0004\bI\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u00103\u001a\u0004\b]\u00105R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b^\u00103\u001a\u0004\b_\u00105¨\u0006`"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "", "centered", "Lkn/b;", "selfieError", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "startCaptureTimestamp", "autoCaptureSupported", "startSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "z", "(ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getCentered", "()Z", "c", "Lkn/b;", "E", "()Lkn/b;", "d", "F", "D", "()F", "e", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "C", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "w", "h", "J", "n", "()J", "i", "j", "t", "k", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "l", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "m", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "v", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "o", "s", "p", "G", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartCapture extends SelfieState implements b {

        @NotNull
        public static final Parcelable.Creator<StartCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean centered;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final kn.b selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieBrightnessInfo brightnessInfo;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Selfie> selfies;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final SelfieState backState;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties.b cameraFacingMode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StartCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z10 = parcel.readInt() != 0;
                kn.b bVarValueOf = parcel.readInt() == 0 ? null : kn.b.valueOf(parcel.readString());
                float f10 = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(StartCapture.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(StartCapture.class.getClassLoader()));
                }
                return new StartCapture(z10, bVarValueOf, f10, selfieBrightnessInfo, arrayList, arrayList2, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (CameraProperties) parcel.readParcelable(StartCapture.class.getClassLoader()), (SelfieState) parcel.readParcelable(StartCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StartCapture[] newArray(int i10) {
                return new StartCapture[i10];
            }
        }

        public /* synthetic */ StartCapture(boolean z10, kn.b bVar, float f10, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, long j10, boolean z11, long j11, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.b bVar2, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? kn.b.FaceNotCentered : bVar, f10, selfieBrightnessInfo, list, (i10 & 32) != 0 ? kotlin.collections.p.k() : list2, j10, (i10 & 128) != 0 ? true : z11, j11, cameraProperties, selfieState, poseConfigs, bVar2, z12, z13);
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final kn.b getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCapture)) {
                return false;
            }
            StartCapture startCapture = (StartCapture) other;
            return this.centered == startCapture.centered && this.selfieError == startCapture.selfieError && Float.compare(this.poseScore, startCapture.poseScore) == 0 && Intrinsics.c(this.brightnessInfo, startCapture.brightnessInfo) && Intrinsics.c(this.posesNeeded, startCapture.posesNeeded) && Intrinsics.c(this.selfies, startCapture.selfies) && this.startCaptureTimestamp == startCapture.startCaptureTimestamp && this.autoCaptureSupported == startCapture.autoCaptureSupported && this.startSelfieTimestamp == startCapture.startSelfieTimestamp && Intrinsics.c(this.cameraProperties, startCapture.cameraProperties) && Intrinsics.c(this.backState, startCapture.backState) && Intrinsics.c(this.poseConfigs, startCapture.poseConfigs) && this.cameraFacingMode == startCapture.cameraFacingMode && this.isFlashEnabled == startCapture.isFlashEnabled && this.isDimLightConditions == startCapture.isDimLightConditions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public List<PoseInfo> g() {
            return this.posesNeeded;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.centered) * 31;
            kn.b bVar = this.selfieError;
            int iHashCode2 = (((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode3 = (((((((((((((iHashCode2 + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.selfies.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((iHashCode3 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public kn.a j() {
            return super.j();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseConfig k() {
            return super.k();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @Nullable
        public kn.a m() {
            return super.m();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.b
        /* JADX INFO: renamed from: n, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.b
        public boolean o() {
            return super.o();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "StartCapture(centered=" + this.centered + ", selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", selfies=" + this.selfies + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public CameraProperties.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        @NotNull
        public List<Selfie> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.centered ? 1 : 0);
            kn.b bVar = this.selfieError;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<PoseInfo> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<Selfie> list2 = this.selfies;
            dest.writeInt(list2.size());
            Iterator<Selfie> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            dest.writeInt(this.isDimLightConditions ? 1 : 0);
        }

        @NotNull
        public final StartCapture z(boolean centered, @Nullable kn.b selfieError, float poseScore, @Nullable SelfieBrightnessInfo brightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends Selfie> selfies, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @NotNull CameraProperties cameraProperties, @Nullable SelfieState backState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new StartCapture(centered, selfieError, poseScore, brightnessInfo, posesNeeded, selfies, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCapture(boolean z10, @Nullable kn.b bVar, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends Selfie> selfies, long j10, boolean z11, long j11, @NotNull CameraProperties cameraProperties, @Nullable SelfieState selfieState, @NotNull PoseConfigs poseConfigs, @NotNull CameraProperties.b cameraFacingMode, boolean z12, boolean z13) {
            super(null);
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.centered = z10;
            this.selfieError = bVar;
            this.poseScore = f10;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = posesNeeded;
            this.selfies = selfies;
            this.startCaptureTimestamp = j10;
            this.autoCaptureSupported = z11;
            this.startSelfieTimestamp = j11;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
            this.isDimLightConditions = z13;
        }
    }
}
