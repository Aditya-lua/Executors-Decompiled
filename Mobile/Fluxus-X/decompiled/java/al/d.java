package al;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f500a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, al.b> f501c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f502a;

        public a(String str) {
            this.f502a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.evaluateJavascript(this.f502a, null);
        }
    }

    public interface b {
        void a(String str, String str2);
    }

    public class c {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f504a;

            public a(String str) {
                this.f504a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e(this.f504a);
            }
        }

        @JavascriptInterface
        public void executeRoblox(String str) {
            d.this.b.post(new a(str));
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: al.d$d, reason: collision with other inner class name */
    public static class C0016d extends al.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WeakReference<d> f505e;

        public C0016d(WeakReference<d> weakReference) {
            this.f505e = weakReference;
        }

        @Override // al.a
        public void a(boolean z10, JSONObject jSONObject) {
            this.f505e.get().c(b(), z10, jSONObject);
        }

        @Override // al.a
        public Context c() {
            return this.f505e.get().getContext();
        }
    }

    public d(Context context) {
        super(context);
        this.f501c = new HashMap<>();
        d(context);
    }

    public void a() {
        stopLoading();
        removeJavascriptInterface("__globalRobloxAndroidBridge__");
        this.b.removeCallbacksAndMessages(null);
        setWebViewClient(null);
        setWebChromeClient(null);
        this.f501c.clear();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        destroy();
    }

    public void b(String str) {
        if (this.b.getLooper().getThread() == Thread.currentThread()) {
            evaluateJavascript(str, null);
        } else {
            this.b.post(new a(str));
        }
    }

    public void c(String str, boolean z10, JSONObject jSONObject) {
        b(String.format("if (window.Roblox.Hybrid && window.Roblox.Hybrid.Bridge.nativeCallback && typeof window.Roblox.Hybrid.Bridge.nativeCallback === \"function\") { window.Roblox.Hybrid.Bridge.nativeCallback('%s', %s, %s); }", str, z10 ? "true" : "false", jSONObject != null ? jSONObject.toString() : "{}"));
    }

    public void d(Context context) {
        this.b = new Handler(getContext().getMainLooper());
        g(context);
        addJavascriptInterface(new c(), "__globalRobloxAndroidBridge__");
    }

    public void e(String str) {
        try {
            C0016d c0016d = new C0016d(new WeakReference(this));
            JSONObject jSONObject = new JSONObject(str);
            c0016d.i(jSONObject.getString("moduleID"));
            c0016d.h(jSONObject.getString("functionName"));
            c0016d.j(jSONObject.getJSONObject("params"));
            c0016d.g(jSONObject.optString("callbackID"));
            b bVar = this.f500a;
            if (bVar != null) {
                bVar.a(c0016d.e(), c0016d.d());
            }
            al.b bVar2 = this.f501c.get(c0016d.e());
            if (bVar2 != null) {
                bVar2.a(c0016d);
                return;
            }
            Log.e("rbx.hybrid", "Couldn't find module with ID: " + c0016d.e());
        } catch (JSONException e10) {
            Log.e("rbx.hybrid", "There was an error parsing the JSON command: " + e10.getMessage());
        }
    }

    public void f(al.b bVar) {
        this.f501c.put(bVar.b(), bVar);
    }

    public void g(Context context) {
    }

    public void setCommandListener(b bVar) {
        this.f500a = bVar;
    }
}
