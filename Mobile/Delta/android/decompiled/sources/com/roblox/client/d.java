package com.roblox.client;

import android.content.Context;
import androidx.annotation.NonNull;
import ci.g;
import ci.j;
import ci.l;
import ek.c0;
import ek.d0;
import ek.q;
import ek.t;
import org.json.JSONObject;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f9080c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f9079a = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f9081d = f.UnKnown;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9082e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9083f = "";

    public class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0139d f9084a;

        public a(InterfaceC0139d interfaceC0139d) {
            this.f9084a = interfaceC0139d;
        }

        @Override // ci.l
        public void a(j jVar) {
        }

        @Override // ci.l
        public void b(j jVar) {
            d.this.c(jVar);
            InterfaceC0139d interfaceC0139d = this.f9084a;
            if (interfaceC0139d != null) {
                interfaceC0139d.a(d.this.f9079a);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f9085a = new d(new d0());
    }

    public static abstract class c implements InterfaceC0139d {
        @Override // com.roblox.client.d.InterfaceC0139d
        public void b(e eVar) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.d$d, reason: collision with other inner class name */
    public interface InterfaceC0139d {
        void a(e eVar);

        void b(e eVar);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public f f9086a = f.UnKnown;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9087c;

        public boolean a() {
            return this.f9086a == f.NewAppRequired;
        }

        public boolean b() {
            return this.f9086a == f.Recommended;
        }

        public boolean c() {
            return this.f9086a == f.Required;
        }

        public void d() {
            this.f9086a = f.Recommended;
        }

        public void e() {
            this.f9086a = f.Required;
        }

        public void f() {
            this.f9086a = f.NotRequired;
        }
    }

    public enum f {
        UnKnown,
        Recommended,
        Required,
        NotRequired,
        NewAppRequired
    }

    public d(c0 c0Var) {
        this.f9080c = c0Var;
    }

    public static d e() {
        return b.f9085a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public void b(InterfaceC0139d interfaceC0139d) {
        Context contextF;
        if (t.j() && interfaceC0139d != null && (contextF = RobloxApplication.f()) != null && mh.b.a()) {
            ah.b bVar = new ah.b();
            bVar.c(contextF);
            if (bVar.getEnabled()) {
                interfaceC0139d.a(bVar.getUpgradeCheckResult());
                return;
            }
        }
        f fVar = this.f9081d;
        f fVar2 = f.UnKnown;
        if (fVar != fVar2) {
            q.h("UpgradeCheckHelper", "Rely on the upgrade-status set by the Init process: " + this.f9081d);
            e eVar = this.f9079a;
            eVar.f9086a = this.f9081d;
            this.f9081d = fVar2;
            eVar.b = this.f9082e;
            this.f9082e = "";
            eVar.f9087c = this.f9083f;
            this.f9083f = "";
            this.b = this.f9080c.b();
            if (interfaceC0139d != null) {
                interfaceC0139d.a(this.f9079a);
                return;
            }
            return;
        }
        long jB = this.f9080c.b() - this.b;
        if (t.j()) {
            e eVar2 = this.f9079a;
            if (eVar2.f9086a == f.NewAppRequired) {
                if (jB < 3600000) {
                    if (interfaceC0139d != null) {
                        interfaceC0139d.a(eVar2);
                        return;
                    }
                    return;
                }
            } else if (this.f9079a.f9086a != fVar2 && jB < 3600000) {
                q.b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jB + " ms.");
                if (interfaceC0139d != null) {
                    interfaceC0139d.b(this.f9079a);
                    return;
                }
                return;
            }
        } else if (this.f9079a.f9086a != fVar2) {
            q.b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jB + " ms.");
            if (interfaceC0139d != null) {
                interfaceC0139d.b(this.f9079a);
                return;
            }
            return;
        }
        this.f9079a.f9086a = fVar2;
        q.h("UpgradeCheckHelper", "Perform upgrade check with the server...");
        ci.d dVarB = g.a().b(a1.Z0(), null, new a(interfaceC0139d));
        dVarB.g(new fi.b());
        dVarB.b();
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
                        this.f9079a.f9086a = f.NewAppRequired;
                    } else {
                        this.f9079a.f9086a = f.NotRequired;
                    }
                } else if (string.equals("Required")) {
                    this.f9079a.f9086a = f.Required;
                } else {
                    this.f9079a.f9086a = f.NotRequired;
                }
            } else if (string.equals("Recommended")) {
                this.f9079a.f9086a = f.Recommended;
            } else {
                this.f9079a.f9086a = f.NotRequired;
            }
            this.f9079a.b = jSONObject.optString("upgradeSource", "");
            this.f9079a.f9087c = jSONObject.optString("MD5Sum", "");
            this.b = this.f9080c.b();
        } catch (Exception e10) {
            q.k("UpgradeCheckHelper", "evaluateResponse: Exception caught: " + e10);
        }
    }

    @NonNull
    public e d() {
        return this.f9079a;
    }

    public boolean f() {
        f fVar = this.f9081d;
        f fVar2 = f.Required;
        boolean z10 = fVar == fVar2;
        boolean z11 = this.f9079a.f9086a == fVar2;
        q.i("UpgradeCheckHelper", "isUpgradeRequired: [" + z10 + ", " + z11 + "]");
        return z10 || z11;
    }

    public void g(e eVar) {
        q.h("UpgradeCheckHelper", "Set upgrade-status (from Init) = " + eVar.f9086a);
        this.f9081d = eVar.f9086a;
        this.f9082e = eVar.b;
        this.f9083f = eVar.f9087c;
    }
}
