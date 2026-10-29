package er;

import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.C7352s;
import p229jt.InterfaceC7341h;

/* JADX INFO: renamed from: er.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u00020\u0006*\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\n\u001a\u00020\u0006*\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012*\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0004*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010$\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(¨\u0006*"}, m31665d2 = {"Ler/f;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "option", "", "i", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/String;", "e", "h", "countryCode", "g", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "inputNumber", "Ler/l;", "k", "(Ljava/lang/String;)Ler/l;", "", "l", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/util/List;", "Ler/d;", "m", "(Ler/d;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "d", "()Ljava/util/List;", "candidate", "c", "(Ljava/lang/String;)Ljava/util/List;", "b", "Ljt/h;", "f", "countryOptions", "Ler/d;", "j", "()Ler/d;", "usCountryCodeMetadata", "", "Ljava/util/Map;", "countryCodeToCountryMetadata", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "DEFAULT_COUNTRY_OPTION", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5197f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5197f f20219a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h countryOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final CountryCodeMetadata usCountryCodeMetadata;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, CountryCodeMetadata> countryCodeToCountryMetadata;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Option DEFAULT_COUNTRY_OPTION;

    /* JADX INFO: renamed from: er.f$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(((Option) t8).getText(), ((Option) t10).getText());
        }
    }

    static {
        C5197f c5197f = new C5197f();
        f20219a = c5197f;
        countryOptions = C7342i.m30456b(new Function0() { // from class: er.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5197f.m24104b();
            }
        });
        CountryCodeMetadata countryCodeMetadata = new CountryCodeMetadata("+1", "US", "(###) ###-####", null, 8, null);
        usCountryCodeMetadata = countryCodeMetadata;
        countryCodeToCountryMetadata = C7690k0.m31798m(C7352s.m30477a("US", countryCodeMetadata), C7352s.m30477a("CA", new CountryCodeMetadata("+1", "CA", "(###) ###-####", null, 8, null)), C7352s.m30477a("AG", new CountryCodeMetadata("+1", "AG", "(###) ###-####", null, 8, null)), C7352s.m30477a("AS", new CountryCodeMetadata("+1", "AS", "(###) ###-####", null, 8, null)), C7352s.m30477a("AI", new CountryCodeMetadata("+1", "AI", "(###) ###-####", null, 8, null)), C7352s.m30477a("BB", new CountryCodeMetadata("+1", "BB", "(###) ###-####", null, 8, null)), C7352s.m30477a("BM", new CountryCodeMetadata("+1", "BM", "(###) ###-####", null, 8, null)), C7352s.m30477a("BS", new CountryCodeMetadata("+1", "BS", "(###) ###-####", null, 8, null)), C7352s.m30477a("DM", new CountryCodeMetadata("+1", "DM", "(###) ###-####", null, 8, null)), C7352s.m30477a("DO", new CountryCodeMetadata("+1", "DO", "(###) ###-####", null, 8, null)), C7352s.m30477a("GD", new CountryCodeMetadata("+1", "GD", "(###) ###-####", null, 8, null)), C7352s.m30477a("GU", new CountryCodeMetadata("+1", "GU", "(###) ###-####", null, 8, null)), C7352s.m30477a("JM", new CountryCodeMetadata("+1", "JM", "(###) ###-####", null, 8, null)), C7352s.m30477a("KN", new CountryCodeMetadata("+1", "KN", "(###) ###-####", null, 8, null)), C7352s.m30477a("KY", new CountryCodeMetadata("+1", "KY", "(###) ###-####", null, 8, null)), C7352s.m30477a("LC", new CountryCodeMetadata("+1", "LC", "(###) ###-####", null, 8, null)), C7352s.m30477a("MP", new CountryCodeMetadata("+1", "MP", "(###) ###-####", null, 8, null)), C7352s.m30477a("MS", new CountryCodeMetadata("+1", "MS", "(###) ###-####", null, 8, null)), C7352s.m30477a("PR", new CountryCodeMetadata("+1", "PR", "(###) ###-####", null, 8, null)), C7352s.m30477a("SX", new CountryCodeMetadata("+1", "SX", "(###) ###-####", null, 8, null)), C7352s.m30477a("TC", new CountryCodeMetadata("+1", "TC", "(###) ###-####", null, 8, null)), C7352s.m30477a("TT", new CountryCodeMetadata("+1", "TT", "(###) ###-####", null, 8, null)), C7352s.m30477a("VC", new CountryCodeMetadata("+1", "VC", "(###) ###-####", null, 8, null)), C7352s.m30477a("VG", new CountryCodeMetadata("+1", "VG", "(###) ###-####", null, 8, null)), C7352s.m30477a("VI", new CountryCodeMetadata("+1", "VI", "(###) ###-####", null, 8, null)), C7352s.m30477a("EG", new CountryCodeMetadata("+20", "EG", "### ### ####", null, 8, null)), C7352s.m30477a("SS", new CountryCodeMetadata("+211", "SS", "### ### ###", null, 8, null)), C7352s.m30477a("MA", new CountryCodeMetadata("+212", "MA", "###-######", null, 8, null)), C7352s.m30477a("EH", new CountryCodeMetadata("+212", "EH", "###-######", null, 8, null)), C7352s.m30477a("DZ", new CountryCodeMetadata("+213", "DZ", "### ## ## ##", null, 8, null)), C7352s.m30477a("TN", new CountryCodeMetadata("+216", "TN", "## ### ###", null, 8, null)), C7352s.m30477a("LY", new CountryCodeMetadata("+218", "LY", "##-#######", null, 8, null)), C7352s.m30477a("GM", new CountryCodeMetadata("+220", "GM", "### ####", null, 8, null)), C7352s.m30477a("SN", new CountryCodeMetadata("+221", "SN", "## ### ## ##", null, 8, null)), C7352s.m30477a("MR", new CountryCodeMetadata("+222", "MR", "## ## ## ##", null, 8, null)), C7352s.m30477a("ML", new CountryCodeMetadata("+223", "ML", "## ## ## ##", null, 8, null)), C7352s.m30477a("GN", new CountryCodeMetadata("+224", "GN", "### ## ## ##", null, 8, null)), C7352s.m30477a("CI", new CountryCodeMetadata("+225", "CI", "## ## ## ##", null, 8, null)), C7352s.m30477a("BF", new CountryCodeMetadata("+226", "BF", "## ## ## ##", null, 8, null)), C7352s.m30477a("NE", new CountryCodeMetadata("+227", "NE", "## ## ## ##", null, 8, null)), C7352s.m30477a("TG", new CountryCodeMetadata("+228", "TG", "## ## ## ##", null, 8, null)), C7352s.m30477a("BJ", new CountryCodeMetadata("+229", "BJ", "## ## ## ##", null, 8, null)), C7352s.m30477a("MU", new CountryCodeMetadata("+230", "MU", "#### ####", null, 8, null)), C7352s.m30477a("LR", new CountryCodeMetadata("+231", "LR", "### ### ###", null, 8, null)), C7352s.m30477a("SL", new CountryCodeMetadata("+232", "SL", "## ######", null, 8, null)), C7352s.m30477a("GH", new CountryCodeMetadata("+233", "GH", "## ### ####", null, 8, null)), C7352s.m30477a("NG", new CountryCodeMetadata("+234", "NG", "### ### ####", null, 8, null)), C7352s.m30477a("TD", new CountryCodeMetadata("+235", "TD", "## ## ## ##", null, 8, null)), C7352s.m30477a("CF", new CountryCodeMetadata("+236", "CF", "## ## ## ##", null, 8, null)), C7352s.m30477a("CM", new CountryCodeMetadata("+237", "CM", "## ## ## ##", null, 8, null)), C7352s.m30477a("CV", new CountryCodeMetadata("+238", "CV", "### ## ##", null, 8, null)), C7352s.m30477a("ST", new CountryCodeMetadata("+239", "ST", "### ####", null, 8, null)), C7352s.m30477a("GQ", new CountryCodeMetadata("+240", "GQ", "### ### ###", null, 8, null)), C7352s.m30477a("GA", new CountryCodeMetadata("+241", "GA", "## ## ## ##", null, 8, null)), C7352s.m30477a("CG", new CountryCodeMetadata("+242", "CG", "## ### ####", null, 8, null)), C7352s.m30477a("CD", new CountryCodeMetadata("+243", "CD", "### ### ###", null, 8, null)), C7352s.m30477a("AO", new CountryCodeMetadata("+244", "AO", "### ### ###", null, 8, null)), C7352s.m30477a("GW", new CountryCodeMetadata("+245", "GW", "### ####", null, 8, null)), C7352s.m30477a("IO", new CountryCodeMetadata("+246", "IO", "### ####", null, 8, null)), C7352s.m30477a("AC", new CountryCodeMetadata("+247", "AC", null, null, 12, null)), C7352s.m30477a("SC", new CountryCodeMetadata("+248", "SC", "# ### ###", null, 8, null)), C7352s.m30477a("RW", new CountryCodeMetadata("+250", "RW", "### ### ###", null, 8, null)), C7352s.m30477a("ET", new CountryCodeMetadata("+251", "ET", "## ### ####", null, 8, null)), C7352s.m30477a("SO", new CountryCodeMetadata("+252", "SO", "## #######", null, 8, null)), C7352s.m30477a("DJ", new CountryCodeMetadata("+253", "DJ", "## ## ## ##", null, 8, null)), C7352s.m30477a("KE", new CountryCodeMetadata("+254", "KE", "## #######", null, 8, null)), C7352s.m30477a("TZ", new CountryCodeMetadata("+255", "TZ", "### ### ###", null, 8, null)), C7352s.m30477a("UG", new CountryCodeMetadata("+256", "UG", "### ######", null, 8, null)), C7352s.m30477a("BI", new CountryCodeMetadata("+257", "BI", "## ## ## ##", null, 8, null)), C7352s.m30477a("MZ", new CountryCodeMetadata("+258", "MZ", "## ### ####", null, 8, null)), C7352s.m30477a("ZM", new CountryCodeMetadata("+260", "ZM", "## #######", null, 8, null)), C7352s.m30477a("MG", new CountryCodeMetadata("+261", "MG", "## ## ### ##", null, 8, null)), C7352s.m30477a("RE", new CountryCodeMetadata("+262", "RE", null, null, 12, null)), C7352s.m30477a("TF", new CountryCodeMetadata("+262", "TF", null, null, 12, null)), C7352s.m30477a("YT", new CountryCodeMetadata("+262", "YT", "### ## ## ##", null, 8, null)), C7352s.m30477a("ZW", new CountryCodeMetadata("+263", "ZW", "## ### ####", null, 8, null)), C7352s.m30477a("NA", new CountryCodeMetadata("+264", "NA", "## ### ####", null, 8, null)), C7352s.m30477a("MW", new CountryCodeMetadata("+265", "MW", "### ## ## ##", null, 8, null)), C7352s.m30477a("LS", new CountryCodeMetadata("+266", "LS", "#### ####", null, 8, null)), C7352s.m30477a("BW", new CountryCodeMetadata("+267", "BW", "## ### ###", null, 8, null)), C7352s.m30477a("SZ", new CountryCodeMetadata("+268", "SZ", "#### ####", null, 8, null)), C7352s.m30477a("KM", new CountryCodeMetadata("+269", "KM", "### ## ##", null, 8, null)), C7352s.m30477a("ZA", new CountryCodeMetadata("+27", "ZA", "## ### ####", null, 8, null)), C7352s.m30477a("SH", new CountryCodeMetadata("+290", "SH", null, null, 12, null)), C7352s.m30477a("TA", new CountryCodeMetadata("+290", "TA", null, null, 12, null)), C7352s.m30477a("ER", new CountryCodeMetadata("+291", "ER", "# ### ###", null, 8, null)), C7352s.m30477a("AW", new CountryCodeMetadata("+297", "AW", "### ####", null, 8, null)), C7352s.m30477a("FO", new CountryCodeMetadata("+298", "FO", "######", null, 8, null)), C7352s.m30477a("GL", new CountryCodeMetadata("+299", "GL", "## ## ##", null, 8, null)), C7352s.m30477a("GR", new CountryCodeMetadata("+30", "GR", "### ### ####", null, 8, null)), C7352s.m30477a("NL", new CountryCodeMetadata("+31", "NL", "# ########", null, 8, null)), C7352s.m30477a("BE", new CountryCodeMetadata("+32", "BE", "### ## ## ##", null, 8, null)), C7352s.m30477a("FR", new CountryCodeMetadata("+33", "FR", "# ## ## ## ##", null, 8, null)), C7352s.m30477a("ES", new CountryCodeMetadata("+34", "ES", "### ## ## ##", null, 8, null)), C7352s.m30477a("GI", new CountryCodeMetadata("+350", "GI", "### #####", null, 8, null)), C7352s.m30477a("PT", new CountryCodeMetadata("+351", "PT", "### ### ###", null, 8, null)), C7352s.m30477a("LU", new CountryCodeMetadata("+352", "LU", "## ## ## ###", null, 8, null)), C7352s.m30477a("IE", new CountryCodeMetadata("+353", "IE", "## ### ####", null, 8, null)), C7352s.m30477a("IS", new CountryCodeMetadata("+354", "IS", "### ####", null, 8, null)), C7352s.m30477a("AL", new CountryCodeMetadata("+355", "AL", "## ### ####", null, 8, null)), C7352s.m30477a("MT", new CountryCodeMetadata("+356", "MT", "#### ####", null, 8, null)), C7352s.m30477a("CY", new CountryCodeMetadata("+357", "CY", "## ######", null, 8, null)), C7352s.m30477a("FI", new CountryCodeMetadata("+358", "FI", "## ### ## ##", null, 8, null)), C7352s.m30477a("AX", new CountryCodeMetadata("+358", "AX", null, null, 12, null)), C7352s.m30477a("BG", new CountryCodeMetadata("+359", "BG", "### ### ##", null, 8, null)), C7352s.m30477a("HU", new CountryCodeMetadata("+36", "HU", "## ### ####", null, 8, null)), C7352s.m30477a("LT", new CountryCodeMetadata("+370", "LT", "### #####", null, 8, null)), C7352s.m30477a("LV", new CountryCodeMetadata("+371", "LV", "## ### ###", null, 8, null)), C7352s.m30477a("EE", new CountryCodeMetadata("+372", "EE", "#### ####", null, 8, null)), C7352s.m30477a("MD", new CountryCodeMetadata("+373", "MD", "### ## ###", null, 8, null)), C7352s.m30477a("AM", new CountryCodeMetadata("+374", "AM", "## ######", null, 8, null)), C7352s.m30477a("BY", new CountryCodeMetadata("+375", "BY", "## ###-##-##", null, 8, null)), C7352s.m30477a("AD", new CountryCodeMetadata("+376", "AD", "### ###", null, 8, null)), C7352s.m30477a("MC", new CountryCodeMetadata("+377", "MC", "# ## ## ## ##", null, 8, null)), C7352s.m30477a("SM", new CountryCodeMetadata("+378", "SM", "## ## ## ##", null, 8, null)), C7352s.m30477a("VA", new CountryCodeMetadata("+379", "VA", null, null, 12, null)), C7352s.m30477a("UA", new CountryCodeMetadata("+380", "UA", "## ### ####", null, 8, null)), C7352s.m30477a("RS", new CountryCodeMetadata("+381", "RS", "## #######", null, 8, null)), C7352s.m30477a("ME", new CountryCodeMetadata("+382", "ME", "## ### ###", null, 8, null)), C7352s.m30477a("XK", new CountryCodeMetadata("+383", "XK", "## ### ###", null, 8, null)), C7352s.m30477a("HR", new CountryCodeMetadata("+385", "HR", "## ### ####", null, 8, null)), C7352s.m30477a("SI", new CountryCodeMetadata("+386", "SI", "## ### ###", null, 8, null)), C7352s.m30477a("BA", new CountryCodeMetadata("+387", "BA", "## ###-###", null, 8, null)), C7352s.m30477a("MK", new CountryCodeMetadata("+389", "MK", "## ### ###", null, 8, null)), C7352s.m30477a("IT", new CountryCodeMetadata("+39", "IT", "## #### ####", null, 8, null)), C7352s.m30477a("RO", new CountryCodeMetadata("+40", "RO", "## ### ####", null, 8, null)), C7352s.m30477a("CH", new CountryCodeMetadata("+41", "CH", "## ### ## ##", null, 8, null)), C7352s.m30477a("CZ", new CountryCodeMetadata("+420", "CZ", "### ### ###", null, 8, null)), C7352s.m30477a("SK", new CountryCodeMetadata("+421", "SK", "### ### ###", null, 8, null)), C7352s.m30477a("LI", new CountryCodeMetadata("+423", "LI", "### ### ###", null, 8, null)), C7352s.m30477a("AT", new CountryCodeMetadata("+43", "AT", "### ######", null, 8, null)), C7352s.m30477a("GB", new CountryCodeMetadata("+44", "GB", "#### ######", null, 8, null)), C7352s.m30477a("GG", new CountryCodeMetadata("+44", "GG", "#### ######", null, 8, null)), C7352s.m30477a("JE", new CountryCodeMetadata("+44", "JE", "#### ######", null, 8, null)), C7352s.m30477a("IM", new CountryCodeMetadata("+44", "IM", "#### ######", null, 8, null)), C7352s.m30477a("DK", new CountryCodeMetadata("+45", "DK", "## ## ## ##", null, 8, null)), C7352s.m30477a("SE", new CountryCodeMetadata("+46", "SE", "##-### ## ##", null, 8, null)), C7352s.m30477a("NO", new CountryCodeMetadata("+47", "NO", "### ## ###", null, 8, null)), C7352s.m30477a("BV", new CountryCodeMetadata("+47", "BV", null, null, 12, null)), C7352s.m30477a("SJ", new CountryCodeMetadata("+47", "SJ", "## ## ## ##", null, 8, null)), C7352s.m30477a("PL", new CountryCodeMetadata("+48", "PL", "## ### ## ##", null, 8, null)), C7352s.m30477a("DE", new CountryCodeMetadata("+49", "DE", "### #######", null, 8, null)), C7352s.m30477a("FK", new CountryCodeMetadata("+500", "FK", null, null, 12, null)), C7352s.m30477a("GS", new CountryCodeMetadata("+500", "GS", null, null, 12, null)), C7352s.m30477a("BZ", new CountryCodeMetadata("+501", "BZ", "###-####", null, 8, null)), C7352s.m30477a("GT", new CountryCodeMetadata("+502", "GT", "#### ####", null, 8, null)), C7352s.m30477a("SV", new CountryCodeMetadata("+503", "SV", "#### ####", null, 8, null)), C7352s.m30477a("HN", new CountryCodeMetadata("+504", "HN", "####-####", null, 8, null)), C7352s.m30477a("NI", new CountryCodeMetadata("+505", "NI", "#### ####", null, 8, null)), C7352s.m30477a("CR", new CountryCodeMetadata("+506", "CR", "#### ####", null, 8, null)), C7352s.m30477a("PA", new CountryCodeMetadata("+507", "PA", "####-####", null, 8, null)), C7352s.m30477a("PM", new CountryCodeMetadata("+508", "PM", "## ## ##", null, 8, null)), C7352s.m30477a("HT", new CountryCodeMetadata("+509", "HT", "## ## ####", null, 8, null)), C7352s.m30477a("PE", new CountryCodeMetadata("+51", "PE", "### ### ###", null, 8, null)), C7352s.m30477a("MX", new CountryCodeMetadata("+52", "MX", "### ### ####", null, 8, null)), C7352s.m30477a("AR", new CountryCodeMetadata("+54", "AR", "## ##-####-####", null, 8, null)), C7352s.m30477a("BR", new CountryCodeMetadata("+55", "BR", "## #####-####", null, 8, null)), C7352s.m30477a("CL", new CountryCodeMetadata("+56", "CL", "# #### ####", null, 8, null)), C7352s.m30477a("CO", new CountryCodeMetadata("+57", "CO", "### #######", null, 8, null)), C7352s.m30477a("VE", new CountryCodeMetadata("+58", "VE", "###-#######", null, 8, null)), C7352s.m30477a("BL", new CountryCodeMetadata("+590", "BL", "### ## ## ##", null, 8, null)), C7352s.m30477a("MF", new CountryCodeMetadata("+590", "MF", null, null, 12, null)), C7352s.m30477a("GP", new CountryCodeMetadata("+590", "GP", "### ## ## ##", null, 8, null)), C7352s.m30477a("BO", new CountryCodeMetadata("+591", "BO", "########", null, 8, null)), C7352s.m30477a("GY", new CountryCodeMetadata("+592", "GY", "### ####", null, 8, null)), C7352s.m30477a("EC", new CountryCodeMetadata("+593", "EC", "## ### ####", null, 8, null)), C7352s.m30477a("GF", new CountryCodeMetadata("+594", "GF", "### ## ## ##", null, 8, null)), C7352s.m30477a("PY", new CountryCodeMetadata("+595", "PY", "## #######", null, 8, null)), C7352s.m30477a("MQ", new CountryCodeMetadata("+596", "MQ", "### ## ## ##", null, 8, null)), C7352s.m30477a("SR", new CountryCodeMetadata("+597", "SR", "###-####", null, 8, null)), C7352s.m30477a("UY", new CountryCodeMetadata("+598", "UY", "#### ####", null, 8, null)), C7352s.m30477a("CW", new CountryCodeMetadata("+599", "CW", "# ### ####", null, 8, null)), C7352s.m30477a("BQ", new CountryCodeMetadata("+599", "BQ", "### ####", null, 8, null)), C7352s.m30477a("MY", new CountryCodeMetadata("+60", "MY", "##-### ####", null, 8, null)), C7352s.m30477a("AU", new CountryCodeMetadata("+61", "AU", "### ### ###", null, 8, null)), C7352s.m30477a("ID", new CountryCodeMetadata("+62", "ID", "###-###-###", null, 8, null)), C7352s.m30477a("PH", new CountryCodeMetadata("+63", "PH", "#### ######", null, 8, null)), C7352s.m30477a("NZ", new CountryCodeMetadata("+64", "NZ", "## ### ####", null, 8, null)), C7352s.m30477a("SG", new CountryCodeMetadata("+65", "SG", "#### ####", null, 8, null)), C7352s.m30477a("TH", new CountryCodeMetadata("+66", "TH", "## ### ####", null, 8, null)), C7352s.m30477a("TL", new CountryCodeMetadata("+670", "TL", "#### ####", null, 8, null)), C7352s.m30477a("AQ", new CountryCodeMetadata("+672", "AQ", "## ####", null, 8, null)), C7352s.m30477a("BN", new CountryCodeMetadata("+673", "BN", "### ####", null, 8, null)), C7352s.m30477a("NR", new CountryCodeMetadata("+674", "NR", "### ####", null, 8, null)), C7352s.m30477a("PG", new CountryCodeMetadata("+675", "PG", "### ####", null, 8, null)), C7352s.m30477a("TO", new CountryCodeMetadata("+676", "TO", "### ####", null, 8, null)), C7352s.m30477a("SB", new CountryCodeMetadata("+677", "SB", "### ####", null, 8, null)), C7352s.m30477a("VU", new CountryCodeMetadata("+678", "VU", "### ####", null, 8, null)), C7352s.m30477a("FJ", new CountryCodeMetadata("+679", "FJ", "### ####", null, 8, null)), C7352s.m30477a("WF", new CountryCodeMetadata("+681", "WF", "## ## ##", null, 8, null)), C7352s.m30477a("CK", new CountryCodeMetadata("+682", "CK", "## ###", null, 8, null)), C7352s.m30477a("NU", new CountryCodeMetadata("+683", "NU", null, null, 12, null)), C7352s.m30477a("WS", new CountryCodeMetadata("+685", "WS", null, null, 12, null)), C7352s.m30477a("KI", new CountryCodeMetadata("+686", "KI", null, null, 12, null)), C7352s.m30477a("NC", new CountryCodeMetadata("+687", "NC", "########", null, 8, null)), C7352s.m30477a("TV", new CountryCodeMetadata("+688", "TV", null, null, 12, null)), C7352s.m30477a("PF", new CountryCodeMetadata("+689", "PF", "## ## ##", null, 8, null)), C7352s.m30477a("TK", new CountryCodeMetadata("+690", "TK", null, null, 12, null)), C7352s.m30477a("RU", new CountryCodeMetadata("+7", "RU", "### ###-##-##", null, 8, null)), C7352s.m30477a("KZ", new CountryCodeMetadata("+7", "KZ", null, null, 12, null)), C7352s.m30477a("JP", new CountryCodeMetadata("+81", "JP", "##-####-####", null, 8, null)), C7352s.m30477a("KR", new CountryCodeMetadata("+82", "KR", "##-####-####", null, 8, null)), C7352s.m30477a("VN", new CountryCodeMetadata("+84", "VN", "## ### ## ##", null, 8, null)), C7352s.m30477a("HK", new CountryCodeMetadata("+852", "HK", "#### ####", null, 8, null)), C7352s.m30477a("MO", new CountryCodeMetadata("+853", "MO", "#### ####", null, 8, null)), C7352s.m30477a("KH", new CountryCodeMetadata("+855", "KH", "## ### ###", null, 8, null)), C7352s.m30477a("LA", new CountryCodeMetadata("+856", "LA", "## ## ### ###", null, 8, null)), C7352s.m30477a("CN", new CountryCodeMetadata("+86", "CN", "### #### ####", null, 8, null)), C7352s.m30477a("PN", new CountryCodeMetadata("+872", "PN", null, null, 12, null)), C7352s.m30477a("BD", new CountryCodeMetadata("+880", "BD", "####-######", null, 8, null)), C7352s.m30477a("TW", new CountryCodeMetadata("+886", "TW", "### ### ###", null, 8, null)), C7352s.m30477a("TR", new CountryCodeMetadata("+90", "TR", "### ### ####", null, 8, null)), C7352s.m30477a("IN", new CountryCodeMetadata("+91", "IN", "## ## ######", null, 8, null)), C7352s.m30477a("PK", new CountryCodeMetadata("+92", "PK", "### #######", null, 8, null)), C7352s.m30477a("AF", new CountryCodeMetadata("+93", "AF", "## ### ####", null, 8, null)), C7352s.m30477a("LK", new CountryCodeMetadata("+94", "LK", "## # ######", null, 8, null)), C7352s.m30477a("MM", new CountryCodeMetadata("+95", "MM", "# ### ####", null, 8, null)), C7352s.m30477a("MV", new CountryCodeMetadata("+960", "MV", "###-####", null, 8, null)), C7352s.m30477a("LB", new CountryCodeMetadata("+961", "LB", "## ### ###", null, 8, null)), C7352s.m30477a("JO", new CountryCodeMetadata("+962", "JO", "# #### ####", null, 8, null)), C7352s.m30477a("IQ", new CountryCodeMetadata("+964", "IQ", "### ### ####", null, 8, null)), C7352s.m30477a("KW", new CountryCodeMetadata("+965", "KW", "### #####", null, 8, null)), C7352s.m30477a("SA", new CountryCodeMetadata("+966", "SA", "## ### ####", null, 8, null)), C7352s.m30477a("YE", new CountryCodeMetadata("+967", "YE", "### ### ###", null, 8, null)), C7352s.m30477a("OM", new CountryCodeMetadata("+968", "OM", "#### ####", null, 8, null)), C7352s.m30477a("PS", new CountryCodeMetadata("+970", "PS", "### ### ###", null, 8, null)), C7352s.m30477a("AE", new CountryCodeMetadata("+971", "AE", "## ### ####", null, 8, null)), C7352s.m30477a("IL", new CountryCodeMetadata("+972", "IL", "##-###-####", null, 8, null)), C7352s.m30477a("BH", new CountryCodeMetadata("+973", "BH", "#### ####", null, 8, null)), C7352s.m30477a("QA", new CountryCodeMetadata("+974", "QA", "#### ####", null, 8, null)), C7352s.m30477a("BT", new CountryCodeMetadata("+975", "BT", "## ## ## ##", null, 8, null)), C7352s.m30477a("MN", new CountryCodeMetadata("+976", "MN", "#### ####", null, 8, null)), C7352s.m30477a("NP", new CountryCodeMetadata("+977", "NP", "###-#######", null, 8, null)), C7352s.m30477a("TJ", new CountryCodeMetadata("+992", "TJ", "### ## ####", null, 8, null)), C7352s.m30477a("TM", new CountryCodeMetadata("+993", "TM", "## ##-##-##", null, 8, null)), C7352s.m30477a("AZ", new CountryCodeMetadata("+994", "AZ", "## ### ## ##", null, 8, null)), C7352s.m30477a("GE", new CountryCodeMetadata("+995", "GE", "### ## ## ##", null, 8, null)), C7352s.m30477a("KG", new CountryCodeMetadata("+996", "KG", "### ### ###", null, 8, null)), C7352s.m30477a("UZ", new CountryCodeMetadata("+998", "UZ", "## ### ## ##", null, 8, null)));
        DEFAULT_COUNTRY_OPTION = c5197f.m24115m(countryCodeMetadata);
    }

    /* JADX INFO: renamed from: b */
    public static final List m24104b() {
        return f20219a.m24106d();
    }

    /* JADX INFO: renamed from: c */
    public final List<CountryCodeMetadata> m24105c(String candidate) {
        Collection<CountryCodeMetadata> collectionValues = countryCodeToCountryMetadata.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (Intrinsics.m31980c(((CountryCodeMetadata) obj).getPrefix(), candidate)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final List<Option> m24106d() {
        Option optionM24115m = m24115m(usCountryCodeMetadata);
        Map<String, CountryCodeMetadata> map = countryCodeToCountryMetadata;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CountryCodeMetadata> entry : map.entrySet()) {
            if (!Intrinsics.m31980c(entry.getKey(), optionM24115m.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(f20219a.m24115m((CountryCodeMetadata) ((Map.Entry) it.next()).getValue()));
        }
        return CollectionsKt.m31725w0(C7697o.m31878d(optionM24115m), CollectionsKt.m31680F0(arrayList, new a()));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m24107e(@NotNull Option option) {
        Intrinsics.checkNotNullParameter(option, "<this>");
        String upperCase = StringsKt.m32183p1((String) CollectionsKt.m31706d0(m24114l(option))).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<Option> m24108f() {
        return (List) countryOptions.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Option m24109g(@Nullable String countryCode) {
        Option optionM24115m;
        if (countryCode == null || countryCode.length() != 2) {
            return DEFAULT_COUNTRY_OPTION;
        }
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        CountryCodeMetadata countryCodeMetadata = countryCodeToCountryMetadata.get(upperCase);
        return (countryCodeMetadata == null || (optionM24115m = m24115m(countryCodeMetadata)) == null) ? DEFAULT_COUNTRY_OPTION : optionM24115m;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m24110h(@NotNull Option option) {
        Intrinsics.checkNotNullParameter(option, "<this>");
        return StringsKt.m32183p1((String) CollectionsKt.m31717o0(m24114l(option))).toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m24111i(@NotNull Option option) {
        Intrinsics.checkNotNullParameter(option, "option");
        List listSplit$default = StringsKt.split$default(option.getText(), new String[]{" "}, false, 0, 6, null);
        String text = (String) CollectionsKt.m31708f0(listSplit$default, 0);
        if (text == null) {
            text = DEFAULT_COUNTRY_OPTION.getText();
        }
        String str = (String) CollectionsKt.m31718p0(listSplit$default);
        if (str == null) {
            str = "";
        } else {
            if (!C7797x.m32309T(str, "+", false, 2, null)) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        return StringsKt.m32183p1(text + " " + str).toString();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final CountryCodeMetadata m24112j() {
        return usCountryCodeMetadata;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final PhoneNumberInfo m24113k(@NotNull String inputNumber) {
        Object next;
        String countryCode;
        String country;
        Intrinsics.checkNotNullParameter(inputNumber, "inputNumber");
        String string = StringsKt.m32183p1(inputNumber).toString();
        if (!C7797x.m32309T(string, "+", false, 2, null)) {
            string = "+" + string;
        }
        String countryCode2 = usCountryCodeMetadata.getCountryCode();
        for (int i10 = 4; 1 < i10; i10--) {
            if (string.length() >= i10) {
                String strSubstring = string.substring(0, i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                List<CountryCodeMetadata> listM24105c = m24105c(strSubstring);
                if (!listM24105c.isEmpty()) {
                    if (listM24105c.size() != 1) {
                        Iterator<T> it = listM24105c.iterator();
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
                        countryCode2 = ((CountryCodeMetadata) CollectionsKt.m31706d0(listM24105c)).getCountryCode();
                        break;
                    }
                    countryCode2 = listM24105c.get(0).getCountryCode();
                    break;
                }
            }
        }
        CountryCodeMetadata countryCodeMetadata2 = countryCodeToCountryMetadata.get(countryCode2);
        String prefix = countryCodeMetadata2 != null ? countryCodeMetadata2.getPrefix() : null;
        return (prefix == null || prefix.length() == 0) ? new PhoneNumberInfo(countryCode2, StringsKt.m32183p1(C7776c0.m32212u1(string, 1)).toString()) : new PhoneNumberInfo(countryCode2, StringsKt.m32183p1(C7776c0.m32212u1(string, prefix.length())).toString());
    }

    /* JADX INFO: renamed from: l */
    public final List<String> m24114l(Option option) {
        return StringsKt.split$default(StringsKt.m32183p1(option.getValue()).toString(), new String[]{" "}, false, 0, 6, null);
    }

    /* JADX INFO: renamed from: m */
    public final Option m24115m(CountryCodeMetadata countryCodeMetadata) {
        String strM24101d = countryCodeMetadata.m24101d();
        String upperCase = countryCodeMetadata.getCountryCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new Option(strM24101d, upperCase + " " + countryCodeMetadata.getPrefix(), null, 4, null);
    }
}
