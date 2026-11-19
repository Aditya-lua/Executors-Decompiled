package mt;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import eo.a0;
import eo.b0;
import eo.c0;
import eo.q;
import eo.s;
import eo.v;
import eo.w;
import eo.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lt.r;
import lt.t;

/* JADX INFO: loaded from: classes3.dex */
public class a extends lt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p> f24384a = new ArrayList(0);
    public boolean b;

    /* JADX INFO: renamed from: mt.a$a, reason: collision with other inner class name */
    public class C0481a implements lt.m.c<c0> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull c0 c0Var) {
            mVar.s(c0Var);
            int length = mVar.length();
            mVar.builder().append((char) 160);
            mVar.i(c0Var, length);
            mVar.n(c0Var);
        }
    }

    public class b implements lt.m.c<eo.j> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.j jVar) {
            mVar.s(jVar);
            int length = mVar.length();
            mVar.E(jVar);
            mt.b.f24388d.d(mVar.k(), Integer.valueOf(jVar.p()));
            mVar.i(jVar, length);
            mVar.n(jVar);
        }
    }

    public class c implements lt.m.c<x> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull x xVar) {
            mVar.builder().append(' ');
        }
    }

    public class d implements lt.m.c<eo.i> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.i iVar) {
            mVar.y();
        }
    }

    public class e implements lt.m.c<w> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull w wVar) {
            boolean zY = a.y(wVar);
            if (!zY) {
                mVar.s(wVar);
            }
            int length = mVar.length();
            mVar.E(wVar);
            mt.b.f24390f.d(mVar.k(), Boolean.valueOf(zY));
            mVar.i(wVar, length);
            if (zY) {
                return;
            }
            mVar.n(wVar);
        }
    }

    public class f implements lt.m.c<eo.o> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.o oVar) {
            int length = mVar.length();
            mVar.E(oVar);
            mt.b.f24389e.d(mVar.k(), oVar.o());
            mVar.i(oVar, length);
        }
    }

    public class g implements lt.m.c<b0> {
        public g() {
        }

        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull b0 b0Var) {
            String strO = b0Var.o();
            mVar.builder().d(strO);
            if (a.this.f24384a.isEmpty()) {
                return;
            }
            int length = mVar.length() - strO.length();
            Iterator it = a.this.f24384a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(mVar, strO, length);
            }
        }
    }

    public class h implements lt.m.c<a0> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull a0 a0Var) {
            int length = mVar.length();
            mVar.E(a0Var);
            mVar.i(a0Var, length);
        }
    }

    public class i implements lt.m.c<eo.g> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.g gVar) {
            int length = mVar.length();
            mVar.E(gVar);
            mVar.i(gVar, length);
        }
    }

    public class j implements lt.m.c<eo.b> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.b bVar) {
            mVar.s(bVar);
            int length = mVar.length();
            mVar.E(bVar);
            mVar.i(bVar, length);
            mVar.n(bVar);
        }
    }

    public class k implements lt.m.c<eo.d> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.d dVar) {
            int length = mVar.length();
            mVar.builder().append((char) 160).d(dVar.o()).append((char) 160);
            mVar.i(dVar, length);
        }
    }

    public class l implements lt.m.c<eo.h> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.h hVar) {
            a.I(mVar, hVar.r(), hVar.s(), hVar);
        }
    }

    public class m implements lt.m.c<eo.n> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.n nVar) {
            a.I(mVar, null, nVar.p(), nVar);
        }
    }

    public class n implements lt.m.c<eo.m> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.m mVar2) {
            t tVarA = mVar.u().c().a(eo.m.class);
            if (tVarA == null) {
                mVar.E(mVar2);
                return;
            }
            int length = mVar.length();
            mVar.E(mVar2);
            if (length == mVar.length()) {
                mVar.builder().append((char) 65532);
            }
            lt.g gVarU = mVar.u();
            boolean z10 = mVar2.g() instanceof eo.o;
            String strB = gVarU.a().b(mVar2.o());
            r rVarK = mVar.k();
            pt.c.f29318a.d(rVarK, strB);
            pt.c.b.d(rVarK, Boolean.valueOf(z10));
            pt.c.f29319c.d(rVarK, null);
            mVar.c(length, tVarA.a(gVarU, rVarK));
        }
    }

    public class o implements lt.m.c<eo.r> {
        @Override // lt.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull lt.m mVar, @NonNull eo.r rVar) {
            int length = mVar.length();
            mVar.E(rVar);
            eo.a aVarG = rVar.g();
            if (aVarG instanceof v) {
                v vVar = (v) aVarG;
                int iT = vVar.t();
                mt.b.f24386a.d(mVar.k(), mt.b.a.ORDERED);
                mt.b.f24387c.d(mVar.k(), Integer.valueOf(iT));
                vVar.w(vVar.t() + 1);
            } else {
                mt.b.f24386a.d(mVar.k(), mt.b.a.BULLET);
                mt.b.b.d(mVar.k(), Integer.valueOf(a.B(rVar)));
            }
            mVar.i(rVar, length);
            if (mVar.d(rVar)) {
                mVar.y();
            }
        }
    }

    public interface p {
        void a(@NonNull lt.m mVar, @NonNull String str, int i10);
    }

    public static void A(@NonNull lt.m.b bVar) {
        bVar.b(eo.r.class, new o());
    }

    public static int B(@NonNull s sVar) {
        int i10 = 0;
        for (s sVarG = sVar.g(); sVarG != null; sVarG = sVarG.g()) {
            if (sVarG instanceof eo.r) {
                i10++;
            }
        }
        return i10;
    }

    public static void C(@NonNull lt.m.b bVar) {
        bVar.b(v.class, new mt.d());
    }

    public static void D(@NonNull lt.m.b bVar) {
        bVar.b(w.class, new e());
    }

    public static void E(@NonNull lt.m.b bVar) {
        bVar.b(x.class, new c());
    }

    public static void F(@NonNull lt.m.b bVar) {
        bVar.b(a0.class, new h());
    }

    public static void H(@NonNull lt.m.b bVar) {
        bVar.b(c0.class, new C0481a());
    }

    public static void I(@NonNull lt.m mVar, String str, @NonNull String str2, @NonNull s sVar) {
        mVar.s(sVar);
        int length = mVar.length();
        mVar.builder().append((char) 160).append('\n').append(mVar.u().d().a(str, str2));
        mVar.y();
        mVar.builder().append((char) 160);
        mt.b.f24391g.d(mVar.k(), str);
        mVar.i(sVar, length);
        mVar.n(sVar);
    }

    public static void o(@NonNull lt.m.b bVar) {
        bVar.b(eo.b.class, new j());
    }

    public static void p(@NonNull lt.m.b bVar) {
        bVar.b(eo.c.class, new mt.d());
    }

    public static void q(@NonNull lt.m.b bVar) {
        bVar.b(eo.d.class, new k());
    }

    @NonNull
    public static a r() {
        return new a();
    }

    public static void s(@NonNull lt.m.b bVar) {
        bVar.b(eo.g.class, new i());
    }

    public static void t(@NonNull lt.m.b bVar) {
        bVar.b(eo.h.class, new l());
    }

    public static void u(@NonNull lt.m.b bVar) {
        bVar.b(eo.i.class, new d());
    }

    public static void v(@NonNull lt.m.b bVar) {
        bVar.b(eo.j.class, new b());
    }

    public static void w(lt.m.b bVar) {
        bVar.b(eo.m.class, new n());
    }

    public static void x(@NonNull lt.m.b bVar) {
        bVar.b(eo.n.class, new m());
    }

    public static boolean y(@NonNull w wVar) {
        eo.a aVarG = wVar.g();
        if (aVarG == null) {
            return false;
        }
        s sVarG = aVarG.g();
        if (sVarG instanceof q) {
            return ((q) sVarG).p();
        }
        return false;
    }

    public static void z(@NonNull lt.m.b bVar) {
        bVar.b(eo.o.class, new f());
    }

    public final void G(@NonNull lt.m.b bVar) {
        bVar.b(b0.class, new g());
    }

    @Override // lt.j
    public void b(@NonNull lt.k.a aVar) {
        nt.b bVar = new nt.b();
        aVar.a(a0.class, new nt.h()).a(eo.g.class, new nt.d()).a(eo.b.class, new nt.a()).a(eo.d.class, new nt.c()).a(eo.h.class, bVar).a(eo.n.class, bVar).a(eo.r.class, new nt.g()).a(eo.j.class, new nt.e()).a(eo.o.class, new nt.f()).a(c0.class, new nt.i());
    }

    @Override // lt.j
    public void c(@NonNull TextView textView) {
        if (this.b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // lt.j
    public void g(@NonNull lt.m.b bVar) {
        G(bVar);
        F(bVar);
        s(bVar);
        o(bVar);
        q(bVar);
        t(bVar);
        x(bVar);
        w(bVar);
        p(bVar);
        C(bVar);
        A(bVar);
        H(bVar);
        v(bVar);
        E(bVar);
        u(bVar);
        D(bVar);
        z(bVar);
    }

    @Override // lt.j
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        ot.i.a(textView, spanned);
        if (spanned instanceof Spannable) {
            ot.k.a((Spannable) spanned, textView);
        }
    }
}
