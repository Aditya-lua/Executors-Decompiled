package ak;

import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class c extends AsyncTask<Void, Void, d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f579a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f581d;

    public c(String str, int i10, String str2, a aVar) {
        this.f581d = aVar;
        this.f579a = str;
        this.f580c = str2;
        this.b = i10;
        if (str2 == null) {
            this.f580c = "";
        }
    }

    public static d c(ji.b.d dVar, String str) {
        d dVar2 = new d(dVar.f21931a, dVar.b);
        dVar2.a(str);
        try {
            PrintWriter printWriter = new PrintWriter(dVar.f21932c.getOutputStream(), true);
            if (printWriter.checkError()) {
                dVar2.b(false);
                return dVar2;
            }
            printWriter.println(str);
            printWriter.flush();
            dVar2.a("");
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
        ji.b.d dVarG = ji.b.f().g();
        if (dVarG == null || dVarG.f21932c == null) {
            d dVar = new d(this.f579a, this.b);
            dVar.a(this.f580c);
            dVar.b(false);
            return dVar;
        }
        d dVarC = c(dVarG, this.f580c);
        if (dVarG.f21933d == 0) {
            try {
                Log.d("RbxTcpRequest", "doInBackground: timeToLive is 0. Close socket immediately...");
                dVarG.f21932c.close();
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
            dVar = new d(this.f579a, this.b);
            dVar.b(false);
        }
        a aVar = this.f581d;
        if (aVar != null) {
            aVar.a(dVar);
        }
    }
}
