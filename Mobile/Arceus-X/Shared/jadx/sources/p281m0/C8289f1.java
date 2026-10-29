package p281m0;

import android.util.Log;
import androidx.camera.core.AbstractC0492b;
import androidx.camera.core.InterfaceC0494d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ne.InterfaceFutureC9440x;
import p140g0.C5891h1;
import p140g0.C5931r1;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p533x2.C12633c;
import p533x2.C12637g;

/* JADX INFO: renamed from: m0.f1 */
/* JADX INFO: loaded from: classes.dex */
public class C8289f1 implements InterfaceC8277b1, AbstractC0492b.a, AbstractC8307l1.a {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8279c0 f30612b;

    /* JADX INFO: renamed from: c */
    public C8282d0 f30613c;

    /* JADX INFO: renamed from: d */
    public C8333y0 f30614d;

    /* JADX INFO: renamed from: e */
    public final List<C8333y0> f30615e;

    /* JADX INFO: renamed from: a */
    public final Deque<AbstractC8307l1> f30611a = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public boolean f30616f = false;

    /* JADX INFO: renamed from: m0.f1$a */
    public class a implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8310n f30617a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C8310n c8310n) {
            this.f30617a = c8310n;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            C8289f1.this.f30612b.mo26398c();
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (this.f30617a.m33782b()) {
                return;
            }
            int iM35243f = this.f30617a.m33781a().get(0).m35243f();
            if (th2 instanceof C5891h1) {
                C8289f1.this.f30613c.m33706j(InterfaceC8277b1.a.m33690c(iM35243f, (C5891h1) th2));
            } else {
                C8289f1.this.f30613c.m33706j(InterfaceC8277b1.a.m33690c(iM35243f, new C5891h1(2, "Failed to submit capture request", th2)));
            }
            C8289f1.this.f30612b.mo26398c();
        }
    }

    public C8289f1(InterfaceC8279c0 interfaceC8279c0) {
        C10110z.m39008b();
        this.f30612b = interfaceC8279c0;
        this.f30615e = new ArrayList();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m33720h(C8289f1 c8289f1) {
        c8289f1.f30614d = null;
        c8289f1.m33723j();
    }

    @Override // androidx.camera.core.AbstractC0492b.a
    /* JADX INFO: renamed from: a */
    public void mo2197a(InterfaceC0494d interfaceC0494d) {
        C10417c.m40084e().execute(new Runnable() { // from class: m0.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f30608a.m33723j();
            }
        });
    }

    @Override // p281m0.InterfaceC8277b1
    /* JADX INFO: renamed from: b */
    public void mo33686b(AbstractC8307l1 abstractC8307l1) {
        C10110z.m39008b();
        this.f30611a.offer(abstractC8307l1);
        m33723j();
    }

    @Override // p281m0.InterfaceC8277b1
    /* JADX INFO: renamed from: c */
    public void mo33687c() {
        C10110z.m39008b();
        C5891h1 c5891h1 = new C5891h1(3, "Camera is closed.", null);
        Iterator<AbstractC8307l1> it = this.f30611a.iterator();
        while (it.hasNext()) {
            it.next().m33776x(c5891h1);
        }
        this.f30611a.clear();
        ArrayList arrayList = new ArrayList(this.f30615e);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((C8333y0) obj).m33864m(c5891h1);
        }
    }

    @Override // p281m0.InterfaceC8277b1
    /* JADX INFO: renamed from: d */
    public void mo33688d(C8282d0 c8282d0) {
        C10110z.m39008b();
        this.f30613c = c8282d0;
        c8282d0.m33707k(this);
    }

    @Override // p281m0.InterfaceC8277b1
    /* JADX INFO: renamed from: e */
    public void mo33689e() {
        C10110z.m39008b();
        this.f30616f = false;
        m33723j();
    }

    @Override // p281m0.AbstractC8307l1.a
    /* JADX INFO: renamed from: f */
    public void mo33721f(AbstractC8307l1 abstractC8307l1) {
        C10110z.m39008b();
        C5931r1.m26561a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f30611a.addFirst(abstractC8307l1);
        m33723j();
    }

    /* JADX INFO: renamed from: i */
    public boolean m33722i() {
        return this.f30614d != null;
    }

    /* JADX INFO: renamed from: j */
    public void m33723j() {
        C10110z.m39008b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (m33722i()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f30616f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        if (this.f30613c.m33704h() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        AbstractC8307l1 abstractC8307l1Poll = this.f30611a.poll();
        if (abstractC8307l1Poll == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        C8333y0 c8333y0 = new C8333y0(abstractC8307l1Poll, this);
        m33725l(c8333y0);
        C12633c<C8310n, C8327v0> c12633cM33701e = this.f30613c.m33701e(abstractC8307l1Poll, c8333y0, c8333y0.m33867p());
        C8310n c8310n = c12633cM33701e.f44955a;
        Objects.requireNonNull(c8310n);
        C8327v0 c8327v0 = c12633cM33701e.f44956b;
        Objects.requireNonNull(c8327v0);
        this.f30613c.m33709m(c8327v0);
        c8333y0.m33871t(m33724k(c8310n));
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceFutureC9440x<Void> m33724k(C8310n c8310n) {
        C10110z.m39008b();
        this.f30612b.mo26397b();
        InterfaceFutureC9440x<Void> interfaceFutureC9440xMo26396a = this.f30612b.mo26396a(c8310n.m33781a());
        C10773n.m40987j(interfaceFutureC9440xMo26396a, new a(c8310n), C10417c.m40084e());
        return interfaceFutureC9440xMo26396a;
    }

    /* JADX INFO: renamed from: l */
    public final void m33725l(final C8333y0 c8333y0) {
        C12637g.m47077i(!m33722i());
        this.f30614d = c8333y0;
        c8333y0.m33867p().mo37173a(new Runnable() { // from class: m0.c1
            @Override // java.lang.Runnable
            public final void run() {
                C8289f1.m33720h(this.f30594a);
            }
        }, C10417c.m40081b());
        this.f30615e.add(c8333y0);
        c8333y0.m33868q().mo37173a(new Runnable() { // from class: m0.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f30604a.f30615e.remove(c8333y0);
            }
        }, C10417c.m40081b());
    }

    @Override // p281m0.InterfaceC8277b1
    public void pause() {
        C10110z.m39008b();
        this.f30616f = true;
        C8333y0 c8333y0 = this.f30614d;
        if (c8333y0 != null) {
            c8333y0.m33865n();
        }
    }
}
