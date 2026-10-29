package fn;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fn.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 72\u00020\u0001:\u0001\u001dB¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001e\u001a\u0004\b:\u0010\u0015¨\u0006;"}, d2 = {"Lfn/a;", "", "", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIdClass", "b", "getNameFirst", "c", "getNameMiddle", "d", "getNameLast", "e", "getSex", "f", "getAddressStreet1", "g", "getAddressCity", "h", "getAddressState", "i", "getAddressPostalCode", "j", "getIdentificationNumber", "k", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "l", "o", "m", "n", "getIssuingCountry", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AamvaExtraction {

    @NotNull
    public static final Regex A;

    @NotNull
    public static final Regex B;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Regex f16847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Regex f16848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Regex f16849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Regex f16850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final Regex f16851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Regex f16852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Regex f16853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final Regex f16854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final Regex f16855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final Regex f16856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final Regex f16857z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String idClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String nameFirst;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String nameMiddle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String nameLast;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String sex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressStreet1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressCity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressPostalCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String identificationNumber;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Date issueDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Date expirationDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Date birthdate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String issuingCountry;

    /* JADX INFO: renamed from: fn.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lfn/a$a;", "", "<init>", "()V", "", "rawText", "Lfn/a;", "d", "(Ljava/lang/String;)Lfn/a;", "key", "Lkotlin/text/Regex;", "c", "(Ljava/lang/String;)Lkotlin/text/Regex;", "fieldPattern", "e", "(Ljava/lang/String;Lkotlin/text/Regex;)Ljava/lang/String;", "value", "Ljava/util/Date;", "b", "(Ljava/lang/String;)Ljava/util/Date;", "barcodeText", "", "f", "(Ljava/lang/String;)Z", "CITY", "Lkotlin/text/Regex;", "STATE", "STREET", "ZIP", "BIRTH_DATE", "EXPIRY_DATE", "FIRST_NAME", "GENDER", "ISSUE_DATE", "ISSUING_COUNTRY", "LAST_NAME", "LICENSE_NUMBER", "MIDDLE_NAME", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Date b(String value) {
            if (value == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("MMddyyyy", Locale.US).parse(value);
            } catch (Exception unused) {
                return null;
            }
        }

        public final Regex c(String key) {
            return new Regex("\n" + key + "(.+?)(\n|$)");
        }

        @Nullable
        public final AamvaExtraction d(@Nullable String rawText) {
            if (rawText == null || !f(rawText)) {
                return null;
            }
            return new AamvaExtraction(null, e(rawText, AamvaExtraction.f16853v), e(rawText, AamvaExtraction.B), e(rawText, AamvaExtraction.f16857z), e(rawText, AamvaExtraction.f16854w), e(rawText, AamvaExtraction.f16849r), e(rawText, AamvaExtraction.f16847p), e(rawText, AamvaExtraction.f16848q), e(rawText, AamvaExtraction.f16850s), e(rawText, AamvaExtraction.A), b(e(rawText, AamvaExtraction.f16855x)), b(e(rawText, AamvaExtraction.f16852u)), b(e(rawText, AamvaExtraction.f16851t)), e(rawText, AamvaExtraction.f16856y), 1, null);
        }

        public final String e(String rawText, Regex fieldPattern) {
            List<String> listB;
            MatchResult matchResultC = Regex.c(fieldPattern, rawText, 0, 2, null);
            if (matchResultC == null || (listB = matchResultC.b()) == null) {
                return null;
            }
            return (String) CollectionsKt.f0(listB, 1);
        }

        public final boolean f(String barcodeText) {
            return (!new Regex("^@\n\\u001e\r(ANSI |AAMVA)\\d{10}.+", kotlin.text.m.DOT_MATCHES_ALL).f(StringsKt.p1(barcodeText).toString()) || e(barcodeText, AamvaExtraction.f16853v) == null || e(barcodeText, AamvaExtraction.f16857z) == null) ? false : true;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f16847p = companion.c("DAI");
        f16848q = companion.c("DAJ");
        f16849r = companion.c("DAG");
        f16850s = companion.c("DAK");
        f16851t = companion.c("DBB");
        f16852u = companion.c("DBA");
        f16853v = companion.c("DAC");
        f16854w = companion.c("DBC");
        f16855x = companion.c("DBD");
        f16856y = companion.c("DCG");
        f16857z = companion.c("DCS");
        A = companion.c("DAQ");
        B = companion.c("DAD");
    }

    public AamvaExtraction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str11) {
        this.idClass = str;
        this.nameFirst = str2;
        this.nameMiddle = str3;
        this.nameLast = str4;
        this.sex = str5;
        this.addressStreet1 = str6;
        this.addressCity = str7;
        this.addressState = str8;
        this.addressPostalCode = str9;
        this.identificationNumber = str10;
        this.issueDate = date;
        this.expirationDate = date2;
        this.birthdate = date3;
        this.issuingCountry = str11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AamvaExtraction)) {
            return false;
        }
        AamvaExtraction aamvaExtraction = (AamvaExtraction) other;
        return Intrinsics.c(this.idClass, aamvaExtraction.idClass) && Intrinsics.c(this.nameFirst, aamvaExtraction.nameFirst) && Intrinsics.c(this.nameMiddle, aamvaExtraction.nameMiddle) && Intrinsics.c(this.nameLast, aamvaExtraction.nameLast) && Intrinsics.c(this.sex, aamvaExtraction.sex) && Intrinsics.c(this.addressStreet1, aamvaExtraction.addressStreet1) && Intrinsics.c(this.addressCity, aamvaExtraction.addressCity) && Intrinsics.c(this.addressState, aamvaExtraction.addressState) && Intrinsics.c(this.addressPostalCode, aamvaExtraction.addressPostalCode) && Intrinsics.c(this.identificationNumber, aamvaExtraction.identificationNumber) && Intrinsics.c(this.issueDate, aamvaExtraction.issueDate) && Intrinsics.c(this.expirationDate, aamvaExtraction.expirationDate) && Intrinsics.c(this.birthdate, aamvaExtraction.birthdate) && Intrinsics.c(this.issuingCountry, aamvaExtraction.issuingCountry);
    }

    public int hashCode() {
        String str = this.idClass;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameFirst;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode11 = (iHashCode10 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode12 = (iHashCode11 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode13 = (iHashCode12 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Date getBirthdate() {
        return this.birthdate;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public String toString() {
        return "AamvaExtraction(idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public /* synthetic */ AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str9, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : str10, (i10 & Barcode.FORMAT_UPC_E) != 0 ? null : date, (i10 & Barcode.FORMAT_PDF417) != 0 ? null : date2, (i10 & Barcode.FORMAT_AZTEC) != 0 ? null : date3, (i10 & 8192) != 0 ? null : str11);
    }
}
