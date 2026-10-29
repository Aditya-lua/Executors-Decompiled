package er;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: er.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Ler/d;", "", "", "prefix", "countryCode", "pattern", "defaultFlagEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "b", "a", "Ljava/lang/String;", "e", "getPattern", "getDefaultFlagEmoji", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryCodeMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String prefix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String pattern;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String defaultFlagEmoji;

    public CountryCodeMetadata(@NotNull String prefix, @NotNull String countryCode, @Nullable String str, @NotNull String defaultFlagEmoji) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(defaultFlagEmoji, "defaultFlagEmoji");
        this.prefix = prefix;
        this.countryCode = countryCode;
        this.pattern = str;
        this.defaultFlagEmoji = defaultFlagEmoji;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String b() {
        String displayCountry = new Locale("", this.countryCode).getDisplayCountry(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }

    public final String c() {
        if (this.countryCode.length() != 2) {
            return this.defaultFlagEmoji;
        }
        String str = this.countryCode;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int iCodePointAt = Character.codePointAt(upperCase, 0) - (-127397);
        int iCodePointAt2 = Character.codePointAt(upperCase, 1) - (-127397);
        char[] chars = Character.toChars(iCodePointAt);
        Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
        char[] chars2 = Character.toChars(iCodePointAt2);
        Intrinsics.checkNotNullExpressionValue(chars2, "toChars(...)");
        return new String(kotlin.collections.l.w(chars, chars2));
    }

    @NotNull
    public final String d() {
        return c() + " " + b() + " " + this.prefix;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryCodeMetadata)) {
            return false;
        }
        CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) other;
        return Intrinsics.c(this.prefix, countryCodeMetadata.prefix) && Intrinsics.c(this.countryCode, countryCodeMetadata.countryCode) && Intrinsics.c(this.pattern, countryCodeMetadata.pattern) && Intrinsics.c(this.defaultFlagEmoji, countryCodeMetadata.defaultFlagEmoji);
    }

    public int hashCode() {
        int iHashCode = ((this.prefix.hashCode() * 31) + this.countryCode.hashCode()) * 31;
        String str = this.pattern;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultFlagEmoji.hashCode();
    }

    @NotNull
    public String toString() {
        return "CountryCodeMetadata(prefix=" + this.prefix + ", countryCode=" + this.countryCode + ", pattern=" + this.pattern + ", defaultFlagEmoji=" + this.defaultFlagEmoji + ")";
    }

    public /* synthetic */ CountryCodeMetadata(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? "🌐" : str4);
    }
}
