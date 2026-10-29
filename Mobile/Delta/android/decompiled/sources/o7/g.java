package o7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import f7.h0;
import f7.o0;
import java.util.Collections;
import java.util.List;
import n7.q;

/* JADX INFO: loaded from: classes3.dex */
public class g extends b {
    public final h7.d E;
    public final c F;
    public i7.c G;

    public g(h0 h0Var, e eVar, c cVar, f7.i iVar) {
        super(h0Var, eVar);
        this.F = cVar;
        h7.d dVar = new h7.d(h0Var, this, new q("__container", eVar.o(), false), iVar);
        this.E = dVar;
        List<h7.c> list = Collections.EMPTY_LIST;
        dVar.b(list, list);
        if (z() != null) {
            this.G = new i7.c(this, this, z());
        }
    }

    @Override // o7.b
    public void I(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        this.E.h(eVar, i10, list, eVar2);
    }

    @Override // o7.b, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        i7.c cVar2;
        i7.c cVar3;
        i7.c cVar4;
        i7.c cVar5;
        i7.c cVar6;
        super.c(t8, cVar);
        if (t8 == o0.f16423e && (cVar6 = this.G) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t8 == o0.G && (cVar5 = this.G) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t8 == o0.H && (cVar4 = this.G) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t8 == o0.I && (cVar3 = this.G) != null) {
            cVar3.e(cVar);
        } else {
            if (t8 != o0.J || (cVar2 = this.G) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // o7.b, h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.E.e(rectF, this.f27237o, z10);
    }

    @Override // o7.b
    public void u(@NonNull Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        i7.c cVar = this.G;
        if (cVar != null) {
            bVar = cVar.b(matrix, i10);
        }
        this.E.i(canvas, matrix, i10, bVar);
    }

    @Override // o7.b
    public n7.a x() {
        n7.a aVarX = super.x();
        return aVarX != null ? aVarX : this.F.x();
    }
}
