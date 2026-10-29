package b3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d1;
import androidx.core.view.o0;
import androidx.core.view.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3880a;
    public final ArrayList<c> b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Insets f3881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Insets f3882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3883e;

    public class a extends View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3884a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.f3884a = viewGroup;
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.f3884a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (g.this.f3883e != color) {
                g.this.f3883e = color;
                for (int size = g.this.b.size() - 1; size >= 0; size--) {
                    ((c) g.this.b.get(size)).e(color);
                }
            }
        }
    }

    public class b extends d1.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap<d1, Integer> f3885c;

        public b(int i10) {
            super(i10);
            this.f3885c = new HashMap<>();
        }

        @Override // androidx.core.view.d1.b
        public void b(d1 d1Var) {
            if (f(d1Var)) {
                this.f3885c.remove(d1Var);
                for (int size = g.this.b.size() - 1; size >= 0; size--) {
                    ((c) g.this.b.get(size)).d();
                }
            }
        }

        @Override // androidx.core.view.d1.b
        public void c(d1 d1Var) {
            if (f(d1Var)) {
                for (int size = g.this.b.size() - 1; size >= 0; size--) {
                    ((c) g.this.b.get(size)).c();
                }
            }
        }

        @Override // androidx.core.view.d1.b
        public WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List<d1> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i10 = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                d1 d1Var = list.get(size);
                Integer num = this.f3885c.get(d1Var);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = d1Var.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                    i10 |= iIntValue;
                }
            }
            Insets insetsI = g.this.i(windowInsetsCompat);
            for (int size2 = g.this.b.size() - 1; size2 >= 0; size2--) {
                ((c) g.this.b.get(size2)).a(i10, insetsI, rectF);
            }
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.d1.b
        public d1.a e(d1 d1Var, d1.a aVar) {
            if (!f(d1Var)) {
                return aVar;
            }
            Insets insetsB = aVar.b();
            Insets insetsA = aVar.a();
            int i10 = insetsB.left != insetsA.left ? 1 : 0;
            if (insetsB.top != insetsA.top) {
                i10 |= 2;
            }
            if (insetsB.right != insetsA.right) {
                i10 |= 4;
            }
            if (insetsB.bottom != insetsA.bottom) {
                i10 |= 8;
            }
            this.f3885c.put(d1Var, Integer.valueOf(i10));
            return aVar;
        }

        public final boolean f(d1 d1Var) {
            return (d1Var.d() & WindowInsetsCompat.Type.systemBars()) != 0;
        }
    }

    public interface c {
        void a(int i10, Insets insets, RectF rectF);

        void b(Insets insets, Insets insets2);

        void c();

        void d();

        void e(int i10);
    }

    public g(ViewGroup viewGroup) {
        Insets insets = Insets.NONE;
        this.f3881c = insets;
        this.f3882d = insets;
        Drawable background = viewGroup.getBackground();
        this.f3883e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.f3880a = aVar;
        aVar.setWillNotDraw(true);
        o0.A0(aVar, new y() { // from class: b3.e
            @Override // androidx.core.view.y
            public final WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
                return g.b(this.f3878a, view, windowInsetsCompat);
            }
        });
        o0.H0(aVar, new b(0));
        viewGroup.addView(aVar, 0);
    }

    public static /* synthetic */ void a(g gVar) {
        ViewParent parent = gVar.f3880a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(gVar.f3880a);
        }
    }

    public static /* synthetic */ WindowInsetsCompat b(g gVar, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsI = gVar.i(windowInsetsCompat);
        Insets insetsJ = gVar.j(windowInsetsCompat);
        if (!insetsI.equals(gVar.f3881c) || !insetsJ.equals(gVar.f3882d)) {
            gVar.f3881c = insetsI;
            gVar.f3882d = insetsJ;
            for (int size = gVar.b.size() - 1; size >= 0; size--) {
                gVar.b.get(size).b(insetsI, insetsJ);
            }
        }
        return windowInsetsCompat;
    }

    public void g(c cVar) {
        if (this.b.contains(cVar)) {
            return;
        }
        this.b.add(cVar);
        cVar.b(this.f3881c, this.f3882d);
        cVar.e(this.f3883e);
    }

    public void h() {
        this.f3880a.post(new Runnable() { // from class: b3.f
            @Override // java.lang.Runnable
            public final void run() {
                g.a(this.f3879a);
            }
        });
    }

    public final Insets i(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.tappableElement()));
    }

    public final Insets j(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement()));
    }

    public boolean k() {
        return !this.b.isEmpty();
    }

    public void l(c cVar) {
        this.b.remove(cVar);
    }
}
