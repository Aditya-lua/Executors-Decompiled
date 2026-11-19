package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.ui.WorkflowViewStub;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f22458a;

    @NonNull
    public final WorkflowViewStub b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f22459c;

    public b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WorkflowViewStub workflowViewStub, @NonNull FloatingActionButton floatingActionButton) {
        this.f22458a = coordinatorLayout;
        this.b = workflowViewStub;
        this.f22459c = floatingActionButton;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = kq.a.f21728a;
        WorkflowViewStub workflowViewStub = (WorkflowViewStub) s5.b.a(view, i10);
        if (workflowViewStub != null) {
            i10 = kq.a.b;
            FloatingActionButton floatingActionButton = (FloatingActionButton) s5.b.a(view, i10);
            if (floatingActionButton != null) {
                return new b((CoordinatorLayout) view, workflowViewStub, floatingActionButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(kq.b.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f22458a;
    }
}
