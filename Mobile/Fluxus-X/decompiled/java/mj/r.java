package mj;

import androidx.annotation.NonNull;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mi.f f23312a;
    public dj.g b = dj.g.b();

    public class a implements mi.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f23313a;

        public a(c cVar) {
            this.f23313a = cVar;
        }

        @Override // mi.l
        public void a(mi.j jVar) {
        }

        @Override // mi.l
        public void b(mi.j jVar) {
            b bVar;
            String strA = jVar.a();
            ok.q.h("rbx.purchaseflow", "Verify Purchase callback. response code " + jVar.b() + " responseBody = " + strA + ".");
            int iB = jVar.b();
            if (iB == 200) {
                ok.q.h("rbx.purchaseflow", "Verification success");
                bVar = b.OK;
                r.this.b.L();
            } else if (iB == 500) {
                ok.q.e("rbx.purchaseflow", "Server error");
                bVar = b.UNKNOWN;
                r.this.b.O();
            } else if (iB == 400) {
                ok.q.e("rbx.purchaseflow", "Service was unable to validate receiptId.");
                bVar = b.ERROR;
                r.this.b.M();
            } else if (iB != 401) {
                ok.q.e("rbx.purchaseflow", "Unknown");
                bVar = b.UNKNOWN;
                r.this.b.P();
            } else {
                ok.q.e("rbx.purchaseflow", "Unauthorized to make request.");
                bVar = b.BOGUS;
                r.this.b.N();
            }
            PurchaseVerificationResponse purchaseVerificationResponseA = pj.a.a(strA);
            c cVar = this.f23313a;
            if (cVar != null) {
                cVar.a(bVar, purchaseVerificationResponseA);
            }
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

    public r(@NonNull mi.f fVar) {
        this.f23312a = fVar;
    }

    public void b(String str, oi.a aVar, c cVar) {
        this.f23312a.a(str, aVar, null, new a(cVar)).b();
        this.b.K();
    }
}
