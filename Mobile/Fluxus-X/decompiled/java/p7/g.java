package p7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import g7.h0;
import g7.o0;
import java.util.Collections;
import java.util.List;
import o7.q;

/* JADX INFO: loaded from: classes3.dex */
public class g extends b {
    public final i7.d E;
    public final c F;
    public j7.c G;

    public g(h0 h0Var, e eVar, c cVar, g7.i iVar) {
        super(h0Var, eVar);
        this.F = cVar;
        i7.d dVar = new i7.d(h0Var, this, new q("__container", eVar.o(), false), iVar);
        this.E = dVar;
        List<i7.c> list = Collections.EMPTY_LIST;
        dVar.b(list, list);
        if (A() != null) {
            this.G = new j7.c(this, this, A());
        }
    }

    @Override // p7.b
    public void J(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        this.E.c(eVar, i10, list, eVar2);
    }

    @Override // p7.b, m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        j7.c cVar2;
        j7.c cVar3;
        j7.c cVar4;
        j7.c cVar5;
        j7.c cVar6;
        super.e(t8, cVar);
        if (t8 == o0.f17502e && (cVar6 = this.G) != null) {
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

    @Override // p7.b, i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        super.g(rectF, matrix, z10);
        this.E.g(rectF, this.f28973o, z10);
    }

    @Override // p7.b
    public void u(@NonNull Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        j7.c cVar = this.G;
        if (cVar != null) {
            bVar = cVar.b(matrix, i10);
        }
        this.E.d(canvas, matrix, i10, bVar);
    }

    @Override // p7.b
    public o7.a y() {
        o7.a aVarY = super.y();
        return aVarY != null ? aVarY : this.F.y();
    }
}
