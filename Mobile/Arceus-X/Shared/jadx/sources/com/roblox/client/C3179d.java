package com.roblox.client;

import android.content.Context;
import androidx.annotation.NonNull;
import bh.C1439b;
import org.json.JSONObject;
import p104ei.AsyncTaskC5126d;
import p104ei.C5129g;
import p104ei.C5132j;
import p104ei.InterfaceC5134l;
import p151gk.C6110d0;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.InterfaceC6108c0;
import p173hi.C6407b;
import p308nh.C9476b;
import sg.C11295a1;

/* JADX INFO: renamed from: com.roblox.client.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3179d {

    /* JADX INFO: renamed from: b */
    public long f11762b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6108c0 f11763c;

    /* JADX INFO: renamed from: a */
    public e f11761a = new e();

    /* JADX INFO: renamed from: d */
    public f f11764d = f.UnKnown;

    /* JADX INFO: renamed from: e */
    public String f11765e = "";

    /* JADX INFO: renamed from: f */
    public String f11766f = "";

    /* JADX INFO: renamed from: com.roblox.client.d$a */
    public class a implements InterfaceC5134l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f11767a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(d dVar) {
            this.f11767a = dVar;
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: a */
        public void mo15091a(C5132j c5132j) {
            C3179d.this.m15087c(c5132j);
            d dVar = this.f11767a;
            if (dVar != null) {
                dVar.mo14797a(C3179d.this.f11761a);
            }
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: b */
        public void mo15092b(C5132j c5132j) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C3179d f11769a = new C3179d(new C6110d0());
    }

    /* JADX INFO: renamed from: com.roblox.client.d$c */
    public static abstract class c implements d {
        @Override // com.roblox.client.C3179d.d
        /* JADX INFO: renamed from: b */
        public void mo14798b(e eVar) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.d$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo14797a(e eVar);

        /* JADX INFO: renamed from: b */
        void mo14798b(e eVar);
    }

    /* JADX INFO: renamed from: com.roblox.client.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        @NonNull
        public f f11770a = f.UnKnown;

        /* JADX INFO: renamed from: b */
        public String f11771b;

        /* JADX INFO: renamed from: c */
        public String f11772c;

        /* JADX INFO: renamed from: a */
        public boolean m15094a() {
            return this.f11770a == f.NewAppRequired;
        }

        /* JADX INFO: renamed from: b */
        public boolean m15095b() {
            return this.f11770a == f.Recommended;
        }

        /* JADX INFO: renamed from: c */
        public boolean m15096c() {
            return this.f11770a == f.Required;
        }

        /* JADX INFO: renamed from: d */
        public void m15097d() {
            this.f11770a = f.Recommended;
        }

        /* JADX INFO: renamed from: e */
        public void m15098e() {
            this.f11770a = f.Required;
        }

        /* JADX INFO: renamed from: f */
        public void m15099f() {
            this.f11770a = f.NotRequired;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.d$f */
    public enum f {
        UnKnown,
        Recommended,
        Required,
        NotRequired,
        NewAppRequired
    }

    public C3179d(InterfaceC6108c0 interfaceC6108c0) {
        this.f11763c = interfaceC6108c0;
    }

    /* JADX INFO: renamed from: e */
    public static C3179d m15085e() {
        return b.f11769a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public void m15086b(d dVar) {
        Context contextM14834f;
        if (C6127t.m27094j() && dVar != null && (contextM14834f = RobloxApplication.m14834f()) != null && C9476b.m37333a()) {
            C1439b c1439b = new C1439b();
            c1439b.m7440c(contextM14834f);
            if (c1439b.getEnabled()) {
                dVar.mo14797a(c1439b.getUpgradeCheckResult());
                return;
            }
        }
        f fVar = this.f11764d;
        f fVar2 = f.UnKnown;
        if (fVar != fVar2) {
            C6124q.m27063h("UpgradeCheckHelper", "Rely on the upgrade-status set by the Init process: " + this.f11764d);
            e eVar = this.f11761a;
            eVar.f11770a = this.f11764d;
            this.f11764d = fVar2;
            eVar.f11771b = this.f11765e;
            this.f11765e = "";
            eVar.f11772c = this.f11766f;
            this.f11766f = "";
            this.f11762b = this.f11763c.mo27017b();
            if (dVar != null) {
                dVar.mo14797a(this.f11761a);
                return;
            }
            return;
        }
        long jMo27017b = this.f11763c.mo27017b() - this.f11762b;
        if (C6127t.m27094j()) {
            e eVar2 = this.f11761a;
            if (eVar2.f11770a == f.NewAppRequired) {
                if (jMo27017b < 3600000) {
                    if (dVar != null) {
                        dVar.mo14797a(eVar2);
                        return;
                    }
                    return;
                }
            } else if (this.f11761a.f11770a != fVar2 && jMo27017b < 3600000) {
                C6124q.m27057b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jMo27017b + " ms.");
                if (dVar != null) {
                    dVar.mo14798b(this.f11761a);
                    return;
                }
                return;
            }
        } else if (this.f11761a.f11770a != fVar2) {
            C6124q.m27057b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + jMo27017b + " ms.");
            if (dVar != null) {
                dVar.mo14798b(this.f11761a);
                return;
            }
            return;
        }
        this.f11761a.f11770a = fVar2;
        C6124q.m27063h("UpgradeCheckHelper", "Perform upgrade check with the server...");
        AsyncTaskC5126d asyncTaskC5126dMo23929a = C5129g.m23931a().mo23929a(C11295a1.m42431Y0(), null, new a(dVar));
        asyncTaskC5126dMo23929a.m23912g(new C6407b());
        asyncTaskC5126dMo23929a.m23907b();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0002, B:6:0x0014, B:24:0x005d, B:25:0x0063, B:13:0x002e, B:15:0x0036, B:18:0x003f, B:20:0x0047, B:21:0x004e, B:23:0x0056), top: B:29:0x0002 }] */
    /* JADX INFO: renamed from: c */
    public final void m15087c(C5132j c5132j) {
        try {
            JSONObject jSONObject = new JSONObject(c5132j.m23932a());
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return;
            }
            String string = jSONObject2.getString("UpgradeAction");
            int iHashCode = string.hashCode();
            if (iHashCode != -1189181893) {
                if (iHashCode != -328495169) {
                    if (iHashCode == -144187584 && string.equals("NewAppRequired")) {
                        this.f11761a.f11770a = f.NewAppRequired;
                    } else {
                        this.f11761a.f11770a = f.NotRequired;
                    }
                } else if (string.equals("Required")) {
                    this.f11761a.f11770a = f.Required;
                } else {
                    this.f11761a.f11770a = f.NotRequired;
                }
            } else if (string.equals("Recommended")) {
                this.f11761a.f11770a = f.Recommended;
            } else {
                this.f11761a.f11770a = f.NotRequired;
            }
            this.f11761a.f11771b = jSONObject.optString("upgradeSource", "");
            this.f11761a.f11772c = jSONObject.optString("MD5Sum", "");
            this.f11762b = this.f11763c.mo27017b();
        } catch (Exception e10) {
            C6124q.m27066k("UpgradeCheckHelper", "evaluateResponse: Exception caught: " + e10);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public e m15088d() {
        return this.f11761a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m15089f() {
        f fVar = this.f11764d;
        f fVar2 = f.Required;
        boolean z10 = fVar == fVar2;
        boolean z11 = this.f11761a.f11770a == fVar2;
        C6124q.m27064i("UpgradeCheckHelper", "isUpgradeRequired: [" + z10 + ", " + z11 + "]");
        return z10 || z11;
    }

    /* JADX INFO: renamed from: g */
    public void m15090g(e eVar) {
        C6124q.m27063h("UpgradeCheckHelper", "Set upgrade-status (from Init) = " + eVar.f11770a);
        this.f11764d = eVar.f11770a;
        this.f11765e = eVar.f11771b;
        this.f11766f = eVar.f11772c;
    }
}
