package mi;

import android.os.AsyncTask;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class q extends AsyncTask<Void, Void, j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f23283a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a[] f23285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f23287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23289h;

    public q(String str, String str2, c.a[] aVarArr, m mVar) {
        this(str, str2, aVarArr, mVar, null);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        j jVarL = c.l(this.b, this.f23284c, this.f23285d, this.f23286e, this.f23288g, this.f23289h);
        this.f23283a = jVarL;
        return jVarL;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(j jVar) {
        super.onPostExecute(jVar);
        m mVar = this.f23287f;
        if (mVar != null) {
            mVar.a(this.f23283a);
        }
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3) {
        this(str, str2, aVarArr, mVar, str3, -1, -1);
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3, int i10, int i11) {
        this.f23288g = -1;
        this.f23289h = -1;
        this.f23287f = mVar;
        this.b = str;
        this.f23284c = str2;
        this.f23285d = aVarArr;
        this.f23286e = str3;
        if (str2 == null) {
            this.f23284c = BuildConfig.FLAVOR;
        }
        this.f23288g = i10;
        this.f23289h = i11;
    }
}
