package p132fn;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fn.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lfn/e;", "", "<init>", "()V", "b", "a", "Lfn/e$a;", "Lfn/e$b;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC5679e {

    /* JADX INFO: renamed from: fn.e$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lfn/e$a;", "Lfn/e;", "", "extractionRawPayload", "identificationNumber", "Ljava/util/Date;", "birthdate", "expirationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getIdentificationNumber", "Ljava/util/Date;", "()Ljava/util/Date;", "d", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class MrzBarcodeInfo extends AbstractC5679e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String extractionRawPayload;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String identificationNumber;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final Date birthdate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final Date expirationDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MrzBarcodeInfo(@NotNull String extractionRawPayload, @Nullable String str, @Nullable Date date, @Nullable Date date2) {
            super(null);
            Intrinsics.checkNotNullParameter(extractionRawPayload, "extractionRawPayload");
            this.extractionRawPayload = extractionRawPayload;
            this.identificationNumber = str;
            this.birthdate = date;
            this.expirationDate = date2;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Date getBirthdate() {
            return this.birthdate;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Date getExpirationDate() {
            return this.expirationDate;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getExtractionRawPayload() {
            return this.extractionRawPayload;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MrzBarcodeInfo)) {
                return false;
            }
            MrzBarcodeInfo mrzBarcodeInfo = (MrzBarcodeInfo) other;
            return Intrinsics.m31980c(this.extractionRawPayload, mrzBarcodeInfo.extractionRawPayload) && Intrinsics.m31980c(this.identificationNumber, mrzBarcodeInfo.identificationNumber) && Intrinsics.m31980c(this.birthdate, mrzBarcodeInfo.birthdate) && Intrinsics.m31980c(this.expirationDate, mrzBarcodeInfo.expirationDate);
        }

        public int hashCode() {
            int iHashCode = this.extractionRawPayload.hashCode() * 31;
            String str = this.identificationNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Date date = this.birthdate;
            int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.expirationDate;
            return iHashCode3 + (date2 != null ? date2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MrzBarcodeInfo(extractionRawPayload=" + this.extractionRawPayload + ", identificationNumber=" + this.identificationNumber + ", birthdate=" + this.birthdate + ", expirationDate=" + this.expirationDate + ")";
        }
    }

    /* JADX INFO: renamed from: fn.e$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0015"}, m31665d2 = {"Lfn/e$b;", "Lfn/e;", "", "extractionRawPayload", "<init>", "(Ljava/lang/String;)V", "Lfn/a;", "b", "()Lfn/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Pdf417BarcodeInfo extends AbstractC5679e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String extractionRawPayload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pdf417BarcodeInfo(@NotNull String extractionRawPayload) {
            super(null);
            Intrinsics.checkNotNullParameter(extractionRawPayload, "extractionRawPayload");
            this.extractionRawPayload = extractionRawPayload;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getExtractionRawPayload() {
            return this.extractionRawPayload;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final AamvaExtraction m25789b() {
            return AamvaExtraction.INSTANCE.m25759d(getExtractionRawPayload());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pdf417BarcodeInfo) && Intrinsics.m31980c(this.extractionRawPayload, ((Pdf417BarcodeInfo) other).extractionRawPayload);
        }

        public int hashCode() {
            return this.extractionRawPayload.hashCode();
        }

        @NotNull
        public String toString() {
            return "Pdf417BarcodeInfo(extractionRawPayload=" + this.extractionRawPayload + ")";
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: fn.e.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC5679e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC5679e() {
    }
}
