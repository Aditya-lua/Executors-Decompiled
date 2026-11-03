package ji;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class b extends ih.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f21926f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f().b(new C0380b());
        }
    }

    /* JADX INFO: renamed from: ji.b$b, reason: collision with other inner class name */
    public class C0380b implements ih.c {

        /* JADX INFO: renamed from: ji.b$b$a */
        public class a extends AsyncTask<Void, Void, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ih.a f21929a;

            public a(ih.a aVar) {
                this.f21929a = aVar;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                Socket socket = b.this.f21926f.f21932c;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e10) {
                        Log.w("InfluxV2Queue", "[Close-connection-item] Error closing socket: " + e10.getMessage());
                    }
                    b.this.f21926f.f21932c = null;
                }
                b.this.f21926f = null;
                return null;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Void r8) {
                ih.a aVar = this.f21929a;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        @Override // ih.c
        public void a(ih.a aVar) {
            if (b.this.f21926f == null) {
                return;
            }
            Log.d("InfluxV2Queue", "fireAction: Close the existing socket...");
            new a(aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        @Override // ih.c
        public boolean b() {
            return true;
        }

        public C0380b() {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21930a = new b();
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21931a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f21932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21933d;

        public d() {
        }
    }

    public static b f() {
        return c.f21930a;
    }

    public d g() {
        d dVar = this.f21926f;
        if (dVar != null && dVar.f21932c != null) {
            return dVar;
        }
        String strR3 = h.a().r3();
        int iQ3 = h.a().Q3();
        int iM3 = h.a().M3();
        d dVar2 = new d();
        this.f21926f = dVar2;
        dVar2.f21931a = strR3;
        dVar2.b = iQ3;
        dVar2.f21933d = iM3;
        try {
            Log.d("InfluxV2Queue", "getSocketInfo: Create a socket to " + strR3 + ":" + iQ3 + "...");
            Socket socket = new Socket(InetAddress.getByName(strR3), iQ3);
            d dVar3 = this.f21926f;
            dVar3.f21932c = socket;
            if (dVar3.f21933d > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                Log.d("InfluxV2Queue", "Schedule a special close-connection item with delay=" + this.f21926f.f21933d + "s...");
                handler.postDelayed(new a(), ((long) this.f21926f.f21933d) * 1000);
            }
            return this.f21926f;
        } catch (IOException e10) {
            Log.w("InfluxV2Queue", "Error creating the socket: " + e10.getMessage());
            return this.f21926f;
        }
    }
}
