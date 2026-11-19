package za;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends l9.g implements a9.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.g f39195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f39196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l9.a f39197n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f39198k;

    static {
        l9.a.g gVar = new l9.a.g();
        f39195l = gVar;
        j jVar = new j();
        f39196m = jVar;
        f39197n = new l9.a("Auth.Api.Identity.SignIn.API", jVar, gVar);
    }

    public o(@NonNull Context context, @NonNull a9.y yVar) {
        super(context, (l9.a<a9.y>) f39197n, yVar, l9.g.a.f22012c);
        this.f39198k = r.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void P(a9.d dVar, p pVar, tb.k kVar) {
        ((h0) pVar.getService()).u2(new n(this, kVar), dVar, this.f39198k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void Q(p pVar, tb.k kVar) {
        ((h0) pVar.getService()).w2(new l(this, kVar), this.f39198k);
    }

    @Override // a9.i
    public final a9.j b(Intent intent) throws l9.b {
        if (intent == null) {
            throw new l9.b(Status.f6110m);
        }
        Status status = (Status) p9.d.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new l9.b(Status.f6112o);
        }
        if (!status.F3()) {
            throw new l9.b(status);
        }
        a9.j jVar = (a9.j) p9.d.b(intent, "sign_in_credential", a9.j.CREATOR);
        if (jVar != null) {
            return jVar;
        }
        throw new l9.b(Status.f6110m);
    }

    @Override // a9.i
    public final Task<PendingIntent> d(@NonNull final a9.d dVar) {
        o9.s.l(dVar);
        return z(m9.u.c().d(q.f39206h).b(new m9.q() { // from class: za.f
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                this.f39187a.P(dVar, (p) obj, (tb.k) obj2);
            }
        }).e(1653).a());
    }

    @Override // a9.i
    public final Task<a9.b> e(@NonNull a9.a aVar) {
        o9.s.l(aVar);
        a9.a.C0008a c0008aH3 = a9.a.H3(aVar);
        c0008aH3.h(this.f39198k);
        final a9.a aVarA = c0008aH3.a();
        return z(m9.u.c().d(new k9.d("auth_api_credentials_begin_sign_in", 8L)).b(new m9.q() { // from class: za.h
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((h0) ((p) obj).getService()).t2(new k(this.f39189a, (tb.k) obj2), (a9.a) o9.s.l(aVarA));
            }
        }).c(false).e(1553).a());
    }

    @Override // a9.i
    public final String p(Intent intent) throws l9.b {
        if (intent == null) {
            throw new l9.b(Status.f6110m);
        }
        Status status = (Status) p9.d.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new l9.b(Status.f6112o);
        }
        if (!status.F3()) {
            throw new l9.b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new l9.b(Status.f6110m);
    }

    @Override // a9.i
    public final Task<Void> s() {
        G().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<l9.h> it = l9.h.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        m9.f.a();
        return D(m9.u.c().d(q.b).b(new m9.q() { // from class: za.g
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                this.f39188a.Q((p) obj, (tb.k) obj2);
            }
        }).c(false).e(1554).a());
    }

    @Override // a9.i
    public final Task<PendingIntent> u(@NonNull a9.e eVar) {
        o9.s.l(eVar);
        a9.e.a aVarF3 = a9.e.F3(eVar);
        aVarF3.f(this.f39198k);
        final a9.e eVarA = aVarF3.a();
        return z(m9.u.c().d(q.f39204f).b(new m9.q() { // from class: za.i
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((h0) ((p) obj).getService()).v2(new m(this.f39190a, (tb.k) obj2), (a9.e) o9.s.l(eVarA));
            }
        }).e(1555).a());
    }
}
