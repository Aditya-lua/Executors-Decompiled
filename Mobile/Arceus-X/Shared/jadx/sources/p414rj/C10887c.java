package p414rj;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.AbstractC0966l;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002a1.C0054c;
import p002a1.C0055d;
import p090e1.C4744c;
import p151gk.C6109d;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7931v1;
import p348p1.C10133l;
import p533x2.InterfaceC12631a;
import sg.C11335m0;
import sg.C11338n0;
import th.C11659h;

/* JADX INFO: renamed from: rj.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, m31665d2 = {"Lrj/c;", "Landroidx/fragment/app/c;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "Lku/l0;", "mainDispatcher", "workerDispatcher", "Lp1/l;", "g2", "(Landroid/content/Context;Lku/l0;Lku/l0;)Lp1/l;", "Ljt/n;", "", "result", "f2", "(Ljava/lang/Object;)V", "f0", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10887c extends ComponentCallbacksC0929c {

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rj.c$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m31665d2 = {"Lrj/c$a;", "", "<init>", "()V", "", "fontPath", "Lrj/c;", "a", "(Ljava/lang/String;)Lrj/c;", "TAG", "Ljava/lang/String;", "FONT_PATH_MESSAGE", "RESULT_REQUEST_KEY", "BUNDLE_KEY_SUCCESS", "BUNDLE_KEY_URL_STRING", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: rj.c.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C10887c m41447a(@NotNull String fontPath) {
            Intrinsics.checkNotNullParameter(fontPath, "fontPath");
            C10887c c10887c = new C10887c();
            Bundle bundle = new Bundle();
            bundle.putString("FONT_PATH_MESSAGE", fontPath);
            c10887c.m4625O1(bundle);
            return c10887c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d2 */
    public static final C10887c m41441d2(@NotNull String str) {
        return INSTANCE.m41447a(str);
    }

    /* JADX INFO: renamed from: e2 */
    public static final void m41442e2(C10887c c10887c, View view) {
        C7347n.Companion companion = C7347n.INSTANCE;
        c10887c.m41445f2(C7347n.m30460b(C7348o.m30469a(new Exception())));
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ C10133l m41443h2(C10887c c10887c, Context context, AbstractC7888l0 abstractC7888l0, AbstractC7888l0 abstractC7888l1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC7888l0 = C7864g1.m32645c();
        }
        if ((i10 & 4) != 0) {
            abstractC7888l1 = AbstractC7888l0.m32791U(C7864g1.m32644b(), 1, null, 2, null);
        }
        return c10887c.m41446g2(context, abstractC7888l0, abstractC7888l1);
    }

    /* JADX INFO: renamed from: i2 */
    public static final void m41444i2(BarcodeScanner barcodeScanner, C10887c c10887c, C4744c.a aVar) {
        List list = (List) aVar.m23130c(barcodeScanner);
        Barcode barcode = list != null ? (Barcode) CollectionsKt.firstOrNull(list) : null;
        Throwable thM23129b = aVar.m23129b(barcodeScanner);
        if (barcode != null) {
            Log.d("CustomCaptureFrag", "Barcode scanning succeeded.");
            C7347n.Companion companion = C7347n.INSTANCE;
            String rawValue = barcode.getRawValue();
            if (rawValue == null) {
                rawValue = "";
            }
            c10887c.m41445f2(C7347n.m30460b(rawValue));
            return;
        }
        if (thM23129b == null) {
            Log.d("CustomCaptureFrag", "No barcode detected.");
            return;
        }
        Log.w("CustomCaptureFrag", "Barcode scanning failed: " + thM23129b.getMessage(), thM23129b);
        C7347n.Companion companion2 = C7347n.INSTANCE;
        c10887c.m41445f2(C7347n.m30460b(C7348o.m30469a(thM23129b)));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C11338n0.f39861h, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.findViewById(C11335m0.f39805f).setOnClickListener(new View.OnClickListener() { // from class: rj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C10887c.m41442e2(this.f38645a, view2);
            }
        });
        AssetManager assets = view.getContext().getApplicationContext().getAssets();
        Bundle bundleM4704t = m4704t();
        String string = bundleM4704t != null ? bundleM4704t.getString("FONT_PATH_MESSAGE") : null;
        if (string == null) {
            throw new IllegalStateException("FONT_PATH_MESSAGE not set");
        }
        if (C11659h.m43403a().mo43618e1()) {
            C6109d.m27018a("FONT_PATH_MESSAGE");
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assets, string);
        TextView textView = (TextView) view.findViewById(C11335m0.f39793Y);
        TextView textView2 = (TextView) view.findViewById(C11335m0.f39808g0);
        textView.setTypeface(typefaceCreateFromAsset);
        textView2.setTypeface(typefaceCreateFromAsset);
        PreviewView previewView = (PreviewView) view.findViewById(C11335m0.f39794Z);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C10133l c10133lM41443h2 = m41443h2(this, context, null, null, 6, null);
        c10133lM41443h2.m39080X(m4680k0());
        previewView.setController(c10133lM41443h2);
    }

    /* JADX INFO: renamed from: f2 */
    public final void m41445f2(Object result) {
        if (m4694p0()) {
            FragmentManager fragmentManagerM4617M = m4617M();
            Bundle bundle = new Bundle();
            bundle.putBoolean("BundleKey_success", C7347n.m30466h(result));
            if (C7347n.m30465g(result)) {
                result = null;
            }
            bundle.putString("BundleKey_urlString", (String) result);
            Unit unit = Unit.f29331a;
            fragmentManagerM4617M.m4457s1("QrCode_requestKey", bundle);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final C10133l m41446g2(Context context, AbstractC7888l0 mainDispatcher, AbstractC7888l0 workerDispatcher) {
        C10133l c10133l = new C10133l(context);
        final BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(256, new int[0]).build());
        AbstractC0966l abstractC0966lMo4656a = mo4656a();
        Intrinsics.checkNotNull(client);
        abstractC0966lMo4656a.mo4935a(client);
        Intrinsics.checkNotNullExpressionValue(client, "also(...)");
        c10133l.m39031D(C7931v1.m32924a(workerDispatcher), new C4744c(C7697o.m31878d(client), 1, C7931v1.m32924a(mainDispatcher), new InterfaceC12631a() { // from class: rj.b
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C10887c.m41444i2(client, this, (C4744c.a) obj);
            }
        }));
        c10133l.m39032E(new C0054c.a().m120f(new C0055d(new Size(1280, 720), 0)).m116a());
        return c10133l;
    }
}
