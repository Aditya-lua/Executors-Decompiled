package mq;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0012\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"\u0005#$%&'(B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148 X \u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0011)*+,-./0123456789¨\u0006:"}, d2 = {"Lmq/y0;", "Lls/c;", "<init>", "()V", BuildConfig.FLAVOR, "a", "Z", "getDidGoBack$selfie_release", "()Z", "x", "(Z)V", "didGoBack", BuildConfig.FLAVOR, "Lmq/b0;", "w", "()Ljava/util/List;", "selfies", "u", "()Lmq/y0;", "backState", "Lsn/v$b;", "v", "()Lsn/v$b;", "cameraFacingMode", "k", "p", "i", "q", "l", "m", "n", "d", "e", "h", "b", "c", "f", "g", "r", "j", "o", "Lmq/y0$a;", "Lmq/y0$b;", "Lmq/y0$c;", "Lmq/y0$d;", "Lmq/y0$e;", "Lmq/y0$f;", "Lmq/y0$g;", "Lmq/y0$i;", "Lmq/y0$j;", "Lmq/y0$k;", "Lmq/y0$l;", "Lmq/y0$m;", "Lmq/y0$n;", "Lmq/y0$o;", "Lmq/y0$p;", "Lmq/y0$q;", "Lmq/y0$r;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class y0 extends ls.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean didGoBack;

    /* JADX INFO: renamed from: mq.y0$a, reason: from toString */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\f\u001a\u00020\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u00104R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\b<\u0010?¨\u0006E"}, d2 = {"Lmq/y0$a;", "Lmq/y0;", "Lmq/a;", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "backState", "Lsn/v$b;", "cameraFacingMode", BuildConfig.FLAVOR, "isFlashEnabled", "Lrq/a;", "posesNeeded", "Lmq/t;", "poseConfigs", "autoCaptureSupported", "<init>", "(Lsn/v;JLjava/util/List;Lmq/y0;Lsn/v$b;ZLjava/util/List;Lmq/t;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(Lsn/v;JLjava/util/List;Lmq/y0;Lsn/v$b;ZLjava/util/List;Lmq/t;Z)Lmq/y0$a;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lsn/v;", "f", "()Lsn/v;", "c", "J", "t", "()J", "d", "Ljava/util/List;", "w", "()Ljava/util/List;", "e", "Lmq/y0;", "u", "()Lmq/y0;", "Lsn/v$b;", "v", "()Lsn/v$b;", "g", "Z", "s", "()Z", "h", "i", "Lmq/t;", "j", "()Lmq/t;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcquireNextPose extends y0 implements a {

        @NotNull
        public static final Parcelable.Creator<AcquireNextPose> CREATOR = new C0477a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

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

        /* JADX INFO: renamed from: mq.y0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0477a implements Parcelable.Creator<AcquireNextPose> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AcquireNextPose createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                sn.v vVar = (sn.v) parcel.readParcelable(AcquireNextPose.class.getClassLoader());
                long j10 = parcel.readLong();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(AcquireNextPose.class.getClassLoader()));
                }
                y0 y0Var = (y0) parcel.readParcelable(AcquireNextPose.class.getClassLoader());
                sn.v.b bVarValueOf = sn.v.b.valueOf(parcel.readString());
                boolean z10 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                return new AcquireNextPose(vVar, j10, arrayList, y0Var, bVarValueOf, z10, arrayList2, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AcquireNextPose[] newArray(int i10) {
                return new AcquireNextPose[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AcquireNextPose(@NotNull sn.v cameraProperties, long j10, @NotNull List<? extends b0> selfies, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode, boolean z10, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.selfies = selfies;
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z10;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AcquireNextPose z(AcquireNextPose acquireNextPose, sn.v vVar, long j10, List list, y0 y0Var, sn.v.b bVar, boolean z10, List list2, PoseConfigs poseConfigs, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = acquireNextPose.cameraProperties;
            }
            if ((i10 & 2) != 0) {
                j10 = acquireNextPose.startSelfieTimestamp;
            }
            if ((i10 & 4) != 0) {
                list = acquireNextPose.selfies;
            }
            if ((i10 & 8) != 0) {
                y0Var = acquireNextPose.backState;
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
            if ((i10 & Barcode.FORMAT_ITF) != 0) {
                poseConfigs = acquireNextPose.poseConfigs;
            }
            if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                z11 = acquireNextPose.autoCaptureSupported;
            }
            PoseConfigs poseConfigs2 = poseConfigs;
            boolean z12 = z11;
            List list3 = list2;
            sn.v.b bVar2 = bVar;
            List list4 = list;
            return acquireNextPose.y(vVar, j10, list4, y0Var, bVar2, z10, list3, poseConfigs2, z12);
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            int iHashCode = ((((this.cameraProperties.hashCode() * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.selfies.hashCode()) * 31;
            y0 y0Var = this.backState;
            return ((((((((((iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "AcquireNextPose(cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", selfies=" + this.selfies + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
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
        public final AcquireNextPose y(@NotNull sn.v cameraProperties, long startSelfieTimestamp, @NotNull List<? extends b0> selfies, @Nullable y0 backState, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new AcquireNextPose(cameraProperties, startSelfieTimestamp, selfies, backState, cameraFacingMode, isFlashEnabled, posesNeeded, poseConfigs, autoCaptureSupported);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8PX\u0090\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lmq/y0$c;", "Lmq/y0;", "nextState", "Lxn/a;", "completedPose", "backState", "Lsn/v$b;", "cameraFacingMode", BuildConfig.FLAVOR, "isFlashOn", "<init>", "(Lmq/y0;Lxn/a;Lmq/y0;Lsn/v$b;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lmq/y0;", "z", "()Lmq/y0;", "c", "Lxn/a;", "y", "()Lxn/a;", "d", "u", "e", "Lsn/v$b;", "v", "()Lsn/v$b;", "f", "Z", "B", "()Z", BuildConfig.FLAVOR, "Lmq/b0;", "w", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends y0 {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final y0 nextState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final xn.a completedPose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final boolean isFlashOn;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c((y0) parcel.readParcelable(c.class.getClassLoader()), xn.a.valueOf(parcel.readString()), (y0) parcel.readParcelable(c.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull y0 nextState, @NotNull xn.a completedPose, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(nextState, "nextState");
            Intrinsics.checkNotNullParameter(completedPose, "completedPose");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.nextState = nextState;
            this.completedPose = completedPose;
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashOn = z10;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getIsFlashOn() {
            return this.isFlashOn;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
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
        /* JADX INFO: renamed from: y, reason: from getter */
        public final xn.a getCompletedPose() {
            return this.completedPose;
        }

        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public final y0 getNextState() {
            return this.nextState;
        }
    }

    /* JADX INFO: renamed from: mq.y0$e, reason: from toString */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0092\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bN\u0010@R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bP\u0010@R&\u0010V\u001a\b\u0012\u0004\u0012\u00020Q0\t8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bR\u00108\u0012\u0004\bT\u0010U\u001a\u0004\bS\u0010:¨\u0006W"}, d2 = {"Lmq/y0$e;", "Lmq/y0;", "Lmq/b;", BuildConfig.FLAVOR, "countDown", "Lxn/c;", "selfieError", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "Lrq/a;", "posesNeeded", BuildConfig.FLAVOR, "startCaptureTimestamp", BuildConfig.FLAVOR, "autoCaptureSupported", "startSelfieTimestamp", "backState", "Lmq/t;", "poseConfigs", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(ILxn/c;Lsn/v;Ljava/util/List;JZJLmq/y0;Lmq/t;Lsn/v$b;ZZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(ILxn/c;Lsn/v;Ljava/util/List;JZJLmq/y0;Lmq/t;Lsn/v$b;ZZ)Lmq/y0$e;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "B", "c", "Lxn/c;", "C", "()Lxn/c;", "d", "Lsn/v;", "f", "()Lsn/v;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "J", "a", "()J", "g", "Z", "()Z", "h", "t", "Lmq/y0;", "u", "()Lmq/y0;", "j", "Lmq/t;", "()Lmq/t;", "k", "Lsn/v$b;", "v", "()Lsn/v$b;", "l", "s", "m", "D", "Lmq/b0;", "n", "w", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountdownToManualCapture extends y0 implements b {

        @NotNull
        public static final Parcelable.Creator<CountdownToManualCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int countDown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xn.c selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

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
        public final y0 backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: mq.y0$e$a */
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
                xn.c cVarValueOf = parcel.readInt() == 0 ? null : xn.c.valueOf(parcel.readString());
                sn.v vVar = (sn.v) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader());
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
                return new CountdownToManualCapture(i10, cVarValueOf, vVar, arrayList, j10, z12, parcel.readLong(), (y0) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? z11 : z10, parcel.readInt() != 0 ? z11 : z10);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToManualCapture[] newArray(int i10) {
                return new CountdownToManualCapture[i10];
            }
        }

        public /* synthetic */ CountdownToManualCapture(int i10, xn.c cVar, sn.v vVar, List list, long j10, boolean z10, long j11, y0 y0Var, PoseConfigs poseConfigs, sn.v.b bVar, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : cVar, vVar, list, j10, (i11 & 32) != 0 ? true : z10, j11, y0Var, poseConfigs, bVar, z11, z12);
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final int getCountDown() {
            return this.countDown;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final xn.c getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // mq.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            xn.c cVar = this.selfieError;
            int iHashCode2 = (((((((((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            y0 y0Var = this.backState;
            return ((((((((iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @NotNull
        public PoseConfig l() {
            return super.l();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.b
        public boolean o() {
            return super.o();
        }

        @Override // mq.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "CountdownToManualCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", cameraProperties=" + this.cameraProperties + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.countDown);
            xn.c cVar = this.selfieError;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
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
        public final CountdownToManualCapture y(int countDown, @Nullable xn.c selfieError, @NotNull sn.v cameraProperties, @NotNull List<PoseInfo> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @Nullable y0 backState, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new CountdownToManualCapture(countDown, selfieError, cameraProperties, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountdownToManualCapture(int i10, @Nullable xn.c cVar, @NotNull sn.v cameraProperties, @NotNull List<PoseInfo> posesNeeded, long j10, boolean z10, long j11, @Nullable y0 y0Var, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean z11, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.countDown = i10;
            this.selfieError = cVar;
            this.cameraProperties = cameraProperties;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j10;
            this.autoCaptureSupported = z10;
            this.startSelfieTimestamp = j11;
            this.backState = y0Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.isDimLightConditions = z12;
            this.selfies = p001kotlin.collections.p.k();
        }
    }

    /* JADX INFO: renamed from: mq.y0$f, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lmq/y0$f;", "Lmq/y0;", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", BuildConfig.FLAVOR, "minDurationMs", BuildConfig.FLAVOR, "isDelayComplete", "isFinalizeComplete", "Lsn/v;", "cameraProperties", "startSelfieTimestamp", "backState", "Lsn/v$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;JZZLsn/v;JLmq/y0;Lsn/v$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(Ljava/util/List;JZZLsn/v;JLmq/y0;Lsn/v$b;)Lmq/y0$f;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "J", "B", "()J", "d", "Z", "C", "()Z", "e", "D", "f", "Lsn/v;", "()Lsn/v;", "g", "t", "h", "Lmq/y0;", "u", "()Lmq/y0;", "i", "Lsn/v$b;", "v", "()Lsn/v$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends y0 {

        @NotNull
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final long minDurationMs;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDelayComplete;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFinalizeComplete;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: mq.y0$f$a */
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
                return new FinalizeLocalVideoCapture(arrayList, j10, z11, parcel.readInt() != 0 ? z10 : false, (sn.v) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readLong(), (y0) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture[] newArray(int i10) {
                return new FinalizeLocalVideoCapture[i10];
            }
        }

        public /* synthetic */ FinalizeLocalVideoCapture(List list, long j10, boolean z10, boolean z11, sn.v vVar, long j11, y0 y0Var, sn.v.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j10, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, vVar, j11, y0Var, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinalizeLocalVideoCapture z(FinalizeLocalVideoCapture finalizeLocalVideoCapture, List list, long j10, boolean z10, boolean z11, sn.v vVar, long j11, y0 y0Var, sn.v.b bVar, int i10, Object obj) {
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
                vVar = finalizeLocalVideoCapture.cameraProperties;
            }
            if ((i10 & 32) != 0) {
                j11 = finalizeLocalVideoCapture.startSelfieTimestamp;
            }
            if ((i10 & 64) != 0) {
                y0Var = finalizeLocalVideoCapture.backState;
            }
            if ((i10 & Barcode.FORMAT_ITF) != 0) {
                bVar = finalizeLocalVideoCapture.cameraFacingMode;
            }
            long j12 = j11;
            sn.v vVar2 = vVar;
            boolean z12 = z10;
            return finalizeLocalVideoCapture.y(list, j10, z12, z11, vVar2, j12, y0Var, bVar);
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getIsFinalizeComplete() {
            return this.isFinalizeComplete;
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

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.selfies.hashCode() * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete)) * 31) + Boolean.hashCode(this.isFinalizeComplete)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            y0 y0Var = this.backState;
            return ((iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "FinalizeLocalVideoCapture(selfies=" + this.selfies + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ", isFinalizeComplete=" + this.isFinalizeComplete + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
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
        public final FinalizeLocalVideoCapture y(@NotNull List<? extends b0> selfies, long minDurationMs, boolean isDelayComplete, boolean isFinalizeComplete, @NotNull sn.v cameraProperties, long startSelfieTimestamp, @Nullable y0 backState, @NotNull sn.v.b cameraFacingMode) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new FinalizeLocalVideoCapture(selfies, minDurationMs, isDelayComplete, isFinalizeComplete, cameraProperties, startSelfieTimestamp, backState, cameraFacingMode);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(@NotNull List<? extends b0> selfies, long j10, boolean z10, boolean z11, @NotNull sn.v cameraProperties, long j11, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode) {
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
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lmq/y0$g;", "Lmq/y0;", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", "Lsn/v$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Lsn/v;JLmq/y0;Lsn/v$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "Lsn/v;", "f", "()Lsn/v;", "d", "J", "t", "()J", "e", "Lmq/y0;", "u", "()Lmq/y0;", "Lsn/v$b;", "v", "()Lsn/v$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g extends y0 {

        @NotNull
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(g.class.getClassLoader()));
                }
                return new g(arrayList, (sn.v) parcel.readParcelable(g.class.getClassLoader()), parcel.readLong(), (y0) parcel.readParcelable(g.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(@NotNull List<? extends b0> selfies, @NotNull sn.v cameraProperties, long j10, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lmq/y0$h;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum h {
        Disabled,
        Enabled,
        FlashOn,
        ReadyToCapture;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ hu.a f24261f = hu.b.a(a());
    }

    /* JADX INFO: renamed from: mq.y0$i, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u00101\u001a\b\u0012\u0004\u0012\u00020*0)8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lmq/y0$i;", "Lmq/y0;", BuildConfig.FLAVOR, "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "Lsn/v$b;", "cameraFacingMode", "<init>", "(ZZLmq/y0;Lsn/v$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getHasRequestedCameraPermissions", "()Z", "c", "getHasRequestedAudioPermissions", "d", "Lmq/y0;", "u", "()Lmq/y0;", "e", "Lsn/v$b;", "v", "()Lsn/v$b;", BuildConfig.FLAVOR, "Lmq/b0;", "f", "Ljava/util/List;", "w", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestartCamera extends y0 {

        @NotNull
        public static final Parcelable.Creator<RestartCamera> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean hasRequestedCameraPermissions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean hasRequestedAudioPermissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: mq.y0$i$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestartCamera> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RestartCamera createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestartCamera(parcel.readInt() != 0, parcel.readInt() != 0, (y0) parcel.readParcelable(RestartCamera.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RestartCamera[] newArray(int i10) {
                return new RestartCamera[i10];
            }
        }

        public /* synthetic */ RestartCamera(boolean z10, boolean z11, y0 y0Var, sn.v.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, y0Var, bVar);
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
            y0 y0Var = this.backState;
            return ((iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        @NotNull
        public String toString() {
            return "RestartCamera(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
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
        public RestartCamera(boolean z10, boolean z11, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z10;
            this.hasRequestedAudioPermissions = z11;
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
            this.selfies = p001kotlin.collections.p.k();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lmq/y0$j;", "Lmq/y0;", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "selfiesToReview", BuildConfig.FLAVOR, "webRtcObjectId", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", "Lsn/v$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;Lsn/v$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "y", "d", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "e", "Lsn/v;", "f", "()Lsn/v;", "J", "t", "()J", "g", "Lmq/y0;", "u", "()Lmq/y0;", "h", "Lsn/v$b;", "v", "()Lsn/v$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j extends y0 {

        @NotNull
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> selfiesToReview;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String webRtcObjectId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(j.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(j.class.getClassLoader()));
                }
                return new j(arrayList, arrayList2, parcel.readString(), (sn.v) parcel.readParcelable(j.class.getClassLoader()), parcel.readLong(), (y0) parcel.readParcelable(j.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i10) {
                return new j[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(@NotNull List<? extends b0> selfies, @NotNull List<? extends b0> selfiesToReview, @Nullable String str, @NotNull sn.v cameraProperties, long j10, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode) {
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
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<b0> list2 = this.selfiesToReview;
            dest.writeInt(list2.size());
            Iterator<b0> it2 = list2.iterator();
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
        public final List<b0> y() {
            return this.selfiesToReview;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }
    }

    /* JADX INFO: renamed from: mq.y0$l, reason: from toString */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\bD\u00102¨\u0006E"}, d2 = {"Lmq/y0$l;", "Lmq/y0;", "Lmq/a;", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "Lrq/a;", "posesNeeded", BuildConfig.FLAVOR, "autoCaptureSupported", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", "Lmq/t;", "poseConfigs", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;ZLsn/v;JLmq/y0;Lmq/t;Lsn/v$b;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(Ljava/util/List;Ljava/util/List;ZLsn/v;JLmq/y0;Lmq/t;Lsn/v$b;Z)Lmq/y0$l;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "i", "d", "Z", "g", "()Z", "e", "Lsn/v;", "f", "()Lsn/v;", "J", "t", "()J", "Lmq/y0;", "u", "()Lmq/y0;", "h", "Lmq/t;", "j", "()Lmq/t;", "Lsn/v$b;", "v", "()Lsn/v$b;", "s", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowPoseHint extends y0 implements mq.a {

        @NotNull
        public static final Parcelable.Creator<ShowPoseHint> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: mq.y0$l$a */
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
                return new ShowPoseHint(arrayList, arrayList2, parcel.readInt() != 0, (sn.v) parcel.readParcelable(r4.getClassLoader()), parcel.readLong(), (y0) parcel.readParcelable(ShowPoseHint.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowPoseHint[] newArray(int i10) {
                return new ShowPoseHint[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowPoseHint(@NotNull List<? extends b0> selfies, @NotNull List<PoseInfo> posesNeeded, boolean z10, @NotNull sn.v cameraProperties, long j10, @Nullable y0 y0Var, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean z11) {
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
            this.backState = y0Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowPoseHint z(ShowPoseHint showPoseHint, List list, List list2, boolean z10, sn.v vVar, long j10, y0 y0Var, PoseConfigs poseConfigs, sn.v.b bVar, boolean z11, int i10, Object obj) {
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
                vVar = showPoseHint.cameraProperties;
            }
            if ((i10 & 16) != 0) {
                j10 = showPoseHint.startSelfieTimestamp;
            }
            if ((i10 & 32) != 0) {
                y0Var = showPoseHint.backState;
            }
            if ((i10 & 64) != 0) {
                poseConfigs = showPoseHint.poseConfigs;
            }
            if ((i10 & Barcode.FORMAT_ITF) != 0) {
                bVar = showPoseHint.cameraFacingMode;
            }
            if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                z11 = showPoseHint.isFlashEnabled;
            }
            long j11 = j10;
            boolean z12 = z10;
            sn.v vVar2 = vVar;
            return showPoseHint.y(list, list2, z12, vVar2, j11, y0Var, poseConfigs, bVar, z11);
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.selfies.hashCode() * 31) + this.posesNeeded.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            y0 y0Var = this.backState;
            return ((((((iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "ShowPoseHint(selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
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
        public final ShowPoseHint y(@NotNull List<? extends b0> selfies, @NotNull List<PoseInfo> posesNeeded, boolean autoCaptureSupported, @NotNull sn.v cameraProperties, long startSelfieTimestamp, @Nullable y0 backState, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new ShowPoseHint(selfies, posesNeeded, autoCaptureSupported, cameraProperties, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }
    }

    /* JADX INFO: renamed from: mq.y0$n, reason: from toString */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J¢\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\b>\u0010?R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bB\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010KR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b@\u0010NR\u001a\u0010\u0017\u001a\u00020\u00168\u0010X\u0090\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010NR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bU\u0010M\u001a\u0004\bV\u0010N¨\u0006W"}, d2 = {"Lmq/y0$n;", "Lmq/y0;", "Lmq/a;", BuildConfig.FLAVOR, "startCaptureTimestamp", "Lsn/v;", "cameraProperties", "startSelfieTimestamp", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", BuildConfig.FLAVOR, "Lrq/a;", "posesNeeded", "Lmq/b0;", "selfies", "backState", "Lmq/t;", "poseConfigs", BuildConfig.FLAVOR, "autoCaptureSupported", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(JLsn/v;JFLxn/b;Ljava/util/List;Ljava/util/List;Lmq/y0;Lmq/t;ZLsn/v$b;ZZ)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(JLsn/v;JFLxn/b;Ljava/util/List;Ljava/util/List;Lmq/y0;Lmq/t;ZLsn/v$b;ZZ)Lmq/y0$n;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "a", "()J", "c", "Lsn/v;", "f", "()Lsn/v;", "d", "t", "e", "F", "C", "()F", "Lxn/b;", "B", "()Lxn/b;", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "h", "w", "Lmq/y0;", "u", "()Lmq/y0;", "j", "Lmq/t;", "()Lmq/t;", "k", "Z", "()Z", "l", "Lsn/v$b;", "v", "()Lsn/v$b;", "m", "s", "n", "D", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartCaptureFaceDetected extends y0 implements mq.a {

        @NotNull
        public static final Parcelable.Creator<StartCaptureFaceDetected> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xn.b brightnessInfo;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        /* JADX INFO: renamed from: mq.y0$n$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCaptureFaceDetected> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StartCaptureFaceDetected createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                long j10 = parcel.readLong();
                sn.v vVar = (sn.v) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                long j11 = parcel.readLong();
                float f10 = parcel.readFloat();
                xn.b bVar = (xn.b) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
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
                y0 y0Var = (y0) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z10 = true;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                return new StartCaptureFaceDetected(j10, vVar, j11, f10, bVar, arrayList, arrayList2, y0Var, poseConfigsCreateFromParcel, z10, sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? z10 : false);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StartCaptureFaceDetected[] newArray(int i10) {
                return new StartCaptureFaceDetected[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCaptureFaceDetected(long j10, @NotNull sn.v cameraProperties, long j11, float f10, @Nullable xn.b bVar, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends b0> selfies, @Nullable y0 y0Var, @NotNull PoseConfigs poseConfigs, boolean z10, @NotNull sn.v.b cameraFacingMode, boolean z11, boolean z12) {
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
            this.brightnessInfo = bVar;
            this.posesNeeded = posesNeeded;
            this.selfies = selfies;
            this.backState = y0Var;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z10;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.isDimLightConditions = z12;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final xn.b getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            int iHashCode = ((((((Long.hashCode(this.startCaptureTimestamp) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            xn.b bVar = this.brightnessInfo;
            int iHashCode2 = (((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.selfies.hashCode()) * 31;
            y0 y0Var = this.backState;
            return ((((((((((iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @NotNull
        public PoseConfig l() {
            return super.l();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "StartCaptureFaceDetected(startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", selfies=" + this.selfies + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
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
            List<b0> list2 = this.selfies;
            dest.writeInt(list2.size());
            Iterator<b0> it2 = list2.iterator();
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
        public final StartCaptureFaceDetected y(long startCaptureTimestamp, @NotNull sn.v cameraProperties, long startSelfieTimestamp, float poseScore, @Nullable xn.b brightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends b0> selfies, @Nullable y0 backState, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new StartCaptureFaceDetected(startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, selfies, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }
    }

    /* JADX INFO: renamed from: mq.y0$o, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJl\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b6\u00107R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0015R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lmq/y0$o;", "Lmq/y0;", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", BuildConfig.FLAVOR, "webRtcObjectId", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", "Lsn/v$b;", "cameraFacingMode", BuildConfig.FLAVOR, "submitAttempt", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "<init>", "(Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;Lsn/v$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;Lsn/v$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lmq/y0$o;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "Ljava/lang/String;", "D", "d", "Lsn/v;", "f", "()Lsn/v;", "e", "J", "t", "()J", "Lmq/y0;", "u", "()Lmq/y0;", "g", "Lsn/v$b;", "v", "()Lsn/v$b;", "h", "I", "C", "i", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "B", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Submit extends y0 {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String webRtcObjectId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final int submitAttempt;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo recoverableSubmitError;

        /* JADX INFO: renamed from: mq.y0$o$a */
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
                return new Submit(arrayList, parcel.readString(), (sn.v) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readLong(), (y0) parcel.readParcelable(Submit.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()), parcel.readInt(), (InternalErrorInfo) parcel.readParcelable(Submit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Submit[] newArray(int i10) {
                return new Submit[i10];
            }
        }

        public /* synthetic */ Submit(List list, String str, sn.v vVar, long j10, y0 y0Var, sn.v.b bVar, int i10, InternalErrorInfo internalErrorInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, vVar, j10, y0Var, bVar, (i11 & 64) != 0 ? 0 : i10, (i11 & Barcode.FORMAT_ITF) != 0 ? null : internalErrorInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Submit z(Submit submit, List list, String str, sn.v vVar, long j10, y0 y0Var, sn.v.b bVar, int i10, InternalErrorInfo internalErrorInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = submit.selfies;
            }
            if ((i11 & 2) != 0) {
                str = submit.webRtcObjectId;
            }
            if ((i11 & 4) != 0) {
                vVar = submit.cameraProperties;
            }
            if ((i11 & 8) != 0) {
                j10 = submit.startSelfieTimestamp;
            }
            if ((i11 & 16) != 0) {
                y0Var = submit.backState;
            }
            if ((i11 & 32) != 0) {
                bVar = submit.cameraFacingMode;
            }
            if ((i11 & 64) != 0) {
                i10 = submit.submitAttempt;
            }
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                internalErrorInfo = submit.recoverableSubmitError;
            }
            long j11 = j10;
            sn.v vVar2 = vVar;
            return submit.y(list, str, vVar2, j11, y0Var, bVar, i10, internalErrorInfo);
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final InternalErrorInfo getRecoverableSubmitError() {
            return this.recoverableSubmitError;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final int getSubmitAttempt() {
            return this.submitAttempt;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
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

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        public int hashCode() {
            int iHashCode = this.selfies.hashCode() * 31;
            String str = this.webRtcObjectId;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            y0 y0Var = this.backState;
            int iHashCode3 = (((((iHashCode2 + (y0Var == null ? 0 : y0Var.hashCode())) * 31) + this.cameraFacingMode.hashCode()) * 31) + Integer.hashCode(this.submitAttempt)) * 31;
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

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
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
        public final Submit y(@NotNull List<? extends b0> selfies, @Nullable String webRtcObjectId, @NotNull sn.v cameraProperties, long startSelfieTimestamp, @Nullable y0 backState, @NotNull sn.v.b cameraFacingMode, int submitAttempt, @Nullable InternalErrorInfo recoverableSubmitError) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new Submit(selfies, webRtcObjectId, cameraProperties, startSelfieTimestamp, backState, cameraFacingMode, submitAttempt, recoverableSubmitError);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submit(@NotNull List<? extends b0> selfies, @Nullable String str, @NotNull sn.v cameraProperties, long j10, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode, int i10, @Nullable InternalErrorInfo internalErrorInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
            this.submitAttempt = i10;
            this.recoverableSubmitError = internalErrorInfo;
        }
    }

    /* JADX INFO: renamed from: mq.y0$p, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b<\u0010'R&\u0010B\u001a\b\u0012\u0004\u0012\u00020=0\u00068\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b>\u0010/\u0012\u0004\b@\u0010A\u001a\u0004\b?\u00101¨\u0006C"}, d2 = {"Lmq/y0$p;", "Lmq/y0;", BuildConfig.FLAVOR, "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", BuildConfig.FLAVOR, "Lrq/a;", "posesNeeded", "Lmq/t;", "poseConfigs", "autoCaptureSupported", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ZZLmq/y0;Ljava/util/List;Lmq/t;ZLsn/v$b;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(ZZLmq/y0;Ljava/util/List;Lmq/t;ZLsn/v$b;Z)Lmq/y0$p;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "C", "()Z", "c", "B", "d", "Lmq/y0;", "u", "()Lmq/y0;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "f", "Lmq/t;", "getPoseConfigs", "()Lmq/t;", "g", "getAutoCaptureSupported", "h", "Lsn/v$b;", "v", "()Lsn/v$b;", "s", "Lmq/b0;", "j", "w", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitForCameraFeed extends y0 {

        @NotNull
        public static final Parcelable.Creator<WaitForCameraFeed> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean hasRequestedCameraPermissions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean hasRequestedAudioPermissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

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
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: mq.y0$p$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForCameraFeed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForCameraFeed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                y0 y0Var = (y0) parcel.readParcelable(WaitForCameraFeed.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                return new WaitForCameraFeed(z10, z11, y0Var, arrayList, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForCameraFeed[] newArray(int i10) {
                return new WaitForCameraFeed[i10];
            }
        }

        public /* synthetic */ WaitForCameraFeed(boolean z10, boolean z11, y0 y0Var, List list, PoseConfigs poseConfigs, boolean z12, sn.v.b bVar, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, y0Var, list, poseConfigs, (i10 & 32) != 0 ? true : z12, bVar, (i10 & Barcode.FORMAT_ITF) != 0 ? false : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForCameraFeed z(WaitForCameraFeed waitForCameraFeed, boolean z10, boolean z11, y0 y0Var, List list, PoseConfigs poseConfigs, boolean z12, sn.v.b bVar, boolean z13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = waitForCameraFeed.hasRequestedCameraPermissions;
            }
            if ((i10 & 2) != 0) {
                z11 = waitForCameraFeed.hasRequestedAudioPermissions;
            }
            if ((i10 & 4) != 0) {
                y0Var = waitForCameraFeed.backState;
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
            if ((i10 & Barcode.FORMAT_ITF) != 0) {
                z13 = waitForCameraFeed.isFlashEnabled;
            }
            sn.v.b bVar2 = bVar;
            boolean z14 = z13;
            PoseConfigs poseConfigs2 = poseConfigs;
            boolean z15 = z12;
            return waitForCameraFeed.y(z10, z11, y0Var, list, poseConfigs2, z15, bVar2, z14);
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getHasRequestedAudioPermissions() {
            return this.hasRequestedAudioPermissions;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
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

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            y0 y0Var = this.backState;
            return ((((((((((iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @NotNull
        public final List<PoseInfo> i() {
            return this.posesNeeded;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @NotNull
        public String toString() {
            return "WaitForCameraFeed(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
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
        public final WaitForCameraFeed y(boolean hasRequestedCameraPermissions, boolean hasRequestedAudioPermissions, @Nullable y0 backState, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new WaitForCameraFeed(hasRequestedCameraPermissions, hasRequestedAudioPermissions, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForCameraFeed(boolean z10, boolean z11, @Nullable y0 y0Var, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean z12, @NotNull sn.v.b cameraFacingMode, boolean z13) {
            super(null);
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z10;
            this.hasRequestedAudioPermissions = z11;
            this.backState = y0Var;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z12;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z13;
            this.selfies = p001kotlin.collections.p.k();
        }
    }

    /* JADX INFO: renamed from: mq.y0$q, reason: from toString */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b:\u0010@R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b8\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\bD\u0010@R&\u0010J\u001a\b\u0012\u0004\u0012\u00020E0\n8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bF\u00107\u0012\u0004\bH\u0010I\u001a\u0004\bG\u00109¨\u0006K"}, d2 = {"Lmq/y0$q;", "Lmq/y0;", "Lmq/a;", BuildConfig.FLAVOR, "webRtcJwt", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", BuildConfig.FLAVOR, "Lrq/a;", "posesNeeded", "Lmq/t;", "poseConfigs", BuildConfig.FLAVOR, "autoCaptureSupported", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/lang/String;Lsn/v;JLmq/y0;Ljava/util/List;Lmq/t;ZLsn/v$b;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(Ljava/lang/String;Lsn/v;JLmq/y0;Ljava/util/List;Lmq/t;ZLsn/v$b;Z)Lmq/y0$q;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "B", "c", "Lsn/v;", "f", "()Lsn/v;", "d", "J", "t", "()J", "e", "Lmq/y0;", "u", "()Lmq/y0;", "Ljava/util/List;", "i", "()Ljava/util/List;", "g", "Lmq/t;", "j", "()Lmq/t;", "h", "Z", "()Z", "Lsn/v$b;", "v", "()Lsn/v$b;", "s", "Lmq/b0;", "k", "w", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitForWebRtcSetup extends y0 implements mq.a {

        @NotNull
        public static final Parcelable.Creator<WaitForWebRtcSetup> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String webRtcJwt;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

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
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: mq.y0$q$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForWebRtcSetup> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForWebRtcSetup createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                sn.v vVar = (sn.v) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                long j10 = parcel.readLong();
                y0 y0Var = (y0) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
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
                return new WaitForWebRtcSetup(string, vVar, j10, y0Var, arrayList, poseConfigsCreateFromParcel, z10, sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForWebRtcSetup[] newArray(int i10) {
                return new WaitForWebRtcSetup[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForWebRtcSetup(@Nullable String str, @NotNull sn.v cameraProperties, long j10, @Nullable y0 y0Var, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean z10, @NotNull sn.v.b cameraFacingMode, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.webRtcJwt = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = y0Var;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z10;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.selfies = p001kotlin.collections.p.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForWebRtcSetup z(WaitForWebRtcSetup waitForWebRtcSetup, String str, sn.v vVar, long j10, y0 y0Var, List list, PoseConfigs poseConfigs, boolean z10, sn.v.b bVar, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = waitForWebRtcSetup.webRtcJwt;
            }
            if ((i10 & 2) != 0) {
                vVar = waitForWebRtcSetup.cameraProperties;
            }
            if ((i10 & 4) != 0) {
                j10 = waitForWebRtcSetup.startSelfieTimestamp;
            }
            if ((i10 & 8) != 0) {
                y0Var = waitForWebRtcSetup.backState;
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
            if ((i10 & Barcode.FORMAT_ITF) != 0) {
                bVar = waitForWebRtcSetup.cameraFacingMode;
            }
            if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                z11 = waitForWebRtcSetup.isFlashEnabled;
            }
            sn.v.b bVar2 = bVar;
            boolean z12 = z11;
            long j11 = j10;
            return waitForWebRtcSetup.y(str, vVar, j11, y0Var, list, poseConfigs, z10, bVar2, z12);
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            String str = this.webRtcJwt;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            y0 y0Var = this.backState;
            return ((((((((((iHashCode + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "WaitForWebRtcSetup(webRtcJwt=" + this.webRtcJwt + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
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
        public final WaitForWebRtcSetup y(@Nullable String webRtcJwt, @NotNull sn.v cameraProperties, long startSelfieTimestamp, @Nullable y0 backState, @NotNull List<PoseInfo> posesNeeded, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new WaitForWebRtcSetup(webRtcJwt, cameraProperties, startSelfieTimestamp, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lmq/y0$r;", "Lmq/y0;", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", BuildConfig.FLAVOR, "webRtcObjectId", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", "Lsn/v$b;", "cameraFacingMode", "<init>", "(Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;Lsn/v$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "c", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "d", "Lsn/v;", "f", "()Lsn/v;", "e", "J", "t", "()J", "Lmq/y0;", "u", "()Lmq/y0;", "g", "Lsn/v$b;", "v", "()Lsn/v$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class r extends y0 {

        @NotNull
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String webRtcObjectId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v.b cameraFacingMode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(r.class.getClassLoader()));
                }
                return new r(arrayList, parcel.readString(), (sn.v) parcel.readParcelable(r.class.getClassLoader()), parcel.readLong(), (y0) parcel.readParcelable(r.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i10) {
                return new r[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(@NotNull List<? extends b0> selfies, @NotNull String webRtcObjectId, @NotNull sn.v cameraProperties, long j10, @Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(webRtcObjectId, "webRtcObjectId");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = webRtcObjectId;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j10;
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
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
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }
    }

    public /* synthetic */ y0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public abstract y0 getBackState();

    @NotNull
    /* JADX INFO: renamed from: v */
    public abstract sn.v.b getCameraFacingMode();

    @NotNull
    public abstract List<b0> w();

    public final void x(boolean z10) {
        this.didGoBack = z10;
    }

    /* JADX INFO: renamed from: mq.y0$d, reason: from toString */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b&\u0010'J¸\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b-\u0010!J\u001a\u00100\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\bA\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u0010DR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010KR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bL\u0010J\u001a\u0004\bM\u0010KR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bL\u0010TR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bB\u0010WR\u001a\u0010\u001b\u001a\u00020\u001a8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010V\u001a\u0004\b]\u0010WR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b^\u0010V\u001a\u0004\b_\u0010W¨\u0006`"}, d2 = {"Lmq/y0$d;", "Lmq/y0;", "Lmq/a;", BuildConfig.FLAVOR, "countDown", "Lxn/c;", "selfieError", BuildConfig.FLAVOR, "startCaptureTimestamp", "Lsn/v;", "cameraProperties", "startSelfieTimestamp", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", BuildConfig.FLAVOR, "Lrq/a;", "posesNeeded", "Lmq/b0;", "selfies", "backState", "Lmq/t;", "poseConfigs", BuildConfig.FLAVOR, "autoCaptureSupported", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(ILxn/c;JLsn/v;JFLxn/b;Ljava/util/List;Ljava/util/List;Lmq/y0;Lmq/t;ZLsn/v$b;ZZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(ILxn/c;JLsn/v;JFLxn/b;Ljava/util/List;Ljava/util/List;Lmq/y0;Lmq/t;ZLsn/v$b;ZZ)Lmq/y0$d;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "C", "c", "Lxn/c;", "F", "()Lxn/c;", "d", "J", "a", "()J", "e", "Lsn/v;", "f", "()Lsn/v;", "t", "g", "D", "()F", "h", "Lxn/b;", "B", "()Lxn/b;", "i", "Ljava/util/List;", "()Ljava/util/List;", "j", "w", "k", "Lmq/y0;", "u", "()Lmq/y0;", "l", "Lmq/t;", "()Lmq/t;", "m", "Z", "()Z", "n", "Lsn/v$b;", "v", "()Lsn/v$b;", "o", "s", "p", "G", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountdownToCapture extends y0 implements mq.a {

        @NotNull
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int countDown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xn.c selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xn.b brightnessInfo;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        /* JADX INFO: renamed from: mq.y0$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                xn.c cVarValueOf = parcel.readInt() == 0 ? null : xn.c.valueOf(parcel.readString());
                long j10 = parcel.readLong();
                sn.v vVar = (sn.v) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                long j11 = parcel.readLong();
                float f10 = parcel.readFloat();
                xn.b bVar = (xn.b) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
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
                return new CountdownToCapture(i10, cVarValueOf, j10, vVar, j11, f10, bVar, arrayList, arrayList2, (y0) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture[] newArray(int i10) {
                return new CountdownToCapture[i10];
            }
        }

        public /* synthetic */ CountdownToCapture(int i10, xn.c cVar, long j10, sn.v vVar, long j11, float f10, xn.b bVar, List list, List list2, y0 y0Var, PoseConfigs poseConfigs, boolean z10, sn.v.b bVar2, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : cVar, j10, vVar, j11, f10, bVar, list, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? p001kotlin.collections.p.k() : list2, y0Var, poseConfigs, z10, bVar2, z11, z12);
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final xn.b getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final int getCountDown() {
            return this.countDown;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Nullable
        /* JADX INFO: renamed from: F, reason: from getter */
        public final xn.c getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            xn.c cVar = this.selfieError;
            int iHashCode2 = (((((((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            xn.b bVar = this.brightnessInfo;
            int iHashCode3 = (((((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.selfies.hashCode()) * 31;
            y0 y0Var = this.backState;
            return ((((((((((iHashCode3 + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @NotNull
        public PoseConfig l() {
            return super.l();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "CountdownToCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", selfies=" + this.selfies + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.countDown);
            xn.c cVar = this.selfieError;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
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
            List<b0> list2 = this.selfies;
            dest.writeInt(list2.size());
            Iterator<b0> it2 = list2.iterator();
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
        public final CountdownToCapture y(int countDown, @Nullable xn.c selfieError, long startCaptureTimestamp, @NotNull sn.v cameraProperties, long startSelfieTimestamp, float poseScore, @Nullable xn.b brightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends b0> selfies, @Nullable y0 backState, @NotNull PoseConfigs poseConfigs, boolean autoCaptureSupported, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new CountdownToCapture(countDown, selfieError, startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, selfies, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(int i10, @Nullable xn.c cVar, long j10, @NotNull sn.v cameraProperties, long j11, float f10, @Nullable xn.b bVar, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends b0> selfies, @Nullable y0 y0Var, @NotNull PoseConfigs poseConfigs, boolean z10, @NotNull sn.v.b cameraFacingMode, boolean z11, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.countDown = i10;
            this.selfieError = cVar;
            this.startCaptureTimestamp = j10;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j11;
            this.poseScore = f10;
            this.brightnessInfo = bVar;
            this.posesNeeded = posesNeeded;
            this.selfies = selfies;
            this.backState = y0Var;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z10;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.isDimLightConditions = z12;
        }
    }

    /* JADX INFO: renamed from: mq.y0$k, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R&\u0010/\u001a\b\u0012\u0004\u0012\u00020(0'8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lmq/y0$k;", "Lmq/y0;", "backState", "Lsn/v$b;", "cameraFacingMode", BuildConfig.FLAVOR, "errorMessage", "<init>", "(Lmq/y0;Lsn/v$b;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(Lmq/y0;Lsn/v$b;Ljava/lang/String;)Lmq/y0$k;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Lmq/y0;", "u", "()Lmq/y0;", "c", "Lsn/v$b;", "v", "()Lsn/v$b;", "d", "Ljava/lang/String;", "B", BuildConfig.FLAVOR, "Lmq/b0;", "e", "Ljava/util/List;", "w", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowInstructions extends y0 {

        @NotNull
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String errorMessage;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: mq.y0$k$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructions> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowInstructions((y0) parcel.readParcelable(ShowInstructions.class.getClassLoader()), sn.v.b.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions[] newArray(int i10) {
                return new ShowInstructions[i10];
            }
        }

        public /* synthetic */ ShowInstructions(y0 y0Var, sn.v.b bVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(y0Var, (i10 & 2) != 0 ? sn.v.b.User : bVar, (i10 & 4) != 0 ? null : str);
        }

        public static /* synthetic */ ShowInstructions z(ShowInstructions showInstructions, y0 y0Var, sn.v.b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                y0Var = showInstructions.backState;
            }
            if ((i10 & 2) != 0) {
                bVar = showInstructions.cameraFacingMode;
            }
            if ((i10 & 4) != 0) {
                str = showInstructions.errorMessage;
            }
            return showInstructions.y(y0Var, bVar, str);
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
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
            y0 y0Var = this.backState;
            int iHashCode = (((y0Var == null ? 0 : y0Var.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31;
            String str = this.errorMessage;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ShowInstructions(backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ", errorMessage=" + this.errorMessage + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
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
        public final ShowInstructions y(@Nullable y0 backState, @NotNull sn.v.b cameraFacingMode, @Nullable String errorMessage) {
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new ShowInstructions(backState, cameraFacingMode, errorMessage);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowInstructions(@Nullable y0 y0Var, @NotNull sn.v.b cameraFacingMode, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.backState = y0Var;
            this.cameraFacingMode = cameraFacingMode;
            this.errorMessage = str;
            this.selfies = p001kotlin.collections.p.k();
        }
    }

    public y0() {
    }

    /* JADX INFO: renamed from: mq.y0$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¥\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b(\u0010)JÄ\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020!HÖ\u0001¢\u0006\u0004\b/\u0010#J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b9\u0010:R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bE\u0010KR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\bL\u0010HR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bC\u0010OR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bM\u0010VR\u001a\u0010\u0019\u001a\u00020\u00188\u0010X\u0090\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u001a\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010J\u001a\u0004\b\\\u0010KR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u001e\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\be\u0010J\u001a\u0004\bf\u0010K¨\u0006g"}, d2 = {"Lmq/y0$b;", "Lmq/y0;", "Lmq/b;", "Lxn/c;", "selfieError", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "Lrq/a;", "posesNeeded", BuildConfig.FLAVOR, "startCaptureTimestamp", BuildConfig.FLAVOR, "autoCaptureSupported", "startSelfieTimestamp", "Lsn/v;", "cameraProperties", "backState", "Lmq/t;", "poseConfigs", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "Lmq/y0$h;", "flashState", "captureDeadlineEpochMs", "isDimLightConditions", "<init>", "(Lxn/c;FLxn/b;Ljava/util/List;Ljava/util/List;JZJLsn/v;Lmq/y0;Lmq/t;Lsn/v$b;ZLmq/y0$h;Ljava/lang/Long;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(Lxn/c;FLxn/b;Ljava/util/List;Ljava/util/List;JZJLsn/v;Lmq/y0;Lmq/t;Lsn/v$b;ZLmq/y0$h;Ljava/lang/Long;Z)Lmq/y0$b;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lxn/c;", "G", "()Lxn/c;", "c", "F", "()F", "d", "Lxn/b;", "B", "()Lxn/b;", "e", "Ljava/util/List;", "w", "()Ljava/util/List;", "f", "i", "g", "J", "a", "()J", "h", "Z", "()Z", "t", "j", "Lsn/v;", "()Lsn/v;", "k", "Lmq/y0;", "u", "()Lmq/y0;", "l", "Lmq/t;", "()Lmq/t;", "m", "Lsn/v$b;", "v", "()Lsn/v$b;", "n", "s", "o", "Lmq/y0$h;", "D", "()Lmq/y0$h;", "p", "Ljava/lang/Long;", "C", "()Ljava/lang/Long;", "q", "H", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Capture extends y0 implements b {

        @NotNull
        public static final Parcelable.Creator<Capture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final xn.c selfieError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xn.b brightnessInfo;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

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
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final h flashState;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Long captureDeadlineEpochMs;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        /* JADX INFO: renamed from: mq.y0$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Capture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Capture createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                boolean z12;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xn.c cVarValueOf = parcel.readInt() == 0 ? null : xn.c.valueOf(parcel.readString());
                float f10 = parcel.readFloat();
                xn.b bVar = (xn.b) parcel.readParcelable(Capture.class.getClassLoader());
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
                return new Capture(cVarValueOf, f10, bVar, arrayList, arrayList2, j10, z12, parcel.readLong(), (sn.v) parcel.readParcelable(Capture.class.getClassLoader()), (y0) parcel.readParcelable(Capture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? z11 : z10, h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? z11 : z10);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Capture[] newArray(int i10) {
                return new Capture[i10];
            }
        }

        public /* synthetic */ Capture(xn.c cVar, float f10, xn.b bVar, List list, List list2, long j10, boolean z10, long j11, sn.v vVar, y0 y0Var, PoseConfigs poseConfigs, sn.v.b bVar2, boolean z11, h hVar, Long l10, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cVar, f10, bVar, (i10 & 8) != 0 ? p001kotlin.collections.p.k() : list, list2, j10, (i10 & 64) != 0 ? true : z10, j11, vVar, y0Var, poseConfigs, bVar2, z11, (i10 & 8192) != 0 ? h.Disabled : hVar, (i10 & 16384) != 0 ? null : l10, z12);
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final xn.b getBrightnessInfo() {
            return this.brightnessInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final Long getCaptureDeadlineEpochMs() {
            return this.captureDeadlineEpochMs;
        }

        @NotNull
        /* JADX INFO: renamed from: D, reason: from getter */
        public final h getFlashState() {
            return this.flashState;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Nullable
        /* JADX INFO: renamed from: G, reason: from getter */
        public final xn.c getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // mq.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            xn.c cVar = this.selfieError;
            int iHashCode = (((cVar == null ? 0 : cVar.hashCode()) * 31) + Float.hashCode(this.poseScore)) * 31;
            xn.b bVar = this.brightnessInfo;
            int iHashCode2 = (((((((((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.selfies.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            y0 y0Var = this.backState;
            int iHashCode3 = (((((((((iHashCode2 + (y0Var == null ? 0 : y0Var.hashCode())) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + this.flashState.hashCode()) * 31;
            Long l10 = this.captureDeadlineEpochMs;
            return ((iHashCode3 + (l10 != null ? l10.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @NotNull
        public PoseConfig l() {
            return super.l();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.b
        public boolean o() {
            return super.o();
        }

        @Override // mq.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "Capture(selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", flashState=" + this.flashState + ", captureDeadlineEpochMs=" + this.captureDeadlineEpochMs + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            xn.c cVar = this.selfieError;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<b0> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<b0> it = list.iterator();
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
        public final Capture y(@Nullable xn.c selfieError, float poseScore, @Nullable xn.b brightnessInfo, @NotNull List<? extends b0> selfies, @NotNull List<PoseInfo> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @NotNull sn.v cameraProperties, @Nullable y0 backState, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled, @NotNull h flashState, @Nullable Long captureDeadlineEpochMs, boolean isDimLightConditions) {
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
        public Capture(@Nullable xn.c cVar, float f10, @Nullable xn.b bVar, @NotNull List<? extends b0> selfies, @NotNull List<PoseInfo> posesNeeded, long j10, boolean z10, long j11, @NotNull sn.v cameraProperties, @Nullable y0 y0Var, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean z11, @NotNull h flashState, @Nullable Long l10, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(flashState, "flashState");
            this.selfieError = cVar;
            this.poseScore = f10;
            this.brightnessInfo = bVar;
            this.selfies = selfies;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j10;
            this.autoCaptureSupported = z10;
            this.startSelfieTimestamp = j11;
            this.cameraProperties = cameraProperties;
            this.backState = y0Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z11;
            this.flashState = flashState;
            this.captureDeadlineEpochMs = l10;
            this.isDimLightConditions = z12;
        }
    }

    /* JADX INFO: renamed from: mq.y0$m, reason: from toString */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0099\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J¸\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b-\u0010!J\u001a\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u00103\u001a\u0004\bF\u00105R\u001a\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bB\u0010PR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bL\u0010WR\u001a\u0010\u001a\u001a\u00020\u00198\u0010X\u0090\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u00103\u001a\u0004\b]\u00105R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b^\u00103\u001a\u0004\b;\u00105¨\u0006_"}, d2 = {"Lmq/y0$m;", "Lmq/y0;", "Lmq/b;", BuildConfig.FLAVOR, "centered", "Lxn/c;", "selfieError", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", BuildConfig.FLAVOR, "Lrq/a;", "posesNeeded", "Lmq/b0;", "selfies", BuildConfig.FLAVOR, "startCaptureTimestamp", "autoCaptureSupported", "startSelfieTimestamp", "Lsn/v;", "cameraProperties", "backState", "Lmq/t;", "poseConfigs", "Lsn/v$b;", "cameraFacingMode", "isFlashEnabled", "isDimLightConditions", "<init>", "(ZLxn/c;FLxn/b;Ljava/util/List;Ljava/util/List;JZJLsn/v;Lmq/y0;Lmq/t;Lsn/v$b;ZZ)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "y", "(ZLxn/c;FLxn/b;Ljava/util/List;Ljava/util/List;JZJLsn/v;Lmq/y0;Lmq/t;Lsn/v$b;ZZ)Lmq/y0$m;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getCentered", "()Z", "c", "Lxn/c;", "D", "()Lxn/c;", "d", "F", "C", "()F", "e", "Lxn/b;", "B", "()Lxn/b;", "f", "Ljava/util/List;", "i", "()Ljava/util/List;", "g", "w", "h", "J", "a", "()J", "j", "t", "k", "Lsn/v;", "()Lsn/v;", "l", "Lmq/y0;", "u", "()Lmq/y0;", "m", "Lmq/t;", "()Lmq/t;", "n", "Lsn/v$b;", "v", "()Lsn/v$b;", "o", "s", "p", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartCapture extends y0 implements b {

        @NotNull
        public static final Parcelable.Creator<StartCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean centered;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xn.c selfieError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final float poseScore;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xn.b brightnessInfo;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> posesNeeded;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<b0> selfies;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startCaptureTimestamp;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean autoCaptureSupported;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final long startSelfieTimestamp;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y0 backState;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v.b cameraFacingMode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isFlashEnabled;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDimLightConditions;

        /* JADX INFO: renamed from: mq.y0$m$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StartCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z10 = parcel.readInt() != 0;
                xn.c cVarValueOf = parcel.readInt() == 0 ? null : xn.c.valueOf(parcel.readString());
                float f10 = parcel.readFloat();
                xn.b bVar = (xn.b) parcel.readParcelable(StartCapture.class.getClassLoader());
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
                return new StartCapture(z10, cVarValueOf, f10, bVar, arrayList, arrayList2, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (sn.v) parcel.readParcelable(StartCapture.class.getClassLoader()), (y0) parcel.readParcelable(StartCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), sn.v.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StartCapture[] newArray(int i10) {
                return new StartCapture[i10];
            }
        }

        public /* synthetic */ StartCapture(boolean z10, xn.c cVar, float f10, xn.b bVar, List list, List list2, long j10, boolean z11, long j11, sn.v vVar, y0 y0Var, PoseConfigs poseConfigs, sn.v.b bVar2, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? xn.c.FaceNotCentered : cVar, f10, bVar, list, (i10 & 32) != 0 ? p001kotlin.collections.p.k() : list2, j10, (i10 & Barcode.FORMAT_ITF) != 0 ? true : z11, j11, vVar, y0Var, poseConfigs, bVar2, z12, z13);
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final xn.b getBrightnessInfo() {
            return this.brightnessInfo;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final float getPoseScore() {
            return this.poseScore;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final xn.c getSelfieError() {
            return this.selfieError;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final boolean getIsDimLightConditions() {
            return this.isDimLightConditions;
        }

        @Override // mq.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
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

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.centered) * 31;
            xn.c cVar = this.selfieError;
            int iHashCode2 = (((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Float.hashCode(this.poseScore)) * 31;
            xn.b bVar = this.brightnessInfo;
            int iHashCode3 = (((((((((((((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.selfies.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            y0 y0Var = this.backState;
            return ((((((((iHashCode3 + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + Boolean.hashCode(this.isDimLightConditions);
        }

        @Override // mq.a
        @NotNull
        public List<PoseInfo> i() {
            return this.posesNeeded;
        }

        @Override // mq.a
        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // mq.a
        @NotNull
        public xn.a k() {
            return super.k();
        }

        @Override // mq.a
        @NotNull
        public PoseConfig l() {
            return super.l();
        }

        @Override // mq.a
        @Nullable
        public xn.a n() {
            return super.n();
        }

        @Override // mq.b
        public boolean o() {
            return super.o();
        }

        @Override // mq.a
        @NotNull
        public PoseInfo p() {
            return super.p();
        }

        @Override // mq.a
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        @Override // mq.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @NotNull
        public String toString() {
            return "StartCapture(centered=" + this.centered + ", selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", selfies=" + this.selfies + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", isDimLightConditions=" + this.isDimLightConditions + ")";
        }

        @Override // mq.y0
        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public y0 getBackState() {
            return this.backState;
        }

        @Override // mq.y0
        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public sn.v.b getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // mq.y0
        @NotNull
        public List<b0> w() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.centered ? 1 : 0);
            xn.c cVar = this.selfieError;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<PoseInfo> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<b0> list2 = this.selfies;
            dest.writeInt(list2.size());
            Iterator<b0> it2 = list2.iterator();
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
        public final StartCapture y(boolean centered, @Nullable xn.c selfieError, float poseScore, @Nullable xn.b brightnessInfo, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends b0> selfies, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @NotNull sn.v cameraProperties, @Nullable y0 backState, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean isFlashEnabled, boolean isDimLightConditions) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new StartCapture(centered, selfieError, poseScore, brightnessInfo, posesNeeded, selfies, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs, cameraFacingMode, isFlashEnabled, isDimLightConditions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCapture(boolean z10, @Nullable xn.c cVar, float f10, @Nullable xn.b bVar, @NotNull List<PoseInfo> posesNeeded, @NotNull List<? extends b0> selfies, long j10, boolean z11, long j11, @NotNull sn.v cameraProperties, @Nullable y0 y0Var, @NotNull PoseConfigs poseConfigs, @NotNull sn.v.b cameraFacingMode, boolean z12, boolean z13) {
            super(null);
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.centered = z10;
            this.selfieError = cVar;
            this.poseScore = f10;
            this.brightnessInfo = bVar;
            this.posesNeeded = posesNeeded;
            this.selfies = selfies;
            this.startCaptureTimestamp = j10;
            this.autoCaptureSupported = z11;
            this.startSelfieTimestamp = j11;
            this.cameraProperties = cameraProperties;
            this.backState = y0Var;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z12;
            this.isDimLightConditions = z13;
        }
    }
}
