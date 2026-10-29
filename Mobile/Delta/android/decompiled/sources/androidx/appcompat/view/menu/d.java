package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f909a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f913f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f911d = z10;
        this.f912e = layoutInflater;
        this.f909a = eVar;
        this.f913f = i10;
        a();
    }

    public void a() {
        g gVarV = this.f909a.v();
        if (gVarV != null) {
            ArrayList<g> arrayListZ = this.f909a.z();
            int size = arrayListZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListZ.get(i10) == gVarV) {
                    this.b = i10;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public e b() {
        return this.f909a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList<g> arrayListZ = this.f911d ? this.f909a.z() : this.f909a.E();
        int i11 = this.b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListZ.get(i10);
    }

    public void d(boolean z10) {
        this.f910c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListZ = this.f911d ? this.f909a.z() : this.f909a.E();
        return this.b < 0 ? arrayListZ.size() : arrayListZ.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f912e.inflate(this.f913f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f909a.G() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f910c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
