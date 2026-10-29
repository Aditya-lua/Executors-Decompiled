package p383qi;

import android.content.Context;
import p151gk.C6124q;
import si.C11385a;
import vi.C12217h;

/* JADX INFO: renamed from: qi.h */
/* JADX INFO: loaded from: classes2.dex */
public class C10589h {

    /* JADX INFO: renamed from: a */
    public C11385a f37996a = new C11385a();

    /* JADX INFO: renamed from: b */
    public C10583b f37997b = C10583b.m40569f();

    /* JADX INFO: renamed from: qi.h$a */
    public class a implements InterfaceC10588g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f37998a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f37999b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ c f38000c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(boolean z10, Context context, c cVar) {
            this.f37998a = z10;
            this.f37999b = context;
            this.f38000c = cVar;
        }

        @Override // p383qi.InterfaceC10588g
        /* JADX INFO: renamed from: a */
        public void mo40608a(C10587f c10587f, C10587f c10587f2, String str) {
            if (this.f37998a || C12217h.m45288e().m45297i()) {
                C10589h.this.f37997b.m40585s(C10583b.c.LOCALE_MODE_GENERAL_EXPERIENCE);
                c10587f = c10587f2;
            } else {
                if (c10587f != null) {
                    C6124q.m27063h("rbx.locale", "persisting loginSignUpLocale locale: " + c10587f);
                    C10589h.this.f37997b.m40581o(c10587f, this.f37999b);
                } else {
                    c10587f = C10589h.this.f37997b.m40571d(this.f37999b);
                }
                C10589h.this.f37997b.m40585s(C10583b.c.LOCALE_MODE_LOGIN_SIGN_UP);
            }
            C10589h.this.f37997b.m40586t(this.f37999b, str);
            C10589h.this.f37997b.m40584r(c10587f2);
            this.f38000c.mo40612a(C10589h.this.f37997b.m40580n(c10587f, this.f37999b));
        }
    }

    /* JADX INFO: renamed from: qi.h$b */
    public class b implements InterfaceC10588g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f38002a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d f38003b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(Context context, d dVar) {
            this.f38002a = context;
            this.f38003b = dVar;
        }

        @Override // p383qi.InterfaceC10588g
        /* JADX INFO: renamed from: a */
        public void mo40608a(C10587f c10587f, C10587f c10587f2, String str) {
            if (C12217h.m45288e().m45297i() || C10589h.this.f37997b.m40573g() == C10583b.c.LOCALE_MODE_GENERAL_EXPERIENCE) {
                c10587f = c10587f2;
            }
            C10589h.this.f37997b.m40586t(this.f38002a, str);
            this.f38003b.mo14863a(C10589h.this.f37997b.m40580n(c10587f, this.f38002a));
        }
    }

    /* JADX INFO: renamed from: qi.h$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo40612a(boolean z10);
    }

    /* JADX INFO: renamed from: qi.h$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo14863a(boolean z10);
    }

    /* JADX INFO: renamed from: a */
    public void m40609a(Context context, c cVar) {
        m40610b(context, false, cVar);
    }

    /* JADX INFO: renamed from: b */
    public void m40610b(Context context, boolean z10, c cVar) {
        this.f37996a.m42704d(this.f37997b.m40572e(), new a(z10, context, cVar));
    }

    /* JADX INFO: renamed from: c */
    public void m40611c(Context context, d dVar) {
        this.f37996a.m42704d(this.f37997b.m40572e(), new b(context, dVar));
    }
}
