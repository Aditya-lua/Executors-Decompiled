package p350p3;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: p3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10156c extends AbstractC10154a {

    /* JADX INFO: renamed from: i */
    public int f36528i;

    /* JADX INFO: renamed from: j */
    public int f36529j;

    /* JADX INFO: renamed from: k */
    public LayoutInflater f36530k;

    @Deprecated
    public AbstractC10156c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f36529j = i10;
        this.f36528i = i10;
        this.f36530k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p350p3.AbstractC10154a
    /* JADX INFO: renamed from: f */
    public View mo39099f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f36530k.inflate(this.f36529j, viewGroup, false);
    }

    @Override // p350p3.AbstractC10154a
    /* JADX INFO: renamed from: g */
    public View mo39100g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f36530k.inflate(this.f36528i, viewGroup, false);
    }
}
