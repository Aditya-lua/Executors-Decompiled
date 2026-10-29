package p568y6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.C10346h;

/* JADX INFO: renamed from: y6.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, m31665d2 = {"Ly6/k;", "Landroid/view/View;", "T", "Ly6/i;", "Ly6/g;", "a", "(Lnt/b;)Ljava/lang/Object;", "i", "()Ly6/g;", "Ly6/a;", "getWidth", "()Ly6/a;", "getHeight", "", "paramSize", "viewSize", "paddingSize", "d", "(III)Ly6/a;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "", "e", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "getView", "()Landroid/view/View;", "view", "", "f", "()Z", "subtractPadding", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC13112k<T extends View> extends InterfaceC13110i {

    /* JADX INFO: renamed from: y6.k$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13112k<T> f46351a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserver f46352b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f46353c;

        public a(InterfaceC13112k<T> interfaceC13112k, ViewTreeObserver viewTreeObserver, b bVar) {
            this.f46351a = interfaceC13112k;
            this.f46352b = viewTreeObserver;
            this.f46353c = bVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m48721a(Throwable th2) {
            this.f46351a.m48719e(this.f46352b, this.f46353c);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m48721a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: y6.k$b */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m31665d2 = {"y6/k$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "a", "Z", "isResumed", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isResumed;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC13112k<T> f46355b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewTreeObserver f46356c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC7897n<Size> f46357d;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ku.n<? super y6.g> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC13112k<T> interfaceC13112k, ViewTreeObserver viewTreeObserver, InterfaceC7897n<? super Size> interfaceC7897n) {
            this.f46355b = interfaceC13112k;
            this.f46356c = viewTreeObserver;
            this.f46357d = interfaceC7897n;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Size sizeM48720i = this.f46355b.m48720i();
            if (sizeM48720i != null) {
                this.f46355b.m48719e(this.f46356c, this);
                if (!this.isResumed) {
                    this.isResumed = true;
                    this.f46357d.resumeWith(C7347n.m30460b(sizeM48720i));
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ <T extends View> Object m48716c(InterfaceC13112k<T> interfaceC13112k, InterfaceC9557b<? super Size> interfaceC9557b) {
        Size sizeM48720i = interfaceC13112k.m48720i();
        if (sizeM48720i != null) {
            return sizeM48720i;
        }
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        ViewTreeObserver viewTreeObserver = interfaceC13112k.getView().getViewTreeObserver();
        b bVar = new b(interfaceC13112k, viewTreeObserver, c7905p);
        viewTreeObserver.addOnPreDrawListener(bVar);
        c7905p.mo32815n(new a(interfaceC13112k, viewTreeObserver, bVar));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    @Override // p568y6.InterfaceC13110i
    @Nullable
    /* JADX INFO: renamed from: a */
    default Object mo48705a(@NotNull InterfaceC9557b<? super Size> interfaceC9557b) {
        return m48716c(this, interfaceC9557b);
    }

    /* JADX INFO: renamed from: d */
    default InterfaceC13102a m48718d(int paramSize, int viewSize, int paddingSize) {
        if (paramSize == -2) {
            return InterfaceC13102a.b.f46332a;
        }
        int i10 = paramSize - paddingSize;
        if (i10 > 0) {
            return InterfaceC13102a.a.m48697a(C13103b.m48703a(i10));
        }
        int i11 = viewSize - paddingSize;
        if (i11 > 0) {
            return InterfaceC13102a.a.m48697a(C13103b.m48703a(i11));
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    default void m48719e(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* JADX INFO: renamed from: f */
    default boolean mo48706f() {
        return true;
    }

    default InterfaceC13102a getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m48718d(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), mo48706f() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    @NotNull
    T getView();

    default InterfaceC13102a getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m48718d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), mo48706f() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    /* JADX INFO: renamed from: i */
    default Size m48720i() {
        InterfaceC13102a height;
        InterfaceC13102a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }
}
