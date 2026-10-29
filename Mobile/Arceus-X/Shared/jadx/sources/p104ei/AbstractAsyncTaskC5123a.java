package p104ei;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import p151gk.C6124q;
import p173hi.C6408c;
import p173hi.InterfaceC6409d;

/* JADX INFO: renamed from: ei.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC5123a extends AsyncTask<Void, Void, C5132j> {

    /* JADX INFO: renamed from: a */
    public C5132j f19988a;

    /* JADX INFO: renamed from: b */
    public String f19989b;

    /* JADX INFO: renamed from: c */
    public C5125c.a[] f19990c;

    /* JADX INFO: renamed from: d */
    public InterfaceC5134l f19991d;

    /* JADX INFO: renamed from: e */
    public String f19992e = null;

    /* JADX INFO: renamed from: f */
    public String f19993f = null;

    /* JADX INFO: renamed from: g */
    public InterfaceC6409d<C5132j> f19994g;

    public AbstractAsyncTaskC5123a(String str, InterfaceC5134l interfaceC5134l, C5125c.a[] aVarArr) {
        this.f19991d = interfaceC5134l;
        this.f19989b = str;
        this.f19990c = aVarArr;
        m23912g(new C6408c());
    }

    /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5132j doInBackground(Void... voidArr) {
        this.f19988a = C5125c.m23926j(this.f19989b, this.f19992e, this.f19990c, this.f19993f);
        do {
            InterfaceC6409d<C5132j> interfaceC6409d = this.f19994g;
            if (interfaceC6409d == null || !interfaceC6409d.mo25667c(this.f19988a) || !this.f19994g.mo27989a()) {
                return this.f19988a;
            }
            if (this.f19994g.mo27990b() > 0) {
                try {
                    Thread.sleep(this.f19994g.mo27990b());
                } catch (InterruptedException e10) {
                    C6124q.m27063h("rbx.httprequest", "Thread sleep error: " + e10.getMessage());
                }
            }
            this.f19988a = C5125c.m23926j(this.f19989b, this.f19992e, this.f19990c, this.f19993f);
            this.f19994g.retry();
            m23911f();
        } while (!m23908c());
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m23907b() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: renamed from: c */
    public boolean m23908c() {
        return isCancelled();
    }

    /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C5132j c5132j) {
        super.onPostExecute(c5132j);
        InterfaceC5134l interfaceC5134l = this.f19991d;
        if (interfaceC5134l != null) {
            interfaceC5134l.mo15091a(this.f19988a);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onProgressUpdate([Ljava/lang/Object;)V */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
        InterfaceC5134l interfaceC5134l = this.f19991d;
        if (interfaceC5134l != null) {
            interfaceC5134l.mo15092b(this.f19988a);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m23911f() {
        publishProgress(new Void[0]);
    }

    /* JADX INFO: renamed from: g */
    public void m23912g(@NonNull InterfaceC6409d<C5132j> interfaceC6409d) {
        this.f19994g = interfaceC6409d;
    }
}
