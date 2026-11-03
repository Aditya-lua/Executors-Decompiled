package n7;

import f7.h0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26025a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26026c;

    public q(String str, List<c> list, boolean z10) {
        this.f26025a = str;
        this.b = list;
        this.f26026c = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.d(h0Var, bVar, this, iVar);
    }

    public List<c> b() {
        return this.b;
    }

    public String c() {
        return this.f26025a;
    }

    public boolean d() {
        return this.f26026c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f26025a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
