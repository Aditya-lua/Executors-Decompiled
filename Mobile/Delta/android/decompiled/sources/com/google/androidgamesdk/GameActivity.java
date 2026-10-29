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
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.j;
import androidx.core.view.o0;
import androidx.core.view.y;
import com.google.androidgamesdk.gametextinput.InputConnection;
import com.google.androidgamesdk.gametextinput.State;
import dalvik.system.BaseDexClassLoader;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class GameActivity extends j.b implements SurfaceHolder.Callback2, fe.a, y, ViewTreeObserver.OnGlobalLayoutListener {
    public static GameActivity O;
    public static long P;
    public int E;
    public EditorInfo F;
    public d H;
    public SurfaceHolder I;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean G = false;
    public final int[] J = new int[2];

    public class a implements View.OnCapturedPointerListener {
        public a() {
        }

        @Override // android.view.View.OnCapturedPointerListener
        public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
            return GameActivity.this.N1(motionEvent);
        }
    }

    public class b implements View.OnGenericMotionListener {
        public b() {
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            return GameActivity.this.N1(motionEvent);
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return GameActivity.this.N1(motionEvent);
        }
    }

    public class d extends SurfaceView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InputConnection f8385a;

        public d(GameActivity gameActivity) {
            super(gameActivity);
            EditorInfo editorInfoG1 = gameActivity.G1();
            this.f8385a = new InputConnection(gameActivity, this, new fe.b(editorInfoG1, editorInfoG1.inputType == 0)).setListener(gameActivity);
        }

        @Override // android.view.View
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            if (!this.f8385a.getSoftKeyboardActive()) {
                return null;
            }
            if (editorInfo != null) {
                com.google.androidgamesdk.gametextinput.a.a(this.f8385a.getEditorInfo(), editorInfo);
            }
            return this.f8385a;
        }

        public EditorInfo getEditorInfo() {
            return this.f8385a.getEditorInfo();
        }

        public void setEditorInfo(EditorInfo editorInfo) {
            this.f8385a.setEditorInfo(editorInfo);
        }
    }

    public static String F1(File file) {
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    @Override // fe.a
    public void B(State state, boolean z10) {
        if (H1()) {
            return;
        }
        onTextInputEventNative(P, state);
    }

    public d E1() {
        return new d(this);
    }

    public EditorInfo G1() {
        if (this.F == null) {
            EditorInfo editorInfo = new EditorInfo();
            this.F = editorInfo;
            editorInfo.inputType = 1;
            editorInfo.actionId = 6;
            editorInfo.imeOptions = 33554438;
        }
        return this.F;
    }

    @Override // fe.a
    public void H(int i10) {
        if (H1()) {
            return;
        }
        onEditorActionNative(P, i10);
    }

    public final boolean H1() {
        return O != this;
    }

    public final boolean I1(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat == null) {
            return false;
        }
        return windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
    }

    public void J1() {
        d dVarE1 = E1();
        this.H = dVarE1;
        if (dVarE1 == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        int iK = o0.k();
        this.E = iK;
        frameLayout.setId(iK);
        frameLayout.addView(this.H);
        setContentView(frameLayout);
        this.H.getHolder().addCallback(this);
        o0.A0(this.H, this);
    }

    @Override // androidx.core.view.y
    public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
        if (H1()) {
            return windowInsetsCompat;
        }
        K1(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()));
        boolean zI1 = I1(windowInsetsCompat);
        if (zI1 != this.G) {
            this.G = zI1;
            M1(zI1);
        }
        onWindowInsetsChangedNative(P);
        view.onApplyWindowInsets(windowInsetsCompat.toWindowInsets());
        return windowInsetsCompat;
    }

    public void K1(Insets insets) {
        Log.v("GameActivity", "onImeInsetsChanged from Text Listener");
    }

    public void L1() {
        getWindow().setFormat(4);
        getWindow().setSoftInputMode(16);
    }

    public void M1(boolean z10) {
        if (H1()) {
            return;
        }
        onSoftwareKeyboardVisibilityChangedNative(P, z10);
    }

    public boolean N1(MotionEvent motionEvent) {
        if (H1()) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        return onTouchEventNative(P, motionEvent, motionEvent.getPointerCount(), motionEvent.getHistorySize(), motionEvent.getDeviceId(), motionEvent.getSource(), motionEvent.getAction(), motionEvent.getEventTime(), motionEvent.getDownTime(), motionEvent.getFlags(), motionEvent.getMetaState(), motionEvent.getActionButton(), motionEvent.getButtonState(), i10 >= 29 ? motionEvent.getClassification() : 0, motionEvent.getEdgeFlags(), motionEvent.getXPrecision(), motionEvent.getYPrecision());
    }

    public native String getDlError();

    @Keep
    public Insets getWaterfallInsets() {
        j displayCutout;
        WindowInsetsCompat windowInsetsCompatF = o0.F(this.H);
        if (windowInsetsCompatF == null || (displayCutout = windowInsetsCompatF.getDisplayCutout()) == null) {
            return null;
        }
        return displayCutout.e();
    }

    @Keep
    public Insets getWindowInsets(int i10) {
        Insets insets;
        WindowInsetsCompat windowInsetsCompatF = o0.F(this.H);
        if (windowInsetsCompatF == null || (insets = windowInsetsCompatF.getInsets(i10)) == Insets.NONE) {
            return null;
        }
        return insets;
    }

    public native long initializeNativeCode(String str, String str2, String str3, AssetManager assetManager, byte[] bArr, Configuration configuration);

    @Override // j.b, e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (H1()) {
            return;
        }
        onConfigurationChangedNative(P, configuration);
    }

    public native void onConfigurationChangedNative(long j10, Configuration configuration);

    public native void onContentRectChangedNative(long j10, int i10, int i11, int i12, int i13);

    @Override // e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        PackageManager.NameNotFoundException nameNotFoundException;
        J1();
        d dVar = this.H;
        if (dVar != null) {
            dVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
        L1();
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
            long j10 = P;
            if (j10 != 0) {
                terminateNativeCode(j10);
            }
            long jInitializeNativeCode = initializeNativeCode(F1(getFilesDir()), F1(getObbDir()), F1(file), getAssets(), byteArray, getResources().getConfiguration());
            P = jInitializeNativeCode;
            O = this;
            if (jInitializeNativeCode == 0) {
                throw new UnsatisfiedLinkError("Unable to initialize native code \"" + strFindLibrary + "\": " + getDlError());
            }
            d dVar2 = this.H;
            if (dVar2 != null) {
                setInputConnectionNative(jInitializeNativeCode, dVar2.f8385a);
                this.H.setOnCapturedPointerListener(new a());
                this.H.setOnGenericMotionListener(new b());
                this.H.setOnTouchListener(new c());
            }
            super.onCreate(bundle);
        } catch (PackageManager.NameNotFoundException e11) {
            nameNotFoundException = e11;
        }
    }

    @Override // j.b, e4.q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (H1()) {
            return;
        }
        O = null;
        if (this.I != null) {
            onSurfaceDestroyedNative(P);
            this.I = null;
        }
        terminateNativeCode(P);
        P = 0L;
    }

    public native void onEditorActionNative(long j10, int i10);

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (H1()) {
            return;
        }
        this.H.getLocationInWindow(this.J);
        int width = this.H.getWidth();
        int height = this.H.getHeight();
        int[] iArr = this.J;
        int i10 = iArr[0];
        if (i10 == this.K && iArr[1] == this.L && width == this.M && height == this.N) {
            return;
        }
        this.K = i10;
        int i11 = iArr[1];
        this.L = i11;
        this.M = width;
        this.N = height;
        onContentRectChangedNative(P, i10, i11, width, height);
    }

    @Override // j.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (H1()) {
            return false;
        }
        if (onKeyDownNative(P, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public native boolean onKeyDownNative(long j10, KeyEvent keyEvent);

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (H1()) {
            return false;
        }
        if (onKeyUpNative(P, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public native boolean onKeyUpNative(long j10, KeyEvent keyEvent);

    @Override // e4.q, android.app.Activity
    public void onPause() {
        super.onPause();
        if (H1()) {
            return;
        }
        onPauseNative(P);
    }

    public native void onPauseNative(long j10);

    @Override // e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        if (H1()) {
            return;
        }
        onResumeNative(P);
    }

    public native void onResumeNative(long j10);

    @Override // e.p, k2.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        byte[] bArrOnSaveInstanceStateNative;
        super.onSaveInstanceState(bundle);
        if (H1() || (bArrOnSaveInstanceStateNative = onSaveInstanceStateNative(P)) == null) {
            return;
        }
        bundle.putByteArray("android:native_state", bArrOnSaveInstanceStateNative);
    }

    public native byte[] onSaveInstanceStateNative(long j10);

    public native void onSoftwareKeyboardVisibilityChangedNative(long j10, boolean z10);

    @Override // j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        if (H1()) {
            return;
        }
        onStartNative(P);
    }

    public native void onStartNative(long j10);

    @Override // j.b, e4.q, android.app.Activity
    public void onStop() {
        super.onStop();
        if (H1()) {
            return;
        }
        onStopNative(P);
    }

    public native void onStopNative(long j10);

    public native void onSurfaceChangedNative(long j10, Surface surface, int i10, int i11, int i12);

    public native void onSurfaceCreatedNative(long j10, Surface surface);

    public native void onSurfaceDestroyedNative(long j10);

    public native void onSurfaceRedrawNeededNative(long j10, Surface surface);

    public native void onTextInputEventNative(long j10, State state);

    public native boolean onTouchEventNative(long j10, MotionEvent motionEvent, int i10, int i11, int i12, int i13, int i14, long j11, long j12, int i15, int i16, int i17, int i18, int i19, int i20, float f10, float f11);

    @Override // e.p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (H1()) {
            return;
        }
        onTrimMemoryNative(P, i10);
    }

    public native void onTrimMemoryNative(long j10, int i10);

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        d dVar;
        super.onWindowFocusChanged(z10);
        if (H1()) {
            return;
        }
        onWindowFocusChangedNative(P, z10);
        if (!z10 || (dVar = this.H) == null) {
            return;
        }
        dVar.setFocusableInTouchMode(true);
        this.H.requestFocus();
    }

    public native void onWindowFocusChangedNative(long j10, boolean z10);

    public native void onWindowInsetsChangedNative(long j10);

    @Keep
    public void setImeEditorInfo(EditorInfo editorInfo) {
        this.F = editorInfo;
        this.H.f8385a.setEditorInfo(editorInfo);
    }

    @Keep
    public void setImeEditorInfoFields(int i10, int i11, int i12) {
        EditorInfo editorInfoG1 = G1();
        editorInfoG1.inputType = i10;
        editorInfoG1.actionId = i11;
        editorInfoG1.imeOptions = i12;
        this.H.f8385a.setEditorInfo(editorInfoG1);
    }

    public native void setInputConnectionNative(long j10, InputConnection inputConnection);

    @Keep
    public void setWindowFlags(int i10, int i11) {
        getWindow().setFlags(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (H1()) {
            return;
        }
        this.I = surfaceHolder;
        onSurfaceChangedNative(P, surfaceHolder.getSurface(), i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (H1()) {
            return;
        }
        this.I = surfaceHolder;
        onSurfaceCreatedNative(P, surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (H1()) {
            return;
        }
        this.I = null;
        onSurfaceDestroyedNative(P);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        if (H1()) {
            return;
        }
        this.I = surfaceHolder;
        onSurfaceRedrawNeededNative(P, surfaceHolder.getSurface());
    }

    public native void terminateNativeCode(long j10);
}
