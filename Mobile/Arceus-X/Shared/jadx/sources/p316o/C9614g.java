package p316o;

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
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.C0417g;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.AbstractC0585b;
import androidx.core.view.C0628q;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p181i.C6598j;
import p346p.MenuItemC10079c;
import p365q.C10357a1;
import p365q.C10384k0;
import p399r2.InterfaceMenuC10777a;

/* JADX INFO: renamed from: o.g */
/* JADX INFO: loaded from: classes.dex */
public class C9614g extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class<?>[] f34850e;

    /* JADX INFO: renamed from: f */
    public static final Class<?>[] f34851f;

    /* JADX INFO: renamed from: a */
    public final Object[] f34852a;

    /* JADX INFO: renamed from: b */
    public final Object[] f34853b;

    /* JADX INFO: renamed from: c */
    public Context f34854c;

    /* JADX INFO: renamed from: d */
    public Object f34855d;

    /* JADX INFO: renamed from: o.g$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        public static final Class<?>[] f34856c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        public Object f34857a;

        /* JADX INFO: renamed from: b */
        public Method f34858b;

        public a(Object obj, String str) {
            this.f34857a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f34858b = cls.getMethod(str, f34856c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f34858b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f34858b.invoke(this.f34857a, menuItem)).booleanValue();
                }
                this.f34858b.invoke(this.f34857a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: o.g$b */
    public class b {

        /* JADX INFO: renamed from: A */
        public AbstractC0585b f34859A;

        /* JADX INFO: renamed from: B */
        public CharSequence f34860B;

        /* JADX INFO: renamed from: C */
        public CharSequence f34861C;

        /* JADX INFO: renamed from: D */
        public ColorStateList f34862D = null;

        /* JADX INFO: renamed from: E */
        public PorterDuff.Mode f34863E = null;

        /* JADX INFO: renamed from: a */
        public Menu f34865a;

        /* JADX INFO: renamed from: b */
        public int f34866b;

        /* JADX INFO: renamed from: c */
        public int f34867c;

        /* JADX INFO: renamed from: d */
        public int f34868d;

        /* JADX INFO: renamed from: e */
        public int f34869e;

        /* JADX INFO: renamed from: f */
        public boolean f34870f;

        /* JADX INFO: renamed from: g */
        public boolean f34871g;

        /* JADX INFO: renamed from: h */
        public boolean f34872h;

        /* JADX INFO: renamed from: i */
        public int f34873i;

        /* JADX INFO: renamed from: j */
        public int f34874j;

        /* JADX INFO: renamed from: k */
        public CharSequence f34875k;

        /* JADX INFO: renamed from: l */
        public CharSequence f34876l;

        /* JADX INFO: renamed from: m */
        public int f34877m;

        /* JADX INFO: renamed from: n */
        public char f34878n;

        /* JADX INFO: renamed from: o */
        public int f34879o;

        /* JADX INFO: renamed from: p */
        public char f34880p;

        /* JADX INFO: renamed from: q */
        public int f34881q;

        /* JADX INFO: renamed from: r */
        public int f34882r;

        /* JADX INFO: renamed from: s */
        public boolean f34883s;

        /* JADX INFO: renamed from: t */
        public boolean f34884t;

        /* JADX INFO: renamed from: u */
        public boolean f34885u;

        /* JADX INFO: renamed from: v */
        public int f34886v;

        /* JADX INFO: renamed from: w */
        public int f34887w;

        /* JADX INFO: renamed from: x */
        public String f34888x;

        /* JADX INFO: renamed from: y */
        public String f34889y;

        /* JADX INFO: renamed from: z */
        public String f34890z;

        public b(Menu menu) {
            this.f34865a = menu;
            m37939h();
        }

        /* JADX INFO: renamed from: a */
        public void m37932a() {
            this.f34872h = true;
            m37940i(this.f34865a.add(this.f34866b, this.f34873i, this.f34874j, this.f34875k));
        }

        /* JADX INFO: renamed from: b */
        public SubMenu m37933b() {
            this.f34872h = true;
            SubMenu subMenuAddSubMenu = this.f34865a.addSubMenu(this.f34866b, this.f34873i, this.f34874j, this.f34875k);
            m37940i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: c */
        public final char m37934c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* JADX INFO: renamed from: d */
        public boolean m37935d() {
            return this.f34872h;
        }

        /* JADX INFO: renamed from: e */
        public final <T> T m37936e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C9614g.this.f34854c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m37937f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C9614g.this.f34854c.obtainStyledAttributes(attributeSet, C6598j.f25408q1);
            this.f34866b = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25418s1, 0);
            this.f34867c = typedArrayObtainStyledAttributes.getInt(C6598j.f25428u1, 0);
            this.f34868d = typedArrayObtainStyledAttributes.getInt(C6598j.f25433v1, 0);
            this.f34869e = typedArrayObtainStyledAttributes.getInt(C6598j.f25438w1, 0);
            this.f34870f = typedArrayObtainStyledAttributes.getBoolean(C6598j.f25423t1, true);
            this.f34871g = typedArrayObtainStyledAttributes.getBoolean(C6598j.f25413r1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: g */
        public void m37938g(AttributeSet attributeSet) {
            C10357a1 c10357a1M39727u = C10357a1.m39727u(C9614g.this.f34854c, attributeSet, C6598j.f25443x1);
            this.f34873i = c10357a1M39727u.m39742n(C6598j.f25204A1, 0);
            this.f34874j = (c10357a1M39727u.m39739k(C6598j.f25219D1, this.f34867c) & SupportMenu.CATEGORY_MASK) | (c10357a1M39727u.m39739k(C6598j.f25224E1, this.f34868d) & 65535);
            this.f34875k = c10357a1M39727u.m39744p(C6598j.f25229F1);
            this.f34876l = c10357a1M39727u.m39744p(C6598j.f25234G1);
            this.f34877m = c10357a1M39727u.m39742n(C6598j.f25448y1, 0);
            this.f34878n = m37934c(c10357a1M39727u.m39743o(C6598j.f25239H1));
            this.f34879o = c10357a1M39727u.m39739k(C6598j.f25274O1, 4096);
            this.f34880p = m37934c(c10357a1M39727u.m39743o(C6598j.f25244I1));
            this.f34881q = c10357a1M39727u.m39739k(C6598j.f25294S1, 4096);
            int i10 = C6598j.f25249J1;
            if (c10357a1M39727u.m39747s(i10)) {
                this.f34882r = c10357a1M39727u.m39729a(i10, false) ? 1 : 0;
            } else {
                this.f34882r = this.f34869e;
            }
            this.f34883s = c10357a1M39727u.m39729a(C6598j.f25209B1, false);
            this.f34884t = c10357a1M39727u.m39729a(C6598j.f25214C1, this.f34870f);
            this.f34885u = c10357a1M39727u.m39729a(C6598j.f25453z1, this.f34871g);
            this.f34886v = c10357a1M39727u.m39739k(C6598j.f25299T1, -1);
            this.f34890z = c10357a1M39727u.m39743o(C6598j.f25254K1);
            this.f34887w = c10357a1M39727u.m39742n(C6598j.f25259L1, 0);
            this.f34888x = c10357a1M39727u.m39743o(C6598j.f25269N1);
            String strM39743o = c10357a1M39727u.m39743o(C6598j.f25264M1);
            this.f34889y = strM39743o;
            boolean z10 = strM39743o != null;
            if (z10 && this.f34887w == 0 && this.f34888x == null) {
                this.f34859A = (AbstractC0585b) m37936e(strM39743o, C9614g.f34851f, C9614g.this.f34853b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f34859A = null;
            }
            this.f34860B = c10357a1M39727u.m39744p(C6598j.f25279P1);
            this.f34861C = c10357a1M39727u.m39744p(C6598j.f25304U1);
            int i11 = C6598j.f25289R1;
            if (c10357a1M39727u.m39747s(i11)) {
                this.f34863E = C10384k0.m39887e(c10357a1M39727u.m39739k(i11, -1), this.f34863E);
            } else {
                this.f34863E = null;
            }
            int i12 = C6598j.f25284Q1;
            if (c10357a1M39727u.m39747s(i12)) {
                this.f34862D = c10357a1M39727u.m39731c(i12);
            } else {
                this.f34862D = null;
            }
            c10357a1M39727u.m39749x();
            this.f34872h = false;
        }

        /* JADX INFO: renamed from: h */
        public void m37939h() {
            this.f34866b = 0;
            this.f34867c = 0;
            this.f34868d = 0;
            this.f34869e = 0;
            this.f34870f = true;
            this.f34871g = true;
        }

        /* JADX INFO: renamed from: i */
        public final void m37940i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f34883s).setVisible(this.f34884t).setEnabled(this.f34885u).setCheckable(this.f34882r >= 1).setTitleCondensed(this.f34876l).setIcon(this.f34877m);
            int i10 = this.f34886v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f34890z != null) {
                if (C9614g.this.f34854c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C9614g.this.m37930b(), this.f34890z));
            }
            if (this.f34882r >= 2) {
                if (menuItem instanceof C0417g) {
                    ((C0417g) menuItem).m1683t(true);
                } else if (menuItem instanceof MenuItemC10079c) {
                    ((MenuItemC10079c) menuItem).m38856h(true);
                }
            }
            String str = this.f34888x;
            if (str != null) {
                menuItem.setActionView((View) m37936e(str, C9614g.f34850e, C9614g.this.f34852a));
                z10 = true;
            }
            int i11 = this.f34887w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC0585b abstractC0585b = this.f34859A;
            if (abstractC0585b != null) {
                C0628q.m3143a(menuItem, abstractC0585b);
            }
            C0628q.m3145c(menuItem, this.f34860B);
            C0628q.m3149g(menuItem, this.f34861C);
            C0628q.m3144b(menuItem, this.f34878n, this.f34879o);
            C0628q.m3148f(menuItem, this.f34880p, this.f34881q);
            PorterDuff.Mode mode = this.f34863E;
            if (mode != null) {
                C0628q.m3147e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f34862D;
            if (colorStateList != null) {
                C0628q.m3146d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f34850e = clsArr;
        f34851f = clsArr;
    }

    public C9614g(Context context) {
        super(context);
        this.f34854c = context;
        Object[] objArr = {context};
        this.f34852a = objArr;
        this.f34853b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final Object m37929a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m37929a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public Object m37930b() {
        if (this.f34855d == null) {
            this.f34855d = m37929a(this.f34854c);
        }
        return this.f34855d;
    }

    /* JADX INFO: renamed from: c */
    public final void m37931c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
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
                        bVar.m37939h();
                    } else if (name2.equals("item")) {
                        if (!bVar.m37935d()) {
                            AbstractC0585b abstractC0585b = bVar.f34859A;
                            if (abstractC0585b == null || !abstractC0585b.mo1866a()) {
                                bVar.m37932a();
                            } else {
                                bVar.m37933b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.m37937f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.m37938g(attributeSet);
                } else if (name3.equals("menu")) {
                    m37931c(xmlPullParser, attributeSet, bVar.m37933b());
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
        if (!(menu instanceof InterfaceMenuC10777a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f34854c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C0415e) {
                    C0415e c0415e = (C0415e) menu;
                    if (c0415e.m1605F()) {
                        c0415e.m1635e0();
                        z10 = true;
                    }
                }
                m37931c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((C0415e) menu).m1633d0();
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
                ((C0415e) menu).m1633d0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
