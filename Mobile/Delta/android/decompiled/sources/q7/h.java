package q7;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29242a = r7.c.a.a("ty", "d");

    public static n7.c a(r7.c cVar, f7.i iVar) {
        n7.c cVarA;
        String strM;
        cVar.c();
        byte b = 2;
        int iJ = 2;
        while (true) {
            cVarA = null;
            if (!cVar.f()) {
                strM = null;
                break;
            }
            int iR = cVar.r(f29242a);
            if (iR == 0) {
                strM = cVar.m();
                break;
            }
            if (iR != 1) {
                cVar.s();
                cVar.u();
            } else {
                iJ = cVar.j();
            }
        }
        if (strM == null) {
            return null;
        }
        switch (strM.hashCode()) {
            case 3239:
                b = !strM.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strM.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strM.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strM.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strM.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strM.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strM.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strM.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strM.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strM.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strM.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strM.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strM.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strM.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                cVarA = f.a(cVar, iVar, iJ);
                break;
            case 1:
                cVarA = i0.a(cVar, iVar);
                break;
            case 2:
                cVarA = p.a(cVar, iVar);
                break;
            case 3:
                cVarA = j0.a(cVar, iVar);
                break;
            case 4:
                cVarA = q.a(cVar, iVar);
                break;
            case 5:
                cVarA = y.a(cVar);
                iVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVarA = d0.a(cVar, iVar);
                break;
            case 7:
                cVarA = f0.a(cVar, iVar);
                break;
            case 8:
                cVarA = e0.a(cVar, iVar);
                break;
            case 9:
                cVarA = k0.a(cVar, iVar);
                break;
            case 10:
                cVarA = c0.a(cVar, iVar, iJ);
                break;
            case 11:
                cVarA = l0.a(cVar, iVar);
                break;
            case 12:
                cVarA = m0.a(cVar, iVar);
                break;
            case 13:
                cVarA = c.g(cVar, iVar);
                break;
            default:
                s7.e.c("Unknown shape type " + strM);
                break;
        }
        while (cVar.f()) {
            cVar.u();
        }
        cVar.e();
        return cVarA;
    }
}
