package em;

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
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f15628a;
    public Connection b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f15629c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f15630d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f15631e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f15632f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15633g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15634h;

    /* JADX INFO: renamed from: em.a$a, reason: collision with other inner class name */
    public class C0286a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f15635a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f15636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f15637d;

        public C0286a(j.b bVar, Intent intent, int i10, g gVar) {
            this.f15635a = bVar;
            this.b = intent;
            this.f15636c = i10;
            this.f15637d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.i(this.f15635a, jSONObject.getString(Text.type), jSONObject.getString("context"), this.b, this.f15636c, this.f15637d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share text data.");
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f15639a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f15640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f15641d;

        public b(j.b bVar, Intent intent, int i10, g gVar) {
            this.f15639a = bVar;
            this.b = intent;
            this.f15640c = i10;
            this.f15641d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.i(this.f15639a, jSONObject.getString("url"), jSONObject.getString("context"), this.b, this.f15640c, this.f15641d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share url data.");
            }
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f15643a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f15644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f15645d;

        public c(j.b bVar, Intent intent, int i10, g gVar) {
            this.f15643a = bVar;
            this.b = intent;
            this.f15644c = i10;
            this.f15645d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                a.h(this.f15643a, jSONObject.getString("image"), jSONObject.optString("url"), jSONObject.optString("context"), this.b, this.f15644c, this.f15645d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share image data.");
            }
        }
    }

    public class d implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.b f15647a;
        public final /* synthetic */ Intent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f15648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f15649d;

        public d(j.b bVar, Intent intent, int i10, g gVar) {
            this.f15647a = bVar;
            this.b = intent;
            this.f15648c = i10;
            this.f15649d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                String string = jSONObject.getString("video");
                String strOptString = jSONObject.optString("url");
                String strOptString2 = jSONObject.optString("context");
                if (h.a().U2()) {
                    a.this.f15634h = string;
                }
                a.j(this.f15647a, string, strOptString, strOptString2, this.b, this.f15648c, this.f15649d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share video data.");
            }
        }
    }

    public class e implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClipboardManager f15651a;

        public e(ClipboardManager clipboardManager) {
            this.f15651a = clipboardManager;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            String strOptString = jSONObject.optString(Text.type, "");
            if (strOptString.isEmpty()) {
                Log.e("ContentSharingProtocol", "Error: setClipboardText received null content value for clipboard.");
            } else {
                this.f15651a.setPrimaryClip(ClipData.newPlainText("label", strOptString));
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15652a = new a(null);
    }

    public interface g {
        void a(String str, String str2);
    }

    public a(MessageBus messageBus) {
        this.f15628a = messageBus == null ? MessageBus.f() : messageBus;
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
        boolean zJ = h.a().j();
        Uri uriB = zJ ? b(bVar, str) : c(bVar, str);
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setDataAndType(uriB, str2);
        intent2.putExtra("android.intent.extra.STREAM", uriB);
        intent2.addFlags(1);
        if (!TextUtils.isEmpty(str3)) {
            intent2.putExtra("android.intent.extra.TEXT", str3);
            if (zJ && "content".equals(uriB.getScheme())) {
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
        return f.f15652a;
    }

    public void e(Intent intent) {
        if (h.a().U2() && this.f15634h != null) {
            File file = new File(this.f15634h);
            try {
                if (file.exists()) {
                    Log.i("ContentSharingProtocol", "Deleted video file: " + file.delete() + " — " + this.f15634h);
                } else {
                    Log.w("ContentSharingProtocol", "Video file not found: " + this.f15634h);
                }
            } catch (Exception e10) {
                Log.e("ContentSharingProtocol", "Error while deleting video file: " + this.f15634h, e10);
            } finally {
                this.f15634h = null;
            }
        }
    }

    public synchronized void l(j.b bVar, Intent intent, int i10, g gVar) {
        Throwable th2;
        try {
            try {
                if (this.f15633g) {
                    try {
                        Log.w("ContentSharingProtocol", "Attempted to set ExternalContentSharingProtocol callback, but one is already set.");
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    this.f15633g = true;
                    try {
                        this.f15629c = this.f15628a.t(nm.c.b(), new C0286a(bVar, intent, i10, gVar));
                        this.f15630d = this.f15628a.t(nm.c.c(), new b(bVar, intent, i10, gVar));
                        this.b = this.f15628a.t(nm.c.a(), new c(bVar, intent, i10, gVar));
                        this.f15631e = this.f15628a.t(nm.c.d(), new d(bVar, intent, i10, gVar));
                        this.f15632f = this.f15628a.t("ExternalContentSharing.setClipboardText", new e((ClipboardManager) bVar.getSystemService("clipboard")));
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
        if (!this.f15633g) {
            Log.w("ContentSharingProtocol", "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected.");
            return;
        }
        this.b.a();
        this.b = null;
        this.f15629c.a();
        this.f15629c = null;
        this.f15630d.a();
        this.f15630d = null;
        this.f15631e.a();
        this.f15631e = null;
        this.f15632f.a();
        this.f15632f = null;
        this.f15633g = false;
    }
}
