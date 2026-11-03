package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import i.h;
import i.j;
import q.a1;
import q.n0;
import q.o0;
import y2.p;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f914a;
    public final g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.core.view.b f922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DataSetObserver f923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o0 f925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f930r;

    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f931a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            a1 a1VarU = a1.u(context, attributeSet, f931a);
            setBackgroundDrawable(a1VarU.g(0));
            a1VarU.x();
        }
    }

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f914a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f914a.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                androidx.core.view.b bVar = ActivityChooserView.this.f922j;
                if (bVar != null) {
                    bVar.k(true);
                }
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        public c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            p.O0(accessibilityNodeInfo).i0(true);
        }
    }

    public class d extends n0 {
        public d(View view) {
            super(view);
        }

        @Override // q.n0
        public p.f b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // q.n0
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // q.n0
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    public class f extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q.c f937a;
        public int b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f940e;

        public f() {
        }

        public int a() {
            return this.f937a.f();
        }

        public q.c b() {
            return this.f937a;
        }

        public ResolveInfo c() {
            return this.f937a.h();
        }

        public int d() {
            return this.f937a.i();
        }

        public boolean e() {
            return this.f938c;
        }

        public int f() {
            int i10 = this.b;
            this.b = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i11 = 0; i11 < count; i11++) {
                view = getView(i11, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.b = i10;
            return iMax;
        }

        public void g(q.c cVar) {
            q.c cVarB = ActivityChooserView.this.f914a.b();
            if (cVarB != null && ActivityChooserView.this.isShown()) {
                cVarB.unregisterObserver(ActivityChooserView.this.f923k);
            }
            this.f937a = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f923k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iF = this.f937a.f();
            if (!this.f938c && this.f937a.h() != null) {
                iF--;
            }
            int iMin = Math.min(iF, this.b);
            return this.f940e ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f938c && this.f937a.h() != null) {
                i10++;
            }
            return this.f937a.e(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return (this.f940e && i10 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(i.g.f20099f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(i.f.R)).setText(ActivityChooserView.this.getContext().getString(h.b));
                return viewInflate;
            }
            if (view == null || view.getId() != i.f.f20092x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(i.g.f20099f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(i.f.f20090v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(i.f.R)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f938c && i10 == 0 && this.f939d) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i10) {
            if (this.b != i10) {
                this.b = i10;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z10, boolean z11) {
            if (this.f938c == z10 && this.f939d == z11) {
                return;
            }
            this.f938c = z10;
            this.f939d = z11;
            notifyDataSetChanged();
        }

        public void j(boolean z10) {
            if (this.f940e != z10) {
                this.f940e = z10;
                notifyDataSetChanged();
            }
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f926n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f919g) {
                if (view != activityChooserView.f917e) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f927o = false;
                activityChooserView.d(activityChooserView.f928p);
                return;
            }
            activityChooserView.a();
            Intent intentB = ActivityChooserView.this.f914a.b().b(ActivityChooserView.this.f914a.b().g(ActivityChooserView.this.f914a.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            androidx.core.view.b bVar = ActivityChooserView.this.f922j;
            if (bVar != null) {
                bVar.k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f927o) {
                if (i10 > 0) {
                    activityChooserView.f914a.b().o(i10);
                    return;
                }
                return;
            }
            if (!activityChooserView.f914a.e()) {
                i10++;
            }
            Intent intentB = ActivityChooserView.this.f914a.b().b(i10);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f919g) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f914a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f927o = true;
                activityChooserView2.d(activityChooserView2.f928p);
            }
            return true;
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f924l);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().a();
    }

    public boolean c() {
        if (b() || !this.f929q) {
            return false;
        }
        this.f927o = false;
        d(this.f928p);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void d(int i10) {
        if (this.f914a.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f924l);
        ?? r8 = this.f919g.getVisibility() == 0 ? 1 : 0;
        int iA = this.f914a.a();
        if (i10 == Integer.MAX_VALUE || iA <= i10 + r8) {
            this.f914a.j(false);
            this.f914a.h(i10);
        } else {
            this.f914a.j(true);
            this.f914a.h(i10 - 1);
        }
        o0 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.a()) {
            return;
        }
        if (this.f927o || r8 == 0) {
            this.f914a.i(true, r8);
        } else {
            this.f914a.i(false, false);
        }
        listPopupWindow.E(Math.min(this.f914a.f(), this.f921i));
        listPopupWindow.show();
        androidx.core.view.b bVar = this.f922j;
        if (bVar != null) {
            bVar.k(true);
        }
        listPopupWindow.o().setContentDescription(getContext().getString(h.f20116c));
        listPopupWindow.o().setSelector(new ColorDrawable(0));
    }

    public void e() {
        if (this.f914a.getCount() > 0) {
            this.f917e.setEnabled(true);
        } else {
            this.f917e.setEnabled(false);
        }
        int iA = this.f914a.a();
        int iD = this.f914a.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.f919g.setVisibility(0);
            ResolveInfo resolveInfoC = this.f914a.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f920h.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.f930r != 0) {
                this.f919g.setContentDescription(getContext().getString(this.f930r, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.f919g.setVisibility(8);
        }
        if (this.f919g.getVisibility() == 0) {
            this.f915c.setBackgroundDrawable(this.f916d);
        } else {
            this.f915c.setBackgroundDrawable(null);
        }
    }

    public q.c getDataModel() {
        return this.f914a.b();
    }

    public o0 getListPopupWindow() {
        if (this.f925m == null) {
            o0 o0Var = new o0(getContext());
            this.f925m = o0Var;
            o0Var.m(this.f914a);
            this.f925m.C(this);
            this.f925m.I(true);
            this.f925m.K(this.b);
            this.f925m.J(this.b);
        }
        return this.f925m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q.c cVarB = this.f914a.b();
        if (cVarB != null) {
            cVarB.registerObserver(this.f923k);
        }
        this.f929q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q.c cVarB = this.f914a.b();
        if (cVarB != null) {
            cVarB.unregisterObserver(this.f923k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f924l);
        }
        if (b()) {
            a();
        }
        this.f929q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f915c.layout(0, 0, i12 - i10, i13 - i11);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        View view = this.f915c;
        if (this.f919g.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(q.c cVar) {
        this.f914a.g(cVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f930r = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f918f.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f918f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f928p = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f926n = onDismissListener;
    }

    public void setProvider(androidx.core.view.b bVar) {
        this.f922j = bVar;
    }

    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f923k = new a();
        this.f924l = new b();
        this.f928p = 4;
        int[] iArr = j.E;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        androidx.core.view.o0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        this.f928p = typedArrayObtainStyledAttributes.getInt(j.G, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(j.F);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(i.g.f20098e, (ViewGroup) this, true);
        g gVar = new g();
        this.b = gVar;
        View viewFindViewById = findViewById(i.f.f20078j);
        this.f915c = viewFindViewById;
        this.f916d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(i.f.f20086r);
        this.f919g = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i11 = i.f.f20091w;
        this.f920h = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(i.f.f20088t);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f917e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i11);
        this.f918f = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f914a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f921i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f20037d));
    }
}
