package p416rl;

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
import p311nm.C9494a;
import th.C11659h;

/* JADX INFO: renamed from: rl.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C10911s {
    /* JADX INFO: renamed from: a */
    public static void m41502a(String str, int i10, String str2, String str3, String str4) {
        String str5 = Build.MODEL;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i10), C11659h.m43403a().mo43584a());
                socket.setSoTimeout(C11659h.m43403a().mo43584a());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C9494a.m37396i(), str4);
                    jSONObject.put(C9494a.m37397j(), str5);
                    jSONObject.put(C9494a.m37388a(), str3);
                    jSONObject.put(C9494a.m37390c(), str2);
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
