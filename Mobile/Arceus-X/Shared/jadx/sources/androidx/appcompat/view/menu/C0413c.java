package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p181i.C6595g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.c */
/* JADX INFO: loaded from: classes.dex */
public class C0413c implements InterfaceC0419i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f1180a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f1181b;

    /* JADX INFO: renamed from: c */
    public C0415e f1182c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f1183d;

    /* JADX INFO: renamed from: e */
    public int f1184e;

    /* JADX INFO: renamed from: f */
    public int f1185f;

    /* JADX INFO: renamed from: g */
    public int f1186g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0419i.a f1187h;

    /* JADX INFO: renamed from: i */
    public a f1188i;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.c$a */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public int f1189a = -1;

        public a() {
            m1593a();
        }

        /* JADX INFO: renamed from: a */
        public void m1593a() {
            C0417g c0417gM1651v = C0413c.this.f1182c.m1651v();
            if (c0417gM1651v != null) {
                ArrayList<C0417g> arrayListM1655z = C0413c.this.f1182c.m1655z();
                int size = arrayListM1655z.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListM1655z.get(i10) == c0417gM1651v) {
                        this.f1189a = i10;
                        return;
                    }
                }
            }
            this.f1189a = -1;
        }

        /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0417g getItem(int i10) {
            ArrayList<C0417g> arrayListM1655z = C0413c.this.f1182c.m1655z();
            int i11 = i10 + C0413c.this.f1184e;
            int i12 = this.f1189a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListM1655z.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0413c.this.f1182c.m1655z().size() - C0413c.this.f1184e;
            return this.f1189a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0413c c0413c = C0413c.this;
                view = c0413c.f1181b.inflate(c0413c.f1186g, viewGroup, false);
            }
            ((InterfaceC0420j.a) view).mo1537c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m1593a();
            super.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0413c(Context context, int i10) {
        this(i10, 0);
        this.f1180a = context;
        this.f1181b = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: a */
    public ListAdapter m1591a() {
        if (this.f1188i == null) {
            this.f1188i = new a();
        }
        return this.f1188i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: b */
    public void mo1553b(C0415e c0415e, boolean z10) {
        InterfaceC0419i.a aVar = this.f1187h;
        if (aVar != null) {
            aVar.mo1659b(c0415e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: c */
    public boolean mo1554c(C0415e c0415e, C0417g c0417g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: d */
    public void mo1555d(InterfaceC0419i.a aVar) {
        this.f1187h = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: e */
    public boolean mo1556e(SubMenuC0422l subMenuC0422l) {
        if (!subMenuC0422l.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0416f(subMenuC0422l).m1661d(null);
        InterfaceC0419i.a aVar = this.f1187h;
        if (aVar == null) {
            return true;
        }
        aVar.mo1660c(subMenuC0422l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: f */
    public void mo1557f(boolean z10) {
        a aVar = this.f1188i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: g */
    public boolean mo1575g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: h */
    public boolean mo1558h(C0415e c0415e, C0417g c0417g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: i */
    public void mo1559i(Context context, C0415e c0415e) {
        if (this.f1185f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1185f);
            this.f1180a = contextThemeWrapper;
            this.f1181b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1180a != null) {
            this.f1180a = context;
            if (this.f1181b == null) {
                this.f1181b = LayoutInflater.from(context);
            }
        }
        this.f1182c = c0415e;
        a aVar = this.f1188i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC0420j m1592j(ViewGroup viewGroup) {
        if (this.f1183d == null) {
            this.f1183d = (ExpandedMenuView) this.f1181b.inflate(C6595g.f25168i, viewGroup, false);
            if (this.f1188i == null) {
                this.f1188i = new a();
            }
            this.f1183d.setAdapter((ListAdapter) this.f1188i);
            this.f1183d.setOnItemClickListener(this);
        }
        return this.f1183d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1182c.m1613N(this.f1188i.getItem(i10), this, 0);
    }

    public C0413c(int i10, int i11) {
        this.f1186g = i10;
        this.f1185f = i11;
    }
}
