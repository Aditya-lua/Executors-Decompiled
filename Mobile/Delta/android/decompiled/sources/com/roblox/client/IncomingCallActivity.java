package com.roblox.client;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import b7.ImageViewTarget;
import com.roblox.client.IncomingCallActivity;
import e.u0;
import e.x;
import fv.j;
import k6.d0;
import oi.f;
import org.greenrobot.eventbus.ThreadMode;
import sg.m0;
import sg.n0;
import th.h;
import x6.ImageRequest;
import xl.g;

/* JADX INFO: loaded from: classes2.dex */
public class IncomingCallActivity extends j.b implements g.a {
    public long E;
    public String F;
    public ImageView G;
    public TextView H;

    public static /* synthetic */ WindowInsetsCompat F1(int i10, View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10 + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
        return windowInsetsCompat;
    }

    public static Intent H1(Context context, Intent intent, Intent intent2, long j10, String str, boolean z10) {
        return new Intent(context, (Class<?>) IncomingCallActivity.class).putExtra("EXTRA_ACCEPT_INTENT", intent).putExtra("EXTRA_IS_ACCEPT_ENABLED", z10).putExtra("EXTRA_DECLINE_INTENT", intent2).putExtra("EXTRA_CALLER_ID", j10).putExtra("EXTRA_CALLER_COMBINED_NAME", str);
    }

    @Override // xl.g.a
    public void C(String str, boolean z10) {
    }

    public final /* synthetic */ void I1(Intent intent, View view) {
        if (intent != null) {
            sendBroadcast(intent);
        }
        finish();
    }

    public final /* synthetic */ void J1(Intent intent, boolean z10, View view) {
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

    public final void K1(ImageView imageView, String str) {
        d0.a(this).c(new ImageRequest.a(this).c(str).v(new ImageViewTarget(imageView)).b());
    }

    @Override // xl.g.a
    public void V(String str) {
        finish();
    }

    @Override // xl.g.a
    public void m0(String str) {
    }

    @Override // xl.g.a
    public void o(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onAvatarHeadshotsRetrievedEvent(ph.b bVar) {
        if (bVar.a().contains(Long.valueOf(this.E))) {
            K1(this.G, dh.b.b().d(this.E).a());
        }
    }

    @Override // e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.b(this, u0.a(0, 0), u0.a(0, 0));
        setContentView(n0.f30877c);
        if (h.a().p0()) {
            View viewFindViewById = findViewById(m0.L);
            final int paddingBottom = viewFindViewById.getPaddingBottom();
            o0.A0(viewFindViewById, new y() { // from class: sg.a0
                @Override // androidx.core.view.y
                public final WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
                    return IncomingCallActivity.F1(paddingBottom, view, windowInsetsCompat);
                }
            });
        }
        this.E = getIntent().getLongExtra("EXTRA_CALLER_ID", 0L);
        this.F = getIntent().getStringExtra("EXTRA_CALLER_COMBINED_NAME");
        final Intent intent = (Intent) getIntent().getParcelableExtra("EXTRA_ACCEPT_INTENT");
        final boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_IS_ACCEPT_ENABLED", true);
        final Intent intent2 = (Intent) getIntent().getParcelableExtra("EXTRA_DECLINE_INTENT");
        findViewById(m0.J).setOnClickListener(new View.OnClickListener() { // from class: sg.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30738a.I1(intent2, view);
            }
        });
        findViewById(m0.I).setOnClickListener(new View.OnClickListener() { // from class: sg.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30745a.J1(intent, booleanExtra, view);
            }
        });
        ImageView imageView = (ImageView) findViewById(m0.K);
        this.G = imageView;
        imageView.setClipToOutline(true);
        TextView textView = (TextView) findViewById(m0.M);
        this.H = textView;
        textView.setText(this.F);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(6815873);
        }
        fv.c.d().n(this);
        g.x().g(this);
        if (this.E > 0) {
            dh.a aVarD = dh.b.b().d(this.E);
            if (aVarD == null) {
                f.b(this.E);
            } else if (aVarD.a() == null) {
                f.a(this.E);
            } else {
                K1(this.G, aVarD.a());
            }
        }
    }

    @Override // j.b, e4.q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(false);
            setTurnScreenOn(false);
        } else {
            getWindow().clearFlags(6815873);
        }
        this.G = null;
        this.H = null;
        fv.c.d().p(this);
        g.x().w(this);
    }

    @Override // xl.g.a
    public void p(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // xl.g.a
    public void v(String str, String str2) {
        finish();
    }
}
