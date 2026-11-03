package ci;

import android.os.AsyncTask;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends AsyncTask<Void, Void, j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f4974a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.a[] f4975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f4976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4977e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4978f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fi.d<j> f4979g;

    public a(String str, l lVar, c.a[] aVarArr) {
        this.f4976d = lVar;
        this.b = str;
        this.f4975c = aVarArr;
        g(new fi.c());
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        this.f4974a = c.j(this.b, this.f4977e, this.f4975c, this.f4978f);
        do {
            fi.d<j> dVar = this.f4979g;
            if (dVar == null || !dVar.c(this.f4974a) || !this.f4979g.a()) {
                return this.f4974a;
            }
            if (this.f4979g.b() > 0) {
                try {
                    Thread.sleep(this.f4979g.b());
                } catch (InterruptedException e10) {
                    ek.q.h("rbx.httprequest", "Thread sleep error: " + e10.getMessage());
                }
            }
            this.f4974a = c.j(this.b, this.f4977e, this.f4975c, this.f4978f);
            this.f4979g.retry();
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
        l lVar = this.f4976d;
        if (lVar != null) {
            lVar.b(this.f4974a);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
        l lVar = this.f4976d;
        if (lVar != null) {
            lVar.a(this.f4974a);
        }
    }

    public void f() {
        publishProgress(new Void[0]);
    }

    public void g(@NonNull fi.d<j> dVar) {
        this.f4979g = dVar;
    }
}
