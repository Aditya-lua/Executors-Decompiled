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
import g7.h0;
import g7.i;
import g7.i0;
import g7.l0;
import g7.n0;
import g7.o0;
import g7.p0;
import g7.s0;
import g7.u0;
import g7.v0;
import g7.w0;
import g7.x0;
import g7.y0;
import g7.z0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import q.q;
import t7.m;

/* JADX INFO: loaded from: classes3.dex */
public class LottieAnimationView extends q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f5536q = "LottieAnimationView";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l0<Throwable> f5537r = new l0() { // from class: g7.g
        @Override // g7.l0
        public final void onResult(Object obj) {
            LottieAnimationView.d((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0<i> f5538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0<Throwable> f5539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0<Throwable> f5540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f5542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set<c> f5548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<n0> f5549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s0<i> f5550p;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends u7.c<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u7.e f5551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f5552e;

        public a(LottieAnimationView lottieAnimationView, u7.e eVar) {
            this.f5551d = eVar;
            this.f5552e = lottieAnimationView;
        }

        @Override // u7.c
        public T a(u7.b<T> bVar) {
            return (T) this.f5551d.a(bVar);
        }
    }

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5553a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f5554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f5556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5558g;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f5553a);
            parcel.writeFloat(this.f5554c);
            parcel.writeInt(this.f5555d ? 1 : 0);
            parcel.writeString(this.f5556e);
            parcel.writeInt(this.f5557f);
            parcel.writeInt(this.f5558g);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f5553a = parcel.readString();
            this.f5554c = parcel.readFloat();
            this.f5555d = parcel.readInt() == 1;
            this.f5556e = parcel.readString();
            this.f5557f = parcel.readInt();
            this.f5558g = parcel.readInt();
        }
    }

    public enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static class d implements l0<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f5565a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f5565a = new WeakReference<>(lottieAnimationView);
        }

        @Override // g7.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f5565a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f5541g != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f5541g);
            }
            (lottieAnimationView.f5540f == null ? LottieAnimationView.f5537r : lottieAnimationView.f5540f).onResult(th2);
        }
    }

    public static class e implements l0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f5566a;

        public e(LottieAnimationView lottieAnimationView) {
            this.f5566a = new WeakReference<>(lottieAnimationView);
        }

        @Override // g7.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(i iVar) {
            LottieAnimationView lottieAnimationView = this.f5566a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(iVar);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5538d = new e(this);
        this.f5539e = new d(this);
        this.f5541g = 0;
        this.f5542h = new h0();
        this.f5545k = false;
        this.f5546l = false;
        this.f5547m = true;
        this.f5548n = new HashSet();
        this.f5549o = new HashSet();
        s(attributeSet, v0.f17548a);
    }

    public static /* synthetic */ p0 c(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f5547m ? g7.q.l(lottieAnimationView.getContext(), str) : g7.q.m(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th2) {
        if (!m.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        t7.e.d("Unable to load composition.", th2);
    }

    public static /* synthetic */ p0 e(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f5547m ? g7.q.x(lottieAnimationView.getContext(), i10) : g7.q.y(lottieAnimationView.getContext(), i10, null);
    }

    private void setCompositionTask(s0<i> s0Var) {
        p0<i> p0VarE = s0Var.e();
        h0 h0Var = this.f5542h;
        if (p0VarE != null && h0Var == getDrawable() && h0Var.J() == p0VarE.b()) {
            return;
        }
        this.f5548n.add(c.SET_ANIMATION);
        o();
        n();
        this.f5550p = s0Var.d(this.f5538d).c(this.f5539e);
    }

    public final void A() {
        boolean zT = t();
        setImageDrawable(null);
        setImageDrawable(this.f5542h);
        if (zT) {
            this.f5542h.o0();
        }
    }

    public final void B(float f10, boolean z10) {
        if (z10) {
            this.f5548n.add(c.SET_PROGRESS);
        }
        this.f5542h.O0(f10);
    }

    public g7.a getAsyncUpdates() {
        return this.f5542h.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f5542h.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f5542h.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f5542h.I();
    }

    public i getComposition() {
        Drawable drawable = getDrawable();
        h0 h0Var = this.f5542h;
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
        return this.f5542h.M();
    }

    public String getImageAssetsFolder() {
        return this.f5542h.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f5542h.Q();
    }

    public float getMaxFrame() {
        return this.f5542h.S();
    }

    public float getMinFrame() {
        return this.f5542h.T();
    }

    public u0 getPerformanceTracker() {
        return this.f5542h.U();
    }

    public float getProgress() {
        return this.f5542h.V();
    }

    public x0 getRenderMode() {
        return this.f5542h.W();
    }

    public int getRepeatCount() {
        return this.f5542h.X();
    }

    public int getRepeatMode() {
        return this.f5542h.Y();
    }

    public float getSpeed() {
        return this.f5542h.Z();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f5542h.q(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof h0) && ((h0) drawable).W() == x0.SOFTWARE) {
            this.f5542h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        h0 h0Var = this.f5542h;
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
        return this.f5549o.add(n0Var);
    }

    public <T> void k(m7.e eVar, T t8, u7.c<T> cVar) {
        this.f5542h.r(eVar, t8, cVar);
    }

    public <T> void l(m7.e eVar, T t8, u7.e<T> eVar2) {
        this.f5542h.r(eVar, t8, new a(this, eVar2));
    }

    public void m() {
        this.f5546l = false;
        this.f5548n.add(c.PLAY_OPTION);
        this.f5542h.u();
    }

    public final void n() {
        s0<i> s0Var = this.f5550p;
        if (s0Var != null) {
            s0Var.k(this.f5538d);
            this.f5550p.j(this.f5539e);
        }
    }

    public final void o() {
        this.f5542h.v();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f5546l) {
            return;
        }
        this.f5542h.j0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f5543i = bVar.f5553a;
        Set<c> set = this.f5548n;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f5543i)) {
            setAnimation(this.f5543i);
        }
        this.f5544j = bVar.b;
        if (!this.f5548n.contains(cVar) && (i10 = this.f5544j) != 0) {
            setAnimation(i10);
        }
        if (!this.f5548n.contains(c.SET_PROGRESS)) {
            B(bVar.f5554c, false);
        }
        if (!this.f5548n.contains(c.PLAY_OPTION) && bVar.f5555d) {
            v();
        }
        if (!this.f5548n.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f5556e);
        }
        if (!this.f5548n.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.f5557f);
        }
        if (this.f5548n.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bVar.f5558g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f5553a = this.f5543i;
        bVar.b = this.f5544j;
        bVar.f5554c = this.f5542h.V();
        bVar.f5555d = this.f5542h.e0();
        bVar.f5556e = this.f5542h.O();
        bVar.f5557f = this.f5542h.Y();
        bVar.f5558g = this.f5542h.X();
        return bVar;
    }

    public void p(boolean z10) {
        this.f5542h.A(i0.MergePathsApi19, z10);
    }

    public final s0<i> q(final String str) {
        if (isInEditMode()) {
            return new s0<>(new Callable() { // from class: g7.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.c(this.f17434a, str);
                }
            }, true);
        }
        return this.f5547m ? g7.q.j(getContext(), str) : g7.q.k(getContext(), str, null);
    }

    public final s0<i> r(final int i10) {
        if (isInEditMode()) {
            return new s0<>(new Callable() { // from class: g7.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.e(this.f17437a, i10);
                }
            }, true);
        }
        return this.f5547m ? g7.q.v(getContext(), i10) : g7.q.w(getContext(), i10, null);
    }

    public final void s(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w0.f17551a, i10, 0);
        this.f5547m = typedArrayObtainStyledAttributes.getBoolean(w0.f17555f, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(w0.f17567r);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(w0.f17562m);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(w0.f17572w);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(w0.f17567r, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(w0.f17562m);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(w0.f17572w)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(w0.f17561l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(w0.f17554e, false)) {
            this.f5546l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(w0.f17565p, false)) {
            this.f5542h.Q0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17570u)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(w0.f17570u, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17569t)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(w0.f17569t, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17571v)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(w0.f17571v, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17557h)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(w0.f17557h, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17556g)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(w0.f17556g, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17559j)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(w0.f17559j));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(w0.f17564o));
        B(typedArrayObtainStyledAttributes.getFloat(w0.f17566q, 0.0f), typedArrayObtainStyledAttributes.hasValue(w0.f17566q));
        p(typedArrayObtainStyledAttributes.getBoolean(w0.f17560k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(w0.b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(w0.f17552c, true));
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17558i)) {
            k(new m7.e("**"), o0.K, new u7.c(new y0(k.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(w0.f17558i, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17568s)) {
            int i11 = w0.f17568s;
            x0 x0Var = x0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i11, x0Var.ordinal());
            if (iOrdinal >= x0.values().length) {
                iOrdinal = x0Var.ordinal();
            }
            setRenderMode(x0.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17553d)) {
            int i12 = w0.f17553d;
            g7.a aVar = g7.a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i12, aVar.ordinal());
            if (iOrdinal2 >= x0.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(g7.a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(w0.f17563n, false));
        if (typedArrayObtainStyledAttributes.hasValue(w0.f17573x)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(w0.f17573x, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAnimation(int i10) {
        this.f5544j = i10;
        this.f5543i = null;
        setCompositionTask(r(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f5547m ? g7.q.z(getContext(), str) : g7.q.A(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f5542h.q0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f5542h.r0(z10);
    }

    public void setAsyncUpdates(g7.a aVar) {
        this.f5542h.s0(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f5547m = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f5542h.t0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f5542h.u0(z10);
    }

    public void setComposition(@NonNull i iVar) {
        if (g7.e.f17423a) {
            Log.v(f5536q, "Set Composition \n" + iVar);
        }
        this.f5542h.setCallback(this);
        this.f5545k = true;
        boolean zV0 = this.f5542h.v0(iVar);
        if (this.f5546l) {
            this.f5542h.j0();
        }
        this.f5545k = false;
        if (getDrawable() != this.f5542h || zV0) {
            if (!zV0) {
                A();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<n0> it = this.f5549o.iterator();
            while (it.hasNext()) {
                it.next().a(iVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f5542h.w0(str);
    }

    public void setFailureListener(l0<Throwable> l0Var) {
        this.f5540f = l0Var;
    }

    public void setFallbackResource(int i10) {
        this.f5541g = i10;
    }

    public void setFontAssetDelegate(g7.b bVar) {
        this.f5542h.x0(bVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f5542h.y0(map);
    }

    public void setFrame(int i10) {
        this.f5542h.z0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f5542h.A0(z10);
    }

    public void setImageAssetDelegate(g7.c cVar) {
        this.f5542h.B0(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f5542h.C0(str);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f5544j = 0;
        this.f5543i = null;
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f5544j = 0;
        this.f5543i = null;
        n();
        super.setImageDrawable(drawable);
    }

    @Override // q.q, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f5544j = 0;
        this.f5543i = null;
        n();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f5542h.D0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f5542h.E0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f5542h.G0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5542h.I0(str);
    }

    public void setMinFrame(int i10) {
        this.f5542h.J0(i10);
    }

    public void setMinProgress(float f10) {
        this.f5542h.L0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f5542h.M0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f5542h.N0(z10);
    }

    public void setProgress(float f10) {
        B(f10, true);
    }

    public void setRenderMode(x0 x0Var) {
        this.f5542h.P0(x0Var);
    }

    public void setRepeatCount(int i10) {
        this.f5548n.add(c.SET_REPEAT_COUNT);
        this.f5542h.Q0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f5548n.add(c.SET_REPEAT_MODE);
        this.f5542h.R0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f5542h.S0(z10);
    }

    public void setSpeed(float f10) {
        this.f5542h.T0(f10);
    }

    public void setTextDelegate(z0 z0Var) {
        this.f5542h.U0(z0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f5542h.V0(z10);
    }

    public boolean t() {
        return this.f5542h.d0();
    }

    public void u() {
        this.f5546l = false;
        this.f5542h.i0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        h0 h0Var;
        if (!this.f5545k && drawable == (h0Var = this.f5542h) && h0Var.d0()) {
            u();
        } else if (!this.f5545k && (drawable instanceof h0)) {
            h0 h0Var2 = (h0) drawable;
            if (h0Var2.d0()) {
                h0Var2.i0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f5548n.add(c.PLAY_OPTION);
        this.f5542h.j0();
    }

    public void w() {
        this.f5542h.k0();
    }

    public void x() {
        this.f5542h.l0();
    }

    public void y(InputStream inputStream, String str) {
        setCompositionTask(g7.q.o(inputStream, str));
    }

    public void z(String str, String str2) {
        y(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f5542h.F0(str);
    }

    public void setMinFrame(String str) {
        this.f5542h.K0(str);
    }

    public void setAnimation(String str) {
        this.f5543i = str;
        this.f5544j = 0;
        setCompositionTask(q(str));
    }
}
