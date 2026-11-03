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

/* JADX INFO: loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f745a;
    public LayoutInflater b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i.a f751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f752i;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f753a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVarV = c.this.f746c.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f746c.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListZ.get(i10) == gVarV) {
                        this.f753a = i10;
                        return;
                    }
                }
            }
            this.f753a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList<g> arrayListZ = c.this.f746c.z();
            int i11 = i10 + c.this.f748e;
            int i12 = this.f753a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f746c.z().size() - c.this.f748e;
            return this.f753a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.b.inflate(cVar.f750g, viewGroup, false);
            }
            ((j.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f745a = context;
        this.b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f752i == null) {
            this.f752i = new a();
        }
        return this.f752i;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        i.a aVar = this.f751h;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f751h = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d(null);
        i.a aVar = this.f751h;
        if (aVar == null) {
            return true;
        }
        aVar.c(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        a aVar = this.f752i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        if (this.f749f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f749f);
            this.f745a = contextThemeWrapper;
            this.b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f745a != null) {
            this.f745a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.f746c = eVar;
        a aVar = this.f752i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public j j(ViewGroup viewGroup) {
        if (this.f747d == null) {
            this.f747d = (ExpandedMenuView) this.b.inflate(i.g.f20102i, viewGroup, false);
            if (this.f752i == null) {
                this.f752i = new a();
            }
            this.f747d.setAdapter((ListAdapter) this.f752i);
            this.f747d.setOnItemClickListener(this);
        }
        return this.f747d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f746c.N(this.f752i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f750g = i10;
        this.f749f = i11;
    }
}
