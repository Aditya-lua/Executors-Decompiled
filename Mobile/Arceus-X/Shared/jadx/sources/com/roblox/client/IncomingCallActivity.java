package com.roblox.client;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import com.roblox.client.IncomingCallActivity;
import org.greenrobot.eventbus.ThreadMode;
import p027b7.ImageViewTarget;
import p078dh.C4607a;
import p078dh.C4608b;
import p088e.C4733u0;
import p088e.C4738x;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p203j.ActivityC6992b;
import p239k6.C7458d0;
import p333oi.C9740f;
import p537x6.ImageRequest;
import p551xl.C12864g;
import ph.C10253b;
import sg.C11335m0;
import sg.C11338n0;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
public class IncomingCallActivity extends ActivityC6992b implements C12864g.a {

    /* JADX INFO: renamed from: E */
    public long f11430E;

    /* JADX INFO: renamed from: F */
    public String f11431F;

    /* JADX INFO: renamed from: G */
    public ImageView f11432G;

    /* JADX INFO: renamed from: H */
    public TextView f11433H;

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ WindowInsetsCompat m14805F1(int i10, View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10 + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: H1 */
    public static Intent m14807H1(Context context, Intent intent, Intent intent2, long j10, String str, boolean z10) {
        return new Intent(context, (Class<?>) IncomingCallActivity.class).putExtra("EXTRA_ACCEPT_INTENT", intent).putExtra("EXTRA_IS_ACCEPT_ENABLED", z10).putExtra("EXTRA_DECLINE_INTENT", intent2).putExtra("EXTRA_CALLER_ID", j10).putExtra("EXTRA_CALLER_COMBINED_NAME", str);
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: C */
    public void mo14808C(String str, boolean z10) {
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m14809I1(Intent intent, View view) {
        if (intent != null) {
            sendBroadcast(intent);
        }
        finish();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m14810J1(Intent intent, boolean z10, View view) {
        if (intent != null) {
            if (z10) {
                startActivity(intent);
                ((KeyguardManager) getSystemService("keyguard")).requestDismissKeyguard(this, null);
            } else {
                sendBroadcast(intent);
            }
        }
        finish();
    }

    /* JADX INFO: renamed from: K1 */
    public final void m14811K1(ImageView imageView, String str) {
        C7458d0.m30978a(this).mo31067c(new ImageRequest.a(this).m47525c(str).m47543v(new ImageViewTarget(imageView)).m47524b());
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: V */
    public void mo14812V(String str) {
        finish();
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: m0 */
    public void mo14813m0(String str) {
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: o */
    public void mo14814o(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onAvatarHeadshotsRetrievedEvent(C10253b c10253b) {
        if (c10253b.m39406a().contains(Long.valueOf(this.f11430E))) {
            m14811K1(this.f11432G, C4608b.m22756b().m22759d(this.f11430E).m22747a());
        }
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4738x.m23111b(this, C4733u0.m23087a(0, 0), C4733u0.m23087a(0, 0));
        setContentView(C11338n0.f39856c);
        if (C11659h.m43403a().mo43723t0()) {
            View viewFindViewById = findViewById(C11335m0.f39780L);
            final int paddingBottom = viewFindViewById.getPaddingBottom();
            C0625o0.m2979A0(viewFindViewById, new InterfaceC0644y() { // from class: sg.a0
                @Override // androidx.core.view.InterfaceC0644y
                /* JADX INFO: renamed from: K */
                public final WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
                    return IncomingCallActivity.m14805F1(paddingBottom, view, windowInsetsCompat);
                }
            });
        }
        this.f11430E = getIntent().getLongExtra("EXTRA_CALLER_ID", 0L);
        this.f11431F = getIntent().getStringExtra("EXTRA_CALLER_COMBINED_NAME");
        final Intent intent = (Intent) getIntent().getParcelableExtra("EXTRA_ACCEPT_INTENT");
        final boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_IS_ACCEPT_ENABLED", true);
        final Intent intent2 = (Intent) getIntent().getParcelableExtra("EXTRA_DECLINE_INTENT");
        findViewById(C11335m0.f39778J).setOnClickListener(new View.OnClickListener() { // from class: sg.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39663a.m14809I1(intent2, view);
            }
        });
        findViewById(C11335m0.f39777I).setOnClickListener(new View.OnClickListener() { // from class: sg.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39673a.m14810J1(intent, booleanExtra, view);
            }
        });
        ImageView imageView = (ImageView) findViewById(C11335m0.f39779K);
        this.f11432G = imageView;
        imageView.setClipToOutline(true);
        TextView textView = (TextView) findViewById(C11335m0.f39781M);
        this.f11433H = textView;
        textView.setText(this.f11431F);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(6815873);
        }
        C5840c.m26204d().m26215n(this);
        C12864g.m47841x().m47842g(this);
        if (this.f11430E > 0) {
            C4607a c4607aM22759d = C4608b.m22756b().m22759d(this.f11430E);
            if (c4607aM22759d == null) {
                C9740f.m38536b(this.f11430E);
            } else if (c4607aM22759d.m22747a() == null) {
                C9740f.m38535a(this.f11430E);
            } else {
                m14811K1(this.f11432G, c4607aM22759d.m22747a());
            }
        }
    }

    @Override // p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(false);
            setTurnScreenOn(false);
        } else {
            getWindow().clearFlags(6815873);
        }
        this.f11432G = null;
        this.f11433H = null;
        C5840c.m26204d().m26217p(this);
        C12864g.m47841x().m47858w(this);
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: p */
    public void mo14815p(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: v */
    public void mo14816v(String str, String str2) {
        finish();
    }
}
