package ck;

import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class c extends AsyncTask<Void, Void, d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4934a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f4936d;

    public c(String str, int i10, String str2, a aVar) {
        this.f4936d = aVar;
        this.f4934a = str;
        this.f4935c = str2;
        this.b = i10;
        if (str2 == null) {
            this.f4935c = "";
        }
    }

    public static d c(li.b.d dVar, String str) {
        d dVar2 = new d(dVar.f23278a, dVar.b);
        dVar2.a(str);
        try {
            PrintWriter printWriter = new PrintWriter(dVar.f23279c.getOutputStream(), true);
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
        li.b.d dVarG = li.b.f().g();
        if (dVarG == null || dVarG.f23279c == null) {
            d dVar = new d(this.f4934a, this.b);
            dVar.a(this.f4935c);
            dVar.b(false);
            return dVar;
        }
        d dVarC = c(dVarG, this.f4935c);
        if (dVarG.f23280d == 0) {
            try {
                Log.d("RbxTcpRequest", "doInBackground: timeToLive is 0. Close socket immediately...");
                dVarG.f23279c.close();
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
            dVar = new d(this.f4934a, this.b);
            dVar.b(false);
        }
        a aVar = this.f4936d;
        if (aVar != null) {
            aVar.a(dVar);
        }
    }
}
