package r7;

import android.graphics.Color;
import android.graphics.Rect;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30604a = s7.c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final s7.c.a b = s7.c.a.a("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s7.c.a f30605c = s7.c.a.a("ty", "nm");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30606a;

        static {
            int[] iArr = new int[p7.e.b.values().length];
            f30606a = iArr;
            try {
                iArr[p7.e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30606a[p7.e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static p7.e a(g7.i iVar) {
        Rect rectB = iVar.b();
        List list = Collections.EMPTY_LIST;
        return new p7.e(list, iVar, "__container", -1L, p7.e.a.PRE_COMP, -1L, null, list, new n7.n(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, p7.e.b.NONE, null, false, null, null, o7.h.NORMAL);
    }

    public static p7.e b(s7.c cVar, g7.i iVar) {
        float f10;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        p7.e.b bVar = p7.e.b.NONE;
        o7.h hVar = o7.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.c();
        boolean z10 = false;
        p7.e.b bVar2 = bVar;
        o7.h hVar2 = hVar;
        float fH = 0.0f;
        float f11 = 0.0f;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        float fH4 = 0.0f;
        String strN = null;
        n7.j jVarD = null;
        n7.k kVarA = null;
        n7.b bVarF = null;
        o7.a aVarB = null;
        j jVarB = null;
        long jK = 0;
        int iK = 0;
        int iK2 = 0;
        int color = 0;
        boolean zG = false;
        long jK2 = -1;
        float fH5 = 1.0f;
        String strN2 = "UNSET";
        String strN3 = null;
        n7.n nVar = null;
        p7.e.a aVar = null;
        boolean z11 = false;
        while (cVar.f()) {
            switch (cVar.s(f30604a)) {
                case 0:
                    strN2 = cVar.n();
                    z10 = false;
                    break;
                case 1:
                    jK = cVar.k();
                    z10 = false;
                    break;
                case 2:
                    strN = cVar.n();
                    z10 = false;
                    break;
                case 3:
                    f10 = fH5;
                    int iK3 = cVar.k();
                    aVar = p7.e.a.UNKNOWN;
                    if (iK3 < aVar.ordinal()) {
                        aVar = p7.e.a.values()[iK3];
                    }
                    fH5 = f10;
                    z10 = false;
                    break;
                case 4:
                    jK2 = cVar.k();
                    z10 = false;
                    break;
                case 5:
                    iK = (int) (cVar.k() * t7.m.e());
                    z10 = false;
                    break;
                case 6:
                    iK2 = (int) (cVar.k() * t7.m.e());
                    z10 = false;
                    break;
                case 7:
                    color = Color.parseColor(cVar.n());
                    z10 = false;
                    break;
                case 8:
                    nVar = c.g(cVar, iVar);
                    z10 = false;
                    break;
                case 9:
                    f10 = fH5;
                    int iK4 = cVar.k();
                    if (iK4 >= p7.e.b.values().length) {
                        iVar.a("Unsupported matte type: " + iK4);
                    } else {
                        bVar2 = p7.e.b.values()[iK4];
                        int i10 = a.f30606a[bVar2.ordinal()];
                        if (i10 == 1) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        iVar.r(1);
                    }
                    fH5 = f10;
                    z10 = false;
                    break;
                case 10:
                    f10 = fH5;
                    cVar.b();
                    while (cVar.f()) {
                        arrayList.add(x.a(cVar, iVar));
                    }
                    iVar.r(arrayList.size());
                    cVar.d();
                    fH5 = f10;
                    z10 = false;
                    break;
                case 11:
                    f10 = fH5;
                    cVar.b();
                    while (cVar.f()) {
                        o7.c cVarA = h.a(cVar, iVar);
                        if (cVarA != null) {
                            arrayList2.add(cVarA);
                        }
                    }
                    cVar.d();
                    fH5 = f10;
                    z10 = false;
                    break;
                case 12:
                    f10 = fH5;
                    cVar.c();
                    while (cVar.f()) {
                        int iS = cVar.s(b);
                        if (iS == 0) {
                            jVarD = d.d(cVar, iVar);
                        } else if (iS != 1) {
                            cVar.u();
                            cVar.w();
                        } else {
                            cVar.b();
                            if (cVar.f()) {
                                kVarA = b.a(cVar, iVar);
                            }
                            while (cVar.f()) {
                                cVar.w();
                            }
                            cVar.d();
                        }
                    }
                    cVar.e();
                    fH5 = f10;
                    z10 = false;
                    break;
                case 13:
                    f10 = fH5;
                    cVar.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.f()) {
                        cVar.c();
                        while (cVar.f()) {
                            int iS2 = cVar.s(f30605c);
                            if (iS2 == 0) {
                                int iK5 = cVar.k();
                                if (iK5 == 29) {
                                    aVarB = e.b(cVar, iVar);
                                } else if (iK5 == 25) {
                                    jVarB = new k().b(cVar, iVar);
                                }
                            } else if (iS2 != 1) {
                                cVar.u();
                                cVar.w();
                            } else {
                                arrayList3.add(cVar.n());
                            }
                        }
                        cVar.e();
                    }
                    cVar.d();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fH5 = f10;
                    z10 = false;
                    break;
                case 14:
                    fH5 = (float) cVar.h();
                    z10 = false;
                    break;
                case 15:
                    fH4 = (float) cVar.h();
                    z10 = false;
                    break;
                case 16:
                    f10 = fH5;
                    fH2 = (float) (cVar.h() * ((double) t7.m.e()));
                    fH5 = f10;
                    z10 = false;
                    break;
                case 17:
                    f10 = fH5;
                    fH3 = (float) (cVar.h() * ((double) t7.m.e()));
                    fH5 = f10;
                    z10 = false;
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    fH = (float) cVar.h();
                    break;
                case 19:
                    f11 = (float) cVar.h();
                    break;
                case 20:
                    bVarF = d.f(cVar, iVar, z10);
                    break;
                case 21:
                    strN3 = cVar.n();
                    break;
                case 22:
                    zG = cVar.g();
                    break;
                case 23:
                    z11 = cVar.k() != 1 ? z10 : true;
                    break;
                case 24:
                    int iK6 = cVar.k();
                    if (iK6 < o7.h.values().length) {
                        hVar2 = o7.h.values()[iK6];
                    } else {
                        iVar.a("Unsupported Blend Mode: " + iK6);
                        hVar2 = o7.h.NORMAL;
                    }
                    break;
                default:
                    cVar.u();
                    cVar.w();
                    f10 = fH5;
                    fH5 = f10;
                    z10 = false;
                    break;
            }
        }
        float f12 = fH5;
        cVar.e();
        ArrayList arrayList4 = new ArrayList();
        if (fH > 0.0f) {
            arrayList4.add(new u7.a(iVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fH)));
        }
        if (f11 <= 0.0f) {
            f11 = iVar.f();
        }
        arrayList4.add(new u7.a(iVar, fValueOf2, fValueOf2, null, fH, Float.valueOf(f11)));
        arrayList4.add(new u7.a(iVar, fValueOf, fValueOf, null, f11, Float.valueOf(Float.MAX_VALUE)));
        if (strN2.endsWith(".ai") || "ai".equals(strN3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z11 != 0) {
            if (nVar == null) {
                nVar = new n7.n();
            }
            nVar.m(z11);
        }
        return new p7.e(arrayList2, iVar, strN2, jK, aVar, jK2, strN, arrayList, nVar, iK, iK2, color, f12, fH4, fH2, fH3, jVarD, kVarA, arrayList4, bVar2, bVarF, zG, aVarB, jVarB, hVar2);
    }
}
