package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p261l2.C7975b;
import p280m.C8271a;
import p352p5.C10164f;
import p368q2.C10425a;
import p504w1.C12283g;
import p504w1.C12285i;
import p504w1.C12286j;
import p504w1.C12287k;

/* JADX INFO: renamed from: q.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10398r0 {

    /* JADX INFO: renamed from: i */
    public static C10398r0 f37452i;

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Context, C12287k<ColorStateList>> f37454a;

    /* JADX INFO: renamed from: b */
    public C12286j<String, b> f37455b;

    /* JADX INFO: renamed from: c */
    public C12287k<String> f37456c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap<Context, C12283g<WeakReference<Drawable.ConstantState>>> f37457d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f37458e;

    /* JADX INFO: renamed from: f */
    public boolean f37459f;

    /* JADX INFO: renamed from: g */
    public c f37460g;

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f37451h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    public static final a f37453j = new a(6);

    /* JADX INFO: renamed from: q.r0$a */
    public static class a extends C12285i<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        /* JADX INFO: renamed from: l */
        public static int m40018l(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: m */
        public PorterDuffColorFilter m40019m(int i10, PorterDuff.Mode mode) {
            return m45612d(Integer.valueOf(m40018l(i10, mode)));
        }

        /* JADX INFO: renamed from: n */
        public PorterDuffColorFilter m40020n(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m45613e(Integer.valueOf(m40018l(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: q.r0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Drawable m40021a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: renamed from: q.r0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Drawable mo39870a(@NonNull C10398r0 c10398r0, @NonNull Context context, int i10);

        /* JADX INFO: renamed from: b */
        ColorStateList mo39871b(@NonNull Context context, int i10);

        /* JADX INFO: renamed from: c */
        boolean mo39872c(@NonNull Context context, int i10, @NonNull Drawable drawable);

        /* JADX INFO: renamed from: d */
        PorterDuff.Mode mo39873d(int i10);

        /* JADX INFO: renamed from: e */
        boolean mo39874e(@NonNull Context context, int i10, @NonNull Drawable drawable);
    }

    /* JADX INFO: renamed from: d */
    public static long m39995d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* JADX INFO: renamed from: f */
    public static PorterDuffColorFilter m39996f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m39998k(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: g */
    public static synchronized C10398r0 m39997g() {
        try {
            if (f37452i == null) {
                C10398r0 c10398r0 = new C10398r0();
                f37452i = c10398r0;
                m39999o(c10398r0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37452i;
    }

    /* JADX INFO: renamed from: k */
    public static synchronized PorterDuffColorFilter m39998k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM40019m;
        a aVar = f37453j;
        porterDuffColorFilterM40019m = aVar.m40019m(i10, mode);
        if (porterDuffColorFilterM40019m == null) {
            porterDuffColorFilterM40019m = new PorterDuffColorFilter(i10, mode);
            aVar.m40020n(i10, mode, porterDuffColorFilterM40019m);
        }
        return porterDuffColorFilterM40019m;
    }

    /* JADX INFO: renamed from: o */
    public static void m39999o(@NonNull C10398r0 c10398r0) {
    }

    /* JADX INFO: renamed from: p */
    public static boolean m40000p(@NonNull Drawable drawable) {
        return (drawable instanceof C10164f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: renamed from: v */
    public static void m40001v(Drawable drawable, C10412y0 c10412y0, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = c10412y0.f37523d;
        if (z10 || c10412y0.f37522c) {
            drawable.setColorFilter(m39996f(z10 ? c10412y0.f37520a : null, c10412y0.f37522c ? c10412y0.f37521b : f37451h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m40002a(@NonNull Context context, long j10, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C12283g<WeakReference<Drawable.ConstantState>> c12283g = this.f37457d.get(context);
            if (c12283g == null) {
                c12283g = new C12283g<>();
                this.f37457d.put(context, c12283g);
            }
            c12283g.m45604i(j10, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m40003b(@NonNull Context context, int i10, @NonNull ColorStateList colorStateList) {
        if (this.f37454a == null) {
            this.f37454a = new WeakHashMap<>();
        }
        C12287k<ColorStateList> c12287k = this.f37454a.get(context);
        if (c12287k == null) {
            c12287k = new C12287k<>();
            this.f37454a.put(context, c12287k);
        }
        c12287k.m45630a(i10, colorStateList);
    }

    /* JADX INFO: renamed from: c */
    public final void m40004c(@NonNull Context context) {
        if (this.f37459f) {
            return;
        }
        this.f37459f = true;
        Drawable drawableM40007i = m40007i(context, C8271a.f30579a);
        if (drawableM40007i == null || !m40000p(drawableM40007i)) {
            this.f37459f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m40005e(@NonNull Context context, int i10) {
        if (this.f37458e == null) {
            this.f37458e = new TypedValue();
        }
        TypedValue typedValue = this.f37458e;
        context.getResources().getValue(i10, typedValue, true);
        long jM39995d = m39995d(typedValue);
        Drawable drawableM40006h = m40006h(context, jM39995d);
        if (drawableM40006h != null) {
            return drawableM40006h;
        }
        c cVar = this.f37460g;
        Drawable drawableMo39870a = cVar == null ? null : cVar.mo39870a(this, context, i10);
        if (drawableMo39870a != null) {
            drawableMo39870a.setChangingConfigurations(typedValue.changingConfigurations);
            m40002a(context, jM39995d, drawableMo39870a);
        }
        return drawableMo39870a;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Drawable m40006h(@NonNull Context context, long j10) {
        C12283g<WeakReference<Drawable.ConstantState>> c12283g = this.f37457d.get(context);
        if (c12283g == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM45601e = c12283g.m45601e(j10);
        if (weakReferenceM45601e != null) {
            Drawable.ConstantState constantState = weakReferenceM45601e.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c12283g.m45605j(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public synchronized Drawable m40007i(@NonNull Context context, int i10) {
        return m40008j(context, i10, false);
    }

    /* JADX INFO: renamed from: j */
    public synchronized Drawable m40008j(@NonNull Context context, int i10, boolean z10) {
        Drawable drawableM40012q;
        try {
            m40004c(context);
            drawableM40012q = m40012q(context, i10);
            if (drawableM40012q == null) {
                drawableM40012q = m40005e(context, i10);
            }
            if (drawableM40012q == null) {
                drawableM40012q = C7975b.m33008f(context, i10);
            }
            if (drawableM40012q != null) {
                drawableM40012q = m40016u(context, i10, z10, drawableM40012q);
            }
            if (drawableM40012q != null) {
                C10384k0.m39884b(drawableM40012q);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableM40012q;
    }

    /* JADX INFO: renamed from: l */
    public synchronized ColorStateList m40009l(@NonNull Context context, int i10) {
        ColorStateList colorStateListM40010m;
        colorStateListM40010m = m40010m(context, i10);
        if (colorStateListM40010m == null) {
            c cVar = this.f37460g;
            colorStateListM40010m = cVar == null ? null : cVar.mo39871b(context, i10);
            if (colorStateListM40010m != null) {
                m40003b(context, i10, colorStateListM40010m);
            }
        }
        return colorStateListM40010m;
    }

    /* JADX INFO: renamed from: m */
    public final ColorStateList m40010m(@NonNull Context context, int i10) {
        C12287k<ColorStateList> c12287k;
        WeakHashMap<Context, C12287k<ColorStateList>> weakHashMap = this.f37454a;
        if (weakHashMap == null || (c12287k = weakHashMap.get(context)) == null) {
            return null;
        }
        return c12287k.m45633e(i10);
    }

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode m40011n(int i10) {
        c cVar = this.f37460g;
        if (cVar == null) {
            return null;
        }
        return cVar.mo39873d(i10);
    }

    /* JADX INFO: renamed from: q */
    public final Drawable m40012q(@NonNull Context context, int i10) {
        int next;
        C12286j<String, b> c12286j = this.f37455b;
        if (c12286j == null || c12286j.isEmpty()) {
            return null;
        }
        C12287k<String> c12287k = this.f37456c;
        if (c12287k != null) {
            String strM45633e = c12287k.m45633e(i10);
            if ("appcompat_skip_skip".equals(strM45633e) || (strM45633e != null && this.f37455b.get(strM45633e) == null)) {
                return null;
            }
        } else {
            this.f37456c = new C12287k<>();
        }
        if (this.f37458e == null) {
            this.f37458e = new TypedValue();
        }
        TypedValue typedValue = this.f37458e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jM39995d = m39995d(typedValue);
        Drawable drawableM40006h = m40006h(context, jM39995d);
        if (drawableM40006h != null) {
            return drawableM40006h;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f37456c.m45630a(i10, name);
                b bVar = this.f37455b.get(name);
                if (bVar != null) {
                    drawableM40006h = bVar.m40021a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM40006h != null) {
                    drawableM40006h.setChangingConfigurations(typedValue.changingConfigurations);
                    m40002a(context, jM39995d, drawableM40006h);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableM40006h == null) {
            this.f37456c.m45630a(i10, "appcompat_skip_skip");
        }
        return drawableM40006h;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m40013r(@NonNull Context context) {
        C12283g<WeakReference<Drawable.ConstantState>> c12283g = this.f37457d.get(context);
        if (c12283g != null) {
            c12283g.m45598a();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized Drawable m40014s(@NonNull Context context, @NonNull C10372f1 c10372f1, int i10) {
        try {
            Drawable drawableM40012q = m40012q(context, i10);
            if (drawableM40012q == null) {
                drawableM40012q = c10372f1.m40024a(i10);
            }
            if (drawableM40012q == null) {
                return null;
            }
            return m40016u(context, i10, false, drawableM40012q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m40015t(c cVar) {
        this.f37460g = cVar;
    }

    /* JADX INFO: renamed from: u */
    public final Drawable m40016u(@NonNull Context context, int i10, boolean z10, @NonNull Drawable drawable) {
        ColorStateList colorStateListM40009l = m40009l(context, i10);
        if (colorStateListM40009l != null) {
            Drawable drawableM40121r = C10425a.m40121r(drawable.mutate());
            C10425a.m40118o(drawableM40121r, colorStateListM40009l);
            PorterDuff.Mode modeM40011n = m40011n(i10);
            if (modeM40011n != null) {
                C10425a.m40119p(drawableM40121r, modeM40011n);
            }
            return drawableM40121r;
        }
        c cVar = this.f37460g;
        if ((cVar == null || !cVar.mo39874e(context, i10, drawable)) && !m40017w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: w */
    public boolean m40017w(@NonNull Context context, int i10, @NonNull Drawable drawable) {
        c cVar = this.f37460g;
        return cVar != null && cVar.mo39872c(context, i10, drawable);
    }
}
