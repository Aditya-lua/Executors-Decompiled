package p132fn;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fn.c, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0019"}, m31665d2 = {"Lfn/c;", "", "", "sampleRateInHz", "channelConfig", "audioFormat", "minBufferSizeInBytes", "bytesPerFrame", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class AudioConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int sampleRateInHz;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int channelConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final int audioFormat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int minBufferSizeInBytes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final int bytesPerFrame;

    public AudioConfiguration(int i10, int i11, int i12, int i13, int i14) {
        this.sampleRateInHz = i10;
        this.channelConfig = i11;
        this.audioFormat = i12;
        this.minBufferSizeInBytes = i13;
        this.bytesPerFrame = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAudioFormat() {
        return this.audioFormat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getChannelConfig() {
        return this.channelConfig;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinBufferSizeInBytes() {
        return this.minBufferSizeInBytes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSampleRateInHz() {
        return this.sampleRateInHz;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioConfiguration)) {
            return false;
        }
        AudioConfiguration audioConfiguration = (AudioConfiguration) other;
        return this.sampleRateInHz == audioConfiguration.sampleRateInHz && this.channelConfig == audioConfiguration.channelConfig && this.audioFormat == audioConfiguration.audioFormat && this.minBufferSizeInBytes == audioConfiguration.minBufferSizeInBytes && this.bytesPerFrame == audioConfiguration.bytesPerFrame;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.sampleRateInHz) * 31) + Integer.hashCode(this.channelConfig)) * 31) + Integer.hashCode(this.audioFormat)) * 31) + Integer.hashCode(this.minBufferSizeInBytes)) * 31) + Integer.hashCode(this.bytesPerFrame);
    }

    @NotNull
    public String toString() {
        return "AudioConfiguration(sampleRateInHz=" + this.sampleRateInHz + ", channelConfig=" + this.channelConfig + ", audioFormat=" + this.audioFormat + ", minBufferSizeInBytes=" + this.minBufferSizeInBytes + ", bytesPerFrame=" + this.bytesPerFrame + ")";
    }
}
