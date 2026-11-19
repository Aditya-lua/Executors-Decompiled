package sv;

import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mv.h0;
import mv.o;
import mv.y;
import mv.z;
import nv.n;
import nv.q;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.k0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006$"}, d2 = {"Lmv/y;", BuildConfig.FLAVOR, "headerName", BuildConfig.FLAVOR, "Lmv/i;", "a", "(Lmv/y;Ljava/lang/String;)Ljava/util/List;", "Lew/e;", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "c", "(Lew/e;Ljava/util/List;)V", BuildConfig.FLAVOR, "g", "(Lew/e;)Z", BuildConfig.FLAVOR, "prefix", "h", "(Lew/e;B)Z", "d", "(Lew/e;)Ljava/lang/String;", "e", "Lmv/o;", "Lmv/z;", "url", "headers", "f", "(Lmv/o;Lmv/z;Lmv/y;)V", "Lmv/h0;", "b", "(Lmv/h0;)Z", "Lew/h;", "Lew/h;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ew.h f31915a;

    @NotNull
    public static final ew.h b;

    static {
        ew.h.Companion companion = ew.h.INSTANCE;
        f31915a = companion.d("\"\\");
        b = companion.d("\t ,=");
    }

    @NotNull
    public static final List<mv.i> a(@NotNull y yVar, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = yVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (x.E(headerName, yVar.c(i10), true)) {
                try {
                    c(new ew.e().D0(yVar.g(i10)), arrayList);
                } catch (EOFException e10) {
                    okhttp3.internal.platform.c.INSTANCE.e().m("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(@NotNull h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        if (Intrinsics.c(h0Var.getRequest().getMethod(), "HEAD")) {
            return false;
        }
        int code = h0Var.getCode();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && q.k(h0Var) == -1 && !x.E("chunked", h0.n(h0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0073->B:47:0x00ba], SYNTHETIC] */
    public static final void c(ew.e eVar, List<mv.i> list) throws EOFException {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(eVar);
                    strE2 = e(eVar);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(eVar);
                String strE3 = e(eVar);
                if (strE3 == null) {
                    if (eVar.c2()) {
                        list.add(new mv.i(strE2, k0.j()));
                        return;
                    }
                    return;
                }
                int iB = n.B(eVar, (byte) 61);
                boolean zG2 = g(eVar);
                if (zG || !(zG2 || eVar.c2())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iB2 = iB + n.B(eVar, (byte) 61);
                    while (true) {
                        if (strE3 != null) {
                            if (iB2 != 0) {
                                break;
                                break;
                            }
                            if (iB2 <= 1) {
                                return;
                            }
                            if (h(eVar, (byte) 34)) {
                                strE = d(eVar);
                            } else {
                                strE = e(eVar);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(eVar)) {
                            }
                            strE3 = null;
                        } else {
                            strE3 = e(eVar);
                            if (!g(eVar)) {
                                iB2 = n.B(eVar, (byte) 61);
                                if (iB2 != 0) {
                                    break;
                                }
                                if (iB2 <= 1 || g(eVar)) {
                                    return;
                                }
                                if (h(eVar, (byte) 34)) {
                                    strE = d(eVar);
                                } else {
                                    strE = e(eVar);
                                }
                                if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                                    return;
                                }
                                if (g(eVar) && !eVar.c2()) {
                                    return;
                                } else {
                                    strE3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new mv.i(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strE3 + x.J("=", iB));
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
                    list.add(new mv.i(strE2, mapSingletonMap));
                }
            }
        }
    }

    public static final String d(ew.e eVar) throws EOFException {
        if (eVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ew.e eVar2 = new ew.e();
        while (true) {
            long jB2 = eVar.B2(f31915a);
            if (jB2 == -1) {
                return null;
            }
            if (eVar.o(jB2) == 34) {
                eVar2.R2(eVar, jB2);
                eVar.readByte();
                return eVar2.V2();
            }
            if (eVar.getSize() == jB2 + 1) {
                return null;
            }
            eVar2.R2(eVar, jB2);
            eVar.readByte();
            eVar2.R2(eVar, 1L);
        }
    }

    public static final String e(ew.e eVar) {
        long jB2 = eVar.B2(b);
        if (jB2 == -1) {
            jB2 = eVar.getSize();
        }
        if (jB2 != 0) {
            return eVar.G1(jB2);
        }
        return null;
    }

    public static final void f(@NotNull o oVar, @NotNull z url, @NotNull y headers) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (oVar == o.b) {
            return;
        }
        List<mv.n> listE = mv.n.INSTANCE.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        oVar.a(url, listE);
    }

    public static final boolean g(ew.e eVar) throws EOFException {
        boolean z10 = false;
        while (!eVar.c2()) {
            byte bO = eVar.o(0L);
            if (bO != 44) {
                if (bO != 32 && bO != 9) {
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

    public static final boolean h(ew.e eVar, byte b10) {
        return !eVar.c2() && eVar.o(0L) == b10;
    }
}
