package p108em;

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
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p203j.ActivityC6992b;
import p311nm.C9496c;
import th.C11659h;

/* JADX INFO: renamed from: em.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5163a {

    /* JADX INFO: renamed from: a */
    public MessageBus f20070a;

    /* JADX INFO: renamed from: b */
    public Connection f20071b = null;

    /* JADX INFO: renamed from: c */
    public Connection f20072c = null;

    /* JADX INFO: renamed from: d */
    public Connection f20073d = null;

    /* JADX INFO: renamed from: e */
    public Connection f20074e = null;

    /* JADX INFO: renamed from: f */
    public Connection f20075f = null;

    /* JADX INFO: renamed from: g */
    public boolean f20076g = false;

    /* JADX INFO: renamed from: h */
    public String f20077h;

    /* JADX INFO: renamed from: em.a$a */
    public class a implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityC6992b f20078a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Intent f20079b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f20080c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g f20081d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(ActivityC6992b activityC6992b, Intent intent, int i10, g gVar) {
            this.f20078a = activityC6992b;
            this.f20079b = intent;
            this.f20080c = i10;
            this.f20081d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                C5163a.m24016i(this.f20078a, jSONObject.getString(Text.type), jSONObject.getString("context"), this.f20079b, this.f20080c, this.f20081d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share text data.");
            }
        }
    }

    /* JADX INFO: renamed from: em.a$b */
    public class b implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityC6992b f20083a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Intent f20084b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f20085c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g f20086d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(ActivityC6992b activityC6992b, Intent intent, int i10, g gVar) {
            this.f20083a = activityC6992b;
            this.f20084b = intent;
            this.f20085c = i10;
            this.f20086d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                C5163a.m24016i(this.f20083a, jSONObject.getString("url"), jSONObject.getString("context"), this.f20084b, this.f20085c, this.f20086d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share url data.");
            }
        }
    }

    /* JADX INFO: renamed from: em.a$c */
    public class c implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityC6992b f20088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Intent f20089b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f20090c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g f20091d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(ActivityC6992b activityC6992b, Intent intent, int i10, g gVar) {
            this.f20088a = activityC6992b;
            this.f20089b = intent;
            this.f20090c = i10;
            this.f20091d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                C5163a.m24015h(this.f20088a, jSONObject.getString("image"), jSONObject.optString("url"), jSONObject.optString("context"), this.f20089b, this.f20090c, this.f20091d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share image data.");
            }
        }
    }

    /* JADX INFO: renamed from: em.a$d */
    public class d implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityC6992b f20093a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Intent f20094b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f20095c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g f20096d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(ActivityC6992b activityC6992b, Intent intent, int i10, g gVar) {
            this.f20093a = activityC6992b;
            this.f20094b = intent;
            this.f20095c = i10;
            this.f20096d = gVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                String string = jSONObject.getString("video");
                String strOptString = jSONObject.optString("url");
                String strOptString2 = jSONObject.optString("context");
                if (C11659h.m43403a().mo43588a3()) {
                    C5163a.this.f20077h = string;
                }
                C5163a.m24017j(this.f20093a, string, strOptString, strOptString2, this.f20094b, this.f20095c, this.f20096d);
            } catch (JSONException unused) {
                Log.e("ContentSharingProtocol", "Error parsing share video data.");
            }
        }
    }

    /* JADX INFO: renamed from: em.a$e */
    public class e implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ClipboardManager f20098a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public e(ClipboardManager clipboardManager) {
            this.f20098a = clipboardManager;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            String strOptString = jSONObject.optString(Text.type, "");
            if (strOptString.isEmpty()) {
                Log.e("ContentSharingProtocol", "Error: setClipboardText received null content value for clipboard.");
            } else {
                this.f20098a.setPrimaryClip(ClipData.newPlainText("label", strOptString));
            }
        }
    }

    /* JADX INFO: renamed from: em.a$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public static final C5163a f20100a = new C5163a(null);
    }

    /* JADX INFO: renamed from: em.a$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo1231a(String str, String str2);
    }

    public C5163a(MessageBus messageBus) {
        this.f20070a = messageBus == null ? MessageBus.m16016f() : messageBus;
    }

    /* JADX INFO: renamed from: b */
    public static Uri m24010b(ActivityC6992b activityC6992b, String str) {
        try {
            return FileProvider.getUriForFile(activityC6992b, activityC6992b.getPackageName() + ".fileprovider", new File(str));
        } catch (IllegalArgumentException e10) {
            Log.e("ContentSharingProtocol", "File outside declared FileProvider paths, falling back: " + str, e10);
            return m24011c(activityC6992b, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Uri m24011c(ActivityC6992b activityC6992b, String str) {
        File filesDir = activityC6992b.getFilesDir();
        File parentFile = filesDir != null ? filesDir.getParentFile() : null;
        File parentFile2 = parentFile != null ? parentFile.getParentFile() : null;
        String absolutePath = parentFile2 != null ? parentFile2.getAbsolutePath() : "";
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        return Uri.parse(str.replace(absolutePath, "content://"));
    }

    /* JADX INFO: renamed from: d */
    public static int m24012d(int i10) {
        return Build.VERSION.SDK_INT >= 31 ? i10 | 33554432 : i10;
    }

    /* JADX INFO: renamed from: f */
    public static void m24013f(ActivityC6992b activityC6992b, Intent intent, Intent intent2, int i10) {
        activityC6992b.startActivityForResult(Intent.createChooser(intent, null, PendingIntent.getBroadcast(activityC6992b, 0, intent2, m24012d(134217728)).getIntentSender()), i10);
    }

    /* JADX INFO: renamed from: g */
    public static void m24014g(ActivityC6992b activityC6992b, String str, String str2, String str3, String str4, Intent intent, int i10, g gVar) {
        if (gVar != null) {
            gVar.mo1231a(str4, str3);
        }
        boolean zMo43666l = C11659h.m43403a().mo43666l();
        Uri uriM24010b = zMo43666l ? m24010b(activityC6992b, str) : m24011c(activityC6992b, str);
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setDataAndType(uriM24010b, str2);
        intent2.putExtra("android.intent.extra.STREAM", uriM24010b);
        intent2.addFlags(1);
        if (!TextUtils.isEmpty(str3)) {
            intent2.putExtra("android.intent.extra.TEXT", str3);
            if (zMo43666l && "content".equals(uriM24010b.getScheme())) {
                intent2.setClipData(ClipData.newUri(activityC6992b.getContentResolver(), "shared", uriM24010b));
            }
        }
        m24013f(activityC6992b, intent2, intent, i10);
    }

    /* JADX INFO: renamed from: h */
    public static void m24015h(ActivityC6992b activityC6992b, String str, String str2, String str3, Intent intent, int i10, g gVar) {
        m24014g(activityC6992b, str, "image/*", str2, str3, intent, i10, gVar);
    }

    /* JADX INFO: renamed from: i */
    public static void m24016i(ActivityC6992b activityC6992b, String str, String str2, Intent intent, int i10, g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (gVar != null) {
            gVar.mo1231a(str2, "");
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", str);
        m24013f(activityC6992b, intent2, intent, i10);
    }

    /* JADX INFO: renamed from: j */
    public static void m24017j(ActivityC6992b activityC6992b, String str, String str2, String str3, Intent intent, int i10, g gVar) {
        m24014g(activityC6992b, str, "video/*", str2, str3, intent, i10, gVar);
    }

    /* JADX INFO: renamed from: k */
    public static C5163a m24018k() {
        return f.f20100a;
    }

    /* JADX INFO: renamed from: e */
    public void m24019e(Intent intent) {
        if (C11659h.m43403a().mo43588a3() && this.f20077h != null) {
            File file = new File(this.f20077h);
            try {
                if (file.exists()) {
                    Log.i("ContentSharingProtocol", "Deleted video file: " + file.delete() + " — " + this.f20077h);
                } else {
                    Log.w("ContentSharingProtocol", "Video file not found: " + this.f20077h);
                }
            } catch (Exception e10) {
                Log.e("ContentSharingProtocol", "Error while deleting video file: " + this.f20077h, e10);
            } finally {
                this.f20077h = null;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m24020l(ActivityC6992b activityC6992b, Intent intent, int i10, g gVar) {
        Throwable th2;
        try {
            try {
                if (this.f20076g) {
                    try {
                        Log.w("ContentSharingProtocol", "Attempted to set ExternalContentSharingProtocol callback, but one is already set.");
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    this.f20076g = true;
                    try {
                        this.f20072c = this.f20070a.m16030t(C9496c.m37434b(), new a(activityC6992b, intent, i10, gVar));
                        this.f20073d = this.f20070a.m16030t(C9496c.m37435c(), new b(activityC6992b, intent, i10, gVar));
                        this.f20071b = this.f20070a.m16030t(C9496c.m37433a(), new c(activityC6992b, intent, i10, gVar));
                        this.f20074e = this.f20070a.m16030t(C9496c.m37436d(), new d(activityC6992b, intent, i10, gVar));
                        this.f20075f = this.f20070a.m16030t("ExternalContentSharing.setClipboardText", new e((ClipboardManager) activityC6992b.getSystemService("clipboard")));
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

    /* JADX INFO: renamed from: m */
    public synchronized void m24021m() {
        if (!this.f20076g) {
            Log.w("ContentSharingProtocol", "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected.");
            return;
        }
        this.f20071b.m16010a();
        this.f20071b = null;
        this.f20072c.m16010a();
        this.f20072c = null;
        this.f20073d.m16010a();
        this.f20073d = null;
        this.f20074e.m16010a();
        this.f20074e = null;
        this.f20075f.m16010a();
        this.f20075f = null;
        this.f20076g = false;
    }
}
