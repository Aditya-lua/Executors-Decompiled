package okhttp3.internal.http;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import xu.e;
import xu.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lxu/e;", "", "result", "", "readChallengeHeader", "(Lxu/e;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lxu/e;)Z", "", "prefix", "startsWith", "(Lxu/e;B)Z", "readQuotedString", "(Lxu/e;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", Payload.RESPONSE, "hasBody", "Lxu/h;", "QUOTED_STRING_DELIMITERS", "Lxu/h;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HttpHeaders {

    @NotNull
    private static final h QUOTED_STRING_DELIMITERS;

    @NotNull
    private static final h TOKEN_DELIMITERS;

    static {
        h.Companion companion = h.INSTANCE;
        QUOTED_STRING_DELIMITERS = companion.d("\"\\");
        TOKEN_DELIMITERS = companion.d("\t ,=");
    }

    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (x.E(headerName, headers.name(i10), true)) {
                try {
                    readChallengeHeader(new e().C0(headers.value(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.c(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && _UtilJvmKt.headersContentLength(response) == -1 && !x.E("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0073->B:47:0x00ba], SYNTHETIC] */
    private static final void readChallengeHeader(e eVar, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(eVar);
                    token2 = readToken(eVar);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(eVar);
                String token3 = readToken(eVar);
                if (token3 == null) {
                    if (eVar.Z1()) {
                        list.add(new Challenge(token2, (Map<String, String>) k0.j()));
                        return;
                    }
                    return;
                }
                int iSkipAll = _UtilCommonKt.skipAll(eVar, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(eVar);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || eVar.Z1())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = iSkipAll + _UtilCommonKt.skipAll(eVar, (byte) 61);
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(eVar, (byte) 34)) {
                                token = readQuotedString(eVar);
                            } else {
                                token = readToken(eVar);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(eVar)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(eVar);
                            if (!skipCommasAndWhitespace(eVar)) {
                                iSkipAll2 = _UtilCommonKt.skipAll(eVar, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(eVar)) {
                                    return;
                                }
                                if (startsWith(eVar, (byte) 34)) {
                                    token = readQuotedString(eVar);
                                } else {
                                    token = readToken(eVar);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(eVar) && !eVar.Z1()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, token3 + x.J("=", iSkipAll));
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(e eVar) throws EOFException {
        if (eVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e eVar2 = new e();
        while (true) {
            long jH0 = eVar.h0(QUOTED_STRING_DELIMITERS);
            if (jH0 == -1) {
                return null;
            }
            if (eVar.j(jH0) == 34) {
                eVar2.write(eVar, jH0);
                eVar.readByte();
                return eVar2.R2();
            }
            if (eVar.getSize() == jH0 + 1) {
                return null;
            }
            eVar2.write(eVar, jH0);
            eVar.readByte();
            eVar2.write(eVar, 1L);
        }
    }

    private static final String readToken(e eVar) {
        long jH0 = eVar.h0(TOKEN_DELIMITERS);
        if (jH0 == -1) {
            jH0 = eVar.getSize();
        }
        if (jH0 != 0) {
            return eVar.G1(jH0);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl url, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    private static final boolean skipCommasAndWhitespace(e eVar) throws EOFException {
        boolean z10 = false;
        while (!eVar.Z1()) {
            byte bJ = eVar.j(0L);
            if (bJ != 44) {
                if (bJ != 32 && bJ != 9) {
                    break;
                }
                eVar.readByte();
            } else {
                eVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean startsWith(e eVar, byte b) {
        return !eVar.Z1() && eVar.j(0L) == b;
    }
}
