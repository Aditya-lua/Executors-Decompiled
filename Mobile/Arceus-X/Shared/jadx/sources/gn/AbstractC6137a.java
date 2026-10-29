package gn;

import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AbstractC5679e;
import p132fn.InterfaceC5690j0;

/* JADX INFO: renamed from: gn.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m31665d2 = {"Lgn/a;", "", "<init>", "()V", "d", "a", "c", "f", "e", "b", "Lgn/a$a;", "Lgn/a$b;", "Lgn/a$c;", "Lgn/a$d;", "Lgn/a$e;", "Lgn/a$f;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC6137a {

    /* JADX INFO: renamed from: gn.a$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lgn/a$a;", "Lgn/a;", "Lfn/e;", "extractedBarcode", "<init>", "(Lfn/e;)V", "a", "Lfn/e;", "()Lfn/e;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC6137a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AbstractC5679e extractedBarcode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull AbstractC5679e extractedBarcode) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedBarcode, "extractedBarcode");
            this.extractedBarcode = extractedBarcode;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC5679e getExtractedBarcode() {
            return this.extractedBarcode;
        }
    }

    /* JADX INFO: renamed from: gn.a$b */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lgn/a$b;", "Lgn/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class b extends AbstractC6137a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f23474a = new b();

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

    /* JADX INFO: renamed from: gn.a$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, m31665d2 = {"Lgn/a$c;", "Lgn/a;", "Lfn/j0$c;", "side", "frontOrBackData", "<init>", "(Lfn/j0$c;Lgn/a;)V", "a", "Lfn/j0$c;", "b", "()Lfn/j0$c;", "Lgn/a;", "()Lgn/a;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC6137a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC5690j0.c side;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractC6137a frontOrBackData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull InterfaceC5690j0.c side, @NotNull AbstractC6137a frontOrBackData) {
            super(null);
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(frontOrBackData, "frontOrBackData");
            this.side = side;
            this.frontOrBackData = frontOrBackData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC6137a getFrontOrBackData() {
            return this.frontOrBackData;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC5690j0.c getSide() {
            return this.side;
        }
    }

    /* JADX INFO: renamed from: gn.a$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lgn/a$d;", "Lgn/a;", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "metadata", "<init>", "(Lcom/withpersona/sdk2/camera/ImageIdMetadata;)V", "a", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC6137a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: gn.a$e */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lgn/a$e;", "Lgn/a;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "a", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC6137a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: gn.a$f */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lgn/a$f;", "Lgn/a;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "extractedTexts", "<init>", "(Lcom/withpersona/sdk2/camera/ExtractedTexts;)V", "a", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC6137a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: gn.a.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC6137a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC6137a() {
    }
}
