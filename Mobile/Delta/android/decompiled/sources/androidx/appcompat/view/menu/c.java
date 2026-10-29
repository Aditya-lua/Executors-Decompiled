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
    public Context f900a;
    public LayoutInflater b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i.a f906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f907i;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f908a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVarV = c.this.f901c.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f901c.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListZ.get(i10) == gVarV) {
                        this.f908a = i10;
                        return;
                    }
                }
            }
            this.f908a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList<g> arrayListZ = c.this.f901c.z();
            int i11 = i10 + c.this.f903e;
            int i12 = this.f908a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f901c.z().size() - c.this.f903e;
            return this.f908a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.b.inflate(cVar.f905g, viewGroup, false);
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
        this.f900a = context;
        this.b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f907i == null) {
            this.f907i = new a();
        }
        return this.f907i;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        i.a aVar = this.f906h;
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
        this.f906h = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d(null);
        i.a aVar = this.f906h;
        if (aVar == null) {
            return true;
        }
        aVar.c(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        a aVar = this.f907i;
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
        if (this.f904f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f904f);
            this.f900a = contextThemeWrapper;
            this.b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f900a != null) {
            this.f900a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.f901c = eVar;
        a aVar = this.f907i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public j j(ViewGroup viewGroup) {
        if (this.f902d == null) {
            this.f902d = (ExpandedMenuView) this.b.inflate(i.g.f19986i, viewGroup, false);
            if (this.f907i == null) {
                this.f907i = new a();
            }
            this.f902d.setAdapter((ListAdapter) this.f907i);
            this.f902d.setOnItemClickListener(this);
        }
        return this.f902d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f901c.N(this.f907i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f905g = i10;
        this.f904f = i11;
    }
}
