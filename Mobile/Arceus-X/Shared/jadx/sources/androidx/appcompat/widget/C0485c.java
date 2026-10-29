package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import p181i.C6589a;
import p203j.AbstractC6991a;
import p316o.C9608a;
import p365q.C10357a1;
import p365q.C10359b0;
import p365q.C10369e1;
import p365q.C10395q;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: loaded from: classes.dex */
public class C0485c extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: j */
    public static final Interpolator f1684j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Runnable f1685a;

    /* JADX INFO: renamed from: b */
    public c f1686b;

    /* JADX INFO: renamed from: c */
    public C0484b f1687c;

    /* JADX INFO: renamed from: d */
    public Spinner f1688d;

    /* JADX INFO: renamed from: e */
    public boolean f1689e;

    /* JADX INFO: renamed from: f */
    public int f1690f;

    /* JADX INFO: renamed from: g */
    public int f1691g;

    /* JADX INFO: renamed from: h */
    public int f1692h;

    /* JADX INFO: renamed from: i */
    public int f1693i;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1694a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(View view) {
            this.f1694a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0485c.this.smoothScrollTo(this.f1694a.getLeft() - ((C0485c.this.getWidth() - this.f1694a.getWidth()) / 2), 0);
            C0485c.this.f1685a = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0485c.this.f1687c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) C0485c.this.f1687c.getChildAt(i10)).m1992b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0485c.this.m1987c((AbstractC6991a.c) getItem(i10), true);
            }
            ((d) view).m1991a((AbstractC6991a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1992b().m29444e();
            int childCount = C0485c.this.f1687c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = C0485c.this.f1687c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    public class d extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public final int[] f1698a;

        /* JADX INFO: renamed from: b */
        public AbstractC6991a.c f1699b;

        /* JADX INFO: renamed from: c */
        public TextView f1700c;

        /* JADX INFO: renamed from: d */
        public ImageView f1701d;

        /* JADX INFO: renamed from: e */
        public View f1702e;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, AbstractC6991a.c cVar, boolean z10) {
            int i10 = C6589a.f25025d;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f1698a = iArr;
            this.f1699b = cVar;
            C10357a1 c10357a1M39728v = C10357a1.m39728v(context, null, iArr, i10, 0);
            if (c10357a1M39728v.m39747s(0)) {
                setBackgroundDrawable(c10357a1M39728v.m39735g(0));
            }
            c10357a1M39728v.m39749x();
            if (z10) {
                setGravity(8388627);
            }
            m1993c();
        }

        /* JADX INFO: renamed from: a */
        public void m1991a(AbstractC6991a.c cVar) {
            this.f1699b = cVar;
            m1993c();
        }

        /* JADX INFO: renamed from: b */
        public AbstractC6991a.c m1992b() {
            return this.f1699b;
        }

        /* JADX INFO: renamed from: c */
        public void m1993c() {
            AbstractC6991a.c cVar = this.f1699b;
            View viewM29441b = cVar.m29441b();
            if (viewM29441b != null) {
                ViewParent parent = viewM29441b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM29441b);
                    }
                    addView(viewM29441b);
                }
                this.f1702e = viewM29441b;
                TextView textView = this.f1700c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1701d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1701d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1702e;
            if (view != null) {
                removeView(view);
                this.f1702e = null;
            }
            Drawable drawableM29442c = cVar.m29442c();
            CharSequence charSequenceM29443d = cVar.m29443d();
            if (drawableM29442c != null) {
                if (this.f1701d == null) {
                    C10395q c10395q = new C10395q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c10395q.setLayoutParams(layoutParams);
                    addView(c10395q, 0);
                    this.f1701d = c10395q;
                }
                this.f1701d.setImageDrawable(drawableM29442c);
                this.f1701d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1701d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1701d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM29443d);
            if (zIsEmpty) {
                TextView textView2 = this.f1700c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1700c.setText((CharSequence) null);
                }
            } else {
                if (this.f1700c == null) {
                    C10359b0 c10359b0 = new C10359b0(getContext(), null, C6589a.f25026e);
                    c10359b0.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c10359b0.setLayoutParams(layoutParams2);
                    addView(c10359b0);
                    this.f1700c = c10359b0;
                }
                this.f1700c.setText(charSequenceM29443d);
                this.f1700c.setVisibility(0);
            }
            ImageView imageView3 = this.f1701d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m29440a());
            }
            C10369e1.m39834a(this, zIsEmpty ? cVar.m29440a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (C0485c.this.f1690f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = C0485c.this.f1690f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1985a(int i10) {
        View childAt = this.f1687c.getChildAt(i10);
        Runnable runnable = this.f1685a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1685a = aVar;
        post(aVar);
    }

    /* JADX INFO: renamed from: b */
    public final Spinner m1986b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C6589a.f25029h);
        appCompatSpinner.setLayoutParams(new C0484b.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* JADX INFO: renamed from: c */
    public d m1987c(AbstractC6991a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1692h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f1686b == null) {
            this.f1686b = new c();
        }
        dVar.setOnClickListener(this.f1686b);
        return dVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1988d() {
        Spinner spinner = this.f1688d;
        return spinner != null && spinner.getParent() == this;
    }

    /* JADX INFO: renamed from: e */
    public final void m1989e() {
        if (m1988d()) {
            return;
        }
        if (this.f1688d == null) {
            this.f1688d = m1986b();
        }
        removeView(this.f1687c);
        addView(this.f1688d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1688d.getAdapter() == null) {
            this.f1688d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1685a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1685a = null;
        }
        this.f1688d.setSelection(this.f1693i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1990f() {
        if (!m1988d()) {
            return false;
        }
        removeView(this.f1688d);
        addView(this.f1687c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1688d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1685a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C9608a c9608aM37910b = C9608a.m37910b(getContext());
        setContentHeight(c9608aM37910b.m37915f());
        this.f1691g = c9608aM37910b.m37914e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1685a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).m1992b().m29444e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1687c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1690f = -1;
        } else {
            if (childCount > 2) {
                this.f1690f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1690f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1690f = Math.min(this.f1690f, this.f1691g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1692h, 1073741824);
        if (z10 || !this.f1689e) {
            m1990f();
        } else {
            this.f1687c.measure(0, iMakeMeasureSpec);
            if (this.f1687c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                m1989e();
            } else {
                m1990f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1693i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1689e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1692h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1693i = i10;
        int childCount = this.f1687c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1687c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                m1985a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1688d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
