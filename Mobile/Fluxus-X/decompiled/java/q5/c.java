package q5;

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
    public C0582c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f29790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArgbEvaluator f29791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f29792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animator.AnimatorListener f29793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<q5.b> f29794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable.Callback f29795h;

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
            ArrayList arrayList = new ArrayList(c.this.f29794g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((q5.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f29794g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((q5.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: q5.c$c, reason: collision with other inner class name */
    public static class C0582c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29798a;
        public f b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AnimatorSet f29799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<Animator> f29800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public w1.a<Animator, String> f29801e;

        public C0582c(Context context, C0582c c0582c, Drawable.Callback callback, Resources resources) {
            if (c0582c != null) {
                this.f29798a = c0582c.f29798a;
                f fVar = c0582c.b;
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
                    this.b.setBounds(c0582c.b.getBounds());
                    this.b.g(false);
                }
                ArrayList<Animator> arrayList = c0582c.f29800d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f29800d = new ArrayList<>(size);
                    this.f29801e = new w1.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c0582c.f29800d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = c0582c.f29801e.get(animator);
                        animatorClone.setTarget(this.b.c(str));
                        this.f29800d.add(animatorClone);
                        this.f29801e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f29799c == null) {
                this.f29799c = new AnimatorSet();
            }
            this.f29799c.playTogether(this.f29800d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29798a;
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
        cVar.f29803a = drawableE;
        drawableE.setCallback(cVar.f29795h);
        cVar.f29792e = new d(cVar.f29803a.getConstantState());
        return cVar;
    }

    public static void c(@NonNull AnimatedVectorDrawable animatedVectorDrawable, @NonNull q5.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    public static boolean g(AnimatedVectorDrawable animatedVectorDrawable, q5.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.a(drawable, theme);
        }
    }

    public void b(@NonNull q5.b bVar) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f29794g == null) {
            this.f29794g = new ArrayList<>();
        }
        if (this.f29794g.contains(bVar)) {
            return;
        }
        this.f29794g.add(bVar);
        if (this.f29793f == null) {
            this.f29793f = new b();
        }
        this.b.f29799c.addListener(this.f29793f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            return q2.a.b(drawable);
        }
        return false;
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d() {
        Animator.AnimatorListener animatorListener = this.f29793f;
        if (animatorListener != null) {
            this.b.f29799c.removeListener(animatorListener);
            this.f29793f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.b.b.draw(canvas);
        if (this.b.f29799c.isStarted()) {
            invalidateSelf();
        }
    }

    public final void e(String str, Animator animator) {
        animator.setTarget(this.b.b.c(str));
        C0582c c0582c = this.b;
        if (c0582c.f29800d == null) {
            c0582c.f29800d = new ArrayList<>();
            this.b.f29801e = new w1.a<>();
        }
        this.b.f29800d.add(animator);
        this.b.f29801e.put(animator, str);
    }

    public boolean f(@NonNull q5.b bVar) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<q5.b> arrayList = this.f29794g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f29794g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f29803a;
        return drawable != null ? q2.a.d(drawable) : this.b.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.f29798a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f29803a;
        return drawable != null ? q2.a.e(drawable) : this.b.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f29803a != null) {
            return new d(this.f29803a.getConstantState());
        }
        return null;
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.b.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.b.b.getIntrinsicWidth();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.getOpacity() : this.b.b.getOpacity();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f29803a;
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
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, q5.a.f29780e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f29795h);
                        f fVar = this.b.b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.b.b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, q5.a.f29781f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f29790c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, q5.d.a(context, resourceId2));
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
        Drawable drawable = this.f29803a;
        return drawable != null ? q2.a.h(drawable) : this.b.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f29803a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.b.f29799c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.isStateful() : this.b.b.isStateful();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.b.setBounds(rect);
        }
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.setLevel(i10) : this.b.b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.setState(iArr) : this.b.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.b.b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.j(drawable, z10);
        } else {
            this.b.b.setAutoMirrored(z10);
        }
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.n(drawable, i10);
        } else {
            this.b.b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
        } else {
            this.b.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.p(drawable, mode);
        } else {
            this.b.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.b.b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.b.f29799c.isStarted()) {
                return;
            }
            this.b.f29799c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.f29799c.end();
        }
    }

    public c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.b.setColorFilter(colorFilter);
        }
    }

    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f29802a;

        public d(Drawable.ConstantState constantState) {
            this.f29802a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f29802a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29802a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f29802a.newDrawable();
            cVar.f29803a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f29795h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f29802a.newDrawable(resources);
            cVar.f29803a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f29795h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f29802a.newDrawable(resources, theme);
            cVar.f29803a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f29795h);
            return cVar;
        }
    }

    public c(Context context, C0582c c0582c, Resources resources) {
        this.f29791d = null;
        this.f29793f = null;
        this.f29794g = null;
        a aVar = new a();
        this.f29795h = aVar;
        this.f29790c = context;
        if (c0582c != null) {
            this.b = c0582c;
        } else {
            this.b = new C0582c(context, c0582c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
