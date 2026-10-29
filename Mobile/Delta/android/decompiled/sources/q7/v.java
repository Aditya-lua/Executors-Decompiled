package q7;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29274a = r7.c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final r7.c.a b = r7.c.a.a("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r7.c.a f29275c = r7.c.a.a("ty", "nm");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29276a;

        static {
            int[] iArr = new int[o7.e.b.values().length];
            f29276a = iArr;
            try {
                iArr[o7.e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29276a[o7.e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static o7.e a(f7.i iVar) {
        Rect rectB = iVar.b();
        List list = Collections.EMPTY_LIST;
        return new o7.e(list, iVar, "__container", -1L, o7.e.a.PRE_COMP, -1L, null, list, new m7.n(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, o7.e.b.NONE, null, false, null, null, n7.h.NORMAL);
    }

    public static o7.e b(r7.c cVar, f7.i iVar) {
        float f10;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        o7.e.b bVar = o7.e.b.NONE;
        n7.h hVar = n7.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.c();
        boolean z10 = false;
        o7.e.b bVar2 = bVar;
        n7.h hVar2 = hVar;
        float fH = 0.0f;
        float f11 = 0.0f;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        float fH4 = 0.0f;
        String strM = null;
        m7.j jVarD = null;
        m7.k kVarA = null;
        m7.b bVarF = null;
        n7.a aVarB = null;
        j jVarB = null;
        long j10 = 0;
        int iJ = 0;
        int iJ2 = 0;
        int color = 0;
        boolean zG = false;
        long j11 = -1;
        float fH5 = 1.0f;
        String strM2 = "UNSET";
        String strM3 = null;
        m7.n nVar = null;
        o7.e.a aVar = null;
        boolean z11 = false;
        while (cVar.f()) {
            switch (cVar.r(f29274a)) {
                case 0:
                    strM2 = cVar.m();
                    z10 = false;
                    break;
                case 1:
                    j10 = cVar.j();
                    z10 = false;
                    break;
                case 2:
                    strM = cVar.m();
                    z10 = false;
                    break;
                case 3:
                    f10 = fH5;
                    int iJ3 = cVar.j();
                    aVar = o7.e.a.UNKNOWN;
                    if (iJ3 < aVar.ordinal()) {
                        aVar = o7.e.a.values()[iJ3];
                    }
                    fH5 = f10;
                    z10 = false;
                    break;
                case 4:
                    j11 = cVar.j();
                    z10 = false;
                    break;
                case 5:
                    iJ = (int) (cVar.j() * s7.m.e());
                    z10 = false;
                    break;
                case 6:
                    iJ2 = (int) (cVar.j() * s7.m.e());
                    z10 = false;
                    break;
                case 7:
                    color = Color.parseColor(cVar.m());
                    z10 = false;
                    break;
                case 8:
                    nVar = c.g(cVar, iVar);
                    z10 = false;
                    break;
                case 9:
                    f10 = fH5;
                    int iJ4 = cVar.j();
                    if (iJ4 >= o7.e.b.values().length) {
                        iVar.a("Unsupported matte type: " + iJ4);
                    } else {
                        bVar2 = o7.e.b.values()[iJ4];
                        int i10 = a.f29276a[bVar2.ordinal()];
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
                        n7.c cVarA = h.a(cVar, iVar);
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
                        int iR = cVar.r(b);
                        if (iR == 0) {
                            jVarD = d.d(cVar, iVar);
                        } else if (iR != 1) {
                            cVar.s();
                            cVar.u();
                        } else {
                            cVar.b();
                            if (cVar.f()) {
                                kVarA = b.a(cVar, iVar);
                            }
                            while (cVar.f()) {
                                cVar.u();
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
                            int iR2 = cVar.r(f29275c);
                            if (iR2 == 0) {
                                int iJ5 = cVar.j();
                                if (iJ5 == 29) {
                                    aVarB = e.b(cVar, iVar);
                                } else if (iJ5 == 25) {
                                    jVarB = new k().b(cVar, iVar);
                                }
                            } else if (iR2 != 1) {
                                cVar.s();
                                cVar.u();
                            } else {
                                arrayList3.add(cVar.m());
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
                    fH2 = (float) (cVar.h() * ((double) s7.m.e()));
                    fH5 = f10;
                    z10 = false;
                    break;
                case 17:
                    f10 = fH5;
                    fH3 = (float) (cVar.h() * ((double) s7.m.e()));
                    fH5 = f10;
                    z10 = false;
                    break;
                case 18:
                    fH = (float) cVar.h();
                    break;
                case 19:
                    f11 = (float) cVar.h();
                    break;
                case 20:
                    bVarF = d.f(cVar, iVar, z10);
                    break;
                case 21:
                    strM3 = cVar.m();
                    break;
                case 22:
                    zG = cVar.g();
                    break;
                case 23:
                    z11 = cVar.j() != 1 ? z10 : true;
                    break;
                case 24:
                    int iJ6 = cVar.j();
                    if (iJ6 < n7.h.values().length) {
                        hVar2 = n7.h.values()[iJ6];
                    } else {
                        iVar.a("Unsupported Blend Mode: " + iJ6);
                        hVar2 = n7.h.NORMAL;
                    }
                    break;
                default:
                    cVar.s();
                    cVar.u();
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
            arrayList4.add(new t7.a(iVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fH)));
        }
        if (f11 <= 0.0f) {
            f11 = iVar.f();
        }
        arrayList4.add(new t7.a(iVar, fValueOf2, fValueOf2, null, fH, Float.valueOf(f11)));
        arrayList4.add(new t7.a(iVar, fValueOf, fValueOf, null, f11, Float.valueOf(Float.MAX_VALUE)));
        if (strM2.endsWith(".ai") || "ai".equals(strM3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z11 != 0) {
            if (nVar == null) {
                nVar = new m7.n();
            }
            nVar.m(z11);
        }
        return new o7.e(arrayList2, iVar, strM2, j10, aVar, j11, strM, arrayList, nVar, iJ, iJ2, color, f12, fH4, fH2, fH3, jVarD, kVarA, arrayList4, bVar2, bVarF, zG, aVarB, jVarB, hVar2);
    }
}
