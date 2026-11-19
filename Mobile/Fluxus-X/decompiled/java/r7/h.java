package r7;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30572a = s7.c.a.a("ty", "d");

    public static o7.c a(s7.c cVar, g7.i iVar) {
        o7.c cVarA;
        String strN;
        cVar.c();
        byte b = 2;
        int iK = 2;
        while (true) {
            cVarA = null;
            if (!cVar.f()) {
                strN = null;
                break;
            }
            int iS = cVar.s(f30572a);
            if (iS == 0) {
                strN = cVar.n();
                break;
            }
            if (iS != 1) {
                cVar.u();
                cVar.w();
            } else {
                iK = cVar.k();
            }
        }
        if (strN == null) {
            return null;
        }
        switch (strN.hashCode()) {
            case 3239:
                b = !strN.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strN.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strN.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strN.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strN.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strN.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strN.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strN.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strN.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strN.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strN.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strN.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strN.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strN.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                cVarA = f.a(cVar, iVar, iK);
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
                cVarA = c0.a(cVar, iVar, iK);
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
                t7.e.c("Unknown shape type " + strN);
                break;
        }
        while (cVar.f()) {
            cVar.w();
        }
        cVar.e();
        return cVarA;
    }
}
