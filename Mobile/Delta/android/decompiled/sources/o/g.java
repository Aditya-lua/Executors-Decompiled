package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.q;
import com.google.mlkit.vision.barcode.common.Barcode;
import i.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.a1;
import q.k0;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f26942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f26943f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f26944a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f26945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f26946d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f26947c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f26948a;
        public Method b;

        public a(Object obj, String str) {
            this.f26948a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, f26947c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.f26948a, menuItem)).booleanValue();
                }
                this.b.invoke(this.f26948a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public androidx.core.view.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f26949a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f26952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f26954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f26955h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f26956i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26957j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f26958k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f26959l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26960m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f26961n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f26962o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f26963p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f26964q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f26965r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f26966s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f26967t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f26968u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26969v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26970w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f26971x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f26972y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f26973z;

        public b(Menu menu) {
            this.f26949a = menu;
            h();
        }

        public void a() {
            this.f26955h = true;
            i(this.f26949a.add(this.b, this.f26956i, this.f26957j, this.f26958k));
        }

        public SubMenu b() {
            this.f26955h = true;
            SubMenu subMenuAddSubMenu = this.f26949a.addSubMenu(this.b, this.f26956i, this.f26957j, this.f26958k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f26955h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f26945c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f26945c.obtainStyledAttributes(attributeSet, j.f20099q1);
            this.b = typedArrayObtainStyledAttributes.getResourceId(j.f20109s1, 0);
            this.f26950c = typedArrayObtainStyledAttributes.getInt(j.f20119u1, 0);
            this.f26951d = typedArrayObtainStyledAttributes.getInt(j.f20124v1, 0);
            this.f26952e = typedArrayObtainStyledAttributes.getInt(j.f20129w1, 0);
            this.f26953f = typedArrayObtainStyledAttributes.getBoolean(j.f20114t1, true);
            this.f26954g = typedArrayObtainStyledAttributes.getBoolean(j.f20104r1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            a1 a1VarU = a1.u(g.this.f26945c, attributeSet, j.f20134x1);
            this.f26956i = a1VarU.n(j.A1, 0);
            this.f26957j = (a1VarU.k(j.D1, this.f26950c) & (-65536)) | (a1VarU.k(j.E1, this.f26951d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f26958k = a1VarU.p(j.F1);
            this.f26959l = a1VarU.p(j.G1);
            this.f26960m = a1VarU.n(j.f20139y1, 0);
            this.f26961n = c(a1VarU.o(j.H1));
            this.f26962o = a1VarU.k(j.O1, Barcode.FORMAT_AZTEC);
            this.f26963p = c(a1VarU.o(j.I1));
            this.f26964q = a1VarU.k(j.S1, Barcode.FORMAT_AZTEC);
            int i10 = j.J1;
            if (a1VarU.s(i10)) {
                this.f26965r = a1VarU.a(i10, false) ? 1 : 0;
            } else {
                this.f26965r = this.f26952e;
            }
            this.f26966s = a1VarU.a(j.B1, false);
            this.f26967t = a1VarU.a(j.C1, this.f26953f);
            this.f26968u = a1VarU.a(j.f20144z1, this.f26954g);
            this.f26969v = a1VarU.k(j.T1, -1);
            this.f26973z = a1VarU.o(j.K1);
            this.f26970w = a1VarU.n(j.L1, 0);
            this.f26971x = a1VarU.o(j.N1);
            String strO = a1VarU.o(j.M1);
            this.f26972y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f26970w == 0 && this.f26971x == null) {
                this.A = (androidx.core.view.b) e(strO, g.f26943f, g.this.b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a1VarU.p(j.P1);
            this.C = a1VarU.p(j.U1);
            int i11 = j.R1;
            if (a1VarU.s(i11)) {
                this.E = k0.e(a1VarU.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.Q1;
            if (a1VarU.s(i12)) {
                this.D = a1VarU.c(i12);
            } else {
                this.D = null;
            }
            a1VarU.x();
            this.f26955h = false;
        }

        public void h() {
            this.b = 0;
            this.f26950c = 0;
            this.f26951d = 0;
            this.f26952e = 0;
            this.f26953f = true;
            this.f26954g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f26966s).setVisible(this.f26967t).setEnabled(this.f26968u).setCheckable(this.f26965r >= 1).setTitleCondensed(this.f26959l).setIcon(this.f26960m);
            int i10 = this.f26969v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f26973z != null) {
                if (g.this.f26945c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f26973z));
            }
            if (this.f26965r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof p.c) {
                    ((p.c) menuItem).h(true);
                }
            }
            String str = this.f26971x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f26942e, g.this.f26944a));
                z10 = true;
            }
            int i11 = this.f26970w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                q.a(menuItem, bVar);
            }
            q.c(menuItem, this.B);
            q.g(menuItem, this.C);
            q.b(menuItem, this.f26961n, this.f26962o);
            q.f(menuItem, this.f26963p, this.f26964q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                q.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                q.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f26942e = clsArr;
        f26943f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f26945c = context;
        Object[] objArr = {context};
        this.f26944a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f26946d == null) {
            this.f26946d = a(this.f26945c);
        }
        return this.f26946d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof r2.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f26945c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
