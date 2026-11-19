package tw;

import ew.e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import lg.a0;
import lg.f;
import mv.b0;
import mv.g0;
import sw.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h<T, g0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f32868d = b0.e("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f32869a;
    public final a0<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32870c;

    public b(f fVar, a0<T> a0Var, boolean z10) {
        this.f32869a = fVar;
        this.b = a0Var;
        this.f32870c = z10;
    }

    public static <T> void c(ew.f fVar, f fVar2, a0<T> a0Var, T t8) throws IOException {
        tg.c cVarQ = fVar2.q(new OutputStreamWriter(fVar.q3(), StandardCharsets.UTF_8));
        a0Var.write(cVarQ, t8);
        cVarQ.close();
    }

    @Override // sw.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 a(T t8) throws IOException {
        if (this.f32870c) {
            return new d(this.f32869a, this.b, t8);
        }
        e eVar = new e();
        c(eVar, this.f32869a, this.b, t8);
        return g0.c(f32868d, eVar.J2());
    }
}
