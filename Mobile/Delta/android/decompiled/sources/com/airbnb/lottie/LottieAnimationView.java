package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import f7.h0;
import f7.i;
import f7.i0;
import f7.l0;
import f7.n0;
import f7.o0;
import f7.p0;
import f7.s0;
import f7.u0;
import f7.v0;
import f7.w0;
import f7.x0;
import f7.y0;
import f7.z0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import q.q;
import s7.m;
import t7.e;

/* JADX INFO: loaded from: classes3.dex */
public class LottieAnimationView extends q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f5093q = "LottieAnimationView";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l0<Throwable> f5094r = new l0() { // from class: f7.g
        @Override // f7.l0
        public final void onResult(Object obj) {
            LottieAnimationView.d((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0<i> f5095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0<Throwable> f5096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0<Throwable> f5097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f5099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set<b> f5105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<n0> f5106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s0<i> f5107p;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5108a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f5109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f5111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5113g;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f5108a);
            parcel.writeFloat(this.f5109c);
            parcel.writeInt(this.f5110d ? 1 : 0);
            parcel.writeString(this.f5111e);
            parcel.writeInt(this.f5112f);
            parcel.writeInt(this.f5113g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5108a = parcel.readString();
            this.f5109c = parcel.readFloat();
            this.f5110d = parcel.readInt() == 1;
            this.f5111e = parcel.readString();
            this.f5112f = parcel.readInt();
            this.f5113g = parcel.readInt();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends t7.c<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f5114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f5115e;

        public a(LottieAnimationView lottieAnimationView, e eVar) {
            this.f5114d = eVar;
            this.f5115e = lottieAnimationView;
        }

        @Override // t7.c
        public T a(t7.b<T> bVar) {
            return (T) this.f5114d.a(bVar);
        }
    }

    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static class c implements l0<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f5122a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f5122a = new WeakReference<>(lottieAnimationView);
        }

        @Override // f7.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f5122a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f5098g != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f5098g);
            }
            (lottieAnimationView.f5097f == null ? LottieAnimationView.f5094r : lottieAnimationView.f5097f).onResult(th2);
        }
    }

    public static class d implements l0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f5123a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f5123a = new WeakReference<>(lottieAnimationView);
        }

        @Override // f7.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(i iVar) {
            LottieAnimationView lottieAnimationView = this.f5123a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(iVar);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5095d = new d(this);
        this.f5096e = new c(this);
        this.f5098g = 0;
        this.f5099h = new h0();
        this.f5102k = false;
        this.f5103l = false;
        this.f5104m = true;
        this.f5105n = new HashSet();
        this.f5106o = new HashSet();
        s(attributeSet, v0.f17065a);
    }

    public static /* synthetic */ p0 c(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f5104m ? f7.q.l(lottieAnimationView.getContext(), str) : f7.q.m(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th2) {
        if (!m.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        s7.e.d("Unable to load composition.", th2);
    }

    public static /* synthetic */ p0 e(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f5104m ? f7.q.x(lottieAnimationView.getContext(), i10) : f7.q.y(lottieAnimationView.getContext(), i10, null);
    }

    private void setCompositionTask(s0<i> s0Var) {
        p0<i> p0VarE = s0Var.e();
        h0 h0Var = this.f5099h;
        if (p0VarE != null && h0Var == getDrawable() && h0Var.J() == p0VarE.b()) {
            return;
        }
        this.f5105n.add(b.SET_ANIMATION);
        o();
        n();
        this.f5107p = s0Var.d(this.f5095d).c(this.f5096e);
    }

    public final void A() {
        boolean zT = t();
        setImageDrawable(null);
        setImageDrawable(this.f5099h);
        if (zT) {
            this.f5099h.o0();
        }
    }

    public final void B(float f10, boolean z10) {
        if (z10) {
            this.f5105n.add(b.SET_PROGRESS);
        }
        this.f5099h.O0(f10);
    }

    public f7.a getAsyncUpdates() {
        return this.f5099h.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f5099h.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f5099h.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f5099h.I();
    }

    public i getComposition() {
        Drawable drawable = getDrawable();
        h0 h0Var = this.f5099h;
        if (drawable == h0Var) {
            return h0Var.J();
        }
        return null;
    }

    public long getDuration() {
        i composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f5099h.M();
    }

    public String getImageAssetsFolder() {
        return this.f5099h.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f5099h.Q();
    }

    public float getMaxFrame() {
        return this.f5099h.S();
    }

    public float getMinFrame() {
        return this.f5099h.T();
    }

    public u0 getPerformanceTracker() {
        return this.f5099h.U();
    }

    public float getProgress() {
        return this.f5099h.V();
    }

    public x0 getRenderMode() {
        return this.f5099h.W();
    }

    public int getRepeatCount() {
        return this.f5099h.X();
    }

    public int getRepeatMode() {
        return this.f5099h.Y();
    }

    public float getSpeed() {
        return this.f5099h.Z();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f5099h.q(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof h0) && ((h0) drawable).W() == x0.SOFTWARE) {
            this.f5099h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        h0 h0Var = this.f5099h;
        if (drawable2 == h0Var) {
            super.invalidateDrawable(h0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(@NonNull n0 n0Var) {
        i composition = getComposition();
        if (composition != null) {
            n0Var.a(composition);
        }
        return this.f5106o.add(n0Var);
    }

    public <T> void k(l7.e eVar, T t8, t7.c<T> cVar) {
        this.f5099h.r(eVar, t8, cVar);
    }

    public <T> void l(l7.e eVar, T t8, e<T> eVar2) {
        this.f5099h.r(eVar, t8, new a(this, eVar2));
    }

    public void m() {
        this.f5103l = false;
        this.f5105n.add(b.PLAY_OPTION);
        this.f5099h.u();
    }

    public final void n() {
        s0<i> s0Var = this.f5107p;
        if (s0Var != null) {
            s0Var.k(this.f5095d);
            this.f5107p.j(this.f5096e);
        }
    }

    public final void o() {
        this.f5099h.v();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f5103l) {
            return;
        }
        this.f5099h.j0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5100i = savedState.f5108a;
        Set<b> set = this.f5105n;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f5100i)) {
            setAnimation(this.f5100i);
        }
        this.f5101j = savedState.b;
        if (!this.f5105n.contains(bVar) && (i10 = this.f5101j) != 0) {
            setAnimation(i10);
        }
        if (!this.f5105n.contains(b.SET_PROGRESS)) {
            B(savedState.f5109c, false);
        }
        if (!this.f5105n.contains(b.PLAY_OPTION) && savedState.f5110d) {
            v();
        }
        if (!this.f5105n.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f5111e);
        }
        if (!this.f5105n.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f5112f);
        }
        if (this.f5105n.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f5113g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5108a = this.f5100i;
        savedState.b = this.f5101j;
        savedState.f5109c = this.f5099h.V();
        savedState.f5110d = this.f5099h.e0();
        savedState.f5111e = this.f5099h.O();
        savedState.f5112f = this.f5099h.Y();
        savedState.f5113g = this.f5099h.X();
        return savedState;
    }

    public void p(boolean z10) {
        this.f5099h.A(i0.MergePathsApi19, z10);
    }

    public final s0<i> q(final String str) {
        if (isInEditMode()) {
            return new s0<>(new Callable() { // from class: f7.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.c(this.f16951a, str);
                }
            }, true);
        }
        return this.f5104m ? f7.q.j(getContext(), str) : f7.q.k(getContext(), str, null);
    }

    public final s0<i> r(final int i10) {
        if (isInEditMode()) {
            return new s0<>(new Callable() { // from class: f7.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.e(this.f16954a, i10);
                }
            }, true);
        }
        return this.f5104m ? f7.q.v(getContext(), i10) : f7.q.w(getContext(), i10, null);
    }

    public final void s(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w0.f17068a, i10, 0);
        this.f5104m = typedArrayObtainStyledAttributes.getBoolean(w0.f17072f, true);
        int i11 = w0.f17084r;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        int i12 = w0.f17079m;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = w0.f17089w;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i13);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i12);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i13)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(w0.f17078l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(w0.f17071e, false)) {
            this.f5103l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(w0.f17082p, false)) {
            this.f5099h.Q0(-1);
        }
        int i14 = w0.f17087u;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = w0.f17086t;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = w0.f17088v;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i16, 1.0f));
        }
        int i17 = w0.f17074h;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i17, true));
        }
        int i18 = w0.f17073g;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i18, false));
        }
        int i19 = w0.f17076j;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i19));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(w0.f17081o));
        int i20 = w0.f17083q;
        B(typedArrayObtainStyledAttributes.getFloat(i20, 0.0f), typedArrayObtainStyledAttributes.hasValue(i20));
        p(typedArrayObtainStyledAttributes.getBoolean(w0.f17077k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(w0.b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(w0.f17069c, true));
        int i21 = w0.f17075i;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            k(new l7.e("**"), o0.K, new t7.c(new y0(k.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(i21, -1)).getDefaultColor())));
        }
        int i22 = w0.f17085s;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            x0 x0Var = x0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i22, x0Var.ordinal());
            if (iOrdinal >= x0.values().length) {
                iOrdinal = x0Var.ordinal();
            }
            setRenderMode(x0.values()[iOrdinal]);
        }
        int i23 = w0.f17070d;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            f7.a aVar = f7.a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i23, aVar.ordinal());
            if (iOrdinal2 >= x0.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(f7.a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(w0.f17080n, false));
        int i24 = w0.f17090x;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i24, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAnimation(int i10) {
        this.f5101j = i10;
        this.f5100i = null;
        setCompositionTask(r(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f5104m ? f7.q.z(getContext(), str) : f7.q.A(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f5099h.q0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f5099h.r0(z10);
    }

    public void setAsyncUpdates(f7.a aVar) {
        this.f5099h.s0(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f5104m = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f5099h.t0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f5099h.u0(z10);
    }

    public void setComposition(@NonNull i iVar) {
        if (f7.e.f16940a) {
            Log.v(f5093q, "Set Composition \n" + iVar);
        }
        this.f5099h.setCallback(this);
        this.f5102k = true;
        boolean zV0 = this.f5099h.v0(iVar);
        if (this.f5103l) {
            this.f5099h.j0();
        }
        this.f5102k = false;
        if (getDrawable() != this.f5099h || zV0) {
            if (!zV0) {
                A();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<n0> it = this.f5106o.iterator();
            while (it.hasNext()) {
                it.next().a(iVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f5099h.w0(str);
    }

    public void setFailureListener(l0<Throwable> l0Var) {
        this.f5097f = l0Var;
    }

    public void setFallbackResource(int i10) {
        this.f5098g = i10;
    }

    public void setFontAssetDelegate(f7.b bVar) {
        this.f5099h.x0(bVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f5099h.y0(map);
    }

    public void setFrame(int i10) {
        this.f5099h.z0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f5099h.A0(z10);
    }

    public void setImageAssetDelegate(f7.c cVar) {
        this.f5099h.B0(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f5099h.C0(str);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f5101j = 0;
        this.f5100i = null;
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f5101j = 0;
        this.f5100i = null;
        n();
        super.setImageDrawable(drawable);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f5101j = 0;
        this.f5100i = null;
        n();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f5099h.D0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f5099h.E0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f5099h.G0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5099h.I0(str);
    }

    public void setMinFrame(int i10) {
        this.f5099h.J0(i10);
    }

    public void setMinProgress(float f10) {
        this.f5099h.L0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f5099h.M0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f5099h.N0(z10);
    }

    public void setProgress(float f10) {
        B(f10, true);
    }

    public void setRenderMode(x0 x0Var) {
        this.f5099h.P0(x0Var);
    }

    public void setRepeatCount(int i10) {
        this.f5105n.add(b.SET_REPEAT_COUNT);
        this.f5099h.Q0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f5105n.add(b.SET_REPEAT_MODE);
        this.f5099h.R0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f5099h.S0(z10);
    }

    public void setSpeed(float f10) {
        this.f5099h.T0(f10);
    }

    public void setTextDelegate(z0 z0Var) {
        this.f5099h.U0(z0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f5099h.V0(z10);
    }

    public boolean t() {
        return this.f5099h.d0();
    }

    public void u() {
        this.f5103l = false;
        this.f5099h.i0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        h0 h0Var;
        if (!this.f5102k && drawable == (h0Var = this.f5099h) && h0Var.d0()) {
            u();
        } else if (!this.f5102k && (drawable instanceof h0)) {
            h0 h0Var2 = (h0) drawable;
            if (h0Var2.d0()) {
                h0Var2.i0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f5105n.add(b.PLAY_OPTION);
        this.f5099h.j0();
    }

    public void w() {
        this.f5099h.k0();
    }

    public void x() {
        this.f5099h.l0();
    }

    public void y(InputStream inputStream, String str) {
        setCompositionTask(f7.q.o(inputStream, str));
    }

    public void z(String str, String str2) {
        y(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f5099h.F0(str);
    }

    public void setMinFrame(String str) {
        this.f5099h.K0(str);
    }

    public void setAnimation(String str) {
        this.f5100i = str;
        this.f5101j = 0;
        setCompositionTask(q(str));
    }
}
