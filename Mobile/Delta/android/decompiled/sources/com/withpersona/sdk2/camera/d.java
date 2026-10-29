package com.withpersona.sdk2.camera;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/camera/d;", "", "c", "d", "e", "a", "b", "Lcom/withpersona/sdk2/camera/d$a;", "Lcom/withpersona/sdk2/camera/d$b;", "Lcom/withpersona/sdk2/camera/d$c;", "Lcom/withpersona/sdk2/camera/d$d;", "Lcom/withpersona/sdk2/camera/d$e;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/camera/d$a;", "Lcom/withpersona/sdk2/camera/d;", "", "wasRecordingInterrupted", "isClosedDueToBadCameraConfiguration", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Closed implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean wasRecordingInterrupted;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isClosedDueToBadCameraConfiguration;

        public Closed(boolean z10, boolean z11) {
            this.wasRecordingInterrupted = z10;
            this.isClosedDueToBadCameraConfiguration = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getWasRecordingInterrupted() {
            return this.wasRecordingInterrupted;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsClosedDueToBadCameraConfiguration() {
            return this.isClosedDueToBadCameraConfiguration;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Closed)) {
                return false;
            }
            Closed closed = (Closed) other;
            return this.wasRecordingInterrupted == closed.wasRecordingInterrupted && this.isClosedDueToBadCameraConfiguration == closed.isClosedDueToBadCameraConfiguration;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.wasRecordingInterrupted) * 31) + Boolean.hashCode(this.isClosedDueToBadCameraConfiguration);
        }

        @NotNull
        public String toString() {
            return "Closed(wasRecordingInterrupted=" + this.wasRecordingInterrupted + ", isClosedDueToBadCameraConfiguration=" + this.isClosedDueToBadCameraConfiguration + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d$b;", "Lcom/withpersona/sdk2/camera/d;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f9940a = new b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d$c;", "Lcom/withpersona/sdk2/camera/d;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f9941a = new c();
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d$d;", "Lcom/withpersona/sdk2/camera/d;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0162d implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0162d f9942a = new C0162d();
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.d$e, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/camera/d$e;", "Lcom/withpersona/sdk2/camera/d;", "", "firstFrameReceived", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ready implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean firstFrameReceived;

        public Ready(boolean z10) {
            this.firstFrameReceived = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFirstFrameReceived() {
            return this.firstFrameReceived;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && this.firstFrameReceived == ((Ready) other).firstFrameReceived;
        }

        public int hashCode() {
            return Boolean.hashCode(this.firstFrameReceived);
        }

        @NotNull
        public String toString() {
            return "Ready(firstFrameReceived=" + this.firstFrameReceived + ")";
        }
    }
}
