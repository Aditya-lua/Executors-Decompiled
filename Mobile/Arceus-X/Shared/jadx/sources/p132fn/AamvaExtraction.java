package p132fn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.EnumC7786m;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fn.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 72\u00020\u0001:\u0001\u001dB¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001e\u001a\u0004\b:\u0010\u0015¨\u0006;"}, m31665d2 = {"Lfn/a;", "", "", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIdClass", "b", "getNameFirst", "c", "getNameMiddle", "d", "getNameLast", "e", "getSex", "f", "getAddressStreet1", "g", "getAddressCity", "h", "getAddressState", "i", "getAddressPostalCode", "j", "getIdentificationNumber", "k", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "l", "o", "m", "n", "getIssuingCountry", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class AamvaExtraction {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final Regex f21768A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final Regex f21769B;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Regex f21771p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Regex f21772q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Regex f21773r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Regex f21774s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Regex f21775t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Regex f21776u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Regex f21777v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Regex f21778w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Regex f21779x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final Regex f21780y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final Regex f21781z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final String idClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String nameFirst;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String nameMiddle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String nameLast;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String sex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressStreet1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressCity;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressPostalCode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    public final String identificationNumber;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date issueDate;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date expirationDate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date birthdate;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    public final String issuingCountry;

    /* JADX INFO: renamed from: fn.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, m31665d2 = {"Lfn/a$a;", "", "<init>", "()V", "", "rawText", "Lfn/a;", "d", "(Ljava/lang/String;)Lfn/a;", "key", "Lkotlin/text/Regex;", "c", "(Ljava/lang/String;)Lkotlin/text/Regex;", "fieldPattern", "e", "(Ljava/lang/String;Lkotlin/text/Regex;)Ljava/lang/String;", "value", "Ljava/util/Date;", "b", "(Ljava/lang/String;)Ljava/util/Date;", "barcodeText", "", "f", "(Ljava/lang/String;)Z", "CITY", "Lkotlin/text/Regex;", "STATE", "STREET", "ZIP", "BIRTH_DATE", "EXPIRY_DATE", "FIRST_NAME", "GENDER", "ISSUE_DATE", "ISSUING_COUNTRY", "LAST_NAME", "LICENSE_NUMBER", "MIDDLE_NAME", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: fn.a.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final Date m25757b(String value) {
            if (value == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("MMddyyyy", Locale.US).parse(value);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final Regex m25758c(String key) {
            return new Regex("\n" + key + "(.+?)(\n|$)");
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final AamvaExtraction m25759d(@Nullable String rawText) {
            if (rawText == null || !m25761f(rawText)) {
                return null;
            }
            return new AamvaExtraction(null, m25760e(rawText, AamvaExtraction.f21777v), m25760e(rawText, AamvaExtraction.f21769B), m25760e(rawText, AamvaExtraction.f21781z), m25760e(rawText, AamvaExtraction.f21778w), m25760e(rawText, AamvaExtraction.f21773r), m25760e(rawText, AamvaExtraction.f21771p), m25760e(rawText, AamvaExtraction.f21772q), m25760e(rawText, AamvaExtraction.f21774s), m25760e(rawText, AamvaExtraction.f21768A), m25757b(m25760e(rawText, AamvaExtraction.f21779x)), m25757b(m25760e(rawText, AamvaExtraction.f21776u)), m25757b(m25760e(rawText, AamvaExtraction.f21775t)), m25760e(rawText, AamvaExtraction.f21780y), 1, null);
        }

        /* JADX INFO: renamed from: e */
        public final String m25760e(String rawText, Regex fieldPattern) {
            List<String> listMo32103b;
            MatchResult matchResultM32108c = Regex.m32108c(fieldPattern, rawText, 0, 2, null);
            if (matchResultM32108c == null || (listMo32103b = matchResultM32108c.mo32103b()) == null) {
                return null;
            }
            return (String) CollectionsKt.m31708f0(listMo32103b, 1);
        }

        /* JADX INFO: renamed from: f */
        public final boolean m25761f(String barcodeText) {
            return (!new Regex("^@\n\\u001e\r(ANSI |AAMVA)\\d{10}.+", EnumC7786m.DOT_MATCHES_ALL).m32113f(StringsKt.m32183p1(barcodeText).toString()) || m25760e(barcodeText, AamvaExtraction.f21777v) == null || m25760e(barcodeText, AamvaExtraction.f21781z) == null) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f21771p = companion.m25758c("DAI");
        f21772q = companion.m25758c("DAJ");
        f21773r = companion.m25758c("DAG");
        f21774s = companion.m25758c("DAK");
        f21775t = companion.m25758c("DBB");
        f21776u = companion.m25758c("DBA");
        f21777v = companion.m25758c("DAC");
        f21778w = companion.m25758c("DBC");
        f21779x = companion.m25758c("DBD");
        f21780y = companion.m25758c("DCG");
        f21781z = companion.m25758c("DCS");
        f21768A = companion.m25758c("DAQ");
        f21769B = companion.m25758c("DAD");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        return Intrinsics.m31980c(this.idClass, aamvaExtraction.idClass) && Intrinsics.m31980c(this.nameFirst, aamvaExtraction.nameFirst) && Intrinsics.m31980c(this.nameMiddle, aamvaExtraction.nameMiddle) && Intrinsics.m31980c(this.nameLast, aamvaExtraction.nameLast) && Intrinsics.m31980c(this.sex, aamvaExtraction.sex) && Intrinsics.m31980c(this.addressStreet1, aamvaExtraction.addressStreet1) && Intrinsics.m31980c(this.addressCity, aamvaExtraction.addressCity) && Intrinsics.m31980c(this.addressState, aamvaExtraction.addressState) && Intrinsics.m31980c(this.addressPostalCode, aamvaExtraction.addressPostalCode) && Intrinsics.m31980c(this.identificationNumber, aamvaExtraction.identificationNumber) && Intrinsics.m31980c(this.issueDate, aamvaExtraction.issueDate) && Intrinsics.m31980c(this.expirationDate, aamvaExtraction.expirationDate) && Intrinsics.m31980c(this.birthdate, aamvaExtraction.birthdate) && Intrinsics.m31980c(this.issuingCountry, aamvaExtraction.issuingCountry);
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
      (wrap java.util.Date:?: TERNARY null = ((wrap int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r26v0 java.util.Date))
      (wrap java.util.Date:?: TERNARY null = ((wrap int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r27v0 java.util.Date))
      (wrap java.util.Date:?: TERNARY null = ((wrap int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r28v0 java.util.Date))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
     A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.lang.String):void (m)] (LINE:16) call: fn.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.lang.String):void type: THIS */
    public /* synthetic */ AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : date, (i10 & 2048) != 0 ? null : date2, (i10 & 4096) != 0 ? null : date3, (i10 & 8192) != 0 ? null : str11);
    }
}
