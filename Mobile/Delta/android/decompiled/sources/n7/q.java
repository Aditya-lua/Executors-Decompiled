package n7;

import f7.h0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25204a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25205c;

    public q(String str, List<c> list, boolean z10) {
        this.f25204a = str;
        this.b = list;
        this.f25205c = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.d(h0Var, bVar, this, iVar);
    }

    public List<c> b() {
        return this.b;
    }

    public String c() {
        return this.f25204a;
    }

    public boolean d() {
        return this.f25205c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f25204a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
