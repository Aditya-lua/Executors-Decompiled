package com.withpersona.sdk2.inquiry.selfie.video_capture;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J1\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Landroid/os/Parcelable;", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lmn/a;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "hasExhaustedWebRtcConnectionAttempts", "canUseLocalVideoAsFallback", "Landroid/content/Context;", "applicationContext", "Ljt/n;", "i", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/content/Context;)Ljava/lang/Object;", "k", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "j", "a", "J", "()J", "b", "Ljava/util/List;", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "c", "getVideoCaptureMethods", "d", "Ljava/lang/String;", "g", "e", "Z", "f", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoCaptureConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VideoCaptureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final long maxRecordingLengthMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<mn.a> videoCaptureMethods;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String webRtcJwt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean recordAudio;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VideoCaptureConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoCaptureConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j10 = parcel.readLong();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(mn.a.valueOf(parcel.readString()));
            }
            return new VideoCaptureConfig(j10, arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoCaptureConfig[] newArray(int i10) {
            return new VideoCaptureConfig[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCaptureConfig(long j10, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends mn.a> videoCaptureMethods, @g(name = "webRTCJwt") @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
        this.maxRecordingLengthMs = j10;
        this.enabledCaptureFileTypes = enabledCaptureFileTypes;
        this.videoCaptureMethods = videoCaptureMethods;
        this.webRtcJwt = str;
        this.recordAudio = z10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getMaxRecordingLengthMs() {
        return this.maxRecordingLengthMs;
    }

    @NotNull
    public final VideoCaptureConfig copy(long maxRecordingLengthMs, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends mn.a> videoCaptureMethods, @g(name = "webRTCJwt") @Nullable String webRtcJwt, boolean recordAudio) {
        Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
        return new VideoCaptureConfig(maxRecordingLengthMs, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, recordAudio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) other;
        return this.maxRecordingLengthMs == videoCaptureConfig.maxRecordingLengthMs && Intrinsics.c(this.enabledCaptureFileTypes, videoCaptureConfig.enabledCaptureFileTypes) && Intrinsics.c(this.videoCaptureMethods, videoCaptureConfig.videoCaptureMethods) && Intrinsics.c(this.webRtcJwt, videoCaptureConfig.webRtcJwt) && this.recordAudio == videoCaptureConfig.recordAudio;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRecordAudio() {
        return this.recordAudio;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getWebRtcJwt() {
        return this.webRtcJwt;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.maxRecordingLengthMs) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
        String str = this.webRtcJwt;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.recordAudio);
    }

    @NotNull
    public final Object i(@Nullable Boolean hasExhaustedWebRtcConnectionAttempts, @Nullable Boolean canUseLocalVideoAsFallback, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (!this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video)) {
            n.Companion companion = n.INSTANCE;
            return n.b(Boolean.FALSE);
        }
        Object objK = k(hasExhaustedWebRtcConnectionAttempts, canUseLocalVideoAsFallback, applicationContext);
        Throwable thE = n.e(objK);
        if (thE != null) {
            return n.b(o.a(thE));
        }
        mn.a aVar = (mn.a) objK;
        return n.b(Boolean.valueOf(aVar == mn.a.Stream || aVar == mn.a.Upload));
    }

    public final Object j(Boolean hasExhaustedWebRtcConnectionAttempts, Boolean canUseLocalVideoAsFallback, Context applicationContext) {
        boolean z10 = this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video) && CollectionsKt.firstOrNull(this.videoCaptureMethods) == mn.a.Stream;
        boolean z11 = (hasExhaustedWebRtcConnectionAttempts == null || canUseLocalVideoAsFallback == null) ? false : true;
        if (!z10 || z11) {
            if (canUseLocalVideoAsFallback != null ? canUseLocalVideoAsFallback.booleanValue() : true) {
                List<mn.a> list = this.videoCaptureMethods;
                mn.a aVar = mn.a.Upload;
                if (list.contains(aVar)) {
                    return n.b(aVar);
                }
            }
            if (hasExhaustedWebRtcConnectionAttempts != null ? hasExhaustedWebRtcConnectionAttempts.booleanValue() : false) {
                n.Companion companion = n.INSTANCE;
                return n.b(mn.a.None);
            }
            n.Companion companion2 = n.INSTANCE;
            mn.a aVar2 = (mn.a) CollectionsKt.firstOrNull(this.videoCaptureMethods);
            if (aVar2 == null) {
                aVar2 = mn.a.None;
            }
            return n.b(aVar2);
        }
        List<mn.a> list2 = this.videoCaptureMethods;
        mn.a aVar3 = mn.a.Upload;
        if (list2.contains(aVar3)) {
            if (!jq.g.e(applicationContext)) {
                return n.b(aVar3);
            }
            n.Companion companion3 = n.INSTANCE;
            return n.b(o.a(new RuntimeException()));
        }
        List<NextStep.Selfie.CaptureFileType> list3 = this.enabledCaptureFileTypes;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (NextStep.Selfie.CaptureFileType captureFileType : list3) {
                if (captureFileType != NextStep.Selfie.CaptureFileType.Video && captureFileType != NextStep.Selfie.CaptureFileType.Unknown) {
                    if (jq.g.e(applicationContext)) {
                        n.Companion companion4 = n.INSTANCE;
                        return n.b(o.a(new RuntimeException()));
                    }
                    n.Companion companion5 = n.INSTANCE;
                    return n.b(mn.a.None);
                }
            }
        }
        n.Companion companion6 = n.INSTANCE;
        return n.b(o.a(new RuntimeException()));
    }

    @NotNull
    public final Object k(@Nullable Boolean hasExhaustedWebRtcConnectionAttempts, @Nullable Boolean canUseLocalVideoAsFallback, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video)) {
            return j(hasExhaustedWebRtcConnectionAttempts, canUseLocalVideoAsFallback, applicationContext);
        }
        n.Companion companion = n.INSTANCE;
        return n.b(mn.a.None);
    }

    @NotNull
    public String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.maxRecordingLengthMs + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", recordAudio=" + this.recordAudio + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.maxRecordingLengthMs);
        List<NextStep.Selfie.CaptureFileType> list = this.enabledCaptureFileTypes;
        dest.writeInt(list.size());
        Iterator<NextStep.Selfie.CaptureFileType> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        List<mn.a> list2 = this.videoCaptureMethods;
        dest.writeInt(list2.size());
        Iterator<mn.a> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeString(it2.next().name());
        }
        dest.writeString(this.webRtcJwt);
        dest.writeInt(this.recordAudio ? 1 : 0);
    }

    public /* synthetic */ VideoCaptureConfig(long j10, List list, List list2, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : j10, list, list2, str, z10);
    }
}
