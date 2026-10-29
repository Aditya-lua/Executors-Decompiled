package n7;

import f7.h0;
import f7.i0;

/* JADX INFO: loaded from: classes3.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25168a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25169c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f25168a = str;
        this.b = aVar;
        this.f25169c = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        if (h0Var.h0(i0.MergePathsApi19)) {
            return new h7.l(this);
        }
        s7.e.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.f25168a;
    }

    public boolean d() {
        return this.f25169c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
