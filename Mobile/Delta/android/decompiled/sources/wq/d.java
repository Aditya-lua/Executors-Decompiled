package wq;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lwq/d;", "Landroidx/recyclerview/widget/RecyclerView$p;", "", "space", "", "spaceAboveFirstAndBelowLastItem", "horizontalSpaceOnFirstAndLastItem", "hasSameSpans", "<init>", "(IZZZ)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$b0;", "state", "", "e", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;)V", "a", "Z", "b", "c", "d", "I", "getVerticalSpace", "()I", "setVerticalSpace", "(I)V", "verticalSpace", "getHorizontalSpace", "setHorizontalSpace", "horizontalSpace", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends RecyclerView.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean spaceAboveFirstAndBelowLastItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean horizontalSpaceOnFirstAndLastItem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean hasSameSpans;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int verticalSpace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int horizontalSpace;

    public /* synthetic */ d(int i10, boolean z10, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.b0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.q layoutManager = parent.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iL3 = gridLayoutManager.l3();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.r rVar = (RecyclerView.r) layoutParams;
        int iA = rVar.a();
        if (iA == -1) {
            iA = rVar.b();
        }
        if (iA == -1) {
            return;
        }
        int i10 = iA % iL3;
        boolean z10 = this.hasSameSpans;
        if (z10) {
            outRect.top = this.verticalSpace;
        }
        outRect.bottom = 0;
        if (this.spaceAboveFirstAndBelowLastItem) {
            if (z10) {
                RecyclerView.h adapter = parent.getAdapter();
                if (((adapter != null ? adapter.e() : 0) - 1) / iL3 == iA / iL3) {
                    outRect.bottom = this.verticalSpace;
                }
            }
        } else if (iA < iL3) {
            outRect.top = 0;
        }
        int i11 = this.horizontalSpace;
        outRect.left = i11 / 2;
        outRect.right = i11 / 2;
        if (i10 == 0 && !this.horizontalSpaceOnFirstAndLastItem && this.hasSameSpans) {
            outRect.left = 0;
        }
        if (i10 == iL3 - 1 && !this.horizontalSpaceOnFirstAndLastItem && this.hasSameSpans) {
            outRect.right = 0;
        }
    }

    public d(int i10, boolean z10, boolean z11, boolean z12) {
        this.spaceAboveFirstAndBelowLastItem = z10;
        this.horizontalSpaceOnFirstAndLastItem = z11;
        this.hasSameSpans = z12;
        this.verticalSpace = i10;
        this.horizontalSpace = i10;
    }
}
