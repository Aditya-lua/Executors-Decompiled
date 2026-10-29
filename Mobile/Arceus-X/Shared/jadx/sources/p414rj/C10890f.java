package p414rj;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.roblox.engine.jni.NativeGLInterface;
import km.C7635f;
import p088e.AbstractC4717m0;
import p093e4.ActivityC4831q;
import p093e4.InterfaceC4810f0;
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: renamed from: rj.f */
/* JADX INFO: loaded from: classes2.dex */
public class C10890f {

    /* JADX INFO: renamed from: rj.f$a */
    public class a extends AbstractC4717m0 {

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ ActivityC4831q f38651X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, ActivityC4831q activityC4831q) {
            super(z10);
            this.f38651X = activityC4831q;
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackPressed() {
            C6124q.m27057b("QrCodeScanner", "handleOnBackPressed (Dispatcher): Return 'Cancel' using an empty Url.");
            this.f38651X.m23360l1().m4416a1();
            C10890f.m41452e("");
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m41448a(FragmentManager fragmentManager, String str, Bundle bundle) {
        boolean z10 = bundle.getBoolean("BundleKey_success");
        String string = bundle.getString("BundleKey_urlString");
        C6124q.m27057b("QrCodeScanner", "... (callback): success = " + z10 + ", urlString = " + string);
        fragmentManager.m4416a1();
        if (C11659h.m43403a().mo43610d1()) {
            C7635f.m31524D().m31540h(string, "android_qr_scanner", false);
        } else {
            C7635f.m31524D().m31538f(string, "android_qr_scanner", false);
        }
        m41452e(string);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m41449b(String str, boolean z10) {
        if (z10) {
            C7635f.m31524D().m31543k(str);
        } else {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "InvalidQr");
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m41451d(@NonNull ActivityC4831q activityC4831q) {
        FragmentManager fragmentManagerM23360l1 = activityC4831q.m23360l1();
        if (!(fragmentManagerM23360l1.m4444n0("CustomCaptureFragment") instanceof C10887c)) {
            return false;
        }
        C6124q.m27057b("QrCodeScanner", "handleOnBackPressed: Return 'Cancel' using an empty Url.");
        fragmentManagerM23360l1.m4416a1();
        m41452e("");
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m41452e(final String str) {
        C6124q.m27057b("QrCodeScanner", "handleUrlString: " + str);
        if (TextUtils.isEmpty(str)) {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "Cancelled");
        } else {
            C7635f.m31524D().m31548p(str, new C7635f.k() { // from class: rj.e
                @Override // km.C7635f.k
                /* JADX INFO: renamed from: a */
                public final void mo31562a(boolean z10) {
                    C10890f.m41449b(str, z10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m41453f(@NonNull ActivityC4831q activityC4831q, int i10) {
        C6124q.m27063h("QrCodeScanner", "showFragmentInActivity: containerViewId = " + i10);
        MlKitContext.initializeIfNeeded(activityC4831q.getApplicationContext());
        C10887c c10887cM41441d2 = C10887c.m41441d2("content/fonts/BuilderSans-Medium.otf");
        if (C11659h.m43403a().mo43490M1()) {
            activityC4831q.mo23043Q().m23077d(c10887cM41441d2, new a(true, activityC4831q));
        }
        final FragmentManager fragmentManagerM23360l1 = activityC4831q.m23360l1();
        fragmentManagerM23360l1.m4452r().m4775b(i10, c10887cM41441d2, "CustomCaptureFragment").m4779f(null).mo4508g();
        fragmentManagerM23360l1.m4460t1("QrCode_requestKey", activityC4831q, new InterfaceC4810f0() { // from class: rj.d
            @Override // p093e4.InterfaceC4810f0
            /* JADX INFO: renamed from: a */
            public final void mo4490a(String str, Bundle bundle) {
                C10890f.m41448a(fragmentManagerM23360l1, str, bundle);
            }
        });
    }
}
