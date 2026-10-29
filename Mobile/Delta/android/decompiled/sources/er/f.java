package er;

import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jt.s;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c0;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u00020\u0006*\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\n\u001a\u00020\u0006*\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012*\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0004*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010$\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(¨\u0006*"}, d2 = {"Ler/f;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "option", "", "i", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/String;", "e", "h", "countryCode", "g", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "inputNumber", "Ler/l;", "k", "(Ljava/lang/String;)Ler/l;", "", "l", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/util/List;", "Ler/d;", "m", "(Ler/d;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "d", "()Ljava/util/List;", "candidate", "c", "(Ljava/lang/String;)Ljava/util/List;", "b", "Ljt/h;", "f", "countryOptions", "Ler/d;", "j", "()Ler/d;", "usCountryCodeMetadata", "", "Ljava/util/Map;", "countryCodeToCountryMetadata", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "DEFAULT_COUNTRY_OPTION", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f15752a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final jt.h countryOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final CountryCodeMetadata usCountryCodeMetadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, CountryCodeMetadata> countryCodeToCountryMetadata;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Option DEFAULT_COUNTRY_OPTION;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a(((Option) t8).getText(), ((Option) t10).getText());
        }
    }

    static {
        f fVar = new f();
        f15752a = fVar;
        countryOptions = jt.i.b(new Function0() { // from class: er.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.b();
            }
        });
        CountryCodeMetadata countryCodeMetadata = new CountryCodeMetadata("+1", "US", "(###) ###-####", null, 8, null);
        usCountryCodeMetadata = countryCodeMetadata;
        countryCodeToCountryMetadata = k0.m(s.a("US", countryCodeMetadata), s.a("CA", new CountryCodeMetadata("+1", "CA", "(###) ###-####", null, 8, null)), s.a("AG", new CountryCodeMetadata("+1", "AG", "(###) ###-####", null, 8, null)), s.a("AS", new CountryCodeMetadata("+1", "AS", "(###) ###-####", null, 8, null)), s.a("AI", new CountryCodeMetadata("+1", "AI", "(###) ###-####", null, 8, null)), s.a("BB", new CountryCodeMetadata("+1", "BB", "(###) ###-####", null, 8, null)), s.a("BM", new CountryCodeMetadata("+1", "BM", "(###) ###-####", null, 8, null)), s.a("BS", new CountryCodeMetadata("+1", "BS", "(###) ###-####", null, 8, null)), s.a("DM", new CountryCodeMetadata("+1", "DM", "(###) ###-####", null, 8, null)), s.a("DO", new CountryCodeMetadata("+1", "DO", "(###) ###-####", null, 8, null)), s.a("GD", new CountryCodeMetadata("+1", "GD", "(###) ###-####", null, 8, null)), s.a("GU", new CountryCodeMetadata("+1", "GU", "(###) ###-####", null, 8, null)), s.a("JM", new CountryCodeMetadata("+1", "JM", "(###) ###-####", null, 8, null)), s.a("KN", new CountryCodeMetadata("+1", "KN", "(###) ###-####", null, 8, null)), s.a("KY", new CountryCodeMetadata("+1", "KY", "(###) ###-####", null, 8, null)), s.a("LC", new CountryCodeMetadata("+1", "LC", "(###) ###-####", null, 8, null)), s.a("MP", new CountryCodeMetadata("+1", "MP", "(###) ###-####", null, 8, null)), s.a("MS", new CountryCodeMetadata("+1", "MS", "(###) ###-####", null, 8, null)), s.a("PR", new CountryCodeMetadata("+1", "PR", "(###) ###-####", null, 8, null)), s.a("SX", new CountryCodeMetadata("+1", "SX", "(###) ###-####", null, 8, null)), s.a("TC", new CountryCodeMetadata("+1", "TC", "(###) ###-####", null, 8, null)), s.a("TT", new CountryCodeMetadata("+1", "TT", "(###) ###-####", null, 8, null)), s.a("VC", new CountryCodeMetadata("+1", "VC", "(###) ###-####", null, 8, null)), s.a("VG", new CountryCodeMetadata("+1", "VG", "(###) ###-####", null, 8, null)), s.a("VI", new CountryCodeMetadata("+1", "VI", "(###) ###-####", null, 8, null)), s.a("EG", new CountryCodeMetadata("+20", "EG", "### ### ####", null, 8, null)), s.a("SS", new CountryCodeMetadata("+211", "SS", "### ### ###", null, 8, null)), s.a("MA", new CountryCodeMetadata("+212", "MA", "###-######", null, 8, null)), s.a("EH", new CountryCodeMetadata("+212", "EH", "###-######", null, 8, null)), s.a("DZ", new CountryCodeMetadata("+213", "DZ", "### ## ## ##", null, 8, null)), s.a("TN", new CountryCodeMetadata("+216", "TN", "## ### ###", null, 8, null)), s.a("LY", new CountryCodeMetadata("+218", "LY", "##-#######", null, 8, null)), s.a("GM", new CountryCodeMetadata("+220", "GM", "### ####", null, 8, null)), s.a("SN", new CountryCodeMetadata("+221", "SN", "## ### ## ##", null, 8, null)), s.a("MR", new CountryCodeMetadata("+222", "MR", "## ## ## ##", null, 8, null)), s.a("ML", new CountryCodeMetadata("+223", "ML", "## ## ## ##", null, 8, null)), s.a("GN", new CountryCodeMetadata("+224", "GN", "### ## ## ##", null, 8, null)), s.a("CI", new CountryCodeMetadata("+225", "CI", "## ## ## ##", null, 8, null)), s.a("BF", new CountryCodeMetadata("+226", "BF", "## ## ## ##", null, 8, null)), s.a("NE", new CountryCodeMetadata("+227", "NE", "## ## ## ##", null, 8, null)), s.a("TG", new CountryCodeMetadata("+228", "TG", "## ## ## ##", null, 8, null)), s.a("BJ", new CountryCodeMetadata("+229", "BJ", "## ## ## ##", null, 8, null)), s.a("MU", new CountryCodeMetadata("+230", "MU", "#### ####", null, 8, null)), s.a("LR", new CountryCodeMetadata("+231", "LR", "### ### ###", null, 8, null)), s.a("SL", new CountryCodeMetadata("+232", "SL", "## ######", null, 8, null)), s.a("GH", new CountryCodeMetadata("+233", "GH", "## ### ####", null, 8, null)), s.a("NG", new CountryCodeMetadata("+234", "NG", "### ### ####", null, 8, null)), s.a("TD", new CountryCodeMetadata("+235", "TD", "## ## ## ##", null, 8, null)), s.a("CF", new CountryCodeMetadata("+236", "CF", "## ## ## ##", null, 8, null)), s.a("CM", new CountryCodeMetadata("+237", "CM", "## ## ## ##", null, 8, null)), s.a("CV", new CountryCodeMetadata("+238", "CV", "### ## ##", null, 8, null)), s.a("ST", new CountryCodeMetadata("+239", "ST", "### ####", null, 8, null)), s.a("GQ", new CountryCodeMetadata("+240", "GQ", "### ### ###", null, 8, null)), s.a("GA", new CountryCodeMetadata("+241", "GA", "## ## ## ##", null, 8, null)), s.a("CG", new CountryCodeMetadata("+242", "CG", "## ### ####", null, 8, null)), s.a("CD", new CountryCodeMetadata("+243", "CD", "### ### ###", null, 8, null)), s.a("AO", new CountryCodeMetadata("+244", "AO", "### ### ###", null, 8, null)), s.a("GW", new CountryCodeMetadata("+245", "GW", "### ####", null, 8, null)), s.a("IO", new CountryCodeMetadata("+246", "IO", "### ####", null, 8, null)), s.a("AC", new CountryCodeMetadata("+247", "AC", null, null, 12, null)), s.a("SC", new CountryCodeMetadata("+248", "SC", "# ### ###", null, 8, null)), s.a("RW", new CountryCodeMetadata("+250", "RW", "### ### ###", null, 8, null)), s.a("ET", new CountryCodeMetadata("+251", "ET", "## ### ####", null, 8, null)), s.a("SO", new CountryCodeMetadata("+252", "SO", "## #######", null, 8, null)), s.a("DJ", new CountryCodeMetadata("+253", "DJ", "## ## ## ##", null, 8, null)), s.a("KE", new CountryCodeMetadata("+254", "KE", "## #######", null, 8, null)), s.a("TZ", new CountryCodeMetadata("+255", "TZ", "### ### ###", null, 8, null)), s.a("UG", new CountryCodeMetadata("+256", "UG", "### ######", null, 8, null)), s.a("BI", new CountryCodeMetadata("+257", "BI", "## ## ## ##", null, 8, null)), s.a("MZ", new CountryCodeMetadata("+258", "MZ", "## ### ####", null, 8, null)), s.a("ZM", new CountryCodeMetadata("+260", "ZM", "## #######", null, 8, null)), s.a("MG", new CountryCodeMetadata("+261", "MG", "## ## ### ##", null, 8, null)), s.a("RE", new CountryCodeMetadata("+262", "RE", null, null, 12, null)), s.a("TF", new CountryCodeMetadata("+262", "TF", null, null, 12, null)), s.a("YT", new CountryCodeMetadata("+262", "YT", "### ## ## ##", null, 8, null)), s.a("ZW", new CountryCodeMetadata("+263", "ZW", "## ### ####", null, 8, null)), s.a("NA", new CountryCodeMetadata("+264", "NA", "## ### ####", null, 8, null)), s.a("MW", new CountryCodeMetadata("+265", "MW", "### ## ## ##", null, 8, null)), s.a("LS", new CountryCodeMetadata("+266", "LS", "#### ####", null, 8, null)), s.a("BW", new CountryCodeMetadata("+267", "BW", "## ### ###", null, 8, null)), s.a("SZ", new CountryCodeMetadata("+268", "SZ", "#### ####", null, 8, null)), s.a("KM", new CountryCodeMetadata("+269", "KM", "### ## ##", null, 8, null)), s.a("ZA", new CountryCodeMetadata("+27", "ZA", "## ### ####", null, 8, null)), s.a("SH", new CountryCodeMetadata("+290", "SH", null, null, 12, null)), s.a("TA", new CountryCodeMetadata("+290", "TA", null, null, 12, null)), s.a("ER", new CountryCodeMetadata("+291", "ER", "# ### ###", null, 8, null)), s.a("AW", new CountryCodeMetadata("+297", "AW", "### ####", null, 8, null)), s.a("FO", new CountryCodeMetadata("+298", "FO", "######", null, 8, null)), s.a("GL", new CountryCodeMetadata("+299", "GL", "## ## ##", null, 8, null)), s.a("GR", new CountryCodeMetadata("+30", "GR", "### ### ####", null, 8, null)), s.a("NL", new CountryCodeMetadata("+31", "NL", "# ########", null, 8, null)), s.a("BE", new CountryCodeMetadata("+32", "BE", "### ## ## ##", null, 8, null)), s.a("FR", new CountryCodeMetadata("+33", "FR", "# ## ## ## ##", null, 8, null)), s.a("ES", new CountryCodeMetadata("+34", "ES", "### ## ## ##", null, 8, null)), s.a("GI", new CountryCodeMetadata("+350", "GI", "### #####", null, 8, null)), s.a("PT", new CountryCodeMetadata("+351", "PT", "### ### ###", null, 8, null)), s.a("LU", new CountryCodeMetadata("+352", "LU", "## ## ## ###", null, 8, null)), s.a("IE", new CountryCodeMetadata("+353", "IE", "## ### ####", null, 8, null)), s.a("IS", new CountryCodeMetadata("+354", "IS", "### ####", null, 8, null)), s.a("AL", new CountryCodeMetadata("+355", "AL", "## ### ####", null, 8, null)), s.a("MT", new CountryCodeMetadata("+356", "MT", "#### ####", null, 8, null)), s.a("CY", new CountryCodeMetadata("+357", "CY", "## ######", null, 8, null)), s.a("FI", new CountryCodeMetadata("+358", "FI", "## ### ## ##", null, 8, null)), s.a("AX", new CountryCodeMetadata("+358", "AX", null, null, 12, null)), s.a("BG", new CountryCodeMetadata("+359", "BG", "### ### ##", null, 8, null)), s.a("HU", new CountryCodeMetadata("+36", "HU", "## ### ####", null, 8, null)), s.a("LT", new CountryCodeMetadata("+370", "LT", "### #####", null, 8, null)), s.a("LV", new CountryCodeMetadata("+371", "LV", "## ### ###", null, 8, null)), s.a("EE", new CountryCodeMetadata("+372", "EE", "#### ####", null, 8, null)), s.a("MD", new CountryCodeMetadata("+373", "MD", "### ## ###", null, 8, null)), s.a("AM", new CountryCodeMetadata("+374", "AM", "## ######", null, 8, null)), s.a("BY", new CountryCodeMetadata("+375", "BY", "## ###-##-##", null, 8, null)), s.a("AD", new CountryCodeMetadata("+376", "AD", "### ###", null, 8, null)), s.a("MC", new CountryCodeMetadata("+377", "MC", "# ## ## ## ##", null, 8, null)), s.a("SM", new CountryCodeMetadata("+378", "SM", "## ## ## ##", null, 8, null)), s.a("VA", new CountryCodeMetadata("+379", "VA", null, null, 12, null)), s.a("UA", new CountryCodeMetadata("+380", "UA", "## ### ####", null, 8, null)), s.a("RS", new CountryCodeMetadata("+381", "RS", "## #######", null, 8, null)), s.a("ME", new CountryCodeMetadata("+382", "ME", "## ### ###", null, 8, null)), s.a("XK", new CountryCodeMetadata("+383", "XK", "## ### ###", null, 8, null)), s.a("HR", new CountryCodeMetadata("+385", "HR", "## ### ####", null, 8, null)), s.a("SI", new CountryCodeMetadata("+386", "SI", "## ### ###", null, 8, null)), s.a("BA", new CountryCodeMetadata("+387", "BA", "## ###-###", null, 8, null)), s.a("MK", new CountryCodeMetadata("+389", "MK", "## ### ###", null, 8, null)), s.a("IT", new CountryCodeMetadata("+39", "IT", "## #### ####", null, 8, null)), s.a("RO", new CountryCodeMetadata("+40", "RO", "## ### ####", null, 8, null)), s.a("CH", new CountryCodeMetadata("+41", "CH", "## ### ## ##", null, 8, null)), s.a("CZ", new CountryCodeMetadata("+420", "CZ", "### ### ###", null, 8, null)), s.a("SK", new CountryCodeMetadata("+421", "SK", "### ### ###", null, 8, null)), s.a("LI", new CountryCodeMetadata("+423", "LI", "### ### ###", null, 8, null)), s.a("AT", new CountryCodeMetadata("+43", "AT", "### ######", null, 8, null)), s.a("GB", new CountryCodeMetadata("+44", "GB", "#### ######", null, 8, null)), s.a("GG", new CountryCodeMetadata("+44", "GG", "#### ######", null, 8, null)), s.a("JE", new CountryCodeMetadata("+44", "JE", "#### ######", null, 8, null)), s.a("IM", new CountryCodeMetadata("+44", "IM", "#### ######", null, 8, null)), s.a("DK", new CountryCodeMetadata("+45", "DK", "## ## ## ##", null, 8, null)), s.a("SE", new CountryCodeMetadata("+46", "SE", "##-### ## ##", null, 8, null)), s.a("NO", new CountryCodeMetadata("+47", "NO", "### ## ###", null, 8, null)), s.a("BV", new CountryCodeMetadata("+47", "BV", null, null, 12, null)), s.a("SJ", new CountryCodeMetadata("+47", "SJ", "## ## ## ##", null, 8, null)), s.a("PL", new CountryCodeMetadata("+48", "PL", "## ### ## ##", null, 8, null)), s.a("DE", new CountryCodeMetadata("+49", "DE", "### #######", null, 8, null)), s.a("FK", new CountryCodeMetadata("+500", "FK", null, null, 12, null)), s.a("GS", new CountryCodeMetadata("+500", "GS", null, null, 12, null)), s.a("BZ", new CountryCodeMetadata("+501", "BZ", "###-####", null, 8, null)), s.a("GT", new CountryCodeMetadata("+502", "GT", "#### ####", null, 8, null)), s.a("SV", new CountryCodeMetadata("+503", "SV", "#### ####", null, 8, null)), s.a("HN", new CountryCodeMetadata("+504", "HN", "####-####", null, 8, null)), s.a("NI", new CountryCodeMetadata("+505", "NI", "#### ####", null, 8, null)), s.a("CR", new CountryCodeMetadata("+506", "CR", "#### ####", null, 8, null)), s.a("PA", new CountryCodeMetadata("+507", "PA", "####-####", null, 8, null)), s.a("PM", new CountryCodeMetadata("+508", "PM", "## ## ##", null, 8, null)), s.a("HT", new CountryCodeMetadata("+509", "HT", "## ## ####", null, 8, null)), s.a("PE", new CountryCodeMetadata("+51", "PE", "### ### ###", null, 8, null)), s.a("MX", new CountryCodeMetadata("+52", "MX", "### ### ####", null, 8, null)), s.a("AR", new CountryCodeMetadata("+54", "AR", "## ##-####-####", null, 8, null)), s.a("BR", new CountryCodeMetadata("+55", "BR", "## #####-####", null, 8, null)), s.a("CL", new CountryCodeMetadata("+56", "CL", "# #### ####", null, 8, null)), s.a("CO", new CountryCodeMetadata("+57", "CO", "### #######", null, 8, null)), s.a("VE", new CountryCodeMetadata("+58", "VE", "###-#######", null, 8, null)), s.a("BL", new CountryCodeMetadata("+590", "BL", "### ## ## ##", null, 8, null)), s.a("MF", new CountryCodeMetadata("+590", "MF", null, null, 12, null)), s.a("GP", new CountryCodeMetadata("+590", "GP", "### ## ## ##", null, 8, null)), s.a("BO", new CountryCodeMetadata("+591", "BO", "########", null, 8, null)), s.a("GY", new CountryCodeMetadata("+592", "GY", "### ####", null, 8, null)), s.a("EC", new CountryCodeMetadata("+593", "EC", "## ### ####", null, 8, null)), s.a("GF", new CountryCodeMetadata("+594", "GF", "### ## ## ##", null, 8, null)), s.a("PY", new CountryCodeMetadata("+595", "PY", "## #######", null, 8, null)), s.a("MQ", new CountryCodeMetadata("+596", "MQ", "### ## ## ##", null, 8, null)), s.a("SR", new CountryCodeMetadata("+597", "SR", "###-####", null, 8, null)), s.a("UY", new CountryCodeMetadata("+598", "UY", "#### ####", null, 8, null)), s.a("CW", new CountryCodeMetadata("+599", "CW", "# ### ####", null, 8, null)), s.a("BQ", new CountryCodeMetadata("+599", "BQ", "### ####", null, 8, null)), s.a("MY", new CountryCodeMetadata("+60", "MY", "##-### ####", null, 8, null)), s.a("AU", new CountryCodeMetadata("+61", "AU", "### ### ###", null, 8, null)), s.a("ID", new CountryCodeMetadata("+62", "ID", "###-###-###", null, 8, null)), s.a("PH", new CountryCodeMetadata("+63", "PH", "#### ######", null, 8, null)), s.a("NZ", new CountryCodeMetadata("+64", "NZ", "## ### ####", null, 8, null)), s.a("SG", new CountryCodeMetadata("+65", "SG", "#### ####", null, 8, null)), s.a("TH", new CountryCodeMetadata("+66", "TH", "## ### ####", null, 8, null)), s.a("TL", new CountryCodeMetadata("+670", "TL", "#### ####", null, 8, null)), s.a("AQ", new CountryCodeMetadata("+672", "AQ", "## ####", null, 8, null)), s.a("BN", new CountryCodeMetadata("+673", "BN", "### ####", null, 8, null)), s.a("NR", new CountryCodeMetadata("+674", "NR", "### ####", null, 8, null)), s.a("PG", new CountryCodeMetadata("+675", "PG", "### ####", null, 8, null)), s.a("TO", new CountryCodeMetadata("+676", "TO", "### ####", null, 8, null)), s.a("SB", new CountryCodeMetadata("+677", "SB", "### ####", null, 8, null)), s.a("VU", new CountryCodeMetadata("+678", "VU", "### ####", null, 8, null)), s.a("FJ", new CountryCodeMetadata("+679", "FJ", "### ####", null, 8, null)), s.a("WF", new CountryCodeMetadata("+681", "WF", "## ## ##", null, 8, null)), s.a("CK", new CountryCodeMetadata("+682", "CK", "## ###", null, 8, null)), s.a("NU", new CountryCodeMetadata("+683", "NU", null, null, 12, null)), s.a("WS", new CountryCodeMetadata("+685", "WS", null, null, 12, null)), s.a("KI", new CountryCodeMetadata("+686", "KI", null, null, 12, null)), s.a("NC", new CountryCodeMetadata("+687", "NC", "########", null, 8, null)), s.a("TV", new CountryCodeMetadata("+688", "TV", null, null, 12, null)), s.a("PF", new CountryCodeMetadata("+689", "PF", "## ## ##", null, 8, null)), s.a("TK", new CountryCodeMetadata("+690", "TK", null, null, 12, null)), s.a("RU", new CountryCodeMetadata("+7", "RU", "### ###-##-##", null, 8, null)), s.a("KZ", new CountryCodeMetadata("+7", "KZ", null, null, 12, null)), s.a("JP", new CountryCodeMetadata("+81", "JP", "##-####-####", null, 8, null)), s.a("KR", new CountryCodeMetadata("+82", "KR", "##-####-####", null, 8, null)), s.a("VN", new CountryCodeMetadata("+84", "VN", "## ### ## ##", null, 8, null)), s.a("HK", new CountryCodeMetadata("+852", "HK", "#### ####", null, 8, null)), s.a("MO", new CountryCodeMetadata("+853", "MO", "#### ####", null, 8, null)), s.a("KH", new CountryCodeMetadata("+855", "KH", "## ### ###", null, 8, null)), s.a("LA", new CountryCodeMetadata("+856", "LA", "## ## ### ###", null, 8, null)), s.a("CN", new CountryCodeMetadata("+86", "CN", "### #### ####", null, 8, null)), s.a("PN", new CountryCodeMetadata("+872", "PN", null, null, 12, null)), s.a("BD", new CountryCodeMetadata("+880", "BD", "####-######", null, 8, null)), s.a("TW", new CountryCodeMetadata("+886", "TW", "### ### ###", null, 8, null)), s.a("TR", new CountryCodeMetadata("+90", "TR", "### ### ####", null, 8, null)), s.a("IN", new CountryCodeMetadata("+91", "IN", "## ## ######", null, 8, null)), s.a("PK", new CountryCodeMetadata("+92", "PK", "### #######", null, 8, null)), s.a("AF", new CountryCodeMetadata("+93", "AF", "## ### ####", null, 8, null)), s.a("LK", new CountryCodeMetadata("+94", "LK", "## # ######", null, 8, null)), s.a("MM", new CountryCodeMetadata("+95", "MM", "# ### ####", null, 8, null)), s.a("MV", new CountryCodeMetadata("+960", "MV", "###-####", null, 8, null)), s.a("LB", new CountryCodeMetadata("+961", "LB", "## ### ###", null, 8, null)), s.a("JO", new CountryCodeMetadata("+962", "JO", "# #### ####", null, 8, null)), s.a("IQ", new CountryCodeMetadata("+964", "IQ", "### ### ####", null, 8, null)), s.a("KW", new CountryCodeMetadata("+965", "KW", "### #####", null, 8, null)), s.a("SA", new CountryCodeMetadata("+966", "SA", "## ### ####", null, 8, null)), s.a("YE", new CountryCodeMetadata("+967", "YE", "### ### ###", null, 8, null)), s.a("OM", new CountryCodeMetadata("+968", "OM", "#### ####", null, 8, null)), s.a("PS", new CountryCodeMetadata("+970", "PS", "### ### ###", null, 8, null)), s.a("AE", new CountryCodeMetadata("+971", "AE", "## ### ####", null, 8, null)), s.a("IL", new CountryCodeMetadata("+972", "IL", "##-###-####", null, 8, null)), s.a("BH", new CountryCodeMetadata("+973", "BH", "#### ####", null, 8, null)), s.a("QA", new CountryCodeMetadata("+974", "QA", "#### ####", null, 8, null)), s.a("BT", new CountryCodeMetadata("+975", "BT", "## ## ## ##", null, 8, null)), s.a("MN", new CountryCodeMetadata("+976", "MN", "#### ####", null, 8, null)), s.a("NP", new CountryCodeMetadata("+977", "NP", "###-#######", null, 8, null)), s.a("TJ", new CountryCodeMetadata("+992", "TJ", "### ## ####", null, 8, null)), s.a("TM", new CountryCodeMetadata("+993", "TM", "## ##-##-##", null, 8, null)), s.a("AZ", new CountryCodeMetadata("+994", "AZ", "## ### ## ##", null, 8, null)), s.a("GE", new CountryCodeMetadata("+995", "GE", "### ## ## ##", null, 8, null)), s.a("KG", new CountryCodeMetadata("+996", "KG", "### ### ###", null, 8, null)), s.a("UZ", new CountryCodeMetadata("+998", "UZ", "## ### ## ##", null, 8, null)));
        DEFAULT_COUNTRY_OPTION = fVar.m(countryCodeMetadata);
    }

    public static final List b() {
        return f15752a.d();
    }

    public final List<CountryCodeMetadata> c(String candidate) {
        Collection<CountryCodeMetadata> collectionValues = countryCodeToCountryMetadata.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (Intrinsics.c(((CountryCodeMetadata) obj).getPrefix(), candidate)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Option> d() {
        Option optionM = m(usCountryCodeMetadata);
        Map<String, CountryCodeMetadata> map = countryCodeToCountryMetadata;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CountryCodeMetadata> entry : map.entrySet()) {
            if (!Intrinsics.c(entry.getKey(), optionM.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(f15752a.m((CountryCodeMetadata) ((Map.Entry) it.next()).getValue()));
        }
        return CollectionsKt.w0(kotlin.collections.o.d(optionM), CollectionsKt.F0(arrayList, new a()));
    }

    @NotNull
    public final String e(@NotNull Option option) {
        Intrinsics.checkNotNullParameter(option, "<this>");
        String upperCase = StringsKt.p1((String) CollectionsKt.d0(l(option))).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @NotNull
    public final List<Option> f() {
        return (List) countryOptions.getValue();
    }

    @NotNull
    public final Option g(@Nullable String countryCode) {
        Option optionM;
        if (countryCode == null || countryCode.length() != 2) {
            return DEFAULT_COUNTRY_OPTION;
        }
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        CountryCodeMetadata countryCodeMetadata = countryCodeToCountryMetadata.get(upperCase);
        return (countryCodeMetadata == null || (optionM = m(countryCodeMetadata)) == null) ? DEFAULT_COUNTRY_OPTION : optionM;
    }

    @NotNull
    public final String h(@NotNull Option option) {
        Intrinsics.checkNotNullParameter(option, "<this>");
        return StringsKt.p1((String) CollectionsKt.o0(l(option))).toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @NotNull
    public final String i(@NotNull Option option) {
        Intrinsics.checkNotNullParameter(option, "option");
        List listSplit$default = StringsKt.split$default(option.getText(), new String[]{" "}, false, 0, 6, null);
        String text = (String) CollectionsKt.f0(listSplit$default, 0);
        if (text == null) {
            text = DEFAULT_COUNTRY_OPTION.getText();
        }
        String str = (String) CollectionsKt.p0(listSplit$default);
        if (str == null) {
            str = "";
        } else {
            if (!x.T(str, "+", false, 2, null)) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        return StringsKt.p1(text + " " + str).toString();
    }

    @NotNull
    public final CountryCodeMetadata j() {
        return usCountryCodeMetadata;
    }

    @NotNull
    public final PhoneNumberInfo k(@NotNull String inputNumber) {
        Object next;
        String countryCode;
        String country;
        Intrinsics.checkNotNullParameter(inputNumber, "inputNumber");
        String string = StringsKt.p1(inputNumber).toString();
        if (!x.T(string, "+", false, 2, null)) {
            string = "+" + string;
        }
        String countryCode2 = usCountryCodeMetadata.getCountryCode();
        for (int i10 = 4; 1 < i10; i10--) {
            if (string.length() >= i10) {
                String strSubstring = string.substring(0, i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                List<CountryCodeMetadata> listC = c(strSubstring);
                if (!listC.isEmpty()) {
                    if (listC.size() != 1) {
                        Iterator<T> it = listC.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            countryCode = ((CountryCodeMetadata) next).getCountryCode();
                            country = Locale.getDefault().getCountry();
                            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
                        } while (!countryCode.contentEquals(country));
                        CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) next;
                        if (countryCodeMetadata != null && (countryCode2 = countryCodeMetadata.getCountryCode()) != null) {
                            break;
                        }
                        countryCode2 = ((CountryCodeMetadata) CollectionsKt.d0(listC)).getCountryCode();
                        break;
                    }
                    countryCode2 = listC.get(0).getCountryCode();
                    break;
                }
            }
        }
        CountryCodeMetadata countryCodeMetadata2 = countryCodeToCountryMetadata.get(countryCode2);
        String prefix = countryCodeMetadata2 != null ? countryCodeMetadata2.getPrefix() : null;
        return (prefix == null || prefix.length() == 0) ? new PhoneNumberInfo(countryCode2, StringsKt.p1(c0.u1(string, 1)).toString()) : new PhoneNumberInfo(countryCode2, StringsKt.p1(c0.u1(string, prefix.length())).toString());
    }

    public final List<String> l(Option option) {
        return StringsKt.split$default(StringsKt.p1(option.getValue()).toString(), new String[]{" "}, false, 0, 6, null);
    }

    public final Option m(CountryCodeMetadata countryCodeMetadata) {
        String strD = countryCodeMetadata.d();
        String upperCase = countryCodeMetadata.getCountryCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new Option(strD, upperCase + " " + countryCodeMetadata.getPrefix(), null, 4, null);
    }
}
