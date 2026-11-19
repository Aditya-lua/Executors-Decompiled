package r7;

/* JADX INFO: loaded from: classes3.dex */
public class x {
    public static o7.i a(s7.c cVar, g7.i iVar) {
        cVar.c();
        o7.i.a aVar = null;
        n7.h hVarK = null;
        n7.d dVarH = null;
        boolean zG = false;
        while (cVar.f()) {
            String strM = cVar.m();
            strM.getClass();
            switch (strM) {
                case "o":
                    dVarH = d.h(cVar, iVar);
                    break;
                case "pt":
                    hVarK = d.k(cVar, iVar);
                    break;
                case "inv":
                    zG = cVar.g();
                    break;
                case "mode":
                    String strN = cVar.n();
                    strN.getClass();
                    switch (strN) {
                        case "a":
                            aVar = o7.i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = o7.i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = o7.i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = o7.i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            t7.e.c("Unknown mask mode " + strM + ". Defaulting to Add.");
                            aVar = o7.i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    cVar.w();
                    break;
            }
        }
        cVar.e();
        return new o7.i(aVar, hVarK, dVarH, zG);
    }
}
