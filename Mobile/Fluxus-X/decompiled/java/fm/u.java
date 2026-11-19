package fm;

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

/* JADX INFO: loaded from: classes2.dex */
public class u {
    public int b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServerSocket f16190a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16192d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f16191c = Executors.newSingleThreadExecutor();

    public int b() {
        return this.b;
    }

    public final /* synthetic */ void c() {
        while (this.f16192d) {
            try {
                f(this.f16190a.accept());
            } catch (SocketException e10) {
                if (this.f16192d) {
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

    public synchronized void d() {
        try {
            if (this.f16192d) {
                return;
            }
            ExecutorService executorService = this.f16191c;
            if (executorService == null || executorService.isShutdown()) {
                this.f16191c = Executors.newSingleThreadExecutor();
            }
            try {
                try {
                    ServerSocket serverSocket = this.f16190a;
                    if (serverSocket != null && !serverSocket.isClosed()) {
                        this.f16190a.close();
                    }
                    ServerSocket serverSocket2 = new ServerSocket(0);
                    this.f16190a = serverSocket2;
                    this.b = serverSocket2.getLocalPort();
                    this.f16192d = true;
                    try {
                        this.f16191c.execute(new Runnable() { // from class: fm.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f16189a.c();
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

    public synchronized void e() {
        this.f16192d = false;
        ServerSocket serverSocket = this.f16190a;
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                this.f16190a.close();
            } catch (IOException e10) {
                Log.e("MagicLoginSocketHelperServer", "IOException while closing server socket: " + e10.toString());
            }
        }
        this.b = 0;
    }

    public void f(Socket socket) {
        try {
            String utf = new DataInputStream(socket.getInputStream()).readUTF();
            socket.close();
            try {
                JSONObject jSONObject = new JSONObject(utf);
                jSONObject.put(an.a.l(), an.a.d());
                MessageBus messageBus = MessageBus.getInstance();
                if (messageBus != null) {
                    messageBus.publish(an.a.m(), jSONObject);
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
