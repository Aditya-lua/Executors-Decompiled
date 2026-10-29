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
import androidx.core.view.AbstractC0585b;
import androidx.core.view.C0625o0;
import p181i.C6592d;
import p181i.C6594f;
import p181i.C6595g;
import p181i.C6596h;
import p181i.C6598j;
import p346p.InterfaceC10082f;
import p365q.AbstractViewOnTouchListenerC10390n0;
import p365q.C10357a1;
import p365q.C10361c;
import p365q.C10392o0;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0441f f1379a;

    /* JADX INFO: renamed from: b */
    public final ViewOnClickListenerC0442g f1380b;

    /* JADX INFO: renamed from: c */
    public final View f1381c;

    /* JADX INFO: renamed from: d */
    public final Drawable f1382d;

    /* JADX INFO: renamed from: e */
    public final FrameLayout f1383e;

    /* JADX INFO: renamed from: f */
    public final ImageView f1384f;

    /* JADX INFO: renamed from: g */
    public final FrameLayout f1385g;

    /* JADX INFO: renamed from: h */
    public final ImageView f1386h;

    /* JADX INFO: renamed from: i */
    public final int f1387i;

    /* JADX INFO: renamed from: j */
    public AbstractC0585b f1388j;

    /* JADX INFO: renamed from: k */
    public final DataSetObserver f1389k;

    /* JADX INFO: renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener f1390l;

    /* JADX INFO: renamed from: m */
    public C10392o0 f1391m;

    /* JADX INFO: renamed from: n */
    public PopupWindow.OnDismissListener f1392n;

    /* JADX INFO: renamed from: o */
    public boolean f1393o;

    /* JADX INFO: renamed from: p */
    public int f1394p;

    /* JADX INFO: renamed from: q */
    public boolean f1395q;

    /* JADX INFO: renamed from: r */
    public int f1396r;

    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public static final int[] f1397a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C10357a1 c10357a1M39727u = C10357a1.m39727u(context, attributeSet, f1397a);
            setBackgroundDrawable(c10357a1M39727u.m39735g(0));
            c10357a1M39727u.m39749x();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0436a extends DataSetObserver {
        public C0436a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1379a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1379a.notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0437b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0437b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m1769b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                AbstractC0585b abstractC0585b = ActivityChooserView.this.f1388j;
                if (abstractC0585b != null) {
                    abstractC0585b.m2814k(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0438c extends View.AccessibilityDelegate {
        public C0438c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C13017p.m48342O0(accessibilityNodeInfo).m48402i0(true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0439d extends AbstractViewOnTouchListenerC10390n0 {
        public C0439d(View view) {
            super(view);
        }

        @Override // p365q.AbstractViewOnTouchListenerC10390n0
        /* JADX INFO: renamed from: b */
        public InterfaceC10082f mo1542b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // p365q.AbstractViewOnTouchListenerC10390n0
        /* JADX INFO: renamed from: c */
        public boolean mo1543c() {
            ActivityChooserView.this.m1770c();
            return true;
        }

        @Override // p365q.AbstractViewOnTouchListenerC10390n0
        /* JADX INFO: renamed from: d */
        public boolean mo1773d() {
            ActivityChooserView.this.m1768a();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0440e extends DataSetObserver {
        public C0440e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m1772e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0441f extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public C10361c f1403a;

        /* JADX INFO: renamed from: b */
        public int f1404b = 4;

        /* JADX INFO: renamed from: c */
        public boolean f1405c;

        /* JADX INFO: renamed from: d */
        public boolean f1406d;

        /* JADX INFO: renamed from: e */
        public boolean f1407e;

        public C0441f() {
        }

        /* JADX INFO: renamed from: a */
        public int m1774a() {
            return this.f1403a.m39779f();
        }

        /* JADX INFO: renamed from: b */
        public C10361c m1775b() {
            return this.f1403a;
        }

        /* JADX INFO: renamed from: c */
        public ResolveInfo m1776c() {
            return this.f1403a.m39781h();
        }

        /* JADX INFO: renamed from: d */
        public int m1777d() {
            return this.f1403a.m39782i();
        }

        /* JADX INFO: renamed from: e */
        public boolean m1778e() {
            return this.f1405c;
        }

        /* JADX INFO: renamed from: f */
        public int m1779f() {
            int i10 = this.f1404b;
            this.f1404b = Integer.MAX_VALUE;
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
            this.f1404b = i10;
            return iMax;
        }

        /* JADX INFO: renamed from: g */
        public void m1780g(C10361c c10361c) {
            C10361c c10361cM1775b = ActivityChooserView.this.f1379a.m1775b();
            if (c10361cM1775b != null && ActivityChooserView.this.isShown()) {
                c10361cM1775b.unregisterObserver(ActivityChooserView.this.f1389k);
            }
            this.f1403a = c10361c;
            if (c10361c != null && ActivityChooserView.this.isShown()) {
                c10361c.registerObserver(ActivityChooserView.this.f1389k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iM39779f = this.f1403a.m39779f();
            if (!this.f1405c && this.f1403a.m39781h() != null) {
                iM39779f--;
            }
            int iMin = Math.min(iM39779f, this.f1404b);
            return this.f1407e ? iMin + 1 : iMin;
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
            if (!this.f1405c && this.f1403a.m39781h() != null) {
                i10++;
            }
            return this.f1403a.m39778e(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return (this.f1407e && i10 == getCount() - 1) ? 1 : 0;
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
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C6595g.f25165f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(C6594f.f25130R)).setText(ActivityChooserView.this.getContext().getString(C6596h.f25182b));
                return viewInflate;
            }
            if (view == null || view.getId() != C6594f.f25157x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C6595g.f25165f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C6594f.f25155v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C6594f.f25130R)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f1405c && i10 == 0 && this.f1406d) {
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

        /* JADX INFO: renamed from: h */
        public void m1781h(int i10) {
            if (this.f1404b != i10) {
                this.f1404b = i10;
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: i */
        public void m1782i(boolean z10, boolean z11) {
            if (this.f1405c == z10 && this.f1406d == z11) {
                return;
            }
            this.f1405c = z10;
            this.f1406d = z11;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: j */
        public void m1783j(boolean z10) {
            if (this.f1407e != z10) {
                this.f1407e = z10;
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class ViewOnClickListenerC0442g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC0442g() {
        }

        /* JADX INFO: renamed from: a */
        public final void m1784a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1392n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1385g) {
                if (view != activityChooserView.f1383e) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f1393o = false;
                activityChooserView.m1771d(activityChooserView.f1394p);
                return;
            }
            activityChooserView.m1768a();
            Intent intentM39776b = ActivityChooserView.this.f1379a.m1775b().m39776b(ActivityChooserView.this.f1379a.m1775b().m39780g(ActivityChooserView.this.f1379a.m1776c()));
            if (intentM39776b != null) {
                intentM39776b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentM39776b);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m1784a();
            AbstractC0585b abstractC0585b = ActivityChooserView.this.f1388j;
            if (abstractC0585b != null) {
                abstractC0585b.m2814k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((C0441f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.m1771d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.m1768a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f1393o) {
                if (i10 > 0) {
                    activityChooserView.f1379a.m1775b().m39788o(i10);
                    return;
                }
                return;
            }
            if (!activityChooserView.f1379a.m1778e()) {
                i10++;
            }
            Intent intentM39776b = ActivityChooserView.this.f1379a.m1775b().m39776b(i10);
            if (intentM39776b != null) {
                intentM39776b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentM39776b);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1385g) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f1379a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f1393o = true;
                activityChooserView2.m1771d(activityChooserView2.f1394p);
            }
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1768a() {
        if (!m1769b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1390l);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1769b() {
        return getListPopupWindow().mo1574a();
    }

    /* JADX INFO: renamed from: c */
    public boolean m1770c() {
        if (m1769b() || !this.f1395q) {
            return false;
        }
        this.f1393o = false;
        m1771d(this.f1394p);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: androidx.appcompat.widget.ActivityChooserView$f */
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
    /* JADX INFO: renamed from: d */
    public void m1771d(int i10) {
        if (this.f1379a.m1775b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1390l);
        ?? r8 = this.f1385g.getVisibility() == 0 ? 1 : 0;
        int iM1774a = this.f1379a.m1774a();
        if (i10 == Integer.MAX_VALUE || iM1774a <= i10 + r8) {
            this.f1379a.m1783j(false);
            this.f1379a.m1781h(i10);
        } else {
            this.f1379a.m1783j(true);
            this.f1379a.m1781h(i10 - 1);
        }
        C10392o0 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.mo1574a()) {
            return;
        }
        if (this.f1393o || r8 == 0) {
            this.f1379a.m1782i(true, r8);
        } else {
            this.f1379a.m1782i(false, false);
        }
        listPopupWindow.m39942E(Math.min(this.f1379a.m1779f(), this.f1387i));
        listPopupWindow.show();
        AbstractC0585b abstractC0585b = this.f1388j;
        if (abstractC0585b != null) {
            abstractC0585b.m2814k(true);
        }
        listPopupWindow.mo1579o().setContentDescription(getContext().getString(C6596h.f25183c));
        listPopupWindow.mo1579o().setSelector(new ColorDrawable(0));
    }

    /* JADX INFO: renamed from: e */
    public void m1772e() {
        if (this.f1379a.getCount() > 0) {
            this.f1383e.setEnabled(true);
        } else {
            this.f1383e.setEnabled(false);
        }
        int iM1774a = this.f1379a.m1774a();
        int iM1777d = this.f1379a.m1777d();
        if (iM1774a == 1 || (iM1774a > 1 && iM1777d > 0)) {
            this.f1385g.setVisibility(0);
            ResolveInfo resolveInfoM1776c = this.f1379a.m1776c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1386h.setImageDrawable(resolveInfoM1776c.loadIcon(packageManager));
            if (this.f1396r != 0) {
                this.f1385g.setContentDescription(getContext().getString(this.f1396r, resolveInfoM1776c.loadLabel(packageManager)));
            }
        } else {
            this.f1385g.setVisibility(8);
        }
        if (this.f1385g.getVisibility() == 0) {
            this.f1381c.setBackgroundDrawable(this.f1382d);
        } else {
            this.f1381c.setBackgroundDrawable(null);
        }
    }

    public C10361c getDataModel() {
        return this.f1379a.m1775b();
    }

    public C10392o0 getListPopupWindow() {
        if (this.f1391m == null) {
            C10392o0 c10392o0 = new C10392o0(getContext());
            this.f1391m = c10392o0;
            c10392o0.mo1805m(this.f1379a);
            this.f1391m.m39940C(this);
            this.f1391m.m39946I(true);
            this.f1391m.m39948K(this.f1380b);
            this.f1391m.m39947J(this.f1380b);
        }
        return this.f1391m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10361c c10361cM1775b = this.f1379a.m1775b();
        if (c10361cM1775b != null) {
            c10361cM1775b.registerObserver(this.f1389k);
        }
        this.f1395q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10361c c10361cM1775b = this.f1379a.m1775b();
        if (c10361cM1775b != null) {
            c10361cM1775b.unregisterObserver(this.f1389k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1390l);
        }
        if (m1769b()) {
            m1768a();
        }
        this.f1395q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f1381c.layout(0, 0, i12 - i10, i13 - i11);
        if (m1769b()) {
            return;
        }
        m1768a();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        View view = this.f1381c;
        if (this.f1385g.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C10361c c10361c) {
        this.f1379a.m1780g(c10361c);
        if (m1769b()) {
            m1768a();
            m1770c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f1396r = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f1384f.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1384f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f1394p = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1392n = onDismissListener;
    }

    public void setProvider(AbstractC0585b abstractC0585b) {
        this.f1388j = abstractC0585b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1389k = new C0436a();
        this.f1390l = new ViewTreeObserverOnGlobalLayoutListenerC0437b();
        this.f1394p = 4;
        int[] iArr = C6598j.f25222E;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C0625o0.m3036k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        this.f1394p = typedArrayObtainStyledAttributes.getInt(C6598j.f25232G, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C6598j.f25227F);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C6595g.f25164e, (ViewGroup) this, true);
        ViewOnClickListenerC0442g viewOnClickListenerC0442g = new ViewOnClickListenerC0442g();
        this.f1380b = viewOnClickListenerC0442g;
        View viewFindViewById = findViewById(C6594f.f25143j);
        this.f1381c = viewFindViewById;
        this.f1382d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C6594f.f25151r);
        this.f1385g = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0442g);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0442g);
        int i11 = C6594f.f25156w;
        this.f1386h = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C6594f.f25153t);
        frameLayout2.setOnClickListener(viewOnClickListenerC0442g);
        frameLayout2.setAccessibilityDelegate(new C0438c());
        frameLayout2.setOnTouchListener(new C0439d(frameLayout2));
        this.f1383e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i11);
        this.f1384f = imageView;
        imageView.setImageDrawable(drawable);
        C0441f c0441f = new C0441f();
        this.f1379a = c0441f;
        c0441f.registerDataSetObserver(new C0440e());
        Resources resources = context.getResources();
        this.f1387i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6592d.f25060d));
    }
}
