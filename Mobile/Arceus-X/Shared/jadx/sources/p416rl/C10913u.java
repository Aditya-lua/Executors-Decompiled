package p416rl;

import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import p311nm.C9494a;

/* JADX INFO: renamed from: rl.u */
/* JADX INFO: loaded from: classes2.dex */
public class C10913u {

    /* JADX INFO: renamed from: b */
    public int f38696b;

    /* JADX INFO: renamed from: a */
    public ServerSocket f38695a = null;

    /* JADX INFO: renamed from: d */
    public boolean f38698d = false;

    /* JADX INFO: renamed from: c */
    public ExecutorService f38697c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public int m41504b() {
        return this.f38696b;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m41505c() {
        while (this.f38698d) {
            try {
                m41508f(this.f38695a.accept());
            } catch (SocketException e10) {
                if (this.f38698d) {
                    Log.e("MagicLoginSocketHelperServer", "SocketException while accepting connection: " + e10.toString());
                    return;
                }
                return;
            } catch (IOException e11) {
                Log.e("MagicLoginSocketHelperServer", "IOException while accepting connection: " + e11.toString());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m41506d() {
        try {
            if (this.f38698d) {
                return;
            }
            ExecutorService executorService = this.f38697c;
            if (executorService == null || executorService.isShutdown()) {
                this.f38697c = Executors.newSingleThreadExecutor();
            }
            try {
                try {
                    ServerSocket serverSocket = this.f38695a;
                    if (serverSocket != null && !serverSocket.isClosed()) {
                        this.f38695a.close();
                    }
                    ServerSocket serverSocket2 = new ServerSocket(0);
                    this.f38695a = serverSocket2;
                    this.f38696b = serverSocket2.getLocalPort();
                    this.f38698d = true;
                    try {
                        this.f38697c.execute(new Runnable() { // from class: rl.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f38694a.m41505c();
                            }
                        });
                    } catch (RejectedExecutionException e10) {
                        Log.e("MagicLoginSocketHelperServer", "RejectedExecutionException while starting executor: " + e10.toString());
                    }
                } catch (BindException e11) {
                    Log.e("MagicLoginSocketHelperServer", "BindException while creating server socket: " + e11.toString());
                }
            } catch (IOException e12) {
                Log.e("MagicLoginSocketHelperServer", "IOException while creating server socket: " + e12.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m41507e() {
        this.f38698d = false;
        ServerSocket serverSocket = this.f38695a;
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                this.f38695a.close();
            } catch (IOException e10) {
                Log.e("MagicLoginSocketHelperServer", "IOException while closing server socket: " + e10.toString());
            }
        }
        this.f38696b = 0;
    }

    /* JADX INFO: renamed from: f */
    public void m41508f(Socket socket) {
        try {
            String utf = new DataInputStream(socket.getInputStream()).readUTF();
            socket.close();
            try {
                JSONObject jSONObject = new JSONObject(utf);
                jSONObject.put(C9494a.m37399l(), C9494a.m37391d());
                MessageBus messageBusM16016f = MessageBus.m16016f();
                if (messageBusM16016f != null) {
                    messageBusM16016f.m16024l(C9494a.m37400m(), jSONObject);
                } else {
                    Log.e("MagicLoginSocketHelperServer", "Magic Login could not find message bus on connectionInit");
                }
            } catch (JSONException e10) {
                Log.e("MagicLoginSocketHelperServer", "JSONException while handling connectionInit: " + e10.toString());
            }
        } catch (SocketException e11) {
            Log.e("MagicLoginSocketHelperServer", "SocketException while transferring data: " + e11.toString());
        } catch (IOException e12) {
            Log.e("MagicLoginSocketHelperServer", "IOException while transferring data: " + e12.toString());
        }
    }
}
