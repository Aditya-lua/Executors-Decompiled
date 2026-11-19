package mi;

import android.os.AsyncTask;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends AsyncTask<Void, Void, j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f23248a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.a[] f23249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f23250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23251e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23252f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pi.d<j> f23253g;

    public a(String str, l lVar, c.a[] aVarArr) {
        this.f23250d = lVar;
        this.b = str;
        this.f23249c = aVarArr;
        g(new pi.c());
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        this.f23248a = c.j(this.b, this.f23251e, this.f23249c, this.f23252f);
        do {
            pi.d<j> dVar = this.f23253g;
            if (dVar == null || !dVar.e(this.f23248a) || !this.f23253g.c()) {
                return this.f23248a;
            }
            if (this.f23253g.d() > 0) {
                try {
                    Thread.sleep(this.f23253g.d());
                } catch (InterruptedException e10) {
                    ok.q.h("rbx.httprequest", "Thread sleep error: " + e10.getMessage());
                }
            }
            this.f23248a = c.j(this.b, this.f23251e, this.f23249c, this.f23252f);
            this.f23253g.b();
            f();
        } while (!c());
        return null;
    }

    public void b() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean c() {
        return isCancelled();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(j jVar) {
        super.onPostExecute(jVar);
        l lVar = this.f23250d;
        if (lVar != null) {
            lVar.b(this.f23248a);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
        l lVar = this.f23250d;
        if (lVar != null) {
            lVar.a(this.f23248a);
        }
    }

    public void f() {
        publishProgress(new Void[0]);
    }

    public void g(@NonNull pi.d<j> dVar) {
        this.f23253g = dVar;
    }
}
