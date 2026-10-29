package q7;

/* JADX INFO: loaded from: classes3.dex */
public class x {
    public static n7.i a(r7.c cVar, f7.i iVar) {
        cVar.c();
        n7.i.a aVar = null;
        m7.h hVarK = null;
        m7.d dVarH = null;
        boolean zG = false;
        while (cVar.f()) {
            String strL = cVar.l();
            strL.getClass();
            switch (strL) {
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
                    String strM = cVar.m();
                    strM.getClass();
                    switch (strM) {
                        case "a":
                            aVar = n7.i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = n7.i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = n7.i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = n7.i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            s7.e.c("Unknown mask mode " + strL + ". Defaulting to Add.");
                            aVar = n7.i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    cVar.u();
                    break;
            }
        }
        cVar.e();
        return new n7.i(aVar, hVarK, dVarH, zG);
    }
}
