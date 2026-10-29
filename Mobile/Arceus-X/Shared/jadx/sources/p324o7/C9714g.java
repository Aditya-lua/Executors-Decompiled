package p324o7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import p121f7.C5451h0;
import p121f7.C5452i;
import p121f7.InterfaceC5465o0;
import p162h7.C6297d;
import p162h7.InterfaceC6296c;
import p189i7.C6645c;
import p266l7.C8006e;
import p303n7.C8895a;
import p303n7.C8911q;
import p431s7.C11186b;
import p444t7.C11552c;

/* JADX INFO: renamed from: o7.g */
/* JADX INFO: loaded from: classes3.dex */
public class C9714g extends AbstractC9709b {

    /* JADX INFO: renamed from: E */
    public final C6297d f35338E;

    /* JADX INFO: renamed from: F */
    public final C9710c f35339F;

    /* JADX INFO: renamed from: G */
    public C6645c f35340G;

    public C9714g(C5451h0 c5451h0, C9712e c9712e, C9710c c9710c, C5452i c5452i) {
        super(c5451h0, c9712e);
        this.f35339F = c9710c;
        C6297d c6297d = new C6297d(c5451h0, this, new C8911q("__container", c9712e.m38386o(), false), c5452i);
        this.f35338E = c6297d;
        List<InterfaceC6296c> list = Collections.EMPTY_LIST;
        c6297d.mo27576b(list, list);
        if (m38368z() != null) {
            this.f35340G = new C6645c(this, this, m38368z());
        }
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: I */
    public void mo38346I(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        this.f35338E.mo27580h(c8006e, i10, list, c8006e2);
    }

    @Override // p324o7.AbstractC9709b, p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        C6645c c6645c;
        C6645c c6645c2;
        C6645c c6645c3;
        C6645c c6645c4;
        C6645c c6645c5;
        super.mo27577c(t8, c11552c);
        if (t8 == InterfaceC5465o0.f21165e && (c6645c5 = this.f35340G) != null) {
            c6645c5.m28687c(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21151G && (c6645c4 = this.f35340G) != null) {
            c6645c4.m28690f(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21152H && (c6645c3 = this.f35340G) != null) {
            c6645c3.m28688d(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21153I && (c6645c2 = this.f35340G) != null) {
            c6645c2.m28689e(c11552c);
        } else {
            if (t8 != InterfaceC5465o0.f21154J || (c6645c = this.f35340G) == null) {
                return;
            }
            c6645c.m28691g(c11552c);
        }
    }

    @Override // p324o7.AbstractC9709b, p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        super.mo27578e(rectF, matrix, z10);
        this.f35338E.mo27578e(rectF, this.f35263o, z10);
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: u */
    public void mo38364u(@NonNull Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        C6645c c6645c = this.f35340G;
        if (c6645c != null) {
            c11186b = c6645c.m28686b(matrix, i10);
        }
        this.f35338E.mo27581i(canvas, matrix, i10, c11186b);
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: x */
    public C8895a mo38366x() {
        C8895a c8895aMo38366x = super.mo38366x();
        return c8895aMo38366x != null ? c8895aMo38366x : this.f35339F.mo38366x();
    }
}
