package nv;

import com.github.luben.zstd.BuildConfig;
import mv.y;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0018\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmv/d;", BuildConfig.FLAVOR, "h", "(Lmv/d;)Ljava/lang/String;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "(J)I", "Lmv/d$b;", "d", "(Lmv/d$b;)Lmv/d;", "c", "Lmv/d$a;", "a", "(Lmv/d$a;)Lmv/d;", "e", "(Lmv/d$a;)Lmv/d$a;", "f", "Lmv/y;", "headers", "g", "(Lmv/d$b;Lmv/y;)Lmv/d;", "characters", "startIndex", "i", "(Ljava/lang/String;Ljava/lang/String;I)I", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    @NotNull
    public static final mv.d a(@NotNull mv.d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new mv.d(aVar.getNoCache(), aVar.getNoStore(), aVar.getMaxAgeSeconds(), -1, false, false, false, aVar.getMaxStaleSeconds(), aVar.getMinFreshSeconds(), aVar.getOnlyIfCached(), aVar.getNoTransform(), aVar.getImmutable(), null);
    }

    public static final int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @NotNull
    public static final mv.d c(@NotNull mv.d.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        mv.d.a aVarL = new mv.d.a().l();
        p001kotlin.time.a.Companion companion2 = p001kotlin.time.a.INSTANCE;
        return aVarL.j(p001kotlin.time.b.p(Integer.MAX_VALUE, zu.b.SECONDS)).a();
    }

    @NotNull
    public static final mv.d d(@NotNull mv.d.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new mv.d.a().k().a();
    }

    @NotNull
    public static final mv.d.a e(@NotNull mv.d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.m(true);
        return aVar;
    }

    @NotNull
    public static final mv.d.a f(@NotNull mv.d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.n(true);
        return aVar;
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
    public static final mv.d g(@NotNull mv.d.Companion companion, @NotNull y yVar) {
        int i10;
        int i11;
        boolean z10;
        String string;
        int i12;
        String str;
        String string2;
        y headers = yVar;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        boolean z11 = true;
        boolean z12 = true;
        int i13 = 0;
        String str2 = null;
        boolean z13 = false;
        boolean z14 = false;
        int iD = -1;
        int iD2 = -1;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int iD3 = -1;
        int iD4 = -1;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        while (i13 < size) {
            String strC = headers.c(i13);
            String strG = headers.g(i13);
            if (x.E(strC, "Cache-Control", z11)) {
                if (str2 == null) {
                    str2 = strG;
                }
                i10 = 0;
                while (i10 < strG.length()) {
                    i11 = i(strG, "=,;", i10);
                    String strSubstring = strG.substring(i10, i11);
                    z10 = z11;
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    string = StringsKt.n1(strSubstring).toString();
                    if (i11 != strG.length()) {
                        i12 = size;
                        if (strG.charAt(i11) == ',' && strG.charAt(i11) != ';') {
                            int iU = n.u(strG, i11 + 1);
                            if (iU >= strG.length() || strG.charAt(iU) != '\"') {
                                str = strG;
                                i10 = i(str, ",;", iU);
                                String strSubstring2 = str.substring(iU, i10);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                string2 = StringsKt.n1(strSubstring2).toString();
                            } else {
                                int i14 = iU + 1;
                                String str3 = strG;
                                int iM0 = StringsKt.m0(str3, '\"', i14, false, 4, null);
                                str = str3;
                                String strSubstring3 = str.substring(i14, iM0);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                i10 = iM0 + 1;
                                string2 = strSubstring3;
                            }
                        }
                        if (x.E("no-cache", string, z10)) {
                            z11 = z10;
                            z13 = z11;
                        } else if (x.E("no-store", string, z10)) {
                            z11 = z10;
                            z14 = z11;
                        } else {
                            if (x.E("max-age", string, z10)) {
                                iD = n.D(string2, -1);
                            } else if (x.E("s-maxage", string, z10)) {
                                iD2 = n.D(string2, -1);
                            } else if (x.E("private", string, z10)) {
                                z11 = z10;
                                z15 = z11;
                            } else if (x.E("public", string, z10)) {
                                z11 = z10;
                                z16 = z11;
                            } else if (x.E("must-revalidate", string, z10)) {
                                z11 = z10;
                                z17 = z11;
                            } else if (x.E("max-stale", string, z10)) {
                                iD3 = n.D(string2, Integer.MAX_VALUE);
                            } else if (x.E("min-fresh", string, z10)) {
                                iD4 = n.D(string2, -1);
                            } else if (x.E("only-if-cached", string, z10)) {
                                z11 = z10;
                                z18 = z11;
                            } else if (x.E("no-transform", string, z10)) {
                                z11 = z10;
                                z19 = z11;
                            } else if (x.E("immutable", string, z10)) {
                                z11 = z10;
                                z20 = z11;
                            }
                            z11 = z10;
                        }
                        strG = str;
                        size = i12;
                    } else {
                        i12 = size;
                    }
                    str = strG;
                    i10 = i11 + 1;
                    string2 = null;
                    if (x.E("no-cache", string, z10)) {
                        z11 = z10;
                        z13 = z11;
                    } else if (x.E("no-store", string, z10)) {
                        z11 = z10;
                        z14 = z11;
                    } else {
                        if (x.E("max-age", string, z10)) {
                            iD = n.D(string2, -1);
                        } else if (x.E("s-maxage", string, z10)) {
                            iD2 = n.D(string2, -1);
                        } else if (x.E("private", string, z10)) {
                            z11 = z10;
                            z15 = z11;
                        } else if (x.E("public", string, z10)) {
                            z11 = z10;
                            z16 = z11;
                        } else if (x.E("must-revalidate", string, z10)) {
                            z11 = z10;
                            z17 = z11;
                        } else if (x.E("max-stale", string, z10)) {
                            iD3 = n.D(string2, Integer.MAX_VALUE);
                        } else if (x.E("min-fresh", string, z10)) {
                            iD4 = n.D(string2, -1);
                        } else if (x.E("only-if-cached", string, z10)) {
                            z11 = z10;
                            z18 = z11;
                        } else if (x.E("no-transform", string, z10)) {
                            z11 = z10;
                            z19 = z11;
                        } else if (x.E("immutable", string, z10)) {
                            z11 = z10;
                            z20 = z11;
                        }
                        z11 = z10;
                    }
                    strG = str;
                    size = i12;
                }
                i13++;
                headers = yVar;
                z11 = z11;
                size = size;
            } else {
                if (x.E(strC, "Pragma", z11)) {
                }
                i13++;
                headers = yVar;
                z11 = z11;
                size = size;
            }
            z12 = false;
            i10 = 0;
            while (i10 < strG.length()) {
                i11 = i(strG, "=,;", i10);
                String strSubstring4 = strG.substring(i10, i11);
                z10 = z11;
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                string = StringsKt.n1(strSubstring4).toString();
                if (i11 != strG.length()) {
                    i12 = size;
                    if (strG.charAt(i11) == ',') {
                    }
                    if (x.E("no-cache", string, z10)) {
                        z11 = z10;
                        z13 = z11;
                    } else if (x.E("no-store", string, z10)) {
                        z11 = z10;
                        z14 = z11;
                    } else {
                        if (x.E("max-age", string, z10)) {
                            iD = n.D(string2, -1);
                        } else if (x.E("s-maxage", string, z10)) {
                            iD2 = n.D(string2, -1);
                        } else if (x.E("private", string, z10)) {
                            z11 = z10;
                            z15 = z11;
                        } else if (x.E("public", string, z10)) {
                            z11 = z10;
                            z16 = z11;
                        } else if (x.E("must-revalidate", string, z10)) {
                            z11 = z10;
                            z17 = z11;
                        } else if (x.E("max-stale", string, z10)) {
                            iD3 = n.D(string2, Integer.MAX_VALUE);
                        } else if (x.E("min-fresh", string, z10)) {
                            iD4 = n.D(string2, -1);
                        } else if (x.E("only-if-cached", string, z10)) {
                            z11 = z10;
                            z18 = z11;
                        } else if (x.E("no-transform", string, z10)) {
                            z11 = z10;
                            z19 = z11;
                        } else if (x.E("immutable", string, z10)) {
                            z11 = z10;
                            z20 = z11;
                        }
                        z11 = z10;
                    }
                    strG = str;
                    size = i12;
                } else {
                    i12 = size;
                }
                str = strG;
                i10 = i11 + 1;
                string2 = null;
                if (x.E("no-cache", string, z10)) {
                    z11 = z10;
                    z13 = z11;
                } else if (x.E("no-store", string, z10)) {
                    z11 = z10;
                    z14 = z11;
                } else {
                    if (x.E("max-age", string, z10)) {
                        iD = n.D(string2, -1);
                    } else if (x.E("s-maxage", string, z10)) {
                        iD2 = n.D(string2, -1);
                    } else if (x.E("private", string, z10)) {
                        z11 = z10;
                        z15 = z11;
                    } else if (x.E("public", string, z10)) {
                        z11 = z10;
                        z16 = z11;
                    } else if (x.E("must-revalidate", string, z10)) {
                        z11 = z10;
                        z17 = z11;
                    } else if (x.E("max-stale", string, z10)) {
                        iD3 = n.D(string2, Integer.MAX_VALUE);
                    } else if (x.E("min-fresh", string, z10)) {
                        iD4 = n.D(string2, -1);
                    } else if (x.E("only-if-cached", string, z10)) {
                        z11 = z10;
                        z18 = z11;
                    } else if (x.E("no-transform", string, z10)) {
                        z11 = z10;
                        z19 = z11;
                    } else if (x.E("immutable", string, z10)) {
                        z11 = z10;
                        z20 = z11;
                    }
                    z11 = z10;
                }
                strG = str;
                size = i12;
            }
            i13++;
            headers = yVar;
            z11 = z11;
            size = size;
        }
        return new mv.d(z13, z14, iD, iD2, z15, z16, z17, iD3, iD4, z18, z19, z20, !z12 ? null : str2);
    }

    @NotNull
    public static final String h(@NotNull mv.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String headerValue = dVar.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        StringBuilder sb2 = new StringBuilder();
        if (dVar.getNoCache()) {
            sb2.append("no-cache, ");
        }
        if (dVar.getNoStore()) {
            sb2.append("no-store, ");
        }
        if (dVar.getMaxAgeSeconds() != -1) {
            sb2.append("max-age=");
            sb2.append(dVar.getMaxAgeSeconds());
            sb2.append(", ");
        }
        if (dVar.getSMaxAgeSeconds() != -1) {
            sb2.append("s-maxage=");
            sb2.append(dVar.getSMaxAgeSeconds());
            sb2.append(", ");
        }
        if (dVar.getIsPrivate()) {
            sb2.append("private, ");
        }
        if (dVar.getIsPublic()) {
            sb2.append("public, ");
        }
        if (dVar.getMustRevalidate()) {
            sb2.append("must-revalidate, ");
        }
        if (dVar.getMaxStaleSeconds() != -1) {
            sb2.append("max-stale=");
            sb2.append(dVar.getMaxStaleSeconds());
            sb2.append(", ");
        }
        if (dVar.getMinFreshSeconds() != -1) {
            sb2.append("min-fresh=");
            sb2.append(dVar.getMinFreshSeconds());
            sb2.append(", ");
        }
        if (dVar.getOnlyIfCached()) {
            sb2.append("only-if-cached, ");
        }
        if (dVar.getNoTransform()) {
            sb2.append("no-transform, ");
        }
        if (dVar.getImmutable()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        Intrinsics.checkNotNullExpressionValue(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        dVar.n(string);
        return string;
    }

    public static final int i(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (StringsKt.Z(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
