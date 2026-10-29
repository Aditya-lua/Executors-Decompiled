package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC0585b;
import p181i.C6589a;
import p181i.C6596h;
import p232k.C7399a;
import p365q.C10361c;

/* JADX INFO: loaded from: classes.dex */
public class ShareActionProvider extends AbstractC0585b {

    /* JADX INFO: renamed from: d */
    public int f1529d;

    /* JADX INFO: renamed from: e */
    public final MenuItemOnMenuItemClickListenerC0470a f1530e;

    /* JADX INFO: renamed from: f */
    public final Context f1531f;

    /* JADX INFO: renamed from: g */
    public String f1532g;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ShareActionProvider$a */
    public class MenuItemOnMenuItemClickListenerC0470a implements MenuItem.OnMenuItemClickListener {
        public MenuItemOnMenuItemClickListenerC0470a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent intentM39776b = C10361c.m39774d(shareActionProvider.f1531f, shareActionProvider.f1532g).m39776b(menuItem.getItemId());
            if (intentM39776b == null) {
                return true;
            }
            String action = intentM39776b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ShareActionProvider.this.m1869l(intentM39776b);
            }
            ShareActionProvider.this.f1531f.startActivity(intentM39776b);
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.f1529d = 4;
        this.f1530e = new MenuItemOnMenuItemClickListenerC0470a();
        this.f1532g = "share_history.xml";
        this.f1531f = context;
    }

    @Override // androidx.core.view.AbstractC0585b
    /* JADX INFO: renamed from: a */
    public boolean mo1866a() {
        return true;
    }

    @Override // androidx.core.view.AbstractC0585b
    /* JADX INFO: renamed from: c */
    public View mo1867c() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1531f);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C10361c.m39774d(this.f1531f, this.f1532g));
        }
        TypedValue typedValue = new TypedValue();
        this.f1531f.getTheme().resolveAttribute(C6589a.f25031j, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C7399a.m30679b(this.f1531f, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C6596h.f25198r);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C6596h.f25197q);
        return activityChooserView;
    }

    @Override // androidx.core.view.AbstractC0585b
    /* JADX INFO: renamed from: f */
    public void mo1868f(SubMenu subMenu) {
        subMenu.clear();
        C10361c c10361cM39774d = C10361c.m39774d(this.f1531f, this.f1532g);
        PackageManager packageManager = this.f1531f.getPackageManager();
        int iM39779f = c10361cM39774d.m39779f();
        int iMin = Math.min(iM39779f, this.f1529d);
        for (int i10 = 0; i10 < iMin; i10++) {
            ResolveInfo resolveInfoM39778e = c10361cM39774d.m39778e(i10);
            subMenu.add(0, i10, i10, resolveInfoM39778e.loadLabel(packageManager)).setIcon(resolveInfoM39778e.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1530e);
        }
        if (iMin < iM39779f) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f1531f.getString(C6596h.f25182b));
            for (int i11 = 0; i11 < iM39779f; i11++) {
                ResolveInfo resolveInfoM39778e2 = c10361cM39774d.m39778e(i11);
                subMenuAddSubMenu.add(0, i11, i11, resolveInfoM39778e2.loadLabel(packageManager)).setIcon(resolveInfoM39778e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1530e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1869l(Intent intent) {
        intent.addFlags(134742016);
    }
}
