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

/* JADX INFO: renamed from: tk.d */
/* JADX INFO: loaded from: classes2.dex */
public class C11669d extends WebView {

    /* JADX INFO: renamed from: a */
    public b f41257a;

    /* JADX INFO: renamed from: b */
    public Handler f41258b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, C11667b> f41259c;

    /* JADX INFO: renamed from: tk.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f41260a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(String str) {
            this.f41260a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11669d.this.evaluateJavascript(this.f41260a, null);
        }
    }

    /* JADX INFO: renamed from: tk.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo42575a(String str, String str2);
    }

    /* JADX INFO: renamed from: tk.d$c */
    public class c {

        /* JADX INFO: renamed from: tk.d$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f41263a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(String str) {
                this.f41263a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11669d.this.mo29178e(this.f41263a);
            }
        }

        @JavascriptInterface
        public void executeRoblox(String str) {
            C11669d.this.f41258b.post(new a(str));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    /* JADX INFO: renamed from: tk.d$d */
    public static class d extends AbstractC11666a {

        /* JADX INFO: renamed from: e */
        public WeakReference<C11669d> f41265e;

        public d(WeakReference<C11669d> weakReference) {
            this.f41265e = weakReference;
        }

        @Override // tk.AbstractC11666a
        /* JADX INFO: renamed from: a */
        public void mo43811a(boolean z10, JSONObject jSONObject) {
            this.f41265e.get().m43824c(m43812b(), z10, jSONObject);
        }

        @Override // tk.AbstractC11666a
        /* JADX INFO: renamed from: c */
        public Context mo43813c() {
            return this.f41265e.get().getContext();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11669d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41259c = new HashMap<>();
        mo15286d(context);
    }

    /* JADX INFO: renamed from: a */
    public void mo15285a() {
        stopLoading();
        removeJavascriptInterface("__globalRobloxAndroidBridge__");
        this.f41258b.removeCallbacksAndMessages(null);
        setWebViewClient(null);
        setWebChromeClient(null);
        this.f41259c.clear();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        destroy();
    }

    /* JADX INFO: renamed from: b */
    public void mo29177b(String str) {
        if (this.f41258b.getLooper().getThread() == Thread.currentThread()) {
            evaluateJavascript(str, null);
        } else {
            this.f41258b.post(new a(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m43824c(String str, boolean z10, JSONObject jSONObject) {
        mo29177b(String.format("if (window.Roblox.Hybrid && window.Roblox.Hybrid.Bridge.nativeCallback && typeof window.Roblox.Hybrid.Bridge.nativeCallback === \"function\") { window.Roblox.Hybrid.Bridge.nativeCallback('%s', %s, %s); }", str, z10 ? "true" : "false", jSONObject != null ? jSONObject.toString() : "{}"));
    }

    /* JADX INFO: renamed from: d */
    public void mo15286d(Context context) {
        this.f41258b = new Handler(getContext().getMainLooper());
        mo15287g(context);
        addJavascriptInterface(new c(), "__globalRobloxAndroidBridge__");
    }

    /* JADX INFO: renamed from: e */
    public void mo29178e(String str) {
        try {
            d dVar = new d(new WeakReference(this));
            JSONObject jSONObject = new JSONObject(str);
            dVar.m43819i(jSONObject.getString("moduleID"));
            dVar.m43818h(jSONObject.getString("functionName"));
            dVar.m43820j(jSONObject.getJSONObject("params"));
            dVar.m43817g(jSONObject.optString("callbackID"));
            b bVar = this.f41257a;
            if (bVar != null) {
                bVar.mo42575a(dVar.m43815e(), dVar.m43814d());
            }
            C11667b c11667b = this.f41259c.get(dVar.m43815e());
            if (c11667b != null) {
                c11667b.mo29963a(dVar);
                return;
            }
            Log.e("rbx.hybrid", "Couldn't find module with ID: " + dVar.m43815e());
        } catch (JSONException e10) {
            Log.e("rbx.hybrid", "There was an error parsing the JSON command: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m43825f(C11667b c11667b) {
        this.f41259c.put(c11667b.m43821b(), c11667b);
    }

    /* JADX INFO: renamed from: g */
    public void mo15287g(Context context) {
    }

    public void setCommandListener(b bVar) {
        this.f41257a = bVar;
    }

    public C11669d(Context context) {
        super(context);
        this.f41259c = new HashMap<>();
        mo15286d(context);
    }
}
