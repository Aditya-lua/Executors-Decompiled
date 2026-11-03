package cm;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f5046a;
    public Connection b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f5047c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f5048d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f5049e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f5050f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5051g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5052h;

    /* JADX INFO: renamed from: cm.a$a, reason: collision with other inner class name */
    public class C0107a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5053a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5055d;

        public C0107a(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5053a = bVar;
            this.b = intent;
            this.f5054c = i10;
            this.f5055d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.i(this.f5053a, jSONObject.getString(Text.type), jSONObject.getString("context"), this.b, this.f5054c, this.f5055d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share text data.");
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5057a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5059d;

        public b(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5057a = bVar;
            this.b = intent;
            this.f5058c = i10;
            this.f5059d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.i(this.f5057a, jSONObject.getString("url"), jSONObject.getString("context"), this.b, this.f5058c, this.f5059d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share url data.");
            }
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5061a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5063d;

        public c(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5061a = bVar;
            this.b = intent;
            this.f5062c = i10;
            this.f5063d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.h(this.f5061a, jSONObject.getString("image"), jSONObject.optString("url"), jSONObject.optString("context"), this.b, this.f5062c, this.f5063d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share image data.");
            }
        }
    }

    public class d implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f5065a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f5067d;

        public d(j.b bVar, Intent intent, int i10, g gVar) {
            this.f5065a = bVar;
            this.b = intent;
            this.f5066c = i10;
            this.f5067d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                String string = jSONObject.getString("video");
                String strOptString = jSONObject.optString("url");
                String strOptString2 = jSONObject.optString("context");
                if (h.a().f3()) {
                    a.this.f5052h = string;
                }
                a.j(this.f5065a, string, strOptString, strOptString2, this.b, this.f5066c, this.f5067d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share video data.");
            }
        }
    }

    public class e implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClipboardManager f5069a;

        public e(ClipboardManager clipboardManager) {
            this.f5069a = clipboardManager;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            String strOptString = jSONObject.optString(Text.type, "");
            if (strOptString.isEmpty()) {
                Log.e("ContentSharingProtocol", "Error: setClipboardText received null content value for clipboard.");
            } else {
                this.f5069a.setPrimaryClip(ClipData.newPlainText("label", strOptString));
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5070a = new a(null);
    }

    public interface g {
        void a(String str, String str2);
    }

    public a(MessageBus messageBus) {
        this.f5046a = messageBus == null ? MessageBus.f() : messageBus;
    }

    public static Uri b(j.b bVar, String str) {
        try {
            return FileProvider.getUriForFile(bVar, bVar.getPackageName() + ".fileprovider", new File(str));
        } catch (IllegalArgumentException e10) {
            Log.e("ContentSharingProtocol", "File outside declared FileProvider paths, falling back: " + str, e10);
            return c(bVar, str);
        }
    }

    public static Uri c(j.b bVar, String str) {
        File filesDir = bVar.getFilesDir();
        File parentFile = filesDir != null ? filesDir.getParentFile() : null;
        File parentFile2 = parentFile != null ? parentFile.getParentFile() : null;
        String absolutePath = parentFile2 != null ? parentFile2.getAbsolutePath() : "";
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        return Uri.parse(str.replace(absolutePath, "content://"));
    }

    public static int d(int i10) {
        return Build.VERSION.SDK_INT >= 31 ? i10 | 33554432 : i10;
    }

    public static void f(j.b bVar, Intent intent, Intent intent2, int i10) {
        bVar.startActivityForResult(Intent.createChooser(intent, null, PendingIntent.getBroadcast(bVar, 0, intent2, d(134217728)).getIntentSender()), i10);
    }

    public static void g(j.b bVar, String str, String str2, String str3, String str4, Intent intent, int i10, g gVar) {
        if (gVar != null) {
            gVar.a(str4, str3);
        }
        boolean zL = h.a().l();
        Uri uriB = zL ? b(bVar, str) : c(bVar, str);
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setDataAndType(uriB, str2);
        intent2.putExtra("android.intent.extra.STREAM", uriB);
        intent2.addFlags(1);
        if (!TextUtils.isEmpty(str3)) {
            intent2.putExtra("android.intent.extra.TEXT", str3);
            if (zL && "content".equals(uriB.getScheme())) {
                intent2.setClipData(ClipData.newUri(bVar.getContentResolver(), "shared", uriB));
            }
        }
        f(bVar, intent2, intent, i10);
    }

    public static void h(j.b bVar, String str, String str2, String str3, Intent intent, int i10, g gVar) {
        g(bVar, str, "image/*", str2, str3, intent, i10, gVar);
    }

    public static void i(j.b bVar, String str, String str2, Intent intent, int i10, g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (gVar != null) {
            gVar.a(str2, "");
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", str);
        f(bVar, intent2, intent, i10);
    }

    public static void j(j.b bVar, String str, String str2, String str3, Intent intent, int i10, g gVar) {
        g(bVar, str, "video/*", str2, str3, intent, i10, gVar);
    }

    public static a k() {
        return f.f5070a;
    }

    public void e(Intent intent) {
        if (h.a().f3() && this.f5052h != null) {
            File file = new File(this.f5052h);
            try {
                if (file.exists()) {
                    Log.i("ContentSharingProtocol", "Deleted video file: " + file.delete() + " — " + this.f5052h);
                } else {
                    Log.w("ContentSharingProtocol", "Video file not found: " + this.f5052h);
                }
            } catch (Exception e10) {
                Log.e("ContentSharingProtocol", "Error while deleting video file: " + this.f5052h, e10);
            } finally {
                this.f5052h = null;
            }
        }
    }

    public synchronized void l(j.b bVar, Intent intent, int i10, g gVar) {
        Throwable th2;
        try {
            try {
                if (this.f5051g) {
                    try {
                        Log.w("ContentSharingProtocol", "Attempted to set ExternalContentSharingProtocol callback, but one is already set.");
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    this.f5051g = true;
                    try {
                        this.f5047c = this.f5046a.t(lm.c.b(), new C0107a(bVar, intent, i10, gVar));
                        this.f5048d = this.f5046a.t(lm.c.c(), new b(bVar, intent, i10, gVar));
                        this.b = this.f5046a.t(lm.c.a(), new c(bVar, intent, i10, gVar));
                        this.f5049e = this.f5046a.t(lm.c.d(), new d(bVar, intent, i10, gVar));
                        this.f5050f = this.f5046a.t("ExternalContentSharing.setClipboardText", new e((ClipboardManager) bVar.getSystemService("clipboard")));
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        th2 = th;
        throw th2;
    }

    public synchronized void m() {
        if (!this.f5051g) {
            Log.w("ContentSharingProtocol", "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected.");
            return;
        }
        this.b.a();
        this.b = null;
        this.f5047c.a();
        this.f5047c = null;
        this.f5048d.a();
        this.f5048d = null;
        this.f5049e.a();
        this.f5049e = null;
        this.f5050f.a();
        this.f5050f = null;
        this.f5051g = false;
    }
}
