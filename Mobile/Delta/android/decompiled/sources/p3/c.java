package p3;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LayoutInflater f28212k;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f28211j = i10;
        this.f28210i = i10;
        this.f28212k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p3.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28212k.inflate(this.f28211j, viewGroup, false);
    }

    @Override // p3.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f28212k.inflate(this.f28210i, viewGroup, false);
    }
}
