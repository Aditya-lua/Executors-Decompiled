package o7;

import g7.h0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26900a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26901c;

    public q(String str, List<c> list, boolean z10) {
        this.f26900a = str;
        this.b = list;
        this.f26901c = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.d(h0Var, bVar, this, iVar);
    }

    public List<c> b() {
        return this.b;
    }

    public String c() {
        return this.f26900a;
    }

    public boolean d() {
        return this.f26901c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f26900a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
