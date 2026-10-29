package com.google.androidgamesdk;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.core.graphics.Insets;
import androidx.core.view.C0611j;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import com.google.androidgamesdk.gametextinput.C2898a;
import com.google.androidgamesdk.gametextinput.InputConnection;
import com.google.androidgamesdk.gametextinput.State;
import dalvik.system.BaseDexClassLoader;
import ge.C6091b;
import ge.InterfaceC6090a;
import java.io.File;
import p203j.ActivityC6992b;

/* JADX INFO: loaded from: classes2.dex */
public class GameActivity extends ActivityC6992b implements SurfaceHolder.Callback2, InterfaceC6090a, InterfaceC0644y, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: O */
    public static GameActivity f10774O;

    /* JADX INFO: renamed from: P */
    public static long f10775P;

    /* JADX INFO: renamed from: E */
    public int f10776E;

    /* JADX INFO: renamed from: F */
    public EditorInfo f10777F;

    /* JADX INFO: renamed from: H */
    public C2895d f10779H;

    /* JADX INFO: renamed from: I */
    public SurfaceHolder f10780I;

    /* JADX INFO: renamed from: K */
    public int f10782K;

    /* JADX INFO: renamed from: L */
    public int f10783L;

    /* JADX INFO: renamed from: M */
    public int f10784M;

    /* JADX INFO: renamed from: N */
    public int f10785N;

    /* JADX INFO: renamed from: G */
    public boolean f10778G = false;

    /* JADX INFO: renamed from: J */
    public final int[] f10781J = new int[2];

    /* JADX INFO: renamed from: com.google.androidgamesdk.GameActivity$a */
    public class ViewOnCapturedPointerListenerC2892a implements View.OnCapturedPointerListener {
        public ViewOnCapturedPointerListenerC2892a() {
        }

        @Override // android.view.View.OnCapturedPointerListener
        public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
            return GameActivity.this.m13366N1(motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.androidgamesdk.GameActivity$b */
    public class ViewOnGenericMotionListenerC2893b implements View.OnGenericMotionListener {
        public ViewOnGenericMotionListenerC2893b() {
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            return GameActivity.this.m13366N1(motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.androidgamesdk.GameActivity$c */
    public class ViewOnTouchListenerC2894c implements View.OnTouchListener {
        public ViewOnTouchListenerC2894c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return GameActivity.this.m13366N1(motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.androidgamesdk.GameActivity$d */
    public class C2895d extends SurfaceView {

        /* JADX INFO: renamed from: a */
        public InputConnection f10789a;

        public C2895d(GameActivity gameActivity) {
            super(gameActivity);
            EditorInfo editorInfoM13358G1 = gameActivity.m13358G1();
            this.f10789a = new InputConnection(gameActivity, this, new C6091b(editorInfoM13358G1, editorInfoM13358G1.inputType == 0)).setListener(gameActivity);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
        @Override // android.view.View
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            if (!this.f10789a.getSoftKeyboardActive()) {
                return null;
            }
            if (editorInfo != null) {
                C2898a.m13368a(this.f10789a.getEditorInfo(), editorInfo);
            }
            return this.f10789a;
        }

        public EditorInfo getEditorInfo() {
            return this.f10789a.getEditorInfo();
        }

        public void setEditorInfo(EditorInfo editorInfo) {
            this.f10789a.setEditorInfo(editorInfo);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public static String m13355F1(File file) {
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    @Override // ge.InterfaceC6090a
    /* JADX INFO: renamed from: B */
    public void mo13356B(State state, boolean z10) {
        if (m13360H1()) {
            return;
        }
        onTextInputEventNative(f10775P, state);
    }

    /* JADX INFO: renamed from: E1 */
    public C2895d m13357E1() {
        return new C2895d(this);
    }

    /* JADX INFO: renamed from: G1 */
    public EditorInfo m13358G1() {
        if (this.f10777F == null) {
            EditorInfo editorInfo = new EditorInfo();
            this.f10777F = editorInfo;
            editorInfo.inputType = 1;
            editorInfo.actionId = 6;
            editorInfo.imeOptions = 33554438;
        }
        return this.f10777F;
    }

    @Override // ge.InterfaceC6090a
    /* JADX INFO: renamed from: H */
    public void mo13359H(int i10) {
        if (m13360H1()) {
            return;
        }
        onEditorActionNative(f10775P, i10);
    }

    /* JADX INFO: renamed from: H1 */
    public final boolean m13360H1() {
        return f10774O != this;
    }

    /* JADX INFO: renamed from: I1 */
    public final boolean m13361I1(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat == null) {
            return false;
        }
        return windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
    }

    /* JADX INFO: renamed from: J1 */
    public void m13362J1() {
        C2895d c2895dM13357E1 = m13357E1();
        this.f10779H = c2895dM13357E1;
        if (c2895dM13357E1 == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        int iM3035k = C0625o0.m3035k();
        this.f10776E = iM3035k;
        frameLayout.setId(iM3035k);
        frameLayout.addView(this.f10779H);
        setContentView(frameLayout);
        this.f10779H.getHolder().addCallback(this);
        C0625o0.m2979A0(this.f10779H, this);
    }

    @Override // androidx.core.view.InterfaceC0644y
    /* JADX INFO: renamed from: K */
    public WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
        if (m13360H1()) {
            return windowInsetsCompat;
        }
        m13363K1(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()));
        boolean zM13361I1 = m13361I1(windowInsetsCompat);
        if (zM13361I1 != this.f10778G) {
            this.f10778G = zM13361I1;
            m13365M1(zM13361I1);
        }
        onWindowInsetsChangedNative(f10775P);
        view.onApplyWindowInsets(windowInsetsCompat.toWindowInsets());
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: K1 */
    public void m13363K1(Insets insets) {
        Log.v("GameActivity", "onImeInsetsChanged from Text Listener");
    }

    /* JADX INFO: renamed from: L1 */
    public void m13364L1() {
        getWindow().setFormat(4);
        getWindow().setSoftInputMode(16);
    }

    /* JADX INFO: renamed from: M1 */
    public void m13365M1(boolean z10) {
        if (m13360H1()) {
            return;
        }
        onSoftwareKeyboardVisibilityChangedNative(f10775P, z10);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m13366N1(MotionEvent motionEvent) {
        if (m13360H1()) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        return onTouchEventNative(f10775P, motionEvent, motionEvent.getPointerCount(), motionEvent.getHistorySize(), motionEvent.getDeviceId(), motionEvent.getSource(), motionEvent.getAction(), motionEvent.getEventTime(), motionEvent.getDownTime(), motionEvent.getFlags(), motionEvent.getMetaState(), motionEvent.getActionButton(), motionEvent.getButtonState(), i10 >= 29 ? motionEvent.getClassification() : 0, motionEvent.getEdgeFlags(), motionEvent.getXPrecision(), motionEvent.getYPrecision());
    }

    public native String getDlError();

    @Keep
    public Insets getWaterfallInsets() {
        C0611j displayCutout;
        WindowInsetsCompat windowInsetsCompatM2988F = C0625o0.m2988F(this.f10779H);
        if (windowInsetsCompatM2988F == null || (displayCutout = windowInsetsCompatM2988F.getDisplayCutout()) == null) {
            return null;
        }
        return displayCutout.m2921e();
    }

    @Keep
    public Insets getWindowInsets(int i10) {
        Insets insets;
        WindowInsetsCompat windowInsetsCompatM2988F = C0625o0.m2988F(this.f10779H);
        if (windowInsetsCompatM2988F == null || (insets = windowInsetsCompatM2988F.getInsets(i10)) == Insets.NONE) {
            return null;
        }
        return insets;
    }

    public native long initializeNativeCode(String str, String str2, String str3, AssetManager assetManager, byte[] bArr, Configuration configuration);

    @Override // p203j.ActivityC6992b, p088e.ActivityC4722p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m13360H1()) {
            return;
        }
        onConfigurationChangedNative(f10775P, configuration);
    }

    public native void onConfigurationChangedNative(long j10, Configuration configuration);

    public native void onContentRectChangedNative(long j10, int i10, int i11, int i12, int i13);

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        PackageManager.NameNotFoundException nameNotFoundException;
        m13362J1();
        C2895d c2895d = this.f10779H;
        if (c2895d != null) {
            c2895d.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
        m13364L1();
        String str = new String("main");
        try {
            Bundle bundle2 = getPackageManager().getActivityInfo(getIntent().getComponent(), 128).metaData;
            if (bundle2 != null) {
                try {
                    String string = bundle2.getString("android.app.lib_name");
                    if (string != null) {
                        str = string;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    nameNotFoundException = e10;
                    throw new RuntimeException("Error getting activity info", nameNotFoundException);
                }
            }
            String str2 = "lib" + str + ".so";
            Log.i("GameActivity", "Looking for library " + str2);
            BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) getClassLoader();
            String strFindLibrary = baseDexClassLoader.findLibrary(str);
            if (strFindLibrary != null) {
                Log.i("GameActivity", "Found library " + str2 + ". Loading...");
                System.loadLibrary(str);
            } else {
                if (!str.equals("main")) {
                    throw new IllegalArgumentException("unable to find native library " + str2 + " using classloader: " + baseDexClassLoader.toString());
                }
                Log.i("GameActivity", "Application should have loaded the native library " + str2 + " explicitly by now. ");
            }
            File file = null;
            byte[] byteArray = bundle != null ? bundle.getByteArray("android:native_state") : null;
            File[] externalFilesDirs = getExternalFilesDirs(null);
            if (externalFilesDirs != null && externalFilesDirs.length > 0) {
                file = externalFilesDirs[0];
            }
            long j10 = f10775P;
            if (j10 != 0) {
                terminateNativeCode(j10);
            }
            long jInitializeNativeCode = initializeNativeCode(m13355F1(getFilesDir()), m13355F1(getObbDir()), m13355F1(file), getAssets(), byteArray, getResources().getConfiguration());
            f10775P = jInitializeNativeCode;
            f10774O = this;
            if (jInitializeNativeCode == 0) {
                throw new UnsatisfiedLinkError("Unable to initialize native code \"" + strFindLibrary + "\": " + getDlError());
            }
            C2895d c2895d2 = this.f10779H;
            if (c2895d2 != null) {
                setInputConnectionNative(jInitializeNativeCode, c2895d2.f10789a);
                this.f10779H.setOnCapturedPointerListener(new ViewOnCapturedPointerListenerC2892a());
                this.f10779H.setOnGenericMotionListener(new ViewOnGenericMotionListenerC2893b());
                this.f10779H.setOnTouchListener(new ViewOnTouchListenerC2894c());
            }
            super.onCreate(bundle);
        } catch (PackageManager.NameNotFoundException e11) {
            nameNotFoundException = e11;
        }
    }

    @Override // p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (m13360H1()) {
            return;
        }
        f10774O = null;
        if (this.f10780I != null) {
            onSurfaceDestroyedNative(f10775P);
            this.f10780I = null;
        }
        terminateNativeCode(f10775P);
        f10775P = 0L;
    }

    public native void onEditorActionNative(long j10, int i10);

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (m13360H1()) {
            return;
        }
        this.f10779H.getLocationInWindow(this.f10781J);
        int width = this.f10779H.getWidth();
        int height = this.f10779H.getHeight();
        int[] iArr = this.f10781J;
        int i10 = iArr[0];
        if (i10 == this.f10782K && iArr[1] == this.f10783L && width == this.f10784M && height == this.f10785N) {
            return;
        }
        this.f10782K = i10;
        int i11 = iArr[1];
        this.f10783L = i11;
        this.f10784M = width;
        this.f10785N = height;
        onContentRectChangedNative(f10775P, i10, i11, width, height);
    }

    @Override // p203j.ActivityC6992b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (m13360H1()) {
            return false;
        }
        if (onKeyDownNative(f10775P, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public native boolean onKeyDownNative(long j10, KeyEvent keyEvent);

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (m13360H1()) {
            return false;
        }
        if (onKeyUpNative(f10775P, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public native boolean onKeyUpNative(long j10, KeyEvent keyEvent);

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onPause() {
        super.onPause();
        if (m13360H1()) {
            return;
        }
        onPauseNative(f10775P);
    }

    public native void onPauseNative(long j10);

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m13360H1()) {
            return;
        }
        onResumeNative(f10775P);
    }

    public native void onResumeNative(long j10);

    @Override // p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        byte[] bArrOnSaveInstanceStateNative;
        super.onSaveInstanceState(bundle);
        if (m13360H1() || (bArrOnSaveInstanceStateNative = onSaveInstanceStateNative(f10775P)) == null) {
            return;
        }
        bundle.putByteArray("android:native_state", bArrOnSaveInstanceStateNative);
    }

    public native byte[] onSaveInstanceStateNative(long j10);

    public native void onSoftwareKeyboardVisibilityChangedNative(long j10, boolean z10);

    @Override // p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        if (m13360H1()) {
            return;
        }
        onStartNative(f10775P);
    }

    public native void onStartNative(long j10);

    @Override // p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStop() {
        super.onStop();
        if (m13360H1()) {
            return;
        }
        onStopNative(f10775P);
    }

    public native void onStopNative(long j10);

    public native void onSurfaceChangedNative(long j10, Surface surface, int i10, int i11, int i12);

    public native void onSurfaceCreatedNative(long j10, Surface surface);

    public native void onSurfaceDestroyedNative(long j10);

    public native void onSurfaceRedrawNeededNative(long j10, Surface surface);

    public native void onTextInputEventNative(long j10, State state);

    public native boolean onTouchEventNative(long j10, MotionEvent motionEvent, int i10, int i11, int i12, int i13, int i14, long j11, long j12, int i15, int i16, int i17, int i18, int i19, int i20, float f10, float f11);

    @Override // p088e.ActivityC4722p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (m13360H1()) {
            return;
        }
        onTrimMemoryNative(f10775P, i10);
    }

    public native void onTrimMemoryNative(long j10, int i10);

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        C2895d c2895d;
        super.onWindowFocusChanged(z10);
        if (m13360H1()) {
            return;
        }
        onWindowFocusChangedNative(f10775P, z10);
        if (!z10 || (c2895d = this.f10779H) == null) {
            return;
        }
        c2895d.setFocusableInTouchMode(true);
        this.f10779H.requestFocus();
    }

    public native void onWindowFocusChangedNative(long j10, boolean z10);

    public native void onWindowInsetsChangedNative(long j10);

    @Keep
    public void setImeEditorInfo(EditorInfo editorInfo) {
        this.f10777F = editorInfo;
        this.f10779H.f10789a.setEditorInfo(editorInfo);
    }

    @Keep
    public void setImeEditorInfoFields(int i10, int i11, int i12) {
        EditorInfo editorInfoM13358G1 = m13358G1();
        editorInfoM13358G1.inputType = i10;
        editorInfoM13358G1.actionId = i11;
        editorInfoM13358G1.imeOptions = i12;
        this.f10779H.f10789a.setEditorInfo(editorInfoM13358G1);
    }

    public native void setInputConnectionNative(long j10, InputConnection inputConnection);

    @Keep
    public void setWindowFlags(int i10, int i11) {
        getWindow().setFlags(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (m13360H1()) {
            return;
        }
        this.f10780I = surfaceHolder;
        onSurfaceChangedNative(f10775P, surfaceHolder.getSurface(), i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (m13360H1()) {
            return;
        }
        this.f10780I = surfaceHolder;
        onSurfaceCreatedNative(f10775P, surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (m13360H1()) {
            return;
        }
        this.f10780I = null;
        onSurfaceDestroyedNative(f10775P);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        if (m13360H1()) {
            return;
        }
        this.f10780I = surfaceHolder;
        onSurfaceRedrawNeededNative(f10775P, surfaceHolder.getSurface());
    }

    public native void terminateNativeCode(long j10);
}
