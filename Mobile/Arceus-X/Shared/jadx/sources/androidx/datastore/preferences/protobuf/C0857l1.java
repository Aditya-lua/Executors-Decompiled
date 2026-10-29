package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0857l1 {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l1$a */
    public class a implements b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0840g f2953a;

        public a(AbstractC0840g abstractC0840g) {
            this.f2953a = abstractC0840g;
        }

        @Override // androidx.datastore.preferences.protobuf.C0857l1.b
        /* JADX INFO: renamed from: a */
        public byte mo3876a(int i10) {
            return this.f2953a.mo3449b(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0857l1.b
        public int size() {
            return this.f2953a.size();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l1$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        byte mo3876a(int i10);

        int size();
    }

    /* JADX INFO: renamed from: a */
    public static String m3873a(AbstractC0840g abstractC0840g) {
        return m3874b(new a(abstractC0840g));
    }

    /* JADX INFO: renamed from: b */
    public static String m3874b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte bMo3876a = bVar.mo3876a(i10);
            if (bMo3876a == 34) {
                sb2.append("\\\"");
            } else if (bMo3876a == 39) {
                sb2.append("\\'");
            } else if (bMo3876a != 92) {
                switch (bMo3876a) {
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
                        if (bMo3876a < 32 || bMo3876a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo3876a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo3876a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo3876a & 7) + 48));
                        } else {
                            sb2.append((char) bMo3876a);
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
    public static String m3875c(String str) {
        return m3873a(AbstractC0840g.m3445g(str));
    }
}
