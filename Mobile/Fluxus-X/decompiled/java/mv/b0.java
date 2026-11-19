package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.MatchGroup;
import p001kotlin.text.MatchResult;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0001\u001aB/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lmv/b0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "mediaType", Payload.TYPE, "subtype", BuildConfig.FLAVOR, "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", "defaultValue", "c", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "name", "f", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "a", "Ljava/lang/String;", "getMediaType$okhttp", "b", "i", "h", "d", "[Ljava/lang/String;", "e", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Regex f24456f = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Regex f24457g = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mediaType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String subtype;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] parameterNamesAndValues;

    /* JADX INFO: renamed from: mv.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmv/b0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lmv/b0;", "a", "(Ljava/lang/String;)Lmv/b0;", "b", "TOKEN", "Ljava/lang/String;", "QUOTED", "Lkotlin/text/Regex;", "TYPE_SUBTYPE", "Lkotlin/text/Regex;", "PARAMETER", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b0 a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            MatchResult matchResultD = b0.f24456f.d(str, 0);
            if (matchResultD == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
            }
            String str2 = matchResultD.b().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = matchResultD.b().get(2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int last = matchResultD.c().getLast();
            while (true) {
                int i10 = last + 1;
                if (i10 >= str.length()) {
                    return new b0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                MatchResult matchResultD2 = b0.f24457g.d(str, i10);
                if (matchResultD2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i10);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                MatchGroup matchGroup = matchResultD2.getGroups().get(1);
                String strA = matchGroup != null ? matchGroup.getValue() : null;
                if (strA == null) {
                    last = matchResultD2.c().getLast();
                } else {
                    MatchGroup matchGroup2 = matchResultD2.getGroups().get(2);
                    String strA2 = matchGroup2 != null ? matchGroup2.getValue() : null;
                    if (strA2 == null) {
                        MatchGroup matchGroup3 = matchResultD2.getGroups().get(3);
                        Intrinsics.checkNotNull(matchGroup3);
                        strA2 = matchGroup3.getValue();
                    } else if (StringsKt.T0(strA2, '\'', false, 2, null) && StringsKt.e0(strA2, '\'', false, 2, null) && strA2.length() > 2) {
                        strA2 = strA2.substring(1, strA2.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strA2, "substring(...)");
                    }
                    arrayList.add(strA);
                    arrayList.add(strA2);
                    last = matchResultD2.c().getLast();
                }
            }
        }

        @Nullable
        public final b0 b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public Companion() {
        }
    }

    public b0(@NotNull String mediaType, @NotNull String type, @NotNull String subtype, @NotNull String[] parameterNamesAndValues) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(parameterNamesAndValues, "parameterNamesAndValues");
        this.mediaType = mediaType;
        this.type = type;
        this.subtype = subtype;
        this.parameterNamesAndValues = parameterNamesAndValues;
    }

    public static /* synthetic */ Charset d(b0 b0Var, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return b0Var.c(charset);
    }

    @NotNull
    public static final b0 e(@NotNull String str) {
        return INSTANCE.a(str);
    }

    @Nullable
    public static final b0 g(@NotNull String str) {
        return INSTANCE.b(str);
    }

    @Nullable
    public final Charset c(@Nullable Charset defaultValue) {
        String strF = f("charset");
        if (strF == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(strF);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof b0) && Intrinsics.c(((b0) other).mediaType, this.mediaType);
    }

    @Nullable
    public final String f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int iC = iu.c.c(0, this.parameterNamesAndValues.length - 1, 2);
        if (iC < 0) {
            return null;
        }
        while (!p001kotlin.text.x.E(this.parameterNamesAndValues[i10], name, true)) {
            if (i10 == iC) {
                return null;
            }
            i10 += 2;
        }
        return this.parameterNamesAndValues[i10 + 1];
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getMediaType() {
        return this.mediaType;
    }
}
