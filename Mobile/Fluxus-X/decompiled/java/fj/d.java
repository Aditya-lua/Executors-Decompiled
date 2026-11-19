package fj;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p000lifecycle.r;
import bh.a1;
import bh.e0;
import bh.e2;
import bh.g0;
import bh.j0;
import bh.k0;
import bh.l0;
import bh.m0;
import bh.o0;
import bh.q0;
import com.roblox.client.NotificationStreamActivity;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.platform.util.DeviceUtils;
import f4.q;
import f4.v;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16125a;
    public v b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lk.c f16126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuItem f16129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f16130g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.e();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16132a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f16132a = iArr;
            try {
                iArr[cm.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16132a[cm.a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(q qVar) {
        this(qVar, new lk.f());
    }

    public final int a() {
        if (b.f16132a[this.f16126c.getTheme().ordinal()] != 1) {
            return this.f16128e;
        }
        return -1;
    }

    public final int b() {
        return b.f16132a[this.f16126c.getTheme().ordinal()] != 1 ? l0.f4111k : l0.f4112l;
    }

    public final int c() {
        return b.f16132a[this.f16126c.getTheme().ordinal()] != 1 ? l0.f4123w : l0.f4124x;
    }

    public MenuItem d(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.f4212a, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f4129a);
        this.f16129f = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        ImageView imageView = (ImageView) actionView.findViewById(m0.Y);
        TextView textView = (TextView) actionView.findViewById(m0.Z);
        this.f16130g = textView;
        h(textView, this.f16127d);
        imageView.setOnClickListener(new a());
        imageView.setImageResource(c());
        this.f16130g.setBackgroundResource(b());
        this.f16130g.setTextColor(a());
        return this.f16129f;
    }

    public void e() {
        f(null);
    }

    public void f(r rVar) {
        if (this.b == null) {
            return;
        }
        nk.c.c().s(0);
        this.f16127d = 0;
        TextView textView = this.f16130g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        cl.g.d().g().clearStreamUnread().L(new el.a());
        if (!a1.p0()) {
            i(rVar);
            return;
        }
        Intent intent = new Intent(this.b, (Class<?>) NotificationStreamActivity.class);
        if (rVar != null) {
            intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", true);
        }
        this.b.startActivityForResult(intent, 20110);
        if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            this.b.overridePendingTransition(0, 0);
        } else {
            this.b.overridePendingTransition(g0.b, R.anim.fade_out);
        }
    }

    public final void g(int i10) {
        this.f16127d = i10;
        h((TextView) this.f16129f.getActionView().findViewById(m0.Z), this.f16127d);
    }

    public final void h(TextView textView, int i10) {
        if (i10 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (i10 > 99) {
            textView.setText(textView.getContext().getString(q0.Q));
        } else {
            textView.setText(yi.e.a(i10));
        }
    }

    public final void i(r rVar) {
        Point screenSize = DeviceUtils.getScreenSize(this.b);
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(k0.f4096c);
        int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(k0.b);
        int iE = (int) e2.e(this.b, 80);
        int iE2 = (int) e2.e(this.b, 420);
        int i10 = ((screenSize.y - dimensionPixelSize2) - dimensionPixelSize) - iE;
        int iE3 = (int) e2.e(this.b, 15);
        e0 e0Var = new e0();
        e0Var.r2(2, 0);
        Bundle bundle = new Bundle();
        bundle.putInt("dialogWidth", iE2);
        bundle.putInt("dialogHeight", i10);
        bundle.putInt("dialogGravity", 53);
        bundle.putInt("dialogOffsetY", dimensionPixelSize);
        bundle.putInt("dialogOffsetX", iE3);
        bundle.putString("DEFAULT_URL", a1.y0());
        e0Var.O1(bundle);
        if (rVar != null) {
            e0Var.a().a(rVar);
        }
        e0Var.t2(this.b.l1(), "NOTIFICATION_STREAM_TAG");
    }

    public void j() {
        q qVarN0 = this.b.l1().n0("NOTIFICATION_STREAM_TAG");
        if (qVarN0 != null && qVarN0.x0()) {
            nk.c.c().s(0);
        }
        g(nk.c.c().e());
    }

    public d(q qVar, lk.c cVar) {
        this.f16125a = "NOTIFICATION_STREAM_TAG";
        this.f16127d = -1;
        v vVarP = qVar.p();
        this.b = vVarP;
        this.f16126c = cVar;
        Resources resources = vVarP.getResources();
        this.f16128e = resources != null ? resources.getColor(j0.f4086i) : -12303292;
    }
}
