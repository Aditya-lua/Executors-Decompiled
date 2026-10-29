package p373q7;

import p121f7.C5452i;
import p288m7.C8456d;
import p288m7.C8460h;
import p303n7.C8903i;
import p404r7.AbstractC10794c;
import p431s7.C11189e;

/* JADX INFO: renamed from: q7.x */
/* JADX INFO: loaded from: classes3.dex */
public class C10477x {
    /* JADX INFO: renamed from: a */
    public static C8903i m40276a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        abstractC10794c.mo41128c();
        C8903i.a aVar = null;
        C8460h c8460hM40216k = null;
        C8456d c8456dM40213h = null;
        boolean zMo41132g = false;
        while (abstractC10794c.mo41131f()) {
            String strMo41135l = abstractC10794c.mo41135l();
            strMo41135l.getClass();
            switch (strMo41135l) {
                case "o":
                    c8456dM40213h = C10446d.m40213h(abstractC10794c, c5452i);
                    break;
                case "pt":
                    c8460hM40216k = C10446d.m40216k(abstractC10794c, c5452i);
                    break;
                case "inv":
                    zMo41132g = abstractC10794c.mo41132g();
                    break;
                case "mode":
                    String strMo41136m = abstractC10794c.mo41136m();
                    strMo41136m.getClass();
                    switch (strMo41136m) {
                        case "a":
                            aVar = C8903i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            c5452i.m25035a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = C8903i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = C8903i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = C8903i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            C11189e.m42153c("Unknown mask mode " + strMo41135l + ". Defaulting to Add.");
                            aVar = C8903i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        abstractC10794c.mo41130e();
        return new C8903i(aVar, c8460hM40216k, c8456dM40213h, zMo41132g);
    }
}
