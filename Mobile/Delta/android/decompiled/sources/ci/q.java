package ci;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public class q extends AsyncTask<Void, Void, j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f5008a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a[] f5010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f5012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5014h;

    public q(String str, String str2, c.a[] aVarArr, m mVar) {
        this(str, str2, aVarArr, mVar, null);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        j jVarL = c.l(this.b, this.f5009c, this.f5010d, this.f5011e, this.f5013g, this.f5014h);
        this.f5008a = jVarL;
        return jVarL;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(j jVar) {
        super.onPostExecute(jVar);
        m mVar = this.f5012f;
        if (mVar != null) {
            mVar.a(this.f5008a);
        }
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3) {
        this(str, str2, aVarArr, mVar, str3, -1, -1);
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3, int i10, int i11) {
        this.f5013g = -1;
        this.f5014h = -1;
        this.f5012f = mVar;
        this.b = str;
        this.f5009c = str2;
        this.f5010d = aVarArr;
        this.f5011e = str3;
        if (str2 == null) {
            this.f5009c = "";
        }
        this.f5013g = i10;
        this.f5014h = i11;
    }
}
