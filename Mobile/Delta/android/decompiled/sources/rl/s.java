package rl;

import android.os.Build;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static void a(String str, int i10, String str2, String str3, String str4) {
        String str5 = Build.MODEL;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i10), th.h.a().a());
                socket.setSoTimeout(th.h.a().a());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(nm.a.i(), str4);
                    jSONObject.put(nm.a.j(), str5);
                    jSONObject.put(nm.a.a(), str3);
                    jSONObject.put(nm.a.c(), str2);
                } catch (JSONException e10) {
                    Log.e("MagicLoginSocketHelperClient", "JSONException while handling connectionInit: " + e10.toString());
                }
                dataOutputStream.writeUTF(jSONObject.toString());
                dataOutputStream.flush();
                socket.close();
            } catch (Throwable th2) {
                try {
                    socket.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (SocketException e11) {
            Log.e("MagicLoginSocketHelperClient", "SocketException while handling SocketHelperClient: " + e11.toString());
        } catch (SocketTimeoutException e12) {
            Log.e("MagicLoginSocketHelperClient", "SocketTimeoutException while handling SocketHelperClient: " + e12.toString());
        } catch (UnknownHostException e13) {
            Log.e("MagicLoginSocketHelperClient", "UnknownHostException while handling SocketHelperClient: " + e13.toString());
        } catch (IOException e14) {
            Log.e("MagicLoginSocketHelperClient", "IOException while handling SocketHelperClient: " + e14.toString());
        }
    }
}
