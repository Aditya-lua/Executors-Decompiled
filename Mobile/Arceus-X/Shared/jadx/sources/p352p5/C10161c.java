package p352p5;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p298n2.C8870h;
import p298n2.C8873k;
import p368q2.C10425a;
import p504w1.C12277a;

/* JADX INFO: renamed from: p5.c */
/* JADX INFO: loaded from: classes.dex */
public class C10161c extends AbstractC10163e implements Animatable {

    /* JADX INFO: renamed from: b */
    public c f36549b;

    /* JADX INFO: renamed from: c */
    public Context f36550c;

    /* JADX INFO: renamed from: d */
    public ArgbEvaluator f36551d;

    /* JADX INFO: renamed from: e */
    public d f36552e;

    /* JADX INFO: renamed from: f */
    public Animator.AnimatorListener f36553f;

    /* JADX INFO: renamed from: g */
    public ArrayList<AbstractC10160b> f36554g;

    /* JADX INFO: renamed from: h */
    public final Drawable.Callback f36555h;

    /* JADX INFO: renamed from: p5.c$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C10161c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            C10161c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C10161c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: p5.c$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C10161c.this.f36554g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC10160b) arrayList.get(i10)).mo12376b(C10161c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C10161c.this.f36554g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC10160b) arrayList.get(i10)).mo12377c(C10161c.this);
            }
        }
    }

    /* JADX INFO: renamed from: p5.c$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f36558a;

        /* JADX INFO: renamed from: b */
        public C10164f f36559b;

        /* JADX INFO: renamed from: c */
        public AnimatorSet f36560c;

        /* JADX INFO: renamed from: d */
        public ArrayList<Animator> f36561d;

        /* JADX INFO: renamed from: e */
        public C12277a<Animator, String> f36562e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f36558a = cVar.f36558a;
                C10164f c10164f = cVar.f36559b;
                if (c10164f != null) {
                    Drawable.ConstantState constantState = c10164f.getConstantState();
                    if (resources != null) {
                        this.f36559b = (C10164f) constantState.newDrawable(resources);
                    } else {
                        this.f36559b = (C10164f) constantState.newDrawable();
                    }
                    C10164f c10164f2 = (C10164f) this.f36559b.mutate();
                    this.f36559b = c10164f2;
                    c10164f2.setCallback(callback);
                    this.f36559b.setBounds(cVar.f36559b.getBounds());
                    this.f36559b.m39125g(false);
                }
                ArrayList<Animator> arrayList = cVar.f36561d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f36561d = new ArrayList<>(size);
                    this.f36562e = new C12277a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = cVar.f36561d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = cVar.f36562e.get(animator);
                        animatorClone.setTarget(this.f36559b.m39122c(str));
                        this.f36561d.add(animatorClone);
                        this.f36562e.put(animatorClone, str);
                    }
                    m39117a();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m39117a() {
            if (this.f36560c == null) {
                this.f36560c = new AnimatorSet();
            }
            this.f36560c.playTogether(this.f36561d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36558a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10161c() {
        this(null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static C10161c m39110a(@NonNull Context context, int i10) {
        C10161c c10161c = new C10161c(context);
        Drawable drawableM35662e = C8870h.m35662e(context.getResources(), i10, context.getTheme());
        c10161c.f36564a = drawableM35662e;
        drawableM35662e.setCallback(c10161c.f36555h);
        c10161c.f36552e = new d(c10161c.f36564a.getConstantState());
        return c10161c;
    }

    /* JADX INFO: renamed from: c */
    public static void m39111c(@NonNull AnimatedVectorDrawable animatedVectorDrawable, @NonNull AbstractC10160b abstractC10160b) {
        animatedVectorDrawable.registerAnimationCallback(abstractC10160b.m39109a());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m39112g(AnimatedVectorDrawable animatedVectorDrawable, AbstractC10160b abstractC10160b) {
        return animatedVectorDrawable.unregisterAnimationCallback(abstractC10160b.m39109a());
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40104a(drawable, theme);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39113b(@NonNull AbstractC10160b abstractC10160b) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            m39111c((AnimatedVectorDrawable) drawable, abstractC10160b);
            return;
        }
        if (abstractC10160b == null) {
            return;
        }
        if (this.f36554g == null) {
            this.f36554g = new ArrayList<>();
        }
        if (this.f36554g.contains(abstractC10160b)) {
            return;
        }
        this.f36554g.add(abstractC10160b);
        if (this.f36553f == null) {
            this.f36553f = new b();
        }
        this.f36549b.f36560c.addListener(this.f36553f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            return C10425a.m40105b(drawable);
        }
        return false;
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public final void m39114d() {
        Animator.AnimatorListener animatorListener = this.f36553f;
        if (animatorListener != null) {
            this.f36549b.f36560c.removeListener(animatorListener);
            this.f36553f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f36549b.f36559b.draw(canvas);
        if (this.f36549b.f36560c.isStarted()) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m39115e(String str, Animator animator) {
        animator.setTarget(this.f36549b.f36559b.m39122c(str));
        c cVar = this.f36549b;
        if (cVar.f36561d == null) {
            cVar.f36561d = new ArrayList<>();
            this.f36549b.f36562e = new C12277a<>();
        }
        this.f36549b.f36561d.add(animator);
        this.f36549b.f36562e.put(animator, str);
    }

    /* JADX INFO: renamed from: f */
    public boolean m39116f(@NonNull AbstractC10160b abstractC10160b) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            m39112g((AnimatedVectorDrawable) drawable, abstractC10160b);
        }
        ArrayList<AbstractC10160b> arrayList = this.f36554g;
        if (arrayList == null || abstractC10160b == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(abstractC10160b);
        if (this.f36554g.size() == 0) {
            m39114d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f36564a;
        return drawable != null ? C10425a.m40107d(drawable) : this.f36549b.f36559b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f36549b.f36558a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f36564a;
        return drawable != null ? C10425a.m40108e(drawable) : this.f36549b.f36559b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f36564a != null) {
            return new d(this.f36564a.getConstantState());
        }
        return null;
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f36549b.f36559b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f36549b.f36559b.getIntrinsicWidth();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.getOpacity() : this.f36549b.f36559b.getOpacity();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40110g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM35693i = C8873k.m35693i(resources, theme, attributeSet, C10159a.f36539e);
                    int resourceId = typedArrayM35693i.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C10164f c10164fM39120b = C10164f.m39120b(resources, resourceId, theme);
                        c10164fM39120b.m39125g(false);
                        c10164fM39120b.setCallback(this.f36555h);
                        C10164f c10164f = this.f36549b.f36559b;
                        if (c10164f != null) {
                            c10164f.setCallback(null);
                        }
                        this.f36549b.f36559b = c10164fM39120b;
                    }
                    typedArrayM35693i.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C10159a.f36540f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f36550c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m39115e(string, C10162d.m39118a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f36549b.m39117a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f36564a;
        return drawable != null ? C10425a.m40111h(drawable) : this.f36549b.f36559b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f36564a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f36549b.f36560c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.isStateful() : this.f36549b.f36559b.isStateful();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f36549b.f36559b.setBounds(rect);
        }
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.setLevel(i10) : this.f36549b.f36559b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.setState(iArr) : this.f36549b.f36559b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f36549b.f36559b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40113j(drawable, z10);
        } else {
            this.f36549b.f36559b.setAutoMirrored(z10);
        }
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40117n(drawable, i10);
        } else {
            this.f36549b.f36559b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40118o(drawable, colorStateList);
        } else {
            this.f36549b.f36559b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40119p(drawable, mode);
        } else {
            this.f36549b.f36559b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f36549b.f36559b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f36549b.f36560c.isStarted()) {
                return;
            }
            this.f36549b.f36560c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f36549b.f36560c.end();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10161c(Context context) {
        this(context, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f36549b.f36559b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: p5.c$d */
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f36563a;

        public d(Drawable.ConstantState constantState) {
            this.f36563a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f36563a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36563a.getChangingConfigurations();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C10161c c10161c = new C10161c();
            Drawable drawableNewDrawable = this.f36563a.newDrawable();
            c10161c.f36564a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c10161c.f36555h);
            return c10161c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C10161c c10161c = new C10161c();
            Drawable drawableNewDrawable = this.f36563a.newDrawable(resources);
            c10161c.f36564a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c10161c.f36555h);
            return c10161c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C10161c c10161c = new C10161c();
            Drawable drawableNewDrawable = this.f36563a.newDrawable(resources, theme);
            c10161c.f36564a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c10161c.f36555h);
            return c10161c;
        }
    }

    public C10161c(Context context, c cVar, Resources resources) {
        this.f36551d = null;
        this.f36553f = null;
        this.f36554g = null;
        a aVar = new a();
        this.f36555h = aVar;
        this.f36550c = context;
        if (cVar != null) {
            this.f36549b = cVar;
        } else {
            this.f36549b = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
