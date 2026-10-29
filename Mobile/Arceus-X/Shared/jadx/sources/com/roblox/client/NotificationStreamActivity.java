package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import dk.C4637f;
import org.greenrobot.eventbus.ThreadMode;
import p138fv.InterfaceC5847j;
import p337ol.EnumC9799a;
import ph.C10258g;
import sg.C11295a1;
import sg.C11332l0;
import sg.C11335m0;
import sg.C11341o0;
import sg.C11347q0;
import vg.C12173c0;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationStreamActivity extends RobloxWebActivity {

    /* JADX INFO: renamed from: com.roblox.client.NotificationStreamActivity$a */
    public class MenuItemOnMenuItemClickListenerC3145a implements MenuItem.OnMenuItemClickListener {
        public MenuItemOnMenuItemClickListenerC3145a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            NotificationStreamActivity.this.m14821n2("SETTINGS_TAG", C11295a1.m42428X());
            return false;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.NotificationStreamActivity$b */
    public static /* synthetic */ class C3146b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11439a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f11439a = iArr;
            try {
                iArr[EnumC9799a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11439a[EnumC9799a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11439a[EnumC9799a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: o2 */
    private void m14819o2(Menu menu, MenuInflater menuInflater) {
        int i10;
        menuInflater.inflate(C11341o0.f39888d, menu);
        MenuItem menuItemFindItem = menu.findItem(C11335m0.f39801d);
        int i11 = C3146b.f11439a[new C4637f().getTheme().ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? C11332l0.f39761u : C11332l0.f39760t;
        } else {
            i10 = C11332l0.f39762v;
        }
        menuItemFindItem.setIcon(i10);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC3145a());
    }

    @Override // com.roblox.client.RobloxWebActivity
    /* JADX INFO: renamed from: m2 */
    public C12173c0.b mo14820m2() {
        return C12173c0.b.NOTIFICATION_STREAM_ACTIVITY;
    }

    /* JADX INFO: renamed from: n2 */
    public void m14821n2(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("URL_EXTRA", C11295a1.m42487y0());
            intent.putExtra("TITLE_EXTRA", getString(C11347q0.f39915H));
        }
        super.onCreate(bundle);
        m14819o2(this.f11619U.getMenu(), getMenuInflater());
    }

    @Override // com.roblox.client.RobloxWebActivity
    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C10258g c10258g) {
        m14821n2(c10258g.f36866a, c10258g.f36867b);
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.AbstractActivityC3152a, dk.C4636e.b
    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        Menu menu = this.f11619U.getMenu();
        menu.clear();
        m14819o2(menu, getMenuInflater());
        super.mo14822u(enumC9799a);
    }
}
