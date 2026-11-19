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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.b1;
import q.l0;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f26659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f26660f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f26661a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f26662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f26663d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f26664c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f26665a;
        public Method b;

        public a(Object obj, String str) {
            this.f26665a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, f26664c);
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
                    return ((Boolean) this.b.invoke(this.f26665a, menuItem)).booleanValue();
                }
                this.b.invoke(this.f26665a, menuItem);
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
        public Menu f26666a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f26669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f26671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f26672h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f26673i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26674j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f26675k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f26676l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26677m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f26678n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f26679o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f26680p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f26681q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f26682r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f26683s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f26684t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f26685u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26686v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26687w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f26688x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f26689y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f26690z;

        public b(Menu menu) {
            this.f26666a = menu;
            h();
        }

        public void a() {
            this.f26672h = true;
            i(this.f26666a.add(this.b, this.f26673i, this.f26674j, this.f26675k));
        }

        public SubMenu b() {
            this.f26672h = true;
            SubMenu subMenuAddSubMenu = this.f26666a.addSubMenu(this.b, this.f26673i, this.f26674j, this.f26675k);
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
            return this.f26672h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f26662c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f26662c.obtainStyledAttributes(attributeSet, j.f18942q1);
            this.b = typedArrayObtainStyledAttributes.getResourceId(j.f18952s1, 0);
            this.f26667c = typedArrayObtainStyledAttributes.getInt(j.f18962u1, 0);
            this.f26668d = typedArrayObtainStyledAttributes.getInt(j.f18967v1, 0);
            this.f26669e = typedArrayObtainStyledAttributes.getInt(j.f18972w1, 0);
            this.f26670f = typedArrayObtainStyledAttributes.getBoolean(j.f18957t1, true);
            this.f26671g = typedArrayObtainStyledAttributes.getBoolean(j.f18947r1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            b1 b1VarU = b1.u(g.this.f26662c, attributeSet, j.f18977x1);
            this.f26673i = b1VarU.n(j.A1, 0);
            this.f26674j = (b1VarU.k(j.D1, this.f26667c) & (-65536)) | (b1VarU.k(j.E1, this.f26668d) & 65535);
            this.f26675k = b1VarU.p(j.F1);
            this.f26676l = b1VarU.p(j.G1);
            this.f26677m = b1VarU.n(j.f18982y1, 0);
            this.f26678n = c(b1VarU.o(j.H1));
            this.f26679o = b1VarU.k(j.O1, Barcode.FORMAT_AZTEC);
            this.f26680p = c(b1VarU.o(j.I1));
            this.f26681q = b1VarU.k(j.S1, Barcode.FORMAT_AZTEC);
            if (b1VarU.s(j.J1)) {
                this.f26682r = b1VarU.a(j.J1, false) ? 1 : 0;
            } else {
                this.f26682r = this.f26669e;
            }
            this.f26683s = b1VarU.a(j.B1, false);
            this.f26684t = b1VarU.a(j.C1, this.f26670f);
            this.f26685u = b1VarU.a(j.f18987z1, this.f26671g);
            this.f26686v = b1VarU.k(j.T1, -1);
            this.f26690z = b1VarU.o(j.K1);
            this.f26687w = b1VarU.n(j.L1, 0);
            this.f26688x = b1VarU.o(j.N1);
            String strO = b1VarU.o(j.M1);
            this.f26689y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f26687w == 0 && this.f26688x == null) {
                this.A = (androidx.core.view.b) e(strO, g.f26660f, g.this.b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = b1VarU.p(j.P1);
            this.C = b1VarU.p(j.U1);
            if (b1VarU.s(j.R1)) {
                this.E = l0.e(b1VarU.k(j.R1, -1), this.E);
            } else {
                this.E = null;
            }
            if (b1VarU.s(j.Q1)) {
                this.D = b1VarU.c(j.Q1);
            } else {
                this.D = null;
            }
            b1VarU.x();
            this.f26672h = false;
        }

        public void h() {
            this.b = 0;
            this.f26667c = 0;
            this.f26668d = 0;
            this.f26669e = 0;
            this.f26670f = true;
            this.f26671g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f26683s).setVisible(this.f26684t).setEnabled(this.f26685u).setCheckable(this.f26682r >= 1).setTitleCondensed(this.f26676l).setIcon(this.f26677m);
            int i10 = this.f26686v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f26690z != null) {
                if (g.this.f26662c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f26690z));
            }
            if (this.f26682r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof p.c) {
                    ((p.c) menuItem).h(true);
                }
            }
            String str = this.f26688x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f26659e, g.this.f26661a));
                z10 = true;
            }
            int i11 = this.f26687w;
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
            q.b(menuItem, this.f26678n, this.f26679o);
            q.f(menuItem, this.f26680p, this.f26681q);
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
        f26659e = clsArr;
        f26660f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f26662c = context;
        Object[] objArr = {context};
        this.f26661a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f26663d == null) {
            this.f26663d = a(this.f26662c);
        }
        return this.f26663d;
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
                layout = this.f26662c.getResources().getLayout(i10);
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
