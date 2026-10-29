package p588yu;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.C12931h0;

/* JADX INFO: renamed from: yu.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, m31665d2 = {"Lxu/h0;", "", "o", "(Lxu/h0;)I", "", "n", "(Lxu/h0;)Z", "child", "normalize", "j", "(Lxu/h0;Lxu/h0;Z)Lxu/h0;", "", "k", "(Ljava/lang/String;Z)Lxu/h0;", "Lxu/e;", "q", "(Lxu/e;Z)Lxu/h0;", "Lxu/h;", "s", "(Ljava/lang/String;)Lxu/h;", "", "r", "(B)Lxu/h;", "slash", "p", "(Lxu/e;Lxu/h;)Z", "a", "Lxu/h;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", "d", "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lxu/h0;)Lxu/h;", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13456e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12930h f47124a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C12930h f47125b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C12930h f47126c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C12930h f47127d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C12930h f47128e;

    static {
        C12930h.Companion companion = C12930h.INSTANCE;
        f47124a = companion.m48117d("/");
        f47125b = companion.m48117d("\\");
        f47126c = companion.m48117d("/\\");
        f47127d = companion.m48117d(".");
        f47128e = companion.m48117d("..");
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final C12931h0 m49086j(@NotNull C12931h0 c12931h0, @NotNull C12931h0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(c12931h0, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.m48133u() != null) {
            return child;
        }
        C12930h c12930hM49089m = m49089m(c12931h0);
        if (c12930hM49089m == null && (c12930hM49089m = m49089m(child)) == null) {
            c12930hM49089m = m49095s(C12931h0.f45835c);
        }
        C12924e c12924e = new C12924e();
        c12924e.mo48023d0(c12931h0.getBytes());
        if (c12924e.getSize() > 0) {
            c12924e.mo48023d0(c12930hM49089m);
        }
        c12924e.mo48023d0(child.getBytes());
        return m49093q(c12924e, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final C12931h0 m49087k(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m49093q(new C12924e().mo47992C0(str), z10);
    }

    /* JADX DEBUG: Class process forced to load method for inline: xu.h.A(xu.h, xu.h, int, int, java.lang.Object):int */
    /* JADX INFO: renamed from: l */
    public static final int m49088l(C12931h0 c12931h0) {
        int iM48077A = C12930h.m48077A(c12931h0.getBytes(), f47124a, 0, 2, null);
        return iM48077A != -1 ? iM48077A : C12930h.m48077A(c12931h0.getBytes(), f47125b, 0, 2, null);
    }

    /* JADX INFO: renamed from: m */
    public static final C12930h m49089m(C12931h0 c12931h0) {
        C12930h bytes = c12931h0.getBytes();
        C12930h c12930h = f47124a;
        if (C12930h.m48081v(bytes, c12930h, 0, 2, null) != -1) {
            return c12930h;
        }
        C12930h bytes2 = c12931h0.getBytes();
        C12930h c12930h2 = f47125b;
        if (C12930h.m48081v(bytes2, c12930h2, 0, 2, null) != -1) {
            return c12930h2;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m49090n(C12931h0 c12931h0) {
        return c12931h0.getBytes().m48100h(f47128e) && (c12931h0.getBytes().m48089I() == 2 || c12931h0.getBytes().mo48083C(c12931h0.getBytes().m48089I() + (-3), f47124a, 0, 1) || c12931h0.getBytes().mo48083C(c12931h0.getBytes().m48089I() + (-3), f47125b, 0, 1));
    }

    /* JADX INFO: renamed from: o */
    public static final int m49091o(C12931h0 c12931h0) {
        if (c12931h0.getBytes().m48089I() == 0) {
            return -1;
        }
        if (c12931h0.getBytes().m48101j(0) == 47) {
            return 1;
        }
        if (c12931h0.getBytes().m48101j(0) == 92) {
            if (c12931h0.getBytes().m48089I() <= 2 || c12931h0.getBytes().m48101j(1) != 92) {
                return 1;
            }
            int iM48107s = c12931h0.getBytes().m48107s(f47125b, 2);
            return iM48107s == -1 ? c12931h0.getBytes().m48089I() : iM48107s;
        }
        if (c12931h0.getBytes().m48089I() > 2 && c12931h0.getBytes().m48101j(1) == 58 && c12931h0.getBytes().m48101j(2) == 92) {
            char cM48101j = (char) c12931h0.getBytes().m48101j(0);
            if ('a' <= cM48101j && cM48101j < '{') {
                return 3;
            }
            if ('A' <= cM48101j && cM48101j < '[') {
                return 3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m49092p(C12924e c12924e, C12930h c12930h) {
        if (!Intrinsics.m31980c(c12930h, f47125b) || c12924e.getSize() < 2 || c12924e.m48033j(1L) != 58) {
            return false;
        }
        char cM48033j = (char) c12924e.m48033j(0L);
        if ('a' > cM48033j || cM48033j >= '{') {
            return 'A' <= cM48033j && cM48033j < '[';
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final C12931h0 m49093q(@NotNull C12924e c12924e, boolean z10) throws EOFException {
        C12930h c12930h;
        C12930h c12930hMo48002K1;
        Intrinsics.checkNotNullParameter(c12924e, "<this>");
        C12924e c12924e2 = new C12924e();
        C12930h c12930hM49094r = null;
        int i10 = 0;
        while (true) {
            if (!c12924e.mo48044o0(0L, f47124a)) {
                c12930h = f47125b;
                if (!c12924e.mo48044o0(0L, c12930h)) {
                    break;
                }
            }
            byte b = c12924e.readByte();
            if (c12930hM49094r == null) {
                c12930hM49094r = m49094r(b);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.m31980c(c12930hM49094r, c12930h);
        if (z11) {
            Intrinsics.checkNotNull(c12930hM49094r);
            c12924e2.mo48023d0(c12930hM49094r);
            c12924e2.mo48023d0(c12930hM49094r);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(c12930hM49094r);
            c12924e2.mo48023d0(c12930hM49094r);
        } else {
            long jMo48030h0 = c12924e.mo48030h0(f47126c);
            if (c12930hM49094r == null) {
                c12930hM49094r = jMo48030h0 == -1 ? m49095s(C12931h0.f45835c) : m49094r(c12924e.m48033j(jMo48030h0));
            }
            if (m49092p(c12924e, c12930hM49094r)) {
                if (jMo48030h0 == 2) {
                    c12924e2.write(c12924e, 3L);
                } else {
                    c12924e2.write(c12924e, 2L);
                }
            }
            Unit unit = Unit.f29331a;
        }
        boolean z12 = c12924e2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c12924e.mo48016Z1()) {
            long jMo48030h1 = c12924e.mo48030h0(f47126c);
            if (jMo48030h1 == -1) {
                c12930hMo48002K1 = c12924e.mo47997F2();
            } else {
                c12930hMo48002K1 = c12924e.mo48002K1(jMo48030h1);
                c12924e.readByte();
            }
            C12930h c12930h2 = f47128e;
            if (Intrinsics.m31980c(c12930hMo48002K1, c12930h2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.m31980c(CollectionsKt.m31717o0(arrayList), c12930h2)))) {
                        arrayList.add(c12930hMo48002K1);
                    } else if (!z11 || arrayList.size() != 1) {
                        C7708u.m31928I(arrayList);
                    }
                }
            } else if (!Intrinsics.m31980c(c12930hMo48002K1, f47127d) && !Intrinsics.m31980c(c12930hMo48002K1, C12930h.f45830e)) {
                arrayList.add(c12930hMo48002K1);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c12924e2.mo48023d0(c12930hM49094r);
            }
            c12924e2.mo48023d0((C12930h) arrayList.get(i11));
        }
        if (c12924e2.getSize() == 0) {
            c12924e2.mo48023d0(f47127d);
        }
        return new C12931h0(c12924e2.mo47997F2());
    }

    /* JADX INFO: renamed from: r */
    public static final C12930h m49094r(byte b) {
        if (b == 47) {
            return f47124a;
        }
        if (b == 92) {
            return f47125b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b));
    }

    /* JADX INFO: renamed from: s */
    public static final C12930h m49095s(String str) {
        if (Intrinsics.m31980c(str, "/")) {
            return f47124a;
        }
        if (Intrinsics.m31980c(str, "\\")) {
            return f47125b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
