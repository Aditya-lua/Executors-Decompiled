package p151gk;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import p213j9.C7093e;
import p213j9.C7095f;
import p374q8.C10480a;

/* JADX INFO: renamed from: gk.a */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC6103a extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a */
    public Context f23444a;

    /* JADX INFO: renamed from: b */
    public a f23445b;

    /* JADX INFO: renamed from: gk.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1253a(String str);
    }

    public AsyncTaskC6103a(Context context, a aVar) {
        this.f23444a = context;
        this.f23445b = aVar;
    }

    /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        C10480a.a aVarM40279a;
        String strM40286a;
        try {
            aVarM40279a = C10480a.m40279a(this.f23444a);
        } catch (C7093e | C7095f | IOException unused) {
            aVarM40279a = null;
        }
        if (aVarM40279a != null) {
            strM40286a = aVarM40279a.m40287b() ? "00000000-0000-0000-0000-000000000000" : aVarM40279a.m40286a();
        } else {
            strM40286a = "";
        }
        C6124q.m27063h("AdvertisingIdAsyncTask", "advertisingId:" + strM40286a);
        return strM40286a;
    }

    /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        this.f23445b.mo1253a(str);
    }
}
