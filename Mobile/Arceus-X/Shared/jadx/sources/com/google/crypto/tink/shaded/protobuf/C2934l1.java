package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2934l1 {

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l1$a */
    public class a implements b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC2920h f10942a;

        public a(AbstractC2920h abstractC2920h) {
            this.f10942a = abstractC2920h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2934l1.b
        /* JADX INFO: renamed from: a */
        public byte mo13959a(int i10) {
            return this.f10942a.mo13561b(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2934l1.b
        public int size() {
            return this.f10942a.size();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l1$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        byte mo13959a(int i10);

        int size();
    }

    /* JADX INFO: renamed from: a */
    public static String m13956a(AbstractC2920h abstractC2920h) {
        return m13957b(new a(abstractC2920h));
    }

    /* JADX INFO: renamed from: b */
    public static String m13957b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte bMo13959a = bVar.mo13959a(i10);
            if (bMo13959a == 34) {
                sb2.append("\\\"");
            } else if (bMo13959a == 39) {
                sb2.append("\\'");
            } else if (bMo13959a != 92) {
                switch (bMo13959a) {
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
                        if (bMo13959a < 32 || bMo13959a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo13959a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo13959a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo13959a & 7) + 48));
                        } else {
                            sb2.append((char) bMo13959a);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m13958c(String str) {
        return m13956a(AbstractC2920h.m13557g(str));
    }
}
