package wu;

import backtraceio.library.services.BacktraceMetrics;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.y;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.x;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vu.b0;
import vu.h0;
import vu.u0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lvu/h0;", "zipPath", "Lvu/l;", "fileSystem", "Lkotlin/Function1;", "Lwu/o;", "", "predicate", "Lvu/u0;", "i", "(Lvu/h0;Lvu/l;Lkotlin/jvm/functions/Function1;)Lvu/u0;", "", "entries", "", "e", "(Ljava/util/List;)Ljava/util/Map;", "Lvu/g;", "l", "(Lvu/g;)Lwu/o;", "Lwu/i;", "o", "(Lvu/g;)Lwu/i;", "regularRecord", "t", "(Lvu/g;Lwu/i;)Lwu/i;", "", "extraSize", "Lkotlin/Function2;", "", "", "block", "p", "(Lvu/g;ILkotlin/jvm/functions/Function2;)V", "u", "(Lvu/g;)V", "centralDirectoryZipEntry", "q", "(Lvu/g;Lwu/o;)Lwu/o;", "r", "filetime", "g", "(J)J", InquiryField.DateField.TYPE, "time", "f", "(II)Ljava/lang/Long;", "", "h", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return kt.a.a(((o) t8).getCanonicalPath(), ((o) t10).getCanonicalPath());
        }
    }

    public static final Map<h0, o> e(List<o> list) {
        h0 h0VarE = h0.Companion.e(h0.INSTANCE, "/", false, 1, null);
        Map<h0, o> mapN = k0.n(gt.s.a(h0VarE, new o(h0VarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (o oVar : CollectionsKt.F0(list, new a())) {
            if (mapN.put(oVar.getCanonicalPath(), oVar) == null) {
                while (true) {
                    h0 h0VarJ = oVar.getCanonicalPath().j();
                    if (h0VarJ == null) {
                        break;
                    }
                    o oVar2 = mapN.get(h0VarJ);
                    if (oVar2 != null) {
                        oVar2.c().add(oVar.getCanonicalPath());
                        break;
                    }
                    o oVar3 = new o(h0VarJ, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapN.put(h0VarJ, oVar3);
                    oVar3.c().add(oVar.getCanonicalPath());
                    oVar = oVar3;
                }
            }
        }
        return mapN;
    }

    @Nullable
    public static final Long f(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(w.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long g(long j10) {
        return (j10 / ((long) BacktraceMetrics.defaultTimeBetweenRetriesMs)) - 11644473600000L;
    }

    public static final String h(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    @NotNull
    public static final u0 i(@NotNull h0 zipPath, @NotNull vu.l fileSystem, @NotNull Function1<? super o, Boolean> predicate) throws IllegalAccessException, InvocationTargetException {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        vu.j jVarOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = jVarOpenReadOnly.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + jVarOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                vu.g gVarC = b0.c(jVarOpenReadOnly.l(size));
                try {
                    if (gVarC.L2() == 101010256) {
                        i iVarO = o(gVarC);
                        String strD1 = gVarC.D1(iVarO.getCommentByteCount());
                        gVarC.close();
                        long j10 = size - ((long) 20);
                        Throwable th5 = null;
                        if (j10 > 0) {
                            vu.g gVarC2 = b0.c(jVarOpenReadOnly.l(j10));
                            try {
                                if (gVarC2.L2() == 117853008) {
                                    int iL2 = gVarC2.L2();
                                    long jJ1 = gVarC2.j1();
                                    if (gVarC2.L2() != 1 || iL2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    vu.g gVarC3 = b0.c(jVarOpenReadOnly.l(jJ1));
                                    try {
                                        int iL3 = gVarC3.L2();
                                        if (iL3 != 101075792) {
                                            throw new IOException("bad zip: expected " + h(101075792) + " but was " + h(iL3));
                                        }
                                        iVarO = t(gVarC3, iVarO);
                                        Unit unit = Unit.f22938a;
                                        if (gVarC3 != null) {
                                            try {
                                                gVarC3.close();
                                            } catch (Throwable th6) {
                                                th4 = th6;
                                            }
                                        }
                                        th4 = null;
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th7) {
                                        if (gVarC3 != null) {
                                            try {
                                                gVarC3.close();
                                                Unit unit2 = Unit.f22938a;
                                            } catch (Throwable th8) {
                                                try {
                                                    gt.a.a(th7, th8);
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    iVarO = iVarO;
                                                    if (gVarC2 != null) {
                                                        try {
                                                            gVarC2.close();
                                                            Unit unit3 = Unit.f22938a;
                                                        } catch (Throwable th10) {
                                                            gt.a.a(th2, th10);
                                                        }
                                                    }
                                                    th3 = th2;
                                                }
                                            }
                                        }
                                        th4 = th7;
                                        iVarO = iVarO;
                                    }
                                }
                                Unit unit4 = Unit.f22938a;
                                if (gVarC2 != null) {
                                    try {
                                        gVarC2.close();
                                    } catch (Throwable th11) {
                                        th3 = th11;
                                    }
                                }
                                th3 = null;
                            } catch (Throwable th12) {
                                th2 = th12;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        vu.g gVarC4 = b0.c(jVarOpenReadOnly.l(iVarO.getCentralDirectoryOffset()));
                        try {
                            long entryCount = iVarO.getEntryCount();
                            for (long j11 = 0; j11 < entryCount; j11++) {
                                o oVarL = l(gVarC4);
                                if (oVarL.getOffset() >= iVarO.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (predicate.invoke(oVarL).booleanValue()) {
                                    arrayList.add(oVarL);
                                }
                            }
                            Unit unit5 = Unit.f22938a;
                            if (gVarC4 != null) {
                                try {
                                    gVarC4.close();
                                } catch (Throwable th13) {
                                    th5 = th13;
                                }
                            }
                        } catch (Throwable th14) {
                            if (gVarC4 != null) {
                                try {
                                    gVarC4.close();
                                    Unit unit6 = Unit.f22938a;
                                } catch (Throwable th15) {
                                    gt.a.a(th14, th15);
                                }
                            }
                            th5 = th14;
                        }
                        if (th5 != null) {
                            throw th5;
                        }
                        u0 u0Var = new u0(zipPath, fileSystem, e(arrayList), strD1);
                        if (jVarOpenReadOnly != null) {
                            try {
                                jVarOpenReadOnly.close();
                                Unit unit7 = Unit.f22938a;
                            } catch (Throwable unused) {
                            }
                        }
                        return u0Var;
                    }
                    gVarC.close();
                    size--;
                } catch (Throwable th16) {
                    gVarC.close();
                    throw th16;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th17) {
            if (jVarOpenReadOnly == null) {
                throw th17;
            }
            try {
                jVarOpenReadOnly.close();
                Unit unit8 = Unit.f22938a;
                throw th17;
            } catch (Throwable th18) {
                gt.a.a(th17, th18);
                throw th17;
            }
        }
    }

    public static /* synthetic */ u0 j(h0 h0Var, vu.l lVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: wu.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(t.k((o) obj2));
                }
            };
        }
        return i(h0Var, lVar, function1);
    }

    public static final boolean k(o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final o l(@NotNull final vu.g gVar) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int iL2 = gVar.L2();
        if (iL2 != 33639248) {
            throw new IOException("bad zip: expected " + h(33639248) + " but was " + h(iL2));
        }
        gVar.skip(4L);
        short sG1 = gVar.g1();
        int i10 = sG1 & 65535;
        if ((sG1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i10));
        }
        int iG1 = gVar.g1() & 65535;
        int iG2 = gVar.g1() & 65535;
        int iG3 = gVar.g1() & 65535;
        long jL2 = ((long) gVar.L2()) & 4294967295L;
        final kotlin.jvm.internal.b0 b0Var = new kotlin.jvm.internal.b0();
        b0Var.f23006a = ((long) gVar.L2()) & 4294967295L;
        final kotlin.jvm.internal.b0 b0Var2 = new kotlin.jvm.internal.b0();
        b0Var2.f23006a = ((long) gVar.L2()) & 4294967295L;
        int iG4 = gVar.g1() & 65535;
        int iG5 = gVar.g1() & 65535;
        int iG6 = gVar.g1() & 65535;
        gVar.skip(8L);
        final kotlin.jvm.internal.b0 b0Var3 = new kotlin.jvm.internal.b0();
        b0Var3.f23006a = ((long) gVar.L2()) & 4294967295L;
        String strD1 = gVar.D1(iG4);
        if (StringsKt.Z(strD1, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = b0Var2.f23006a == 4294967295L ? 8 : 0L;
        if (b0Var.f23006a == 4294967295L) {
            j10 += (long) 8;
        }
        if (b0Var3.f23006a == 4294967295L) {
            j10 += (long) 8;
        }
        final long j11 = j10;
        final c0 c0Var = new c0();
        final c0 c0Var2 = new c0();
        final c0 c0Var3 = new c0();
        final y yVar = new y();
        p(gVar, iG5, new Function2() { // from class: wu.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t.m(yVar, j11, b0Var2, gVar, b0Var, b0Var3, c0Var, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j11 <= 0 || yVar.f23023a) {
            return new o(h0.Companion.e(h0.INSTANCE, "/", false, 1, null).n(strD1), x.D(strD1, "/", false, 2, null), gVar.D1(iG6), jL2, b0Var.f23006a, b0Var2.f23006a, iG1, b0Var3.f23006a, iG3, iG2, (Long) c0Var.f23007a, (Long) c0Var2.f23007a, (Long) c0Var3.f23007a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final Unit m(y yVar, long j10, kotlin.jvm.internal.b0 b0Var, final vu.g gVar, kotlin.jvm.internal.b0 b0Var2, kotlin.jvm.internal.b0 b0Var3, final c0 c0Var, final c0 c0Var2, final c0 c0Var3, int i10, long j11) throws IOException {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                gVar.skip(4L);
                p(gVar, (int) (j11 - 4), new Function2() { // from class: wu.s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t.n(c0Var, gVar, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (yVar.f23023a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            yVar.f23023a = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jJ1 = b0Var.f23006a;
            if (jJ1 == 4294967295L) {
                jJ1 = gVar.j1();
            }
            b0Var.f23006a = jJ1;
            b0Var2.f23006a = b0Var2.f23006a == 4294967295L ? gVar.j1() : 0L;
            b0Var3.f23006a = b0Var3.f23006a == 4294967295L ? gVar.j1() : 0L;
        }
        return Unit.f22938a;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final Unit n(c0 c0Var, vu.g gVar, c0 c0Var2, c0 c0Var3, int i10, long j10) throws IOException {
        if (i10 == 1) {
            if (c0Var.f23007a != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            c0Var.f23007a = Long.valueOf(gVar.j1());
            c0Var2.f23007a = Long.valueOf(gVar.j1());
            c0Var3.f23007a = Long.valueOf(gVar.j1());
        }
        return Unit.f22938a;
    }

    public static final i o(vu.g gVar) throws IOException {
        int iG1 = gVar.g1() & 65535;
        int iG2 = gVar.g1() & 65535;
        long jG1 = gVar.g1() & 65535;
        if (jG1 != (gVar.g1() & 65535) || iG1 != 0 || iG2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(4L);
        return new i(jG1, 4294967295L & ((long) gVar.L2()), gVar.g1() & 65535);
    }

    public static final void p(vu.g gVar, int i10, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iG1 = gVar.g1() & 65535;
            long jG1 = ((long) gVar.g1()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - ((long) 4);
            if (j11 < jG1) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            gVar.u1(jG1);
            long size = gVar.getBufferField().getSize();
            function2.invoke(Integer.valueOf(iG1), Long.valueOf(jG1));
            long size2 = (gVar.getBufferField().getSize() + jG1) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iG1);
            }
            if (size2 > 0) {
                gVar.getBufferField().skip(size2);
            }
            j10 = j11 - jG1;
        }
    }

    @NotNull
    public static final o q(@NotNull vu.g gVar, @NotNull o centralDirectoryZipEntry) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        o oVarR = r(gVar, centralDirectoryZipEntry);
        Intrinsics.checkNotNull(oVarR);
        return oVarR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o r(final vu.g gVar, o oVar) throws IOException {
        int iL2 = gVar.L2();
        if (iL2 != 67324752) {
            throw new IOException("bad zip: expected " + h(67324752) + " but was " + h(iL2));
        }
        gVar.skip(2L);
        short sG1 = gVar.g1();
        int i10 = sG1 & 65535;
        if ((sG1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i10));
        }
        gVar.skip(18L);
        long jG1 = ((long) gVar.g1()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iG1 = gVar.g1() & 65535;
        gVar.skip(jG1);
        if (oVar == null) {
            gVar.skip(iG1);
            return null;
        }
        final c0 c0Var = new c0();
        final c0 c0Var2 = new c0();
        final c0 c0Var3 = new c0();
        p(gVar, iG1, new Function2() { // from class: wu.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t.s(gVar, c0Var, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return oVar.a((Integer) c0Var.f23007a, (Integer) c0Var2.f23007a, (Integer) c0Var3.f23007a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final Unit s(vu.g gVar, c0 c0Var, c0 c0Var2, c0 c0Var3, int i10, long j10) throws IOException {
        if (i10 == 21589) {
            if (j10 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b = gVar.readByte();
            boolean z10 = (b & 1) == 1;
            boolean z11 = (b & 2) == 2;
            boolean z12 = (b & 4) == 4;
            long j11 = z10 ? 5L : 1L;
            if (z11) {
                j11 += 4;
            }
            if (z12) {
                j11 += 4;
            }
            if (j10 < j11) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z10) {
                c0Var.f23007a = Integer.valueOf(gVar.L2());
            }
            if (z11) {
                c0Var2.f23007a = Integer.valueOf(gVar.L2());
            }
            if (z12) {
                c0Var3.f23007a = Integer.valueOf(gVar.L2());
            }
        }
        return Unit.f22938a;
    }

    public static final i t(vu.g gVar, i iVar) throws IOException {
        gVar.skip(12L);
        int iL2 = gVar.L2();
        int iL3 = gVar.L2();
        long jJ1 = gVar.j1();
        if (jJ1 != gVar.j1() || iL2 != 0 || iL3 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(8L);
        return new i(jJ1, gVar.j1(), iVar.getCommentByteCount());
    }

    public static final void u(@NotNull vu.g gVar) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        r(gVar, null);
    }
}
