package p350p3;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: renamed from: p3.b */
/* JADX INFO: loaded from: classes.dex */
public class C10155b extends Filter {

    /* JADX INFO: renamed from: a */
    public a f36527a;

    /* JADX INFO: renamed from: p3.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo39095a(Cursor cursor);

        /* JADX INFO: renamed from: b */
        Cursor mo39103b(CharSequence charSequence);

        /* JADX INFO: renamed from: c */
        Cursor mo39096c();

        CharSequence convertToString(Cursor cursor);
    }

    public C10155b(a aVar) {
        this.f36527a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f36527a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo39103b = this.f36527a.mo39103b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo39103b != null) {
            filterResults.count = cursorMo39103b.getCount();
            filterResults.values = cursorMo39103b;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorMo39096c = this.f36527a.mo39096c();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorMo39096c) {
            return;
        }
        this.f36527a.mo39095a((Cursor) obj);
    }
}
