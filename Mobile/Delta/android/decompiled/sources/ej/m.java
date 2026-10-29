package ej;

import androidx.annotation.NonNull;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import gk.p;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ei.f f15618a;
    public vi.g b = vi.g.b();

    public class a implements ei.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f15619a;

        public a(c cVar) {
            this.f15619a = cVar;
        }

        @Override // ei.l
        public void a(ei.j jVar) {
            b bVar;
            String strA = jVar.a();
            p.h("rbx.purchaseflow", "Verify Purchase callback. response code " + jVar.b() + " responseBody = " + strA + ".");
            int iB = jVar.b();
            if (iB == 200) {
                p.h("rbx.purchaseflow", "Verification success");
                bVar = b.OK;
                m.this.b.L();
            } else if (iB == 500) {
                p.e("rbx.purchaseflow", "Server error");
                bVar = b.UNKNOWN;
                m.this.b.O();
            } else if (iB == 400) {
                p.e("rbx.purchaseflow", "Service was unable to validate receiptId.");
                bVar = b.ERROR;
                m.this.b.M();
            } else if (iB != 401) {
                p.e("rbx.purchaseflow", "Unknown");
                bVar = b.UNKNOWN;
                m.this.b.P();
            } else {
                p.e("rbx.purchaseflow", "Unauthorized to make request.");
                bVar = b.BOGUS;
                m.this.b.N();
            }
            PurchaseVerificationResponse purchaseVerificationResponseA = hj.a.a(strA);
            c cVar = this.f15619a;
            if (cVar != null) {
                cVar.a(bVar, purchaseVerificationResponseA);
            }
        }

        @Override // ei.l
        public void b(ei.j jVar) {
        }
    }

    public enum b {
        OK,
        ERROR,
        BOGUS,
        EMPTY_RESPONSE,
        UNKNOWN
    }

    public interface c {
        void a(b bVar, PurchaseVerificationResponse purchaseVerificationResponse);
    }

    public m(@NonNull ei.f fVar) {
        this.f15618a = fVar;
    }

    public void b(String str, gi.a aVar, c cVar) {
        this.f15618a.b(str, aVar, null, new a(cVar)).b();
        this.b.K();
    }
}
