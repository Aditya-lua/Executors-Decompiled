package rk;

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
    public b f30759a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, rk.b> f30760c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30761a;

        public a(String str) {
            this.f30761a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.evaluateJavascript(this.f30761a, null);
        }
    }

    public interface b {
        void a(String str, String str2);
    }

    public class c {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f30763a;

            public a(String str) {
                this.f30763a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e(this.f30763a);
            }
        }

        @JavascriptInterface
        public void executeRoblox(String str) {
            d.this.b.post(new a(str));
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: rk.d$d, reason: collision with other inner class name */
    public static class C0538d extends rk.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WeakReference<d> f30764e;

        public C0538d(WeakReference<d> weakReference) {
            this.f30764e = weakReference;
        }

        @Override // rk.a
        public void a(boolean z10, JSONObject jSONObject) {
            this.f30764e.get().c(b(), z10, jSONObject);
        }

        @Override // rk.a
        public Context c() {
            return this.f30764e.get().getContext();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30760c = new HashMap<>();
        d(context);
    }

    public void a() {
        stopLoading();
        removeJavascriptInterface("__globalRobloxAndroidBridge__");
        this.b.removeCallbacksAndMessages(null);
        setWebViewClient(null);
        setWebChromeClient(null);
        this.f30760c.clear();
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
            C0538d c0538d = new C0538d(new WeakReference(this));
            JSONObject jSONObject = new JSONObject(str);
            c0538d.i(jSONObject.getString("moduleID"));
            c0538d.h(jSONObject.getString("functionName"));
            c0538d.j(jSONObject.getJSONObject("params"));
            c0538d.g(jSONObject.optString("callbackID"));
            b bVar = this.f30759a;
            if (bVar != null) {
                bVar.a(c0538d.e(), c0538d.d());
            }
            rk.b bVar2 = this.f30760c.get(c0538d.e());
            if (bVar2 != null) {
                bVar2.a(c0538d);
                return;
            }
            Log.e("rbx.hybrid", "Couldn't find module with ID: " + c0538d.e());
        } catch (JSONException e10) {
            Log.e("rbx.hybrid", "There was an error parsing the JSON command: " + e10.getMessage());
        }
    }

    public void f(rk.b bVar) {
        this.f30760c.put(bVar.b(), bVar);
    }

    public void g(Context context) {
    }

    public void setCommandListener(b bVar) {
        this.f30759a = bVar;
    }

    public d(Context context) {
        super(context);
        this.f30760c = new HashMap<>();
        d(context);
    }
}
