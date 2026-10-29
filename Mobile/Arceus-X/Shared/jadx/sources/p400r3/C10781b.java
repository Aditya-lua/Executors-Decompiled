package p400r3;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: r3.b */
/* JADX INFO: loaded from: classes.dex */
public class C10781b {

    /* JADX INFO: renamed from: r3.b$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        void mo41043a(T t8, Rect rect);
    }

    /* JADX INFO: renamed from: r3.b$b */
    public interface b<T, V> {
        /* JADX INFO: renamed from: a */
        V mo41045a(T t8, int i10);

        /* JADX INFO: renamed from: b */
        int mo41046b(T t8);
    }

    /* JADX INFO: renamed from: r3.b$c */
    public static class c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final Rect f38409a = new Rect();

        /* JADX INFO: renamed from: b */
        public final Rect f38410b = new Rect();

        /* JADX INFO: renamed from: c */
        public final boolean f38411c;

        /* JADX INFO: renamed from: d */
        public final a<T> f38412d;

        public c(boolean z10, a<T> aVar) {
            this.f38411c = z10;
            this.f38412d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t8, T t10) {
            Rect rect = this.f38409a;
            Rect rect2 = this.f38410b;
            this.f38412d.mo41043a(t8, rect);
            this.f38412d.mo41043a(t10, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f38411c ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f38411c ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return this.f38411c ? 1 : -1;
            }
            if (i16 > i17) {
                return this.f38411c ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m41052a(int i10, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean zM41053b = m41053b(i10, rect, rect2);
        if (m41053b(i10, rect, rect3) || !zM41053b) {
            return false;
        }
        return !m41061j(i10, rect, rect3) || i10 == 17 || i10 == 66 || m41062k(i10, rect, rect2) < m41064m(i10, rect, rect3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m41053b(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: c */
    public static <L, T> T m41054c(@NonNull L l10, @NonNull b<L, T> bVar, @NonNull a<T> aVar, T t8, @NonNull Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        if (i10 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iMo41046b = bVar.mo41046b(l10);
        Rect rect3 = new Rect();
        T t10 = null;
        for (int i11 = 0; i11 < iMo41046b; i11++) {
            T tMo41045a = bVar.mo41045a(l10, i11);
            if (tMo41045a != t8) {
                aVar.mo41043a(tMo41045a, rect3);
                if (m41059h(i10, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t10 = tMo41045a;
                }
            }
        }
        return t10;
    }

    /* JADX INFO: renamed from: d */
    public static <L, T> T m41055d(@NonNull L l10, @NonNull b<L, T> bVar, @NonNull a<T> aVar, T t8, int i10, boolean z10, boolean z11) {
        int iMo41046b = bVar.mo41046b(l10);
        ArrayList arrayList = new ArrayList(iMo41046b);
        for (int i11 = 0; i11 < iMo41046b; i11++) {
            arrayList.add(bVar.mo41045a(l10, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 == 1) {
            return (T) m41057f(t8, arrayList, z11);
        }
        if (i10 == 2) {
            return (T) m41056e(t8, arrayList, z11);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m41056e(T t8, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int iLastIndexOf = (t8 == null ? -1 : arrayList.lastIndexOf(t8)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m41057f(T t8, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int iIndexOf = (t8 == null ? size : arrayList.indexOf(t8)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* JADX INFO: renamed from: g */
    public static int m41058g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m41059h(int i10, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!m41060i(rect, rect2, i10)) {
            return false;
        }
        if (m41060i(rect, rect3, i10) && !m41052a(i10, rect, rect2, rect3)) {
            return !m41052a(i10, rect, rect3, rect2) && m41058g(m41062k(i10, rect, rect2), m41066o(i10, rect, rect2)) < m41058g(m41062k(i10, rect, rect3), m41066o(i10, rect, rect3));
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m41060i(@NonNull Rect rect, @NonNull Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m41061j(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 == 17) {
            return rect.left >= rect2.right;
        }
        if (i10 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i10 == 66) {
            return rect.right <= rect2.left;
        }
        if (i10 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: k */
    public static int m41062k(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, m41063l(i10, rect, rect2));
    }

    /* JADX INFO: renamed from: l */
    public static int m41063l(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    /* JADX INFO: renamed from: m */
    public static int m41064m(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, m41065n(i10, rect, rect2));
    }

    /* JADX INFO: renamed from: n */
    public static int m41065n(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.top;
        } else if (i10 == 66) {
            i11 = rect2.right;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.bottom;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    /* JADX INFO: renamed from: o */
    public static int m41066o(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
