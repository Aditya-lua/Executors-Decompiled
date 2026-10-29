package p100eb;

/* JADX INFO: renamed from: eb.t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C5012t3 {
    /* JADX INFO: renamed from: a */
    public static String m23704a(AbstractC4970m3 abstractC4970m3) {
        StringBuilder sb2 = new StringBuilder(abstractC4970m3.mo23600d());
        for (int i10 = 0; i10 < abstractC4970m3.mo23600d(); i10++) {
            byte bMo23598b = abstractC4970m3.mo23598b(i10);
            if (bMo23598b == 34) {
                sb2.append("\\\"");
            } else if (bMo23598b == 39) {
                sb2.append("\\'");
            } else if (bMo23598b != 92) {
                switch (bMo23598b) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo23598b < 32 || bMo23598b > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo23598b >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo23598b >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo23598b & 7) + 48));
                        } else {
                            sb2.append((char) bMo23598b);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
