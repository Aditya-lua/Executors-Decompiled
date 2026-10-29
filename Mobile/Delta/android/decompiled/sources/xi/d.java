package xi;

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
import com.roblox.client.NotificationStreamActivity;
import com.roblox.engine.jni.NativeGLInterface;
import e4.q;
import sg.a1;
import sg.e0;
import sg.e2;
import sg.g0;
import sg.j0;
import sg.k0;
import sg.l0;
import sg.m0;
import sg.o0;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35197a;
    public q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dk.c f35198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuItem f35201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f35202g;

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
        public static final /* synthetic */ int[] f35204a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f35204a = iArr;
            try {
                iArr[ol.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35204a[ol.a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(androidx.fragment.app.c cVar) {
        this(cVar, new dk.f());
    }

    public final int a() {
        if (b.f35204a[this.f35198c.getTheme().ordinal()] != 1) {
            return this.f35200e;
        }
        return -1;
    }

    public final int b() {
        return b.f35204a[this.f35198c.getTheme().ordinal()] != 1 ? l0.f30807k : l0.f30808l;
    }

    public final int c() {
        return b.f35204a[this.f35198c.getTheme().ordinal()] != 1 ? l0.f30819w : l0.f30820x;
    }

    public MenuItem d(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.f30905a, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.f30825a);
        this.f35201f = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        ImageView imageView = (ImageView) actionView.findViewById(m0.W);
        TextView textView = (TextView) actionView.findViewById(m0.X);
        this.f35202g = textView;
        h(textView, this.f35199d);
        imageView.setOnClickListener(new a());
        imageView.setImageResource(c());
        this.f35202g.setBackgroundResource(b());
        this.f35202g.setTextColor(a());
        return this.f35201f;
    }

    public void e() {
        f(null);
    }

    public void f(r rVar) {
        if (this.b == null) {
            return;
        }
        fk.c.c().s(0);
        this.f35199d = 0;
        TextView textView = this.f35202g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        vk.g.d().g().c().B(new xk.a());
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
        this.f35199d = i10;
        h((TextView) this.f35201f.getActionView().findViewById(m0.X), this.f35199d);
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
            textView.setText(qi.e.a(i10));
        }
    }

    public final void i(r rVar) {
        Point pointJ = el.a.j(this.b);
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(k0.f30792c);
        int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(k0.b);
        int iE = (int) e2.e(this.b, 80);
        int iE2 = (int) e2.e(this.b, 420);
        int i10 = ((pointJ.y - dimensionPixelSize2) - dimensionPixelSize) - iE;
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
        androidx.fragment.app.c cVarN0 = this.b.l1().n0("NOTIFICATION_STREAM_TAG");
        if (cVarN0 != null && cVarN0.x0()) {
            fk.c.c().s(0);
        }
        g(fk.c.c().e());
    }

    public d(androidx.fragment.app.c cVar, dk.c cVar2) {
        this.f35197a = "NOTIFICATION_STREAM_TAG";
        this.f35199d = -1;
        q qVarP = cVar.p();
        this.b = qVarP;
        this.f35198c = cVar2;
        Resources resources = qVarP.getResources();
        this.f35200e = resources != null ? resources.getColor(j0.f30781j) : -12303292;
    }
}
