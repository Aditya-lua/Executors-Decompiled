package oi;

import android.content.Context;
import ek.q;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qi.a f27920a = new qi.a();
    public oi.b b = oi.b.f();

    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f27921a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f27922c;

        public a(boolean z10, Context context, c cVar) {
            this.f27921a = z10;
            this.b = context;
            this.f27922c = cVar;
        }

        @Override // oi.g
        public void a(f fVar, f fVar2, String str) {
            if (this.f27921a || ti.h.e().i()) {
                h.this.b.s(oi.b.c.LOCALE_MODE_GENERAL_EXPERIENCE);
                fVar = fVar2;
            } else {
                if (fVar != null) {
                    q.h("rbx.locale", "persisting loginSignUpLocale locale: " + fVar);
                    h.this.b.o(fVar, this.b);
                } else {
                    fVar = h.this.b.d(this.b);
                }
                h.this.b.s(oi.b.c.LOCALE_MODE_LOGIN_SIGN_UP);
            }
            h.this.b.t(this.b, str);
            h.this.b.r(fVar2);
            this.f27922c.a(h.this.b.n(fVar, this.b));
        }
    }

    public class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f27924a;
        public final /* synthetic */ d b;

        public b(Context context, d dVar) {
            this.f27924a = context;
            this.b = dVar;
        }

        @Override // oi.g
        public void a(f fVar, f fVar2, String str) {
            if (ti.h.e().i() || h.this.b.g() == oi.b.c.LOCALE_MODE_GENERAL_EXPERIENCE) {
                fVar = fVar2;
            }
            h.this.b.t(this.f27924a, str);
            this.b.a(h.this.b.n(fVar, this.f27924a));
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
        this.f27920a.d(this.b.e(), new a(z10, context, cVar));
    }

    public void c(Context context, d dVar) {
        this.f27920a.d(this.b.e(), new b(context, dVar));
    }
}
