package ts;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on.a0;
import on.b0;
import on.c0;
import on.q;
import on.s;
import on.v;
import on.w;
import on.x;
import ss.r;
import ss.t;

/* JADX INFO: loaded from: classes3.dex */
public class a extends ss.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p> f32602a = new ArrayList(0);
    public boolean b;

    /* JADX INFO: renamed from: ts.a$a, reason: collision with other inner class name */
    public class C0586a implements ss.m.c<c0> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull c0 c0Var) {
            mVar.g(c0Var);
            int length = mVar.length();
            mVar.builder().append((char) 160);
            mVar.p(c0Var, length);
            mVar.s(c0Var);
        }
    }

    public class b implements ss.m.c<on.j> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.j jVar) {
            mVar.g(jVar);
            int length = mVar.length();
            mVar.a(jVar);
            ts.b.f32606d.d(mVar.n(), Integer.valueOf(jVar.p()));
            mVar.p(jVar, length);
            mVar.s(jVar);
        }
    }

    public class c implements ss.m.c<x> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull x xVar) {
            mVar.builder().append(' ');
        }
    }

    public class d implements ss.m.c<on.i> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.i iVar) {
            mVar.z();
        }
    }

    public class e implements ss.m.c<w> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull w wVar) {
            boolean zY = a.y(wVar);
            if (!zY) {
                mVar.g(wVar);
            }
            int length = mVar.length();
            mVar.a(wVar);
            ts.b.f32608f.d(mVar.n(), Boolean.valueOf(zY));
            mVar.p(wVar, length);
            if (zY) {
                return;
            }
            mVar.s(wVar);
        }
    }

    public class f implements ss.m.c<on.o> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.o oVar) {
            int length = mVar.length();
            mVar.a(oVar);
            ts.b.f32607e.d(mVar.n(), oVar.o());
            mVar.p(oVar, length);
        }
    }

    public class g implements ss.m.c<b0> {
        public g() {
        }

        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull b0 b0Var) {
            String strO = b0Var.o();
            mVar.builder().d(strO);
            if (a.this.f32602a.isEmpty()) {
                return;
            }
            int length = mVar.length() - strO.length();
            Iterator it = a.this.f32602a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(mVar, strO, length);
            }
        }
    }

    public class h implements ss.m.c<a0> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull a0 a0Var) {
            int length = mVar.length();
            mVar.a(a0Var);
            mVar.p(a0Var, length);
        }
    }

    public class i implements ss.m.c<on.g> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.g gVar) {
            int length = mVar.length();
            mVar.a(gVar);
            mVar.p(gVar, length);
        }
    }

    public class j implements ss.m.c<on.b> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.b bVar) {
            mVar.g(bVar);
            int length = mVar.length();
            mVar.a(bVar);
            mVar.p(bVar, length);
            mVar.s(bVar);
        }
    }

    public class k implements ss.m.c<on.d> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.d dVar) {
            int length = mVar.length();
            mVar.builder().append((char) 160).d(dVar.o()).append((char) 160);
            mVar.p(dVar, length);
        }
    }

    public class l implements ss.m.c<on.h> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.h hVar) {
            a.I(mVar, hVar.r(), hVar.s(), hVar);
        }
    }

    public class m implements ss.m.c<on.n> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.n nVar) {
            a.I(mVar, null, nVar.p(), nVar);
        }
    }

    public class n implements ss.m.c<on.m> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.m mVar2) {
            t tVarA = mVar.x().c().a(on.m.class);
            if (tVarA == null) {
                mVar.a(mVar2);
                return;
            }
            int length = mVar.length();
            mVar.a(mVar2);
            if (length == mVar.length()) {
                mVar.builder().append((char) 65532);
            }
            ss.g gVarX = mVar.x();
            boolean z10 = mVar2.g() instanceof on.o;
            String strB = gVarX.a().b(mVar2.o());
            r rVarN = mVar.n();
            ws.c.f34978a.d(rVarN, strB);
            ws.c.b.d(rVarN, Boolean.valueOf(z10));
            ws.c.f34979c.d(rVarN, null);
            mVar.b(length, tVarA.a(gVarX, rVarN));
        }
    }

    public class o implements ss.m.c<on.r> {
        @Override // ss.m.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ss.m mVar, @NonNull on.r rVar) {
            int length = mVar.length();
            mVar.a(rVar);
            on.a aVarG = rVar.g();
            if (aVarG instanceof v) {
                v vVar = (v) aVarG;
                int iT = vVar.t();
                ts.b.f32604a.d(mVar.n(), ts.b.a.ORDERED);
                ts.b.f32605c.d(mVar.n(), Integer.valueOf(iT));
                vVar.w(vVar.t() + 1);
            } else {
                ts.b.f32604a.d(mVar.n(), ts.b.a.BULLET);
                ts.b.b.d(mVar.n(), Integer.valueOf(a.B(rVar)));
            }
            mVar.p(rVar, length);
            if (mVar.d(rVar)) {
                mVar.z();
            }
        }
    }

    public interface p {
        void a(@NonNull ss.m mVar, @NonNull String str, int i10);
    }

    public static void A(@NonNull ss.m.b bVar) {
        bVar.b(on.r.class, new o());
    }

    public static int B(@NonNull s sVar) {
        int i10 = 0;
        for (s sVarG = sVar.g(); sVarG != null; sVarG = sVarG.g()) {
            if (sVarG instanceof on.r) {
                i10++;
            }
        }
        return i10;
    }

    public static void C(@NonNull ss.m.b bVar) {
        bVar.b(v.class, new ts.d());
    }

    public static void D(@NonNull ss.m.b bVar) {
        bVar.b(w.class, new e());
    }

    public static void E(@NonNull ss.m.b bVar) {
        bVar.b(x.class, new c());
    }

    public static void F(@NonNull ss.m.b bVar) {
        bVar.b(a0.class, new h());
    }

    public static void H(@NonNull ss.m.b bVar) {
        bVar.b(c0.class, new C0586a());
    }

    public static void I(@NonNull ss.m mVar, String str, @NonNull String str2, @NonNull s sVar) {
        mVar.g(sVar);
        int length = mVar.length();
        mVar.builder().append((char) 160).append('\n').append(mVar.x().d().a(str, str2));
        mVar.z();
        mVar.builder().append((char) 160);
        ts.b.f32609g.d(mVar.n(), str);
        mVar.p(sVar, length);
        mVar.s(sVar);
    }

    public static void o(@NonNull ss.m.b bVar) {
        bVar.b(on.b.class, new j());
    }

    public static void p(@NonNull ss.m.b bVar) {
        bVar.b(on.c.class, new ts.d());
    }

    public static void q(@NonNull ss.m.b bVar) {
        bVar.b(on.d.class, new k());
    }

    @NonNull
    public static a r() {
        return new a();
    }

    public static void s(@NonNull ss.m.b bVar) {
        bVar.b(on.g.class, new i());
    }

    public static void t(@NonNull ss.m.b bVar) {
        bVar.b(on.h.class, new l());
    }

    public static void u(@NonNull ss.m.b bVar) {
        bVar.b(on.i.class, new d());
    }

    public static void v(@NonNull ss.m.b bVar) {
        bVar.b(on.j.class, new b());
    }

    public static void w(ss.m.b bVar) {
        bVar.b(on.m.class, new n());
    }

    public static void x(@NonNull ss.m.b bVar) {
        bVar.b(on.n.class, new m());
    }

    public static boolean y(@NonNull w wVar) {
        on.a aVarG = wVar.g();
        if (aVarG == null) {
            return false;
        }
        s sVarG = aVarG.g();
        if (sVarG instanceof q) {
            return ((q) sVarG).p();
        }
        return false;
    }

    public static void z(@NonNull ss.m.b bVar) {
        bVar.b(on.o.class, new f());
    }

    public final void G(@NonNull ss.m.b bVar) {
        bVar.b(b0.class, new g());
    }

    @Override // ss.j
    public void a(@NonNull ss.m.b bVar) {
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

    @Override // ss.j
    public void c(@NonNull TextView textView) {
        if (this.b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // ss.j
    public void f(@NonNull ss.k.a aVar) {
        us.b bVar = new us.b();
        aVar.a(a0.class, new us.h()).a(on.g.class, new us.d()).a(on.b.class, new us.a()).a(on.d.class, new us.c()).a(on.h.class, bVar).a(on.n.class, bVar).a(on.r.class, new us.g()).a(on.j.class, new us.e()).a(on.o.class, new us.f()).a(c0.class, new us.i());
    }

    @Override // ss.j
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        vs.h.a(textView, spanned);
        if (spanned instanceof Spannable) {
            vs.j.a((Spannable) spanned, textView);
        }
    }
}
