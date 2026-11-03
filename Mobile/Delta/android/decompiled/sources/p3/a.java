package p3;

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

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, p3.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28419a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f28420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f28421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0497a f28423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DataSetObserver f28424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p3.b f28425h;

    /* JADX INFO: renamed from: p3.a$a, reason: collision with other inner class name */
    public class C0497a extends ContentObserver {
        public C0497a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f28419a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f28419a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    @Override // p3.b.a
    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // p3.b.a
    public Cursor c() {
        return this.f28420c;
    }

    @Override // p3.b.a
    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    public void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.b = true;
        } else {
            this.b = false;
        }
        boolean z10 = cursor != null;
        this.f28420c = cursor;
        this.f28419a = z10;
        this.f28421d = context;
        this.f28422e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f28423f = new C0497a();
            this.f28424g = new b();
        } else {
            this.f28423f = null;
            this.f28424g = null;
        }
        if (z10) {
            C0497a c0497a = this.f28423f;
            if (c0497a != null) {
                cursor.registerContentObserver(c0497a);
            }
            DataSetObserver dataSetObserver = this.f28424g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f28419a || (cursor = this.f28420c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f28419a) {
            return null;
        }
        this.f28420c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f28421d, this.f28420c, viewGroup);
        }
        d(view, this.f28421d, this.f28420c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f28425h == null) {
            this.f28425h = new p3.b(this);
        }
        return this.f28425h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f28419a || (cursor = this.f28420c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f28420c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f28419a && (cursor = this.f28420c) != null && cursor.moveToPosition(i10)) {
            return this.f28420c.getLong(this.f28422e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f28419a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f28420c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f28421d, this.f28420c, viewGroup);
            }
            d(view, this.f28421d, this.f28420c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public void h() {
        Cursor cursor;
        if (!this.b || (cursor = this.f28420c) == null || cursor.isClosed()) {
            return;
        }
        this.f28419a = this.f28420c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f28420c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0497a c0497a = this.f28423f;
            if (c0497a != null) {
                cursor2.unregisterContentObserver(c0497a);
            }
            DataSetObserver dataSetObserver = this.f28424g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f28420c = cursor;
        if (cursor == null) {
            this.f28422e = -1;
            this.f28419a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0497a c0497a2 = this.f28423f;
        if (c0497a2 != null) {
            cursor.registerContentObserver(c0497a2);
        }
        DataSetObserver dataSetObserver2 = this.f28424g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f28422e = cursor.getColumnIndexOrThrow("_id");
        this.f28419a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
