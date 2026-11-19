package lt;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView.BufferType f22526a;
    public final fo.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f22527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f22528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j> f22529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22530f;

    public i(@NonNull TextView.BufferType bufferType, e.b bVar, @NonNull fo.f fVar, @NonNull n nVar, @NonNull g gVar, @NonNull List<j> list, boolean z10) {
        this.f22526a = bufferType;
        this.b = fVar;
        this.f22527c = nVar;
        this.f22528d = gVar;
        this.f22529e = list;
        this.f22530f = z10;
    }

    @Override // lt.e
    public void c(@NonNull TextView textView, @NonNull String str) {
        d(textView, e(str));
    }

    @Override // lt.e
    public void d(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<j> it = this.f22529e.iterator();
        while (it.hasNext()) {
            it.next().k(textView, spanned);
        }
        textView.setText(spanned, this.f22526a);
        Iterator<j> it2 = this.f22529e.iterator();
        while (it2.hasNext()) {
            it2.next().c(textView);
        }
    }

    @Override // lt.e
    @NonNull
    public Spanned e(@NonNull String str) {
        Spanned spannedG = g(f(str));
        return (TextUtils.isEmpty(spannedG) && this.f22530f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedG;
    }

    @NonNull
    public eo.s f(@NonNull String str) {
        Iterator<j> it = this.f22529e.iterator();
        while (it.hasNext()) {
            str = it.next().f(str);
        }
        return this.b.b(str);
    }

    @NonNull
    public Spanned g(@NonNull eo.s sVar) {
        Iterator<j> it = this.f22529e.iterator();
        while (it.hasNext()) {
            it.next().i(sVar);
        }
        m mVarA = this.f22527c.a();
        sVar.a(mVarA);
        Iterator<j> it2 = this.f22529e.iterator();
        while (it2.hasNext()) {
            it2.next().d(sVar, mVarA);
        }
        return mVarA.builder().l();
    }
}
