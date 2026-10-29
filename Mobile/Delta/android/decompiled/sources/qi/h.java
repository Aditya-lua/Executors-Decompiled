package qi;

import android.content.Context;
import gk.p;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public si.a f29416a = new si.a();
    public qi.b b = qi.b.f();

    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f29417a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f29418c;

        public a(boolean z10, Context context, c cVar) {
            this.f29417a = z10;
            this.b = context;
            this.f29418c = cVar;
        }

        @Override // qi.g
        public void a(f fVar, f fVar2, String str) {
            if (this.f29417a || vi.h.e().i()) {
                h.this.b.s(qi.b.c.LOCALE_MODE_GENERAL_EXPERIENCE);
                fVar = fVar2;
            } else {
                if (fVar != null) {
                    p.h("rbx.locale", "persisting loginSignUpLocale locale: " + fVar);
                    h.this.b.o(fVar, this.b);
                } else {
                    fVar = h.this.b.d(this.b);
                }
                h.this.b.s(qi.b.c.LOCALE_MODE_LOGIN_SIGN_UP);
            }
            h.this.b.t(this.b, str);
            h.this.b.r(fVar2);
            this.f29418c.a(h.this.b.n(fVar, this.b));
        }
    }

    public class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f29420a;
        public final /* synthetic */ d b;

        public b(Context context, d dVar) {
            this.f29420a = context;
            this.b = dVar;
        }

        @Override // qi.g
        public void a(f fVar, f fVar2, String str) {
            if (vi.h.e().i() || h.this.b.g() == qi.b.c.LOCALE_MODE_GENERAL_EXPERIENCE) {
                fVar = fVar2;
            }
            h.this.b.t(this.f29420a, str);
            this.b.a(h.this.b.n(fVar, this.f29420a));
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
        this.f29416a.d(this.b.e(), new a(z10, context, cVar));
    }

    public void c(Context context, d dVar) {
        this.f29416a.d(this.b.e(), new b(context, dVar));
    }
}
