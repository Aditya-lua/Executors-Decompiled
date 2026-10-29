package f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f16050a;
    public static final x b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f16051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f16052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f16053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f16054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f16055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set<x> f16056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<x> f16057i;

    public static abstract class b extends x {
        public b() {
            super();
        }

        public static b h(int i10, int i11, String str, List<Size> list) {
            return new j(i10, i11, str, list);
        }

        public abstract int c();

        public abstract String d();

        public int e(int i10) {
            if (i10 == 1) {
                return g();
            }
            if (i10 == 2) {
                return c();
            }
            throw new AssertionError("Unknown quality source: " + i10);
        }

        public abstract List<Size> f();

        public abstract int g();
    }

    static {
        b bVarH = b.h(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f16050a = bVarH;
        b bVarH2 = b.h(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        b = bVarH2;
        b bVarH3 = b.h(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f16051c = bVarH3;
        b bVarH4 = b.h(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f16052d = bVarH4;
        List list = Collections.EMPTY_LIST;
        b bVarH5 = b.h(0, 2000, "LOWEST", list);
        f16053e = bVarH5;
        b bVarH6 = b.h(1, 2001, "HIGHEST", list);
        f16054f = bVarH6;
        f16055g = b.h(-1, -1, "NONE", list);
        f16056h = new HashSet(Arrays.asList(bVarH5, bVarH6, bVarH, bVarH2, bVarH3, bVarH4));
        f16057i = Arrays.asList(bVarH4, bVarH3, bVarH2, bVarH);
    }

    public static boolean a(x xVar) {
        return f16056h.contains(xVar);
    }

    public static List<x> b() {
        return new ArrayList(f16057i);
    }

    public x() {
    }
}
