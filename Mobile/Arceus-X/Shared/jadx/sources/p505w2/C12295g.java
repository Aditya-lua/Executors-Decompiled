package p505w2;

import java.util.Locale;

/* JADX INFO: renamed from: w2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12295g {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC12294f f43561a = new e(null, false);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC12294f f43562b = new e(null, true);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC12294f f43563c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC12294f f43564d;

    /* JADX INFO: renamed from: e */
    public static final InterfaceC12294f f43565e;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC12294f f43566f;

    /* JADX INFO: renamed from: w2.g$a */
    public static class a implements c {

        /* JADX INFO: renamed from: b */
        public static final a f43567b = new a(true);

        /* JADX INFO: renamed from: a */
        public final boolean f43568a;

        public a(boolean z10) {
            this.f43568a = z10;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0023 */
        @Override // p505w2.C12295g.c
        /* JADX INFO: renamed from: a */
        public int mo45682a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iM45680a = C12295g.m45680a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iM45680a != 0) {
                    if (iM45680a != 1) {
                        continue;
                    } else if (!this.f43568a) {
                        return 1;
                    }
                    i10++;
                    z10 = z10;
                } else if (this.f43568a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f43568a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: w2.g$b */
    public static class b implements c {

        /* JADX INFO: renamed from: a */
        public static final b f43569a = new b();

        @Override // p505w2.C12295g.c
        /* JADX INFO: renamed from: a */
        public int mo45682a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iM45681b = 2;
            while (i10 < i12 && iM45681b == 2) {
                iM45681b = C12295g.m45681b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iM45681b;
        }
    }

    /* JADX INFO: renamed from: w2.g$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        int mo45682a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: renamed from: w2.g$d */
    public static abstract class d implements InterfaceC12294f {

        /* JADX INFO: renamed from: a */
        public final c f43570a;

        public d(c cVar) {
            this.f43570a = cVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo45683a();

        /* JADX INFO: renamed from: b */
        public final boolean m45684b(CharSequence charSequence, int i10, int i11) {
            int iMo45682a = this.f43570a.mo45682a(charSequence, i10, i11);
            if (iMo45682a == 0) {
                return true;
            }
            if (iMo45682a != 1) {
                return mo45683a();
            }
            return false;
        }

        @Override // p505w2.InterfaceC12294f
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f43570a == null ? mo45683a() : m45684b(charSequence, i10, i11);
        }
    }

    /* JADX INFO: renamed from: w2.g$e */
    public static class e extends d {

        /* JADX INFO: renamed from: b */
        public final boolean f43571b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f43571b = z10;
        }

        @Override // p505w2.C12295g.d
        /* JADX INFO: renamed from: a */
        public boolean mo45683a() {
            return this.f43571b;
        }
    }

    /* JADX INFO: renamed from: w2.g$f */
    public static class f extends d {

        /* JADX INFO: renamed from: b */
        public static final f f43572b = new f();

        public f() {
            super(null);
        }

        @Override // p505w2.C12295g.d
        /* JADX INFO: renamed from: a */
        public boolean mo45683a() {
            return C12296h.m45685a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f43569a;
        f43563c = new e(bVar, false);
        f43564d = new e(bVar, true);
        f43565e = new e(a.f43567b, false);
        f43566f = f.f43572b;
    }

    /* JADX INFO: renamed from: a */
    public static int m45680a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m45681b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
