package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import bk.f;
import dv.j;
import oh.g;
import org.greenrobot.eventbus.ThreadMode;
import rg.a1;
import rg.l0;
import rg.m0;
import rg.o0;
import rg.q0;
import ug.c0;

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
        public static final /* synthetic */ int[] f8970a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f8970a = iArr;
            try {
                iArr[ml.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8970a[ml.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8970a[ml.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void o2(Menu menu, MenuInflater menuInflater) {
        int i10;
        menuInflater.inflate(o0.f30512d, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f30433d);
        int i11 = b.f8970a[new f().getTheme().ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? l0.f30420u : l0.f30419t;
        } else {
            i10 = l0.f30421v;
        }
        menuItemFindItem.setIcon(i10);
        menuItemFindItem.setOnMenuItemClickListener(new a());
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.a, bk.e.b
    public void a0(ml.a aVar) {
        Menu menu = this.U.getMenu();
        menu.clear();
        o2(menu, getMenuInflater());
        super.a0(aVar);
    }

    @Override // com.roblox.client.RobloxWebActivity
    public c0.b m2() {
        return c0.b.NOTIFICATION_STREAM_ACTIVITY;
    }

    public void n2(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
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
        n2(gVar.f27892a, gVar.b);
    }
}
