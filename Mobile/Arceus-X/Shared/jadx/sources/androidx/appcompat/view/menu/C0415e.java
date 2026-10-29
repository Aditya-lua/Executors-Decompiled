package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.AbstractC0585b;
import androidx.core.view.C0631r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p261l2.C7975b;
import p399r2.InterfaceMenuC10777a;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
public class C0415e implements InterfaceMenuC10777a {

    /* JADX INFO: renamed from: A */
    public static final int[] f1197A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f1198a;

    /* JADX INFO: renamed from: b */
    public final Resources f1199b;

    /* JADX INFO: renamed from: c */
    public boolean f1200c;

    /* JADX INFO: renamed from: d */
    public boolean f1201d;

    /* JADX INFO: renamed from: e */
    public a f1202e;

    /* JADX INFO: renamed from: m */
    public ContextMenu.ContextMenuInfo f1210m;

    /* JADX INFO: renamed from: n */
    public CharSequence f1211n;

    /* JADX INFO: renamed from: o */
    public Drawable f1212o;

    /* JADX INFO: renamed from: p */
    public View f1213p;

    /* JADX INFO: renamed from: x */
    public C0417g f1221x;

    /* JADX INFO: renamed from: z */
    public boolean f1223z;

    /* JADX INFO: renamed from: l */
    public int f1209l = 0;

    /* JADX INFO: renamed from: q */
    public boolean f1214q = false;

    /* JADX INFO: renamed from: r */
    public boolean f1215r = false;

    /* JADX INFO: renamed from: s */
    public boolean f1216s = false;

    /* JADX INFO: renamed from: t */
    public boolean f1217t = false;

    /* JADX INFO: renamed from: u */
    public boolean f1218u = false;

    /* JADX INFO: renamed from: v */
    public ArrayList<C0417g> f1219v = new ArrayList<>();

    /* JADX INFO: renamed from: w */
    public CopyOnWriteArrayList<WeakReference<InterfaceC0419i>> f1220w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y */
    public boolean f1222y = false;

    /* JADX INFO: renamed from: f */
    public ArrayList<C0417g> f1203f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public ArrayList<C0417g> f1204g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public boolean f1205h = true;

    /* JADX INFO: renamed from: i */
    public ArrayList<C0417g> f1206i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public ArrayList<C0417g> f1207j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public boolean f1208k = true;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo1656a(@NonNull C0415e c0415e, @NonNull MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        void mo1657b(@NonNull C0415e c0415e);
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.e$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        boolean mo1546b(C0417g c0417g);
    }

    public C0415e(Context context) {
        this.f1198a = context;
        this.f1199b = context.getResources();
        m1631c0(true);
    }

    /* JADX INFO: renamed from: B */
    public static int m1599B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f1197A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX INFO: renamed from: n */
    public static int m1600n(ArrayList<C0417g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m1669f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public boolean m1601A() {
        return this.f1217t;
    }

    /* JADX INFO: renamed from: C */
    public Resources m1602C() {
        return this.f1199b;
    }

    /* JADX INFO: renamed from: D */
    public C0415e mo1603D() {
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: E */
    public ArrayList<C0417g> m1604E() {
        if (!this.f1205h) {
            return this.f1204g;
        }
        this.f1204g.clear();
        int size = this.f1203f.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0417g c0417g = this.f1203f.get(i10);
            if (c0417g.isVisible()) {
                this.f1204g.add(c0417g);
            }
        }
        this.f1205h = false;
        this.f1208k = true;
        return this.f1204g;
    }

    /* JADX INFO: renamed from: F */
    public boolean m1605F() {
        return !this.f1214q;
    }

    /* JADX INFO: renamed from: G */
    public boolean mo1606G() {
        return this.f1222y;
    }

    /* JADX INFO: renamed from: H */
    public boolean mo1607H() {
        return this.f1200c;
    }

    /* JADX INFO: renamed from: I */
    public boolean mo1608I() {
        return this.f1201d;
    }

    /* JADX INFO: renamed from: J */
    public void m1609J(C0417g c0417g) {
        this.f1208k = true;
        m1611L(true);
    }

    /* JADX INFO: renamed from: K */
    public void m1610K(C0417g c0417g) {
        this.f1205h = true;
        m1611L(true);
    }

    /* JADX INFO: renamed from: L */
    public void m1611L(boolean z10) {
        if (this.f1214q) {
            this.f1215r = true;
            if (z10) {
                this.f1216s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f1205h = true;
            this.f1208k = true;
        }
        m1639i(z10);
    }

    /* JADX INFO: renamed from: M */
    public boolean m1612M(MenuItem menuItem, int i10) {
        return m1613N(menuItem, null, i10);
    }

    /* JADX INFO: renamed from: N */
    public boolean m1613N(MenuItem menuItem, InterfaceC0419i interfaceC0419i, int i10) {
        C0417g c0417g = (C0417g) menuItem;
        if (c0417g == null || !c0417g.isEnabled()) {
            return false;
        }
        boolean zM1674k = c0417g.m1674k();
        AbstractC0585b abstractC0585bMo1665a = c0417g.mo1665a();
        boolean z10 = abstractC0585bMo1665a != null && abstractC0585bMo1665a.mo1866a();
        if (c0417g.m1673j()) {
            boolean zExpandActionView = c0417g.expandActionView() | zM1674k;
            if (zExpandActionView) {
                m1634e(true);
            }
            return zExpandActionView;
        }
        if (!c0417g.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                m1634e(true);
            }
            return zM1674k;
        }
        if ((i10 & 4) == 0) {
            m1634e(false);
        }
        if (!c0417g.hasSubMenu()) {
            c0417g.m1687x(new SubMenuC0422l(m1650u(), this, c0417g));
        }
        SubMenuC0422l subMenuC0422l = (SubMenuC0422l) c0417g.getSubMenu();
        if (z10) {
            abstractC0585bMo1665a.mo1868f(subMenuC0422l);
        }
        boolean zM1640j = m1640j(subMenuC0422l, interfaceC0419i) | zM1674k;
        if (!zM1640j) {
            m1634e(true);
        }
        return zM1640j;
    }

    /* JADX INFO: renamed from: O */
    public final void m1614O(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f1203f.size()) {
            return;
        }
        this.f1203f.remove(i10);
        if (z10) {
            m1611L(true);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m1615P(InterfaceC0419i interfaceC0419i) {
        for (WeakReference<InterfaceC0419i> weakReference : this.f1220w) {
            InterfaceC0419i interfaceC0419i2 = weakReference.get();
            if (interfaceC0419i2 == null || interfaceC0419i2 == interfaceC0419i) {
                this.f1220w.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m1616Q(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1649t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0422l) item.getSubMenu()).m1616Q(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: R */
    public void m1617R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0422l) item.getSubMenu()).m1617R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1649t(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo1618S(a aVar) {
        this.f1202e = aVar;
    }

    /* JADX INFO: renamed from: T */
    public C0415e m1619T(int i10) {
        this.f1209l = i10;
        return this;
    }

    /* JADX INFO: renamed from: U */
    public void m1620U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1203f.size();
        m1635e0();
        for (int i10 = 0; i10 < size; i10++) {
            C0417g c0417g = this.f1203f.get(i10);
            if (c0417g.getGroupId() == groupId && c0417g.m1676m() && c0417g.isCheckable()) {
                c0417g.m1682s(c0417g == menuItem);
            }
        }
        m1633d0();
    }

    /* JADX INFO: renamed from: V */
    public C0415e m1621V(int i10) {
        m1623X(0, null, i10, null, null);
        return this;
    }

    /* JADX INFO: renamed from: W */
    public C0415e m1622W(Drawable drawable) {
        m1623X(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: renamed from: X */
    public final void m1623X(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesM1602C = m1602C();
        if (view != null) {
            this.f1213p = view;
            this.f1211n = null;
            this.f1212o = null;
        } else {
            if (i10 > 0) {
                this.f1211n = resourcesM1602C.getText(i10);
            } else if (charSequence != null) {
                this.f1211n = charSequence;
            }
            if (i11 > 0) {
                this.f1212o = C7975b.m33008f(m1650u(), i11);
            } else if (drawable != null) {
                this.f1212o = drawable;
            }
            this.f1213p = null;
        }
        m1611L(false);
    }

    /* JADX INFO: renamed from: Y */
    public C0415e m1624Y(int i10) {
        m1623X(i10, null, 0, null, null);
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public C0415e m1625Z(CharSequence charSequence) {
        m1623X(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public MenuItem m1626a(int i10, int i11, int i12, CharSequence charSequence) {
        int iM1599B = m1599B(i12);
        C0417g c0417gM1637g = m1637g(i10, i11, i12, iM1599B, charSequence, this.f1209l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1210m;
        if (contextMenuInfo != null) {
            c0417gM1637g.m1685v(contextMenuInfo);
        }
        ArrayList<C0417g> arrayList = this.f1203f;
        arrayList.add(m1600n(arrayList, iM1599B), c0417gM1637g);
        m1611L(true);
        return c0417gM1637g;
    }

    /* JADX INFO: renamed from: a0 */
    public C0415e m1627a0(View view) {
        m1623X(0, null, 0, null, view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m1626a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1198a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m1628b(InterfaceC0419i interfaceC0419i) {
        m1630c(interfaceC0419i, this.f1198a);
    }

    /* JADX INFO: renamed from: b0 */
    public void m1629b0(boolean z10) {
        this.f1223z = z10;
    }

    /* JADX INFO: renamed from: c */
    public void m1630c(InterfaceC0419i interfaceC0419i, Context context) {
        this.f1220w.add(new WeakReference<>(interfaceC0419i));
        interfaceC0419i.mo1559i(context, this);
        this.f1208k = true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: c0 */
    public final void m1631c0(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = this.f1199b.getConfiguration().keyboard != 1 && C0631r0.m3169j(ViewConfiguration.get(this.f1198a), this.f1198a);
        }
        this.f1201d = z11;
    }

    @Override // android.view.Menu
    public void clear() {
        C0417g c0417g = this.f1221x;
        if (c0417g != null) {
            mo1636f(c0417g);
        }
        this.f1203f.clear();
        m1611L(true);
    }

    public void clearHeader() {
        this.f1212o = null;
        this.f1211n = null;
        this.f1213p = null;
        m1611L(false);
    }

    @Override // android.view.Menu
    public void close() {
        m1634e(true);
    }

    /* JADX INFO: renamed from: d */
    public void m1632d() {
        a aVar = this.f1202e;
        if (aVar != null) {
            aVar.mo1657b(this);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m1633d0() {
        this.f1214q = false;
        if (this.f1215r) {
            this.f1215r = false;
            m1611L(this.f1216s);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1634e(boolean z10) {
        if (this.f1218u) {
            return;
        }
        this.f1218u = true;
        for (WeakReference<InterfaceC0419i> weakReference : this.f1220w) {
            InterfaceC0419i interfaceC0419i = weakReference.get();
            if (interfaceC0419i == null) {
                this.f1220w.remove(weakReference);
            } else {
                interfaceC0419i.mo1553b(this, z10);
            }
        }
        this.f1218u = false;
    }

    /* JADX INFO: renamed from: e0 */
    public void m1635e0() {
        if (this.f1214q) {
            return;
        }
        this.f1214q = true;
        this.f1215r = false;
        this.f1216s = false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo1636f(C0417g c0417g) {
        boolean zMo1558h = false;
        if (!this.f1220w.isEmpty() && this.f1221x == c0417g) {
            m1635e0();
            for (WeakReference<InterfaceC0419i> weakReference : this.f1220w) {
                InterfaceC0419i interfaceC0419i = weakReference.get();
                if (interfaceC0419i != null) {
                    zMo1558h = interfaceC0419i.mo1558h(this, c0417g);
                    if (zMo1558h) {
                        break;
                    }
                } else {
                    this.f1220w.remove(weakReference);
                }
            }
            m1633d0();
            if (zMo1558h) {
                this.f1221x = null;
            }
        }
        return zMo1558h;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            C0417g c0417g = this.f1203f.get(i11);
            if (c0417g.getItemId() == i10) {
                return c0417g;
            }
            if (c0417g.hasSubMenu() && (menuItemFindItem = c0417g.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C0417g m1637g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new C0417g(this, i10, i11, i12, i13, charSequence, i14);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f1203f.get(i10);
    }

    /* JADX INFO: renamed from: h */
    public boolean mo1638h(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
        a aVar = this.f1202e;
        return aVar != null && aVar.mo1656a(c0415e, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1223z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f1203f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m1639i(boolean z10) {
        if (this.f1220w.isEmpty()) {
            return;
        }
        m1635e0();
        for (WeakReference<InterfaceC0419i> weakReference : this.f1220w) {
            InterfaceC0419i interfaceC0419i = weakReference.get();
            if (interfaceC0419i == null) {
                this.f1220w.remove(weakReference);
            } else {
                interfaceC0419i.mo1557f(z10);
            }
        }
        m1633d0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m1645p(i10, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1640j(SubMenuC0422l subMenuC0422l, InterfaceC0419i interfaceC0419i) {
        if (this.f1220w.isEmpty()) {
            return false;
        }
        boolean zMo1556e = interfaceC0419i != null ? interfaceC0419i.mo1556e(subMenuC0422l) : false;
        for (WeakReference<InterfaceC0419i> weakReference : this.f1220w) {
            InterfaceC0419i interfaceC0419i2 = weakReference.get();
            if (interfaceC0419i2 == null) {
                this.f1220w.remove(weakReference);
            } else if (!zMo1556e) {
                zMo1556e = interfaceC0419i2.mo1556e(subMenuC0422l);
            }
        }
        return zMo1556e;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo1641k(C0417g c0417g) {
        boolean zMo1554c = false;
        if (this.f1220w.isEmpty()) {
            return false;
        }
        m1635e0();
        for (WeakReference<InterfaceC0419i> weakReference : this.f1220w) {
            InterfaceC0419i interfaceC0419i = weakReference.get();
            if (interfaceC0419i != null) {
                zMo1554c = interfaceC0419i.mo1554c(this, c0417g);
                if (zMo1554c) {
                    break;
                }
            } else {
                this.f1220w.remove(weakReference);
            }
        }
        m1633d0();
        if (zMo1554c) {
            this.f1221x = c0417g;
        }
        return zMo1554c;
    }

    /* JADX INFO: renamed from: l */
    public int m1642l(int i10) {
        return m1643m(i10, 0);
    }

    /* JADX INFO: renamed from: m */
    public int m1643m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f1203f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public int m1644o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1203f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public C0417g m1645p(int i10, KeyEvent keyEvent) {
        ArrayList<C0417g> arrayList = this.f1219v;
        arrayList.clear();
        m1646q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMo1607H = mo1607H();
        for (int i11 = 0; i11 < size; i11++) {
            C0417g c0417g = arrayList.get(i11);
            char alphabeticShortcut = zMo1607H ? c0417g.getAlphabeticShortcut() : c0417g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zMo1607H && alphabeticShortcut == '\b' && i10 == 67))) {
                return c0417g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return m1612M(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        C0417g c0417gM1645p = m1645p(i10, keyEvent);
        boolean zM1612M = c0417gM1645p != null ? m1612M(c0417gM1645p, i11) : false;
        if ((i11 & 2) != 0) {
            m1634e(true);
        }
        return zM1612M;
    }

    /* JADX INFO: renamed from: q */
    public void m1646q(List<C0417g> list, int i10, KeyEvent keyEvent) {
        boolean zMo1607H = mo1607H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1203f.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0417g c0417g = this.f1203f.get(i11);
                if (c0417g.hasSubMenu()) {
                    ((C0415e) c0417g.getSubMenu()).m1646q(list, i10, keyEvent);
                }
                char alphabeticShortcut = zMo1607H ? c0417g.getAlphabeticShortcut() : c0417g.getNumericShortcut();
                if ((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((zMo1607H ? c0417g.getAlphabeticModifiers() : c0417g.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zMo1607H && alphabeticShortcut == '\b' && i10 == 67)) && c0417g.isEnabled()) {
                        list.add(c0417g);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1647r() {
        ArrayList<C0417g> arrayListM1604E = m1604E();
        if (this.f1208k) {
            boolean zMo1575g = false;
            for (WeakReference<InterfaceC0419i> weakReference : this.f1220w) {
                InterfaceC0419i interfaceC0419i = weakReference.get();
                if (interfaceC0419i == null) {
                    this.f1220w.remove(weakReference);
                } else {
                    zMo1575g |= interfaceC0419i.mo1575g();
                }
            }
            if (zMo1575g) {
                this.f1206i.clear();
                this.f1207j.clear();
                int size = arrayListM1604E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0417g c0417g = arrayListM1604E.get(i10);
                    if (c0417g.m1675l()) {
                        this.f1206i.add(c0417g);
                    } else {
                        this.f1207j.add(c0417g);
                    }
                }
            } else {
                this.f1206i.clear();
                this.f1207j.clear();
                this.f1207j.addAll(m1604E());
            }
            this.f1208k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iM1642l = m1642l(i10);
        if (iM1642l >= 0) {
            int size = this.f1203f.size() - iM1642l;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f1203f.get(iM1642l).getGroupId() != i10) {
                    break;
                }
                m1614O(iM1642l, false);
                i11 = i12;
            }
            m1611L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m1614O(m1644o(i10), true);
    }

    /* JADX INFO: renamed from: s */
    public ArrayList<C0417g> m1648s() {
        m1647r();
        return this.f1206i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1203f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0417g c0417g = this.f1203f.get(i11);
            if (c0417g.getGroupId() == i10) {
                c0417g.m1683t(z11);
                c0417g.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1222y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1203f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0417g c0417g = this.f1203f.get(i11);
            if (c0417g.getGroupId() == i10) {
                c0417g.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1203f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C0417g c0417g = this.f1203f.get(i11);
            if (c0417g.getGroupId() == i10 && c0417g.m1688y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            m1611L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1200c = z10;
        m1611L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1203f.size();
    }

    /* JADX INFO: renamed from: t */
    public String mo1649t() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: u */
    public Context m1650u() {
        return this.f1198a;
    }

    /* JADX INFO: renamed from: v */
    public C0417g m1651v() {
        return this.f1221x;
    }

    /* JADX INFO: renamed from: w */
    public Drawable m1652w() {
        return this.f1212o;
    }

    /* JADX INFO: renamed from: x */
    public CharSequence m1653x() {
        return this.f1211n;
    }

    /* JADX INFO: renamed from: y */
    public View m1654y() {
        return this.f1213p;
    }

    /* JADX INFO: renamed from: z */
    public ArrayList<C0417g> m1655z() {
        m1647r();
        return this.f1207j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m1626a(0, 0, 0, this.f1199b.getString(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f1199b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m1626a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C0417g c0417g = (C0417g) m1626a(i10, i11, i12, charSequence);
        SubMenuC0422l subMenuC0422l = new SubMenuC0422l(this.f1198a, this, c0417g);
        c0417g.m1687x(subMenuC0422l);
        return subMenuC0422l;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m1626a(i10, i11, i12, this.f1199b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1199b.getString(i13));
    }
}
