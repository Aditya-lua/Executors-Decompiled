package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import au.InterfaceC1170a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.view.u0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m31665d2 = {"Landroid/view/ViewGroup;", "", "Landroid/view/View;", "c", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "b", "descendants", "core-ktx_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0637u0 {

    /* JADX INFO: renamed from: androidx.core.view.u0$a */
    @Metadata(m31664d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"androidx/core/view/u0$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements Sequence<View> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f2487a;

        public a(ViewGroup viewGroup) {
            this.f2487a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return C0637u0.m3200c(this.f2487a);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.u0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b implements Function1<View, Iterator<? extends View>> {

        /* JADX INFO: renamed from: a */
        public static final b f2488a = new b();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            Sequence<View> sequenceM3198a;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (sequenceM3198a = C0637u0.m3198a(viewGroup)) == null) {
                return null;
            }
            return sequenceM3198a.iterator();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.u0$c */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"androidx/core/view/u0$c", "", "Landroid/view/View;", "", "hasNext", "()Z", "b", "()Landroid/view/View;", "", "remove", "()V", "", "a", "I", "index", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class c implements Iterator<View>, InterfaceC1170a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewGroup f2490b;

        public c(ViewGroup viewGroup) {
            this.f2490b = viewGroup;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f2490b;
            int i10 = this.index;
            this.index = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f2490b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f2490b;
            int i10 = this.index - 1;
            this.index = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.u0$d */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"androidx/core/view/u0$d", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class d implements Sequence<View> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f2491a;

        public d(ViewGroup viewGroup) {
            this.f2491a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return new C0615k0(C0637u0.m3198a(this.f2491a).iterator(), b.f2488a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Sequence<View> m3198a(@NotNull ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Sequence<View> m3199b(@NotNull ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Iterator<View> m3200c(@NotNull ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
