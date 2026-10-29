package y6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ku.n;
import ku.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Ly6/k;", "Landroid/view/View;", "T", "Ly6/i;", "Ly6/g;", "a", "(Lnt/b;)Ljava/lang/Object;", "i", "()Ly6/g;", "Ly6/a;", "getWidth", "()Ly6/a;", "getHeight", "", "paramSize", "viewSize", "paddingSize", "d", "(III)Ly6/a;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "", "e", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "getView", "()Landroid/view/View;", "view", "", "f", "()Z", "subtractPadding", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k<T extends View> extends i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<T> f35750a;
        public final /* synthetic */ ViewTreeObserver b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f35751c;

        public a(k<T> kVar, ViewTreeObserver viewTreeObserver, b bVar) {
            this.f35750a = kVar;
            this.b = viewTreeObserver;
            this.f35751c = bVar;
        }

        public final void a(Throwable th2) {
            this.f35750a.e(this.b, this.f35751c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"y6/k$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "a", "Z", "isResumed", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean isResumed;
        public final /* synthetic */ k<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver f35753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n<Size> f35754d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(k<T> kVar, ViewTreeObserver viewTreeObserver, n<? super Size> nVar) {
            this.b = kVar;
            this.f35753c = viewTreeObserver;
            this.f35754d = nVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Size sizeI = this.b.i();
            if (sizeI != null) {
                this.b.e(this.f35753c, this);
                if (!this.isResumed) {
                    this.isResumed = true;
                    this.f35754d.resumeWith(jt.n.b(sizeI));
                }
            }
            return true;
        }
    }

    static /* synthetic */ <T extends View> Object c(k<T> kVar, nt.b<? super Size> bVar) {
        Size sizeI = kVar.i();
        if (sizeI != null) {
            return sizeI;
        }
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        ViewTreeObserver viewTreeObserver = kVar.getView().getViewTreeObserver();
        b bVar2 = new b(kVar, viewTreeObserver, pVar);
        viewTreeObserver.addOnPreDrawListener(bVar2);
        pVar.n(new a(kVar, viewTreeObserver, bVar2));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    @Override // y6.i
    @Nullable
    default Object a(@NotNull nt.b<? super Size> bVar) {
        return c(this, bVar);
    }

    default y6.a d(int paramSize, int viewSize, int paddingSize) {
        if (paramSize == -2) {
            return y6.a.b.f35735a;
        }
        int i10 = paramSize - paddingSize;
        if (i10 > 0) {
            return y6.a.C0655a.a(y6.b.a(i10));
        }
        int i11 = viewSize - paddingSize;
        if (i11 > 0) {
            return y6.a.C0655a.a(y6.b.a(i11));
        }
        return null;
    }

    default void e(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean f() {
        return true;
    }

    default y6.a getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return d(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), f() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    @NotNull
    T getView();

    default y6.a getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), f() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    default Size i() {
        y6.a height;
        y6.a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }
}
