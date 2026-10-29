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
import q.a1;
import q.b0;
import q.e1;
import q.q;

/* JADX INFO: loaded from: classes.dex */
public class c extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Interpolator f1284j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f1285a;
    public ViewOnClickListenerC0017c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.widget.b f1286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spinner f1287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1292i;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1293a;

        public a(View view) {
            this.f1293a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.smoothScrollTo(this.f1293a.getLeft() - ((c.this.getWidth() - this.f1293a.getWidth()) / 2), 0);
            c.this.f1285a = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return c.this.f1286c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) c.this.f1286c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return c.this.c((j.a.c) getItem(i10), true);
            }
            ((d) view).a((j.a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    public class ViewOnClickListenerC0017c implements View.OnClickListener {
        public ViewOnClickListenerC0017c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = c.this.f1286c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = c.this.f1286c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f1296a;
        public j.a.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f1297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f1298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f1299e;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, j.a.c cVar, boolean z10) {
            int i10 = i.a.f19888d;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f1296a = iArr;
            this.b = cVar;
            a1 a1VarV = a1.v(context, null, iArr, i10, 0);
            if (a1VarV.s(0)) {
                setBackgroundDrawable(a1VarV.g(0));
            }
            a1VarV.x();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(j.a.c cVar) {
            this.b = cVar;
            c();
        }

        public j.a.c b() {
            return this.b;
        }

        public void c() {
            j.a.c cVar = this.b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1299e = viewB;
                TextView textView = this.f1297c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1298d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1298d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1299e;
            if (view != null) {
                removeView(view);
                this.f1299e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f1298d == null) {
                    q qVar = new q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    qVar.setLayoutParams(layoutParams);
                    addView(qVar, 0);
                    this.f1298d = qVar;
                }
                this.f1298d.setImageDrawable(drawableC);
                this.f1298d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1298d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1298d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceD);
            if (zIsEmpty) {
                TextView textView2 = this.f1297c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1297c.setText((CharSequence) null);
                }
            } else {
                if (this.f1297c == null) {
                    b0 b0Var = new b0(getContext(), null, i.a.f19889e);
                    b0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    b0Var.setLayoutParams(layoutParams2);
                    addView(b0Var);
                    this.f1297c = b0Var;
                }
                this.f1297c.setText(charSequenceD);
                this.f1297c.setVisibility(0);
            }
            ImageView imageView3 = this.f1298d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            e1.a(this, zIsEmpty ? cVar.a() : null);
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
            if (c.this.f1289f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = c.this.f1289f;
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

    public void a(int i10) {
        View childAt = this.f1286c.getChildAt(i10);
        Runnable runnable = this.f1285a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1285a = aVar;
        post(aVar);
    }

    public final Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, i.a.f19892h);
        appCompatSpinner.setLayoutParams(new androidx.appcompat.widget.b.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public d c(j.a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1291h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.b == null) {
            this.b = new ViewOnClickListenerC0017c();
        }
        dVar.setOnClickListener(this.b);
        return dVar;
    }

    public final boolean d() {
        Spinner spinner = this.f1287d;
        return spinner != null && spinner.getParent() == this;
    }

    public final void e() {
        if (d()) {
            return;
        }
        if (this.f1287d == null) {
            this.f1287d = b();
        }
        removeView(this.f1286c);
        addView(this.f1287d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1287d.getAdapter() == null) {
            this.f1287d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1285a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1285a = null;
        }
        this.f1287d.setSelection(this.f1292i);
    }

    public final boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1287d);
        addView(this.f1286c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1287d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1285a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o.a aVarB = o.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f1290g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1285a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1286c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1289f = -1;
        } else {
            if (childCount > 2) {
                this.f1289f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1289f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1289f = Math.min(this.f1289f, this.f1290g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1291h, 1073741824);
        if (z10 || !this.f1288e) {
            f();
        } else {
            this.f1286c.measure(0, iMakeMeasureSpec);
            if (this.f1286c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1292i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1288e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1291h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1292i = i10;
        int childCount = this.f1286c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1286c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1287d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
