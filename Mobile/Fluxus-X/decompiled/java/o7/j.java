package o7;

import g7.h0;
import g7.i0;

/* JADX INFO: loaded from: classes3.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26864a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26865c;

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
        this.f26864a = str;
        this.b = aVar;
        this.f26865c = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        if (h0Var.h0(i0.MergePathsApi19)) {
            return new i7.l(this);
        }
        t7.e.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.f26864a;
    }

    public boolean d() {
        return this.f26865c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
