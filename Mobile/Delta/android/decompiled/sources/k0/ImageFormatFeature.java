package k0;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k0.d, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lk0/d;", "Li0/b;", "", "imageCaptureOutputFormat", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "g", "I", "f", "()I", "Lk0/b;", "h", "Lk0/b;", "c", "()Lk0/b;", "featureTypeInternal", "i", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageFormatFeature extends i0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int imageCaptureOutputFormat;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b featureTypeInternal = b.IMAGE_FORMAT;

    public ImageFormatFeature(int i10) {
        this.imageCaptureOutputFormat = i10;
    }

    @Override // i0.b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getImageCaptureOutputFormat() {
        return this.imageCaptureOutputFormat;
    }

    public final String g() {
        int i10 = this.imageCaptureOutputFormat;
        if (i10 == 0) {
            return "JPEG";
        }
        if (i10 == 1) {
            return "JPEG_R";
        }
        return "UNDEFINED(" + this.imageCaptureOutputFormat + ')';
    }

    @NotNull
    public String toString() {
        return "ImageFormatFeature(imageCaptureOutputFormat=" + g() + ')';
    }
}
