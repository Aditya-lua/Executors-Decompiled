package p104ei;

import android.os.AsyncTask;

/* JADX INFO: renamed from: ei.q */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC5139q extends AsyncTask<Void, Void, C5132j> {

    /* JADX INFO: renamed from: a */
    public C5132j f20027a;

    /* JADX INFO: renamed from: b */
    public String f20028b;

    /* JADX INFO: renamed from: c */
    public String f20029c;

    /* JADX INFO: renamed from: d */
    public C5125c.a[] f20030d;

    /* JADX INFO: renamed from: e */
    public String f20031e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5135m f20032f;

    /* JADX INFO: renamed from: g */
    public int f20033g;

    /* JADX INFO: renamed from: h */
    public int f20034h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AsyncTaskC5139q(String str, String str2, C5125c.a[] aVarArr, InterfaceC5135m interfaceC5135m) {
        this(str, str2, aVarArr, interfaceC5135m, null);
    }

    /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5132j doInBackground(Void... voidArr) {
        C5132j c5132jM23928l = C5125c.m23928l(this.f20028b, this.f20029c, this.f20030d, this.f20031e, this.f20033g, this.f20034h);
        this.f20027a = c5132jM23928l;
        return c5132jM23928l;
    }

    /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C5132j c5132j) {
        super.onPostExecute(c5132j);
        InterfaceC5135m interfaceC5135m = this.f20032f;
        if (interfaceC5135m != null) {
            interfaceC5135m.mo14796a(this.f20027a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AsyncTaskC5139q(String str, String str2, C5125c.a[] aVarArr, InterfaceC5135m interfaceC5135m, String str3) {
        this(str, str2, aVarArr, interfaceC5135m, str3, -1, -1);
    }

    public AsyncTaskC5139q(String str, String str2, C5125c.a[] aVarArr, InterfaceC5135m interfaceC5135m, String str3, int i10, int i11) {
        this.f20033g = -1;
        this.f20034h = -1;
        this.f20032f = interfaceC5135m;
        this.f20028b = str;
        this.f20029c = str2;
        this.f20030d = aVarArr;
        this.f20031e = str3;
        if (str2 == null) {
            this.f20029c = "";
        }
        this.f20033g = i10;
        this.f20034h = i11;
    }
}
