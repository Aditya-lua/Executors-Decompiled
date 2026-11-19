package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import bh.a1;
import bh.l0;
import bh.m0;
import bh.o0;
import bh.q0;
import eh.v0;
import lk.f;
import mw.j;
import org.greenrobot.eventbus.ThreadMode;
import yh.g;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationStreamActivity extends RobloxWebActivity {

    public class a implements MenuItem.OnMenuItemClickListener {
        public a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            NotificationStreamActivity.this.n2("SETTINGS_TAG", a1.X());
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8787a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f8787a = iArr;
            try {
                iArr[cm.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8787a[cm.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8787a[cm.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void o2(Menu menu, MenuInflater menuInflater) {
        int i10;
        menuInflater.inflate(o0.f4214d, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f4134d);
        int i11 = b.f8787a[new f().getTheme().ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? l0.f4121u : l0.f4120t;
        } else {
            i10 = l0.f4122v;
        }
        menuItemFindItem.setIcon(i10);
        menuItemFindItem.setOnMenuItemClickListener(new a());
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.a, lk.e.b
    public void g0(cm.a aVar) {
        Menu menu = this.U.getMenu();
        menu.clear();
        o2(menu, getMenuInflater());
        super.g0(aVar);
    }

    @Override // com.roblox.client.RobloxWebActivity
    public v0.b m2() {
        return v0.b.NOTIFICATION_STREAM_ACTIVITY;
    }

    public void n2(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.a, com.roblox.client.b, f4.v, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("URL_EXTRA", a1.y0());
            intent.putExtra("TITLE_EXTRA", getString(q0.H));
        }
        super.onCreate(bundle);
        o2(this.U.getMenu(), getMenuInflater());
    }

    @Override // com.roblox.client.RobloxWebActivity
    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        n2(gVar.f37866a, gVar.b);
    }
}
