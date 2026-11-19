package yi;

import android.content.Context;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aj.a f37894a = new aj.a();
    public yi.b b = yi.b.f();

    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f37895a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f37896c;

        public a(boolean z10, Context context, c cVar) {
            this.f37895a = z10;
            this.b = context;
            this.f37896c = cVar;
        }

        @Override // yi.g
        public void a(f fVar, f fVar2, String str) {
            if (this.f37895a || dj.h.e().i()) {
                h.this.b.s(yi.b.c.LOCALE_MODE_GENERAL_EXPERIENCE);
                fVar = fVar2;
            } else {
                if (fVar != null) {
                    q.h("rbx.locale", "persisting loginSignUpLocale locale: " + fVar);
                    h.this.b.o(fVar, this.b);
                } else {
                    fVar = h.this.b.d(this.b);
                }
                h.this.b.s(yi.b.c.LOCALE_MODE_LOGIN_SIGN_UP);
            }
            h.this.b.t(this.b, str);
            h.this.b.r(fVar2);
            this.f37896c.a(h.this.b.n(fVar, this.b));
        }
    }

    public class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37898a;
        public final /* synthetic */ d b;

        public b(Context context, d dVar) {
            this.f37898a = context;
            this.b = dVar;
        }

        @Override // yi.g
        public void a(f fVar, f fVar2, String str) {
            if (dj.h.e().i() || h.this.b.g() == yi.b.c.LOCALE_MODE_GENERAL_EXPERIENCE) {
                fVar = fVar2;
            }
            h.this.b.t(this.f37898a, str);
            this.b.a(h.this.b.n(fVar, this.f37898a));
        }
    }

    public interface c {
        void a(boolean z10);
    }

    public interface d {
        void a(boolean z10);
    }

    public void a(Context context, c cVar) {
        b(context, false, cVar);
    }

    public void b(Context context, boolean z10, c cVar) {
        this.f37894a.d(this.b.e(), new a(z10, context, cVar));
    }

    public void c(Context context, d dVar) {
        this.f37894a.d(this.b.e(), new b(context, dVar));
    }
}
