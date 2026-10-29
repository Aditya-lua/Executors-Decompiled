package ck;

import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.io.PrintWriter;
import li.C8151b;

/* JADX INFO: renamed from: ck.c */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC1674c extends AsyncTask<Void, Void, C1675d> {

    /* JADX INFO: renamed from: a */
    public String f6441a;

    /* JADX INFO: renamed from: b */
    public int f6442b;

    /* JADX INFO: renamed from: c */
    public String f6443c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1672a f6444d;

    public AsyncTaskC1674c(String str, int i10, String str2, InterfaceC1672a interfaceC1672a) {
        this.f6444d = interfaceC1672a;
        this.f6441a = str;
        this.f6443c = str2;
        this.f6442b = i10;
        if (str2 == null) {
            this.f6443c = "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1675d m8381c(C8151b.d dVar, String str) {
        C1675d c1675d = new C1675d(dVar.f30233a, dVar.f30234b);
        c1675d.m8384a(str);
        try {
            PrintWriter printWriter = new PrintWriter(dVar.f30235c.getOutputStream(), true);
            if (printWriter.checkError()) {
                c1675d.m8385b(false);
                return c1675d;
            }
            printWriter.println(str);
            printWriter.flush();
            c1675d.m8384a("");
            return c1675d;
        } catch (Exception e10) {
            Log.w("RbxTcpRequest", "Error sending influx data over TCP = " + e10.getMessage());
            c1675d.m8385b(false);
            return c1675d;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1675d doInBackground(Void... voidArr) {
        C8151b.d dVarM33415g = C8151b.m33414f().m33415g();
        if (dVarM33415g == null || dVarM33415g.f30235c == null) {
            C1675d c1675d = new C1675d(this.f6441a, this.f6442b);
            c1675d.m8384a(this.f6443c);
            c1675d.m8385b(false);
            return c1675d;
        }
        C1675d c1675dM8381c = m8381c(dVarM33415g, this.f6443c);
        if (dVarM33415g.f30236d == 0) {
            try {
                Log.d("RbxTcpRequest", "doInBackground: timeToLive is 0. Close socket immediately...");
                dVarM33415g.f30235c.close();
                return c1675dM8381c;
            } catch (IOException e10) {
                Log.w("RbxTcpRequest", "Error closing the socket: " + e10.getMessage());
            }
        }
        return c1675dM8381c;
    }

    /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C1675d c1675d) {
        super.onPostExecute(c1675d);
        if (c1675d == null) {
            c1675d = new C1675d(this.f6441a, this.f6442b);
            c1675d.m8385b(false);
        }
        InterfaceC1672a interfaceC1672a = this.f6444d;
        if (interfaceC1672a != null) {
            interfaceC1672a.mo8379a(c1675d);
        }
    }
}
