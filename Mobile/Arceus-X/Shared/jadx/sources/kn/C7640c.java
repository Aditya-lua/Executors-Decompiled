package kn;

import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p132fn.AbstractC5702p0;

/* JADX INFO: renamed from: kn.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b'\u0010,R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b#\u0010,R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b)\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b\u0018\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b\u001c\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b-\u00103¨\u00064"}, m31665d2 = {"Lkn/c;", "", "Lfn/p0;", "selfiePhoto", "Lkn/b;", "error", "", "facesInFrame", "", "isFaceTooClose", "isFaceTooFar", "isFaceCentered", "", "faceAngleY", "faceAngleX", "faceAngleZ", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "Lkn/a;", "detectedPose", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "lightCondition", "<init>", "(Lfn/p0;Lkn/b;IZZZFFFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lkn/a;Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "a", "Lfn/p0;", "i", "()Lfn/p0;", "b", "Lkn/b;", "c", "()Lkn/b;", "I", "g", "()I", "d", "Z", "k", "()Z", "e", "l", "f", "j", "F", "()F", "h", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "Lkn/a;", "()Lkn/a;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7640c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final AbstractC5702p0 selfiePhoto;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final EnumC7639b error;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int facesInFrame;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isFaceTooClose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isFaceTooFar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean isFaceCentered;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float faceAngleY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float faceAngleX;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float faceAngleZ;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final SelfieBrightnessInfo brightnessInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final EnumC7638a detectedPose;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final ImageLightCondition lightCondition;

    public C7640c(@Nullable AbstractC5702p0 abstractC5702p0, @Nullable EnumC7639b enumC7639b, int i10, boolean z10, boolean z11, boolean z12, float f10, float f11, float f12, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @Nullable EnumC7638a enumC7638a, @Nullable ImageLightCondition imageLightCondition) {
        this.selfiePhoto = abstractC5702p0;
        this.error = enumC7639b;
        this.facesInFrame = i10;
        this.isFaceTooClose = z10;
        this.isFaceTooFar = z11;
        this.isFaceCentered = z12;
        this.faceAngleY = f10;
        this.faceAngleX = f11;
        this.faceAngleZ = f12;
        this.brightnessInfo = selfieBrightnessInfo;
        this.detectedPose = enumC7638a;
        this.lightCondition = imageLightCondition;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SelfieBrightnessInfo getBrightnessInfo() {
        return this.brightnessInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC7638a getDetectedPose() {
        return this.detectedPose;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC7639b getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getFaceAngleX() {
        return this.faceAngleX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getFaceAngleY() {
        return this.faceAngleY;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getFaceAngleZ() {
        return this.faceAngleZ;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getFacesInFrame() {
        return this.facesInFrame;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ImageLightCondition getLightCondition() {
        return this.lightCondition;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC5702p0 getSelfiePhoto() {
        return this.selfiePhoto;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsFaceCentered() {
        return this.isFaceCentered;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsFaceTooClose() {
        return this.isFaceTooClose;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsFaceTooFar() {
        return this.isFaceTooFar;
    }
}
