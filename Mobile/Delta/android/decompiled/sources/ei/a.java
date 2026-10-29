package ei;

import android.os.AsyncTask;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends AsyncTask<Void, Void, j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f15562a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.a[] f15563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f15564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15565e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15566f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hi.d<j> f15567g;

    public a(String str, l lVar, c.a[] aVarArr) {
        this.f15564d = lVar;
        this.b = str;
        this.f15563c = aVarArr;
        g(new hi.c());
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        this.f15562a = c.j(this.b, this.f15565e, this.f15563c, this.f15566f);
        do {
            hi.d<j> dVar = this.f15567g;
            if (dVar == null || !dVar.c(this.f15562a) || !this.f15567g.a()) {
                return this.f15562a;
            }
            if (this.f15567g.b() > 0) {
                try {
                    Thread.sleep(this.f15567g.b());
                } catch (InterruptedException e10) {
                    gk.p.h("rbx.httprequest", "Thread sleep error: " + e10.getMessage());
                }
            }
            this.f15562a = c.j(this.b, this.f15565e, this.f15563c, this.f15566f);
            this.f15567g.retry();
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
        l lVar = this.f15564d;
        if (lVar != null) {
            lVar.a(this.f15562a);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
        l lVar = this.f15564d;
        if (lVar != null) {
            lVar.b(this.f15562a);
        }
    }

    public void f() {
        publishProgress(new Void[0]);
    }

    public void g(@NonNull hi.d<j> dVar) {
        this.f15567g = dVar;
    }
}
