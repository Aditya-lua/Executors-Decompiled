package okhttp3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import okhttp3.CacheControl;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import p230ju.EnumC7361b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\f\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000e\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\n*\u00020\nH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0002¨\u0006\u0016"}, m31665d2 = {"commonToString", "", "Lokhttp3/CacheControl;", "commonClampToInt", "", "", "commonForceNetwork", "Lokhttp3/CacheControl$Companion;", "commonForceCache", "commonBuild", "Lokhttp3/CacheControl$Builder;", "commonNoCache", "commonNoStore", "commonOnlyIfCached", "commonNoTransform", "commonImmutable", "commonParse", "headers", "Lokhttp3/Headers;", "indexOfElement", "characters", "startIndex", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class _CacheControlCommonKt {
    @NotNull
    public static final CacheControl commonBuild(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return new CacheControl(builder.getNoCache(), builder.getNoStore(), builder.getMaxAgeSeconds(), -1, false, false, false, builder.getMaxStaleSeconds(), builder.getMinFreshSeconds(), builder.getOnlyIfCached(), builder.getNoTransform(), builder.getImmutable(), null);
    }

    public static final int commonClampToInt(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @NotNull
    public static final CacheControl commonForceCache(@NotNull CacheControl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        CacheControl.Builder builderOnlyIfCached = new CacheControl.Builder().onlyIfCached();
        C7800a.Companion companion2 = C7800a.INSTANCE;
        return builderOnlyIfCached.m50830maxStaleLRDsOJo(C7801b.m32371p(Integer.MAX_VALUE, EnumC7361b.SECONDS)).build();
    }

    @NotNull
    public static final CacheControl commonForceNetwork(@NotNull CacheControl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new CacheControl.Builder().noCache().build();
    }

    @NotNull
    public static final CacheControl.Builder commonImmutable(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setImmutable$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonNoCache(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setNoCache$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonNoStore(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setNoStore$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonNoTransform(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonOnlyIfCached(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    @NotNull
    public static final CacheControl commonParse(@NotNull CacheControl.Companion companion, @NotNull Headers headers) {
        int iIndexOfElement;
        int iIndexOfElement2;
        boolean z10;
        String string;
        int i10;
        String str;
        String string2;
        Headers headers2 = headers;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(headers2, "headers");
        int size = headers2.size();
        boolean z11 = true;
        boolean z12 = true;
        int i11 = 0;
        String str2 = null;
        boolean z13 = false;
        boolean z14 = false;
        int nonNegativeInt = -1;
        int nonNegativeInt2 = -1;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int nonNegativeInt3 = -1;
        int nonNegativeInt4 = -1;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        while (i11 < size) {
            String strName = headers2.name(i11);
            String strValue = headers2.value(i11);
            if (C7797x.m32294E(strName, "Cache-Control", z11)) {
                if (str2 == null) {
                    str2 = strValue;
                }
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    z10 = z11;
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    string = StringsKt.m32183p1(strSubstring).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        i10 = size;
                        if (strValue.charAt(iIndexOfElement2) == ',' && strValue.charAt(iIndexOfElement2) != ';') {
                            int iIndexOfNonWhitespace = _UtilCommonKt.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                            if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                str = strValue;
                                iIndexOfElement = indexOfElement(str, ",;", iIndexOfNonWhitespace);
                                String strSubstring2 = str.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                string2 = StringsKt.m32183p1(strSubstring2).toString();
                            } else {
                                int i12 = iIndexOfNonWhitespace + 1;
                                String str3 = strValue;
                                int iM0 = StringsKt.m32176m0(str3, '\"', i12, false, 4, null);
                                str = str3;
                                String strSubstring3 = str.substring(i12, iM0);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                iIndexOfElement = iM0 + 1;
                                string2 = strSubstring3;
                            }
                        }
                        if (C7797x.m32294E("no-cache", string, z10)) {
                            z11 = z10;
                            z13 = z11;
                        } else if (C7797x.m32294E("no-store", string, z10)) {
                            z11 = z10;
                            z14 = z11;
                        } else {
                            if (C7797x.m32294E("max-age", string, z10)) {
                                nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                            } else if (C7797x.m32294E("s-maxage", string, z10)) {
                                nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                            } else if (C7797x.m32294E("private", string, z10)) {
                                z11 = z10;
                                z15 = z11;
                            } else if (C7797x.m32294E("public", string, z10)) {
                                z11 = z10;
                                z16 = z11;
                            } else if (C7797x.m32294E("must-revalidate", string, z10)) {
                                z11 = z10;
                                z17 = z11;
                            } else if (C7797x.m32294E("max-stale", string, z10)) {
                                nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (C7797x.m32294E("min-fresh", string, z10)) {
                                nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                            } else if (C7797x.m32294E("only-if-cached", string, z10)) {
                                z11 = z10;
                                z18 = z11;
                            } else if (C7797x.m32294E("no-transform", string, z10)) {
                                z11 = z10;
                                z19 = z11;
                            } else if (C7797x.m32294E("immutable", string, z10)) {
                                z11 = z10;
                                z20 = z11;
                            }
                            z11 = z10;
                        }
                        strValue = str;
                        size = i10;
                    } else {
                        i10 = size;
                    }
                    str = strValue;
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                    if (C7797x.m32294E("no-cache", string, z10)) {
                        z11 = z10;
                        z13 = z11;
                    } else if (C7797x.m32294E("no-store", string, z10)) {
                        z11 = z10;
                        z14 = z11;
                    } else {
                        if (C7797x.m32294E("max-age", string, z10)) {
                            nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if (C7797x.m32294E("s-maxage", string, z10)) {
                            nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if (C7797x.m32294E("private", string, z10)) {
                            z11 = z10;
                            z15 = z11;
                        } else if (C7797x.m32294E("public", string, z10)) {
                            z11 = z10;
                            z16 = z11;
                        } else if (C7797x.m32294E("must-revalidate", string, z10)) {
                            z11 = z10;
                            z17 = z11;
                        } else if (C7797x.m32294E("max-stale", string, z10)) {
                            nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (C7797x.m32294E("min-fresh", string, z10)) {
                            nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if (C7797x.m32294E("only-if-cached", string, z10)) {
                            z11 = z10;
                            z18 = z11;
                        } else if (C7797x.m32294E("no-transform", string, z10)) {
                            z11 = z10;
                            z19 = z11;
                        } else if (C7797x.m32294E("immutable", string, z10)) {
                            z11 = z10;
                            z20 = z11;
                        }
                        z11 = z10;
                    }
                    strValue = str;
                    size = i10;
                }
                i11++;
                headers2 = headers;
                z11 = z11;
                size = size;
            } else {
                if (C7797x.m32294E(strName, "Pragma", z11)) {
                }
                i11++;
                headers2 = headers;
                z11 = z11;
                size = size;
            }
            z12 = false;
            iIndexOfElement = 0;
            while (iIndexOfElement < strValue.length()) {
                iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                String strSubstring4 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                z10 = z11;
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                string = StringsKt.m32183p1(strSubstring4).toString();
                if (iIndexOfElement2 != strValue.length()) {
                    i10 = size;
                    if (strValue.charAt(iIndexOfElement2) == ',') {
                    }
                    if (C7797x.m32294E("no-cache", string, z10)) {
                        z11 = z10;
                        z13 = z11;
                    } else if (C7797x.m32294E("no-store", string, z10)) {
                        z11 = z10;
                        z14 = z11;
                    } else {
                        if (C7797x.m32294E("max-age", string, z10)) {
                            nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if (C7797x.m32294E("s-maxage", string, z10)) {
                            nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if (C7797x.m32294E("private", string, z10)) {
                            z11 = z10;
                            z15 = z11;
                        } else if (C7797x.m32294E("public", string, z10)) {
                            z11 = z10;
                            z16 = z11;
                        } else if (C7797x.m32294E("must-revalidate", string, z10)) {
                            z11 = z10;
                            z17 = z11;
                        } else if (C7797x.m32294E("max-stale", string, z10)) {
                            nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (C7797x.m32294E("min-fresh", string, z10)) {
                            nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if (C7797x.m32294E("only-if-cached", string, z10)) {
                            z11 = z10;
                            z18 = z11;
                        } else if (C7797x.m32294E("no-transform", string, z10)) {
                            z11 = z10;
                            z19 = z11;
                        } else if (C7797x.m32294E("immutable", string, z10)) {
                            z11 = z10;
                            z20 = z11;
                        }
                        z11 = z10;
                    }
                    strValue = str;
                    size = i10;
                } else {
                    i10 = size;
                }
                str = strValue;
                iIndexOfElement = iIndexOfElement2 + 1;
                string2 = null;
                if (C7797x.m32294E("no-cache", string, z10)) {
                    z11 = z10;
                    z13 = z11;
                } else if (C7797x.m32294E("no-store", string, z10)) {
                    z11 = z10;
                    z14 = z11;
                } else {
                    if (C7797x.m32294E("max-age", string, z10)) {
                        nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if (C7797x.m32294E("s-maxage", string, z10)) {
                        nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if (C7797x.m32294E("private", string, z10)) {
                        z11 = z10;
                        z15 = z11;
                    } else if (C7797x.m32294E("public", string, z10)) {
                        z11 = z10;
                        z16 = z11;
                    } else if (C7797x.m32294E("must-revalidate", string, z10)) {
                        z11 = z10;
                        z17 = z11;
                    } else if (C7797x.m32294E("max-stale", string, z10)) {
                        nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Integer.MAX_VALUE);
                    } else if (C7797x.m32294E("min-fresh", string, z10)) {
                        nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if (C7797x.m32294E("only-if-cached", string, z10)) {
                        z11 = z10;
                        z18 = z11;
                    } else if (C7797x.m32294E("no-transform", string, z10)) {
                        z11 = z10;
                        z19 = z11;
                    } else if (C7797x.m32294E("immutable", string, z10)) {
                        z11 = z10;
                        z20 = z11;
                    }
                    z11 = z10;
                }
                strValue = str;
                size = i10;
            }
            i11++;
            headers2 = headers;
            z11 = z11;
            size = size;
        }
        return new CacheControl(z13, z14, nonNegativeInt, nonNegativeInt2, z15, z16, z17, nonNegativeInt3, nonNegativeInt4, z18, z19, z20, !z12 ? null : str2);
    }

    @NotNull
    public static final String commonToString(@NotNull CacheControl cacheControl) {
        Intrinsics.checkNotNullParameter(cacheControl, "<this>");
        String headerValue = cacheControl.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        StringBuilder sb2 = new StringBuilder();
        if (cacheControl.noCache()) {
            sb2.append("no-cache, ");
        }
        if (cacheControl.noStore()) {
            sb2.append("no-store, ");
        }
        if (cacheControl.maxAgeSeconds() != -1) {
            sb2.append("max-age=");
            sb2.append(cacheControl.maxAgeSeconds());
            sb2.append(", ");
        }
        if (cacheControl.sMaxAgeSeconds() != -1) {
            sb2.append("s-maxage=");
            sb2.append(cacheControl.sMaxAgeSeconds());
            sb2.append(", ");
        }
        if (cacheControl.getIsPrivate()) {
            sb2.append("private, ");
        }
        if (cacheControl.getIsPublic()) {
            sb2.append("public, ");
        }
        if (cacheControl.mustRevalidate()) {
            sb2.append("must-revalidate, ");
        }
        if (cacheControl.maxStaleSeconds() != -1) {
            sb2.append("max-stale=");
            sb2.append(cacheControl.maxStaleSeconds());
            sb2.append(", ");
        }
        if (cacheControl.minFreshSeconds() != -1) {
            sb2.append("min-fresh=");
            sb2.append(cacheControl.minFreshSeconds());
            sb2.append(", ");
        }
        if (cacheControl.onlyIfCached()) {
            sb2.append("only-if-cached, ");
        }
        if (cacheControl.noTransform()) {
            sb2.append("no-transform, ");
        }
        if (cacheControl.immutable()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        cacheControl.setHeaderValue$okhttp(string);
        return string;
    }

    private static final int indexOfElement(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (StringsKt.m32150Z(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfElement$default(String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return indexOfElement(str, str2, i10);
    }
}
