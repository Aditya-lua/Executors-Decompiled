package p373q7;

import p121f7.C5452i;
import p303n7.InterfaceC8897c;
import p404r7.AbstractC10794c;
import p431s7.C11189e;

/* JADX INFO: renamed from: q7.h */
/* JADX INFO: loaded from: classes3.dex */
public class C10454h {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37633a = AbstractC10794c.a.m41143a("ty", "d");

    /* JADX INFO: renamed from: a */
    public static InterfaceC8897c m40225a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        InterfaceC8897c interfaceC8897cM40221a;
        String strMo41136m;
        abstractC10794c.mo41128c();
        byte b = 2;
        int iMo41134j = 2;
        while (true) {
            interfaceC8897cM40221a = null;
            if (!abstractC10794c.mo41131f()) {
                strMo41136m = null;
                break;
            }
            int iMo41139r = abstractC10794c.mo41139r(f37633a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
                break;
            }
            if (iMo41139r != 1) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                iMo41134j = abstractC10794c.mo41134j();
            }
        }
        if (strMo41136m == null) {
            return null;
        }
        switch (strMo41136m.hashCode()) {
            case 3239:
                b = !strMo41136m.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strMo41136m.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strMo41136m.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strMo41136m.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strMo41136m.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strMo41136m.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strMo41136m.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strMo41136m.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strMo41136m.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strMo41136m.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strMo41136m.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strMo41136m.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strMo41136m.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strMo41136m.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                interfaceC8897cM40221a = C10450f.m40221a(abstractC10794c, c5452i, iMo41134j);
                break;
            case 1:
                interfaceC8897cM40221a = C10457i0.m40228a(abstractC10794c, c5452i);
                break;
            case 2:
                interfaceC8897cM40221a = C10469p.m40248a(abstractC10794c, c5452i);
                break;
            case 3:
                interfaceC8897cM40221a = C10459j0.m40234a(abstractC10794c, c5452i);
                break;
            case 4:
                interfaceC8897cM40221a = C10470q.m40249a(abstractC10794c, c5452i);
                break;
            case 5:
                interfaceC8897cM40221a = C10478y.m40277a(abstractC10794c);
                c5452i.m25035a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                interfaceC8897cM40221a = C10447d0.m40217a(abstractC10794c, c5452i);
                break;
            case 7:
                interfaceC8897cM40221a = C10451f0.m40222a(abstractC10794c, c5452i);
                break;
            case 8:
                interfaceC8897cM40221a = C10449e0.m40220a(abstractC10794c, c5452i);
                break;
            case 9:
                interfaceC8897cM40221a = C10461k0.m40237a(abstractC10794c, c5452i);
                break;
            case 10:
                interfaceC8897cM40221a = C10445c0.m40205a(abstractC10794c, c5452i, iMo41134j);
                break;
            case 11:
                interfaceC8897cM40221a = C10463l0.m40239a(abstractC10794c, c5452i);
                break;
            case 12:
                interfaceC8897cM40221a = C10465m0.m40241a(abstractC10794c, c5452i);
                break;
            case 13:
                interfaceC8897cM40221a = C10444c.m40204g(abstractC10794c, c5452i);
                break;
            default:
                C11189e.m42153c("Unknown shape type " + strMo41136m);
                break;
        }
        while (abstractC10794c.mo41131f()) {
            abstractC10794c.mo41141u();
        }
        abstractC10794c.mo41130e();
        return interfaceC8897cM40221a;
    }
}
