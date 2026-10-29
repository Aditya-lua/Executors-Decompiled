package p281m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.InterfaceC0494d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p140g0.C5931r1;
import p296n0.AbstractC8828u;
import p347p0.C10110z;
import p480v0.C11986a;
import p533x2.C12637g;

/* JADX INFO: renamed from: m0.l1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8307l1 {

    /* JADX INFO: renamed from: a */
    public int f30654a = new C11986a().m44738a();

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Boolean> f30655b = new HashMap();

    /* JADX INFO: renamed from: m0.l1$a */
    public interface a {
        /* JADX INFO: renamed from: f */
        void mo33721f(AbstractC8307l1 abstractC8307l1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33764a(AbstractC8307l1 abstractC8307l1, C5891h1 c5891h1) {
        abstractC8307l1.mo33738j();
        if (!(abstractC8307l1.mo33740l() != null)) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        C5883f1.g gVarMo33740l = abstractC8307l1.mo33740l();
        Objects.requireNonNull(gVarMo33740l);
        gVarMo33740l.mo16208e(c5891h1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m33765b(AbstractC8307l1 abstractC8307l1, C5883f1.i iVar) {
        C5883f1.g gVarMo33740l = abstractC8307l1.mo33740l();
        Objects.requireNonNull(gVarMo33740l);
        Objects.requireNonNull(iVar);
        gVarMo33740l.mo16207d(iVar);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m33766c(AbstractC8307l1 abstractC8307l1, InterfaceC0494d interfaceC0494d) {
        C5883f1.f fVarMo33738j = abstractC8307l1.mo33738j();
        Objects.requireNonNull(fVarMo33738j);
        Objects.requireNonNull(interfaceC0494d);
        fVarMo33738j.m26425c(interfaceC0494d);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m33767d(AbstractC8307l1 abstractC8307l1, Bitmap bitmap) {
        if (abstractC8307l1.mo33740l() != null) {
            abstractC8307l1.mo33740l().m26429b(bitmap);
        } else {
            abstractC8307l1.mo33738j();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m33768e(AbstractC8307l1 abstractC8307l1, int i10) {
        if (abstractC8307l1.mo33740l() != null) {
            abstractC8307l1.mo33740l().m26428a(i10);
        } else {
            abstractC8307l1.mo33738j();
        }
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC8307l1 m33769v(Executor executor, C5883f1.f fVar, C5883f1.g gVar, C5883f1.h hVar, C5883f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<AbstractC8828u> list) {
        C12637g.m47070b((gVar == null) == (hVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        C12637g.m47070b(!(gVar == null), "One and only one on-disk or in-memory callback should be present.");
        C8299j c8299j = new C8299j(executor, fVar, gVar, hVar, hVar2, rect, matrix, i10, i11, i12, z10, list);
        if (z10) {
            c8299j.m33772r();
        }
        return c8299j;
    }

    /* JADX INFO: renamed from: A */
    public void m33770A(final C5883f1.i iVar) {
        mo33735g().execute(new Runnable() { // from class: m0.j1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8307l1.m33765b(this.f30649a, iVar);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m33771f() {
        C10110z.m39008b();
        int i10 = this.f30654a;
        if (i10 <= 0) {
            return false;
        }
        this.f30654a = i10 - 1;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public abstract Executor mo33735g();

    /* JADX INFO: renamed from: h */
    public abstract int mo33736h();

    /* JADX INFO: renamed from: i */
    public abstract Rect mo33737i();

    /* JADX INFO: renamed from: j */
    public abstract C5883f1.f mo33738j();

    /* JADX INFO: renamed from: k */
    public abstract int mo33739k();

    /* JADX INFO: renamed from: l */
    public abstract C5883f1.g mo33740l();

    /* JADX INFO: renamed from: m */
    public abstract C5883f1.h mo33741m();

    /* JADX INFO: renamed from: n */
    public abstract int mo33742n();

    /* JADX INFO: renamed from: o */
    public abstract C5883f1.h mo33743o();

    /* JADX INFO: renamed from: p */
    public abstract Matrix mo33744p();

    /* JADX INFO: renamed from: q */
    public abstract List<AbstractC8828u> mo33745q();

    /* JADX INFO: renamed from: r */
    public void m33772r() {
        Map<Integer, Boolean> map = this.f30655b;
        Boolean bool = Boolean.FALSE;
        map.put(32, bool);
        this.f30655b.put(256, bool);
    }

    /* JADX INFO: renamed from: s */
    public boolean m33773s() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.f30655b.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo33746t();

    /* JADX INFO: renamed from: u */
    public void m33774u(int i10, boolean z10) {
        if (this.f30655b.containsKey(Integer.valueOf(i10))) {
            this.f30655b.put(Integer.valueOf(i10), Boolean.valueOf(z10));
        } else {
            C5931r1.m26563c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    /* JADX INFO: renamed from: w */
    public void m33775w(final int i10) {
        mo33735g().execute(new Runnable() { // from class: m0.k1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8307l1.m33768e(this.f30651a, i10);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m33776x(final C5891h1 c5891h1) {
        mo33735g().execute(new Runnable() { // from class: m0.g1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8307l1.m33764a(this.f30623a, c5891h1);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m33777y(final Bitmap bitmap) {
        mo33735g().execute(new Runnable() { // from class: m0.i1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8307l1.m33767d(this.f30633a, bitmap);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m33778z(final InterfaceC0494d interfaceC0494d) {
        mo33735g().execute(new Runnable() { // from class: m0.h1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8307l1.m33766c(this.f30627a, interfaceC0494d);
            }
        });
    }
}
