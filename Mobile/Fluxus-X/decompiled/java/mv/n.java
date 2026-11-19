package mv;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 *2\u00020\u0001:\u0001\u001cB[\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0006\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u0007\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\b\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\n\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b\u000b\u0010'R\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\f\u0010'R\u0017\u0010\r\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b\r\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b\u000e\u0010\u0018¨\u0006+"}, d2 = {"Lmv/n;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", "value", BuildConfig.FLAVOR, "expiresAt", "domain", "path", BuildConfig.FLAVOR, "secure", "httpOnly", "persistent", "hostOnly", "sameSite", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "forObsoleteRfc2965", "g", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "h", "c", "J", "()J", "d", "f", "Z", "()Z", "i", "j", "k", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f24753l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f24754m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f24755n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f24756o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long expiresAt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String domain;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean secure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean httpOnly;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean persistent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean hostOnly;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String sameSite;

    /* JADX INFO: renamed from: mv.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001c\u0010,\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001c\u0010-\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u0006."}, d2 = {"Lmv/n$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/z;", "url", BuildConfig.FLAVOR, "setCookie", "Lmv/n;", "c", "(Lmv/z;Ljava/lang/String;)Lmv/n;", BuildConfig.FLAVOR, "currentTimeMillis", "d", "(JLmv/z;Ljava/lang/String;)Lmv/n;", "Lmv/y;", "headers", BuildConfig.FLAVOR, "e", "(Lmv/z;Lmv/y;)Ljava/util/List;", "urlHost", "domain", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "s", BuildConfig.FLAVOR, "pos", "limit", "g", "(Ljava/lang/String;II)J", "input", "invert", "a", "(Ljava/lang/String;IIZ)I", "h", "(Ljava/lang/String;)J", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        public final boolean b(String urlHost, String domain) {
            if (Intrinsics.c(urlHost, domain)) {
                return true;
            }
            return p001kotlin.text.x.D(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !nv.l.a(urlHost);
        }

        @Nullable
        public final n c(@NotNull z url, @NotNull String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        @Nullable
        public final n d(long currentTimeMillis, @NotNull z url, @NotNull String setCookie) {
            long j10;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iL = nv.n.l(setCookie, ';', 0, 0, 6, null);
            int iL2 = nv.n.l(setCookie, '=', 0, iL, 2, null);
            n nVar = null;
            if (iL2 == iL) {
                return null;
            }
            String strF = nv.n.F(setCookie, 0, iL2, 1, null);
            if (strF.length() == 0 || nv.n.p(strF) != -1) {
                return null;
            }
            String strE = nv.n.E(setCookie, iL2 + 1, iL);
            if (nv.n.p(strE) != -1) {
                return null;
            }
            int i10 = iL + 1;
            int length = setCookie.length();
            String strF2 = null;
            String str = null;
            String str2 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iJ = nv.n.j(setCookie, ';', i10, length);
                int iJ2 = nv.n.j(setCookie, '=', i10, iJ);
                String strE2 = nv.n.E(setCookie, i10, iJ2);
                String strE3 = iJ2 < iJ ? nv.n.E(setCookie, iJ2 + 1, iJ) : BuildConfig.FLAVOR;
                n nVar2 = nVar;
                if (p001kotlin.text.x.E(strE2, "expires", true)) {
                    try {
                        jG = g(strE3, 0, strE3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (p001kotlin.text.x.E(strE2, "max-age", true)) {
                    jH = h(strE3);
                    z11 = true;
                } else if (p001kotlin.text.x.E(strE2, "domain", true)) {
                    strF2 = f(strE3);
                    z13 = false;
                } else if (p001kotlin.text.x.E(strE2, "path", true)) {
                    str = strE3;
                } else if (p001kotlin.text.x.E(strE2, "secure", true)) {
                    z12 = true;
                } else if (p001kotlin.text.x.E(strE2, "httponly", true)) {
                    z10 = true;
                } else if (p001kotlin.text.x.E(strE2, "samesite", true)) {
                    str2 = strE3;
                }
                i10 = iJ + 1;
                nVar = nVar2;
            }
            n nVar3 = nVar;
            if (jH == Long.MIN_VALUE) {
                j10 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j11 = currentTimeMillis + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j10 = (j11 < currentTimeMillis || j11 > 253402300799999L) ? 253402300799999L : j11;
            } else {
                j10 = jG;
            }
            String host = url.getHost();
            if (strF2 == null) {
                strF2 = host;
            } else if (!b(host, strF2)) {
                return nVar3;
            }
            if (host.length() != strF2.length() && aw.c.INSTANCE.c().c(strF2) == null) {
                return nVar3;
            }
            String strSubstring = "/";
            if (str == null || !p001kotlin.text.x.T(str, "/", false, 2, nVar3)) {
                String strC = url.c();
                int iS0 = StringsKt.s0(strC, '/', 0, false, 6, null);
                if (iS0 != 0) {
                    strSubstring = strC.substring(0, iS0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
                str = strSubstring;
            }
            return new n(strF, strE, j10, strF2, str, z12, z10, z11, z13, str2, null);
        }

        @NotNull
        public final List<n> e(@NotNull z url, @NotNull y headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> listH = headers.h("Set-Cookie");
            int size = listH.size();
            List<n> listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                n nVarC = c(url, listH.get(i10));
                if (nVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(nVarC);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? p001kotlin.collections.p.k() : listUnmodifiableList;
        }

        public final String f(String s8) {
            if (p001kotlin.text.x.D(s8, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strK = nv.l.k(StringsKt.G0(s8, "."));
            if (strK != null) {
                return strK;
            }
            throw new IllegalArgumentException();
        }

        public final long g(String s8, int pos, int limit) {
            int iA = a(s8, pos, limit, false);
            Matcher matcher = n.f24756o.matcher(s8);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int iN0 = -1;
            int i13 = -1;
            int i14 = -1;
            while (iA < limit) {
                int iA2 = a(s8, iA + 1, limit, true);
                matcher.region(iA, iA2);
                if (i11 == -1 && matcher.usePattern(n.f24756o).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
                    i11 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
                    i13 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "group(...)");
                    i14 = Integer.parseInt(strGroup3);
                } else if (i12 == -1 && matcher.usePattern(n.f24755n).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "group(...)");
                    i12 = Integer.parseInt(strGroup4);
                } else if (iN0 == -1 && matcher.usePattern(n.f24754m).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "group(...)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String strPattern = n.f24754m.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
                    iN0 = StringsKt.n0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i10 == -1 && matcher.usePattern(n.f24753l).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "group(...)");
                    i10 = Integer.parseInt(strGroup6);
                }
                iA = a(s8, iA2 + 1, limit, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iN0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i12 || i12 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(nv.q.f26639a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i10);
            gregorianCalendar.set(2, iN0 - 1);
            gregorianCalendar.set(5, i12);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i13);
            gregorianCalendar.set(13, i14);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final long h(String s8) {
            try {
                long j10 = Long.parseLong(s8);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").f(s8)) {
                    return p001kotlin.text.x.T(s8, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }

    @Nullable
    public static final n f(@NotNull z zVar, @NotNull String str) {
        return INSTANCE.c(zVar, str);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return Intrinsics.c(nVar.name, this.name) && Intrinsics.c(nVar.value, this.value) && nVar.expiresAt == this.expiresAt && Intrinsics.c(nVar.domain, this.domain) && Intrinsics.c(nVar.path, this.path) && nVar.secure == this.secure && nVar.httpOnly == this.httpOnly && nVar.persistent == this.persistent && nVar.hostOnly == this.hostOnly && Intrinsics.c(nVar.sameSite, this.sameSite);
    }

    @NotNull
    public final String g(boolean forObsoleteRfc2965) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(sv.c.b(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (forObsoleteRfc2965) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        if (this.sameSite != null) {
            sb2.append("; samesite=");
            sb2.append(this.sameSite);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly)) * 31;
        String str = this.sameSite;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return g(false);
    }

    public n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j10;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
        this.sameSite = str5;
    }
}
