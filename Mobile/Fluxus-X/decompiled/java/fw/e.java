package fw;

import com.github.luben.zstd.BuildConfig;
import ew.b0;
import java.io.EOFException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lew/b0;", BuildConfig.FLAVOR, "o", "(Lew/b0;)I", BuildConfig.FLAVOR, "n", "(Lew/b0;)Z", "child", "normalize", "j", "(Lew/b0;Lew/b0;Z)Lew/b0;", BuildConfig.FLAVOR, "k", "(Ljava/lang/String;Z)Lew/b0;", "Lew/e;", "q", "(Lew/e;Z)Lew/b0;", "Lew/h;", "s", "(Ljava/lang/String;)Lew/h;", BuildConfig.FLAVOR, "r", "(B)Lew/h;", "slash", "p", "(Lew/e;Lew/h;)Z", "a", "Lew/h;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", "d", "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lew/b0;)Lew/h;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ew.h f16634a;

    @NotNull
    public static final ew.h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ew.h f16635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ew.h f16636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ew.h f16637e;

    static {
        ew.h.Companion companion = ew.h.INSTANCE;
        f16634a = companion.d("/");
        b = companion.d("\\");
        f16635c = companion.d("/\\");
        f16636d = companion.d(".");
        f16637e = companion.d("..");
    }

    @NotNull
    public static final b0 j(@NotNull b0 b0Var, @NotNull b0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.s() != null) {
            return child;
        }
        ew.h hVarM = m(b0Var);
        if (hVarM == null && (hVarM = m(child)) == null) {
            hVarM = s(b0.f14766c);
        }
        ew.e eVar = new ew.e();
        eVar.z1(b0Var.getBytes());
        if (eVar.getSize() > 0) {
            eVar.z1(hVarM);
        }
        eVar.z1(child.getBytes());
        return q(eVar, z10);
    }

    @NotNull
    public static final b0 k(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return q(new ew.e().D0(str), z10);
    }

    public static final int l(b0 b0Var) {
        int iA = ew.h.A(b0Var.getBytes(), f16634a, 0, 2, null);
        return iA != -1 ? iA : ew.h.A(b0Var.getBytes(), b, 0, 2, null);
    }

    public static final ew.h m(b0 b0Var) {
        ew.h bytes = b0Var.getBytes();
        ew.h hVar = f16634a;
        if (ew.h.v(bytes, hVar, 0, 2, null) != -1) {
            return hVar;
        }
        ew.h bytes2 = b0Var.getBytes();
        ew.h hVar2 = b;
        if (ew.h.v(bytes2, hVar2, 0, 2, null) != -1) {
            return hVar2;
        }
        return null;
    }

    public static final boolean n(b0 b0Var) {
        return b0Var.getBytes().h(f16637e) && (b0Var.getBytes().I() == 2 || b0Var.getBytes().C(b0Var.getBytes().I() + (-3), f16634a, 0, 1) || b0Var.getBytes().C(b0Var.getBytes().I() + (-3), b, 0, 1));
    }

    public static final int o(b0 b0Var) {
        if (b0Var.getBytes().I() == 0) {
            return -1;
        }
        if (b0Var.getBytes().k(0) == 47) {
            return 1;
        }
        if (b0Var.getBytes().k(0) == 92) {
            if (b0Var.getBytes().I() <= 2 || b0Var.getBytes().k(1) != 92) {
                return 1;
            }
            int iS = b0Var.getBytes().s(b, 2);
            return iS == -1 ? b0Var.getBytes().I() : iS;
        }
        if (b0Var.getBytes().I() > 2 && b0Var.getBytes().k(1) == 58 && b0Var.getBytes().k(2) == 92) {
            char cK = (char) b0Var.getBytes().k(0);
            if ('a' <= cK && cK < '{') {
                return 3;
            }
            if ('A' <= cK && cK < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final boolean p(ew.e eVar, ew.h hVar) {
        if (!Intrinsics.c(hVar, b) || eVar.getSize() < 2 || eVar.o(1L) != 58) {
            return false;
        }
        char cO = (char) eVar.o(0L);
        if ('a' > cO || cO >= '{') {
            return 'A' <= cO && cO < '[';
        }
        return true;
    }

    @NotNull
    public static final b0 q(@NotNull ew.e eVar, boolean z10) throws EOFException {
        ew.h hVar;
        ew.h hVarM1;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        ew.e eVar2 = new ew.e();
        ew.h hVarR = null;
        int i10 = 0;
        while (true) {
            if (!eVar.V1(0L, f16634a)) {
                hVar = b;
                if (!eVar.V1(0L, hVar)) {
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
            eVar2.z1(hVarR);
            eVar2.z1(hVarR);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(hVarR);
            eVar2.z1(hVarR);
        } else {
            long jB2 = eVar.B2(f16635c);
            if (hVarR == null) {
                hVarR = jB2 == -1 ? s(b0.f14766c) : r(eVar.o(jB2));
            }
            if (p(eVar, hVarR)) {
                if (jB2 == 2) {
                    eVar2.R2(eVar, 3L);
                } else {
                    eVar2.R2(eVar, 2L);
                }
            }
            Unit unit = Unit.f21506a;
        }
        boolean z12 = eVar2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.c2()) {
            long jB3 = eVar.B2(f16635c);
            if (jB3 == -1) {
                hVarM1 = eVar.J2();
            } else {
                hVarM1 = eVar.M1(jB3);
                eVar.readByte();
            }
            ew.h hVar2 = f16637e;
            if (Intrinsics.c(hVarM1, hVar2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.c(CollectionsKt.o0(arrayList), hVar2)))) {
                        arrayList.add(hVarM1);
                    } else if (!z11 || arrayList.size() != 1) {
                        p001kotlin.collections.u.I(arrayList);
                    }
                }
            } else if (!Intrinsics.c(hVarM1, f16636d) && !Intrinsics.c(hVarM1, ew.h.f14806e)) {
                arrayList.add(hVarM1);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar2.z1(hVarR);
            }
            eVar2.z1((ew.h) arrayList.get(i11));
        }
        if (eVar2.getSize() == 0) {
            eVar2.z1(f16636d);
        }
        return new b0(eVar2.J2());
    }

    public static final ew.h r(byte b10) {
        if (b10 == 47) {
            return f16634a;
        }
        if (b10 == 92) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    public static final ew.h s(String str) {
        if (Intrinsics.c(str, "/")) {
            return f16634a;
        }
        if (Intrinsics.c(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
