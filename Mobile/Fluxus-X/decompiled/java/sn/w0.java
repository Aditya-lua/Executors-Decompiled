package sn;

import android.graphics.Bitmap;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lsn/w0;", BuildConfig.FLAVOR, "Lsn/k0;", "a", "()Lsn/k0;", "imageLightCondition", "b", "c", "Lsn/w0$a;", "Lsn/w0$b;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w0 {

    /* JADX INFO: renamed from: sn.w0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsn/w0$a;", "Lsn/w0;", "Lsn/k0;", "imageLightCondition", "<init>", "(Lsn/k0;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lsn/k0;", "()Lsn/k0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class None implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ImageLightCondition imageLightCondition;

        public None(@Nullable ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }

        @Override // sn.w0
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && Intrinsics.c(this.imageLightCondition, ((None) other).imageLightCondition);
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

    /* JADX INFO: renamed from: sn.w0$b, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b&\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001b\u0010,¨\u0006-"}, d2 = {"Lsn/w0$b;", "Lsn/w0;", "Lsn/w0$c;", "side", "Landroid/graphics/Bitmap;", "bitmap", "Lsn/j0;", "metadata", "Lsn/g;", "extractedBarcode", "Lsn/e0;", "extractedTexts", "Lsn/k0;", "imageLightCondition", "<init>", "(Lsn/w0$c;Landroid/graphics/Bitmap;Lsn/j0;Lsn/g;Lsn/e0;Lsn/k0;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lsn/w0$c;", "f", "()Lsn/w0$c;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "Lsn/j0;", "e", "()Lsn/j0;", "d", "Lsn/g;", "()Lsn/g;", "Lsn/e0;", "()Lsn/e0;", "Lsn/k0;", "()Lsn/k0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ParsedIdSide implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c side;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Bitmap bitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ImageIdMetadata metadata;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final g extractedBarcode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ExtractedTexts extractedTexts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ImageLightCondition imageLightCondition;

        public ParsedIdSide(@NotNull c side, @NotNull Bitmap bitmap, @Nullable ImageIdMetadata imageIdMetadata, @Nullable g gVar, @Nullable ExtractedTexts extractedTexts, @Nullable ImageLightCondition imageLightCondition) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.side = side;
            this.bitmap = bitmap;
            this.metadata = imageIdMetadata;
            this.extractedBarcode = gVar;
            this.extractedTexts = extractedTexts;
            this.imageLightCondition = imageLightCondition;
        }

        @Override // sn.w0
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
        public final g getExtractedBarcode() {
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
            return this.side == parsedIdSide.side && Intrinsics.c(this.bitmap, parsedIdSide.bitmap) && Intrinsics.c(this.metadata, parsedIdSide.metadata) && Intrinsics.c(this.extractedBarcode, parsedIdSide.extractedBarcode) && Intrinsics.c(this.extractedTexts, parsedIdSide.extractedTexts) && Intrinsics.c(this.imageLightCondition, parsedIdSide.imageLightCondition);
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
            g gVar = this.extractedBarcode;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsn/w0$c;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        Front,
        Back;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ hu.a f31739d = hu.b.a(a());
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    ImageLightCondition getImageLightCondition();
}
