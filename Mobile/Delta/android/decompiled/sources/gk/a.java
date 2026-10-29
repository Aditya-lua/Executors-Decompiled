package gk;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18231a;
    public InterfaceC0327a b;

    /* JADX INFO: renamed from: gk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0327a {
        void a(String str);
    }

    public a(Context context, InterfaceC0327a interfaceC0327a) {
        this.f18231a = context;
        this.b = interfaceC0327a;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        q8.a.C0515a c0515aA;
        String strA;
        try {
            c0515aA = q8.a.a(this.f18231a);
        } catch (j9.e | j9.f | IOException unused) {
            c0515aA = null;
        }
        if (c0515aA != null) {
            strA = c0515aA.b() ? "00000000-0000-0000-0000-000000000000" : c0515aA.a();
        } else {
            strA = "";
        }
        p.h("AdvertisingIdAsyncTask", "advertisingId:" + strA);
        return strA;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        this.b.a(str);
    }
}
