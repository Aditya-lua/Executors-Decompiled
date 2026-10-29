package p132fn;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fn.g0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001\u001eB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b/\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b-\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b+\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b)\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010\u0016¨\u0006<"}, m31665d2 = {"Lfn/g0;", "", "", "rawText", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "getIdClass", "c", "getNameFirst", "d", "getNameMiddle", "e", "getNameLast", "f", "getSex", "g", "getAddressStreet1", "h", "getAddressCity", "getAddressState", "j", "getAddressPostalCode", "k", "l", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "m", "n", "o", "getIssuingCountry", "p", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class MrzExtraction {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Regex f21823q = new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{9})([0-9]{1})([A-Z0-9<]{15})");

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Regex f21824r = new Regex("([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z]{3})([A-Z0-9<]{11})([0-9]{1})");

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Regex f21825s = new Regex("([A-Z0-9<]{30})");

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Regex f21826t = new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{31})");

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Regex f21827u = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{7})([0-9]{1})");

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Regex f21828v = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?<<+)");

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Regex f21829w = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?)<<([A-Z0-9<]+<<+)");

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Regex f21830x = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})?([A-Z0-9<]{14})?([0-9]{1})?([0-9]{1})?");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String rawText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String idClass;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String nameFirst;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String nameMiddle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String nameLast;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String sex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressStreet1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressCity;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    public final String addressPostalCode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final String identificationNumber;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date issueDate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date expirationDate;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date birthdate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    public final String issuingCountry;

    /* JADX INFO: renamed from: fn.g0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, m31665d2 = {"Lfn/g0$a;", "", "<init>", "()V", "", "rawText", "Lfn/g0;", "e", "(Ljava/lang/String;)Lfn/g0;", "cleanText", "f", "h", "name", "d", "(Ljava/lang/String;)Ljava/lang/String;", InquiryField.DateField.TYPE, "Ljava/util/Date;", "c", "(Ljava/lang/String;)Ljava/util/Date;", "Lkotlin/text/Regex;", "TD1_LINE1", "Lkotlin/text/Regex;", "TD1_LINE2", "TD1_LINE3", "TD2_LINE1", "TD2_LINE2", "TD2_LINE3", "TD3_LINE1", "TD3_LINE2", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: fn.g0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: g */
        public static final CharSequence m25804g(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }

        /* JADX INFO: renamed from: i */
        public static final CharSequence m25805i(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }

        /* JADX INFO: renamed from: c */
        public final Date m25806c(String date) {
            if (date == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("yyMMdd", Locale.US).parse(new Regex("G").replace(new Regex("S").replace(new Regex("O").replace(new Regex("D").replace(new Regex("L").replace(new Regex("I").replace(date, "1"), "1"), "0"), "0"), "5"), "6"));
            } catch (ParseException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public final String m25807d(String name) {
            if (name == null) {
                return null;
            }
            return StringsKt.m32183p1(C7797x.m32303N(name, "<", " ", false, 4, null)).toString();
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final MrzExtraction m25808e(@Nullable String rawText) {
            if (rawText == null) {
                return null;
            }
            String strReplace = new Regex("([\r\t ])").replace(rawText, "");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strReplace.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            MrzExtraction mrzExtractionM25809f = m25809f(upperCase);
            return mrzExtractionM25809f == null ? m25810h(upperCase) : mrzExtractionM25809f;
        }

        /* JADX INFO: renamed from: f */
        public final MrzExtraction m25809f(String cleanText) {
            MatchResult matchResultM32108c;
            MatchResult matchResultM32108c2;
            MatchResult matchResultM32108c3 = Regex.m32108c(MrzExtraction.f21823q, cleanText, 0, 2, null);
            if (matchResultM32108c3 == null || (matchResultM32108c = Regex.m32108c(MrzExtraction.f21824r, cleanText, 0, 2, null)) == null || (matchResultM32108c2 = Regex.m32108c(MrzExtraction.f21825s, C7797x.m32303N(C7797x.m32303N(cleanText, matchResultM32108c3.getValue(), "", false, 4, null), matchResultM32108c.getValue(), "", false, 4, null), 0, 2, null)) == null) {
                return null;
            }
            String string = StringsKt.m32183p1(matchResultM32108c2.getValue()).toString();
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
            return new MrzExtraction(CollectionsKt.m31715m0(C7699p.m31895n(matchResultM32108c3, matchResultM32108c, matchResultM32108c2), "\n", null, null, 0, null, new Function1() { // from class: fn.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.m25804g((MatchResult) obj);
                }
            }, 30, null), null, m25807d((String) CollectionsKt.m31708f0(listSplit$default, 1)), null, m25807d((String) CollectionsKt.m31708f0(listSplit$default, 0)), matchResultM32108c.mo32103b().get(3), null, null, null, null, matchResultM32108c3.mo32103b().get(3), null, m25806c(matchResultM32108c.mo32103b().get(4)), m25806c(matchResultM32108c.mo32103b().get(1)), matchResultM32108c3.mo32103b().get(2), 3018, null);
        }

        /* JADX INFO: renamed from: h */
        public final MrzExtraction m25810h(String cleanText) {
            MatchResult matchResultM32108c;
            MatchResult matchResultM32108c2 = Regex.m32108c(MrzExtraction.f21829w, cleanText, 0, 2, null);
            if (matchResultM32108c2 == null || (matchResultM32108c = Regex.m32108c(MrzExtraction.f21830x, cleanText, 0, 2, null)) == null) {
                return null;
            }
            return new MrzExtraction(CollectionsKt.m31715m0(C7699p.m31895n(matchResultM32108c2, matchResultM32108c), "\n", null, null, 0, null, new Function1() { // from class: fn.e0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.m25805i((MatchResult) obj);
                }
            }, 30, null), null, m25807d(matchResultM32108c2.mo32103b().get(4)), null, m25807d(matchResultM32108c2.mo32103b().get(3)), matchResultM32108c.mo32103b().get(6), null, null, null, null, matchResultM32108c.mo32103b().get(1), null, m25806c(matchResultM32108c.mo32103b().get(7)), m25806c(matchResultM32108c.mo32103b().get(4)), matchResultM32108c2.mo32103b().get(2), 3018, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        return Intrinsics.m31980c(this.rawText, mrzExtraction.rawText) && Intrinsics.m31980c(this.idClass, mrzExtraction.idClass) && Intrinsics.m31980c(this.nameFirst, mrzExtraction.nameFirst) && Intrinsics.m31980c(this.nameMiddle, mrzExtraction.nameMiddle) && Intrinsics.m31980c(this.nameLast, mrzExtraction.nameLast) && Intrinsics.m31980c(this.sex, mrzExtraction.sex) && Intrinsics.m31980c(this.addressStreet1, mrzExtraction.addressStreet1) && Intrinsics.m31980c(this.addressCity, mrzExtraction.addressCity) && Intrinsics.m31980c(this.addressState, mrzExtraction.addressState) && Intrinsics.m31980c(this.addressPostalCode, mrzExtraction.addressPostalCode) && Intrinsics.m31980c(this.identificationNumber, mrzExtraction.identificationNumber) && Intrinsics.m31980c(this.issueDate, mrzExtraction.issueDate) && Intrinsics.m31980c(this.expirationDate, mrzExtraction.expirationDate) && Intrinsics.m31980c(this.birthdate, mrzExtraction.birthdate) && Intrinsics.m31980c(this.issuingCountry, mrzExtraction.issuingCountry);
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0093: CONSTRUCTOR 
      (r16v0 java.lang.String)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0013: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001b: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0023: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x002b: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0033: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x003b: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0043: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x004b: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
      (wrap java.util.Date:?: TERNARY null = ((wrap int:0x0053: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r27v0 java.util.Date))
      (wrap java.util.Date:?: TERNARY null = ((wrap int:0x005b: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r28v0 java.util.Date))
      (wrap java.util.Date:?: TERNARY null = ((wrap int:0x0063: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r29v0 java.util.Date))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x006b: ARITH (r31v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
     A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.lang.String):void (m)] (LINE:17) call: fn.g0.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.lang.String):void type: THIS */
    public /* synthetic */ MrzExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Date date, Date date2, Date date3, String str12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & 2048) != 0 ? null : date, (i10 & 4096) != 0 ? null : date2, (i10 & 8192) != 0 ? null : date3, (i10 & 16384) != 0 ? null : str12);
    }
}
