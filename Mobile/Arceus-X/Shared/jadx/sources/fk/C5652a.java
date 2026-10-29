package fk;

import p104ei.AsyncTaskC5126d;
import p104ei.C5129g;
import p104ei.C5131i;
import p104ei.C5132j;
import p104ei.InterfaceC5135m;
import p173hi.C6407b;
import sg.C11295a1;

/* JADX INFO: renamed from: fk.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5652a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5135m f21697a;

    /* JADX INFO: renamed from: b */
    public boolean f21698b = true;

    /* JADX INFO: renamed from: fk.a$a */
    public class a extends C5131i {
        public a() {
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: a */
        public void mo15091a(C5132j c5132j) {
            if (C5652a.this.f21697a != null) {
                C5652a.this.f21697a.mo14796a(c5132j);
            }
        }
    }

    /* JADX INFO: renamed from: fk.a$b */
    public static class b extends C6407b {
        /* JADX DEBUG: Method merged with bridge method: c(Ljava/lang/Object;)Z */
        @Override // p173hi.C6407b, p173hi.InterfaceC6409d
        /* JADX INFO: renamed from: d */
        public boolean mo25667c(C5132j c5132j) {
            return (c5132j.m23933b() == 200 || c5132j.m23933b() == 401) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    public C5652a(InterfaceC5135m interfaceC5135m) {
        this.f21697a = interfaceC5135m;
    }

    /* JADX INFO: renamed from: b */
    public void m25665b() {
        this.f21698b = false;
    }

    /* JADX INFO: renamed from: c */
    public void m25666c() {
        AsyncTaskC5126d asyncTaskC5126dMo23929a = C5129g.m23931a().mo23929a(C11295a1.m42436a1(), null, new a());
        if (this.f21698b) {
            asyncTaskC5126dMo23929a.m23912g(new b());
        }
        asyncTaskC5126dMo23929a.m23907b();
    }
}
