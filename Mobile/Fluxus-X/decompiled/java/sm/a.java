package sm;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f31482a;
    public Connection b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f31483c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f31484d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f31485e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f31486f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31487g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31488h;

    /* JADX INFO: renamed from: sm.a$a, reason: collision with other inner class name */
    public class C0622a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f31489a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f31491d;

        public C0622a(j.b bVar, Intent intent, int i10, g gVar) {
            this.f31489a = bVar;
            this.b = intent;
            this.f31490c = i10;
            this.f31491d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            try {
                a.i(this.f31489a, jSONObject.getString(Text.type), jSONObject.getString("context"), this.b, this.f31490c, this.f31491d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share text data.");
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f31493a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f31495d;

        public b(j.b bVar, Intent intent, int i10, g gVar) {
            this.f31493a = bVar;
            this.b = intent;
            this.f31494c = i10;
            this.f31495d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            try {
                a.i(this.f31493a, jSONObject.getString("url"), jSONObject.getString("context"), this.b, this.f31494c, this.f31495d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share url data.");
            }
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f31497a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f31499d;

        public c(j.b bVar, Intent intent, int i10, g gVar) {
            this.f31497a = bVar;
            this.b = intent;
            this.f31498c = i10;
            this.f31499d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            try {
                a.h(this.f31497a, jSONObject.getString("image"), jSONObject.optString("url"), jSONObject.optString("context"), this.b, this.f31498c, this.f31499d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share image data.");
            }
        }
    }

    public class d implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f31501a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f31503d;

        public d(j.b bVar, Intent intent, int i10, g gVar) {
            this.f31501a = bVar;
            this.b = intent;
            this.f31502c = i10;
            this.f31503d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            try {
                String string = jSONObject.getString("video");
                String strOptString = jSONObject.optString("url");
                String strOptString2 = jSONObject.optString("context");
                if (h.a().h3()) {
                    a.this.f31488h = string;
                }
                a.j(this.f31501a, string, strOptString, strOptString2, this.b, this.f31502c, this.f31503d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share video data.");
            }
        }
    }

    public class e implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClipboardManager f31505a;

        public e(ClipboardManager clipboardManager) {
            this.f31505a = clipboardManager;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            String strOptString = jSONObject.optString(Text.type, BuildConfig.FLAVOR);
            if (strOptString.isEmpty()) {
                Log.e("ContentSharingProtocol", "Error: setClipboardText received null content value for clipboard.");
            } else {
                this.f31505a.setPrimaryClip(ClipData.newPlainText("label", strOptString));
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31506a = new a(null);
    }

    public interface g {
        void a(String str, String str2);
    }

    public a(MessageBus messageBus) {
        this.f31482a = messageBus == null ? MessageBus.getInstance() : messageBus;
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
        String absolutePath = parentFile2 != null ? parentFile2.getAbsolutePath() : BuildConfig.FLAVOR;
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
            gVar.a(str2, BuildConfig.FLAVOR);
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
        return f.f31506a;
    }

    public void e(Intent intent) {
        if (h.a().h3() && this.f31488h != null) {
            File file = new File(this.f31488h);
            try {
                if (file.exists()) {
                    Log.i("ContentSharingProtocol", "Deleted video file: " + file.delete() + " — " + this.f31488h);
                } else {
                    Log.w("ContentSharingProtocol", "Video file not found: " + this.f31488h);
                }
            } catch (Exception e10) {
                Log.e("ContentSharingProtocol", "Error while deleting video file: " + this.f31488h, e10);
            } finally {
                this.f31488h = null;
            }
        }
    }

    public synchronized void l(j.b bVar, Intent intent, int i10, g gVar) {
        Throwable th2;
        try {
            try {
                if (this.f31487g) {
                    try {
                        Log.w("ContentSharingProtocol", "Attempted to set ExternalContentSharingProtocol callback, but one is already set.");
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    this.f31487g = true;
                    try {
                        this.f31483c = this.f31482a.subscribe(an.c.b(), new C0622a(bVar, intent, i10, gVar));
                        this.f31484d = this.f31482a.subscribe(an.c.c(), new b(bVar, intent, i10, gVar));
                        this.b = this.f31482a.subscribe(an.c.a(), new c(bVar, intent, i10, gVar));
                        this.f31485e = this.f31482a.subscribe(an.c.d(), new d(bVar, intent, i10, gVar));
                        this.f31486f = this.f31482a.subscribe("ExternalContentSharing.setClipboardText", new e((ClipboardManager) bVar.getSystemService("clipboard")));
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
        if (!this.f31487g) {
            Log.w("ContentSharingProtocol", "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected.");
            return;
        }
        this.b.disconnect();
        this.b = null;
        this.f31483c.disconnect();
        this.f31483c = null;
        this.f31484d.disconnect();
        this.f31484d = null;
        this.f31485e.disconnect();
        this.f31485e = null;
        this.f31486f.disconnect();
        this.f31486f = null;
        this.f31487g = false;
    }
}
