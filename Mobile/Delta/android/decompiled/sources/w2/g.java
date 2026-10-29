package w2;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2.f f33650a = new e(null, false);
    public static final w2.f b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w2.f f33651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w2.f f33652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w2.f f33653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w2.f f33654f;

    public static class a implements c {
        public static final a b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f33655a;

        public a(boolean z10) {
            this.f33655a = z10;
        }

        @Override // w2.g.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = g.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f33655a) {
                        return 1;
                    }
                    i10++;
                    z10 = z10;
                } else if (this.f33655a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f33655a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33656a = new b();

        @Override // w2.g.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = g.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class d implements w2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f33657a;

        public d(c cVar) {
            this.f33657a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f33657a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        @Override // w2.f
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f33657a == null ? a() : b(charSequence, i10, i11);
        }
    }

    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.b = z10;
        }

        @Override // w2.g.d
        public boolean a() {
            return this.b;
        }
    }

    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // w2.g.d
        public boolean a() {
            return h.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f33656a;
        f33651c = new e(bVar, false);
        f33652d = new e(bVar, true);
        f33653e = new e(a.b, false);
        f33654f = f.b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
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
