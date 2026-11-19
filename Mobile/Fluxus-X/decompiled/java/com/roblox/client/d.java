package com.roblox.client;

import android.content.Context;
import androidx.annotation.NonNull;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import mi.g;
import mi.j;
import mi.l;
import ok.c0;
import ok.d0;
import ok.q;
import ok.t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f8897c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f8896a = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f8898d = f.UnKnown;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8899e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8900f = BuildConfig.FLAVOR;

    public class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0142d f8901a;

        public a(InterfaceC0142d interfaceC0142d) {
            this.f8901a = interfaceC0142d;
        }

        @Override // mi.l
        public void a(j jVar) {
        }

        @Override // mi.l
        public void b(j jVar) {
            d.this.c(jVar);
            InterfaceC0142d interfaceC0142d = this.f8901a;
            if (interfaceC0142d != null) {
                interfaceC0142d.a(d.this.f8896a);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8902a = new d(new d0());
    }

    public static abstract class c implements InterfaceC0142d {
        @Override // com.roblox.client.d.InterfaceC0142d
        public void b(e eVar) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.d$d, reason: collision with other inner class name */
    public interface InterfaceC0142d {
        void a(e eVar);

        void b(e eVar);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public f f8903a = f.UnKnown;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8904c;

        public boolean a() {
            return this.f8903a == f.NewAppRequired;
        }

        public boolean b() {
            return this.f8903a == f.Recommended;
        }

        public boolean c() {
            return this.f8903a == f.Required;
        }

        public void d() {
            this.f8903a = f.Recommended;
        }

        public void e() {
            this.f8903a = f.Required;
        }

        public void f() {
            this.f8903a = f.NotRequired;
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
        this.f8897c = c0Var;
    }

    public static d e() {
        return b.f8902a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public void b(InterfaceC0142d interfaceC0142d) {
        Context contextF;
        if (t.j() && interfaceC0142d != null && (contextF = RobloxApplication.f()) != null && wh.b.a()) {
            kh.b bVar = new kh.b();
            bVar.c(contextF);
            if (bVar.getEnabled()) {
                interfaceC0142d.a(bVar.getUpgradeCheckResult());
                return;
            }
        }
        f fVar = this.f8898d;
        f fVar2 = f.UnKnown;
        if (fVar != fVar2) {
            q.h("UpgradeCheckHelper", "Rely on the upgrade-status set by the Init process: " + this.f8898d);
            e eVar = this.f8896a;
            eVar.f8903a = this.f8898d;
            this.f8898d = fVar2;
            eVar.b = this.f8899e;
            this.f8899e = BuildConfig.FLAVOR;
            eVar.f8904c = this.f8900f;
            this.f8900f = BuildConfig.FLAVOR;
            this.b = this.f8897c.b();
            if (interfaceC0142d != null) {
                interfaceC0142d.a(this.f8896a);
                return;
            }
            return;
        }
        long jB = this.f8897c.b() - this.b;
        if (t.j()) {
            e eVar2 = this.f8896a;
            if (eVar2.f8903a == f.NewAppRequired) {
                if (jB < 3600000) {
                    if (interfaceC0142d != null) {
                        interfaceC0142d.a(eVar2);
                        return;
                    }
                    return;
                }
            } else if (this.f8896a.f8903a != fVar2 && jB < 3600000) {
                q.b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jB + " ms.");
                if (interfaceC0142d != null) {
                    interfaceC0142d.b(this.f8896a);
                    return;
                }
                return;
            }
        } else if (this.f8896a.f8903a != fVar2) {
            q.b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jB + " ms.");
            if (interfaceC0142d != null) {
                interfaceC0142d.b(this.f8896a);
                return;
            }
            return;
        }
        this.f8896a.f8903a = fVar2;
        q.h("UpgradeCheckHelper", "Perform upgrade check with the server...");
        mi.d dVarB = g.a().b(a1.Z0(), null, new a(interfaceC0142d));
        dVarB.g(new pi.b());
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
                        this.f8896a.f8903a = f.NewAppRequired;
                    } else {
                        this.f8896a.f8903a = f.NotRequired;
                    }
                } else if (string.equals("Required")) {
                    this.f8896a.f8903a = f.Required;
                } else {
                    this.f8896a.f8903a = f.NotRequired;
                }
            } else if (string.equals("Recommended")) {
                this.f8896a.f8903a = f.Recommended;
            } else {
                this.f8896a.f8903a = f.NotRequired;
            }
            this.f8896a.b = jSONObject.optString("upgradeSource", BuildConfig.FLAVOR);
            this.f8896a.f8904c = jSONObject.optString("MD5Sum", BuildConfig.FLAVOR);
            this.b = this.f8897c.b();
        } catch (Exception e10) {
            q.k("UpgradeCheckHelper", "evaluateResponse: Exception caught: " + e10);
        }
    }

    @NonNull
    public e d() {
        return this.f8896a;
    }

    public boolean f() {
        f fVar = this.f8898d;
        f fVar2 = f.Required;
        boolean z10 = fVar == fVar2;
        boolean z11 = this.f8896a.f8903a == fVar2;
        q.i("UpgradeCheckHelper", "isUpgradeRequired: [" + z10 + ", " + z11 + "]");
        return z10 || z11;
    }

    public void g(e eVar) {
        q.h("UpgradeCheckHelper", "Set upgrade-status (from Init) = " + eVar.f8903a);
        this.f8898d = eVar.f8903a;
        this.f8899e = eVar.b;
        this.f8900f = eVar.f8904c;
    }
}
