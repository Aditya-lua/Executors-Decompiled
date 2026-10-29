package vs;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qn.a0;
import qn.b0;
import qn.c0;
import qn.q;
import qn.s;
import qn.v;
import qn.w;
import qn.x;
import us.r;
import us.t;

/* JADX INFO: loaded from: classes3.dex */
public class a extends us.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p> f33466a = new ArrayList(0);
    public boolean b;

    /* JADX INFO: renamed from: vs.a$a, reason: collision with other inner class name */
    public class C0607a implements us.m.c<c0> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull c0 c0Var) {
            mVar.t(c0Var);
            int length = mVar.length();
            mVar.builder().append((char) 160);
            mVar.k(c0Var, length);
            mVar.D(c0Var);
        }
    }

    public class b implements us.m.c<qn.j> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.j jVar) {
            mVar.t(jVar);
            int length = mVar.length();
            mVar.h(jVar);
            vs.b.f33470d.d(mVar.o(), Integer.valueOf(jVar.p()));
            mVar.k(jVar, length);
            mVar.D(jVar);
        }
    }

    public class c implements us.m.c<x> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull x xVar) {
            mVar.builder().append(' ');
        }
    }

    public class d implements us.m.c<qn.i> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.i iVar) {
            mVar.B();
        }
    }

    public class e implements us.m.c<w> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull w wVar) {
            boolean zY = a.y(wVar);
            if (!zY) {
                mVar.t(wVar);
            }
            int length = mVar.length();
            mVar.h(wVar);
            vs.b.f33472f.d(mVar.o(), Boolean.valueOf(zY));
            mVar.k(wVar, length);
            if (zY) {
                return;
            }
            mVar.D(wVar);
        }
    }

    public class f implements us.m.c<qn.o> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.o oVar) {
            int length = mVar.length();
            mVar.h(oVar);
            vs.b.f33471e.d(mVar.o(), oVar.o());
            mVar.k(oVar, length);
        }
    }

    public class g implements us.m.c<b0> {
        public g() {
        }

        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull b0 b0Var) {
            String strO = b0Var.o();
            mVar.builder().d(strO);
            if (a.this.f33466a.isEmpty()) {
                return;
            }
            int length = mVar.length() - strO.length();
            Iterator it = a.this.f33466a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(mVar, strO, length);
            }
        }
    }

    public class h implements us.m.c<a0> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull a0 a0Var) {
            int length = mVar.length();
            mVar.h(a0Var);
            mVar.k(a0Var, length);
        }
    }

    public class i implements us.m.c<qn.g> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.g gVar) {
            int length = mVar.length();
            mVar.h(gVar);
            mVar.k(gVar, length);
        }
    }

    public class j implements us.m.c<qn.b> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.b bVar) {
            mVar.t(bVar);
            int length = mVar.length();
            mVar.h(bVar);
            mVar.k(bVar, length);
            mVar.D(bVar);
        }
    }

    public class k implements us.m.c<qn.d> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.d dVar) {
            int length = mVar.length();
            mVar.builder().append((char) 160).d(dVar.o()).append((char) 160);
            mVar.k(dVar, length);
        }
    }

    public class l implements us.m.c<qn.h> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.h hVar) {
            a.I(mVar, hVar.r(), hVar.s(), hVar);
        }
    }

    public class m implements us.m.c<qn.n> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.n nVar) {
            a.I(mVar, null, nVar.p(), nVar);
        }
    }

    public class n implements us.m.c<qn.m> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.m mVar2) {
            t tVarA = mVar.w().c().a(qn.m.class);
            if (tVarA == null) {
                mVar.h(mVar2);
                return;
            }
            int length = mVar.length();
            mVar.h(mVar2);
            if (length == mVar.length()) {
                mVar.builder().append((char) 65532);
            }
            us.g gVarW = mVar.w();
            boolean z10 = mVar2.g() instanceof qn.o;
            String strB = gVarW.a().b(mVar2.o());
            r rVarO = mVar.o();
            ys.c.f36349a.d(rVarO, strB);
            ys.c.b.d(rVarO, Boolean.valueOf(z10));
            ys.c.f36350c.d(rVarO, null);
            mVar.d(length, tVarA.a(gVarW, rVarO));
        }
    }

    public class o implements us.m.c<qn.r> {
        @Override // us.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull us.m mVar, @NonNull qn.r rVar) {
            int length = mVar.length();
            mVar.h(rVar);
            qn.a aVarG = rVar.g();
            if (aVarG instanceof v) {
                v vVar = (v) aVarG;
                int iT = vVar.t();
                vs.b.f33468a.d(mVar.o(), vs.b.a.ORDERED);
                vs.b.f33469c.d(mVar.o(), Integer.valueOf(iT));
                vVar.w(vVar.t() + 1);
            } else {
                vs.b.f33468a.d(mVar.o(), vs.b.a.BULLET);
                vs.b.b.d(mVar.o(), Integer.valueOf(a.B(rVar)));
            }
            mVar.k(rVar, length);
            if (mVar.c(rVar)) {
                mVar.B();
            }
        }
    }

    public interface p {
        void a(@NonNull us.m mVar, @NonNull String str, int i10);
    }

    public static void A(@NonNull us.m.b bVar) {
        bVar.a(qn.r.class, new o());
    }

    public static int B(@NonNull s sVar) {
        int i10 = 0;
        for (s sVarG = sVar.g(); sVarG != null; sVarG = sVarG.g()) {
            if (sVarG instanceof qn.r) {
                i10++;
            }
        }
        return i10;
    }

    public static void C(@NonNull us.m.b bVar) {
        bVar.a(v.class, new vs.d());
    }

    public static void D(@NonNull us.m.b bVar) {
        bVar.a(w.class, new e());
    }

    public static void E(@NonNull us.m.b bVar) {
        bVar.a(x.class, new c());
    }

    public static void F(@NonNull us.m.b bVar) {
        bVar.a(a0.class, new h());
    }

    public static void H(@NonNull us.m.b bVar) {
        bVar.a(c0.class, new C0607a());
    }

    public static void I(@NonNull us.m mVar, String str, @NonNull String str2, @NonNull s sVar) {
        mVar.t(sVar);
        int length = mVar.length();
        mVar.builder().append((char) 160).append('\n').append(mVar.w().d().a(str, str2));
        mVar.B();
        mVar.builder().append((char) 160);
        vs.b.f33473g.d(mVar.o(), str);
        mVar.k(sVar, length);
        mVar.D(sVar);
    }

    public static void o(@NonNull us.m.b bVar) {
        bVar.a(qn.b.class, new j());
    }

    public static void p(@NonNull us.m.b bVar) {
        bVar.a(qn.c.class, new vs.d());
    }

    public static void q(@NonNull us.m.b bVar) {
        bVar.a(qn.d.class, new k());
    }

    @NonNull
    public static a r() {
        return new a();
    }

    public static void s(@NonNull us.m.b bVar) {
        bVar.a(qn.g.class, new i());
    }

    public static void t(@NonNull us.m.b bVar) {
        bVar.a(qn.h.class, new l());
    }

    public static void u(@NonNull us.m.b bVar) {
        bVar.a(qn.i.class, new d());
    }

    public static void v(@NonNull us.m.b bVar) {
        bVar.a(qn.j.class, new b());
    }

    public static void w(us.m.b bVar) {
        bVar.a(qn.m.class, new n());
    }

    public static void x(@NonNull us.m.b bVar) {
        bVar.a(qn.n.class, new m());
    }

    public static boolean y(@NonNull w wVar) {
        qn.a aVarG = wVar.g();
        if (aVarG == null) {
            return false;
        }
        s sVarG = aVarG.g();
        if (sVarG instanceof q) {
            return ((q) sVarG).p();
        }
        return false;
    }

    public static void z(@NonNull us.m.b bVar) {
        bVar.a(qn.o.class, new f());
    }

    public final void G(@NonNull us.m.b bVar) {
        bVar.a(b0.class, new g());
    }

    @Override // us.j
    public void b(@NonNull TextView textView) {
        if (this.b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // us.j
    public void f(@NonNull us.m.b bVar) {
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

    @Override // us.j
    public void g(@NonNull us.k.a aVar) {
        ws.b bVar = new ws.b();
        aVar.a(a0.class, new ws.h()).a(qn.g.class, new ws.d()).a(qn.b.class, new ws.a()).a(qn.d.class, new ws.c()).a(qn.h.class, bVar).a(qn.n.class, bVar).a(qn.r.class, new ws.g()).a(qn.j.class, new ws.e()).a(qn.o.class, new ws.f()).a(c0.class, new ws.i());
    }

    @Override // us.j
    public void j(@NonNull TextView textView, @NonNull Spanned spanned) {
        xs.h.a(textView, spanned);
        if (spanned instanceof Spannable) {
            xs.j.a((Spannable) spanned, textView);
        }
    }
}
