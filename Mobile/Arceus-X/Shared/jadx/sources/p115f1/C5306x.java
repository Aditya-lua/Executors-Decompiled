package p115f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: f1.x */
/* JADX INFO: loaded from: classes.dex */
public class C5306x {

    /* JADX INFO: renamed from: a */
    public static final C5306x f20629a;

    /* JADX INFO: renamed from: b */
    public static final C5306x f20630b;

    /* JADX INFO: renamed from: c */
    public static final C5306x f20631c;

    /* JADX INFO: renamed from: d */
    public static final C5306x f20632d;

    /* JADX INFO: renamed from: e */
    public static final C5306x f20633e;

    /* JADX INFO: renamed from: f */
    public static final C5306x f20634f;

    /* JADX INFO: renamed from: g */
    public static final C5306x f20635g;

    /* JADX INFO: renamed from: h */
    public static final Set<C5306x> f20636h;

    /* JADX INFO: renamed from: i */
    public static final List<C5306x> f20637i;

    /* JADX INFO: renamed from: f1.x$b */
    public static abstract class b extends C5306x {
        public b() {
            super();
        }

        /* JADX INFO: renamed from: h */
        public static b m24594h(int i10, int i11, String str, List<Size> list) {
            return new C5264j(i10, i11, str, list);
        }

        /* JADX INFO: renamed from: c */
        public abstract int mo24323c();

        /* JADX INFO: renamed from: d */
        public abstract String mo24324d();

        /* JADX INFO: renamed from: e */
        public int m24595e(int i10) {
            if (i10 == 1) {
                return mo24326g();
            }
            if (i10 == 2) {
                return mo24323c();
            }
            throw new AssertionError("Unknown quality source: " + i10);
        }

        /* JADX INFO: renamed from: f */
        public abstract List<Size> mo24325f();

        /* JADX INFO: renamed from: g */
        public abstract int mo24326g();
    }

    static {
        b bVarM24594h = b.m24594h(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f20629a = bVarM24594h;
        b bVarM24594h2 = b.m24594h(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        f20630b = bVarM24594h2;
        b bVarM24594h3 = b.m24594h(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f20631c = bVarM24594h3;
        b bVarM24594h4 = b.m24594h(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f20632d = bVarM24594h4;
        List list = Collections.EMPTY_LIST;
        b bVarM24594h5 = b.m24594h(0, 2000, "LOWEST", list);
        f20633e = bVarM24594h5;
        b bVarM24594h6 = b.m24594h(1, 2001, "HIGHEST", list);
        f20634f = bVarM24594h6;
        f20635g = b.m24594h(-1, -1, "NONE", list);
        f20636h = new HashSet(Arrays.asList(bVarM24594h5, bVarM24594h6, bVarM24594h, bVarM24594h2, bVarM24594h3, bVarM24594h4));
        f20637i = Arrays.asList(bVarM24594h4, bVarM24594h3, bVarM24594h2, bVarM24594h);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m24592a(C5306x c5306x) {
        return f20636h.contains(c5306x);
    }

    /* JADX INFO: renamed from: b */
    public static List<C5306x> m24593b() {
        return new ArrayList(f20637i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5306x() {
    }
}
