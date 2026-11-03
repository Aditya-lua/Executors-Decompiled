package p5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import n2.h;
import n2.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c extends e implements Animatable {
    public C0499c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f28449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArgbEvaluator f28450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f28451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animator.AnimatorListener f28452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<p5.b> f28453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable.Callback f28454h;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f28453g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p5.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f28453g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p5.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: p5.c$c, reason: collision with other inner class name */
    public static class C0499c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28457a;
        public f b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AnimatorSet f28458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<Animator> f28459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public w1.a<Animator, String> f28460e;

        public C0499c(Context context, C0499c c0499c, Drawable.Callback callback, Resources resources) {
            if (c0499c != null) {
                this.f28457a = c0499c.f28457a;
                f fVar = c0499c.b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.b = (f) constantState.newDrawable(resources);
                    } else {
                        this.b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.b.mutate();
                    this.b = fVar2;
                    fVar2.setCallback(callback);
                    this.b.setBounds(c0499c.b.getBounds());
                    this.b.g(false);
                }
                ArrayList<Animator> arrayList = c0499c.f28459d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f28459d = new ArrayList<>(size);
                    this.f28460e = new w1.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c0499c.f28459d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = c0499c.f28460e.get(animator);
                        animatorClone.setTarget(this.b.c(str));
                        this.f28459d.add(animatorClone);
                        this.f28460e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f28458c == null) {
                this.f28458c = new AnimatorSet();
            }
            this.f28458c.playTogether(this.f28459d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28457a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this(null, null, null);
    }

    public static c a(@NonNull Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableE = h.e(context.getResources(), i10, context.getTheme());
        cVar.f28462a = drawableE;
        drawableE.setCallback(cVar.f28454h);
        cVar.f28451e = new d(cVar.f28462a.getConstantState());
        return cVar;
    }

    public static void c(@NonNull AnimatedVectorDrawable animatedVectorDrawable, @NonNull p5.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    public static boolean g(AnimatedVectorDrawable animatedVectorDrawable, p5.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.a(drawable, theme);
        }
    }

    public void b(@NonNull p5.b bVar) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f28453g == null) {
            this.f28453g = new ArrayList<>();
        }
        if (this.f28453g.contains(bVar)) {
            return;
        }
        this.f28453g.add(bVar);
        if (this.f28452f == null) {
            this.f28452f = new b();
        }
        this.b.f28458c.addListener(this.f28452f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            return q2.a.b(drawable);
        }
        return false;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d() {
        Animator.AnimatorListener animatorListener = this.f28452f;
        if (animatorListener != null) {
            this.b.f28458c.removeListener(animatorListener);
            this.f28452f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.b.b.draw(canvas);
        if (this.b.f28458c.isStarted()) {
            invalidateSelf();
        }
    }

    public final void e(String str, Animator animator) {
        animator.setTarget(this.b.b.c(str));
        C0499c c0499c = this.b;
        if (c0499c.f28459d == null) {
            c0499c.f28459d = new ArrayList<>();
            this.b.f28460e = new w1.a<>();
        }
        this.b.f28459d.add(animator);
        this.b.f28460e.put(animator, str);
    }

    public boolean f(@NonNull p5.b bVar) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<p5.b> arrayList = this.f28453g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f28453g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f28462a;
        return drawable != null ? q2.a.d(drawable) : this.b.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.f28457a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f28462a;
        return drawable != null ? q2.a.e(drawable) : this.b.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f28462a != null) {
            return new d(this.f28462a.getConstantState());
        }
        return null;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.b.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.b.b.getIntrinsicWidth();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.getOpacity() : this.b.b.getOpacity();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.f28439e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f28454h);
                        f fVar = this.b.b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.b.b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, p5.a.f28440f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f28449c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, p5.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f28462a;
        return drawable != null ? q2.a.h(drawable) : this.b.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f28462a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.b.f28458c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.isStateful() : this.b.b.isStateful();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.b.setBounds(rect);
        }
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.setLevel(i10) : this.b.b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.setState(iArr) : this.b.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.b.b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.j(drawable, z10);
        } else {
            this.b.b.setAutoMirrored(z10);
        }
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.n(drawable, i10);
        } else {
            this.b.b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
        } else {
            this.b.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.p(drawable, mode);
        } else {
            this.b.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.b.b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.b.f28458c.isStarted()) {
                return;
            }
            this.b.f28458c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.f28458c.end();
        }
    }

    public c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.b.setColorFilter(colorFilter);
        }
    }

    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f28461a;

        public d(Drawable.ConstantState constantState) {
            this.f28461a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f28461a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28461a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f28461a.newDrawable();
            cVar.f28462a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f28454h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f28461a.newDrawable(resources);
            cVar.f28462a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f28454h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f28461a.newDrawable(resources, theme);
            cVar.f28462a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f28454h);
            return cVar;
        }
    }

    public c(Context context, C0499c c0499c, Resources resources) {
        this.f28450d = null;
        this.f28452f = null;
        this.f28453g = null;
        a aVar = new a();
        this.f28454h = aVar;
        this.f28449c = context;
        if (c0499c != null) {
            this.b = c0499c;
        } else {
            this.b = new C0499c(context, c0499c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
