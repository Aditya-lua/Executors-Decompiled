package ek;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16129a;
    public InterfaceC0297a b;

    /* JADX INFO: renamed from: ek.a$a, reason: collision with other inner class name */
    public interface InterfaceC0297a {
        void a(String str);
    }

    public a(Context context, InterfaceC0297a interfaceC0297a) {
        this.f16129a = context;
        this.b = interfaceC0297a;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        q8.a.C0514a c0514aA;
        String strA;
        try {
            c0514aA = q8.a.a(this.f16129a);
        } catch (j9.e | j9.f | IOException unused) {
            c0514aA = null;
        }
        if (c0514aA != null) {
            strA = c0514aA.b() ? "00000000-0000-0000-0000-000000000000" : c0514aA.a();
        } else {
            strA = "";
        }
        q.h("AdvertisingIdAsyncTask", "advertisingId:" + strA);
        return strA;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        this.b.a(str);
    }
}
