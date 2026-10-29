package p548xi;

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
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.InterfaceC0978r;
import com.roblox.client.NotificationStreamActivity;
import com.roblox.engine.jni.NativeGLInterface;
import dk.C4637f;
import dk.InterfaceC4634c;
import fk.C5654c;
import p093e4.ActivityC4831q;
import p107el.C5160a;
import p337ol.EnumC9799a;
import p383qi.C10586e;
import p493vk.C12225g;
import p550xk.C12854a;
import sg.C11295a1;
import sg.C11310e0;
import sg.C11312e2;
import sg.C11317g0;
import sg.C11326j0;
import sg.C11329k0;
import sg.C11332l0;
import sg.C11335m0;
import sg.C11341o0;
import sg.C11347q0;

/* JADX INFO: renamed from: xi.d */
/* JADX INFO: loaded from: classes2.dex */
public class C12837d {

    /* JADX INFO: renamed from: a */
    public final String f45638a;

    /* JADX INFO: renamed from: b */
    public ActivityC4831q f45639b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4634c f45640c;

    /* JADX INFO: renamed from: d */
    public int f45641d;

    /* JADX INFO: renamed from: e */
    public int f45642e;

    /* JADX INFO: renamed from: f */
    public MenuItem f45643f;

    /* JADX INFO: renamed from: g */
    public TextView f45644g;

    /* JADX INFO: renamed from: xi.d$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C12837d.this.m47782e();
        }
    }

    /* JADX INFO: renamed from: xi.d$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45646a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f45646a = iArr;
            try {
                iArr[EnumC9799a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45646a[EnumC9799a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12837d(ComponentCallbacksC0929c componentCallbacksC0929c) {
        this(componentCallbacksC0929c, new C4637f());
    }

    /* JADX INFO: renamed from: a */
    public final int m47778a() {
        if (b.f45646a[this.f45640c.getTheme().ordinal()] != 1) {
            return this.f45642e;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m47779b() {
        return b.f45646a[this.f45640c.getTheme().ordinal()] != 1 ? C11332l0.f39751k : C11332l0.f39752l;
    }

    /* JADX INFO: renamed from: c */
    public final int m47780c() {
        return b.f45646a[this.f45640c.getTheme().ordinal()] != 1 ? C11332l0.f39763w : C11332l0.f39764x;
    }

    /* JADX INFO: renamed from: d */
    public MenuItem m47781d(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C11341o0.f39885a, menu);
        MenuItem menuItemFindItem = menu.findItem(C11335m0.f39795a);
        this.f45643f = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        ImageView imageView = (ImageView) actionView.findViewById(C11335m0.f39791W);
        TextView textView = (TextView) actionView.findViewById(C11335m0.f39792X);
        this.f45644g = textView;
        m47785h(textView, this.f45641d);
        imageView.setOnClickListener(new a());
        imageView.setImageResource(m47780c());
        this.f45644g.setBackgroundResource(m47779b());
        this.f45644g.setTextColor(m47778a());
        return this.f45643f;
    }

    /* JADX INFO: renamed from: e */
    public void m47782e() {
        m47783f(null);
    }

    /* JADX INFO: renamed from: f */
    public void m47783f(InterfaceC0978r interfaceC0978r) {
        if (this.f45639b == null) {
            return;
        }
        C5654c.m25669c().m25687s(0);
        this.f45641d = 0;
        TextView textView = this.f45644g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C12225g.m45326d().mo45321g().m50312c().mo30571B(new C12854a());
        if (!C11295a1.m42469p0()) {
            m47786i(interfaceC0978r);
            return;
        }
        Intent intent = new Intent(this.f45639b, (Class<?>) NotificationStreamActivity.class);
        if (interfaceC0978r != null) {
            intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", true);
        }
        this.f45639b.startActivityForResult(intent, 20110);
        if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            this.f45639b.overridePendingTransition(0, 0);
        } else {
            this.f45639b.overridePendingTransition(C11317g0.f39699b, R.anim.fade_out);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m47784g(int i10) {
        this.f45641d = i10;
        m47785h((TextView) this.f45643f.getActionView().findViewById(C11335m0.f39792X), this.f45641d);
    }

    /* JADX INFO: renamed from: h */
    public final void m47785h(TextView textView, int i10) {
        if (i10 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (i10 > 99) {
            textView.setText(textView.getContext().getString(C11347q0.f39933Q));
        } else {
            textView.setText(C10586e.m40603a(i10));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m47786i(InterfaceC0978r interfaceC0978r) {
        Point pointM24006j = C5160a.m24006j(this.f45639b);
        int dimensionPixelSize = this.f45639b.getResources().getDimensionPixelSize(C11329k0.f39732c);
        int dimensionPixelSize2 = this.f45639b.getResources().getDimensionPixelSize(C11329k0.f39731b);
        int iM42501e = (int) C11312e2.m42501e(this.f45639b, 80);
        int iM42501e2 = (int) C11312e2.m42501e(this.f45639b, 420);
        int i10 = ((pointM24006j.y - dimensionPixelSize2) - dimensionPixelSize) - iM42501e;
        int iM42501e3 = (int) C11312e2.m42501e(this.f45639b, 15);
        C11310e0 c11310e0 = new C11310e0();
        c11310e0.m23337r2(2, 0);
        Bundle bundle = new Bundle();
        bundle.putInt("dialogWidth", iM42501e2);
        bundle.putInt("dialogHeight", i10);
        bundle.putInt("dialogGravity", 53);
        bundle.putInt("dialogOffsetY", dimensionPixelSize);
        bundle.putInt("dialogOffsetX", iM42501e3);
        bundle.putString("DEFAULT_URL", C11295a1.m42487y0());
        c11310e0.m4625O1(bundle);
        if (interfaceC0978r != null) {
            c11310e0.mo4656a().mo4935a(interfaceC0978r);
        }
        c11310e0.mo23339t2(this.f45639b.m23360l1(), "NOTIFICATION_STREAM_TAG");
    }

    /* JADX INFO: renamed from: j */
    public void m47787j() {
        ComponentCallbacksC0929c componentCallbacksC0929cM4444n0 = this.f45639b.m23360l1().m4444n0("NOTIFICATION_STREAM_TAG");
        if (componentCallbacksC0929cM4444n0 != null && componentCallbacksC0929cM4444n0.m4716x0()) {
            C5654c.m25669c().m25687s(0);
        }
        m47784g(C5654c.m25669c().m25673e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12837d(ComponentCallbacksC0929c componentCallbacksC0929c, InterfaceC4634c interfaceC4634c) {
        this.f45638a = "NOTIFICATION_STREAM_TAG";
        this.f45641d = -1;
        ActivityC4831q activityC4831qM4693p = componentCallbacksC0929c.m4693p();
        this.f45639b = activityC4831qM4693p;
        this.f45640c = interfaceC4634c;
        Resources resources = activityC4831qM4693p.getResources();
        this.f45642e = resources != null ? resources.getColor(C11326j0.f39719j) : -12303292;
    }
}
