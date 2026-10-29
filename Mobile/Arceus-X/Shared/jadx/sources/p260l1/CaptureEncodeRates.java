package p260l1;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l1.j, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m31665d2 = {"Ll1/j;", "", "", "captureRate", "encodeRate", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "camera-video_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class CaptureEncodeRates {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int captureRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int encodeRate;

    public CaptureEncodeRates(int i10, int i11) {
        this.captureRate = i10;
        this.encodeRate = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCaptureRate() {
        return this.captureRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEncodeRate() {
        return this.encodeRate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureEncodeRates)) {
            return false;
        }
        CaptureEncodeRates captureEncodeRates = (CaptureEncodeRates) other;
        return this.captureRate == captureEncodeRates.captureRate && this.encodeRate == captureEncodeRates.encodeRate;
    }

    public int hashCode() {
        return (Integer.hashCode(this.captureRate) * 31) + Integer.hashCode(this.encodeRate);
    }

    @NotNull
    public String toString() {
        return "CaptureEncodeRates(captureRate=" + this.captureRate + ", encodeRate=" + this.encodeRate + ')';
    }
}
