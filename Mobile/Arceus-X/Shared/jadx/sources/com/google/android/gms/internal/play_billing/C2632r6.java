package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2632r6 {
    /* JADX INFO: renamed from: a */
    public static String m11704a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b : bArr) {
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
