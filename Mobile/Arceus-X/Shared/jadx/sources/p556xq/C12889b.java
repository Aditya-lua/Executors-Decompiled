package p556xq;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xq.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001c¨\u0006\u001f"}, m31665d2 = {"Lxq/b;", "", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;)V", "", "e", "()V", "Lxq/a;", "onPageChangeListenerHelper", "a", "(Lxq/a;)V", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2$i;", "b", "Landroidx/viewpager2/widget/ViewPager2$i;", "getOnPageChangeCallback", "()Landroidx/viewpager2/widget/ViewPager2$i;", "setOnPageChangeCallback", "(Landroidx/viewpager2/widget/ViewPager2$i;)V", "onPageChangeCallback", "", "d", "()Z", "isNotEmpty", "", "c", "()I", "currentItem", "count", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12889b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewPager2 viewPager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ViewPager2.AbstractC1102i onPageChangeCallback;

    /* JADX INFO: renamed from: xq.b$a */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"xq/b$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "b", "(IFI)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends ViewPager2.AbstractC1102i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC12888a f45755a;

        public a(AbstractC12888a abstractC12888a) {
            this.f45755a = abstractC12888a;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1102i
        /* JADX INFO: renamed from: b */
        public void mo6217b(int position, float positionOffset, int positionOffsetPixels) {
            super.mo6217b(position, positionOffset, positionOffsetPixels);
            this.f45755a.m47915b(position, positionOffset);
        }
    }

    public C12889b(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        this.viewPager = viewPager;
    }

    /* JADX INFO: renamed from: a */
    public final void m47916a(@NotNull AbstractC12888a onPageChangeListenerHelper) {
        Intrinsics.checkNotNullParameter(onPageChangeListenerHelper, "onPageChangeListenerHelper");
        a aVar = new a(onPageChangeListenerHelper);
        this.onPageChangeCallback = aVar;
        this.viewPager.m6182g(aVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m47917b() {
        RecyclerView.AbstractC1025h adapter = this.viewPager.getAdapter();
        if (adapter != null) {
            return adapter.mo5473e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m47918c() {
        return this.viewPager.getCurrentItem();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m47919d() {
        RecyclerView.AbstractC1025h adapter = this.viewPager.getAdapter();
        return (adapter != null ? adapter.mo5473e() : 0) > 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m47920e() {
        ViewPager2.AbstractC1102i abstractC1102i = this.onPageChangeCallback;
        if (abstractC1102i != null) {
            this.viewPager.m6189n(abstractC1102i);
        }
    }
}
