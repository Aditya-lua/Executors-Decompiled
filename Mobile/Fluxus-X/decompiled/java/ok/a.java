package ok;

import android.content.Context;
import android.os.AsyncTask;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28242a;
    public InterfaceC0545a b;

    /* JADX INFO: renamed from: ok.a$a, reason: collision with other inner class name */
    public interface InterfaceC0545a {
        void a(String str);
    }

    public a(Context context, InterfaceC0545a interfaceC0545a) {
        this.f28242a = context;
        this.b = interfaceC0545a;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        r8.a.C0598a c0598aA;
        String strA;
        try {
            c0598aA = r8.a.a(this.f28242a);
        } catch (IOException | k9.g | k9.h unused) {
            c0598aA = null;
        }
        if (c0598aA != null) {
            strA = c0598aA.b() ? "00000000-0000-0000-0000-000000000000" : c0598aA.a();
        } else {
            strA = BuildConfig.FLAVOR;
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
