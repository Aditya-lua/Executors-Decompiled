package ti;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import bi.h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public class b extends sh.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f32438f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f().b(new C0648b());
        }
    }

    /* JADX INFO: renamed from: ti.b$b, reason: collision with other inner class name */
    public class C0648b implements sh.c {

        /* JADX INFO: renamed from: ti.b$b$a */
        public class a extends AsyncTask<Void, Void, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sh.a f32441a;

            public a(sh.a aVar) {
                this.f32441a = aVar;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                Socket socket = b.this.f32438f.f32444c;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e10) {
                        Log.w("InfluxV2Queue", "[Close-connection-item] Error closing socket: " + e10.getMessage());
                    }
                    b.this.f32438f.f32444c = null;
                }
                b.this.f32438f = null;
                return null;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Void r10) {
                sh.a aVar = this.f32441a;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        @Override // sh.c
        public void a(sh.a aVar) {
            if (b.this.f32438f == null) {
                return;
            }
            Log.d("InfluxV2Queue", "fireAction: Close the existing socket...");
            new a(aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        @Override // sh.c
        public boolean b() {
            return true;
        }

        public C0648b() {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32442a = new b();
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32443a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f32444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32445d;

        public d() {
        }
    }

    public static b f() {
        return c.f32442a;
    }

    public d g() {
        d dVar = this.f32438f;
        if (dVar != null && dVar.f32444c != null) {
            return dVar;
        }
        String strU3 = h.a().u3();
        int iU3 = h.a().U3();
        int iQ3 = h.a().Q3();
        d dVar2 = new d();
        this.f32438f = dVar2;
        dVar2.f32443a = strU3;
        dVar2.b = iU3;
        dVar2.f32445d = iQ3;
        try {
            Log.d("InfluxV2Queue", "getSocketInfo: Create a socket to " + strU3 + ":" + iU3 + "...");
            Socket socket = new Socket(InetAddress.getByName(strU3), iU3);
            d dVar3 = this.f32438f;
            dVar3.f32444c = socket;
            if (dVar3.f32445d > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                Log.d("InfluxV2Queue", "Schedule a special close-connection item with delay=" + this.f32438f.f32445d + "s...");
                handler.postDelayed(new a(), ((long) this.f32438f.f32445d) * 1000);
            }
            return this.f32438f;
        } catch (IOException e10) {
            Log.w("InfluxV2Queue", "Error creating the socket: " + e10.getMessage());
            return this.f32438f;
        }
    }
}
