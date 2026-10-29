package tk;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
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
    public b f31852a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, tk.b> f31853c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31854a;

        public a(String str) {
            this.f31854a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.evaluateJavascript(this.f31854a, null);
        }
    }

    public interface b {
        void a(String str, String str2);
    }

    public class c {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31856a;

            public a(String str) {
                this.f31856a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e(this.f31856a);
            }
        }

        @JavascriptInterface
        public void executeRoblox(String str) {
            d.this.b.post(new a(str));
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: tk.d$d, reason: collision with other inner class name */
    public static class C0576d extends tk.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WeakReference<d> f31857e;

        public C0576d(WeakReference<d> weakReference) {
            this.f31857e = weakReference;
        }

        @Override // tk.a
        public void a(boolean z10, JSONObject jSONObject) {
            this.f31857e.get().c(b(), z10, jSONObject);
        }

        @Override // tk.a
        public Context c() {
            return this.f31857e.get().getContext();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31853c = new HashMap<>();
        d(context);
    }

    public void a() {
        stopLoading();
        removeJavascriptInterface("__globalRobloxAndroidBridge__");
        this.b.removeCallbacksAndMessages(null);
        setWebViewClient(null);
        setWebChromeClient(null);
        this.f31853c.clear();
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
            C0576d c0576d = new C0576d(new WeakReference(this));
            JSONObject jSONObject = new JSONObject(str);
            c0576d.i(jSONObject.getString("moduleID"));
            c0576d.h(jSONObject.getString("functionName"));
            c0576d.j(jSONObject.getJSONObject("params"));
            c0576d.g(jSONObject.optString("callbackID"));
            b bVar = this.f31852a;
            if (bVar != null) {
                bVar.a(c0576d.e(), c0576d.d());
            }
            tk.b bVar2 = this.f31853c.get(c0576d.e());
            if (bVar2 != null) {
                bVar2.a(c0576d);
                return;
            }
            Log.e("rbx.hybrid", "Couldn't find module with ID: " + c0576d.e());
        } catch (JSONException e10) {
            Log.e("rbx.hybrid", "There was an error parsing the JSON command: " + e10.getMessage());
        }
    }

    public void f(tk.b bVar) {
        this.f31853c.put(bVar.b(), bVar);
    }

    public void g(Context context) {
    }

    public void setCommandListener(b bVar) {
        this.f31852a = bVar;
    }

    public d(Context context) {
        super(context);
        this.f31853c = new HashMap<>();
        d(context);
    }
}
