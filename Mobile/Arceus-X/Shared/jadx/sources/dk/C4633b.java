package dk;

import fk.C5654c;
import p106ek.C5158a;
import p337ol.EnumC9799a;

/* JADX INFO: renamed from: dk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C4633b {

    /* JADX INFO: renamed from: a */
    public C5158a f19009a = new C5158a();

    /* JADX INFO: renamed from: b */
    public b f19010b;

    /* JADX INFO: renamed from: dk.b$a */
    public class a implements InterfaceC4632a {
        public a() {
        }

        @Override // dk.InterfaceC4632a
        /* JADX INFO: renamed from: a */
        public void mo22852a(String str) {
            EnumC9799a enumC9799aM38604b = EnumC9799a.m38604b(str);
            C5654c.m25669c().m25689u(enumC9799aM38604b);
            C4633b.this.m22855c(enumC9799aM38604b);
        }
    }

    /* JADX INFO: renamed from: dk.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo22856a(EnumC9799a enumC9799a);
    }

    /* JADX INFO: renamed from: b */
    public void m22854b(b bVar) {
        this.f19010b = bVar;
        this.f19009a.m23995d(C5654c.m25669c().m25678j(), new a());
    }

    /* JADX INFO: renamed from: c */
    public final void m22855c(EnumC9799a enumC9799a) {
        b bVar = this.f19010b;
        if (bVar != null) {
            bVar.mo22856a(enumC9799a);
        }
    }
}
