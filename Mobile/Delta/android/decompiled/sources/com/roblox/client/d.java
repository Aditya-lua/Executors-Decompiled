package com.roblox.client;

import android.content.Context;
import androidx.annotation.NonNull;
import ei.g;
import ei.j;
import ei.l;
import gk.b0;
import gk.c0;
import gk.p;
import gk.s;
import org.json.JSONObject;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f9006c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f9005a = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f9007d = f.UnKnown;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9008e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9009f = "";

    public class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0136d f9010a;

        public a(InterfaceC0136d interfaceC0136d) {
            this.f9010a = interfaceC0136d;
        }

        @Override // ei.l
        public void a(j jVar) {
            d.this.c(jVar);
            InterfaceC0136d interfaceC0136d = this.f9010a;
            if (interfaceC0136d != null) {
                interfaceC0136d.a(d.this.f9005a);
            }
        }

        @Override // ei.l
        public void b(j jVar) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f9011a = new d(new c0());
    }

    public static abstract class c implements InterfaceC0136d {
        @Override // com.roblox.client.d.InterfaceC0136d
        public void b(e eVar) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.d$d, reason: collision with other inner class name */
    public interface InterfaceC0136d {
        void a(e eVar);

        void b(e eVar);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public f f9012a = f.UnKnown;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9013c;

        public boolean a() {
            return this.f9012a == f.NewAppRequired;
        }

        public boolean b() {
            return this.f9012a == f.Recommended;
        }

        public boolean c() {
            return this.f9012a == f.Required;
        }

        public void d() {
            this.f9012a = f.Recommended;
        }

        public void e() {
            this.f9012a = f.Required;
        }

        public void f() {
            this.f9012a = f.NotRequired;
        }
    }

    public enum f {
        UnKnown,
        Recommended,
        Required,
        NotRequired,
        NewAppRequired
    }

    public d(b0 b0Var) {
        this.f9006c = b0Var;
    }

    public static d e() {
        return b.f9011a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public void b(InterfaceC0136d interfaceC0136d) {
        Context contextF;
        if (s.j() && interfaceC0136d != null && (contextF = RobloxApplication.f()) != null && nh.b.a()) {
            bh.b bVar = new bh.b();
            bVar.c(contextF);
            if (bVar.getEnabled()) {
                interfaceC0136d.a(bVar.getUpgradeCheckResult());
                return;
            }
        }
        f fVar = this.f9007d;
        f fVar2 = f.UnKnown;
        if (fVar != fVar2) {
            p.h("UpgradeCheckHelper", "Rely on the upgrade-status set by the Init process: " + this.f9007d);
            e eVar = this.f9005a;
            eVar.f9012a = this.f9007d;
            this.f9007d = fVar2;
            eVar.b = this.f9008e;
            this.f9008e = "";
            eVar.f9013c = this.f9009f;
            this.f9009f = "";
            this.b = this.f9006c.b();
            if (interfaceC0136d != null) {
                interfaceC0136d.a(this.f9005a);
                return;
            }
            return;
        }
        long jB = this.f9006c.b() - this.b;
        if (s.j()) {
            e eVar2 = this.f9005a;
            if (eVar2.f9012a == f.NewAppRequired) {
                if (jB < 3600000) {
                    if (interfaceC0136d != null) {
                        interfaceC0136d.a(eVar2);
                        return;
                    }
                    return;
                }
            } else if (this.f9005a.f9012a != fVar2 && jB < 3600000) {
                p.b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jB + " ms.");
                if (interfaceC0136d != null) {
                    interfaceC0136d.b(this.f9005a);
                    return;
                }
                return;
            }
        } else if (this.f9005a.f9012a != fVar2) {
            p.b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jB + " ms.");
            if (interfaceC0136d != null) {
                interfaceC0136d.b(this.f9005a);
                return;
            }
            return;
        }
        this.f9005a.f9012a = fVar2;
        p.h("UpgradeCheckHelper", "Perform upgrade check with the server...");
        ei.d dVarA = g.a().a(a1.Y0(), null, new a(interfaceC0136d));
        dVarA.g(new hi.b());
        dVarA.b();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0002, B:6:0x0014, B:24:0x005d, B:25:0x0063, B:13:0x002e, B:15:0x0036, B:18:0x003f, B:20:0x0047, B:21:0x004e, B:23:0x0056), top: B:29:0x0002 }] */
    public final void c(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject(jVar.a());
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return;
            }
            String string = jSONObject2.getString("UpgradeAction");
            int iHashCode = string.hashCode();
            if (iHashCode != -1189181893) {
                if (iHashCode != -328495169) {
                    if (iHashCode == -144187584 && string.equals("NewAppRequired")) {
                        this.f9005a.f9012a = f.NewAppRequired;
                    } else {
                        this.f9005a.f9012a = f.NotRequired;
                    }
                } else if (string.equals("Required")) {
                    this.f9005a.f9012a = f.Required;
                } else {
                    this.f9005a.f9012a = f.NotRequired;
                }
            } else if (string.equals("Recommended")) {
                this.f9005a.f9012a = f.Recommended;
            } else {
                this.f9005a.f9012a = f.NotRequired;
            }
            this.f9005a.b = jSONObject.optString("upgradeSource", "");
            this.f9005a.f9013c = jSONObject.optString("MD5Sum", "");
            this.b = this.f9006c.b();
        } catch (Exception e10) {
            p.k("UpgradeCheckHelper", "evaluateResponse: Exception caught: " + e10);
        }
    }

    @NonNull
    public e d() {
        return this.f9005a;
    }

    public boolean f() {
        f fVar = this.f9007d;
        f fVar2 = f.Required;
        boolean z10 = fVar == fVar2;
        boolean z11 = this.f9005a.f9012a == fVar2;
        p.i("UpgradeCheckHelper", "isUpgradeRequired: [" + z10 + ", " + z11 + "]");
        return z10 || z11;
    }

    public void g(e eVar) {
        p.h("UpgradeCheckHelper", "Set upgrade-status (from Init) = " + eVar.f9012a);
        this.f9007d = eVar.f9012a;
        this.f9008e = eVar.b;
        this.f9009f = eVar.f9013c;
    }
}
