package p373q7;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p121f7.C5452i;
import p288m7.C8454b;
import p288m7.C8462j;
import p288m7.C8463k;
import p288m7.C8466n;
import p303n7.C8895a;
import p303n7.EnumC8902h;
import p303n7.InterfaceC8897c;
import p324o7.C9712e;
import p404r7.AbstractC10794c;
import p431s7.C11197m;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.v */
/* JADX INFO: loaded from: classes3.dex */
public class C10475v {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37674a = AbstractC10794c.a.m41143a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37675b = AbstractC10794c.a.m41143a("d", "a");

    /* JADX INFO: renamed from: c */
    public static final AbstractC10794c.a f37676c = AbstractC10794c.a.m41143a("ty", "nm");

    /* JADX INFO: renamed from: q7.v$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37677a;

        static {
            int[] iArr = new int[C9712e.b.values().length];
            f37677a = iArr;
            try {
                iArr[C9712e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37677a[C9712e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C9712e m40268a(C5452i c5452i) {
        Rect rectM25036b = c5452i.m25036b();
        List list = Collections.EMPTY_LIST;
        return new C9712e(list, c5452i, "__container", -1L, C9712e.a.PRE_COMP, -1L, null, list, new C8466n(), 0, 0, 0, 0.0f, 0.0f, rectM25036b.width(), rectM25036b.height(), null, null, list, C9712e.b.NONE, null, false, null, null, EnumC8902h.NORMAL);
    }

    /* JADX INFO: renamed from: b */
    public static C9712e m40269b(AbstractC10794c abstractC10794c, C5452i c5452i) {
        float f10;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        C9712e.b bVar = C9712e.b.NONE;
        EnumC8902h enumC8902h = EnumC8902h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        abstractC10794c.mo41128c();
        boolean z10 = false;
        C9712e.b bVar2 = bVar;
        EnumC8902h enumC8902h2 = enumC8902h;
        float fMo41133h = 0.0f;
        float fM25040f = 0.0f;
        float fMo41133h2 = 0.0f;
        float fMo41133h3 = 0.0f;
        float fMo41133h4 = 0.0f;
        String strMo41136m = null;
        C8462j c8462jM40209d = null;
        C8463k c8463kM40194a = null;
        C8454b c8454bM40211f = null;
        C8895a c8895aM40219b = null;
        C10458j c10458jM40236b = null;
        long jMo41134j = 0;
        int iMo41134j = 0;
        int iMo41134j2 = 0;
        int color = 0;
        boolean zMo41132g = false;
        long jMo41134j2 = -1;
        float fMo41133h5 = 1.0f;
        String strMo41136m2 = "UNSET";
        String strMo41136m3 = null;
        C8466n c8466n = null;
        C9712e.a aVar = null;
        boolean z11 = false;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37674a)) {
                case 0:
                    strMo41136m2 = abstractC10794c.mo41136m();
                    z10 = false;
                    break;
                case 1:
                    jMo41134j = abstractC10794c.mo41134j();
                    z10 = false;
                    break;
                case 2:
                    strMo41136m = abstractC10794c.mo41136m();
                    z10 = false;
                    break;
                case 3:
                    f10 = fMo41133h5;
                    int iMo41134j3 = abstractC10794c.mo41134j();
                    aVar = C9712e.a.UNKNOWN;
                    if (iMo41134j3 < aVar.ordinal()) {
                        aVar = C9712e.a.values()[iMo41134j3];
                    }
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 4:
                    jMo41134j2 = abstractC10794c.mo41134j();
                    z10 = false;
                    break;
                case 5:
                    iMo41134j = (int) (abstractC10794c.mo41134j() * C11197m.m42216e());
                    z10 = false;
                    break;
                case 6:
                    iMo41134j2 = (int) (abstractC10794c.mo41134j() * C11197m.m42216e());
                    z10 = false;
                    break;
                case 7:
                    color = Color.parseColor(abstractC10794c.mo41136m());
                    z10 = false;
                    break;
                case 8:
                    c8466n = C10444c.m40204g(abstractC10794c, c5452i);
                    z10 = false;
                    break;
                case 9:
                    f10 = fMo41133h5;
                    int iMo41134j4 = abstractC10794c.mo41134j();
                    if (iMo41134j4 >= C9712e.b.values().length) {
                        c5452i.m25035a("Unsupported matte type: " + iMo41134j4);
                    } else {
                        bVar2 = C9712e.b.values()[iMo41134j4];
                        int i10 = a.f37677a[bVar2.ordinal()];
                        if (i10 == 1) {
                            c5452i.m25035a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            c5452i.m25035a("Unsupported matte type: Luma Inverted");
                        }
                        c5452i.m25052r(1);
                    }
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 10:
                    f10 = fMo41133h5;
                    abstractC10794c.mo41127b();
                    while (abstractC10794c.mo41131f()) {
                        arrayList.add(C10477x.m40276a(abstractC10794c, c5452i));
                    }
                    c5452i.m25052r(arrayList.size());
                    abstractC10794c.mo41129d();
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 11:
                    f10 = fMo41133h5;
                    abstractC10794c.mo41127b();
                    while (abstractC10794c.mo41131f()) {
                        InterfaceC8897c interfaceC8897cM40225a = C10454h.m40225a(abstractC10794c, c5452i);
                        if (interfaceC8897cM40225a != null) {
                            arrayList2.add(interfaceC8897cM40225a);
                        }
                    }
                    abstractC10794c.mo41129d();
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 12:
                    f10 = fMo41133h5;
                    abstractC10794c.mo41128c();
                    while (abstractC10794c.mo41131f()) {
                        int iMo41139r = abstractC10794c.mo41139r(f37675b);
                        if (iMo41139r == 0) {
                            c8462jM40209d = C10446d.m40209d(abstractC10794c, c5452i);
                        } else if (iMo41139r != 1) {
                            abstractC10794c.mo41140s();
                            abstractC10794c.mo41141u();
                        } else {
                            abstractC10794c.mo41127b();
                            if (abstractC10794c.mo41131f()) {
                                c8463kM40194a = C10442b.m40194a(abstractC10794c, c5452i);
                            }
                            while (abstractC10794c.mo41131f()) {
                                abstractC10794c.mo41141u();
                            }
                            abstractC10794c.mo41129d();
                        }
                    }
                    abstractC10794c.mo41130e();
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 13:
                    f10 = fMo41133h5;
                    abstractC10794c.mo41127b();
                    ArrayList arrayList3 = new ArrayList();
                    while (abstractC10794c.mo41131f()) {
                        abstractC10794c.mo41128c();
                        while (abstractC10794c.mo41131f()) {
                            int iMo41139r2 = abstractC10794c.mo41139r(f37676c);
                            if (iMo41139r2 == 0) {
                                int iMo41134j5 = abstractC10794c.mo41134j();
                                if (iMo41134j5 == 29) {
                                    c8895aM40219b = C10448e.m40219b(abstractC10794c, c5452i);
                                } else if (iMo41134j5 == 25) {
                                    c10458jM40236b = new C10460k().m40236b(abstractC10794c, c5452i);
                                }
                            } else if (iMo41139r2 != 1) {
                                abstractC10794c.mo41140s();
                                abstractC10794c.mo41141u();
                            } else {
                                arrayList3.add(abstractC10794c.mo41136m());
                            }
                        }
                        abstractC10794c.mo41130e();
                    }
                    abstractC10794c.mo41129d();
                    c5452i.m25035a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 14:
                    fMo41133h5 = (float) abstractC10794c.mo41133h();
                    z10 = false;
                    break;
                case 15:
                    fMo41133h4 = (float) abstractC10794c.mo41133h();
                    z10 = false;
                    break;
                case 16:
                    f10 = fMo41133h5;
                    fMo41133h2 = (float) (abstractC10794c.mo41133h() * ((double) C11197m.m42216e()));
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 17:
                    f10 = fMo41133h5;
                    fMo41133h3 = (float) (abstractC10794c.mo41133h() * ((double) C11197m.m42216e()));
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
                case 18:
                    fMo41133h = (float) abstractC10794c.mo41133h();
                    break;
                case 19:
                    fM25040f = (float) abstractC10794c.mo41133h();
                    break;
                case 20:
                    c8454bM40211f = C10446d.m40211f(abstractC10794c, c5452i, z10);
                    break;
                case 21:
                    strMo41136m3 = abstractC10794c.mo41136m();
                    break;
                case 22:
                    zMo41132g = abstractC10794c.mo41132g();
                    break;
                case 23:
                    z11 = abstractC10794c.mo41134j() != 1 ? z10 : true;
                    break;
                case 24:
                    int iMo41134j6 = abstractC10794c.mo41134j();
                    if (iMo41134j6 < EnumC8902h.values().length) {
                        enumC8902h2 = EnumC8902h.values()[iMo41134j6];
                    } else {
                        c5452i.m25035a("Unsupported Blend Mode: " + iMo41134j6);
                        enumC8902h2 = EnumC8902h.NORMAL;
                    }
                    break;
                default:
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                    f10 = fMo41133h5;
                    fMo41133h5 = f10;
                    z10 = false;
                    break;
            }
        }
        float f11 = fMo41133h5;
        abstractC10794c.mo41130e();
        ArrayList arrayList4 = new ArrayList();
        if (fMo41133h > 0.0f) {
            arrayList4.add(new C11550a(c5452i, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fMo41133h)));
        }
        if (fM25040f <= 0.0f) {
            fM25040f = c5452i.m25040f();
        }
        arrayList4.add(new C11550a(c5452i, fValueOf2, fValueOf2, null, fMo41133h, Float.valueOf(fM25040f)));
        arrayList4.add(new C11550a(c5452i, fValueOf, fValueOf, null, fM25040f, Float.valueOf(Float.MAX_VALUE)));
        if (strMo41136m2.endsWith(".ai") || "ai".equals(strMo41136m3)) {
            c5452i.m25035a("Convert your Illustrator layers to shape layers.");
        }
        if (z11 != 0) {
            if (c8466n == null) {
                c8466n = new C8466n();
            }
            c8466n.m34254m(z11);
        }
        return new C9712e(arrayList2, c5452i, strMo41136m2, jMo41134j, aVar, jMo41134j2, strMo41136m, arrayList, c8466n, iMo41134j, iMo41134j2, color, f11, fMo41133h4, fMo41133h2, fMo41133h3, c8462jM40209d, c8463kM40194a, arrayList4, bVar2, c8454bM40211f, zMo41132g, c8895aM40219b, c10458jM40236b, enumC8902h2);
    }
}
