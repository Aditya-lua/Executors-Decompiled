package us;

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
    public final TextView.BufferType f32602a;
    public final rn.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f32603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f32604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j> f32605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32606f;

    public i(@NonNull TextView.BufferType bufferType, e.b bVar, @NonNull rn.f fVar, @NonNull n nVar, @NonNull g gVar, @NonNull List<j> list, boolean z10) {
        this.f32602a = bufferType;
        this.b = fVar;
        this.f32603c = nVar;
        this.f32604d = gVar;
        this.f32605e = list;
        this.f32606f = z10;
    }

    @Override // us.e
    public void c(@NonNull TextView textView, @NonNull String str) {
        d(textView, e(str));
    }

    @Override // us.e
    public void d(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<j> it = this.f32605e.iterator();
        while (it.hasNext()) {
            it.next().j(textView, spanned);
        }
        textView.setText(spanned, this.f32602a);
        Iterator<j> it2 = this.f32605e.iterator();
        while (it2.hasNext()) {
            it2.next().b(textView);
        }
    }

    @Override // us.e
    @NonNull
    public Spanned e(@NonNull String str) {
        Spanned spannedG = g(f(str));
        return (TextUtils.isEmpty(spannedG) && this.f32606f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedG;
    }

    @NonNull
    public qn.s f(@NonNull String str) {
        Iterator<j> it = this.f32605e.iterator();
        while (it.hasNext()) {
            str = it.next().e(str);
        }
        return this.b.b(str);
    }

    @NonNull
    public Spanned g(@NonNull qn.s sVar) {
        Iterator<j> it = this.f32605e.iterator();
        while (it.hasNext()) {
            it.next().d(sVar);
        }
        m mVarA = this.f32603c.a();
        sVar.a(mVarA);
        Iterator<j> it2 = this.f32605e.iterator();
        while (it2.hasNext()) {
            it2.next().c(sVar, mVarA);
        }
        return mVarA.builder().l();
    }
}
