package fn;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fn.g0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001\u001eB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b/\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b-\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b+\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b)\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010\u0016¨\u0006<"}, d2 = {"Lfn/g0;", "", "", "rawText", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "getIdClass", "c", "getNameFirst", "d", "getNameMiddle", "e", "getNameLast", "f", "getSex", "g", "getAddressStreet1", "h", "getAddressCity", "getAddressState", "j", "getAddressPostalCode", "k", "l", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "m", "n", "o", "getIssuingCountry", "p", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MrzExtraction {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Regex f16892q = new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{9})([0-9]{1})([A-Z0-9<]{15})");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Regex f16893r = new Regex("([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z]{3})([A-Z0-9<]{11})([0-9]{1})");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Regex f16894s = new Regex("([A-Z0-9<]{30})");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final Regex f16895t = new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{31})");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Regex f16896u = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{7})([0-9]{1})");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Regex f16897v = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?<<+)");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final Regex f16898w = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?)<<([A-Z0-9<]+<<+)");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final Regex f16899x = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})?([A-Z0-9<]{14})?([0-9]{1})?([0-9]{1})?");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String rawText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String idClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String nameFirst;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String nameMiddle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String nameLast;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String sex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressStreet1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressCity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String addressPostalCode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String identificationNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Date issueDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Date expirationDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Date birthdate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String issuingCountry;

    /* JADX INFO: renamed from: fn.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Lfn/g0$a;", "", "<init>", "()V", "", "rawText", "Lfn/g0;", "e", "(Ljava/lang/String;)Lfn/g0;", "cleanText", "f", "h", "name", "d", "(Ljava/lang/String;)Ljava/lang/String;", InquiryField.DateField.TYPE, "Ljava/util/Date;", "c", "(Ljava/lang/String;)Ljava/util/Date;", "Lkotlin/text/Regex;", "TD1_LINE1", "Lkotlin/text/Regex;", "TD1_LINE2", "TD1_LINE3", "TD2_LINE1", "TD2_LINE2", "TD2_LINE3", "TD3_LINE1", "TD3_LINE2", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final CharSequence g(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }

        public static final CharSequence i(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }

        public final Date c(String date) {
            if (date == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("yyMMdd", Locale.US).parse(new Regex("G").replace(new Regex("S").replace(new Regex("O").replace(new Regex("D").replace(new Regex("L").replace(new Regex("I").replace(date, "1"), "1"), "0"), "0"), "5"), "6"));
            } catch (ParseException unused) {
                return null;
            }
        }

        public final String d(String name) {
            if (name == null) {
                return null;
            }
            return StringsKt.p1(kotlin.text.x.N(name, "<", " ", false, 4, null)).toString();
        }

        @Nullable
        public final MrzExtraction e(@Nullable String rawText) {
            if (rawText == null) {
                return null;
            }
            String strReplace = new Regex("([\r\t ])").replace(rawText, "");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strReplace.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            MrzExtraction mrzExtractionF = f(upperCase);
            return mrzExtractionF == null ? h(upperCase) : mrzExtractionF;
        }

        public final MrzExtraction f(String cleanText) {
            MatchResult matchResultC;
            MatchResult matchResultC2;
            MatchResult matchResultC3 = Regex.c(MrzExtraction.f16892q, cleanText, 0, 2, null);
            if (matchResultC3 == null || (matchResultC = Regex.c(MrzExtraction.f16893r, cleanText, 0, 2, null)) == null || (matchResultC2 = Regex.c(MrzExtraction.f16894s, kotlin.text.x.N(kotlin.text.x.N(cleanText, matchResultC3.getValue(), "", false, 4, null), matchResultC.getValue(), "", false, 4, null), 0, 2, null)) == null) {
                return null;
            }
            String string = StringsKt.p1(matchResultC2.getValue()).toString();
            int length = string.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = string.charAt(!z10 ? i10 : length) == '<';
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            List listSplit$default = StringsKt.split$default(string.subSequence(i10, length + 1).toString(), new String[]{"<<"}, false, 0, 6, null);
            return new MrzExtraction(CollectionsKt.m0(kotlin.collections.p.n(matchResultC3, matchResultC, matchResultC2), "\n", null, null, 0, null, new Function1() { // from class: fn.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.g((MatchResult) obj);
                }
            }, 30, null), null, d((String) CollectionsKt.f0(listSplit$default, 1)), null, d((String) CollectionsKt.f0(listSplit$default, 0)), matchResultC.b().get(3), null, null, null, null, matchResultC3.b().get(3), null, c(matchResultC.b().get(4)), c(matchResultC.b().get(1)), matchResultC3.b().get(2), 3018, null);
        }

        public final MrzExtraction h(String cleanText) {
            MatchResult matchResultC;
            MatchResult matchResultC2 = Regex.c(MrzExtraction.f16898w, cleanText, 0, 2, null);
            if (matchResultC2 == null || (matchResultC = Regex.c(MrzExtraction.f16899x, cleanText, 0, 2, null)) == null) {
                return null;
            }
            return new MrzExtraction(CollectionsKt.m0(kotlin.collections.p.n(matchResultC2, matchResultC), "\n", null, null, 0, null, new Function1() { // from class: fn.e0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.i((MatchResult) obj);
                }
            }, 30, null), null, d(matchResultC2.b().get(4)), null, d(matchResultC2.b().get(3)), matchResultC.b().get(6), null, null, null, null, matchResultC.b().get(1), null, c(matchResultC.b().get(7)), c(matchResultC.b().get(4)), matchResultC2.b().get(2), 3018, null);
        }

        public Companion() {
        }
    }

    public MrzExtraction(@NotNull String rawText, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str11) {
        Intrinsics.checkNotNullParameter(rawText, "rawText");
        this.rawText = rawText;
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
        if (!(other instanceof MrzExtraction)) {
            return false;
        }
        MrzExtraction mrzExtraction = (MrzExtraction) other;
        return Intrinsics.c(this.rawText, mrzExtraction.rawText) && Intrinsics.c(this.idClass, mrzExtraction.idClass) && Intrinsics.c(this.nameFirst, mrzExtraction.nameFirst) && Intrinsics.c(this.nameMiddle, mrzExtraction.nameMiddle) && Intrinsics.c(this.nameLast, mrzExtraction.nameLast) && Intrinsics.c(this.sex, mrzExtraction.sex) && Intrinsics.c(this.addressStreet1, mrzExtraction.addressStreet1) && Intrinsics.c(this.addressCity, mrzExtraction.addressCity) && Intrinsics.c(this.addressState, mrzExtraction.addressState) && Intrinsics.c(this.addressPostalCode, mrzExtraction.addressPostalCode) && Intrinsics.c(this.identificationNumber, mrzExtraction.identificationNumber) && Intrinsics.c(this.issueDate, mrzExtraction.issueDate) && Intrinsics.c(this.expirationDate, mrzExtraction.expirationDate) && Intrinsics.c(this.birthdate, mrzExtraction.birthdate) && Intrinsics.c(this.issuingCountry, mrzExtraction.issuingCountry);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Date getBirthdate() {
        return this.birthdate;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public int hashCode() {
        int iHashCode = this.rawText.hashCode() * 31;
        String str = this.idClass;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameFirst;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode12 = (iHashCode11 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode13 = (iHashCode12 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode14 = (iHashCode13 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRawText() {
        return this.rawText;
    }

    @NotNull
    public String toString() {
        return "MrzExtraction(rawText=" + this.rawText + ", idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public /* synthetic */ MrzExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Date date, Date date2, Date date3, String str12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str9, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : str10, (i10 & Barcode.FORMAT_UPC_E) != 0 ? null : str11, (i10 & Barcode.FORMAT_PDF417) != 0 ? null : date, (i10 & Barcode.FORMAT_AZTEC) != 0 ? null : date2, (i10 & 8192) != 0 ? null : date3, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str12);
    }
}
