package li;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import p220jh.AbstractC7156b;
import p220jh.InterfaceC7155a;
import p220jh.InterfaceC7157c;
import th.C11659h;

/* JADX INFO: renamed from: li.b */
/* JADX INFO: loaded from: classes2.dex */
public class C8151b extends AbstractC7156b {

    /* JADX INFO: renamed from: f */
    public d f30227f;

    /* JADX INFO: renamed from: li.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8151b.m33414f().m29958b(new b());
        }
    }

    /* JADX INFO: renamed from: li.b$b */
    public class b implements InterfaceC7157c {

        /* JADX INFO: renamed from: li.b$b$a */
        public class a extends AsyncTask<Void, Void, Void> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC7155a f30230a;

            public a(InterfaceC7155a interfaceC7155a) {
                this.f30230a = interfaceC7155a;
            }

            /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                Socket socket = C8151b.this.f30227f.f30235c;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e10) {
                        Log.w("InfluxV2Queue", "[Close-connection-item] Error closing socket: " + e10.getMessage());
                    }
                    C8151b.this.f30227f.f30235c = null;
                }
                C8151b.this.f30227f = null;
                return null;
            }

            /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Void r8) {
                InterfaceC7155a interfaceC7155a = this.f30230a;
                if (interfaceC7155a != null) {
                    interfaceC7155a.mo29956a();
                }
            }
        }

        @Override // p220jh.InterfaceC7157c
        /* JADX INFO: renamed from: a */
        public void mo29961a(InterfaceC7155a interfaceC7155a) {
            if (C8151b.this.f30227f == null) {
                return;
            }
            Log.d("InfluxV2Queue", "fireAction: Close the existing socket...");
            new a(interfaceC7155a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        @Override // p220jh.InterfaceC7157c
        /* JADX INFO: renamed from: b */
        public boolean mo29962b() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: li.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C8151b f30232a = new C8151b();
    }

    /* JADX INFO: renamed from: li.b$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public String f30233a;

        /* JADX INFO: renamed from: b */
        public int f30234b;

        /* JADX INFO: renamed from: c */
        public Socket f30235c;

        /* JADX INFO: renamed from: d */
        public int f30236d;

        public d() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static C8151b m33414f() {
        return c.f30232a;
    }

    /* JADX INFO: renamed from: g */
    public d m33415g() {
        d dVar = this.f30227f;
        if (dVar != null && dVar.f30235c != null) {
            return dVar;
        }
        String strMo43684n3 = C11659h.m43403a().mo43684n3();
        int iMo43471J3 = C11659h.m43403a().mo43471J3();
        int iMo43443F3 = C11659h.m43403a().mo43443F3();
        d dVar2 = new d();
        this.f30227f = dVar2;
        dVar2.f30233a = strMo43684n3;
        dVar2.f30234b = iMo43471J3;
        dVar2.f30236d = iMo43443F3;
        try {
            Log.d("InfluxV2Queue", "getSocketInfo: Create a socket to " + strMo43684n3 + ":" + iMo43471J3 + "...");
            Socket socket = new Socket(InetAddress.getByName(strMo43684n3), iMo43471J3);
            d dVar3 = this.f30227f;
            dVar3.f30235c = socket;
            if (dVar3.f30236d > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                Log.d("InfluxV2Queue", "Schedule a special close-connection item with delay=" + this.f30227f.f30236d + "s...");
                handler.postDelayed(new a(), ((long) this.f30227f.f30236d) * 1000);
            }
            return this.f30227f;
        } catch (IOException e10) {
            Log.w("InfluxV2Queue", "Error creating the socket: " + e10.getMessage());
            return this.f30227f;
        }
    }
}
