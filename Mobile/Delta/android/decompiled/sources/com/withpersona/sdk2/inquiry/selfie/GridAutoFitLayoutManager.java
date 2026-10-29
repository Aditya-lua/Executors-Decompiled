package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0018\u00010\bR\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "", "columnWidth", "<init>", "(Landroid/content/Context;I)V", "Landroidx/recyclerview/widget/RecyclerView$x;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$b0;", "state", "", "c1", "(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)V", "v3", "(Landroid/content/Context;I)I", "newColumnWidth", "w3", "(I)V", "V", "I", "", "W", "Z", "columnWidthChanged", "X", "lastTotalSpace", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridAutoFitLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public int columnWidth;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean columnWidthChanged;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public int lastTotalSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridAutoFitLayoutManager(@NotNull Context context, int i10) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        this.columnWidthChanged = true;
        w3(v3(context, i10));
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void c1(@Nullable RecyclerView.x recycler, @NotNull RecyclerView.b0 state) {
        int iB0;
        int iH0;
        Intrinsics.checkNotNullParameter(state, "state");
        if (q2() == 1) {
            iB0 = s0() - j0();
            iH0 = i0();
        } else {
            iB0 = b0() - k0();
            iH0 = h0();
        }
        int i10 = iB0 - iH0;
        if ((this.columnWidthChanged && this.columnWidth > 0) || i10 != this.lastTotalSpace) {
            t3(kotlin.ranges.d.c(1, i10 / this.columnWidth));
            this.columnWidthChanged = false;
            this.lastTotalSpace = i10;
        }
        super.c1(recycler, state);
    }

    public final int v3(Context context, int columnWidth) {
        return columnWidth <= 0 ? (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()) : columnWidth;
    }

    public final void w3(int newColumnWidth) {
        if (newColumnWidth <= 0 || newColumnWidth == this.columnWidth) {
            return;
        }
        this.columnWidth = newColumnWidth;
        this.columnWidthChanged = true;
    }
}
