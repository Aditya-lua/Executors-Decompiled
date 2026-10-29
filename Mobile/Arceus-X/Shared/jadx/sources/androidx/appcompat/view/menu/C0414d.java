package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.d */
/* JADX INFO: loaded from: classes.dex */
public class C0414d extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public C0415e f1191a;

    /* JADX INFO: renamed from: b */
    public int f1192b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f1193c;

    /* JADX INFO: renamed from: d */
    public final boolean f1194d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f1195e;

    /* JADX INFO: renamed from: f */
    public final int f1196f;

    public C0414d(C0415e c0415e, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1194d = z10;
        this.f1195e = layoutInflater;
        this.f1191a = c0415e;
        this.f1196f = i10;
        m1595a();
    }

    /* JADX INFO: renamed from: a */
    public void m1595a() {
        C0417g c0417gM1651v = this.f1191a.m1651v();
        if (c0417gM1651v != null) {
            ArrayList<C0417g> arrayListM1655z = this.f1191a.m1655z();
            int size = arrayListM1655z.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListM1655z.get(i10) == c0417gM1651v) {
                    this.f1192b = i10;
                    return;
                }
            }
        }
        this.f1192b = -1;
    }

    /* JADX INFO: renamed from: b */
    public C0415e m1596b() {
        return this.f1191a;
    }

    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0417g getItem(int i10) {
        ArrayList<C0417g> arrayListM1655z = this.f1194d ? this.f1191a.m1655z() : this.f1191a.m1604E();
        int i11 = this.f1192b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListM1655z.get(i10);
    }

    /* JADX INFO: renamed from: d */
    public void m1598d(boolean z10) {
        this.f1193c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0417g> arrayListM1655z = this.f1194d ? this.f1191a.m1655z() : this.f1191a.m1604E();
        return this.f1192b < 0 ? arrayListM1655z.size() : arrayListM1655z.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1195e.inflate(this.f1196f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1191a.mo1606G() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        InterfaceC0420j.a aVar = (InterfaceC0420j.a) view;
        if (this.f1193c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1537c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m1595a();
        super.notifyDataSetChanged();
    }
}
