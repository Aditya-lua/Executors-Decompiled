package p105ej;

import androidx.annotation.NonNull;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import gi.InterfaceC6100a;
import p104ei.C5132j;
import p104ei.InterfaceC5128f;
import p104ei.InterfaceC5134l;
import p151gk.C6124q;
import p174hj.C6410a;
import vi.C12216g;

/* JADX INFO: renamed from: ej.m */
/* JADX INFO: loaded from: classes2.dex */
public class C5155m {

    /* JADX INFO: renamed from: a */
    public InterfaceC5128f f20055a;

    /* JADX INFO: renamed from: b */
    public C12216g f20056b = C12216g.m45228b();

    /* JADX INFO: renamed from: ej.m$a */
    public class a implements InterfaceC5134l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f20057a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(c cVar) {
            this.f20057a = cVar;
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: a */
        public void mo15091a(C5132j c5132j) {
            b bVar;
            String strM23932a = c5132j.m23932a();
            C6124q.m27063h("rbx.purchaseflow", "Verify Purchase callback. response code " + c5132j.m23933b() + " responseBody = " + strM23932a + ".");
            int iM23933b = c5132j.m23933b();
            if (iM23933b == 200) {
                C6124q.m27063h("rbx.purchaseflow", "Verification success");
                bVar = b.OK;
                C5155m.this.f20056b.m45244L();
            } else if (iM23933b == 500) {
                C6124q.m27060e("rbx.purchaseflow", "Server error");
                bVar = b.UNKNOWN;
                C5155m.this.f20056b.m45247O();
            } else if (iM23933b == 400) {
                C6124q.m27060e("rbx.purchaseflow", "Service was unable to validate receiptId.");
                bVar = b.ERROR;
                C5155m.this.f20056b.m45245M();
            } else if (iM23933b != 401) {
                C6124q.m27060e("rbx.purchaseflow", "Unknown");
                bVar = b.UNKNOWN;
                C5155m.this.f20056b.m45248P();
            } else {
                C6124q.m27060e("rbx.purchaseflow", "Unauthorized to make request.");
                bVar = b.BOGUS;
                C5155m.this.f20056b.m45246N();
            }
            PurchaseVerificationResponse purchaseVerificationResponseM27992a = C6410a.m27992a(strM23932a);
            c cVar = this.f20057a;
            if (cVar != null) {
                cVar.mo23991a(bVar, purchaseVerificationResponseM27992a);
            }
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: b */
        public void mo15092b(C5132j c5132j) {
        }
    }

    /* JADX INFO: renamed from: ej.m$b */
    public enum b {
        OK,
        ERROR,
        BOGUS,
        EMPTY_RESPONSE,
        UNKNOWN
    }

    /* JADX INFO: renamed from: ej.m$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo23991a(b bVar, PurchaseVerificationResponse purchaseVerificationResponse);
    }

    public C5155m(@NonNull InterfaceC5128f interfaceC5128f) {
        this.f20055a = interfaceC5128f;
    }

    /* JADX INFO: renamed from: b */
    public void m23989b(String str, InterfaceC6100a interfaceC6100a, c cVar) {
        this.f20055a.mo23930b(str, interfaceC6100a, null, new a(cVar)).m23907b();
        this.f20056b.m45243K();
    }
}
