package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import i.h;

/* JADX INFO: loaded from: classes.dex */
public class ShareActionProvider extends androidx.core.view.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1182g;

    public class a implements MenuItem.OnMenuItemClickListener {
        public a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent intentB = q.c.d(shareActionProvider.f1181f, shareActionProvider.f1182g).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ShareActionProvider.this.l(intentB);
            }
            ShareActionProvider.this.f1181f.startActivity(intentB);
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.f1179d = 4;
        this.f1180e = new a();
        this.f1182g = "share_history.xml";
        this.f1181f = context;
    }

    @Override // androidx.core.view.b
    public boolean a() {
        return true;
    }

    @Override // androidx.core.view.b
    public View c() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1181f);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(q.c.d(this.f1181f, this.f1182g));
        }
        TypedValue typedValue = new TypedValue();
        this.f1181f.getTheme().resolveAttribute(i.a.f19894j, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(k.a.b(this.f1181f, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(h.f20015r);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(h.f20014q);
        return activityChooserView;
    }

    @Override // androidx.core.view.b
    public void f(SubMenu subMenu) {
        subMenu.clear();
        q.c cVarD = q.c.d(this.f1181f, this.f1182g);
        PackageManager packageManager = this.f1181f.getPackageManager();
        int iF = cVarD.f();
        int iMin = Math.min(iF, this.f1179d);
        for (int i10 = 0; i10 < iMin; i10++) {
            ResolveInfo resolveInfoE = cVarD.e(i10);
            subMenu.add(0, i10, i10, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1180e);
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f1181f.getString(h.b));
            for (int i11 = 0; i11 < iF; i11++) {
                ResolveInfo resolveInfoE2 = cVarD.e(i11);
                subMenuAddSubMenu.add(0, i11, i11, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1180e);
            }
        }
    }

    public void l(Intent intent) {
        intent.addFlags(134742016);
    }
}
