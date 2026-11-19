package kk;

import android.os.AsyncTask;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class c extends AsyncTask<Void, Void, d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21462a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f21464d;

    public c(String str, int i10, String str2, a aVar) {
        this.f21464d = aVar;
        this.f21462a = str;
        this.f21463c = str2;
        this.b = i10;
        if (str2 == null) {
            this.f21463c = BuildConfig.FLAVOR;
        }
    }

    public static d c(ti.b.d dVar, String str) {
        d dVar2 = new d(dVar.f32443a, dVar.b);
        dVar2.a(str);
        try {
            PrintWriter printWriter = new PrintWriter(dVar.f32444c.getOutputStream(), true);
            if (printWriter.checkError()) {
                dVar2.b(false);
                return dVar2;
            }
            printWriter.println(str);
            printWriter.flush();
            dVar2.a(BuildConfig.FLAVOR);
            return dVar2;
        } catch (Exception e10) {
            Log.w("RbxTcpRequest", "Error sending influx data over TCP = " + e10.getMessage());
            dVar2.b(false);
            return dVar2;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d doInBackground(Void... voidArr) {
        ti.b.d dVarG = ti.b.f().g();
        if (dVarG == null || dVarG.f32444c == null) {
            d dVar = new d(this.f21462a, this.b);
            dVar.a(this.f21463c);
            dVar.b(false);
            return dVar;
        }
        d dVarC = c(dVarG, this.f21463c);
        if (dVarG.f32445d == 0) {
            try {
                Log.d("RbxTcpRequest", "doInBackground: timeToLive is 0. Close socket immediately...");
                dVarG.f32444c.close();
                return dVarC;
            } catch (IOException e10) {
                Log.w("RbxTcpRequest", "Error closing the socket: " + e10.getMessage());
            }
        }
        return dVarC;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(d dVar) {
        super.onPostExecute(dVar);
        if (dVar == null) {
            dVar = new d(this.f21462a, this.b);
            dVar.b(false);
        }
        a aVar = this.f21464d;
        if (aVar != null) {
            aVar.a(dVar);
        }
    }
}
