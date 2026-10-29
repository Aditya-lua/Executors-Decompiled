package q;

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

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static r0 f29093i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, w1.k<ColorStateList>> f29095a;
    public w1.j<String, b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w1.k<String> f29096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, w1.g<WeakReference<Drawable.ConstantState>>> f29097d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f29098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f29100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f29092h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f29094j = new a(6);

    public static class a extends w1.i<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        public static int l(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter m(int i10, PorterDuff.Mode mode) {
            return d(Integer.valueOf(l(i10, mode)));
        }

        public PorterDuffColorFilter n(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return e(Integer.valueOf(l(i10, mode)), porterDuffColorFilter);
        }
    }

    public interface b {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(@NonNull r0 r0Var, @NonNull Context context, int i10);

        ColorStateList b(@NonNull Context context, int i10);

        boolean c(@NonNull Context context, int i10, @NonNull Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(@NonNull Context context, int i10, @NonNull Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized r0 g() {
        try {
            if (f29093i == null) {
                r0 r0Var = new r0();
                f29093i = r0Var;
                o(r0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29093i;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM;
        a aVar = f29094j;
        porterDuffColorFilterM = aVar.m(i10, mode);
        if (porterDuffColorFilterM == null) {
            porterDuffColorFilterM = new PorterDuffColorFilter(i10, mode);
            aVar.n(i10, mode, porterDuffColorFilterM);
        }
        return porterDuffColorFilterM;
    }

    public static void o(@NonNull r0 r0Var) {
    }

    public static boolean p(@NonNull Drawable drawable) {
        return (drawable instanceof p5.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, y0 y0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = y0Var.f29155d;
        if (z10 || y0Var.f29154c) {
            drawable.setColorFilter(f(z10 ? y0Var.f29153a : null, y0Var.f29154c ? y0Var.b : f29092h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(@NonNull Context context, long j10, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            w1.g<WeakReference<Drawable.ConstantState>> gVar = this.f29097d.get(context);
            if (gVar == null) {
                gVar = new w1.g<>();
                this.f29097d.put(context, gVar);
            }
            gVar.i(j10, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(@NonNull Context context, int i10, @NonNull ColorStateList colorStateList) {
        if (this.f29095a == null) {
            this.f29095a = new WeakHashMap<>();
        }
        w1.k<ColorStateList> kVar = this.f29095a.get(context);
        if (kVar == null) {
            kVar = new w1.k<>();
            this.f29095a.put(context, kVar);
        }
        kVar.a(i10, colorStateList);
    }

    public final void c(@NonNull Context context) {
        if (this.f29099f) {
            return;
        }
        this.f29099f = true;
        Drawable drawableI = i(context, m.a.f23563a);
        if (drawableI == null || !p(drawableI)) {
            this.f29099f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(@NonNull Context context, int i10) {
        if (this.f29098e == null) {
            this.f29098e = new TypedValue();
        }
        TypedValue typedValue = this.f29098e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f29100g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable h(@NonNull Context context, long j10) {
        w1.g<WeakReference<Drawable.ConstantState>> gVar = this.f29097d.get(context);
        if (gVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceE = gVar.e(j10);
        if (weakReferenceE != null) {
            Drawable.ConstantState constantState = weakReferenceE.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            gVar.j(j10);
        }
        return null;
    }

    public synchronized Drawable i(@NonNull Context context, int i10) {
        return j(context, i10, false);
    }

    public synchronized Drawable j(@NonNull Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = l2.b.f(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                k0.b(drawableQ);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableQ;
    }

    public synchronized ColorStateList l(@NonNull Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f29100g;
            colorStateListM = cVar == null ? null : cVar.b(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    public final ColorStateList m(@NonNull Context context, int i10) {
        w1.k<ColorStateList> kVar;
        WeakHashMap<Context, w1.k<ColorStateList>> weakHashMap = this.f29095a;
        if (weakHashMap == null || (kVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return kVar.e(i10);
    }

    public PorterDuff.Mode n(int i10) {
        c cVar = this.f29100g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public final Drawable q(@NonNull Context context, int i10) {
        int next;
        w1.j<String, b> jVar = this.b;
        if (jVar == null || jVar.isEmpty()) {
            return null;
        }
        w1.k<String> kVar = this.f29096c;
        if (kVar != null) {
            String strE = kVar.e(i10);
            if ("appcompat_skip_skip".equals(strE) || (strE != null && this.b.get(strE) == null)) {
                return null;
            }
        } else {
            this.f29096c = new w1.k<>();
        }
        if (this.f29098e == null) {
            this.f29098e = new TypedValue();
        }
        TypedValue typedValue = this.f29098e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
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
                this.f29096c.a(i10, name);
                b bVar = this.b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f29096c.a(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    public synchronized void r(@NonNull Context context) {
        w1.g<WeakReference<Drawable.ConstantState>> gVar = this.f29097d.get(context);
        if (gVar != null) {
            gVar.a();
        }
    }

    public synchronized Drawable s(@NonNull Context context, @NonNull f1 f1Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = f1Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f29100g = cVar;
    }

    public final Drawable u(@NonNull Context context, int i10, boolean z10, @NonNull Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = q2.a.r(drawable.mutate());
            q2.a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                q2.a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f29100g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public boolean w(@NonNull Context context, int i10, @NonNull Drawable drawable) {
        c cVar = this.f29100g;
        return cVar != null && cVar.c(context, i10, drawable);
    }
}
