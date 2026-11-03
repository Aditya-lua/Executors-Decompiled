package ss;

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
    public final TextView.BufferType f31792a;
    public final pn.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f31793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f31794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j> f31795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31796f;

    public i(@NonNull TextView.BufferType bufferType, e.b bVar, @NonNull pn.f fVar, @NonNull n nVar, @NonNull g gVar, @NonNull List<j> list, boolean z10) {
        this.f31792a = bufferType;
        this.b = fVar;
        this.f31793c = nVar;
        this.f31794d = gVar;
        this.f31795e = list;
        this.f31796f = z10;
    }

    @Override // ss.e
    public void c(@NonNull TextView textView, @NonNull String str) {
        d(textView, e(str));
    }

    @Override // ss.e
    public void d(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<j> it = this.f31795e.iterator();
        while (it.hasNext()) {
            it.next().k(textView, spanned);
        }
        textView.setText(spanned, this.f31792a);
        Iterator<j> it2 = this.f31795e.iterator();
        while (it2.hasNext()) {
            it2.next().c(textView);
        }
    }

    @Override // ss.e
    @NonNull
    public Spanned e(@NonNull String str) {
        Spanned spannedG = g(f(str));
        return (TextUtils.isEmpty(spannedG) && this.f31796f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedG;
    }

    @NonNull
    public on.s f(@NonNull String str) {
        Iterator<j> it = this.f31795e.iterator();
        while (it.hasNext()) {
            str = it.next().g(str);
        }
        return this.b.b(str);
    }

    @NonNull
    public Spanned g(@NonNull on.s sVar) {
        Iterator<j> it = this.f31795e.iterator();
        while (it.hasNext()) {
            it.next().d(sVar);
        }
        m mVarA = this.f31793c.a();
        sVar.a(mVarA);
        Iterator<j> it2 = this.f31795e.iterator();
        while (it2.hasNext()) {
            it2.next().j(sVar, mVarA);
        }
        return mVarA.builder().l();
    }
}
