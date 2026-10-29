package p023b3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.C0593d1;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: b3.g */
/* JADX INFO: loaded from: classes.dex */
public class C1214g {

    /* JADX INFO: renamed from: a */
    public final View f5072a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<c> f5073b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public Insets f5074c;

    /* JADX INFO: renamed from: d */
    public Insets f5075d;

    /* JADX INFO: renamed from: e */
    public int f5076e;

    /* JADX INFO: renamed from: b3.g$a */
    public class a extends View {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f5077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.f5077a = viewGroup;
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.f5077a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (C1214g.this.f5076e != color) {
                C1214g.this.f5076e = color;
                for (int size = C1214g.this.f5073b.size() - 1; size >= 0; size--) {
                    ((c) C1214g.this.f5073b.get(size)).mo6808e(color);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b3.g$b */
    public class b extends C0593d1.b {

        /* JADX INFO: renamed from: c */
        public final HashMap<C0593d1, Integer> f5079c;

        public b(int i10) {
            super(i10);
            this.f5079c = new HashMap<>();
        }

        @Override // androidx.core.view.C0593d1.b
        /* JADX INFO: renamed from: b */
        public void mo2854b(C0593d1 c0593d1) {
            if (m6830f(c0593d1)) {
                this.f5079c.remove(c0593d1);
                for (int size = C1214g.this.f5073b.size() - 1; size >= 0; size--) {
                    ((c) C1214g.this.f5073b.get(size)).mo6807d();
                }
            }
        }

        @Override // androidx.core.view.C0593d1.b
        /* JADX INFO: renamed from: c */
        public void mo2855c(C0593d1 c0593d1) {
            if (m6830f(c0593d1)) {
                for (int size = C1214g.this.f5073b.size() - 1; size >= 0; size--) {
                    ((c) C1214g.this.f5073b.get(size)).mo6806c();
                }
            }
        }

        @Override // androidx.core.view.C0593d1.b
        /* JADX INFO: renamed from: d */
        public WindowInsetsCompat mo2856d(WindowInsetsCompat windowInsetsCompat, List<C0593d1> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i10 = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                C0593d1 c0593d1 = list.get(size);
                Integer num = this.f5079c.get(c0593d1);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fM2844a = c0593d1.m2844a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fM2844a;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fM2844a;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fM2844a;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fM2844a;
                    }
                    i10 |= iIntValue;
                }
            }
            Insets insetsM6826i = C1214g.this.m6826i(windowInsetsCompat);
            for (int size2 = C1214g.this.f5073b.size() - 1; size2 >= 0; size2--) {
                ((c) C1214g.this.f5073b.get(size2)).mo6804a(i10, insetsM6826i, rectF);
            }
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.C0593d1.b
        /* JADX INFO: renamed from: e */
        public C0593d1.a mo2857e(C0593d1 c0593d1, C0593d1.a aVar) {
            if (!m6830f(c0593d1)) {
                return aVar;
            }
            Insets insetsM2851b = aVar.m2851b();
            Insets insetsM2850a = aVar.m2850a();
            int i10 = insetsM2851b.left != insetsM2850a.left ? 1 : 0;
            if (insetsM2851b.top != insetsM2850a.top) {
                i10 |= 2;
            }
            if (insetsM2851b.right != insetsM2850a.right) {
                i10 |= 4;
            }
            if (insetsM2851b.bottom != insetsM2850a.bottom) {
                i10 |= 8;
            }
            this.f5079c.put(c0593d1, Integer.valueOf(i10));
            return aVar;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m6830f(C0593d1 c0593d1) {
            return (c0593d1.m2847d() & WindowInsetsCompat.Type.systemBars()) != 0;
        }
    }

    /* JADX INFO: renamed from: b3.g$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo6804a(int i10, Insets insets, RectF rectF);

        /* JADX INFO: renamed from: b */
        void mo6805b(Insets insets, Insets insets2);

        /* JADX INFO: renamed from: c */
        void mo6806c();

        /* JADX INFO: renamed from: d */
        void mo6807d();

        /* JADX INFO: renamed from: e */
        void mo6808e(int i10);
    }

    public C1214g(ViewGroup viewGroup) {
        Insets insets = Insets.NONE;
        this.f5074c = insets;
        this.f5075d = insets;
        Drawable background = viewGroup.getBackground();
        this.f5076e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.f5072a = aVar;
        aVar.setWillNotDraw(true);
        C0625o0.m2979A0(aVar, new InterfaceC0644y() { // from class: b3.e
            @Override // androidx.core.view.InterfaceC0644y
            /* JADX INFO: renamed from: K */
            public final WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
                return C1214g.m6819b(this.f5070a, view, windowInsetsCompat);
            }
        });
        C0625o0.m2993H0(aVar, new b(0));
        viewGroup.addView(aVar, 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6818a(C1214g c1214g) {
        ViewParent parent = c1214g.f5072a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c1214g.f5072a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WindowInsetsCompat m6819b(C1214g c1214g, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsM6826i = c1214g.m6826i(windowInsetsCompat);
        Insets insetsM6827j = c1214g.m6827j(windowInsetsCompat);
        if (!insetsM6826i.equals(c1214g.f5074c) || !insetsM6827j.equals(c1214g.f5075d)) {
            c1214g.f5074c = insetsM6826i;
            c1214g.f5075d = insetsM6827j;
            for (int size = c1214g.f5073b.size() - 1; size >= 0; size--) {
                c1214g.f5073b.get(size).mo6805b(insetsM6826i, insetsM6827j);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: g */
    public void m6824g(c cVar) {
        if (this.f5073b.contains(cVar)) {
            return;
        }
        this.f5073b.add(cVar);
        cVar.mo6805b(this.f5074c, this.f5075d);
        cVar.mo6808e(this.f5076e);
    }

    /* JADX INFO: renamed from: h */
    public void m6825h() {
        this.f5072a.post(new Runnable() { // from class: b3.f
            @Override // java.lang.Runnable
            public final void run() {
                C1214g.m6818a(this.f5071a);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final Insets m6826i(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.tappableElement()));
    }

    /* JADX INFO: renamed from: j */
    public final Insets m6827j(WindowInsetsCompat windowInsetsCompat) {
        return Insets.min(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars()), windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement()));
    }

    /* JADX INFO: renamed from: k */
    public boolean m6828k() {
        return !this.f5073b.isEmpty();
    }

    /* JADX INFO: renamed from: l */
    public void m6829l(c cVar) {
        this.f5073b.remove(cVar);
    }
}
