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
    public static final Class<?>[] f27507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f27508f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f27509a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f27510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27511d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f27512c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f27513a;
        public Method b;

        public a(Object obj, String str) {
            this.f27513a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, f27512c);
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
                    return ((Boolean) this.b.invoke(this.f27513a, menuItem)).booleanValue();
                }
                this.b.invoke(this.f27513a, menuItem);
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
        public Menu f27514a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f27518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f27519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f27520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f27521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f27523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f27524l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f27525m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f27526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27527o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f27528p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f27529q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f27530r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f27531s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f27532t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f27533u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f27534v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f27535w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f27536x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f27537y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f27538z;

        public b(Menu menu) {
            this.f27514a = menu;
            h();
        }

        public void a() {
            this.f27520h = true;
            i(this.f27514a.add(this.b, this.f27521i, this.f27522j, this.f27523k));
        }

        public SubMenu b() {
            this.f27520h = true;
            SubMenu subMenuAddSubMenu = this.f27514a.addSubMenu(this.b, this.f27521i, this.f27522j, this.f27523k);
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
            return this.f27520h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f27510c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f27510c.obtainStyledAttributes(attributeSet, j.f20215q1);
            this.b = typedArrayObtainStyledAttributes.getResourceId(j.f20225s1, 0);
            this.f27515c = typedArrayObtainStyledAttributes.getInt(j.f20235u1, 0);
            this.f27516d = typedArrayObtainStyledAttributes.getInt(j.f20240v1, 0);
            this.f27517e = typedArrayObtainStyledAttributes.getInt(j.f20245w1, 0);
            this.f27518f = typedArrayObtainStyledAttributes.getBoolean(j.f20230t1, true);
            this.f27519g = typedArrayObtainStyledAttributes.getBoolean(j.f20220r1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            a1 a1VarU = a1.u(g.this.f27510c, attributeSet, j.f20250x1);
            this.f27521i = a1VarU.n(j.A1, 0);
            this.f27522j = (a1VarU.k(j.D1, this.f27515c) & (-65536)) | (a1VarU.k(j.E1, this.f27516d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f27523k = a1VarU.p(j.F1);
            this.f27524l = a1VarU.p(j.G1);
            this.f27525m = a1VarU.n(j.f20255y1, 0);
            this.f27526n = c(a1VarU.o(j.H1));
            this.f27527o = a1VarU.k(j.O1, Barcode.FORMAT_AZTEC);
            this.f27528p = c(a1VarU.o(j.I1));
            this.f27529q = a1VarU.k(j.S1, Barcode.FORMAT_AZTEC);
            int i10 = j.J1;
            if (a1VarU.s(i10)) {
                this.f27530r = a1VarU.a(i10, false) ? 1 : 0;
            } else {
                this.f27530r = this.f27517e;
            }
            this.f27531s = a1VarU.a(j.B1, false);
            this.f27532t = a1VarU.a(j.C1, this.f27518f);
            this.f27533u = a1VarU.a(j.f20260z1, this.f27519g);
            this.f27534v = a1VarU.k(j.T1, -1);
            this.f27538z = a1VarU.o(j.K1);
            this.f27535w = a1VarU.n(j.L1, 0);
            this.f27536x = a1VarU.o(j.N1);
            String strO = a1VarU.o(j.M1);
            this.f27537y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f27535w == 0 && this.f27536x == null) {
                this.A = (androidx.core.view.b) e(strO, g.f27508f, g.this.b);
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
            this.f27520h = false;
        }

        public void h() {
            this.b = 0;
            this.f27515c = 0;
            this.f27516d = 0;
            this.f27517e = 0;
            this.f27518f = true;
            this.f27519g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f27531s).setVisible(this.f27532t).setEnabled(this.f27533u).setCheckable(this.f27530r >= 1).setTitleCondensed(this.f27524l).setIcon(this.f27525m);
            int i10 = this.f27534v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f27538z != null) {
                if (g.this.f27510c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f27538z));
            }
            if (this.f27530r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof p.c) {
                    ((p.c) menuItem).h(true);
                }
            }
            String str = this.f27536x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f27507e, g.this.f27509a));
                z10 = true;
            }
            int i11 = this.f27535w;
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
            q.b(menuItem, this.f27526n, this.f27527o);
            q.f(menuItem, this.f27528p, this.f27529q);
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
        f27507e = clsArr;
        f27508f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f27510c = context;
        Object[] objArr = {context};
        this.f27509a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f27511d == null) {
            this.f27511d = a(this.f27510c);
        }
        return this.f27511d;
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
                layout = this.f27510c.getResources().getLayout(i10);
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
