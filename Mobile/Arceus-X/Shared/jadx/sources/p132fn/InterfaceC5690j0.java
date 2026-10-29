package p132fn;

import android.graphics.Bitmap;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: fn.j0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lfn/j0;", "", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "a", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "b", "c", "Lfn/j0$a;", "Lfn/j0$b;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC5690j0 {

    /* JADX INFO: renamed from: fn.j0$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lfn/j0$a;", "Lfn/j0;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class None implements InterfaceC5690j0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final ImageLightCondition imageLightCondition;

        public None(@Nullable ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }

        @Override // p132fn.InterfaceC5690j0
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && Intrinsics.m31980c(this.imageLightCondition, ((None) other).imageLightCondition);
        }

        public int hashCode() {
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            if (imageLightCondition == null) {
                return 0;
            }
            return imageLightCondition.hashCode();
        }

        @NotNull
        public String toString() {
            return "None(imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    /* JADX INFO: renamed from: fn.j0$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b&\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001b\u0010,¨\u0006-"}, m31665d2 = {"Lfn/j0$b;", "Lfn/j0;", "Lfn/j0$c;", "side", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "metadata", "Lfn/e;", "extractedBarcode", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "extractedTexts", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lfn/j0$c;Landroid/graphics/Bitmap;Lcom/withpersona/sdk2/camera/ImageIdMetadata;Lfn/e;Lcom/withpersona/sdk2/camera/ExtractedTexts;Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfn/j0$c;", "f", "()Lfn/j0$c;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "e", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "d", "Lfn/e;", "()Lfn/e;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ParsedIdSide implements InterfaceC5690j0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final c side;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Bitmap bitmap;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final ImageIdMetadata metadata;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final AbstractC5679e extractedBarcode;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final ExtractedTexts extractedTexts;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final ImageLightCondition imageLightCondition;

        public ParsedIdSide(@NotNull c side, @NotNull Bitmap bitmap, @Nullable ImageIdMetadata imageIdMetadata, @Nullable AbstractC5679e abstractC5679e, @Nullable ExtractedTexts extractedTexts, @Nullable ImageLightCondition imageLightCondition) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.side = side;
            this.bitmap = bitmap;
            this.metadata = imageIdMetadata;
            this.extractedBarcode = abstractC5679e;
            this.extractedTexts = extractedTexts;
            this.imageLightCondition = imageLightCondition;
        }

        @Override // p132fn.InterfaceC5690j0
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC5679e getExtractedBarcode() {
            return this.extractedBarcode;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedIdSide)) {
                return false;
            }
            ParsedIdSide parsedIdSide = (ParsedIdSide) other;
            return this.side == parsedIdSide.side && Intrinsics.m31980c(this.bitmap, parsedIdSide.bitmap) && Intrinsics.m31980c(this.metadata, parsedIdSide.metadata) && Intrinsics.m31980c(this.extractedBarcode, parsedIdSide.extractedBarcode) && Intrinsics.m31980c(this.extractedTexts, parsedIdSide.extractedTexts) && Intrinsics.m31980c(this.imageLightCondition, parsedIdSide.imageLightCondition);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final c getSide() {
            return this.side;
        }

        public int hashCode() {
            int iHashCode = ((this.side.hashCode() * 31) + this.bitmap.hashCode()) * 31;
            ImageIdMetadata imageIdMetadata = this.metadata;
            int iHashCode2 = (iHashCode + (imageIdMetadata == null ? 0 : imageIdMetadata.hashCode())) * 31;
            AbstractC5679e abstractC5679e = this.extractedBarcode;
            int iHashCode3 = (iHashCode2 + (abstractC5679e == null ? 0 : abstractC5679e.hashCode())) * 31;
            ExtractedTexts extractedTexts = this.extractedTexts;
            int iHashCode4 = (iHashCode3 + (extractedTexts == null ? 0 : extractedTexts.hashCode())) * 31;
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            return iHashCode4 + (imageLightCondition != null ? imageLightCondition.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ParsedIdSide(side=" + this.side + ", bitmap=" + this.bitmap + ", metadata=" + this.metadata + ", extractedBarcode=" + this.extractedBarcode + ", extractedTexts=" + this.extractedTexts + ", imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    /* JADX INFO: renamed from: fn.j0$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Lfn/j0$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum c {
        Front,
        Back;


        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC10707a f21868d = C10708b.m40805a(m25820a());
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    ImageLightCondition getImageLightCondition();
}
