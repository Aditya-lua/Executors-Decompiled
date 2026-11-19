package tn;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sn.ExtractedTexts;
import sn.ImageIdMetadata;
import sn.ImageLightCondition;
import sn.w0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Ltn/a;", BuildConfig.FLAVOR, "<init>", "()V", "d", "a", "c", "f", "e", "b", "Ltn/a$a;", "Ltn/a$b;", "Ltn/a$c;", "Ltn/a$d;", "Ltn/a$e;", "Ltn/a$f;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: tn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ltn/a$a;", "Ltn/a;", "Lsn/g;", "extractedBarcode", "<init>", "(Lsn/g;)V", "a", "Lsn/g;", "()Lsn/g;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0655a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.g extractedBarcode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0655a(@NotNull sn.g extractedBarcode) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedBarcode, "extractedBarcode");
            this.extractedBarcode = extractedBarcode;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final sn.g getExtractedBarcode() {
            return this.extractedBarcode;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltn/a$b;", "Ltn/a;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f32571a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 801215118;
        }

        @NotNull
        public String toString() {
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Ltn/a$c;", "Ltn/a;", "Lsn/w0$c;", "side", "frontOrBackData", "<init>", "(Lsn/w0$c;Ltn/a;)V", "a", "Lsn/w0$c;", "b", "()Lsn/w0$c;", "Ltn/a;", "()Ltn/a;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final w0.c side;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final a frontOrBackData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull w0.c side, @NotNull a frontOrBackData) {
            super(null);
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(frontOrBackData, "frontOrBackData");
            this.side = side;
            this.frontOrBackData = frontOrBackData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getFrontOrBackData() {
            return this.frontOrBackData;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final w0.c getSide() {
            return this.side;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ltn/a$d;", "Ltn/a;", "Lsn/j0;", "metadata", "<init>", "(Lsn/j0;)V", "a", "Lsn/j0;", "()Lsn/j0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ImageIdMetadata metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull ImageIdMetadata metadata) {
            super(null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.metadata = metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ltn/a$e;", "Ltn/a;", "Lsn/k0;", "imageLightCondition", "<init>", "(Lsn/k0;)V", "a", "Lsn/k0;", "()Lsn/k0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ImageLightCondition imageLightCondition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull ImageLightCondition imageLightCondition) {
            super(null);
            Intrinsics.checkNotNullParameter(imageLightCondition, "imageLightCondition");
            this.imageLightCondition = imageLightCondition;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ltn/a$f;", "Ltn/a;", "Lsn/e0;", "extractedTexts", "<init>", "(Lsn/e0;)V", "a", "Lsn/e0;", "()Lsn/e0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ExtractedTexts extractedTexts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull ExtractedTexts extractedTexts) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedTexts, "extractedTexts");
            this.extractedTexts = extractedTexts;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
