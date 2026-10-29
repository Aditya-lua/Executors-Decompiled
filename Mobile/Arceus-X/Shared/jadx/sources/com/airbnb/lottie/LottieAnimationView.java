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
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p121f7.C5438b;
import p121f7.C5444e;
import p121f7.C5451h0;
import p121f7.C5452i;
import p121f7.C5467p0;
import p121f7.C5468q;
import p121f7.C5473s0;
import p121f7.C5477u0;
import p121f7.C5479v0;
import p121f7.C5481w0;
import p121f7.C5485y0;
import p121f7.C5487z0;
import p121f7.EnumC5436a;
import p121f7.EnumC5453i0;
import p121f7.EnumC5483x0;
import p121f7.InterfaceC5440c;
import p121f7.InterfaceC5459l0;
import p121f7.InterfaceC5463n0;
import p121f7.InterfaceC5465o0;
import p232k.C7399a;
import p266l7.C8006e;
import p365q.C10395q;
import p431s7.C11189e;
import p431s7.C11197m;
import p444t7.C11551b;
import p444t7.C11552c;
import p444t7.InterfaceC11554e;

/* JADX INFO: loaded from: classes3.dex */
public class LottieAnimationView extends C10395q {

    /* JADX INFO: renamed from: q */
    public static final String f6548q = "LottieAnimationView";

    /* JADX INFO: renamed from: r */
    public static final InterfaceC5459l0<Throwable> f6549r = new InterfaceC5459l0() { // from class: f7.g
        @Override // p121f7.InterfaceC5459l0
        public final void onResult(Object obj) {
            LottieAnimationView.m8414d((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: d */
    public final InterfaceC5459l0<C5452i> f6550d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5459l0<Throwable> f6551e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5459l0<Throwable> f6552f;

    /* JADX INFO: renamed from: g */
    public int f6553g;

    /* JADX INFO: renamed from: h */
    public final C5451h0 f6554h;

    /* JADX INFO: renamed from: i */
    public String f6555i;

    /* JADX INFO: renamed from: j */
    public int f6556j;

    /* JADX INFO: renamed from: k */
    public boolean f6557k;

    /* JADX INFO: renamed from: l */
    public boolean f6558l;

    /* JADX INFO: renamed from: m */
    public boolean f6559m;

    /* JADX INFO: renamed from: n */
    public final Set<EnumC1742b> f6560n;

    /* JADX INFO: renamed from: o */
    public final Set<InterfaceC5463n0> f6561o;

    /* JADX INFO: renamed from: p */
    public C5473s0<C5452i> f6562p;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1740a();

        /* JADX INFO: renamed from: a */
        public String f6563a;

        /* JADX INFO: renamed from: b */
        public int f6564b;

        /* JADX INFO: renamed from: c */
        public float f6565c;

        /* JADX INFO: renamed from: d */
        public boolean f6566d;

        /* JADX INFO: renamed from: e */
        public String f6567e;

        /* JADX INFO: renamed from: f */
        public int f6568f;

        /* JADX INFO: renamed from: g */
        public int f6569g;

        /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        public class C1740a implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.os.Parcel) A[MD:(android.os.Parcel):void (m)] (LINE:1) call: com.airbnb.lottie.LottieAnimationView.SavedState.<init>(android.os.Parcel):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ SavedState(Parcel parcel, C1741a c1741a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6563a);
            parcel.writeFloat(this.f6565c);
            parcel.writeInt(this.f6566d ? 1 : 0);
            parcel.writeString(this.f6567e);
            parcel.writeInt(this.f6568f);
            parcel.writeInt(this.f6569g);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6563a = parcel.readString();
            this.f6565c = parcel.readFloat();
            this.f6566d = parcel.readInt() == 1;
            this.f6567e = parcel.readString();
            this.f6568f = parcel.readInt();
            this.f6569g = parcel.readInt();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C1741a<T> extends C11552c<T> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC11554e f6570d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LottieAnimationView f6571e;

        public C1741a(LottieAnimationView lottieAnimationView, InterfaceC11554e interfaceC11554e) {
            this.f6570d = interfaceC11554e;
            this.f6571e = lottieAnimationView;
        }

        @Override // p444t7.C11552c
        /* JADX INFO: renamed from: a */
        public T mo8441a(C11551b<T> c11551b) {
            return (T) this.f6570d.mo25902a(c11551b);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public enum EnumC1742b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public static class C1743c implements InterfaceC5459l0<Throwable> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<LottieAnimationView> f6579a;

        public C1743c(LottieAnimationView lottieAnimationView) {
            this.f6579a = new WeakReference<>(lottieAnimationView);
        }

        /* JADX DEBUG: Method merged with bridge method: onResult(Ljava/lang/Object;)V */
        @Override // p121f7.InterfaceC5459l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f6579a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f6553g != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f6553g);
            }
            (lottieAnimationView.f6552f == null ? LottieAnimationView.f6549r : lottieAnimationView.f6552f).onResult(th2);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$d */
    public static class C1744d implements InterfaceC5459l0<C5452i> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<LottieAnimationView> f6580a;

        public C1744d(LottieAnimationView lottieAnimationView) {
            this.f6580a = new WeakReference<>(lottieAnimationView);
        }

        /* JADX DEBUG: Method merged with bridge method: onResult(Ljava/lang/Object;)V */
        @Override // p121f7.InterfaceC5459l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C5452i c5452i) {
            LottieAnimationView lottieAnimationView = this.f6580a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c5452i);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6550d = new C1744d(this);
        this.f6551e = new C1743c(this);
        this.f6553g = 0;
        this.f6554h = new C5451h0();
        this.f6557k = false;
        this.f6558l = false;
        this.f6559m = true;
        this.f6560n = new HashSet();
        this.f6561o = new HashSet();
        m8431s(attributeSet, C5479v0.f21221a);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap boolean:0x0000: IGET (r1v0 com.airbnb.lottie.LottieAnimationView) A[WRAPPED] com.airbnb.lottie.LottieAnimationView.m boolean) != false) ? (wrap f7.p0<f7.i>:0x0008: INVOKE 
      (wrap android.content.Context:0x0004: INVOKE (r1v0 com.airbnb.lottie.LottieAnimationView) VIRTUAL call: android.view.View.getContext():android.content.Context A[MD:():android.content.Context (c), WRAPPED])
      (r2v0 java.lang.String)
     STATIC call: f7.q.l(android.content.Context, java.lang.String):f7.p0 A[MD:(android.content.Context, java.lang.String):f7.p0<f7.i> (m), WRAPPED]) : (wrap f7.p0<f7.i>:0x0012: INVOKE 
      (wrap android.content.Context:0x000d: INVOKE (r1v0 com.airbnb.lottie.LottieAnimationView) VIRTUAL call: android.view.View.getContext():android.content.Context A[MD:():android.content.Context (c), WRAPPED])
      (r2v0 java.lang.String)
      (null java.lang.String)
     STATIC call: f7.q.m(android.content.Context, java.lang.String, java.lang.String):f7.p0 A[MD:(android.content.Context, java.lang.String, java.lang.String):f7.p0<f7.i> (m), WRAPPED]) */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C5467p0 m8413c(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f6559m ? C5468q.m25094l(lottieAnimationView.getContext(), str) : C5468q.m25095m(lottieAnimationView.getContext(), str, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8414d(Throwable th2) {
        if (!C11197m.m42222k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        C11189e.m42154d("Unable to load composition.", th2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap boolean:0x0000: IGET (r1v0 com.airbnb.lottie.LottieAnimationView) A[WRAPPED] com.airbnb.lottie.LottieAnimationView.m boolean) != false) ? (wrap f7.p0<f7.i>:0x0008: INVOKE 
      (wrap android.content.Context:0x0004: INVOKE (r1v0 com.airbnb.lottie.LottieAnimationView) VIRTUAL call: android.view.View.getContext():android.content.Context A[MD:():android.content.Context (c), WRAPPED])
      (r2v0 int)
     STATIC call: f7.q.x(android.content.Context, int):f7.p0 A[MD:(android.content.Context, int):f7.p0<f7.i> (m), WRAPPED]) : (wrap f7.p0<f7.i>:0x0012: INVOKE 
      (wrap android.content.Context:0x000d: INVOKE (r1v0 com.airbnb.lottie.LottieAnimationView) VIRTUAL call: android.view.View.getContext():android.content.Context A[MD:():android.content.Context (c), WRAPPED])
      (r2v0 int)
      (null java.lang.String)
     STATIC call: f7.q.y(android.content.Context, int, java.lang.String):f7.p0 A[MD:(android.content.Context, int, java.lang.String):f7.p0<f7.i> (m), WRAPPED]) */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C5467p0 m8415e(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f6559m ? C5468q.m25106x(lottieAnimationView.getContext(), i10) : C5468q.m25107y(lottieAnimationView.getContext(), i10, null);
    }

    private void setCompositionTask(C5473s0<C5452i> c5473s0) {
        C5467p0<C5452i> c5467p0M25113e = c5473s0.m25113e();
        C5451h0 c5451h0 = this.f6554h;
        if (c5467p0M25113e != null && c5451h0 == getDrawable() && c5451h0.m24966J() == c5467p0M25113e.m25072b()) {
            return;
        }
        this.f6560n.add(EnumC1742b.SET_ANIMATION);
        m8427o();
        m8426n();
        this.f6562p = c5473s0.m25112d(this.f6550d).m25111c(this.f6551e);
    }

    /* JADX INFO: renamed from: A */
    public final void m8419A() {
        boolean zM8432t = m8432t();
        setImageDrawable(null);
        setImageDrawable(this.f6554h);
        if (zM8432t) {
            this.f6554h.m25012o0();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8420B(float f10, boolean z10) {
        if (z10) {
            this.f6560n.add(EnumC1742b.SET_PROGRESS);
        }
        this.f6554h.m24977O0(f10);
    }

    public EnumC5436a getAsyncUpdates() {
        return this.f6554h.m24956E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f6554h.m24958F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f6554h.m24962H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f6554h.m24964I();
    }

    public C5452i getComposition() {
        Drawable drawable = getDrawable();
        C5451h0 c5451h0 = this.f6554h;
        if (drawable == c5451h0) {
            return c5451h0.m24966J();
        }
        return null;
    }

    public long getDuration() {
        C5452i composition = getComposition();
        if (composition != null) {
            return (long) composition.m25038d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f6554h.m24972M();
    }

    public String getImageAssetsFolder() {
        return this.f6554h.m24976O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f6554h.m24980Q();
    }

    public float getMaxFrame() {
        return this.f6554h.m24984S();
    }

    public float getMinFrame() {
        return this.f6554h.m24986T();
    }

    public C5477u0 getPerformanceTracker() {
        return this.f6554h.m24988U();
    }

    public float getProgress() {
        return this.f6554h.m24990V();
    }

    public EnumC5483x0 getRenderMode() {
        return this.f6554h.m24992W();
    }

    public int getRepeatCount() {
        return this.f6554h.m24994X();
    }

    public int getRepeatMode() {
        return this.f6554h.m24996Y();
    }

    public float getSpeed() {
        return this.f6554h.m24997Z();
    }

    /* JADX INFO: renamed from: i */
    public void m8421i(Animator.AnimatorListener animatorListener) {
        this.f6554h.m25014q(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C5451h0) && ((C5451h0) drawable).m24992W() == EnumC5483x0.SOFTWARE) {
            this.f6554h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C5451h0 c5451h0 = this.f6554h;
        if (drawable2 == c5451h0) {
            super.invalidateDrawable(c5451h0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m8422j(@NonNull InterfaceC5463n0 interfaceC5463n0) {
        C5452i composition = getComposition();
        if (composition != null) {
            interfaceC5463n0.mo21732a(composition);
        }
        return this.f6561o.add(interfaceC5463n0);
    }

    /* JADX INFO: renamed from: k */
    public <T> void m8423k(C8006e c8006e, T t8, C11552c<T> c11552c) {
        this.f6554h.m25016r(c8006e, t8, c11552c);
    }

    /* JADX INFO: renamed from: l */
    public <T> void m8424l(C8006e c8006e, T t8, InterfaceC11554e<T> interfaceC11554e) {
        this.f6554h.m25016r(c8006e, t8, new C1741a(this, interfaceC11554e));
    }

    /* JADX INFO: renamed from: m */
    public void m8425m() {
        this.f6558l = false;
        this.f6560n.add(EnumC1742b.PLAY_OPTION);
        this.f6554h.m25022u();
    }

    /* JADX INFO: renamed from: n */
    public final void m8426n() {
        C5473s0<C5452i> c5473s0 = this.f6562p;
        if (c5473s0 != null) {
            c5473s0.m25119k(this.f6550d);
            this.f6562p.m25118j(this.f6551e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8427o() {
        this.f6554h.m25024v();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f6558l) {
            return;
        }
        this.f6554h.m25007j0();
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
        this.f6555i = savedState.f6563a;
        Set<EnumC1742b> set = this.f6560n;
        EnumC1742b enumC1742b = EnumC1742b.SET_ANIMATION;
        if (!set.contains(enumC1742b) && !TextUtils.isEmpty(this.f6555i)) {
            setAnimation(this.f6555i);
        }
        this.f6556j = savedState.f6564b;
        if (!this.f6560n.contains(enumC1742b) && (i10 = this.f6556j) != 0) {
            setAnimation(i10);
        }
        if (!this.f6560n.contains(EnumC1742b.SET_PROGRESS)) {
            m8420B(savedState.f6565c, false);
        }
        if (!this.f6560n.contains(EnumC1742b.PLAY_OPTION) && savedState.f6566d) {
            m8434v();
        }
        if (!this.f6560n.contains(EnumC1742b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f6567e);
        }
        if (!this.f6560n.contains(EnumC1742b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f6568f);
        }
        if (this.f6560n.contains(EnumC1742b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f6569g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6563a = this.f6555i;
        savedState.f6564b = this.f6556j;
        savedState.f6565c = this.f6554h.m24990V();
        savedState.f6566d = this.f6554h.m25002e0();
        savedState.f6567e = this.f6554h.m24976O();
        savedState.f6568f = this.f6554h.m24996Y();
        savedState.f6569g = this.f6554h.m24994X();
        return savedState;
    }

    /* JADX INFO: renamed from: p */
    public void m8428p(boolean z10) {
        this.f6554h.m24948A(EnumC5453i0.MergePathsApi19, z10);
    }

    /* JADX INFO: renamed from: q */
    public final C5473s0<C5452i> m8429q(final String str) {
        if (isInEditMode()) {
            return new C5473s0<>(new Callable() { // from class: f7.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m8413c(this.f21044a, str);
                }
            }, true);
        }
        return this.f6559m ? C5468q.m25092j(getContext(), str) : C5468q.m25093k(getContext(), str, null);
    }

    /* JADX INFO: renamed from: r */
    public final C5473s0<C5452i> m8430r(final int i10) {
        if (isInEditMode()) {
            return new C5473s0<>(new Callable() { // from class: f7.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m8415e(this.f21050a, i10);
                }
            }, true);
        }
        return this.f6559m ? C5468q.m25104v(getContext(), i10) : C5468q.m25105w(getContext(), i10, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m8431s(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5481w0.f21225a, i10, 0);
        this.f6559m = typedArrayObtainStyledAttributes.getBoolean(C5481w0.f21230f, true);
        int i11 = C5481w0.f21242r;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        int i12 = C5481w0.f21237m;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = C5481w0.f21247w;
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
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(C5481w0.f21236l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(C5481w0.f21229e, false)) {
            this.f6558l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C5481w0.f21240p, false)) {
            this.f6554h.m24981Q0(-1);
        }
        int i14 = C5481w0.f21245u;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = C5481w0.f21244t;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = C5481w0.f21246v;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i16, 1.0f));
        }
        int i17 = C5481w0.f21232h;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i17, true));
        }
        int i18 = C5481w0.f21231g;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i18, false));
        }
        int i19 = C5481w0.f21234j;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i19));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(C5481w0.f21239o));
        int i20 = C5481w0.f21241q;
        m8420B(typedArrayObtainStyledAttributes.getFloat(i20, 0.0f), typedArrayObtainStyledAttributes.hasValue(i20));
        m8428p(typedArrayObtainStyledAttributes.getBoolean(C5481w0.f21235k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(C5481w0.f21226b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(C5481w0.f21227c, true));
        int i21 = C5481w0.f21233i;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            m8423k(new C8006e("**"), InterfaceC5465o0.f21155K, new C11552c(new C5485y0(C7399a.m30678a(getContext(), typedArrayObtainStyledAttributes.getResourceId(i21, -1)).getDefaultColor())));
        }
        int i22 = C5481w0.f21243s;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            EnumC5483x0 enumC5483x0 = EnumC5483x0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i22, enumC5483x0.ordinal());
            if (iOrdinal >= EnumC5483x0.values().length) {
                iOrdinal = enumC5483x0.ordinal();
            }
            setRenderMode(EnumC5483x0.values()[iOrdinal]);
        }
        int i23 = C5481w0.f21228d;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            EnumC5436a enumC5436a = EnumC5436a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i23, enumC5436a.ordinal());
            if (iOrdinal2 >= EnumC5483x0.values().length) {
                iOrdinal2 = enumC5436a.ordinal();
            }
            setAsyncUpdates(EnumC5436a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(C5481w0.f21238n, false));
        int i24 = C5481w0.f21248x;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i24, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAnimation(int i10) {
        this.f6556j = i10;
        this.f6555i = null;
        setCompositionTask(m8430r(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m8438z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f6559m ? C5468q.m25108z(getContext(), str) : C5468q.m25073A(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f6554h.m25015q0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f6554h.m25017r0(z10);
    }

    public void setAsyncUpdates(EnumC5436a enumC5436a) {
        this.f6554h.m25019s0(enumC5436a);
    }

    public void setCacheComposition(boolean z10) {
        this.f6559m = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f6554h.m25021t0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f6554h.m25023u0(z10);
    }

    public void setComposition(@NonNull C5452i c5452i) {
        if (C5444e.f21031a) {
            Log.v(f6548q, "Set Composition \n" + c5452i);
        }
        this.f6554h.setCallback(this);
        this.f6557k = true;
        boolean zM25025v0 = this.f6554h.m25025v0(c5452i);
        if (this.f6558l) {
            this.f6554h.m25007j0();
        }
        this.f6557k = false;
        if (getDrawable() != this.f6554h || zM25025v0) {
            if (!zM25025v0) {
                m8419A();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<InterfaceC5463n0> it = this.f6561o.iterator();
            while (it.hasNext()) {
                it.next().mo21732a(c5452i);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f6554h.m25027w0(str);
    }

    public void setFailureListener(InterfaceC5459l0<Throwable> interfaceC5459l0) {
        this.f6552f = interfaceC5459l0;
    }

    public void setFallbackResource(int i10) {
        this.f6553g = i10;
    }

    public void setFontAssetDelegate(C5438b c5438b) {
        this.f6554h.m25029x0(c5438b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f6554h.m25031y0(map);
    }

    public void setFrame(int i10) {
        this.f6554h.m25033z0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f6554h.m24949A0(z10);
    }

    public void setImageAssetDelegate(InterfaceC5440c interfaceC5440c) {
        this.f6554h.m24951B0(interfaceC5440c);
    }

    public void setImageAssetsFolder(String str) {
        this.f6554h.m24953C0(str);
    }

    @Override // p365q.C10395q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f6556j = 0;
        this.f6555i = null;
        m8426n();
        super.setImageBitmap(bitmap);
    }

    @Override // p365q.C10395q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f6556j = 0;
        this.f6555i = null;
        m8426n();
        super.setImageDrawable(drawable);
    }

    @Override // p365q.C10395q, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f6556j = 0;
        this.f6555i = null;
        m8426n();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f6554h.m24955D0(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxFrame(int i10) {
        this.f6554h.m24957E0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f6554h.m24961G0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f6554h.m24965I0(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinFrame(int i10) {
        this.f6554h.m24967J0(i10);
    }

    public void setMinProgress(float f10) {
        this.f6554h.m24971L0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f6554h.m24973M0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f6554h.m24975N0(z10);
    }

    public void setProgress(float f10) {
        m8420B(f10, true);
    }

    public void setRenderMode(EnumC5483x0 enumC5483x0) {
        this.f6554h.m24979P0(enumC5483x0);
    }

    public void setRepeatCount(int i10) {
        this.f6560n.add(EnumC1742b.SET_REPEAT_COUNT);
        this.f6554h.m24981Q0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f6560n.add(EnumC1742b.SET_REPEAT_MODE);
        this.f6554h.m24983R0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f6554h.m24985S0(z10);
    }

    public void setSpeed(float f10) {
        this.f6554h.m24987T0(f10);
    }

    public void setTextDelegate(C5487z0 c5487z0) {
        this.f6554h.m24989U0(c5487z0);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f6554h.m24991V0(z10);
    }

    /* JADX INFO: renamed from: t */
    public boolean m8432t() {
        return this.f6554h.m25001d0();
    }

    /* JADX INFO: renamed from: u */
    public void m8433u() {
        this.f6558l = false;
        this.f6554h.m25006i0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C5451h0 c5451h0;
        if (!this.f6557k && drawable == (c5451h0 = this.f6554h) && c5451h0.m25001d0()) {
            m8433u();
        } else if (!this.f6557k && (drawable instanceof C5451h0)) {
            C5451h0 c5451h1 = (C5451h0) drawable;
            if (c5451h1.m25001d0()) {
                c5451h1.m25006i0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* JADX INFO: renamed from: v */
    public void m8434v() {
        this.f6560n.add(EnumC1742b.PLAY_OPTION);
        this.f6554h.m25007j0();
    }

    /* JADX INFO: renamed from: w */
    public void m8435w() {
        this.f6554h.m25008k0();
    }

    /* JADX INFO: renamed from: x */
    public void m8436x() {
        this.f6554h.m25009l0();
    }

    /* JADX INFO: renamed from: y */
    public void m8437y(InputStream inputStream, String str) {
        setCompositionTask(C5468q.m25097o(inputStream, str));
    }

    /* JADX INFO: renamed from: z */
    public void m8438z(String str, String str2) {
        m8437y(new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setMaxFrame(String str) {
        this.f6554h.m24959F0(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setMinFrame(String str) {
        this.f6554h.m24969K0(str);
    }

    public void setAnimation(String str) {
        this.f6555i = str;
        this.f6556j = 0;
        setCompositionTask(m8429q(str));
    }
}
