package p482v2;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: v2.a */
/* JADX INFO: loaded from: classes.dex */
public class C11998a {

    /* JADX INFO: renamed from: a */
    public final C12004g.c f42480a;

    /* JADX INFO: renamed from: b */
    public final Executor f42481b;

    /* JADX INFO: renamed from: v2.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12004g.c f42482a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f42483b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C12004g.c cVar, Typeface typeface) {
            this.f42482a = cVar;
            this.f42483b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42482a.mo2746b(this.f42483b);
        }
    }

    /* JADX INFO: renamed from: v2.a$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12004g.c f42485a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f42486b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(C12004g.c cVar, int i10) {
            this.f42485a = cVar;
            this.f42486b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42485a.mo2745a(this.f42486b);
        }
    }

    public C11998a(C12004g.c cVar, Executor executor) {
        this.f42480a = cVar;
        this.f42481b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m44775a(int i10) {
        this.f42481b.execute(new b(this.f42480a, i10));
    }

    /* JADX INFO: renamed from: b */
    public void m44776b(C12003f.e eVar) {
        if (eVar.m44806a()) {
            m44777c(eVar.f42516a);
        } else {
            m44775a(eVar.f42517b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m44777c(Typeface typeface) {
        this.f42481b.execute(new a(this.f42480a, typeface));
    }
}
