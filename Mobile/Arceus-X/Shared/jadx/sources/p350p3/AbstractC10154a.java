package p350p3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: p3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10154a extends BaseAdapter implements Filterable, C10155b.a {

    /* JADX INFO: renamed from: a */
    public boolean f36517a;

    /* JADX INFO: renamed from: b */
    public boolean f36518b;

    /* JADX INFO: renamed from: c */
    public Cursor f36519c;

    /* JADX INFO: renamed from: d */
    public Context f36520d;

    /* JADX INFO: renamed from: e */
    public int f36521e;

    /* JADX INFO: renamed from: f */
    public a f36522f;

    /* JADX INFO: renamed from: g */
    public DataSetObserver f36523g;

    /* JADX INFO: renamed from: h */
    public C10155b f36524h;

    /* JADX INFO: renamed from: p3.a$a */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC10154a.this.m39101h();
        }
    }

    /* JADX INFO: renamed from: p3.a$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC10154a abstractC10154a = AbstractC10154a.this;
            abstractC10154a.f36517a = true;
            abstractC10154a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC10154a abstractC10154a = AbstractC10154a.this;
            abstractC10154a.f36517a = false;
            abstractC10154a.notifyDataSetInvalidated();
        }
    }

    public AbstractC10154a(Context context, Cursor cursor, boolean z10) {
        m39098e(context, cursor, z10 ? 1 : 2);
    }

    @Override // p350p3.C10155b.a
    /* JADX INFO: renamed from: a */
    public void mo39095a(Cursor cursor) {
        Cursor cursorM39102i = m39102i(cursor);
        if (cursorM39102i != null) {
            cursorM39102i.close();
        }
    }

    @Override // p350p3.C10155b.a
    /* JADX INFO: renamed from: c */
    public Cursor mo39096c() {
        return this.f36519c;
    }

    @Override // p350p3.C10155b.a
    public abstract CharSequence convertToString(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract void mo39097d(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: e */
    public void m39098e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f36518b = true;
        } else {
            this.f36518b = false;
        }
        boolean z10 = cursor != null;
        this.f36519c = cursor;
        this.f36517a = z10;
        this.f36520d = context;
        this.f36521e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f36522f = new a();
            this.f36523g = new b();
        } else {
            this.f36522f = null;
            this.f36523g = null;
        }
        if (z10) {
            a aVar = this.f36522f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f36523g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract View mo39099f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* JADX INFO: renamed from: g */
    public abstract View mo39100g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f36517a || (cursor = this.f36519c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f36517a) {
            return null;
        }
        this.f36519c.moveToPosition(i10);
        if (view == null) {
            view = mo39099f(this.f36520d, this.f36519c, viewGroup);
        }
        mo39097d(view, this.f36520d, this.f36519c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f36524h == null) {
            this.f36524h = new C10155b(this);
        }
        return this.f36524h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f36517a || (cursor = this.f36519c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f36519c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f36517a && (cursor = this.f36519c) != null && cursor.moveToPosition(i10)) {
            return this.f36519c.getLong(this.f36521e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f36517a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f36519c.moveToPosition(i10)) {
            if (view == null) {
                view = mo39100g(this.f36520d, this.f36519c, viewGroup);
            }
            mo39097d(view, this.f36520d, this.f36519c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    /* JADX INFO: renamed from: h */
    public void m39101h() {
        Cursor cursor;
        if (!this.f36518b || (cursor = this.f36519c) == null || cursor.isClosed()) {
            return;
        }
        this.f36517a = this.f36519c.requery();
    }

    /* JADX INFO: renamed from: i */
    public Cursor m39102i(Cursor cursor) {
        Cursor cursor2 = this.f36519c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f36522f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f36523g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f36519c = cursor;
        if (cursor == null) {
            this.f36521e = -1;
            this.f36517a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        a aVar2 = this.f36522f;
        if (aVar2 != null) {
            cursor.registerContentObserver(aVar2);
        }
        DataSetObserver dataSetObserver2 = this.f36523g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f36521e = cursor.getColumnIndexOrThrow("_id");
        this.f36517a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
