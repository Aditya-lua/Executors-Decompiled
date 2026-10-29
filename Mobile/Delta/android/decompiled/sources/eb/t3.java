package eb;

/* JADX INFO: loaded from: classes.dex */
public final class t3 {
    public static String a(m3 m3Var) {
        StringBuilder sb2 = new StringBuilder(m3Var.d());
        for (int i10 = 0; i10 < m3Var.d(); i10++) {
            byte b = m3Var.b(i10);
            if (b == 34) {
                sb2.append("\\\"");
            } else if (b == 39) {
                sb2.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b < 32 || b > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b >>> 6) & 3) + 48));
                            sb2.append((char) (((b >>> 3) & 7) + 48));
                            sb2.append((char) ((b & 7) + 48));
                        } else {
                            sb2.append((char) b);
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
