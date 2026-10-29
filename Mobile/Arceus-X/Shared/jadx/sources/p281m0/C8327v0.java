package p281m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.InterfaceC0494d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ne.InterfaceFutureC9440x;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p296n0.InterfaceC8780k1;
import p296n0.InterfaceC8790m1;

/* JADX INFO: renamed from: m0.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C8327v0 {

    /* JADX INFO: renamed from: a */
    public final int f30696a;

    /* JADX INFO: renamed from: b */
    public AbstractC8307l1 f30697b;

    /* JADX INFO: renamed from: c */
    public final C5883f1.h f30698c;

    /* JADX INFO: renamed from: d */
    public final C5883f1.h f30699d;

    /* JADX INFO: renamed from: e */
    public final Rect f30700e;

    /* JADX INFO: renamed from: f */
    public final int f30701f;

    /* JADX INFO: renamed from: g */
    public final int f30702g;

    /* JADX INFO: renamed from: h */
    public final Matrix f30703h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC8274a1 f30704i;

    /* JADX INFO: renamed from: j */
    public final String f30705j;

    /* JADX INFO: renamed from: l */
    public final InterfaceFutureC9440x<Void> f30707l;

    /* JADX INFO: renamed from: m */
    public int f30708m = -1;

    /* JADX INFO: renamed from: k */
    public final List<Integer> f30706k = new ArrayList();

    public C8327v0(InterfaceC8780k1 interfaceC8780k1, AbstractC8307l1 abstractC8307l1, InterfaceC8274a1 interfaceC8274a1, InterfaceFutureC9440x<Void> interfaceFutureC9440x, int i10) {
        this.f30696a = i10;
        this.f30697b = abstractC8307l1;
        this.f30698c = abstractC8307l1.mo33741m();
        this.f30699d = abstractC8307l1.mo33743o();
        this.f30702g = abstractC8307l1.mo33739k();
        this.f30701f = abstractC8307l1.mo33742n();
        this.f30700e = abstractC8307l1.mo33737i();
        this.f30703h = abstractC8307l1.mo33744p();
        this.f30704i = interfaceC8274a1;
        this.f30705j = String.valueOf(interfaceC8780k1.hashCode());
        List<InterfaceC8790m1> listMo26488a = interfaceC8780k1.mo26488a();
        Objects.requireNonNull(listMo26488a);
        Iterator<InterfaceC8790m1> it = listMo26488a.iterator();
        while (it.hasNext()) {
            this.f30706k.add(Integer.valueOf(it.next().getId()));
        }
        this.f30707l = interfaceFutureC9440x;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceFutureC9440x<Void> m33803a() {
        return this.f30707l;
    }

    /* JADX INFO: renamed from: b */
    public Rect m33804b() {
        return this.f30700e;
    }

    /* JADX INFO: renamed from: c */
    public int m33805c() {
        return this.f30702g;
    }

    /* JADX INFO: renamed from: d */
    public C5883f1.h m33806d() {
        return this.f30698c;
    }

    /* JADX INFO: renamed from: e */
    public int m33807e() {
        return this.f30696a;
    }

    /* JADX INFO: renamed from: f */
    public int m33808f() {
        return this.f30701f;
    }

    /* JADX INFO: renamed from: g */
    public C5883f1.h m33809g() {
        return this.f30699d;
    }

    /* JADX INFO: renamed from: h */
    public Matrix m33810h() {
        return this.f30703h;
    }

    /* JADX INFO: renamed from: i */
    public List<Integer> m33811i() {
        return this.f30706k;
    }

    /* JADX INFO: renamed from: j */
    public String m33812j() {
        return this.f30705j;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC8307l1 m33813k() {
        return this.f30697b;
    }

    /* JADX INFO: renamed from: l */
    public boolean m33814l() {
        return this.f30704i.mo33669h();
    }

    /* JADX INFO: renamed from: m */
    public boolean m33815m() {
        return m33806d() == null && m33809g() == null;
    }

    /* JADX INFO: renamed from: n */
    public void m33816n(C5891h1 c5891h1) {
        this.f30704i.mo33667f(c5891h1);
    }

    /* JADX INFO: renamed from: o */
    public void m33817o(int i10) {
        if (this.f30708m != i10) {
            this.f30708m = i10;
            this.f30704i.mo33662a(i10);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m33818p() {
        this.f30704i.mo33664c();
    }

    /* JADX INFO: renamed from: q */
    public void m33819q(InterfaceC0494d interfaceC0494d) {
        this.f30704i.mo33668g(interfaceC0494d);
    }

    /* JADX INFO: renamed from: r */
    public void m33820r(C5883f1.i iVar) {
        this.f30704i.mo33665d(iVar);
    }

    /* JADX INFO: renamed from: s */
    public void m33821s() {
        if (this.f30708m != -1) {
            m33817o(100);
        }
        this.f30704i.mo33670i();
    }

    /* JADX INFO: renamed from: t */
    public void m33822t(Bitmap bitmap) {
        this.f30704i.mo33663b(bitmap);
    }

    /* JADX INFO: renamed from: u */
    public void m33823u(C5891h1 c5891h1) {
        this.f30704i.mo33666e(c5891h1);
    }
}
