package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import dk.f;
import fv.j;
import org.greenrobot.eventbus.ThreadMode;
import ph.g;
import sg.a1;
import sg.l0;
import sg.m0;
import sg.o0;
import sg.q0;
import vg.c0;

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
        public static final /* synthetic */ int[] f8902a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f8902a = iArr;
            try {
                iArr[ol.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8902a[ol.a.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8902a[ol.a.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void o2(Menu menu, MenuInflater menuInflater) {
        int i10;
        menuInflater.inflate(o0.f30907d, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f30830d);
        int i11 = b.f8902a[new f().getTheme().ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? l0.f30817u : l0.f30816t;
        } else {
            i10 = l0.f30818v;
        }
        menuItemFindItem.setIcon(i10);
        menuItemFindItem.setOnMenuItemClickListener(new a());
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
        n2(gVar.f28613a, gVar.b);
    }

    @Override // com.roblox.client.RobloxWebActivity, com.roblox.client.a, dk.e.b
    public void u(ol.a aVar) {
        Menu menu = this.U.getMenu();
        menu.clear();
        o2(menu, getMenuInflater());
        super.u(aVar);
    }
}
