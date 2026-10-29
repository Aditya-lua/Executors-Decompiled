package p588yu;

import backtraceio.library.services.BacktraceMetrics;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7727b0;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import mt.C8662a;
import okhttp3.internal.p336ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p229jt.C7352s;
import p560xu.AbstractC12934j;
import p560xu.AbstractC12938l;
import p560xu.C12919b0;
import p560xu.C12931h0;
import p560xu.C12957u0;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: yu.t */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m31665d2 = {"Lxu/h0;", "zipPath", "Lxu/l;", "fileSystem", "Lkotlin/Function1;", "Lyu/o;", "", "predicate", "Lxu/u0;", "i", "(Lxu/h0;Lxu/l;Lkotlin/jvm/functions/Function1;)Lxu/u0;", "", "entries", "", "e", "(Ljava/util/List;)Ljava/util/Map;", "Lxu/g;", "l", "(Lxu/g;)Lyu/o;", "Lyu/i;", "o", "(Lxu/g;)Lyu/i;", "regularRecord", "t", "(Lxu/g;Lyu/i;)Lyu/i;", "", "extraSize", "Lkotlin/Function2;", "", "", "block", "p", "(Lxu/g;ILkotlin/jvm/functions/Function2;)V", "u", "(Lxu/g;)V", "centralDirectoryZipEntry", "q", "(Lxu/g;Lyu/o;)Lyu/o;", "r", "filetime", "g", "(J)J", InquiryField.DateField.TYPE, "time", "f", "(II)Ljava/lang/Long;", "", "h", "(I)Ljava/lang/String;", "hex", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13471t {

    /* JADX INFO: renamed from: yu.t$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(((C13466o) t8).getCanonicalPath(), ((C13466o) t10).getCanonicalPath());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Map<C12931h0, C13466o> m49139e(List<C13466o> list) {
        C12931h0 c12931h0M48135e = C12931h0.Companion.m48135e(C12931h0.INSTANCE, "/", false, 1, null);
        Map<C12931h0, C13466o> mapM31799n = C7690k0.m31799n(C7352s.m30477a(c12931h0M48135e, new C13466o(c12931h0M48135e, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (C13466o c13466o : CollectionsKt.m31680F0(list, new a())) {
            if (mapM31799n.put(c13466o.getCanonicalPath(), c13466o) == null) {
                while (true) {
                    C12931h0 c12931h0M48127j = c13466o.getCanonicalPath().m48127j();
                    if (c12931h0M48127j == null) {
                        break;
                    }
                    C13466o c13466o2 = mapM31799n.get(c12931h0M48127j);
                    if (c13466o2 != null) {
                        c13466o2.m49126c().add(c13466o.getCanonicalPath());
                        break;
                    }
                    C13466o c13466o3 = new C13466o(c12931h0M48127j, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapM31799n.put(c12931h0M48127j, c13466o3);
                    c13466o3.m49126c().add(c13466o.getCanonicalPath());
                    c13466o = c13466o3;
                }
            }
        }
        return mapM31799n;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Long m49140f(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(C13474w.m49159a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    /* JADX INFO: renamed from: g */
    public static final long m49141g(long j10) {
        return (j10 / ((long) BacktraceMetrics.defaultTimeBetweenRetriesMs)) - 11644473600000L;
    }

    /* JADX INFO: renamed from: h */
    public static final String m49142h(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final C12957u0 m49143i(@NotNull C12931h0 zipPath, @NotNull AbstractC12938l fileSystem, @NotNull Function1<? super C13466o, Boolean> predicate) {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        AbstractC12934j abstractC12934jOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = abstractC12934jOpenReadOnly.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + abstractC12934jOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(abstractC12934jOpenReadOnly.m48151l(size));
                try {
                    if (interfaceC12928gM47961c.mo48005M2() == 101010256) {
                        C13460i c13460iM49149o = m49149o(interfaceC12928gM47961c);
                        String strMo47998G1 = interfaceC12928gM47961c.mo47998G1(c13460iM49149o.getCommentByteCount());
                        interfaceC12928gM47961c.close();
                        long j10 = size - ((long) 20);
                        Throwable th5 = null;
                        if (j10 > 0) {
                            InterfaceC12928g interfaceC12928gM47961c2 = C12919b0.m47961c(abstractC12934jOpenReadOnly.m48151l(j10));
                            try {
                                if (interfaceC12928gM47961c2.mo48005M2() == 117853008) {
                                    int iMo48005M2 = interfaceC12928gM47961c2.mo48005M2();
                                    long jMo48042n1 = interfaceC12928gM47961c2.mo48042n1();
                                    if (interfaceC12928gM47961c2.mo48005M2() != 1 || iMo48005M2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    InterfaceC12928g interfaceC12928gM47961c3 = C12919b0.m47961c(abstractC12934jOpenReadOnly.m48151l(jMo48042n1));
                                    try {
                                        int iMo48005M3 = interfaceC12928gM47961c3.mo48005M2();
                                        if (iMo48005M3 != 101075792) {
                                            throw new IOException("bad zip: expected " + m49142h(101075792) + " but was " + m49142h(iMo48005M3));
                                        }
                                        c13460iM49149o = m49154t(interfaceC12928gM47961c3, c13460iM49149o);
                                        Unit unit = Unit.f29331a;
                                        if (interfaceC12928gM47961c3 != null) {
                                            try {
                                                interfaceC12928gM47961c3.close();
                                            } catch (Throwable th6) {
                                                th4 = th6;
                                            }
                                        }
                                        th4 = null;
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th7) {
                                        if (interfaceC12928gM47961c3 != null) {
                                            try {
                                                interfaceC12928gM47961c3.close();
                                                Unit unit2 = Unit.f29331a;
                                            } catch (Throwable th8) {
                                                try {
                                                    C7328a.m30429a(th7, th8);
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    c13460iM49149o = c13460iM49149o;
                                                    if (interfaceC12928gM47961c2 != null) {
                                                        try {
                                                            interfaceC12928gM47961c2.close();
                                                            Unit unit3 = Unit.f29331a;
                                                        } catch (Throwable th10) {
                                                            C7328a.m30429a(th2, th10);
                                                        }
                                                    }
                                                    th3 = th2;
                                                }
                                            }
                                        }
                                        th4 = th7;
                                        c13460iM49149o = c13460iM49149o;
                                    }
                                }
                                Unit unit4 = Unit.f29331a;
                                if (interfaceC12928gM47961c2 != null) {
                                    try {
                                        interfaceC12928gM47961c2.close();
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
                        InterfaceC12928g interfaceC12928gM47961c4 = C12919b0.m47961c(abstractC12934jOpenReadOnly.m48151l(c13460iM49149o.getCentralDirectoryOffset()));
                        try {
                            long entryCount = c13460iM49149o.getEntryCount();
                            for (long j11 = 0; j11 < entryCount; j11++) {
                                C13466o c13466oM49146l = m49146l(interfaceC12928gM47961c4);
                                if (c13466oM49146l.getOffset() >= c13460iM49149o.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (predicate.invoke(c13466oM49146l).booleanValue()) {
                                    arrayList.add(c13466oM49146l);
                                }
                            }
                            Unit unit5 = Unit.f29331a;
                            if (interfaceC12928gM47961c4 != null) {
                                try {
                                    interfaceC12928gM47961c4.close();
                                } catch (Throwable th13) {
                                    th5 = th13;
                                }
                            }
                        } catch (Throwable th14) {
                            if (interfaceC12928gM47961c4 != null) {
                                try {
                                    interfaceC12928gM47961c4.close();
                                    Unit unit6 = Unit.f29331a;
                                } catch (Throwable th15) {
                                    C7328a.m30429a(th14, th15);
                                }
                            }
                            th5 = th14;
                        }
                        if (th5 != null) {
                            throw th5;
                        }
                        C12957u0 c12957u0 = new C12957u0(zipPath, fileSystem, m49139e(arrayList), strMo47998G1);
                        if (abstractC12934jOpenReadOnly != null) {
                            try {
                                abstractC12934jOpenReadOnly.close();
                                Unit unit7 = Unit.f29331a;
                            } catch (Throwable unused) {
                            }
                        }
                        return c12957u0;
                    }
                    interfaceC12928gM47961c.close();
                    size--;
                } catch (Throwable th16) {
                    interfaceC12928gM47961c.close();
                    throw th16;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th17) {
            if (abstractC12934jOpenReadOnly == null) {
                throw th17;
            }
            try {
                abstractC12934jOpenReadOnly.close();
                Unit unit8 = Unit.f29331a;
                throw th17;
            } catch (Throwable th18) {
                C7328a.m30429a(th17, th18);
                throw th17;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C12957u0 m49144j(C12931h0 c12931h0, AbstractC12938l abstractC12938l, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: yu.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(C13471t.m49145k((C13466o) obj2));
                }
            };
        }
        return m49143i(c12931h0, abstractC12938l, function1);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m49145k(C13466o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final C13466o m49146l(@NotNull final InterfaceC12928g interfaceC12928g) throws IOException {
        Intrinsics.checkNotNullParameter(interfaceC12928g, "<this>");
        int iMo48005M2 = interfaceC12928g.mo48005M2();
        if (iMo48005M2 != 33639248) {
            throw new IOException("bad zip: expected " + m49142h(33639248) + " but was " + m49142h(iMo48005M2));
        }
        interfaceC12928g.skip(4L);
        short sMo48037k1 = interfaceC12928g.mo48037k1();
        int i10 = sMo48037k1 & 65535;
        if ((sMo48037k1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m49142h(i10));
        }
        int iMo48037k1 = interfaceC12928g.mo48037k1() & 65535;
        int iMo48037k2 = interfaceC12928g.mo48037k1() & 65535;
        int iMo48037k3 = interfaceC12928g.mo48037k1() & 65535;
        long jMo48005M2 = ((long) interfaceC12928g.mo48005M2()) & 4294967295L;
        final C7727b0 c7727b0 = new C7727b0();
        c7727b0.f29424a = ((long) interfaceC12928g.mo48005M2()) & 4294967295L;
        final C7727b0 c7727b1 = new C7727b0();
        c7727b1.f29424a = ((long) interfaceC12928g.mo48005M2()) & 4294967295L;
        int iMo48037k4 = interfaceC12928g.mo48037k1() & 65535;
        int iMo48037k5 = interfaceC12928g.mo48037k1() & 65535;
        int iMo48037k6 = interfaceC12928g.mo48037k1() & 65535;
        interfaceC12928g.skip(8L);
        final C7727b0 c7727b2 = new C7727b0();
        c7727b2.f29424a = ((long) interfaceC12928g.mo48005M2()) & 4294967295L;
        String strMo47998G1 = interfaceC12928g.mo47998G1(iMo48037k4);
        if (StringsKt.m32150Z(strMo47998G1, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = c7727b1.f29424a == 4294967295L ? 8 : 0L;
        if (c7727b0.f29424a == 4294967295L) {
            j10 += (long) 8;
        }
        if (c7727b2.f29424a == 4294967295L) {
            j10 += (long) 8;
        }
        final long j11 = j10;
        final C7729c0 c7729c0 = new C7729c0();
        final C7729c0 c7729c1 = new C7729c0();
        final C7729c0 c7729c2 = new C7729c0();
        final C7758y c7758y = new C7758y();
        m49150p(interfaceC12928g, iMo48037k5, new Function2() { // from class: yu.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C13471t.m49147m(c7758y, j11, c7727b1, interfaceC12928g, c7727b0, c7727b2, c7729c0, c7729c1, c7729c2, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j11 <= 0 || c7758y.f29445a) {
            return new C13466o(C12931h0.Companion.m48135e(C12931h0.INSTANCE, "/", false, 1, null).m48129n(strMo47998G1), C7797x.m32293D(strMo47998G1, "/", false, 2, null), interfaceC12928g.mo47998G1(iMo48037k6), jMo48005M2, c7727b0.f29424a, c7727b1.f29424a, iMo48037k1, c7727b2.f29424a, iMo48037k3, iMo48037k2, (Long) c7729c0.f29425a, (Long) c7729c1.f29425a, (Long) c7729c2.f29425a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m49147m(C7758y c7758y, long j10, C7727b0 c7727b0, final InterfaceC12928g interfaceC12928g, C7727b0 c7727b1, C7727b0 c7727b2, final C7729c0 c7729c0, final C7729c0 c7729c1, final C7729c0 c7729c2, int i10, long j11) throws IOException {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                interfaceC12928g.skip(4L);
                m49150p(interfaceC12928g, (int) (j11 - 4), new Function2() { // from class: yu.s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C13471t.m49148n(c7729c0, interfaceC12928g, c7729c1, c7729c2, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (c7758y.f29445a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c7758y.f29445a = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jMo48042n1 = c7727b0.f29424a;
            if (jMo48042n1 == 4294967295L) {
                jMo48042n1 = interfaceC12928g.mo48042n1();
            }
            c7727b0.f29424a = jMo48042n1;
            c7727b1.f29424a = c7727b1.f29424a == 4294967295L ? interfaceC12928g.mo48042n1() : 0L;
            c7727b2.f29424a = c7727b2.f29424a == 4294967295L ? interfaceC12928g.mo48042n1() : 0L;
        }
        return Unit.f29331a;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    /* JADX INFO: renamed from: n */
    public static final Unit m49148n(C7729c0 c7729c0, InterfaceC12928g interfaceC12928g, C7729c0 c7729c1, C7729c0 c7729c2, int i10, long j10) throws IOException {
        if (i10 == 1) {
            if (c7729c0.f29425a != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            c7729c0.f29425a = Long.valueOf(interfaceC12928g.mo48042n1());
            c7729c1.f29425a = Long.valueOf(interfaceC12928g.mo48042n1());
            c7729c2.f29425a = Long.valueOf(interfaceC12928g.mo48042n1());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final C13460i m49149o(InterfaceC12928g interfaceC12928g) throws IOException {
        int iMo48037k1 = interfaceC12928g.mo48037k1() & 65535;
        int iMo48037k2 = interfaceC12928g.mo48037k1() & 65535;
        long jMo48037k1 = interfaceC12928g.mo48037k1() & 65535;
        if (jMo48037k1 != (interfaceC12928g.mo48037k1() & 65535) || iMo48037k1 != 0 || iMo48037k2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC12928g.skip(4L);
        return new C13460i(jMo48037k1, 4294967295L & ((long) interfaceC12928g.mo48005M2()), interfaceC12928g.mo48037k1() & 65535);
    }

    /* JADX INFO: renamed from: p */
    public static final void m49150p(InterfaceC12928g interfaceC12928g, int i10, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iMo48037k1 = interfaceC12928g.mo48037k1() & 65535;
            long jMo48037k1 = ((long) interfaceC12928g.mo48037k1()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - ((long) 4);
            if (j11 < jMo48037k1) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC12928g.mo48054w1(jMo48037k1);
            long size = interfaceC12928g.getBufferField().getSize();
            function2.invoke(Integer.valueOf(iMo48037k1), Long.valueOf(jMo48037k1));
            long size2 = (interfaceC12928g.getBufferField().getSize() + jMo48037k1) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iMo48037k1);
            }
            if (size2 > 0) {
                interfaceC12928g.getBufferField().skip(size2);
            }
            j10 = j11 - jMo48037k1;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final C13466o m49151q(@NotNull InterfaceC12928g interfaceC12928g, @NotNull C13466o centralDirectoryZipEntry) throws IOException {
        Intrinsics.checkNotNullParameter(interfaceC12928g, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        C13466o c13466oM49152r = m49152r(interfaceC12928g, centralDirectoryZipEntry);
        Intrinsics.checkNotNull(c13466oM49152r);
        return c13466oM49152r;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final C13466o m49152r(final InterfaceC12928g interfaceC12928g, C13466o c13466o) throws IOException {
        int iMo48005M2 = interfaceC12928g.mo48005M2();
        if (iMo48005M2 != 67324752) {
            throw new IOException("bad zip: expected " + m49142h(67324752) + " but was " + m49142h(iMo48005M2));
        }
        interfaceC12928g.skip(2L);
        short sMo48037k1 = interfaceC12928g.mo48037k1();
        int i10 = sMo48037k1 & 65535;
        if ((sMo48037k1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m49142h(i10));
        }
        interfaceC12928g.skip(18L);
        long jMo48037k1 = ((long) interfaceC12928g.mo48037k1()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iMo48037k1 = interfaceC12928g.mo48037k1() & 65535;
        interfaceC12928g.skip(jMo48037k1);
        if (c13466o == null) {
            interfaceC12928g.skip(iMo48037k1);
            return null;
        }
        final C7729c0 c7729c0 = new C7729c0();
        final C7729c0 c7729c1 = new C7729c0();
        final C7729c0 c7729c2 = new C7729c0();
        m49150p(interfaceC12928g, iMo48037k1, new Function2() { // from class: yu.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C13471t.m49153s(interfaceC12928g, c7729c0, c7729c1, c7729c2, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return c13466o.m49124a((Integer) c7729c0.f29425a, (Integer) c7729c1.f29425a, (Integer) c7729c2.f29425a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    /* JADX INFO: renamed from: s */
    public static final Unit m49153s(InterfaceC12928g interfaceC12928g, C7729c0 c7729c0, C7729c0 c7729c1, C7729c0 c7729c2, int i10, long j10) throws IOException {
        if (i10 == 21589) {
            if (j10 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b = interfaceC12928g.readByte();
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
                c7729c0.f29425a = Integer.valueOf(interfaceC12928g.mo48005M2());
            }
            if (z11) {
                c7729c1.f29425a = Integer.valueOf(interfaceC12928g.mo48005M2());
            }
            if (z12) {
                c7729c2.f29425a = Integer.valueOf(interfaceC12928g.mo48005M2());
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public static final C13460i m49154t(InterfaceC12928g interfaceC12928g, C13460i c13460i) throws IOException {
        interfaceC12928g.skip(12L);
        int iMo48005M2 = interfaceC12928g.mo48005M2();
        int iMo48005M3 = interfaceC12928g.mo48005M2();
        long jMo48042n1 = interfaceC12928g.mo48042n1();
        if (jMo48042n1 != interfaceC12928g.mo48042n1() || iMo48005M2 != 0 || iMo48005M3 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC12928g.skip(8L);
        return new C13460i(jMo48042n1, interfaceC12928g.mo48042n1(), c13460i.getCommentByteCount());
    }

    /* JADX INFO: renamed from: u */
    public static final void m49155u(@NotNull InterfaceC12928g interfaceC12928g) throws IOException {
        Intrinsics.checkNotNullParameter(interfaceC12928g, "<this>");
        m49152r(interfaceC12928g, null);
    }
}
