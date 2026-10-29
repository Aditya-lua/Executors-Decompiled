package ei;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public class q extends AsyncTask<Void, Void, j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f15596a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a[] f15598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f15600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15602h;

    public q(String str, String str2, c.a[] aVarArr, m mVar) {
        this(str, str2, aVarArr, mVar, null);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        j jVarL = c.l(this.b, this.f15597c, this.f15598d, this.f15599e, this.f15601g, this.f15602h);
        this.f15596a = jVarL;
        return jVarL;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(j jVar) {
        super.onPostExecute(jVar);
        m mVar = this.f15600f;
        if (mVar != null) {
            mVar.a(this.f15596a);
        }
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3) {
        this(str, str2, aVarArr, mVar, str3, -1, -1);
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3, int i10, int i11) {
        this.f15601g = -1;
        this.f15602h = -1;
        this.f15600f = mVar;
        this.b = str;
        this.f15597c = str2;
        this.f15598d = aVarArr;
        this.f15599e = str3;
        if (str2 == null) {
            this.f15597c = "";
        }
        this.f15601g = i10;
        this.f15602h = i11;
    }
}
