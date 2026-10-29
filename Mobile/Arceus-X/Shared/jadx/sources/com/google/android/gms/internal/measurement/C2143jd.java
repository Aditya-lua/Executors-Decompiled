package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C2143jd {
    /* JADX INFO: renamed from: a */
    public static String m10304a(AbstractC2104ha abstractC2104ha) {
        StringBuilder sb2 = new StringBuilder(abstractC2104ha.mo9871d());
        for (int i10 = 0; i10 < abstractC2104ha.mo9871d(); i10++) {
            byte bMo9869b = abstractC2104ha.mo9869b(i10);
            if (bMo9869b == 34) {
                sb2.append("\\\"");
            } else if (bMo9869b == 39) {
                sb2.append("\\'");
            } else if (bMo9869b != 92) {
                switch (bMo9869b) {
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
                        if (bMo9869b < 32 || bMo9869b > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo9869b >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo9869b >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo9869b & 7) + 48));
                        } else {
                            sb2.append((char) bMo9869b);
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
