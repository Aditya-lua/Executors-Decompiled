package us;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p388qn.AbstractC10623s;
import p388qn.C10602a0;
import p388qn.C10603b;
import p388qn.C10604b0;
import p388qn.C10605c;
import p388qn.C10606c0;
import p388qn.C10607d;
import p388qn.C10610f;
import p388qn.C10611g;
import p388qn.C10612h;
import p388qn.C10613i;
import p388qn.C10614j;
import p388qn.C10615k;
import p388qn.C10616l;
import p388qn.C10617m;
import p388qn.C10618n;
import p388qn.C10619o;
import p388qn.C10620p;
import p388qn.C10622r;
import p388qn.C10626v;
import p388qn.C10627w;
import p388qn.C10628x;

/* JADX INFO: renamed from: us.o */
/* JADX INFO: loaded from: classes3.dex */
public class C11949o implements InterfaceC11947m {

    /* JADX INFO: renamed from: a */
    public final C11941g f42372a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11952r f42373b;

    /* JADX INFO: renamed from: c */
    public final C11955u f42374c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<? extends AbstractC10623s>, InterfaceC11947m.c<? extends AbstractC10623s>> f42375d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC11947m.a f42376e;

    /* JADX INFO: renamed from: us.o$a */
    public static class a implements InterfaceC11947m.b {

        /* JADX INFO: renamed from: a */
        public final Map<Class<? extends AbstractC10623s>, InterfaceC11947m.c<? extends AbstractC10623s>> f42377a = new HashMap();

        /* JADX INFO: renamed from: b */
        public InterfaceC11947m.a f42378b;

        @Override // us.InterfaceC11947m.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public <N extends AbstractC10623s> InterfaceC11947m.b mo44598a(@NonNull Class<N> cls, InterfaceC11947m.c<? super N> cVar) {
            if (cVar == null) {
                this.f42377a.remove(cls);
                return this;
            }
            this.f42377a.put(cls, cVar);
            return this;
        }

        @Override // us.InterfaceC11947m.b
        @NonNull
        /* JADX INFO: renamed from: b */
        public InterfaceC11947m mo44599b(@NonNull C11941g c11941g, @NonNull InterfaceC11952r interfaceC11952r) {
            InterfaceC11947m.a c11936b = this.f42378b;
            if (c11936b == null) {
                c11936b = new C11936b();
            }
            return new C11949o(c11941g, interfaceC11952r, new C11955u(), Collections.unmodifiableMap(this.f42377a), c11936b);
        }
    }

    public C11949o(@NonNull C11941g c11941g, @NonNull InterfaceC11952r interfaceC11952r, @NonNull C11955u c11955u, @NonNull Map<Class<? extends AbstractC10623s>, InterfaceC11947m.c<? extends AbstractC10623s>> map, @NonNull InterfaceC11947m.a aVar) {
        this.f42372a = c11941g;
        this.f42373b = interfaceC11952r;
        this.f42374c = c11955u;
        this.f42375d = map;
        this.f42376e = aVar;
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: A */
    public void mo40646A(C10628x c10628x) {
        m44604G(c10628x);
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: B */
    public void mo44588B() {
        if (this.f42374c.length() <= 0 || '\n' == this.f42374c.m44623h()) {
            return;
        }
        this.f42374c.append('\n');
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: C */
    public void mo40647C(C10617m c10617m) {
        m44604G(c10617m);
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: D */
    public void mo44589D(@NonNull AbstractC10623s abstractC10623s) {
        this.f42376e.mo44557b(this, abstractC10623s);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: E */
    public void mo40648E(C10612h c10612h) {
        m44604G(c10612h);
    }

    /* JADX INFO: renamed from: F */
    public <N extends AbstractC10623s> void m44603F(@NonNull Class<N> cls, int i10) {
        InterfaceC11954t interfaceC11954tMo44586a = this.f42372a.m44569c().mo44586a(cls);
        if (interfaceC11954tMo44586a != null) {
            mo44591d(i10, interfaceC11954tMo44586a.mo44613a(this.f42372a, this.f42373b));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m44604G(@NonNull AbstractC10623s abstractC10623s) {
        InterfaceC11947m.c<? extends AbstractC10623s> cVar = this.f42375d.get(abstractC10623s.getClass());
        if (cVar != null) {
            cVar.mo44600a(this, abstractC10623s);
        } else {
            mo44592h(abstractC10623s);
        }
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: a */
    public void mo40649a(C10607d c10607d) {
        m44604G(c10607d);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: b */
    public void mo40650b(C10618n c10618n) {
        m44604G(c10618n);
    }

    @Override // us.InterfaceC11947m
    @NonNull
    public C11955u builder() {
        return this.f42374c;
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: c */
    public boolean mo44590c(@NonNull AbstractC10623s abstractC10623s) {
        return abstractC10623s.m40701f() != null;
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: d */
    public void mo44591d(int i10, Object obj) {
        C11955u c11955u = this.f42374c;
        C11955u.m44615j(c11955u, obj, i10, c11955u.length());
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: e */
    public void mo40651e(C10615k c10615k) {
        m44604G(c10615k);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: f */
    public void mo40652f(C10606c0 c10606c0) {
        m44604G(c10606c0);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: g */
    public void mo40653g(C10611g c10611g) {
        m44604G(c10611g);
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: h */
    public void mo44592h(@NonNull AbstractC10623s abstractC10623s) {
        AbstractC10623s abstractC10623sM40699d = abstractC10623s.m40699d();
        while (abstractC10623sM40699d != null) {
            AbstractC10623s abstractC10623sM40701f = abstractC10623sM40699d.m40701f();
            abstractC10623sM40699d.mo40637a(this);
            abstractC10623sM40699d = abstractC10623sM40701f;
        }
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: i */
    public void mo40654i(C10627w c10627w) {
        m44604G(c10627w);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: j */
    public void mo40655j(C10616l c10616l) {
        m44604G(c10616l);
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: k */
    public <N extends AbstractC10623s> void mo44593k(@NonNull N n10, int i10) {
        m44603F(n10.getClass(), i10);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: l */
    public void mo40656l(C10603b c10603b) {
        m44604G(c10603b);
    }

    @Override // us.InterfaceC11947m
    public int length() {
        return this.f42374c.length();
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: m */
    public void mo40657m(C10614j c10614j) {
        m44604G(c10614j);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: n */
    public void mo40658n(C10604b0 c10604b0) {
        m44604G(c10604b0);
    }

    @Override // us.InterfaceC11947m
    @NonNull
    /* JADX INFO: renamed from: o */
    public InterfaceC11952r mo44594o() {
        return this.f42373b;
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: p */
    public void mo40659p(C10613i c10613i) {
        m44604G(c10613i);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: q */
    public void mo40660q(C10605c c10605c) {
        m44604G(c10605c);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: r */
    public void mo40661r(C10622r c10622r) {
        m44604G(c10622r);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: s */
    public void mo40662s(C10619o c10619o) {
        m44604G(c10619o);
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: t */
    public void mo44595t(@NonNull AbstractC10623s abstractC10623s) {
        this.f42376e.mo44556a(this, abstractC10623s);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: u */
    public void mo40663u(C10620p c10620p) {
        m44604G(c10620p);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: v */
    public void mo40664v(C10610f c10610f) {
        m44604G(c10610f);
    }

    @Override // us.InterfaceC11947m
    @NonNull
    /* JADX INFO: renamed from: w */
    public C11941g mo44596w() {
        return this.f42372a;
    }

    @Override // us.InterfaceC11947m
    /* JADX INFO: renamed from: x */
    public void mo44597x() {
        this.f42374c.append('\n');
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: y */
    public void mo40665y(C10602a0 c10602a0) {
        m44604G(c10602a0);
    }

    @Override // p388qn.InterfaceC10608d0
    /* JADX INFO: renamed from: z */
    public void mo40666z(C10626v c10626v) {
        m44604G(c10626v);
    }
}
