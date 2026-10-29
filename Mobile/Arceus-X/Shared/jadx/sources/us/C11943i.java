package us;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import p388qn.AbstractC10623s;
import p418rn.C10931f;

/* JADX INFO: renamed from: us.i */
/* JADX INFO: loaded from: classes3.dex */
public class C11943i extends AbstractC11939e {

    /* JADX INFO: renamed from: a */
    public final TextView.BufferType f42362a;

    /* JADX INFO: renamed from: b */
    public final C10931f f42363b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11948n f42364c;

    /* JADX INFO: renamed from: d */
    public final C11941g f42365d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC11944j> f42366e;

    /* JADX INFO: renamed from: f */
    public final boolean f42367f;

    public C11943i(@NonNull TextView.BufferType bufferType, AbstractC11939e.b bVar, @NonNull C10931f c10931f, @NonNull AbstractC11948n abstractC11948n, @NonNull C11941g c11941g, @NonNull List<InterfaceC11944j> list, boolean z10) {
        this.f42362a = bufferType;
        this.f42363b = c10931f;
        this.f42364c = abstractC11948n;
        this.f42365d = c11941g;
        this.f42366e = list;
        this.f42367f = z10;
    }

    @Override // us.AbstractC11939e
    /* JADX INFO: renamed from: c */
    public void mo44562c(@NonNull TextView textView, @NonNull String str) {
        mo44563d(textView, mo44564e(str));
    }

    @Override // us.AbstractC11939e
    /* JADX INFO: renamed from: d */
    public void mo44563d(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<InterfaceC11944j> it = this.f42366e.iterator();
        while (it.hasNext()) {
            it.next().mo44585j(textView, spanned);
        }
        textView.setText(spanned, this.f42362a);
        Iterator<InterfaceC11944j> it2 = this.f42366e.iterator();
        while (it2.hasNext()) {
            it2.next().mo44582b(textView);
        }
    }

    @Override // us.AbstractC11939e
    @NonNull
    /* JADX INFO: renamed from: e */
    public Spanned mo44564e(@NonNull String str) {
        Spanned spannedM44581g = m44581g(m44580f(str));
        return (TextUtils.isEmpty(spannedM44581g) && this.f42367f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedM44581g;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public AbstractC10623s m44580f(@NonNull String str) {
        Iterator<InterfaceC11944j> it = this.f42366e.iterator();
        while (it.hasNext()) {
            str = it.next().mo44552e(str);
        }
        return this.f42363b.m41512b(str);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public Spanned m44581g(@NonNull AbstractC10623s abstractC10623s) {
        Iterator<InterfaceC11944j> it = this.f42366e.iterator();
        while (it.hasNext()) {
            it.next().mo44551d(abstractC10623s);
        }
        InterfaceC11947m interfaceC11947mMo44602a = this.f42364c.mo44602a();
        abstractC10623s.mo40637a(interfaceC11947mMo44602a);
        Iterator<InterfaceC11944j> it2 = this.f42366e.iterator();
        while (it2.hasNext()) {
            it2.next().mo44550c(abstractC10623s, interfaceC11947mMo44602a);
        }
        return interfaceC11947mMo44602a.builder().m44625l();
    }
}
