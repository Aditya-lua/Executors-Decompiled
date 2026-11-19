package fw;

import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ew.b0;
import ew.o0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.k0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.c0;
import p001kotlin.jvm.internal.y;
import p001kotlin.text.CharsKt;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lew/b0;", "zipPath", "Lew/k;", "fileSystem", "Lkotlin/Function1;", "Lfw/o;", BuildConfig.FLAVOR, "predicate", "Lew/o0;", "i", "(Lew/b0;Lew/k;Lkotlin/jvm/functions/Function1;)Lew/o0;", BuildConfig.FLAVOR, "entries", BuildConfig.FLAVOR, "e", "(Ljava/util/List;)Ljava/util/Map;", "Lew/g;", "l", "(Lew/g;)Lfw/o;", "Lfw/i;", "o", "(Lew/g;)Lfw/i;", "regularRecord", "t", "(Lew/g;Lfw/i;)Lfw/i;", BuildConfig.FLAVOR, "extraSize", "Lkotlin/Function2;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "block", "p", "(Lew/g;ILkotlin/jvm/functions/Function2;)V", "u", "(Lew/g;)V", "centralDirectoryZipEntry", "q", "(Lew/g;Lfw/o;)Lfw/o;", "r", "filetime", "g", "(J)J", InquiryField.DateField.TYPE, "time", "f", "(II)Ljava/lang/Long;", BuildConfig.FLAVOR, "h", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return cu.a.a(((o) t8).getCanonicalPath(), ((o) t10).getCanonicalPath());
        }
    }

    public static final Map<b0, o> e(List<o> list) {
        b0 b0VarE = b0.Companion.e(b0.INSTANCE, "/", false, 1, null);
        Map<b0, o> mapO = k0.o(zt.s.a(b0VarE, new o(b0VarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (o oVar : CollectionsKt.F0(list, new a())) {
            if (mapO.put(oVar.getCanonicalPath(), oVar) == null) {
                while (true) {
                    b0 b0VarK = oVar.getCanonicalPath().k();
                    if (b0VarK == null) {
                        break;
                    }
                    o oVar2 = mapO.get(b0VarK);
                    if (oVar2 != null) {
                        oVar2.c().add(oVar.getCanonicalPath());
                        break;
                    }
                    o oVar3 = new o(b0VarK, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapO.put(b0VarK, oVar3);
                    oVar3.c().add(oVar.getCanonicalPath());
                    oVar = oVar3;
                }
            }
        }
        return mapO;
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
    public static final o0 i(@NotNull b0 zipPath, @NotNull ew.k fileSystem, @NotNull Function1<? super o, Boolean> predicate) throws IllegalAccessException, InvocationTargetException {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ew.i iVarR = fileSystem.r(zipPath);
        try {
            long size = iVarR.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + iVarR.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                ew.g gVarC = ew.v.c(iVarR.m(size));
                try {
                    if (gVarC.P2() == 101010256) {
                        i iVarO = o(gVarC);
                        String strG1 = gVarC.G1(iVarO.getCommentByteCount());
                        gVarC.close();
                        long j10 = size - ((long) 20);
                        Throwable th5 = null;
                        if (j10 > 0) {
                            ew.g gVarC2 = ew.v.c(iVarR.m(j10));
                            try {
                                if (gVarC2.P2() == 117853008) {
                                    int iP2 = gVarC2.P2();
                                    long jM1 = gVarC2.m1();
                                    if (gVarC2.P2() != 1 || iP2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    ew.g gVarC3 = ew.v.c(iVarR.m(jM1));
                                    try {
                                        int iP3 = gVarC3.P2();
                                        if (iP3 != 101075792) {
                                            throw new IOException("bad zip: expected " + h(101075792) + " but was " + h(iP3));
                                        }
                                        iVarO = t(gVarC3, iVarO);
                                        Unit unit = Unit.f21506a;
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
                                                Unit unit2 = Unit.f21506a;
                                            } catch (Throwable th8) {
                                                try {
                                                    zt.a.a(th7, th8);
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    iVarO = iVarO;
                                                    if (gVarC2 != null) {
                                                        try {
                                                            gVarC2.close();
                                                            Unit unit3 = Unit.f21506a;
                                                        } catch (Throwable th10) {
                                                            zt.a.a(th2, th10);
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
                                Unit unit4 = Unit.f21506a;
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
                        ew.g gVarC4 = ew.v.c(iVarR.m(iVarO.getCentralDirectoryOffset()));
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
                            Unit unit5 = Unit.f21506a;
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
                                    Unit unit6 = Unit.f21506a;
                                } catch (Throwable th15) {
                                    zt.a.a(th14, th15);
                                }
                            }
                            th5 = th14;
                        }
                        if (th5 != null) {
                            throw th5;
                        }
                        o0 o0Var = new o0(zipPath, fileSystem, e(arrayList), strG1);
                        if (iVarR != null) {
                            try {
                                iVarR.close();
                                Unit unit7 = Unit.f21506a;
                            } catch (Throwable unused) {
                            }
                        }
                        return o0Var;
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
            if (iVarR == null) {
                throw th17;
            }
            try {
                iVarR.close();
                Unit unit8 = Unit.f21506a;
                throw th17;
            } catch (Throwable th18) {
                zt.a.a(th17, th18);
                throw th17;
            }
        }
    }

    public static /* synthetic */ o0 j(b0 b0Var, ew.k kVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: fw.p
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(t.k((o) obj2));
                }
            };
        }
        return i(b0Var, kVar, function1);
    }

    public static final boolean k(o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final o l(@NotNull final ew.g gVar) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int iP2 = gVar.P2();
        if (iP2 != 33639248) {
            throw new IOException("bad zip: expected " + h(33639248) + " but was " + h(iP2));
        }
        gVar.skip(4L);
        short sJ1 = gVar.j1();
        int i10 = sJ1 & 65535;
        if ((sJ1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i10));
        }
        int iJ1 = gVar.j1() & 65535;
        int iJ2 = gVar.j1() & 65535;
        int iJ3 = gVar.j1() & 65535;
        long jP2 = ((long) gVar.P2()) & 4294967295L;
        final p001kotlin.jvm.internal.b0 b0Var = new p001kotlin.jvm.internal.b0();
        b0Var.f21574a = ((long) gVar.P2()) & 4294967295L;
        final p001kotlin.jvm.internal.b0 b0Var2 = new p001kotlin.jvm.internal.b0();
        b0Var2.f21574a = ((long) gVar.P2()) & 4294967295L;
        int iJ4 = gVar.j1() & 65535;
        int iJ5 = gVar.j1() & 65535;
        int iJ6 = gVar.j1() & 65535;
        gVar.skip(8L);
        final p001kotlin.jvm.internal.b0 b0Var3 = new p001kotlin.jvm.internal.b0();
        b0Var3.f21574a = ((long) gVar.P2()) & 4294967295L;
        String strG1 = gVar.G1(iJ4);
        if (StringsKt.Z(strG1, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = b0Var2.f21574a == 4294967295L ? 8 : 0L;
        if (b0Var.f21574a == 4294967295L) {
            j10 += (long) 8;
        }
        if (b0Var3.f21574a == 4294967295L) {
            j10 += (long) 8;
        }
        final long j11 = j10;
        final c0 c0Var = new c0();
        final c0 c0Var2 = new c0();
        final c0 c0Var3 = new c0();
        final y yVar = new y();
        p(gVar, iJ5, new Function2() { // from class: fw.r
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t.m(yVar, j11, b0Var2, gVar, b0Var, b0Var3, c0Var, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j11 <= 0 || yVar.f21591a) {
            return new o(b0.Companion.e(b0.INSTANCE, "/", false, 1, null).p(strG1), x.D(strG1, "/", false, 2, null), gVar.G1(iJ6), jP2, b0Var.f21574a, b0Var2.f21574a, iJ1, b0Var3.f21574a, iJ3, iJ2, (Long) c0Var.f21575a, (Long) c0Var2.f21575a, (Long) c0Var3.f21575a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final Unit m(y yVar, long j10, p001kotlin.jvm.internal.b0 b0Var, final ew.g gVar, p001kotlin.jvm.internal.b0 b0Var2, p001kotlin.jvm.internal.b0 b0Var3, final c0 c0Var, final c0 c0Var2, final c0 c0Var3, int i10, long j11) throws IOException {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                gVar.skip(4L);
                p(gVar, (int) (j11 - 4), new Function2() { // from class: fw.s
                    @Override // p001kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t.n(c0Var, gVar, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (yVar.f21591a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            yVar.f21591a = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jM1 = b0Var.f21574a;
            if (jM1 == 4294967295L) {
                jM1 = gVar.m1();
            }
            b0Var.f21574a = jM1;
            b0Var2.f21574a = b0Var2.f21574a == 4294967295L ? gVar.m1() : 0L;
            b0Var3.f21574a = b0Var3.f21574a == 4294967295L ? gVar.m1() : 0L;
        }
        return Unit.f21506a;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final Unit n(c0 c0Var, ew.g gVar, c0 c0Var2, c0 c0Var3, int i10, long j10) throws IOException {
        if (i10 == 1) {
            if (c0Var.f21575a != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            c0Var.f21575a = Long.valueOf(gVar.m1());
            c0Var2.f21575a = Long.valueOf(gVar.m1());
            c0Var3.f21575a = Long.valueOf(gVar.m1());
        }
        return Unit.f21506a;
    }

    public static final i o(ew.g gVar) throws IOException {
        int iJ1 = gVar.j1() & 65535;
        int iJ2 = gVar.j1() & 65535;
        long jJ1 = gVar.j1() & 65535;
        if (jJ1 != (gVar.j1() & 65535) || iJ1 != 0 || iJ2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(4L);
        return new i(jJ1, 4294967295L & ((long) gVar.P2()), gVar.j1() & 65535);
    }

    public static final void p(ew.g gVar, int i10, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iJ1 = gVar.j1() & 65535;
            long jJ1 = ((long) gVar.j1()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jJ1) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            gVar.w1(jJ1);
            long size = gVar.getBufferField().getSize();
            function2.invoke(Integer.valueOf(iJ1), Long.valueOf(jJ1));
            long size2 = (gVar.getBufferField().getSize() + jJ1) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iJ1);
            }
            if (size2 > 0) {
                gVar.getBufferField().skip(size2);
            }
            j10 = j11 - jJ1;
        }
    }

    @NotNull
    public static final o q(@NotNull ew.g gVar, @NotNull o centralDirectoryZipEntry) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        o oVarR = r(gVar, centralDirectoryZipEntry);
        Intrinsics.checkNotNull(oVarR);
        return oVarR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o r(final ew.g gVar, o oVar) throws IOException {
        int iP2 = gVar.P2();
        if (iP2 != 67324752) {
            throw new IOException("bad zip: expected " + h(67324752) + " but was " + h(iP2));
        }
        gVar.skip(2L);
        short sJ1 = gVar.j1();
        int i10 = sJ1 & 65535;
        if ((sJ1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i10));
        }
        gVar.skip(18L);
        long jJ1 = ((long) gVar.j1()) & 65535;
        int iJ1 = gVar.j1() & 65535;
        gVar.skip(jJ1);
        if (oVar == null) {
            gVar.skip(iJ1);
            return null;
        }
        final c0 c0Var = new c0();
        final c0 c0Var2 = new c0();
        final c0 c0Var3 = new c0();
        p(gVar, iJ1, new Function2() { // from class: fw.q
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t.s(gVar, c0Var, c0Var2, c0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return oVar.a((Integer) c0Var.f21575a, (Integer) c0Var2.f21575a, (Integer) c0Var3.f21575a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final Unit s(ew.g gVar, c0 c0Var, c0 c0Var2, c0 c0Var3, int i10, long j10) throws IOException {
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
                c0Var.f21575a = Integer.valueOf(gVar.P2());
            }
            if (z11) {
                c0Var2.f21575a = Integer.valueOf(gVar.P2());
            }
            if (z12) {
                c0Var3.f21575a = Integer.valueOf(gVar.P2());
            }
        }
        return Unit.f21506a;
    }

    public static final i t(ew.g gVar, i iVar) throws IOException {
        gVar.skip(12L);
        int iP2 = gVar.P2();
        int iP3 = gVar.P2();
        long jM1 = gVar.m1();
        if (jM1 != gVar.m1() || iP2 != 0 || iP3 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(8L);
        return new i(jM1, gVar.m1(), iVar.getCommentByteCount());
    }

    public static final void u(@NotNull ew.g gVar) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        r(gVar, null);
    }
}
