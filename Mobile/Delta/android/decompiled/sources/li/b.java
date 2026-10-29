package li;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class b extends jh.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f23273f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f().b(new C0412b());
        }
    }

    /* JADX INFO: renamed from: li.b$b, reason: collision with other inner class name */
    public class C0412b implements jh.c {

        /* JADX INFO: renamed from: li.b$b$a */
        public class a extends AsyncTask<Void, Void, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ jh.a f23276a;

            public a(jh.a aVar) {
                this.f23276a = aVar;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                Socket socket = b.this.f23273f.f23279c;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e10) {
                        Log.w("InfluxV2Queue", "[Close-connection-item] Error closing socket: " + e10.getMessage());
                    }
                    b.this.f23273f.f23279c = null;
                }
                b.this.f23273f = null;
                return null;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Void r8) {
                jh.a aVar = this.f23276a;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        @Override // jh.c
        public void a(jh.a aVar) {
            if (b.this.f23273f == null) {
                return;
            }
            Log.d("InfluxV2Queue", "fireAction: Close the existing socket...");
            new a(aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        @Override // jh.c
        public boolean b() {
            return true;
        }

        public C0412b() {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23277a = new b();
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f23278a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f23279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23280d;

        public d() {
        }
    }

    public static b f() {
        return c.f23277a;
    }

    public d g() {
        d dVar = this.f23273f;
        if (dVar != null && dVar.f23279c != null) {
            return dVar;
        }
        String strH3 = h.a().h3();
        int iE3 = h.a().E3();
        int iA3 = h.a().A3();
        d dVar2 = new d();
        this.f23273f = dVar2;
        dVar2.f23278a = strH3;
        dVar2.b = iE3;
        dVar2.f23280d = iA3;
        try {
            Log.d("InfluxV2Queue", "getSocketInfo: Create a socket to " + strH3 + ":" + iE3 + "...");
            Socket socket = new Socket(InetAddress.getByName(strH3), iE3);
            d dVar3 = this.f23273f;
            dVar3.f23279c = socket;
            if (dVar3.f23280d > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                Log.d("InfluxV2Queue", "Schedule a special close-connection item with delay=" + this.f23273f.f23280d + "s...");
                handler.postDelayed(new a(), ((long) this.f23273f.f23280d) * 1000);
            }
            return this.f23273f;
        } catch (IOException e10) {
            Log.w("InfluxV2Queue", "Error creating the socket: " + e10.getMessage());
            return this.f23273f;
        }
    }
}
