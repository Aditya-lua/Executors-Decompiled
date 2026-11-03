package wu;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vu.h0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lvu/h0;", "", "o", "(Lvu/h0;)I", "", "n", "(Lvu/h0;)Z", "child", "normalize", "j", "(Lvu/h0;Lvu/h0;Z)Lvu/h0;", "", "k", "(Ljava/lang/String;Z)Lvu/h0;", "Lvu/e;", "q", "(Lvu/e;Z)Lvu/h0;", "Lvu/h;", "s", "(Ljava/lang/String;)Lvu/h;", "", "r", "(B)Lvu/h;", "slash", "p", "(Lvu/e;Lvu/h;)Z", "a", "Lvu/h;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", "d", "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lvu/h0;)Lvu/h;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final vu.h f34999a;

    @NotNull
    public static final vu.h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final vu.h f35000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final vu.h f35001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final vu.h f35002e;

    static {
        vu.h.Companion companion = vu.h.INSTANCE;
        f34999a = companion.d("/");
        b = companion.d("\\");
        f35000c = companion.d("/\\");
        f35001d = companion.d(".");
        f35002e = companion.d("..");
    }

    @NotNull
    public static final h0 j(@NotNull h0 h0Var, @NotNull h0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.u() != null) {
            return child;
        }
        vu.h hVarM = m(h0Var);
        if (hVarM == null && (hVarM = m(child)) == null) {
            hVarM = s(h0.f33668c);
        }
        vu.e eVar = new vu.e();
        eVar.m2(h0Var.getBytes());
        if (eVar.getSize() > 0) {
            eVar.m2(hVarM);
        }
        eVar.m2(child.getBytes());
        return q(eVar, z10);
    }

    @NotNull
    public static final h0 k(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return q(new vu.e().y0(str), z10);
    }

    public static final int l(h0 h0Var) {
        int iA = vu.h.A(h0Var.getBytes(), f34999a, 0, 2, null);
        return iA != -1 ? iA : vu.h.A(h0Var.getBytes(), b, 0, 2, null);
    }

    public static final vu.h m(h0 h0Var) {
        vu.h bytes = h0Var.getBytes();
        vu.h hVar = f34999a;
        if (vu.h.v(bytes, hVar, 0, 2, null) != -1) {
            return hVar;
        }
        vu.h bytes2 = h0Var.getBytes();
        vu.h hVar2 = b;
        if (vu.h.v(bytes2, hVar2, 0, 2, null) != -1) {
            return hVar2;
        }
        return null;
    }

    public static final boolean n(h0 h0Var) {
        return h0Var.getBytes().h(f35002e) && (h0Var.getBytes().I() == 2 || h0Var.getBytes().C(h0Var.getBytes().I() + (-3), f34999a, 0, 1) || h0Var.getBytes().C(h0Var.getBytes().I() + (-3), b, 0, 1));
    }

    public static final int o(h0 h0Var) {
        if (h0Var.getBytes().I() == 0) {
            return -1;
        }
        if (h0Var.getBytes().j(0) == 47) {
            return 1;
        }
        if (h0Var.getBytes().j(0) == 92) {
            if (h0Var.getBytes().I() <= 2 || h0Var.getBytes().j(1) != 92) {
                return 1;
            }
            int iS = h0Var.getBytes().s(b, 2);
            return iS == -1 ? h0Var.getBytes().I() : iS;
        }
        if (h0Var.getBytes().I() > 2 && h0Var.getBytes().j(1) == 58 && h0Var.getBytes().j(2) == 92) {
            char cJ = (char) h0Var.getBytes().j(0);
            if ('a' <= cJ && cJ < '{') {
                return 3;
            }
            if ('A' <= cJ && cJ < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final boolean p(vu.e eVar, vu.h hVar) {
        if (!Intrinsics.c(hVar, b) || eVar.getSize() < 2 || eVar.j(1L) != 58) {
            return false;
        }
        char cJ = (char) eVar.j(0L);
        if ('a' > cJ || cJ >= '{') {
            return 'A' <= cJ && cJ < '[';
        }
        return true;
    }

    @NotNull
    public static final h0 q(@NotNull vu.e eVar, boolean z10) throws EOFException {
        vu.h hVar;
        vu.h hVarI1;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        vu.e eVar2 = new vu.e();
        vu.h hVarR = null;
        int i10 = 0;
        while (true) {
            if (!eVar.m1(0L, f34999a)) {
                hVar = b;
                if (!eVar.m1(0L, hVar)) {
                    break;
                }
            }
            byte b10 = eVar.readByte();
            if (hVarR == null) {
                hVarR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.c(hVarR, hVar);
        if (z11) {
            Intrinsics.checkNotNull(hVarR);
            eVar2.m2(hVarR);
            eVar2.m2(hVarR);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(hVarR);
            eVar2.m2(hVarR);
        } else {
            long jE1 = eVar.e1(f35000c);
            if (hVarR == null) {
                hVarR = jE1 == -1 ? s(h0.f33668c) : r(eVar.j(jE1));
            }
            if (p(eVar, hVarR)) {
                if (jE1 == 2) {
                    eVar2.write(eVar, 3L);
                } else {
                    eVar2.write(eVar, 2L);
                }
            }
            Unit unit = Unit.f22938a;
        }
        boolean z12 = eVar2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.a2()) {
            long jE2 = eVar.e1(f35000c);
            if (jE2 == -1) {
                hVarI1 = eVar.G2();
            } else {
                hVarI1 = eVar.I1(jE2);
                eVar.readByte();
            }
            vu.h hVar2 = f35002e;
            if (Intrinsics.c(hVarI1, hVar2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.c(CollectionsKt.o0(arrayList), hVar2)))) {
                        arrayList.add(hVarI1);
                    } else if (!z11 || arrayList.size() != 1) {
                        kotlin.collections.u.I(arrayList);
                    }
                }
            } else if (!Intrinsics.c(hVarI1, f35001d) && !Intrinsics.c(hVarI1, vu.h.f33665e)) {
                arrayList.add(hVarI1);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar2.m2(hVarR);
            }
            eVar2.m2((vu.h) arrayList.get(i11));
        }
        if (eVar2.getSize() == 0) {
            eVar2.m2(f35001d);
        }
        return new h0(eVar2.G2());
    }

    public static final vu.h r(byte b10) {
        if (b10 == 47) {
            return f34999a;
        }
        if (b10 == 92) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    public static final vu.h s(String str) {
        if (Intrinsics.c(str, "/")) {
            return f34999a;
        }
        if (Intrinsics.c(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
